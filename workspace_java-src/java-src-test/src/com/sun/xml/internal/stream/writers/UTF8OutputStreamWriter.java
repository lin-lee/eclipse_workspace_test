/*
 * The contents of this file are subject to the terms
 * of the Common Development and Distribution License
 * (the "License").  You may not use this file except
 * in compliance with the License.
 *
 * You can obtain a copy of the license at
 * https://jaxp.dev.java.net/CDDLv1.0.html.
 * See the License for the specific language governing
 * permissions and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL
 * HEADER in each file and include the License file at
 * https://jaxp.dev.java.net/CDDLv1.0.html
 * If applicable add the following below this CDDL HEADER
 * with the fields enclosed by brackets "[]" replaced with
 * your own identifying information: Portions Copyright
 * [year] [name of copyright owner]
 */

/*
 * $Id: UTF8OutputStreamWriter.java,v 1.3 2006/03/17 21:56:19 jeffsuttor Exp $
 * %W% %E%
 *
 * Copyright (c) 2006, Oracle and/or its affiliates. All rights reserved.
 */

package com.sun.xml.internal.stream.writers;

import java.io.Writer;
import java.io.OutputStream;
import java.io.IOException;

import com.sun.org.apache.xerces.internal.util.XMLChar;

/**
 * <p>This class is used to write a stream of chars as a stream of
 * bytes using the UTF8 encoding. It assumes that the underlying
 * output stream is buffered or does not need additional buffering.</p>
 *
 * <p>It is more efficient than using a <code>java.io.OutputStreamWriter</code>
 * because it does not need to be wrapped in a 
 * <code>java.io.BufferedWriter</code>. Creating multiple instances 
 * of <code>java.io.BufferedWriter</code> has been shown to be very 
 * expensive in JAX-WS.</p>
 *
 * @author Santiago.PericasGeertsen@sun.com
 */
public final class UTF8OutputStreamWriter extends Writer {
    
    /**
     * Undelying output stream. This class assumes that this
     * output stream does not need buffering.
     */
    OutputStream out;
    
    /**
     * Java represents chars that are not in the Basic Multilingual
     * Plane (BMP) in UTF-16. This int stores the first code unit 
     * for a code point encoded in two UTF-16 code units.
     */
    int lastUTF16CodePoint = 0;
    
    public UTF8OutputStreamWriter(OutputStream out) {
        this.out = out;
    }
    
    public String getEncoding() {
        return "UTF-8";
    }
    
    public void write(int c) throws IOException {
        // Check in we are encoding at high and low surrogates
        if (lastUTF16CodePoint != 0) {
            final int uc = 
                (((lastUTF16CodePoint & 0x3ff) << 10) | (c & 0x3ff)) + 0x10000;
            
            if (uc < 0 || uc >= 0x200000) {
                throw new IOException("Atttempting to write invalid Unicode code point '" + uc + "'");
            }

            out.write(0xF0 | (uc >> 18));
            out.write(0x80 | ((uc >> 12) & 0x3F));
            out.write(0x80 | ((uc >> 6) & 0x3F));
            out.write(0x80 | (uc & 0x3F));
            
            lastUTF16CodePoint = 0;
            return;
        }
        
        // Otherwise, encode char as defined in UTF-8
        if (c < 0x80) {
            // 1 byte, 7 bits
            out.write((int) c);
        } 
        else if (c < 0x800) {
            // 2 bytes, 11 bits
            out.write(0xC0 | (c >> 6));    // first 5
            out.write(0x80 | (c & 0x3F));  // second 6
        } 
        else if (c <= '\uFFFF') { 
            if (!XMLChar.isHighSurrogate(c) && !XMLChar.isLowSurrogate(c)) {
                // 3 bytes, 16 bits
                out.write(0xE0 | (c >> 12));   // first 4
                out.write(0x80 | ((c >> 6) & 0x3F));  // second 6
                out.write(0x80 | (c & 0x3F));  // third 6
            } 
            else {
                lastUTF16CodePoint = c;
            }
        }
    }

    public void write(char cbuf[]) throws IOException {
        for (int i = 0; i < cbuf.length; i++) {
            write(cbuf[i]);
        }
    }

    public void write(char cbuf[], int off, int len) throws IOException {
        for (int i = 0; i < len; i++) {
            write(cbuf[off + i]);
        }
    }

    public void write(String str) throws IOException {
        final int len = str.length();
        for (int i = 0; i < len; i++) {
            write(str.charAt(i));
        }
    }

    public void write(String str, int off, int len) throws IOException {
        for (int i = 0; i < len; i++) {
            write(str.charAt(off + i));
        }
    }

    public void flush() throws IOException {
        out.flush();
    }

    public void close() throws IOException {
        if (lastUTF16CodePoint != 0) {
            throw new IllegalStateException("Attempting to close a UTF8OutputStreamWriter" 
                + " while awaiting for a UTF-16 code unit");
        }
        out.close();
    }
    
}
