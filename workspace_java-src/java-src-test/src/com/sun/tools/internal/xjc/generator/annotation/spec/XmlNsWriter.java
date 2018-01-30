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

import javax.xml.bind.annotation.XmlNs;
import com.sun.codemodel.internal.JAnnotationWriter;

public interface XmlNsWriter
    extends JAnnotationWriter<XmlNs>
{


    XmlNsWriter prefix(String value);

    XmlNsWriter namespaceURI(String value);

}
