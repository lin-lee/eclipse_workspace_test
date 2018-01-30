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

package com.sun.xml.internal.bind.v2.runtime.output;

import java.io.IOException;

import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.Characters;

import com.sun.xml.internal.bind.v2.runtime.XMLSerializer;

import org.xml.sax.SAXException;

/**
 * {@link XmlOutput} that writes to StAX {@link XMLEventWriter}.
 *
 * @author Kohsuke Kawaguchi
 */
public class XMLEventWriterOutput extends XmlOutputAbstractImpl {
    private final XMLEventWriter out;
    private final XMLEventFactory ef;

    /** One whitespace. */
    private final Characters sp;

    public XMLEventWriterOutput(XMLEventWriter out) {
        this.out = out;
        ef = XMLEventFactory.newInstance();
        sp = ef.createCharacters(" ");
    }

    // not called if we are generating fragments
    @Override
    public void startDocument(XMLSerializer serializer, boolean fragment, int[] nsUriIndex2prefixIndex, NamespaceContextImpl nsContext) throws IOException, SAXException, XMLStreamException {
        super.startDocument(serializer, fragment,nsUriIndex2prefixIndex,nsContext);
        if(!fragment)
            out.add(ef.createStartDocument());
    }

    public void endDocument(boolean fragment) throws IOException, SAXException, XMLStreamException {
        if(!fragment) {
            out.add(ef.createEndDocument());
            out.flush();
        }
        super.endDocument(fragment);
    }

    public void beginStartTag(int prefix, String localName) throws IOException, XMLStreamException {
        out.add(
            ef.createStartElement(
                nsContext.getPrefix(prefix),
                nsContext.getNamespaceURI(prefix),
                localName));

        NamespaceContextImpl.Element nse = nsContext.getCurrent();
        if(nse.count()>0) {
            for( int i=nse.count()-1; i>=0; i-- ) {
                String uri = nse.getNsUri(i);
                if(uri.length()==0 && nse.getBase()==1)
                    continue;   // no point in definint xmlns='' on the root
                out.add(ef.createNamespace(nse.getPrefix(i),uri));
            }
        }
    }

    public void attribute(int prefix, String localName, String value) throws IOException, XMLStreamException {
        Attribute att;
        if(prefix==-1)
            att = ef.createAttribute(localName,value);
        else
            att = ef.createAttribute(
                    nsContext.getPrefix(prefix),
                    nsContext.getNamespaceURI(prefix),
                    localName, value);

        out.add(att);
    }

    public void endStartTag() throws IOException, SAXException {
        // noop
    }

    public void endTag(int prefix, String localName) throws IOException, SAXException, XMLStreamException {
        out.add(
            ef.createEndElement(
                nsContext.getPrefix(prefix),
                nsContext.getNamespaceURI(prefix),
                localName));
    }

    public void text(String value, boolean needsSeparatingWhitespace) throws IOException, SAXException, XMLStreamException {
        if(needsSeparatingWhitespace)
            out.add(sp);
        out.add(ef.createCharacters(value));
    }

    public void text(Pcdata value, boolean needsSeparatingWhitespace) throws IOException, SAXException, XMLStreamException {
        text(value.toString(),needsSeparatingWhitespace);
    }
}
