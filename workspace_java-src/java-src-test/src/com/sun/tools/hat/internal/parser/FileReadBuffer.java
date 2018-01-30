
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

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Implementation of ReadBuffer using a RandomAccessFile
 *
 * %W% %E%
 * @author A. Sundararajan
 */
class FileReadBuffer implements ReadBuffer {
    // underlying file to read
    private RandomAccessFile file;    

    FileReadBuffer(RandomAccessFile file) {
        this.file = file;
    }

    private void seek(long pos) throws IOException {
        file.getChannel().position(pos);
    }

    public synchronized void get(long pos, byte[] buf) throws IOException {
        seek(pos);
        file.read(buf);
    }

    public synchronized char getChar(long pos) throws IOException {
        seek(pos);
        return file.readChar();
    }

    public synchronized byte getByte(long pos) throws IOException {
        seek(pos);
        return (byte) file.read();
    }

    public synchronized short getShort(long pos) throws IOException {
        seek(pos);
        return file.readShort();
    }

    public synchronized int getInt(long pos) throws IOException {
        seek(pos);
        return file.readInt();
    }

    public synchronized long getLong(long pos) throws IOException {
        seek(pos);
        return file.readLong();
    }
}
