
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

package com.sun.tools.hat.internal.model;

/**
 * Represents a chain of references to some target object
 *
 * @version     1.5, 10/08/98 [jhat %W% %E%]
 * @author      Bill Foote
 */

public class ReferenceChain {

    JavaHeapObject	obj;	// Object referred to
    ReferenceChain	next;	// Next in chain
    
    public ReferenceChain(JavaHeapObject obj, ReferenceChain next) {
	this.obj = obj;
	this.next = next;
    }

    public JavaHeapObject getObj() {
	return obj;
    }

    public ReferenceChain getNext() {
	return next;
    }

    public int getDepth() {
	int count = 1;
	ReferenceChain tmp = next;
	while (tmp != null) {
	    count++;
	    tmp = tmp.next;
	}
	return count;
    }

}
