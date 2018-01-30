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

package com.sun.xml.internal.ws.model.wsdl;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLMessage;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOperation;
import com.sun.istack.internal.NotNull;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamReader;

/**
 * @author Vivek Pandey
 */
public final class WSDLOutputImpl extends AbstractExtensibleImpl implements WSDLOutput {
    private String name;
    private QName messageName;
    private WSDLOperationImpl operation;
    private WSDLMessageImpl message;
    private String action;

    public WSDLOutputImpl(XMLStreamReader xsr,String name, QName messageName, WSDLOperationImpl operation) {
        super(xsr);
        this.name = name;
        this.messageName = messageName;
        this.operation = operation;
    }

    public String getName() {
        return (name == null)?operation.getName().getLocalPart()+"Response":name;
    }

    public WSDLMessage getMessage() {
        return message;
    }

    public String getAction() {
        return action;
    }

    @NotNull
    public WSDLOperation getOperation() {
        return operation;
    }

    @NotNull
    public QName getQName() {
        return new QName(operation.getName().getNamespaceURI(), getName());
    }

    public void setAction(String action) {
        this.action = action;
    }

    void freeze(WSDLModelImpl root) {
        message = root.getMessage(messageName);
    }
}
