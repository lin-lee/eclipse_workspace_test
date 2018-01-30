/*
 * %W% %E%
 *
 * Copyright (c) 2006, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.sun.jndi.toolkit.corba;

// Needed for RMI/IIOP
import java.rmi.Remote;

import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Enumeration;
import java.applet.Applet;

import org.omg.CORBA.ORB;

import javax.naming.ConfigurationException;

/**
  * Contains utilities for performing CORBA-related tasks:
  * 1. Get the org.omg.CORBA.Object for a java.rmi.Remote object.
  * 2. Create an ORB to use for a given host/port, and environment properties.
  *
  * @author Simon Nash
  * @author Bryan Atsatt
  */

public class CorbaUtils {
    /**
      * Returns the CORBA object reference associated with a Remote
      * object by using the javax.rmi.CORBA package.
      *<p>
      * Use reflection to avoid hard dependencies on javax.rmi.CORBA package.
      * This method effective does the following:
      *<blockquote><pre>
      * java.lang.Object stub;
      * try {
      *     stub = PortableRemoteObject.toStub(remoteObj);
      * } catch (Exception e) {
      *     throw new ConfigurationException("Object not exported or not found");
      * }
      * if (!(stub instanceof javax.rmi.CORBA.Stub)) {
      *     return null; // JRMP impl or JRMP stub
      * }
      * try {
      *     ((javax.rmi.CORBA.Stub)stub).connect(orb);  // try to connect IIOP stub
      * } catch (RemoteException e) {
      *     // ignore 'already connected' error
      * }
      * return (javax.rmi.CORBA.Stub)stub;
      *
      * @param remoteObj The non-null remote object for 
      * @param orb 	 The non-null ORB to connect the remote object to
      * @return The CORBA Object for remoteObj; null if <tt>remoteObj</tt> 
      * 		is a JRMP implementation or JRMP stub.
      * @exception ClassNotFoundException The RMI-IIOP package is not available
      * @exception ConfigurationException The CORBA Object cannot be obtained
      * 	because of configuration problems.
      */
    public static org.omg.CORBA.Object remoteToCorba(Remote remoteObj, ORB orb)
	throws ClassNotFoundException, ConfigurationException {
	    synchronized (CorbaUtils.class) {
		if (toStubMethod == null) {
		    initMethodHandles();
		}
	    }

// First, get remoteObj's stub

	    // javax.rmi.CORBA.Stub stub = PortableRemoteObject.toStub(remoteObj);

	    java.lang.Object stub;

	    try {
		stub = toStubMethod.invoke(null, new java.lang.Object[]{remoteObj});
	    
	    } catch (InvocationTargetException e) {
		Throwable realException = e.getTargetException();
		// realException.printStackTrace();

		ConfigurationException ce = new ConfigurationException(
    "Problem with PortableRemoteObject.toStub(); object not exported or stub not found");
		ce.setRootCause(realException);
		throw ce;

	    } catch (IllegalAccessException e) {
		ConfigurationException ce = new ConfigurationException(
    "Cannot invoke javax.rmi.PortableRemoteObject.toStub(java.rmi.Remote)");

		ce.setRootCause(e);
		throw ce;
	    }

// Next, make sure that the stub is javax.rmi.CORBA.Stub

	    if (!corbaStubClass.isInstance(stub)) {
		return null;  // JRMP implementation or JRMP stub
	    }

// Next, make sure that the stub is connected
	    // Invoke stub.connect(orb)
	    try {
		connectMethod.invoke(stub, new java.lang.Object[]{orb});

	    } catch (InvocationTargetException e) {
		Throwable realException = e.getTargetException();
		// realException.printStackTrace();

		if (!(realException instanceof java.rmi.RemoteException)) {
		    ConfigurationException ce = new ConfigurationException(
			"Problem invoking javax.rmi.CORBA.Stub.connect()");
		    ce.setRootCause(realException);
		    throw ce;
		}
		// ignore RemoteException because stub might have already
		// been connected
	    } catch (IllegalAccessException e) {
		ConfigurationException ce = new ConfigurationException(
		    "Cannot invoke javax.rmi.CORBA.Stub.connect()");
		ce.setRootCause(e);
		throw ce;
	    }
// Finally, return stub
	    return (org.omg.CORBA.Object)stub;
    }

    /**
     * Get ORB using given server and port number, and properties from environment.
     *
     * @param server Possibly null server; if null means use default;
     *		     For applet, it is the applet host; for app, it is localhost.
     * @param port   Port number, -1 means default port
     * @param env    Possibly null environment. Contains environment properties.
     *	             Could contain ORB itself; or applet used for initializing ORB.
     *		     Use all String properties from env for initializing ORB
     * @return A non-null ORB.
     */
    public static ORB getOrb(String server, int port, Hashtable env) {
	// See if we can get info from environment
	Properties orbProp;

	// Extract any org.omg.CORBA properties from environment
	if (env != null) {
	    if (env instanceof Properties) {
		// Already a Properties, just clone
		orbProp = (Properties) env.clone();
	    } else {
		// Get all String properties
		Enumeration envProp;
		orbProp = new Properties();
		for (envProp = env.keys(); envProp.hasMoreElements();) {
		    String key = (String)envProp.nextElement();
		    Object val = env.get(key);
		    if (val instanceof String) {
			orbProp.put(key, val);
		    }
		}
	    }
	} else {
	    orbProp = new Properties();
	}

	if (server != null) {
	    orbProp.put("org.omg.CORBA.ORBInitialHost", server);
	}
	if (port >= 0) {
	    orbProp.put("org.omg.CORBA.ORBInitialPort", ""+port);
	}

	// Get Applet from environment
	Applet applet = null;
	if (env != null) {
	    applet = (Applet) env.get("java.naming.applet");
	}
	    
	// Create ORBs using applet and orbProp
	if (applet != null) {
	    return ORB.init(applet, orbProp);
	} else {
	    return ORB.init(new String[0], orbProp);
	}
    }

    // Fields used for reflection of RMI-IIOP
    private static Method toStubMethod = null;
    private static Method connectMethod = null;
    private static Class corbaStubClass = null;
    /**
     * Initializes reflection method handles for RMI-IIOP.
     * @exception ClassNotFoundException javax.rmi.CORBA.* not available
     */
    private static void initMethodHandles() throws ClassNotFoundException {
	// Get javax.rmi.CORBA.Stub class
	corbaStubClass = Class.forName("javax.rmi.CORBA.Stub");

	// Get javax.rmi.CORBA.Stub.connect(org.omg.CORBA.ORB) method

	try {
	    connectMethod = corbaStubClass.getMethod("connect",
		new Class[] {org.omg.CORBA.ORB.class});
	} catch (NoSuchMethodException e) {
	    throw new IllegalStateException(
	"No method definition for javax.rmi.CORBA.Stub.connect(org.omg.CORBA.ORB)");
	}

	// Get javax.rmi.PortableRemoteObject method
	Class proClass = Class.forName("javax.rmi.PortableRemoteObject");

	// Get javax.rmi.PortableRemoteObject(java.rmi.Remote) method
	try {
	    toStubMethod = proClass.getMethod("toStub",
		new Class[] {java.rmi.Remote.class});
	    
	} catch (NoSuchMethodException e) {
	    throw new IllegalStateException(
"No method definition for javax.rmi.PortableRemoteObject.toStub(java.rmi.Remote)");
	}
    }
}
