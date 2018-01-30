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

package com.sun.xml.internal.ws.transport.http;

/**
 * @author Jitendra Kotamraju
 *
 */
public class HttpDump implements HttpDumpMBean {
    public void setDump(boolean dump) {
        HttpAdapter.dump = dump;
    }

    public boolean getDump() {
        return HttpAdapter.dump;
    }
}
