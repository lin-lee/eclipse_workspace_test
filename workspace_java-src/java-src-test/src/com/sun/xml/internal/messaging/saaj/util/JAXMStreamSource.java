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

import java.io.*;

import javax.xml.transform.stream.StreamSource;


/**
 *
 * @author Anil Vijendran
 */
public class JAXMStreamSource extends StreamSource {
    ByteInputStream in;
    Reader reader;
    
    public JAXMStreamSource(InputStream is) throws IOException {
		if (is instanceof ByteInputStream) {
			this.in = (ByteInputStream)is;
		} else {
			ByteOutputStream bout = new ByteOutputStream();
                        bout.write(is);
			this.in = bout.newInputStream();
		}
    }

    public JAXMStreamSource(Reader rdr) throws IOException {
        CharWriter cout = new CharWriter();
        char[] temp = new char[1024];
        int len;
                                                                                
        while (-1 != (len = rdr.read(temp)))
            cout.write(temp, 0, len);
                                                                                
        this.reader = new CharReader(cout.getChars(), cout.getCount());
    }

    public InputStream getInputStream() {
	return in;
    }
    
    public Reader getReader() {
	return reader;
    }

    public void reset() throws IOException {
	    if (in != null)
		in.reset();
	    if (reader != null)
		reader.reset();
    }
}
