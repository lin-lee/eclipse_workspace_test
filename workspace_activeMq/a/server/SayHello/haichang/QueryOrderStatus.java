/**
 * QueryOrderStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package server.SayHello.haichang;

public interface QueryOrderStatus extends java.rmi.Remote {
    public server.SayHello.haichang.ResultQueryOrderStatus queryOrderStatus(java.lang.String agentID, java.lang.String agentPassword, java.lang.String companyID, java.lang.String agentOrderID) throws java.rmi.RemoteException;
}
