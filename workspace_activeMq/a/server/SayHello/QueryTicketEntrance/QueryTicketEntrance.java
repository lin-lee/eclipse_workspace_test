/**
 * QueryTicketEntrance.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package server.SayHello.QueryTicketEntrance;

public interface QueryTicketEntrance extends java.rmi.Remote {
    public server.SayHello.QueryTicketEntrance.ResultQueryTicketType queryTicketEntrance(java.lang.String agentID, java.lang.String agentPassword, java.lang.String companyID, java.lang.String orderId, java.lang.String entranceTimeStart, java.lang.String entranceTimeEnd) throws java.rmi.RemoteException;
}
