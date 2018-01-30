
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

import com.sun.tools.hat.internal.model.*;
import com.sun.tools.hat.internal.util.ArraySorter;
import com.sun.tools.hat.internal.util.Comparer;

import java.util.Enumeration;

/**
 *
 * @version     1.9, 10/08/98 [jhat %W% %E%]
 * @author      Bill Foote
 */


class ClassQuery extends QueryHandler {


    public ClassQuery() {
    }

    public void run() {
	startHtml("Class " + query);
	JavaClass clazz = snapshot.findClass(query);
	if (clazz == null) {
	    error("class not found: " + query);
	} else {
	    printFullClass(clazz);
	}
	endHtml();
    }

    protected void printFullClass(JavaClass clazz) {
	out.print("<h1>");
	print(clazz.toString());
	out.println("</h1>");

	out.println("<h2>Superclass:</h2>");
	printClass(clazz.getSuperclass());

        out.println("<h2>Loader Details</h2>");
	out.println("<h3>ClassLoader:</h3>");
	printThing(clazz.getLoader());

	out.println("<h3>Signers:</h3>");
	printThing(clazz.getSigners());

	out.println("<h3>Protection Domain:</h3>");
	printThing(clazz.getProtectionDomain());

	out.println("<h2>Subclasses:</h2>");
	JavaClass[] sc = clazz.getSubclasses();
	for (int i = 0; i < sc.length; i++) {
	    out.print("    ");
	    printClass(sc[i]);
	    out.println("<br>");
	}

	out.println("<h2>Instance Data Members:</h2>");
	JavaField[] ff = clazz.getFields();
	ff = (JavaField[]) ff.clone();
	ArraySorter.sort(ff, new Comparer() {
	    public int compare(Object lhs, Object rhs) {
		JavaField left = (JavaField) lhs;
		JavaField right = (JavaField) rhs;
		return left.getName().compareTo(right.getName());
	    }
	});
	for (int i = 0; i < ff.length; i++) {
	    out.print("    ");
	    printField(ff[i]);
	    out.println("<br>");
	}

	out.println("<h2>Static Data Members:</h2>");
	JavaStatic[] ss = clazz.getStatics();
	for (int i = 0; i < ss.length; i++) {
	    printStatic(ss[i]);
	    out.println("<br>");
	}

	out.println("<h2>Instances</h2>");

	printAnchorStart();
	out.print("instances/" + encodeForURL(clazz));
	out.print("\">");
	out.println("Exclude subclasses</a><br>");

	printAnchorStart();
	out.print("allInstances/" + encodeForURL(clazz));
	out.print("\">");
	out.println("Include subclasses</a><br>");


	if (snapshot.getHasNewSet()) {
	    out.println("<h2>New Instances</h2>");

	    printAnchorStart();
	    out.print("newInstances/" + encodeForURL(clazz));
	    out.print("\">");
	    out.println("Exclude subclasses</a><br>");

	    printAnchorStart();
	    out.print("allNewInstances/" + encodeForURL(clazz));
	    out.print("\">");
	    out.println("Include subclasses</a><br>");
	}

	out.println("<h2>References summary by Type</h2>");
	printAnchorStart();
	out.print("refsByType/" + encodeForURL(clazz));
	out.print("\">");
        out.println("References summary by type</a>");

	printReferencesTo(clazz);
    }

    protected void printReferencesTo(JavaHeapObject obj) {
	if (obj.getId() == -1) {
	    return;
	}
	out.println("<h2>References to this object:</h2>");
	out.flush();
	Enumeration referers = obj.getReferers();
	while (referers.hasMoreElements()) {
	    JavaHeapObject ref = (JavaHeapObject) referers.nextElement();
	    printThing(ref);
	    print (" : " + ref.describeReferenceTo(obj, snapshot));
	    // If there are more than one references, this only gets the
	    // first one.
	    out.println("<br>");
	}

	out.println("<h2>Other Queries</h2>");
	out.println("Reference Chains from Rootset");
	long id = obj.getId();

	out.print("<ul><li>");
	printAnchorStart();
	out.print("roots/");
	printHex(id);
	out.print("\">");
	out.println("Exclude weak refs</a>");

	out.print("<li>");
	printAnchorStart();
	out.print("allRoots/");
	printHex(id);
	out.print("\">");
	out.println("Include weak refs</a></ul>");

	printAnchorStart();
	out.print("reachableFrom/");
	printHex(id);
	out.print("\">");
	out.println("Objects reachable from here</a><br>");
    }

    
}
