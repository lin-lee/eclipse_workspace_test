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

import com.sun.xml.internal.ws.api.FeatureConstructor;

import javax.jws.WebService;
import javax.xml.ws.WebServiceFeature;

/**
 * Designates a stateful {@link WebService}.
 * A service class that has this feature on will behave as a stateful web service.
 *
 * @since 2.1
 * @see StatefulWebServiceManager
 */
public class StatefulFeature extends WebServiceFeature {
    /**
     * Constant value identifying the StatefulFeature
     */
    public static final String ID = "http://jax-ws.dev.java.net/features/stateful";

    /**
     * Create an <code>StatefulFeature</code>.
     * The instance created will be enabled.
     */
    @FeatureConstructor
    public StatefulFeature() {
        this.enabled = true;
    }

    public String getID() {
        return ID;
    }
}
