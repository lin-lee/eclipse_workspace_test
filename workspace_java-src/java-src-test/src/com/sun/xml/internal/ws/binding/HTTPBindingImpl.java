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
package com.sun.xml.internal.ws.binding;

import com.sun.xml.internal.ws.api.BindingID;
import com.sun.xml.internal.ws.client.HandlerConfiguration;
import com.sun.xml.internal.ws.resources.ClientMessages;

import javax.xml.namespace.QName;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.LogicalHandler;
import javax.xml.ws.http.HTTPBinding;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author WS Development Team
 */
public class HTTPBindingImpl extends BindingImpl implements HTTPBinding {

    /**
     * Use {@link BindingImpl#create(BindingID)} to create this.
     */
    HTTPBindingImpl() {
        // TODO: implement a real Codec for these
        super(BindingID.XML_HTTP);
    }

    /**
     * This method separates the logical and protocol handlers and
     * sets the HandlerConfiguration.
     * Only logical handlers are allowed with HTTPBinding.
     * Setting SOAPHandlers throws WebServiceException
     */
    protected HandlerConfiguration createHandlerConfig(List<Handler> handlerChain) {
        List<LogicalHandler> logicalHandlers = new ArrayList<LogicalHandler>();
        for (Handler handler : handlerChain) {
            if (!(handler instanceof LogicalHandler)) {
                throw new WebServiceException(ClientMessages.NON_LOGICAL_HANDLER_SET(handler.getClass()));
            } else {
                logicalHandlers.add((LogicalHandler) handler);
            }
        }
        return new HandlerConfiguration(
                Collections.<String>emptySet(),
                Collections.<QName>emptySet(),
                handlerChain,logicalHandlers,null,null,null);
    }
}
