/**
 * GoodsOperationServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package server.SayHello.xiexie;

public class GoodsOperationServiceLocator extends org.apache.axis.client.Service implements server.SayHello.xiexie.GoodsOperationService {

    public GoodsOperationServiceLocator() {
    }


    public GoodsOperationServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GoodsOperationServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GoodsOperationPort
    private java.lang.String GoodsOperationPort_address = "http://182.50.0.182:8081/fire/webService/GoodsService";

    public java.lang.String getGoodsOperationPortAddress() {
        return GoodsOperationPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GoodsOperationPortWSDDServiceName = "GoodsOperationPort";

    public java.lang.String getGoodsOperationPortWSDDServiceName() {
        return GoodsOperationPortWSDDServiceName;
    }

    public void setGoodsOperationPortWSDDServiceName(java.lang.String name) {
        GoodsOperationPortWSDDServiceName = name;
    }

    public server.SayHello.xiexie.GoodsOperationInterFace getGoodsOperationPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GoodsOperationPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGoodsOperationPort(endpoint);
    }

    public server.SayHello.xiexie.GoodsOperationInterFace getGoodsOperationPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            server.SayHello.xiexie.GoodsOperationServiceSoapBindingStub _stub = new server.SayHello.xiexie.GoodsOperationServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getGoodsOperationPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGoodsOperationPortEndpointAddress(java.lang.String address) {
        GoodsOperationPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (server.SayHello.xiexie.GoodsOperationInterFace.class.isAssignableFrom(serviceEndpointInterface)) {
                server.SayHello.xiexie.GoodsOperationServiceSoapBindingStub _stub = new server.SayHello.xiexie.GoodsOperationServiceSoapBindingStub(new java.net.URL(GoodsOperationPort_address), this);
                _stub.setPortName(getGoodsOperationPortWSDDServiceName());
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
        if ("GoodsOperationPort".equals(inputPortName)) {
            return getGoodsOperationPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://imp.webservice.ticket.xiexie.com/", "GoodsOperationService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://imp.webservice.ticket.xiexie.com/", "GoodsOperationPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GoodsOperationPort".equals(portName)) {
            setGoodsOperationPortEndpointAddress(address);
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
