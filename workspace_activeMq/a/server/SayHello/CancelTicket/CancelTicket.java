/**
 * CancelTicket.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package server.SayHello.CancelTicket;

public interface CancelTicket extends java.rmi.Remote {
    public server.SayHello.CancelTicket.ResultCancelTicket cancelTicket(java.lang.String agentOrderID, java.lang.String agentID, java.lang.String agentPassword, java.lang.String companyID, java.lang.String orderName, java.lang.String orderPhoneNumber, java.lang.String payFlag) throws java.rmi.RemoteException;
}
