/*
 * Copyright (c) 1997, 2008, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms. 
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

/*
 * JAXWSServerAgent.java
 *
 * Created on February 7, 2007, 6:37 PM
 */

package com.sun.xml.internal.ws.server;

import com.sun.xml.internal.ws.util.RuntimeVersionMBean;
import com.sun.xml.internal.ws.util.RuntimeVersion;
import com.sun.xml.internal.ws.transport.http.HttpDump;

import javax.management.ObjectName;
import javax.management.MBeanServer;
import java.lang.management.ManagementFactory;

/**
 *
 * @author Jitendra Kotamraju
 */
public class JMXAgent {

    // Platform MBeanServer used to register your MBeans
    private final MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
    
    // Singleton instance
    private static JMXAgent singleton;
    
    /**
     * Instantiate and register your MBeans.
     */
    public void init() throws Exception {

        RuntimeVersionMBean mbean = new RuntimeVersion();
        ObjectName mbeanName = new ObjectName("com.sun.xml.internal.ws.util:type=RuntimeVersion");
        if (!getMBeanServer().isRegistered(mbeanName)) {
            getMBeanServer().registerMBean(mbean, mbeanName);
        }

        HttpDump dump = new HttpDump();
        ObjectName dumpName = new ObjectName("com.sun.xml.internal.ws.transport.http:type=HttpDump");
        if (!getMBeanServer().isRegistered(dumpName)) {
            getMBeanServer().registerMBean(dump, dumpName);
        }
    }
    
    /**
     * Returns an agent singleton.
     */
    public synchronized static JMXAgent getDefault() throws Exception {
        if(singleton == null) {
            singleton = new JMXAgent();
            singleton.init();
        }
        return singleton;
    }
    
    private MBeanServer getMBeanServer() {
        return mbs;
    }
    
}
