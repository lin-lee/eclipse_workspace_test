/**
 * WebservicePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package server.SayHello.shandong;

public interface WebservicePortType extends java.rmi.Remote {
    public server.SayHello.shandong.ScenicResult getScenic(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3, java.lang.String in4, java.lang.String in5) throws java.rmi.RemoteException;
    public server.SayHello.shandong.VersionResult getVersion(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException;
    public server.SayHello.shandong.CancelResult cancellOrder(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3, java.lang.String in4) throws java.rmi.RemoteException;
    public server.SayHello.shandong.OrderResult saveOrder(java.lang.String in0, boolean in1, java.lang.String in2, java.lang.String in3, server.SayHello.shandong.OrderBean in4, java.lang.String in5, int in6) throws java.rmi.RemoteException;
    public server.SayHello.shandong.ProductResult getTickInfo(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3, java.lang.String in4, java.lang.String in5) throws java.rmi.RemoteException;
    public java.lang.String getCode(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3, java.lang.String in4) throws java.rmi.RemoteException;
    public server.SayHello.shandong.ProductResult getProductById(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3, java.lang.String in4) throws java.rmi.RemoteException;
    public server.SayHello.shandong.ProductResult getCouponInfo(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3, java.lang.String in4, java.lang.String in5) throws java.rmi.RemoteException;
    public server.SayHello.shandong.ScenicResult getScenicById(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3, java.lang.String in4) throws java.rmi.RemoteException;
}
