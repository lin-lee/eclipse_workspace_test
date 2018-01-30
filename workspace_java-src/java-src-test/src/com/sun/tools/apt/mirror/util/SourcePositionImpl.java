/*
 * %W% %E%
 *
 * Copyright (c) 2006, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL.  Use is subject to license terms.
 */

package com.sun.tools.apt.mirror.util;


import java.io.File;
import javax.tools.JavaFileObject;

import com.sun.mirror.util.SourcePosition;
import com.sun.tools.javac.util.Position;


/**
 * Implementation of SourcePosition
 */

public class SourcePositionImpl implements SourcePosition {

    private JavaFileObject sourcefile;
    private int pos;		// file position, in javac's internal format
    private Position.LineMap linemap;


    public SourcePositionImpl(JavaFileObject sourcefile, int pos, Position.LineMap linemap) {
	this.sourcefile = sourcefile;
	this.pos = pos;
	this.linemap = linemap;
	assert sourcefile != null;
	assert linemap != null;
    }

    public int getJavacPosition() {
	return pos;
    }

    public JavaFileObject getSource() {
	return sourcefile;
    }

    /**
     * Returns a string representation of this position in the
     * form "sourcefile:line", or "sourcefile" if no line number is available.
     */
    public String toString() {
	int ln = line();
	return (ln == Position.NOPOS)
		? sourcefile.toString()
		: sourcefile + ":" + ln;
    }

    /**
     * {@inheritDoc}
     */
    public File file() {
	return new File(sourcefile.toString());
    }

    /**
     * {@inheritDoc}
     */
    public int line() {
	return linemap.getLineNumber(pos);
    }

    /**
     * {@inheritDoc}
     */
    public int column() {
	return linemap.getColumnNumber(pos);
    }
}
