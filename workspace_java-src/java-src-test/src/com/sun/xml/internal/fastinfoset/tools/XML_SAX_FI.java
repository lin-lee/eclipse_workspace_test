/*
 * Fast Infoset ver. 0.1 software ("Software")
 *
 * Copyright, 2004-2005 Sun Microsystems, Inc. All Rights Reserved.
 *
 * Software is licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License. You may
 * obtain a copy of the License at:
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations.
 *
 *    Sun supports and benefits from the global community of open source
 * developers, and thanks the community for its important contributions and
 * open standards-based technology, which Sun has adopted into many of its
 * products.
 *
 *    Please note that portions of Software may be provided with notices and
 * open source licenses from such communities and third parties that govern the
 * use of those portions, and any licenses granted hereunder do not alter any
 * rights and obligations you may have under such open source licenses,
 * however, the disclaimer of warranty and limitation of liability provisions
 * in this License will apply to all Software in this distribution.
 *
 *    You acknowledge that the Software is not designed, licensed or intended
 * for use in the design, construction, operation or maintenance of any nuclear
 * facility.
 *
 * Apache License
 * Version 2.0, January 2004
 * http://www.apache.org/licenses/
 *
 */


package com.sun.xml.internal.fastinfoset.tools;

import com.sun.xml.internal.fastinfoset.sax.SAXDocumentSerializer;
import java.io.InputStream;
import java.io.OutputStream;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.Reader;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

public class XML_SAX_FI extends TransformInputOutput {
    
    public XML_SAX_FI() {
    }
    
    public void parse(InputStream xml, OutputStream finf, String workingDirectory) throws Exception {
        SAXParser saxParser = getParser();
        SAXDocumentSerializer documentSerializer = getSerializer(finf);
        
        XMLReader reader = saxParser.getXMLReader();
        reader.setProperty("http://xml.org/sax/properties/lexical-handler", documentSerializer);
        reader.setContentHandler(documentSerializer);
        
        if (workingDirectory != null) {
            reader.setEntityResolver(createRelativePathResolver(workingDirectory));
        }
        reader.parse(new InputSource(xml));
    }
    
    public void parse(InputStream xml, OutputStream finf) throws Exception {
        parse(xml, finf, null);
    }
    
    public void convert(Reader reader, OutputStream finf) throws Exception {
        InputSource is = new InputSource(reader);
        
        SAXParser saxParser = getParser();
        SAXDocumentSerializer documentSerializer = getSerializer(finf);
        
        saxParser.setProperty("http://xml.org/sax/properties/lexical-handler", documentSerializer);
        saxParser.parse(is, documentSerializer);
    }
    
    private SAXParser getParser() {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        saxParserFactory.setNamespaceAware(true);
        try {
            return saxParserFactory.newSAXParser();
        } catch (Exception e) {
            return null;
        }
    }
    
    private SAXDocumentSerializer getSerializer(OutputStream finf) {
        SAXDocumentSerializer documentSerializer = new SAXDocumentSerializer();
        documentSerializer.setOutputStream(finf);
        return documentSerializer;
    }
    
    public static void main(String[] args) throws Exception {
        XML_SAX_FI s = new XML_SAX_FI();
        s.parse(args);
    }
}
