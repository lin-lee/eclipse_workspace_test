
/*
 * The contents of this file are subject to the Sun Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. A copy of the License is available at
 * http://www.sun.com/, and in the file LICENSE.html in the
 * doc directory.
 * 
 * The Original Code is HAT. The Initial Developer of the
 * Original Code is Bill Foote, with contributions from others
 * at JavaSoft/Sun. Portions created by Bill Foote and others
 * at Javasoft/Sun are Copyright (C) 1997-2004. All Rights Reserved.
 * 
 * In addition to the formal license, I ask that you don't
 * change the history or donations files without permission.
 * 
 */

package com.sun.tools.hat.internal.parser;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * InputStream that keeps track of total bytes read (in effect
 * 'position' in stream) from the input stream.
 *
 * @author A. Sundararajan [jhat %W% %E%]
 */
public class PositionInputStream extends FilterInputStream {
    private long position = 0L;

    public PositionInputStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
        int res = super.read();
        if (res != -1) position++;
        return res;
    }

    public int read(byte[] b, int off, int len) throws IOException {
        int res = super.read(b, off, len);
        if (res != -1) position += res;
        return res;
    } 

    public long skip(long n) throws IOException {
        long res = super.skip(n);
        position += res;
        return res;
    }

    public boolean markSupported() {
        return false;
    }

    public void mark(int readLimit) {
        throw new UnsupportedOperationException("mark");
    }

    public void reset() {
        throw new UnsupportedOperationException("reset");
    }

    public long position() {
        return position;
    }
}