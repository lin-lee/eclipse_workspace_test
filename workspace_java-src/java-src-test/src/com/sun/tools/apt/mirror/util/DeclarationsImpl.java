/*
 * %W% %E%
 *
 * Copyright (c) 2006, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL.  Use is subject to license terms.
 */

package com.sun.tools.apt.mirror.util;


import com.sun.mirror.declaration.*;
import com.sun.mirror.util.Declarations;
import com.sun.tools.apt.mirror.declaration.DeclarationImpl;
import com.sun.tools.apt.mirror.declaration.MethodDeclarationImpl;
import com.sun.tools.apt.mirror.util.DeclarationsImpl;
import com.sun.tools.apt.mirror.AptEnv;
import com.sun.tools.javac.code.*;
import com.sun.tools.javac.code.Symbol.*;
import com.sun.tools.javac.util.Context;

import static com.sun.tools.javac.code.Kinds.*;


/**
 * Implementation of Declarations utility methods for annotation processors
 */

public class DeclarationsImpl implements Declarations {

    private final AptEnv env;


    private static final Context.Key<Declarations> declarationsKey =
	    new Context.Key<Declarations>();

    public static Declarations instance(Context context) {
	Declarations instance = context.get(declarationsKey);
	if (instance == null) {
	    instance = new DeclarationsImpl(context);
	}
	return instance;
    }

    private DeclarationsImpl(Context context) {
	context.put(declarationsKey, this);
	env = AptEnv.instance(context);
    }


    /**
     * {@inheritDoc}
     * See JLS 2 sections 8.3 and 8.4.6.
     */
    public boolean hides(MemberDeclaration sub, MemberDeclaration sup) {
	Symbol hider = ((DeclarationImpl) sub).sym;
	Symbol hidee = ((DeclarationImpl) sup).sym;

	// Fields only hide fields; methods only methods; types only types.
	// Names must match.  Nothing hides itself (just try it).
	if (hider == hidee ||
		hider.kind != hidee.kind ||
		hider.name != hidee.name) {
	    return false;
	}

	// Only static methods can hide other methods.
	// Methods only hide methods with matching signatures.
	if (hider.kind == MTH) {
	    if ((hider.flags() & Flags.STATIC) == 0 ||
			!env.jctypes.isSubSignature(hider.type, hidee.type)) {
		return false;
	    }
	}

	// Hider must be in a subclass of hidee's class.
	// Note that if M1 hides M2, and M2 hides M3, and M3 is accessible
	// in M1's class, then M1 and M2 both hide M3.
	ClassSymbol hiderClass = hider.owner.enclClass();
	ClassSymbol hideeClass = hidee.owner.enclClass();
	if (hiderClass == null || hideeClass == null ||
		!hiderClass.isSubClass(hideeClass, env.jctypes)) {
	    return false;
	}

	// Hidee must be accessible in hider's class.
	// The method isInheritedIn is poorly named:  it checks only access.
	return hidee.isInheritedIn(hiderClass, env.jctypes);
    }

    /**
     * {@inheritDoc}
     * See JLS 2 section 8.4.6.1.
     */
    public boolean overrides(MethodDeclaration sub, MethodDeclaration sup) {
	MethodSymbol overrider = ((MethodDeclarationImpl) sub).sym;
	MethodSymbol overridee = ((MethodDeclarationImpl) sup).sym;
	ClassSymbol origin = (ClassSymbol) overrider.owner;

	return overrider.name == overridee.name &&

	       // not reflexive as per JLS
	       overrider != overridee &&

	       // we don't care if overridee is static, though that wouldn't
	       // compile
	       !overrider.isStatic() &&

	       // overrider, whose declaring type is the origin, must be
	       // in a subtype of overridee's type
	       env.jctypes.asSuper(origin.type, overridee.owner) != null &&

	       // check access and signatures; don't check return types
	       overrider.overrides(overridee, origin, env.jctypes, false);
    }
}
