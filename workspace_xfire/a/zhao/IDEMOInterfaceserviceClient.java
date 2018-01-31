
package zhao;

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

public class IDEMOInterfaceserviceClient {

    private static XFireProxyFactory proxyFactory = new XFireProxyFactory();
    private HashMap endpoints = new HashMap();
    private Service service0;

    public IDEMOInterfaceserviceClient() {
        create0();
        Endpoint IDEMOInterfaceLocalEndpointEP = service0 .addEndpoint(new QName("http://tempuri.org/", "IDEMOInterfaceLocalEndpoint"), new QName("http://tempuri.org/", "IDEMOInterfaceLocalBinding"), "xfire.local://IDEMOInterfaceservice");
        endpoints.put(new QName("http://tempuri.org/", "IDEMOInterfaceLocalEndpoint"), IDEMOInterfaceLocalEndpointEP);
        Endpoint IDEMOInterfacePortEP = service0 .addEndpoint(new QName("http://tempuri.org/", "IDEMOInterfacePort"), new QName("http://tempuri.org/", "IDEMOInterfacebinding"), "http://222.66.156.202:8888/DemoInterfaceGongSi/DemoInterface.dll/soap/IDEMOInterface");
        endpoints.put(new QName("http://tempuri.org/", "IDEMOInterfacePort"), IDEMOInterfacePortEP);
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
        service0 = asf.create((zhao.IDEMOInterface.class), props);
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("http://tempuri.org/", "IDEMOInterfacebinding"), "http://schemas.xmlsoap.org/soap/http");
        }
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("http://tempuri.org/", "IDEMOInterfaceLocalBinding"), "urn:xfire:transport:local");
        }
    }

    public IDEMOInterface getIDEMOInterfaceLocalEndpoint() {
        return ((IDEMOInterface)(this).getEndpoint(new QName("http://tempuri.org/", "IDEMOInterfaceLocalEndpoint")));
    }

    public IDEMOInterface getIDEMOInterfaceLocalEndpoint(String url) {
        IDEMOInterface var = getIDEMOInterfaceLocalEndpoint();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

    public IDEMOInterface getIDEMOInterfacePort() {
        return ((IDEMOInterface)(this).getEndpoint(new QName("http://tempuri.org/", "IDEMOInterfacePort")));
    }

    public IDEMOInterface getIDEMOInterfacePort(String url) {
        IDEMOInterface var = getIDEMOInterfacePort();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

}
