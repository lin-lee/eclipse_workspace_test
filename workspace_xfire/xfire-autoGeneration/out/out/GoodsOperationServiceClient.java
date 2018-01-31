
package out;

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

public class GoodsOperationServiceClient {

    private static XFireProxyFactory proxyFactory = new XFireProxyFactory();
    private HashMap endpoints = new HashMap();
    private Service service0;

    public GoodsOperationServiceClient() {
        create0();
        Endpoint GoodsOperationInterFaceLocalEndpointEP = service0 .addEndpoint(new QName("http://imp.webservice.ticket.xiexie.com/", "GoodsOperationInterFaceLocalEndpoint"), new QName("http://imp.webservice.ticket.xiexie.com/", "GoodsOperationInterFaceLocalBinding"), "xfire.local://GoodsOperationService");
        endpoints.put(new QName("http://imp.webservice.ticket.xiexie.com/", "GoodsOperationInterFaceLocalEndpoint"), GoodsOperationInterFaceLocalEndpointEP);
        Endpoint GoodsOperationPortEP = service0 .addEndpoint(new QName("http://imp.webservice.ticket.xiexie.com/", "GoodsOperationPort"), new QName("http://imp.webservice.ticket.xiexie.com/", "GoodsOperationServiceSoapBinding"), "http://182.50.0.182:8081/fire/webService/GoodsService");
        endpoints.put(new QName("http://imp.webservice.ticket.xiexie.com/", "GoodsOperationPort"), GoodsOperationPortEP);
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
        service0 = asf.create((out.GoodsOperationInterFace.class), props);
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("http://imp.webservice.ticket.xiexie.com/", "GoodsOperationInterFaceLocalBinding"), "urn:xfire:transport:local");
        }
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("http://imp.webservice.ticket.xiexie.com/", "GoodsOperationServiceSoapBinding"), "http://schemas.xmlsoap.org/soap/http");
        }
    }

    public GoodsOperationInterFace getGoodsOperationInterFaceLocalEndpoint() {
        return ((GoodsOperationInterFace)(this).getEndpoint(new QName("http://imp.webservice.ticket.xiexie.com/", "GoodsOperationInterFaceLocalEndpoint")));
    }

    public GoodsOperationInterFace getGoodsOperationInterFaceLocalEndpoint(String url) {
        GoodsOperationInterFace var = getGoodsOperationInterFaceLocalEndpoint();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

    public GoodsOperationInterFace getGoodsOperationPort() {
        return ((GoodsOperationInterFace)(this).getEndpoint(new QName("http://imp.webservice.ticket.xiexie.com/", "GoodsOperationPort")));
    }

    public GoodsOperationInterFace getGoodsOperationPort(String url) {
        GoodsOperationInterFace var = getGoodsOperationPort();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

}
