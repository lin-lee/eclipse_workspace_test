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
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Implementation of ReadBuffer using mapped file buffer
 *
 * %W% %E%
 * @author A. Sundararajan
 */
class MappedReadBuffer implements ReadBuffer {
    private MappedByteBuffer buf;

    MappedReadBuffer(MappedByteBuffer buf) {
        this.buf = buf;
    }    

    // factory method to create correct ReadBuffer for a given file
    static ReadBuffer create(RandomAccessFile file) throws IOException {
        FileChannel ch = file.getChannel();
        long size = ch.size();
        // if file size is more than 2 GB and when file mapping is
        // configured (default), use mapped file reader
        if (canUseFileMap() && (size <= Integer.MAX_VALUE)) {
            MappedByteBuffer buf;
            try {
                buf = ch.map(FileChannel.MapMode.READ_ONLY, 0, size);
                ch.close();
                return new MappedReadBuffer(buf);
            } catch (IOException exp) {
                exp.printStackTrace();
                System.err.println("File mapping failed, will use direct read");
                // fall through
            }
        } // else fall through
        return new FileReadBuffer(file);
    }

    private static boolean canUseFileMap() {
        // set jhat.disableFileMap to any value other than "false" 
        // to disable file mapping
        String prop = System.getProperty("jhat.disableFileMap");
        return prop == null || prop.equals("false");
    } 

    private void seek(long pos) throws IOException {
        assert pos <= Integer.MAX_VALUE :  "position overflow";
        buf.position((int)pos);
    }

    public synchronized void get(long pos, byte[] res) throws IOException {
        seek(pos);
        buf.get(res);
    }

    public synchronized char getChar(long pos) throws IOException {
        seek(pos);
        return buf.getChar();
    }

    public synchronized byte getByte(long pos) throws IOException {
        seek(pos);
        return buf.get();
    }

    public synchronized short getShort(long pos) throws IOException {
        seek(pos);
        return buf.getShort();
    }

    public synchronized int getInt(long pos) throws IOException {
        seek(pos);
        return buf.getInt();
    }

    public synchronized long getLong(long pos) throws IOException {
        seek(pos);
        return buf.getLong();
    }
}
