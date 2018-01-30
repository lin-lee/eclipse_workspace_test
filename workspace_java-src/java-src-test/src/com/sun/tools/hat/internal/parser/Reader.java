
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

import java.io.*;
import com.sun.tools.hat.internal.model.*;

/**
 * Abstract base class for reading object dump files.  A reader need not be
 * thread-safe.
 *
 * @version     1.6, 09/09/98 [jhat %W% %E%]
 * @author      Bill Foote
 */


public abstract class Reader {
    protected PositionDataInputStream in;

    protected Reader(PositionDataInputStream in) {
	this.in = in;
    }

    /**
     * Read a snapshot from a data input stream.  It is assumed that the magic
     * number has already been read.
     */
    abstract public Snapshot read() throws IOException;

    /**
     * Read a snapshot from a file.
     *
     * @param heapFile The name of a file containing a heap dump
     * @param callStack If true, read the call stack of allocaation sites
     */
    public static Snapshot readFile(String heapFile, boolean callStack, 
				    int debugLevel) 
	    throws IOException {
	int dumpNumber = 1;
	int pos = heapFile.lastIndexOf('#');
	if (pos > -1) {
	    String num = heapFile.substring(pos+1, heapFile.length());
	    try {
		dumpNumber = Integer.parseInt(num, 10);
	    } catch (java.lang.NumberFormatException ex) {
		String msg = "In file name \"" + heapFile 
			     + "\", a dump number was "
			     + "expected after the :, but \""
			     + num + "\" was found instead.";
		System.err.println(msg);
		throw new IOException(msg);
	    }
	    heapFile = heapFile.substring(0, pos);
	}
	PositionDataInputStream in = new PositionDataInputStream(
            new BufferedInputStream(new FileInputStream(heapFile)));
	try {
	    int i = in.readInt();
	    if (i == HprofReader.MAGIC_NUMBER) {
		Reader r 
		    = new HprofReader(heapFile, in, dumpNumber, 
                                      callStack, debugLevel);
		return r.read();
	    } else {
		throw new IOException("Unrecognized magic number: " + i);
	    }
	} finally {
	    in.close();
	}
    }
}
