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
package com.sun.tools.internal.xjc.reader.xmlschema.parser;

import com.sun.tools.internal.xjc.reader.Const;

import org.xml.sax.Attributes;
import org.xml.sax.ErrorHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.XMLFilterImpl;

/**
 * This filter detects the use of incorrect JAXB namespace URI.
 * 
 * When the binding compiler looks at a schema file, it always look
 * for the namespace URI of the elements (which is correct, BTW.)
 * 
 * <p>
 * However, one unfortunate downside of this philosophically correct
 * behavior is that there is no provision or safety check when an user
 * misspelled JAXB binding customization namespace.
 * 
 * <p>
 * This checker inspects the input document and look for the use of the
 * prefix "jaxb". If the document doesn't associate any prefix to the
 * JAXB customization URI and if it does associate the jaxb prefix,
 * this checker will issue a warning.
 * 
 * <p>
 * This warning can happen to completely correct schema (because
 * nothing prevents you from using the prefix "jaxb" for other purpose
 * while using a JAXB compiler on the same schema) but in practice
 * this would be quite unlikely.
 * 
 * <p>
 * This justifies the use of this filter.
 * 
 * @author
 *     Kohsuke Kawaguchi (kohsuke.kawaguchi@sun.com)
 */
public class IncorrectNamespaceURIChecker extends XMLFilterImpl {

    public IncorrectNamespaceURIChecker( ErrorHandler handler ) {
        this.errorHandler = handler;
    }
    
    private ErrorHandler errorHandler;
    
    private Locator locator = null;
    
    /** Sets to true once we see the jaxb prefix in use. */
    private boolean isJAXBPrefixUsed = false;
    /** Sets to true once we see the JAXB customization namespace URI. */ 
    private boolean isCustomizationUsed = false;
    
    public void endDocument() throws SAXException {
        if( isJAXBPrefixUsed && !isCustomizationUsed ) {
            SAXParseException e = new SAXParseException(
                Messages.format(Messages.WARN_INCORRECT_URI, Const.JAXB_NSURI),
                locator );
            errorHandler.warning(e);
        }
        
        super.endDocument();
    }

    public void startPrefixMapping(String prefix, String uri) throws SAXException {
        if( prefix.equals("jaxb") )
            isJAXBPrefixUsed = true;
        if( uri.equals(Const.JAXB_NSURI) )
            isCustomizationUsed = true;
        
        super.startPrefixMapping(prefix, uri);
    }

    public void startElement(String namespaceURI, String localName, String qName, Attributes atts)
        throws SAXException {
        super.startElement(namespaceURI, localName, qName, atts);
        
        // I'm not sure if this is necessary (SAX might report the change of the default prefix
        // through the startPrefixMapping method, and I think it does indeed.)
        // 
        // but better safe than sorry.
        
        if( namespaceURI.equals(Const.JAXB_NSURI) )
            isCustomizationUsed = true;
    }

    public void setDocumentLocator( Locator locator ) {
        super.setDocumentLocator( locator );
        this.locator = locator;
    }
}
