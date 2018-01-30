

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

import com.sun.tools.hat.internal.model.*;

/**
 *
 * @version     1.9, 10/08/98 [jhat %W% %E%]
 * @author      Bill Foote
 */


class ReachableQuery extends QueryHandler {
	// We inherit printFullClass from ClassQuery


    public ReachableQuery() {
    }

    public void run() {
	startHtml("Objects Reachable From " + query);
	long id = parseHex(query);
	JavaHeapObject root = snapshot.findThing(id);
        ReachableObjects ro = new ReachableObjects(root, 
                                   snapshot.getReachableExcludes());
	// Now, print out the sorted list, but start with root
	long totalSize = ro.getTotalSize();
        JavaThing[] things = ro.getReachables();
	long instances = things.length;

	out.print("<strong>");
	printThing(root);
	out.println("</strong><br>");
	out.println("<br>");
	for (int i = 0; i < things.length; i++) {
	    printThing(things[i]);
	    out.println("<br>");
	}

	printFields(ro.getUsedFields(), "Data Members Followed");
	printFields(ro.getExcludedFields(), "Excluded Data Members");
	out.println("<h2>Total of " + instances + " instances occupying " + totalSize + " bytes.</h2>");

	endHtml();
    }
    
    private void printFields(String[] fields, String title) {
	if (fields.length == 0) {
	    return;
	}
	out.print("<h3>");
	print(title);
	out.println("</h3>");

	for (int i = 0; i < fields.length; i++) {
	    print(fields[i]);
	    out.println("<br>");
	}
    }
}
