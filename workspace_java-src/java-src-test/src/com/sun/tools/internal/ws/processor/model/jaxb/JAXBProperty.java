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
package com.sun.tools.internal.ws.processor.model.jaxb;

import com.sun.tools.internal.xjc.api.Property;

import javax.xml.namespace.QName;

/**
 * @author Kohsuke Kawaguchi
 */
public class JAXBProperty {

    /**
     * @see Property#name()
     */
    private String name;

    private JAXBTypeAndAnnotation type;
    /**
     * @see Property#elementName()
     */
    private QName elementName;

    /**
     * Default constructor for the persistence.
     */
    public JAXBProperty() {}

    /**
     * Constructor that fills in the values from the given raw model
     */
    JAXBProperty( Property prop ) {
        this.name = prop.name();
        this.type = new JAXBTypeAndAnnotation(prop.type());
        this.elementName = prop.elementName();
    }

    /**
     * @see Property#name()
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public JAXBTypeAndAnnotation getType() {
        return type;
    }

    /**
     * @see Property#elementName()
     */
    public QName getElementName() {
        return elementName;
    }
}
