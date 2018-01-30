/**
 * IOTAWuHan.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package server.SayHello.wuhan;

public interface IOTAWuHan extends java.rmi.Remote {
    public java.lang.Integer orderInJson(java.lang.String agent_code, java.lang.String safe_code, javax.xml.rpc.holders.StringHolder error, java.lang.String order, javax.xml.rpc.holders.StringHolder orderResult, javax.xml.rpc.holders.StringHolder rSafeCode) throws java.rmi.RemoteException;
    public java.lang.Integer orderRefundJson(java.lang.String agent_code, java.lang.String order_nbr, java.lang.String package_code, java.lang.String package_count, java.lang.String partner_trans_nbr, java.lang.String safe_code, javax.xml.rpc.holders.StringHolder error, javax.xml.rpc.holders.StringHolder rSafeCode) throws java.rmi.RemoteException;
    public java.lang.Integer orderRefundResult(java.lang.String agent_code, java.lang.String partner_trans_nbr, java.lang.String refund_date, java.lang.String safe_code, javax.xml.rpc.holders.StringHolder error, javax.xml.rpc.holders.StringHolder refund_result, javax.xml.rpc.holders.StringHolder rSafeCode) throws java.rmi.RemoteException;
    public java.lang.Integer ticketPriceGetJson(java.lang.String agent_code, java.lang.String safe_code, javax.xml.rpc.holders.StringHolder error, javax.xml.rpc.holders.StringHolder ticket_rule, javax.xml.rpc.holders.StringHolder rSafeCode) throws java.rmi.RemoteException;
    public java.lang.Integer orderQueryDetail(java.lang.String agent_code, java.lang.String order_nbr, java.lang.String order_nbr_original, java.lang.String safe_code, javax.xml.rpc.holders.StringHolder error, javax.xml.rpc.holders.StringHolder orderInfo, javax.xml.rpc.holders.StringHolder rSafeCode) throws java.rmi.RemoteException;
    public java.lang.Integer orderExchangeQuery(java.lang.String agent_code, java.lang.String order_nbr, java.lang.String start_date, java.lang.String end_date, java.lang.String safe_code, javax.xml.rpc.holders.StringHolder error, javax.xml.rpc.holders.StringHolder orderInfo, javax.xml.rpc.holders.StringHolder rSafeCode) throws java.rmi.RemoteException;
    public java.lang.Integer orderDelayJson(java.lang.String agent_code, java.lang.String order_nbr, java.lang.String new_date, java.lang.String safe_code, javax.xml.rpc.holders.StringHolder error, javax.xml.rpc.holders.StringHolder rSafeCode) throws java.rmi.RemoteException;
    public java.lang.Integer OTAStockQuery(java.lang.String agent_code, java.lang.String query_date, java.lang.String safe_code, javax.xml.rpc.holders.StringHolder stock_info, javax.xml.rpc.holders.StringHolder error, javax.xml.rpc.holders.StringHolder rSafeCode) throws java.rmi.RemoteException;
    public java.lang.Integer OTAAccountQuery(java.lang.String agent_code, java.lang.String safe_code, javax.xml.rpc.holders.StringHolder account_info, javax.xml.rpc.holders.StringHolder error, javax.xml.rpc.holders.StringHolder rSafeCode) throws java.rmi.RemoteException;
}
