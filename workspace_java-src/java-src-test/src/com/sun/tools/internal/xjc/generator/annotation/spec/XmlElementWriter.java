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

import javax.xml.bind.annotation.XmlElement;
import com.sun.codemodel.internal.JAnnotationWriter;
import com.sun.codemodel.internal.JType;

public interface XmlElementWriter
    extends JAnnotationWriter<XmlElement>
{


    XmlElementWriter name(String value);

    XmlElementWriter type(Class value);

    XmlElementWriter type(JType value);

    XmlElementWriter namespace(String value);

    XmlElementWriter defaultValue(String value);

    XmlElementWriter required(boolean value);

    XmlElementWriter nillable(boolean value);

}
