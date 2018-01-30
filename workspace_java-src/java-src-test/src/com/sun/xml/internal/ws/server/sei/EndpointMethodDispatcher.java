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

package com.sun.xml.internal.ws.server.sei;

import com.sun.xml.internal.ws.api.message.Packet;

/**
 * This interface needs to be implemented if a new dispatching
 * mechanism needs to be plugged in. The dispatcher is plugged in the
 * constructor of {@link EndpointMethodDispatcherGetter}.
 *
 * @author Arun Gupta
 * @see EndpointMethodDispatcherGetter
 */
interface EndpointMethodDispatcher {
    /**
     * Returns the {@link EndpointMethodHandler} for the <code>request</code>
     * {@link Packet}.
     *
     * @param request request packet
     * @return
     *      non-null {@link EndpointMethodHandler} that will route the request packet.
     *      null to indicate that the request packet be processed by the next available
     *      {@link EndpointMethodDispatcher}.
     * @throws DispatchException
     *      If the request is invalid, and processing shall be aborted with a specific fault.
     */
    EndpointMethodHandler getEndpointMethodHandler(Packet request) throws DispatchException;
}
