
package ok;

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

public class TicketServiceClient {

    private static XFireProxyFactory proxyFactory = new XFireProxyFactory();
    private HashMap endpoints = new HashMap();
    private Service service0;

    public TicketServiceClient() {
        create0();
        Endpoint TicketServiceHttpPortEP = service0 .addEndpoint(new QName("http://ws.agent.chimelong.cn", "TicketServiceHttpPort"), new QName("http://ws.agent.chimelong.cn", "TicketServiceHttpBinding"), "http://59.41.253.249:8080/services/TicketService");
        endpoints.put(new QName("http://ws.agent.chimelong.cn", "TicketServiceHttpPort"), TicketServiceHttpPortEP);
        Endpoint TicketServicePortTypeLocalEndpointEP = service0 .addEndpoint(new QName("http://ws.agent.chimelong.cn", "TicketServicePortTypeLocalEndpoint"), new QName("http://ws.agent.chimelong.cn", "TicketServicePortTypeLocalBinding"), "xfire.local://TicketService");
        endpoints.put(new QName("http://ws.agent.chimelong.cn", "TicketServicePortTypeLocalEndpoint"), TicketServicePortTypeLocalEndpointEP);
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
        service0 = asf.create((ok.TicketServicePortType.class), props);
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("http://ws.agent.chimelong.cn", "TicketServiceHttpBinding"), "http://schemas.xmlsoap.org/soap/http");
        }
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("http://ws.agent.chimelong.cn", "TicketServicePortTypeLocalBinding"), "urn:xfire:transport:local");
        }
    }

    public TicketServicePortType getTicketServiceHttpPort() {
        return ((TicketServicePortType)(this).getEndpoint(new QName("http://ws.agent.chimelong.cn", "TicketServiceHttpPort")));
    }

    public TicketServicePortType getTicketServiceHttpPort(String url) {
        TicketServicePortType var = getTicketServiceHttpPort();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

    public TicketServicePortType getTicketServicePortTypeLocalEndpoint() {
        return ((TicketServicePortType)(this).getEndpoint(new QName("http://ws.agent.chimelong.cn", "TicketServicePortTypeLocalEndpoint")));
    }

    public TicketServicePortType getTicketServicePortTypeLocalEndpoint(String url) {
        TicketServicePortType var = getTicketServicePortTypeLocalEndpoint();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

}
