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

package com.sun.xml.internal.ws.transport.http.server;

import com.sun.net.httpserver.HttpContext;
import com.sun.xml.internal.ws.api.server.WSEndpoint;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLPort;
import com.sun.xml.internal.ws.transport.http.HttpAdapter;
import com.sun.xml.internal.ws.transport.http.HttpAdapterList;
import com.sun.xml.internal.ws.server.ServerRtException;
import com.sun.xml.internal.ws.server.WSEndpointImpl;

import javax.xml.stream.XMLStreamWriter;
import javax.xml.stream.XMLStreamException;
import javax.xml.ws.EndpointReference;
import java.util.concurrent.Executor;
import java.io.IOException;

import org.w3c.dom.Element;

/**
 * Hides {@link HttpContext} so that {@link EndpointImpl}
 * may load even without {@link HttpContext}.
 *
 * TODO: But what's the point? If Light-weight HTTP server isn't present,
 * all the publish operations will fail way. Why is it better to defer
 * the failure, as opposed to cause the failure as earyl as possible? -KK
 *
 * @author Jitendra Kotamraju
 */
public final class HttpEndpoint extends com.sun.xml.internal.ws.api.server.HttpEndpoint {
    private String address;
    private HttpContext httpContext;
    private final HttpAdapter adapter;
    private final Executor executor;

    public HttpEndpoint(WSEndpoint endpoint, Executor executor) {
        this.executor = executor;
        this.adapter = HttpAdapter.createAlone(endpoint);
    }

    public void publish(String address) {
        this.address = address;
        httpContext = ServerMgr.getInstance().createContext(address);
        publish(httpContext);
    }

    public void publish(Object serverContext) {
        if (!(serverContext instanceof HttpContext)) {
            throw new ServerRtException("not.HttpContext.type", serverContext.getClass());
        }

        this.httpContext = (HttpContext)serverContext;
        publish(httpContext);
    }

    /**
     * This can be called only after publish
     * @return address of the Endpoint
     */
    private String getEPRAddress() {
        if(address == null) {
            // Application created its own HttpContext
            return httpContext.getServer().getAddress().toString();
        } else
            return address;
    }

    public void stop() {
        if (address == null) {
            // Application created its own HttpContext
            // httpContext.setHandler(null);
            httpContext.getServer().removeContext(httpContext);
        } else {
            // Remove HttpContext created by JAXWS runtime 
            ServerMgr.getInstance().removeContext(httpContext);
        }

        // Invoke WebService Life cycle method
        adapter.getEndpoint().dispose();
    }

    private void publish (HttpContext context) {
        context.setHandler(new WSHttpHandler(adapter, executor));
    }

    public <T extends EndpointReference> T getEndpointReference(Class<T> clazz, Element...referenceParameters) {
        WSEndpointImpl endpointImpl = (WSEndpointImpl) adapter.getEndpoint();
        String eprAddress = getEPRAddress();
        return clazz.cast(endpointImpl.getEndpointReference(clazz, eprAddress,eprAddress+"?wsdl", referenceParameters));
    }

}
