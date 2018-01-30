 
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

/**
 * References by type summary
 *
 * @author A. Sundararajan [jhat %W% %E%]
 */
public class RefsByTypeQuery extends QueryHandler {
    public void run() {
        JavaClass clazz = snapshot.findClass(query);
        if (clazz == null) {
            error("class not found: " + query);
        } else {
            Map referrersStat = new HashMap(); // <JavaClass, Long>
            final Map refereesStat = new HashMap(); // <JavaClass, Long>
            Enumeration instances = clazz.getInstances(false);
            while (instances.hasMoreElements()) {
                JavaHeapObject instance = (JavaHeapObject) instances.nextElement();
                if (instance.getId() == -1) {
                    continue;
                }
                Enumeration e = instance.getReferers();
                while (e.hasMoreElements()) {
                    JavaHeapObject ref = (JavaHeapObject) e.nextElement();
                    JavaClass cl = ref.getClazz();
                    if (cl == null) {
                         System.out.println("null class for " + ref);
                         continue;
                    }
                    Long count = (Long) referrersStat.get(cl);
                    if (count == null) { 
                        count = new Long(1);
                    } else {
                        count = new Long(count.longValue() + 1);
                    }
                    referrersStat.put(cl, count);
                }
                instance.visitReferencedObjects(
                    new AbstractJavaHeapObjectVisitor() {
                        public void visit(JavaHeapObject obj) {
                            JavaClass cl = obj.getClazz();
                            Long count = (Long) refereesStat.get(cl);
                            if (count == null) { 
                                count = new Long(1);
                            } else {
                                count = new Long(count.longValue() + 1);
                            }
                            refereesStat.put(cl, count);
                        }
                    }
                );
            } // for each instance

            startHtml("References by Type");
            out.println("<p align='center'>");
            printClass(clazz);
            if (clazz.getId() != -1) {
                out.println("[" + clazz.getIdString() + "]");
            }
            out.println("</p>");

            if (referrersStat.size() != 0) {
                out.println("<h3 align='center'>Referrers by Type</h3>");
                print(referrersStat);
            }

            if (refereesStat.size() != 0) {
                out.println("<h3 align='center'>Referees by Type</h3>");
                print(refereesStat);
            }

            endHtml();
        }  // clazz != null
    } // run

    private void print(final Map map) {
        out.println("<table border='1' align='center'>");
        Set keys = map.keySet();
        JavaClass[] classes = new JavaClass[keys.size()];
        keys.toArray(classes);
        Arrays.sort(classes, new Comparator() {
            public int compare(Object o1, Object o2) {
                JavaClass first = (JavaClass) o1;
                JavaClass second = (JavaClass) o2;
                Long count1 = (Long)map.get(first);
                Long count2 = (Long)map.get(second);
                return count2.compareTo(count1);
            }
        });

        out.println("<tr><th>Class</th><th>Count</th></tr>");
        for (int i = 0; i < classes.length; i++) {
            JavaClass clazz = classes[i];
            out.println("<tr><td>");
            out.print("<a href='/refsByType/"); 
            out.print(clazz.getIdString());
            out.print("'>");
            out.print(clazz.getName());
            out.println("</a>");
            out.println("</td><td>");
            out.println(map.get(clazz));
            out.println("</td></tr>");
        }
        out.println("</table>");
    }
}
