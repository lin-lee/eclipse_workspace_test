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
package com.sun.xml.internal.ws.client;

import com.sun.xml.internal.ws.util.exception.JAXWSExceptionBase;
import com.sun.xml.internal.ws.util.localization.Localizable;


/**
 * @author WS Development Team
 */
public class SenderException extends JAXWSExceptionBase {
    public SenderException(String key, Object... args) {
        super(key, args);
    }

    public SenderException(Throwable throwable) {
        super(throwable);
    }

    public SenderException(Localizable arg) {
        super("sender.nestedError", arg);
    }

    public String getDefaultResourceBundleName() {
        return "com.sun.xml.internal.ws.resources.sender";
    }
}
