
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

public class PFTMXClient {

    private static XFireProxyFactory proxyFactory = new XFireProxyFactory();
    private HashMap endpoints = new HashMap();
    private Service service0;

    public PFTMXClient() {
        create0();
        Endpoint PFTMXPortLocalEndpointEP = service0 .addEndpoint(new QName("urn:PFTMX", "PFTMXPortLocalEndpoint"), new QName("urn:PFTMX", "PFTMXPortLocalBinding"), "xfire.local://PFTMX");
        endpoints.put(new QName("urn:PFTMX", "PFTMXPortLocalEndpoint"), PFTMXPortLocalEndpointEP);
        Endpoint PFTMXPortEP = service0 .addEndpoint(new QName("urn:PFTMX", "PFTMXPort"), new QName("urn:PFTMX", "PFTMXBinding"), "http://open.elonghushan.com.cn/openService/pftMX_lhs.php");
        endpoints.put(new QName("urn:PFTMX", "PFTMXPort"), PFTMXPortEP);
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
        service0 = asf.create((com.PFTMXPort.class), props);
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("urn:PFTMX", "PFTMXBinding"), "http://schemas.xmlsoap.org/soap/http");
        }
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("urn:PFTMX", "PFTMXPortLocalBinding"), "urn:xfire:transport:local");
        }
    }

    public PFTMXPort getPFTMXPortLocalEndpoint() {
        return ((PFTMXPort)(this).getEndpoint(new QName("urn:PFTMX", "PFTMXPortLocalEndpoint")));
    }

    public PFTMXPort getPFTMXPortLocalEndpoint(String url) {
        PFTMXPort var = getPFTMXPortLocalEndpoint();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

    public PFTMXPort getPFTMXPort() {
        return ((PFTMXPort)(this).getEndpoint(new QName("urn:PFTMX", "PFTMXPort")));
    }

    public PFTMXPort getPFTMXPort(String url) {
        PFTMXPort var = getPFTMXPort();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

}
