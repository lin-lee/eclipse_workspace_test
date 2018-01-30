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



package com.sun.xml.internal.ws.util;

import javax.management.*;
import com.sun.xml.internal.ws.util.RuntimeVersion;

/**
 * @author Jitendra Kotamraju
 */
public interface RuntimeVersionMBean {

    /**
     * Get JAX-WS runtime version
     */
    public String getVersion();

}


