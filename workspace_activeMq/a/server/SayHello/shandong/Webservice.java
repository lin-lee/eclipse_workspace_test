/**
 * Webservice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package server.SayHello.shandong;

public interface Webservice extends javax.xml.rpc.Service {
    public java.lang.String getwebserviceHttpPortAddress();

    public server.SayHello.shandong.WebservicePortType getwebserviceHttpPort() throws javax.xml.rpc.ServiceException;

    public server.SayHello.shandong.WebservicePortType getwebserviceHttpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
