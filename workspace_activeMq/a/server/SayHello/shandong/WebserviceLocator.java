/**
 * WebserviceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package server.SayHello.shandong;

public class WebserviceLocator extends org.apache.axis.client.Service implements server.SayHello.shandong.Webservice {

    public WebserviceLocator() {
    }


    public WebserviceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WebserviceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for webserviceHttpPort
    private java.lang.String webserviceHttpPort_address = "http://60.216.117.248:8080/webservice/services/webservice";

    public java.lang.String getwebserviceHttpPortAddress() {
        return webserviceHttpPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String webserviceHttpPortWSDDServiceName = "webserviceHttpPort";

    public java.lang.String getwebserviceHttpPortWSDDServiceName() {
        return webserviceHttpPortWSDDServiceName;
    }

    public void setwebserviceHttpPortWSDDServiceName(java.lang.String name) {
        webserviceHttpPortWSDDServiceName = name;
    }

    public server.SayHello.shandong.WebservicePortType getwebserviceHttpPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(webserviceHttpPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getwebserviceHttpPort(endpoint);
    }

    public server.SayHello.shandong.WebservicePortType getwebserviceHttpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            server.SayHello.shandong.WebserviceHttpBindingStub _stub = new server.SayHello.shandong.WebserviceHttpBindingStub(portAddress, this);
            _stub.setPortName(getwebserviceHttpPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setwebserviceHttpPortEndpointAddress(java.lang.String address) {
        webserviceHttpPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (server.SayHello.shandong.WebservicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                server.SayHello.shandong.WebserviceHttpBindingStub _stub = new server.SayHello.shandong.WebserviceHttpBindingStub(new java.net.URL(webserviceHttpPort_address), this);
                _stub.setPortName(getwebserviceHttpPortWSDDServiceName());
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
        if ("webserviceHttpPort".equals(inputPortName)) {
            return getwebserviceHttpPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservice.xz.com", "webservice");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservice.xz.com", "webserviceHttpPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("webserviceHttpPort".equals(portName)) {
            setwebserviceHttpPortEndpointAddress(address);
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
