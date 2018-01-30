
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
import java.util.*;

public class FinalizerObjectsQuery extends QueryHandler {
    public void run() {
        Enumeration objs = snapshot.getFinalizerObjects();
        startHtml("Objects pending finalization");

        out.println("<a href='/finalizerSummary/'>Finalizer summary</a>");

        out.println("<h1>Objects pending finalization</h1>");

        while (objs.hasMoreElements()) {
            printThing((JavaHeapObject)objs.nextElement());
            out.println("<br>");
        }

        endHtml();
    }
}
