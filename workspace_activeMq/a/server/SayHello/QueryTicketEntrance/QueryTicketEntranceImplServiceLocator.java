/**
 * QueryTicketEntranceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package server.SayHello.QueryTicketEntrance;

public class QueryTicketEntranceImplServiceLocator extends org.apache.axis.client.Service implements server.SayHello.QueryTicketEntrance.QueryTicketEntranceImplService {

    public QueryTicketEntranceImplServiceLocator() {
    }


    public QueryTicketEntranceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public QueryTicketEntranceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for QueryTicketEntranceImplPort
    private java.lang.String QueryTicketEntranceImplPort_address = "http://42.202.146.13:8080/TicketWebService/QueryTicketEntrance";

    public java.lang.String getQueryTicketEntranceImplPortAddress() {
        return QueryTicketEntranceImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String QueryTicketEntranceImplPortWSDDServiceName = "QueryTicketEntranceImplPort";

    public java.lang.String getQueryTicketEntranceImplPortWSDDServiceName() {
        return QueryTicketEntranceImplPortWSDDServiceName;
    }

    public void setQueryTicketEntranceImplPortWSDDServiceName(java.lang.String name) {
        QueryTicketEntranceImplPortWSDDServiceName = name;
    }

    public server.SayHello.QueryTicketEntrance.QueryTicketEntrance getQueryTicketEntranceImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(QueryTicketEntranceImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getQueryTicketEntranceImplPort(endpoint);
    }

    public server.SayHello.QueryTicketEntrance.QueryTicketEntrance getQueryTicketEntranceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            server.SayHello.QueryTicketEntrance.QueryTicketEntranceImplServiceSoapBindingStub _stub = new server.SayHello.QueryTicketEntrance.QueryTicketEntranceImplServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getQueryTicketEntranceImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setQueryTicketEntranceImplPortEndpointAddress(java.lang.String address) {
        QueryTicketEntranceImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (server.SayHello.QueryTicketEntrance.QueryTicketEntrance.class.isAssignableFrom(serviceEndpointInterface)) {
                server.SayHello.QueryTicketEntrance.QueryTicketEntranceImplServiceSoapBindingStub _stub = new server.SayHello.QueryTicketEntrance.QueryTicketEntranceImplServiceSoapBindingStub(new java.net.URL(QueryTicketEntranceImplPort_address), this);
                _stub.setPortName(getQueryTicketEntranceImplPortWSDDServiceName());
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
        if ("QueryTicketEntranceImplPort".equals(inputPortName)) {
            return getQueryTicketEntranceImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservice.ticket.com/", "QueryTicketEntranceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservice.ticket.com/", "QueryTicketEntranceImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("QueryTicketEntranceImplPort".equals(portName)) {
            setQueryTicketEntranceImplPortEndpointAddress(address);
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
