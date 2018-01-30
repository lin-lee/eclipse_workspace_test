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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import com.sun.codemodel.internal.JAnnotationWriter;

public interface XmlAccessorTypeWriter
    extends JAnnotationWriter<XmlAccessorType>
{


    XmlAccessorTypeWriter value(XmlAccessType value);

}
