
package testJiao;

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

public class JiaomaServiceClient {

    private static XFireProxyFactory proxyFactory = new XFireProxyFactory();
    private HashMap endpoints = new HashMap();
    private Service service0;

    public JiaomaServiceClient() {
        create0();
        Endpoint JiaomaServicePortTypeLocalEndpointEP = service0 .addEndpoint(new QName("http://www.jiaomalvyou.com/soap/JiaomaService", "JiaomaServicePortTypeLocalEndpoint"), new QName("http://www.jiaomalvyou.com/soap/JiaomaService", "JiaomaServicePortTypeLocalBinding"), "xfire.local://JiaomaService");
        endpoints.put(new QName("http://www.jiaomalvyou.com/soap/JiaomaService", "JiaomaServicePortTypeLocalEndpoint"), JiaomaServicePortTypeLocalEndpointEP);
        Endpoint JiaomaServicePortEP = service0 .addEndpoint(new QName("http://www.jiaomalvyou.com/soap/JiaomaService", "JiaomaServicePort"), new QName("http://www.jiaomalvyou.com/soap/JiaomaService", "JiaomaServiceBinding"), "http://www.jiaomalvyou.com/soap/jq_wsdl.php");
        endpoints.put(new QName("http://www.jiaomalvyou.com/soap/JiaomaService", "JiaomaServicePort"), JiaomaServicePortEP);
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
        service0 = asf.create((testJiao.JiaomaServicePortType.class), props);
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("http://www.jiaomalvyou.com/soap/JiaomaService", "JiaomaServiceBinding"), "http://schemas.xmlsoap.org/soap/http");
        }
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("http://www.jiaomalvyou.com/soap/JiaomaService", "JiaomaServicePortTypeLocalBinding"), "urn:xfire:transport:local");
        }
    }

    public JiaomaServicePortType getJiaomaServicePortTypeLocalEndpoint() {
        return ((JiaomaServicePortType)(this).getEndpoint(new QName("http://www.jiaomalvyou.com/soap/JiaomaService", "JiaomaServicePortTypeLocalEndpoint")));
    }

    public JiaomaServicePortType getJiaomaServicePortTypeLocalEndpoint(String url) {
        JiaomaServicePortType var = getJiaomaServicePortTypeLocalEndpoint();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

    public JiaomaServicePortType getJiaomaServicePort() {
        return ((JiaomaServicePortType)(this).getEndpoint(new QName("http://www.jiaomalvyou.com/soap/JiaomaService", "JiaomaServicePort")));
    }

    public JiaomaServicePortType getJiaomaServicePort(String url) {
        JiaomaServicePortType var = getJiaomaServicePort();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

}
