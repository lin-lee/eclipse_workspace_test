/**
 * CancelTicketImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package server.SayHello.CancelTicket;

public class CancelTicketImplServiceLocator extends org.apache.axis.client.Service implements server.SayHello.CancelTicket.CancelTicketImplService {

    public CancelTicketImplServiceLocator() {
    }


    public CancelTicketImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CancelTicketImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CancelTicketImplPort
    private java.lang.String CancelTicketImplPort_address = "http://42.202.146.13:8080/TicketWebService/CancelTicket";

    public java.lang.String getCancelTicketImplPortAddress() {
        return CancelTicketImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CancelTicketImplPortWSDDServiceName = "CancelTicketImplPort";

    public java.lang.String getCancelTicketImplPortWSDDServiceName() {
        return CancelTicketImplPortWSDDServiceName;
    }

    public void setCancelTicketImplPortWSDDServiceName(java.lang.String name) {
        CancelTicketImplPortWSDDServiceName = name;
    }

    public server.SayHello.CancelTicket.CancelTicket getCancelTicketImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CancelTicketImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCancelTicketImplPort(endpoint);
    }

    public server.SayHello.CancelTicket.CancelTicket getCancelTicketImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            server.SayHello.CancelTicket.CancelTicketImplServiceSoapBindingStub _stub = new server.SayHello.CancelTicket.CancelTicketImplServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getCancelTicketImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCancelTicketImplPortEndpointAddress(java.lang.String address) {
        CancelTicketImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (server.SayHello.CancelTicket.CancelTicket.class.isAssignableFrom(serviceEndpointInterface)) {
                server.SayHello.CancelTicket.CancelTicketImplServiceSoapBindingStub _stub = new server.SayHello.CancelTicket.CancelTicketImplServiceSoapBindingStub(new java.net.URL(CancelTicketImplPort_address), this);
                _stub.setPortName(getCancelTicketImplPortWSDDServiceName());
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
        if ("CancelTicketImplPort".equals(inputPortName)) {
            return getCancelTicketImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservice.ticket.com/", "CancelTicketImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservice.ticket.com/", "CancelTicketImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CancelTicketImplPort".equals(portName)) {
            setCancelTicketImplPortEndpointAddress(address);
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
