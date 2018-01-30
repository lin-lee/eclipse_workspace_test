
/* The contents of this file are subject to the Sun Public License
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
 */

package com.sun.tools.hat.internal.util;
import java.util.*;

/**
 * Miscellaneous functions I couldn't think of a good place to put.
 *
 * @version     1.2, 03/06/98 [jhat %W% %E%]
 * @author      Bill Foote
 */


public class Misc {

    private static char[] digits = { '0', '1', '2', '3', '4', '5', '6', '7',
                                     '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
    
    public final static String toHex(int addr) {
	char[] buf = new char[8];
	int i = 0;
	for (int s = 28; s >= 0; s -= 4) {
	    buf[i++] = digits[(addr >> s) & 0xf];
	}
	return "0x" + new String(buf);
    }
    
    public final static String toHex(long addr) {
        return "0x" + Long.toHexString(addr);
    }

    public final static long parseHex(String value) {
        long result = 0;
        if (value.length() < 2 || value.charAt(0) != '0' ||
            value.charAt(1) != 'x') {
            return -1L;
        }
        for(int i = 2; i < value.length(); i++) {
            result *= 16;
            char ch = value.charAt(i);
            if (ch >= '0' && ch <= '9') {
                result += (ch - '0');
            } else if (ch >= 'a' && ch <= 'f') {
                result += (ch - 'a') + 10;
            } else if (ch >= 'A' && ch <= 'F') {
                result += (ch - 'A') + 10;
            } else {
                throw new NumberFormatException("" + ch
                                        + " is not a valid hex digit");
            }
        }
        return result;
    }

    public static String encodeHtml(String str) {
        final int len = str.length();
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (ch == '<') {
                buf.append("&lt;");
            } else if (ch == '>') {
                buf.append("&gt;");
            } else if (ch == '"') {
                buf.append("&quot;");
            } else if (ch == '\'') {
                buf.append("&#039;");
            } else if (ch == '&') {
                buf.append("&amp;");
            } else if (ch < ' ') {
                buf.append("&#" + Integer.toString(ch) + ";");
            } else {
                int c = (ch & 0xFFFF);
                if (c > 127) {
                    buf.append("&#" + Integer.toString(c) + ";");
                } else {
                    buf.append(ch);
                }
            }
        }
        return buf.toString();
    }
}