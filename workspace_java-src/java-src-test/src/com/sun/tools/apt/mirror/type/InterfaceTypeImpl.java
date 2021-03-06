/*
 * %W% %E%
 *
 * Copyright (c) 2006, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL.  Use is subject to license terms.
 */

package com.sun.tools.apt.mirror.type;


import com.sun.mirror.declaration.*;
import com.sun.mirror.type.*;
import com.sun.mirror.util.TypeVisitor;
import com.sun.tools.apt.mirror.AptEnv;
import com.sun.tools.javac.code.Type;


/**
 * Implementation of InterfaceType
 */

public class InterfaceTypeImpl extends DeclaredTypeImpl
			       implements InterfaceType {

    InterfaceTypeImpl(AptEnv env, Type.ClassType type) {
	super(env, type);
    }


    /**
     * {@inheritDoc}
     */
    public InterfaceDeclaration getDeclaration() {
	return (InterfaceDeclaration) super.getDeclaration();
    }

    /**
     * {@inheritDoc}
     */
    public void accept(TypeVisitor v) {
	v.visitInterfaceType(this);
    }
}
