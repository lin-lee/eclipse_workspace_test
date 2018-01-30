
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

package com.sun.tools.hat.internal.server;

import java.io.*;

/**
 * This handles Object Query Language (OQL) help.
 *
 * @author A. Sundararajan
 */

class OQLHelp extends QueryHandler {

    public OQLHelp() {
    }

    public void run() {
        InputStream is = getClass().getResourceAsStream("/com/sun/tools/hat/resources/oqlhelp.html");
        int ch = -1;
        try {
            is = new BufferedInputStream(is);
            while ( (ch = is.read()) != -1) {
                out.print((char)ch);
            }
        } catch (Exception exp) {
            out.println(exp.getMessage());
            out.println("<pre>");
            exp.printStackTrace(out);
            out.println("</pre>");
        }
    }
}
