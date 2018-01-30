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
package com.sun.xml.internal.ws.server;

import com.sun.xml.internal.ws.developer.ValidationErrorHandler;
import org.xml.sax.SAXParseException;
import org.xml.sax.SAXException;

/**
 * @author Jitendra Kotamraju
 */
public class DraconianValidationErrorHandler extends ValidationErrorHandler {
    public void warning(SAXParseException e) throws SAXException {
        throw e;
    }

    public void error(SAXParseException e) throws SAXException {
        throw e;
    }

    public void fatalError(SAXParseException e) throws SAXException {
        ; // noop
    }

}