
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
import com.sun.tools.hat.internal.oql.*;
import com.sun.tools.hat.internal.util.ArraySorter;
import com.sun.tools.hat.internal.util.Comparer;

/**
 * This handles Object Query Language (OQL) queries.
 *
 * @author A. Sundararajan
 */

class OQLQuery extends QueryHandler {

    public OQLQuery(OQLEngine engine) {
        this.engine = engine;
    }

    public void run() {
        startHtml("Object Query Language (OQL) query");
        String oql = null;
        if (query != null && !query.equals("")) {
            int index = query.indexOf("?query=");
            if (index != -1 && query.length() > 7) {
                oql = query.substring(index + 7);
            }
        }
        out.println("<p align='center'><table>");
        out.println("<tr><td><b>");
        out.println("<a href='/'>All Classes (excluding platform)</a>");
        out.println("</b></td>");
        out.println("<td><b><a href='/oqlhelp/'>OQL Help</a></b></td></tr>");
        out.println("</table></p>");
	out.println("<form action='/oql/' method='get'>");
        out.println("<p align='center'>");
        out.println("<textarea name='query' cols=80 rows=10>");
        if (oql != null) {
            out.println(oql);
        }
        out.println("</textarea>");
        out.println("</p>");
        out.println("<p align='center'>");
        out.println("<input type='submit' value='Execute'></input>");
        out.println("</p>");
        out.println("</form>");
        if (oql != null) {
            executeQuery(oql);
        }
	endHtml();
    }

    private void executeQuery(String q) {
        try {
            out.println("<table border='1'>");
            engine.executeQuery(q, new ObjectVisitor() {
                     public boolean visit(Object o) {
                         out.println("<tr><td>");
                         try {
                             out.println(engine.toHtml(o)); 
                         } catch (Exception e) {
                             out.println(e.getMessage());
                             out.println("<pre>");
                             e.printStackTrace(out);
                             out.println("</pre>");
                         }
                         out.println("</td></tr>");
                         return false;
                     }
                 });
            out.println("</table>");
        } catch (OQLException exp) {
            out.println(exp.getMessage());
            out.println("<pre>");
            exp.printStackTrace(out);
            out.println("</pre>");
        }
    }

    private OQLEngine engine;
}
