
package com;

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

public class QueryTicketEntranceImplServiceClient {

    private static XFireProxyFactory proxyFactory = new XFireProxyFactory();
    private HashMap endpoints = new HashMap();
    private Service service0;

    public QueryTicketEntranceImplServiceClient() {
        create0();
        Endpoint QueryTicketEntranceLocalEndpointEP = service0 .addEndpoint(new QName("http://webservice.ticket.com/", "QueryTicketEntranceLocalEndpoint"), new QName("http://webservice.ticket.com/", "QueryTicketEntranceLocalBinding"), "xfire.local://QueryTicketEntranceImplService");
        endpoints.put(new QName("http://webservice.ticket.com/", "QueryTicketEntranceLocalEndpoint"), QueryTicketEntranceLocalEndpointEP);
        Endpoint QueryTicketEntranceImplPortEP = service0 .addEndpoint(new QName("http://webservice.ticket.com/", "QueryTicketEntranceImplPort"), new QName("http://webservice.ticket.com/", "QueryTicketEntranceImplServiceSoapBinding"), "http://42.202.146.13:8080/TicketWebService/QueryTicketEntrance");
        endpoints.put(new QName("http://webservice.ticket.com/", "QueryTicketEntranceImplPort"), QueryTicketEntranceImplPortEP);
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
        service0 = asf.create((com.QueryTicketEntrance.class), props);
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("http://webservice.ticket.com/", "QueryTicketEntranceLocalBinding"), "urn:xfire:transport:local");
        }
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("http://webservice.ticket.com/", "QueryTicketEntranceImplServiceSoapBinding"), "http://schemas.xmlsoap.org/soap/http");
        }
    }

    public QueryTicketEntrance getQueryTicketEntranceLocalEndpoint() {
        return ((QueryTicketEntrance)(this).getEndpoint(new QName("http://webservice.ticket.com/", "QueryTicketEntranceLocalEndpoint")));
    }

    public QueryTicketEntrance getQueryTicketEntranceLocalEndpoint(String url) {
        QueryTicketEntrance var = getQueryTicketEntranceLocalEndpoint();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

    public QueryTicketEntrance getQueryTicketEntranceImplPort() {
        return ((QueryTicketEntrance)(this).getEndpoint(new QName("http://webservice.ticket.com/", "QueryTicketEntranceImplPort")));
    }

    public QueryTicketEntrance getQueryTicketEntranceImplPort(String url) {
        QueryTicketEntrance var = getQueryTicketEntranceImplPort();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

}
