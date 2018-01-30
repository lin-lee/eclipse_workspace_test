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
package com.sun.xml.internal.ws.protocol.soap;

import com.sun.xml.internal.ws.api.WSBinding;
import com.sun.xml.internal.ws.api.message.Packet;
import com.sun.xml.internal.ws.api.pipe.*;
import com.sun.xml.internal.ws.client.HandlerConfiguration;
import com.sun.xml.internal.ws.binding.BindingImpl;
import javax.xml.namespace.QName;
import java.util.Set;

/**
 * @author Rama Pulavarthi
 */

public class ServerMUTube extends MUTube {
    
    private HandlerConfiguration handlerConfig;
    
    public ServerMUTube(WSBinding binding, Tube next) {
        super(binding, next);
        //On Server, HandlerConfiguration does n't change after publish.
        handlerConfig = ((BindingImpl)binding).getHandlerConfig();
    }

    protected ServerMUTube(ServerMUTube that, TubeCloner cloner) {
        super(that,cloner);
        handlerConfig = that.handlerConfig;
    }

    /**
     * Do MU Header Processing on incoming message (request)
     * @return
     *      if all the headers in the packet are understood, returns action such that
     *      next pipe will be inovked.
     *      if all the headers in the packet are not understood, returns action such that
     *      SOAPFault Message is sent to previous pipes.
     */
    @Override
    public NextAction processRequest(Packet request) {
        Set<QName> misUnderstoodHeaders = getMisUnderstoodHeaders(request.getMessage().getHeaders(),
                handlerConfig.getRoles(),handlerConfig.getKnownHeaders());
        if((misUnderstoodHeaders == null)  || misUnderstoodHeaders.isEmpty()) {
            return doInvoke(super.next, request);
        }
        return doReturnWith(request.createResponse(createMUSOAPFaultMessage(misUnderstoodHeaders)));
    }

    public ServerMUTube copy(TubeCloner cloner) {
        return new ServerMUTube(this,cloner);
    }

}