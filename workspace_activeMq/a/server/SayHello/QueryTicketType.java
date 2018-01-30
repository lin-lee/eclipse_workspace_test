/**
 * QueryTicketType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package server.SayHello;

public interface QueryTicketType extends java.rmi.Remote {
    public server.SayHello.ResultQueryTicketType queryTicketType(java.lang.String sprID, java.lang.String sprPassword, java.lang.String companyID, java.lang.String sprValidStart, java.lang.String sprValidEnd) throws java.rmi.RemoteException;
}
