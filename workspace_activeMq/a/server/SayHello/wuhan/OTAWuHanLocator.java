/**
 * OTAWuHanLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package server.SayHello.wuhan;

public class OTAWuHanLocator extends org.apache.axis.client.Service implements server.SayHello.wuhan.OTAWuHan {

    public OTAWuHanLocator() {
    }


    public OTAWuHanLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public OTAWuHanLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpBinding_IOTAWuHan
    private java.lang.String BasicHttpBinding_IOTAWuHan_address = "http://180.168.107.62:9302/OTAWuHan.svc";

    public java.lang.String getBasicHttpBinding_IOTAWuHanAddress() {
        return BasicHttpBinding_IOTAWuHan_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_IOTAWuHanWSDDServiceName = "BasicHttpBinding_IOTAWuHan";

    public java.lang.String getBasicHttpBinding_IOTAWuHanWSDDServiceName() {
        return BasicHttpBinding_IOTAWuHanWSDDServiceName;
    }

    public void setBasicHttpBinding_IOTAWuHanWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_IOTAWuHanWSDDServiceName = name;
    }

    public server.SayHello.wuhan.IOTAWuHan getBasicHttpBinding_IOTAWuHan() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_IOTAWuHan_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_IOTAWuHan(endpoint);
    }

    public server.SayHello.wuhan.IOTAWuHan getBasicHttpBinding_IOTAWuHan(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            server.SayHello.wuhan.BasicHttpBinding_IOTAWuHanStub _stub = new server.SayHello.wuhan.BasicHttpBinding_IOTAWuHanStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_IOTAWuHanWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_IOTAWuHanEndpointAddress(java.lang.String address) {
        BasicHttpBinding_IOTAWuHan_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (server.SayHello.wuhan.IOTAWuHan.class.isAssignableFrom(serviceEndpointInterface)) {
                server.SayHello.wuhan.BasicHttpBinding_IOTAWuHanStub _stub = new server.SayHello.wuhan.BasicHttpBinding_IOTAWuHanStub(new java.net.URL(BasicHttpBinding_IOTAWuHan_address), this);
                _stub.setPortName(getBasicHttpBinding_IOTAWuHanWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BasicHttpBinding_IOTAWuHan".equals(inputPortName)) {
            return getBasicHttpBinding_IOTAWuHan();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "OTAWuHan");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "BasicHttpBinding_IOTAWuHan"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_IOTAWuHan".equals(portName)) {
            setBasicHttpBinding_IOTAWuHanEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
