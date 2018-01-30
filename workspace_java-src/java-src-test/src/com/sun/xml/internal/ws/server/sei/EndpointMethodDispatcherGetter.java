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

import com.sun.xml.internal.ws.api.WSBinding;
import com.sun.xml.internal.ws.api.message.Message;
import com.sun.xml.internal.ws.api.message.Packet;
import com.sun.xml.internal.ws.model.AbstractSEIModelImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * Gets the list of {@link EndpointMethodDispatcher}s for {@link SEIInvokerTube}.
 * a request {@link Packet}. If WS-Addressing is enabled on the endpoint, then
 * only {@link ActionBasedDispatcher} is added to the list. Otherwise,
 * {@link PayloadQNameBasedDispatcher} is added to the list.
 *
 * <p>
 * {@link Message} payload's QName to obtain the handler. If no handler is
 * registered corresponding to that QName, then uses Action Message
 * Addressing Property value to get the handler. 
 *
 * @author Arun Gupta
 */
final class EndpointMethodDispatcherGetter {
    private final List<EndpointMethodDispatcher> dispatcherList;

    EndpointMethodDispatcherGetter(AbstractSEIModelImpl model, WSBinding binding, SEIInvokerTube invokerTube) {
        dispatcherList = new ArrayList<EndpointMethodDispatcher>();

        if (binding.getAddressingVersion() != null) {
            dispatcherList.add(new ActionBasedDispatcher(model, binding, invokerTube));
        }

        // even when action based dispatching is in place,
        // we still need this because clients are alowed not to use addressing headers
        dispatcherList.add(new PayloadQNameBasedDispatcher(model, binding, invokerTube));
        dispatcherList.add(new SOAPActionBasedDispatcher(model, binding, invokerTube));
    }

    List<EndpointMethodDispatcher> getDispatcherList() {
        return dispatcherList;
    }
}
