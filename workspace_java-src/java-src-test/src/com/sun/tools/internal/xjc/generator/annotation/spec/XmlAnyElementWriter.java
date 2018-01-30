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
package com.sun.tools.internal.xjc.generator.annotation.spec;

import javax.xml.bind.annotation.XmlAnyElement;
import com.sun.codemodel.internal.JAnnotationWriter;
import com.sun.codemodel.internal.JType;

public interface XmlAnyElementWriter
    extends JAnnotationWriter<XmlAnyElement>
{


    XmlAnyElementWriter value(Class value);

    XmlAnyElementWriter value(JType value);

    XmlAnyElementWriter lax(boolean value);

}