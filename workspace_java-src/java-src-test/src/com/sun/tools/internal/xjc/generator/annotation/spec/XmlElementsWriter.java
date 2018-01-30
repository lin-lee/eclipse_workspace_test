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

import javax.xml.bind.annotation.XmlElements;
import com.sun.codemodel.internal.JAnnotationWriter;

public interface XmlElementsWriter
    extends JAnnotationWriter<XmlElements>
{


    XmlElementWriter value();

}
