/**
 * QueryTicketTypeImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package server.SayHello;

public class QueryTicketTypeImplServiceLocator extends org.apache.axis.client.Service implements server.SayHello.QueryTicketTypeImplService {

    public QueryTicketTypeImplServiceLocator() {
    }


    public QueryTicketTypeImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public QueryTicketTypeImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for QueryTicketTypeImplPort
    private java.lang.String QueryTicketTypeImplPort_address = "http://42.202.146.13:8080/TicketWebService/QueryTicketType";

    public java.lang.String getQueryTicketTypeImplPortAddress() {
        return QueryTicketTypeImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String QueryTicketTypeImplPortWSDDServiceName = "QueryTicketTypeImplPort";

    public java.lang.String getQueryTicketTypeImplPortWSDDServiceName() {
        return QueryTicketTypeImplPortWSDDServiceName;
    }

    public void setQueryTicketTypeImplPortWSDDServiceName(java.lang.String name) {
        QueryTicketTypeImplPortWSDDServiceName = name;
    }

    public server.SayHello.QueryTicketType getQueryTicketTypeImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(QueryTicketTypeImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getQueryTicketTypeImplPort(endpoint);
    }

    public server.SayHello.QueryTicketType getQueryTicketTypeImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            server.SayHello.QueryTicketTypeImplServiceSoapBindingStub _stub = new server.SayHello.QueryTicketTypeImplServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getQueryTicketTypeImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setQueryTicketTypeImplPortEndpointAddress(java.lang.String address) {
        QueryTicketTypeImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (server.SayHello.QueryTicketType.class.isAssignableFrom(serviceEndpointInterface)) {
                server.SayHello.QueryTicketTypeImplServiceSoapBindingStub _stub = new server.SayHello.QueryTicketTypeImplServiceSoapBindingStub(new java.net.URL(QueryTicketTypeImplPort_address), this);
                _stub.setPortName(getQueryTicketTypeImplPortWSDDServiceName());
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
        if ("QueryTicketTypeImplPort".equals(inputPortName)) {
            return getQueryTicketTypeImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservice.ticket.com/", "QueryTicketTypeImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservice.ticket.com/", "QueryTicketTypeImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("QueryTicketTypeImplPort".equals(portName)) {
            setQueryTicketTypeImplPortEndpointAddress(address);
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
