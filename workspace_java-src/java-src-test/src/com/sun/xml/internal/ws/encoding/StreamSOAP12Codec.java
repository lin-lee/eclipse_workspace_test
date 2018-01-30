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

package com.sun.xml.internal.ws.encoding;

import com.sun.xml.internal.stream.buffer.XMLStreamBuffer;
import com.sun.xml.internal.ws.api.SOAPVersion;
import com.sun.xml.internal.ws.api.pipe.ContentType;
import com.sun.xml.internal.ws.message.stream.StreamHeader;
import com.sun.xml.internal.ws.message.stream.StreamHeader12;

import javax.xml.stream.XMLStreamReader;
import java.util.Collections;
import java.util.List;

/**
 * {@link StreamSOAPCodec} for SOAP 1.2.
 *
 * @author Paul.Sandoz@Sun.Com
 */
final class StreamSOAP12Codec extends StreamSOAPCodec {
    public static final String SOAP12_MIME_TYPE = "application/soap+xml";
    public static final String SOAP12_CONTENT_TYPE = SOAP12_MIME_TYPE+";charset=\"utf-8\"";

    private static final List<String> expectedContentTypes = Collections.singletonList(SOAP12_MIME_TYPE);

    /*package*/ StreamSOAP12Codec() {
        super(SOAPVersion.SOAP_12);
    }

    public String getMimeType() {
        return SOAP12_MIME_TYPE;
    }
    
    @Override
    protected final StreamHeader createHeader(XMLStreamReader reader, XMLStreamBuffer mark) {
        return new StreamHeader12(reader, mark);
    }

    public static final ContentTypeImpl defaultContentType =
            new ContentTypeImpl(SOAP12_CONTENT_TYPE);

    @Override
    protected ContentType getContentType(String soapAction) {
        // TODO: set accept header
        if (soapAction == null) {
            return defaultContentType;
        } else {
            return new ContentTypeImpl(SOAP12_CONTENT_TYPE + ";action=\""+soapAction+"\"");
        }
    }

    protected List<String> getExpectedContentTypes() {
        return expectedContentTypes;
    }
}
