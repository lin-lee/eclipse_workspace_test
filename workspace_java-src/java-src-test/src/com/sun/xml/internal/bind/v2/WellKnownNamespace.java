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
package com.sun.xml.internal.bind.v2;

/**
 * Well-known namespace URIs.
 * 
 * @author
 *     Kohsuke Kawaguchi (kohsuke.kawaguchi@sun.com)
 * @since 2.0
 */
public abstract class WellKnownNamespace {
    private WellKnownNamespace() {} // no instanciation please

    public static final String XML_SCHEMA =
        "http://www.w3.org/2001/XMLSchema";

    public static final String XML_SCHEMA_INSTANCE =
        "http://www.w3.org/2001/XMLSchema-instance";

    public static final Object XML_SCHEMA_DATATYPES =
        "http://www.w3.org/2001/XMLSchema-datatypes";

    public static final String XML_NAMESPACE_URI =
        "http://www.w3.org/XML/1998/namespace";

    public static final String XOP =
        "http://www.w3.org/2004/08/xop/include";
    
    public static final String SWA_URI =
        "http://ws-i.org/profiles/basic/1.1/xsd";
    
    public static final String XML_MIME_URI = "http://www.w3.org/2005/05/xmlmime";

    public static final String JAXB = "http://java.sun.com/xml/ns/jaxb";

//    public static final QName XSI_NIL = new QName(XML_SCHEMA_INSTANCE,"nil");
}
