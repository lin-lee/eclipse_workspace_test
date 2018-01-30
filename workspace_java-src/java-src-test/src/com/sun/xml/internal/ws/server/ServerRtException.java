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

package com.sun.xml.internal.ws.server;

import com.sun.xml.internal.ws.util.exception.JAXWSExceptionBase;
import com.sun.xml.internal.ws.util.localization.Localizable;

/**
 */
public class ServerRtException extends JAXWSExceptionBase {

    public ServerRtException(String key, Object... args) {
        super(key, args);
    }

    public ServerRtException(Throwable throwable) {
        super(throwable);
    }

    public ServerRtException(Localizable arg) {
        super("server.rt.err", arg);
    }

    public String getDefaultResourceBundleName() {
        return "com.sun.xml.internal.ws.resources.server";
    }

}
