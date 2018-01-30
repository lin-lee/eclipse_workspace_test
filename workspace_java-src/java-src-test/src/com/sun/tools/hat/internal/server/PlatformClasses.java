
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

package com.sun.tools.hat.internal.server;

import com.sun.tools.hat.internal.model.JavaClass;
import com.sun.tools.hat.internal.model.Snapshot;

import java.util.LinkedList;
import java.io.InputStream;
import java.io.Reader;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * This class is a helper that determines if a class is a "platform"
 * class or not.  It's a platform class if its name starts with one of
 * the prefixes to be found in /com/sun/tools/hat/resources/platform_names.txt.
 *
 * @version ? [jhat %W% %E%]
 * @author      Bill Foote
 */

public class PlatformClasses  {

    static String[] names = null;


    public static synchronized String[] getNames() {
	if (names == null) {
	    LinkedList list = new LinkedList();
	    InputStream str 
		= PlatformClasses.class
		    .getResourceAsStream("/com/sun/tools/hat/resources/platform_names.txt");
	    if (str != null) {
		try {
		    BufferedReader rdr 
			= new BufferedReader(new InputStreamReader(str));
		    for (;;) {
			String s = rdr.readLine();
			if (s == null) {
			    break;
			} else if (s.length() > 0) {
			    list.add(s);
			}
		    }
		    rdr.close();
		    str.close();
		} catch (IOException ex) {
		    ex.printStackTrace();
		    // Shouldn't happen, and if it does, continuing
		    // is the right thing to do anyway.
		}
	    }
	    int num = list.size();
	    names = new String[num];
	    names = (String[]) list.toArray(names);
	}
	return names;
    }


    public static boolean isPlatformClass(JavaClass clazz) {
        // all classes loaded by bootstrap loader are considered
        // platform classes. In addition, the older name based filtering
        // is also done for compatibility.
        if (clazz.isBootstrap()) {
            return true;
        }

        String name = clazz.getName();
        // skip even the array classes of the skipped classes.
        if (name.startsWith("[")) {
            int index = name.lastIndexOf('[');
            if (index != -1) {
                if (name.charAt(index + 1) != 'L') {
                    // some primitive array.
                    return true;
                }
                // skip upto 'L' after the last '['.
                name = name.substring(index + 2);
            }
        }
	String[] nms = getNames();
	for (int i = 0; i < nms.length; i++) {
	    if (name.startsWith(nms[i])) {
		return true;
	    }
	}
	return false;
    }
}
