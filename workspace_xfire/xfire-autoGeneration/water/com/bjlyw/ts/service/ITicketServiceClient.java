
package com.bjlyw.ts.service;

import java.net.MalformedURLException;
import java.util.Collection;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.codehaus.xfire.XFireRuntimeException;
import org.codehaus.xfire.aegis.AegisBindingProvider;
import org.codehaus.xfire.annotations.AnnotationServiceFactory;
import org.codehaus.xfire.annotations.jsr181.Jsr181WebAnnotations;
import org.codehaus.xfire.client.XFireProxyFactory;
import org.codehaus.xfire.jaxb2.JaxbTypeRegistry;
import org.codehaus.xfire.service.Endpoint;
import org.codehaus.xfire.service.Service;
import org.codehaus.xfire.soap.AbstractSoapBinding;
import org.codehaus.xfire.transport.TransportManager;

public class ITicketServiceClient {

    private static XFireProxyFactory proxyFactory = new XFireProxyFactory();
    private HashMap endpoints = new HashMap();
    private Service service0;

    public ITicketServiceClient() {
        create0();
        Endpoint ITicketServiceHttpPortEP = service0 .addEndpoint(new QName("http://service.ts.bjlyw.com", "ITicketServiceHttpPort"), new QName("http://service.ts.bjlyw.com", "ITicketServiceHttpBinding"), "http://114.242.13.196:3177/ticketservice/httpService.ts");
        endpoints.put(new QName("http://service.ts.bjlyw.com", "ITicketServiceHttpPort"), ITicketServiceHttpPortEP);
        Endpoint ITicketServicePortTypeLocalEndpointEP = service0 .addEndpoint(new QName("http://service.ts.bjlyw.com", "ITicketServicePortTypeLocalEndpoint"), new QName("http://service.ts.bjlyw.com", "ITicketServicePortTypeLocalBinding"), "xfire.local://ITicketService");
        endpoints.put(new QName("http://service.ts.bjlyw.com", "ITicketServicePortTypeLocalEndpoint"), ITicketServicePortTypeLocalEndpointEP);
    }

    public Object getEndpoint(Endpoint endpoint) {
        try {
            return proxyFactory.create((endpoint).getBinding(), (endpoint).getUrl());
        } catch (MalformedURLException e) {
            throw new XFireRuntimeException("Invalid URL", e);
        }
    }

    public Object getEndpoint(QName name) {
        Endpoint endpoint = ((Endpoint) endpoints.get((name)));
        if ((endpoint) == null) {
            throw new IllegalStateException("No such endpoint!");
        }
        return getEndpoint((endpoint));
    }

    public Collection getEndpoints() {
        return endpoints.values();
    }

    private void create0() {
        TransportManager tm = (org.codehaus.xfire.XFireFactory.newInstance().getXFire().getTransportManager());
        HashMap props = new HashMap();
        props.put("annotations.allow.interface", true);
        AnnotationServiceFactory asf = new AnnotationServiceFactory(new Jsr181WebAnnotations(), tm, new AegisBindingProvider(new JaxbTypeRegistry()));
        asf.setBindingCreationEnabled(false);
        service0 = asf.create((com.bjlyw.ts.service.ITicketServicePortType.class), props);
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("http://service.ts.bjlyw.com", "ITicketServiceHttpBinding"), "http://schemas.xmlsoap.org/soap/http");
        }
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("http://service.ts.bjlyw.com", "ITicketServicePortTypeLocalBinding"), "urn:xfire:transport:local");
        }
    }

    public ITicketServicePortType getITicketServiceHttpPort() {
        return ((ITicketServicePortType)(this).getEndpoint(new QName("http://service.ts.bjlyw.com", "ITicketServiceHttpPort")));
    }

    public ITicketServicePortType getITicketServiceHttpPort(String url) {
        ITicketServicePortType var = getITicketServiceHttpPort();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

    public ITicketServicePortType getITicketServicePortTypeLocalEndpoint() {
        return ((ITicketServicePortType)(this).getEndpoint(new QName("http://service.ts.bjlyw.com", "ITicketServicePortTypeLocalEndpoint")));
    }

    public ITicketServicePortType getITicketServicePortTypeLocalEndpoint(String url) {
        ITicketServicePortType var = getITicketServicePortTypeLocalEndpoint();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

}
