/**
 * Resend.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package server.SayHello.Resend;

public interface Resend extends java.rmi.Remote {
    public server.SayHello.Resend.ResultResend resend(java.lang.String agentOrderID, java.lang.String agentID, java.lang.String agentPassword, java.lang.String visitorPhoneNumber, java.lang.String companyID) throws java.rmi.RemoteException;
}
