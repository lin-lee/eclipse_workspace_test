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



package com.sun.xml.internal.messaging.saaj.util;

import java.util.EmptyStackException;
import java.util.Stack;

import javax.xml.parsers.*;

import org.xml.sax.SAXException;

/**
 * Pool of SAXParser objects
 */
public class ParserPool {
    private Stack parsers;
    private SAXParserFactory factory;
    private int capacity;

    public ParserPool(int capacity) {
		this.capacity = capacity;
        factory = new com.sun.org.apache.xerces.internal.jaxp.SAXParserFactoryImpl(); //SAXParserFactory.newInstance();
        factory.setNamespaceAware(true);
        parsers = new Stack();
    }

    public synchronized SAXParser get() throws ParserConfigurationException,
		SAXException {

        try {
            return (SAXParser) parsers.pop();
        } catch (EmptyStackException e) {
            return factory.newSAXParser();
        }
    }

    public synchronized void put(SAXParser parser) {
        if (parsers.size() < capacity) {
            parsers.push(parser);
        }
    }

}
