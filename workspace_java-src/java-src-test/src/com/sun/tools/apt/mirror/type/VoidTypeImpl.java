/*
 * %W% %E%
 *
 * Copyright (c) 2006, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL.  Use is subject to license terms.
 */

package com.sun.tools.apt.mirror.type;


import com.sun.mirror.type.VoidType;
import com.sun.mirror.util.TypeVisitor;
import com.sun.tools.apt.mirror.AptEnv;


/**
 * Implementation of VoidType.
 */

class VoidTypeImpl extends TypeMirrorImpl implements VoidType {

    VoidTypeImpl(AptEnv env) {
	super(env, env.symtab.voidType);
    }

    /**
     * {@inheritDoc}
     */
    public void accept(TypeVisitor v) {
	v.visitVoidType(this);
    }
}
