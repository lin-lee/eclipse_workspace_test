/**
 * %W% %E%
 *
 * Copyright (c) 2006, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.sun.tools.javadoc;

import com.sun.javadoc.*;

import static com.sun.javadoc.LanguageVersion.*;

import com.sun.tools.javac.code.Flags;
import com.sun.tools.javac.code.Kinds;
import com.sun.tools.javac.code.Scope;
import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.code.Symbol.*;
import com.sun.tools.javac.tree.JCTree.*;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.ListBuffer;
import com.sun.tools.javac.util.Name;
import com.sun.tools.javac.util.Position;

/**
 * Represents an annotation type.
 * 
 * @author Scott Seligman
 * @version %I% %E%
 * @since 1.5
 */

public class AnnotationTypeDocImpl
	extends ClassDocImpl implements AnnotationTypeDoc {

    AnnotationTypeDocImpl(DocEnv env, ClassSymbol sym) {
        this(env, sym, null, null, null);
    }

    AnnotationTypeDocImpl(DocEnv env, ClassSymbol sym,
			  String doc, JCClassDecl tree, Position.LineMap lineMap) {
        super(env, sym, doc, tree, lineMap);
    }

    /**
     * Returns true, as this is an annotation type.
     * (For legacy doclets, return false.)
     */
    public boolean isAnnotationType() {
	return !isInterface();
    }

    /**
     * Returns false.  Though technically an interface, an annotation
     * type is not considered an interface for this purpose.
     * (For legacy doclets, returns true.)
     */
    public boolean isInterface() {
	return env.legacyDoclet;
    }

    /**
     * Returns an empty array, as all methods are annotation type elements.
     * (For legacy doclets, returns the elements.)
     * @see #elements()
     */
    public MethodDoc[] methods(boolean filter) {
	return env.legacyDoclet
		? (MethodDoc[])elements()
		: new MethodDoc[0];
    }

    /**
     * Returns the elements of this annotation type.
     * Returns an empty array if there are none.
     * Elements are always public, so no need to filter them.
     */
    public AnnotationTypeElementDoc[] elements() {
	Name.Table names = tsym.name.table;
	List<AnnotationTypeElementDoc> elements = List.nil();
	for (Scope.Entry e = tsym.members().elems; e != null; e = e.sibling) {
	    if (e.sym != null && e.sym.kind == Kinds.MTH) {
		MethodSymbol s = (MethodSymbol)e.sym;
		elements = elements.prepend(env.getAnnotationTypeElementDoc(s));
	    }
	}
	return
	    elements.toArray(new AnnotationTypeElementDoc[elements.length()]);
    }
}
