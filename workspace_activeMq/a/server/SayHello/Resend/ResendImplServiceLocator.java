/**
 * ResendImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package server.SayHello.Resend;

public class ResendImplServiceLocator extends org.apache.axis.client.Service implements server.SayHello.Resend.ResendImplService {

    public ResendImplServiceLocator() {
    }


    public ResendImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ResendImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ResendImplPort
    private java.lang.String ResendImplPort_address = "http://42.202.146.13:8080/TicketWebService/Resend";

    public java.lang.String getResendImplPortAddress() {
        return ResendImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ResendImplPortWSDDServiceName = "ResendImplPort";

    public java.lang.String getResendImplPortWSDDServiceName() {
        return ResendImplPortWSDDServiceName;
    }

    public void setResendImplPortWSDDServiceName(java.lang.String name) {
        ResendImplPortWSDDServiceName = name;
    }

    public server.SayHello.Resend.Resend getResendImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ResendImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getResendImplPort(endpoint);
    }

    public server.SayHello.Resend.Resend getResendImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            server.SayHello.Resend.ResendImplServiceSoapBindingStub _stub = new server.SayHello.Resend.ResendImplServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getResendImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setResendImplPortEndpointAddress(java.lang.String address) {
        ResendImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (server.SayHello.Resend.Resend.class.isAssignableFrom(serviceEndpointInterface)) {
                server.SayHello.Resend.ResendImplServiceSoapBindingStub _stub = new server.SayHello.Resend.ResendImplServiceSoapBindingStub(new java.net.URL(ResendImplPort_address), this);
                _stub.setPortName(getResendImplPortWSDDServiceName());
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
        if ("ResendImplPort".equals(inputPortName)) {
            return getResendImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservice.ticket.com/", "ResendImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservice.ticket.com/", "ResendImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ResendImplPort".equals(portName)) {
            setResendImplPortEndpointAddress(address);
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
