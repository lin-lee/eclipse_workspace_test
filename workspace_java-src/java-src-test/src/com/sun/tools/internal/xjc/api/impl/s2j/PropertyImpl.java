/*
 * Copyright (c) 1997, 2008, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms. 
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package com.sun.tools.internal.xjc.api.impl.s2j;

import javax.xml.namespace.QName;

import com.sun.codemodel.internal.JCodeModel;
import com.sun.codemodel.internal.JType;
import com.sun.tools.internal.xjc.api.Mapping;
import com.sun.tools.internal.xjc.api.Property;
import com.sun.tools.internal.xjc.outline.FieldOutline;

/**
 * @author Kohsuke Kawaguchi
 */
public /*for BSH*/ final class PropertyImpl implements Property {
    protected final FieldOutline fr;
    protected final QName elementName;
    protected final Mapping parent;
    protected final JCodeModel codeModel;

    PropertyImpl( Mapping parent, FieldOutline fr, QName elementName ) {
        this.parent = parent;
        this.fr = fr;
        this.elementName = elementName;
        this.codeModel = fr.getRawType().owner();
    }

    public final String name() {
        return fr.getPropertyInfo().getName(false);
    }

    public final QName elementName() {
        return elementName;
    }

    public final JType type() {
        return fr.getRawType();
    }
}
