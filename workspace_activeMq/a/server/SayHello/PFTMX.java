/**
 * PFTMX.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package server.SayHello;

public interface PFTMX extends javax.xml.rpc.Service {
    public java.lang.String getPFTMXPortAddress();

    public server.SayHello.PFTMXPort_PortType getPFTMXPort() throws javax.xml.rpc.ServiceException;

    public server.SayHello.PFTMXPort_PortType getPFTMXPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
