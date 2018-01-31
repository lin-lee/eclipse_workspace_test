
package cn;

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

public class CancelTicketImplServiceClient {

    private static XFireProxyFactory proxyFactory = new XFireProxyFactory();
    private HashMap endpoints = new HashMap();
    private Service service0;

    public CancelTicketImplServiceClient() {
        create0();
        Endpoint CancelTicketImplPortEP = service0 .addEndpoint(new QName("http://webservice.ticket.com/", "CancelTicketImplPort"), new QName("http://webservice.ticket.com/", "CancelTicketImplServiceSoapBinding"), "http://42.202.146.13:8080/TicketWebService/CancelTicket");
        endpoints.put(new QName("http://webservice.ticket.com/", "CancelTicketImplPort"), CancelTicketImplPortEP);
        Endpoint CancelTicketLocalEndpointEP = service0 .addEndpoint(new QName("http://webservice.ticket.com/", "CancelTicketLocalEndpoint"), new QName("http://webservice.ticket.com/", "CancelTicketLocalBinding"), "xfire.local://CancelTicketImplService");
        endpoints.put(new QName("http://webservice.ticket.com/", "CancelTicketLocalEndpoint"), CancelTicketLocalEndpointEP);
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
        service0 = asf.create((cn.CancelTicket.class), props);
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("http://webservice.ticket.com/", "CancelTicketLocalBinding"), "urn:xfire:transport:local");
        }
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("http://webservice.ticket.com/", "CancelTicketImplServiceSoapBinding"), "http://schemas.xmlsoap.org/soap/http");
        }
    }

    public CancelTicket getCancelTicketImplPort() {
        return ((CancelTicket)(this).getEndpoint(new QName("http://webservice.ticket.com/", "CancelTicketImplPort")));
    }

    public CancelTicket getCancelTicketImplPort(String url) {
        CancelTicket var = getCancelTicketImplPort();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

    public CancelTicket getCancelTicketLocalEndpoint() {
        return ((CancelTicket)(this).getEndpoint(new QName("http://webservice.ticket.com/", "CancelTicketLocalEndpoint")));
    }

    public CancelTicket getCancelTicketLocalEndpoint(String url) {
        CancelTicket var = getCancelTicketLocalEndpoint();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

}
