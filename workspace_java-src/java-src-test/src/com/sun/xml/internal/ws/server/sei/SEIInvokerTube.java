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

import com.sun.istack.internal.NotNull;
import com.sun.xml.internal.ws.api.SOAPVersion;
import com.sun.xml.internal.ws.api.WSBinding;
import com.sun.xml.internal.ws.api.message.Message;
import com.sun.xml.internal.ws.api.message.Packet;
import com.sun.xml.internal.ws.api.pipe.NextAction;
import com.sun.xml.internal.ws.api.server.Invoker;
import com.sun.xml.internal.ws.client.sei.MethodHandler;
import com.sun.xml.internal.ws.model.AbstractSEIModelImpl;
import com.sun.xml.internal.ws.server.InvokerTube;
import com.sun.xml.internal.ws.resources.ServerMessages;
import com.sun.xml.internal.ws.fault.SOAPFaultBuilder;

import java.util.List;
import java.text.MessageFormat;

/**
 * This pipe is used to invoke SEI based endpoints.
 *
 * @author Jitendra Kotamraju
 */
public class SEIInvokerTube extends InvokerTube {

    /**
     * For each method on the port interface we have
     * a {@link MethodHandler} that processes it.
     */
    private final SOAPVersion soapVersion;
    private final WSBinding binding;
    private final AbstractSEIModelImpl model;
    private final List<EndpointMethodDispatcher> dispatcherList;

    public SEIInvokerTube(AbstractSEIModelImpl model,Invoker invoker, WSBinding binding) {
        super(invoker);
        this.soapVersion = binding.getSOAPVersion();
        this.binding = binding;
        this.model = model;
        EndpointMethodDispatcherGetter methodDispatcherGetter = new EndpointMethodDispatcherGetter(model, binding, this);
        dispatcherList = methodDispatcherGetter.getDispatcherList();
    }

    /**
     * This binds the parameters for SEI endpoints and invokes the endpoint method. The
     * return value, and response Holder arguments are used to create a new {@link Message}
     * that traverses through the Pipeline to transport.
     */
    public @NotNull NextAction processRequest(@NotNull Packet req) {
        for (EndpointMethodDispatcher dispatcher : dispatcherList) {
            EndpointMethodHandler handler;
            try {
                handler = dispatcher.getEndpointMethodHandler(req);
            } catch(DispatchException e) {
                return doReturnWith(req.createServerResponse(e.fault, model.getPort(), null, binding));
            }
            if (handler != null) {
                Packet res = handler.invoke(req);
                assert res!=null;
                return doReturnWith(res);
            }
        }
        String err = MessageFormat.format("Request=[SOAPAction={0},Payload='{'{1}'}'{2}]",
                req.soapAction,req.getMessage().getPayloadNamespaceURI(),
                req.getMessage().getPayloadLocalPart());
        String faultString = ServerMessages.DISPATCH_CANNOT_FIND_METHOD(err);
        Message faultMsg = SOAPFaultBuilder.createSOAPFaultMessage(
            binding.getSOAPVersion(), faultString, binding.getSOAPVersion().faultCodeClient);
        return doReturnWith(req.createServerResponse(faultMsg, model.getPort(), null, binding));
    }

    public @NotNull NextAction processResponse(@NotNull Packet response) {
        throw new IllegalStateException("InovkerPipe's processResponse shouldn't be called.");
    }

    public @NotNull NextAction processException(@NotNull Throwable t) {
        throw new IllegalStateException("InovkerPipe's processException shouldn't be called.");
    }

}
