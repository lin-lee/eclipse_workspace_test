/*
 * %W% %E% %U%
 *
 * Copyright (c) 2006, Oracle and/or its affiliates. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTAIL. Use is subject to license terms.
 */

package com.sun.script.javascript;

import java.util.*;
import sun.org.mozilla.javascript.internal.*;

/**
 * This class prevents script access to certain sensitive classes.
 * Note that this class checks over and above SecurityManager. i.e., although
 * a SecurityManager would pass, class shutter may still prevent access.
 *
 * @version 1.0
 * @author A. Sundararajan
 * @since 1.6
 */
final class RhinoClassShutter implements ClassShutter {
    private static Map protectedClasses;
    private static RhinoClassShutter theInstance;
    
    private RhinoClassShutter() {
    }
    
    static synchronized ClassShutter getInstance() {
        if (theInstance == null) {
            theInstance = new RhinoClassShutter();
            protectedClasses = new HashMap();
            
            // For now, we just have AccessController. Allowing scripts
            // to this class will allow it to execute doPrivileged in
            // bootstrap context. We can add more classes for other reasons.
            protectedClasses.put("java.security.AccessController", Boolean.TRUE);
        }
        return theInstance;
    }
    
    public boolean visibleToScripts(String fullClassName) {
        // first do the security check.
        SecurityManager sm = System.getSecurityManager();
        if (sm != null) {
            int i = fullClassName.lastIndexOf(".");
            if (i != -1) {
                try {
                    sm.checkPackageAccess(fullClassName.substring(0, i));
                } catch (SecurityException se) {
                    return false;
                }
            }
        }
        // now, check is it a protected class.
        return protectedClasses.get(fullClassName) == null;
    }
}
