
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

import java.io.DataInputStream;
import java.io.InputStream;

/**
 * A DataInputStream that keeps track of total bytes read
 * (in effect 'position' in stream) so far.
 *
 * @author A. Sundararajan [jhat %W% %E%]
 */
public class PositionDataInputStream extends DataInputStream {
    public PositionDataInputStream(InputStream in) {
        super(in instanceof PositionInputStream?
              in : new PositionInputStream(in));
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
        return ((PositionInputStream)in).position();
    }
}
