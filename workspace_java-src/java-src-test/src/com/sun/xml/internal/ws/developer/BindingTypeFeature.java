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
package com.sun.xml.internal.ws.developer;

import com.sun.xml.internal.ws.api.BindingID;

import javax.xml.ws.WebServiceFeature;

/**
 * Using this feature, the application could override the binding used by
 * the runtime(usually determined from WSDL).
 *
 * @author Jitendra Kotamraju
 */
public final class BindingTypeFeature extends WebServiceFeature {

    public static final String ID = "http://jax-ws.dev.java.net/features/binding";

    private final String bindingId;

    public BindingTypeFeature(String bindingId) {
        this.bindingId = bindingId;
    }

    public String getID() {
        return ID;
    }

    public String getBindingId() {
        return bindingId;
    }

}
