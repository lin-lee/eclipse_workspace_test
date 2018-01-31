
package taian;

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

public class TicketInfoServiceClient {

    private static XFireProxyFactory proxyFactory = new XFireProxyFactory();
    private HashMap endpoints = new HashMap();
    private Service service0;

    public TicketInfoServiceClient() {
        create0();
        Endpoint TicketInfoServiceSoapLocalEndpointEP = service0 .addEndpoint(new QName("http://localhost", "TicketInfoServiceSoapLocalEndpoint"), new QName("http://localhost", "TicketInfoServiceSoapLocalBinding"), "xfire.local://TicketInfoService");
        endpoints.put(new QName("http://localhost", "TicketInfoServiceSoapLocalEndpoint"), TicketInfoServiceSoapLocalEndpointEP);
        Endpoint TicketInfoServiceSoapEP = service0 .addEndpoint(new QName("http://localhost", "TicketInfoServiceSoap"), new QName("http://localhost", "TicketInfoServiceSoap"), "http://60.213.185.173:51018/TicketInfoService.asmx");
        endpoints.put(new QName("http://localhost", "TicketInfoServiceSoap"), TicketInfoServiceSoapEP);
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
        service0 = asf.create((taian.TicketInfoServiceSoap.class), props);
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("http://localhost", "TicketInfoServiceSoapLocalBinding"), "urn:xfire:transport:local");
        }
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("http://localhost", "TicketInfoServiceSoap"), "http://schemas.xmlsoap.org/soap/http");
        }
    }

    public TicketInfoServiceSoap getTicketInfoServiceSoapLocalEndpoint() {
        return ((TicketInfoServiceSoap)(this).getEndpoint(new QName("http://localhost", "TicketInfoServiceSoapLocalEndpoint")));
    }

    public TicketInfoServiceSoap getTicketInfoServiceSoapLocalEndpoint(String url) {
        TicketInfoServiceSoap var = getTicketInfoServiceSoapLocalEndpoint();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

    public TicketInfoServiceSoap getTicketInfoServiceSoap() {
        return ((TicketInfoServiceSoap)(this).getEndpoint(new QName("http://localhost", "TicketInfoServiceSoap")));
    }

    public TicketInfoServiceSoap getTicketInfoServiceSoap(String url) {
        TicketInfoServiceSoap var = getTicketInfoServiceSoap();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

}
