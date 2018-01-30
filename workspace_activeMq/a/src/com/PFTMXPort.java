
package com;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name = "PFTMXPort", targetNamespace = "urn:PFTMX")
@SOAPBinding(style = SOAPBinding.Style.RPC, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface PFTMXPort {


    @WebMethod(operationName = "Order_Change_Pro", action = "urn:PFTMX#PFT_server#Order_Change_Pro")
    @WebResult(name = "Order_Change_Pro", targetNamespace = "urn:PFTMX")
    public String order_Change_Pro(
        @WebParam(name = "ac", targetNamespace = "urn:PFTMX")
        String ac,
        @WebParam(name = "pw", targetNamespace = "urn:PFTMX")
        String pw,
        @WebParam(name = "ordern", targetNamespace = "urn:PFTMX")
        String ordern,
        @WebParam(name = "num", targetNamespace = "urn:PFTMX")
        String num,
        @WebParam(name = "ordertel", targetNamespace = "urn:PFTMX")
        String ordertel,
        @WebParam(name = "m", targetNamespace = "urn:PFTMX")
        String m);

    @WebMethod(operationName = "Get_Performance_And_Seats", action = "urn:PFTMX#PFT_server#Get_Performance_And_Seats")
    @WebResult(name = "Get_Performance_And_Seats", targetNamespace = "urn:PFTMX")
    public String get_Performance_And_Seats(
        @WebParam(name = "ac", targetNamespace = "urn:PFTMX")
        String ac,
        @WebParam(name = "pw", targetNamespace = "urn:PFTMX")
        String pw,
        @WebParam(name = "begintime", targetNamespace = "urn:PFTMX")
        String begintime,
        @WebParam(name = "endtime", targetNamespace = "urn:PFTMX")
        String endtime);

    @WebMethod(operationName = "reSend_SMS_Global_PL", action = "urn:PFTMX#PFT_server#reSend_SMS_Global_PL")
    @WebResult(name = "reSend_SMS_Global_PL", targetNamespace = "urn:PFTMX")
    public String reSend_SMS_Global_PL(
        @WebParam(name = "ac", targetNamespace = "urn:PFTMX")
        String ac,
        @WebParam(name = "pw", targetNamespace = "urn:PFTMX")
        String pw,
        @WebParam(name = "ordern", targetNamespace = "urn:PFTMX")
        String ordern,
        @WebParam(name = "m", targetNamespace = "urn:PFTMX")
        String m);

    @WebMethod(operationName = "PFT_Member_Fund", action = "urn:PFTMX#PFT_server#PFT_Member_Fund")
    @WebResult(name = "PFT_Member_Fund", targetNamespace = "urn:PFTMX")
    public String pFT_Member_Fund(
        @WebParam(name = "ac", targetNamespace = "urn:PFTMX")
        String ac,
        @WebParam(name = "pw", targetNamespace = "urn:PFTMX")
        String pw,
        @WebParam(name = "dtype", targetNamespace = "urn:PFTMX")
        String dtype,
        @WebParam(name = "aid", targetNamespace = "urn:PFTMX")
        String aid);

    @WebMethod(operationName = "Dynamic_Price_And_Storage", action = "urn:PFTMX#PFT_server#Dynamic_Price_And_Storage")
    @WebResult(name = "Dynamic_Price_And_Storage", targetNamespace = "urn:PFTMX")
    public String dynamic_Price_And_Storage(
        @WebParam(name = "ac", targetNamespace = "urn:PFTMX")
        String ac,
        @WebParam(name = "pw", targetNamespace = "urn:PFTMX")
        String pw,
        @WebParam(name = "pid", targetNamespace = "urn:PFTMX")
        String pid,
        @WebParam(name = "date", targetNamespace = "urn:PFTMX")
        String date,
        @WebParam(name = "mode", targetNamespace = "urn:PFTMX")
        String mode,
        @WebParam(name = "ptype", targetNamespace = "urn:PFTMX")
        String ptype,
        @WebParam(name = "get_storage", targetNamespace = "urn:PFTMX")
        String get_storage,
        @WebParam(name = "m", targetNamespace = "urn:PFTMX")
        String m);

    @WebMethod(operationName = "PFT_Member_Relationship", action = "urn:PFTMX#PFT_server#PFT_Member_Relationship")
    @WebResult(name = "PFT_Member_Relationship", targetNamespace = "urn:PFTMX")
    public String pFT_Member_Relationship(
        @WebParam(name = "ac", targetNamespace = "urn:PFTMX")
        String ac,
        @WebParam(name = "pw", targetNamespace = "urn:PFTMX")
        String pw,
        @WebParam(name = "n", targetNamespace = "urn:PFTMX")
        String n,
        @WebParam(name = "m", targetNamespace = "urn:PFTMX")
        String m);

    @WebMethod(operationName = "Terminal_Code_Verify", action = "urn:PFTMX#PFT_server#Terminal_Code_Verify")
    @WebResult(name = "Terminal_Code_Verify", targetNamespace = "urn:PFTMX")
    public String terminal_Code_Verify(
        @WebParam(name = "ac", targetNamespace = "urn:PFTMX")
        String ac,
        @WebParam(name = "pw", targetNamespace = "urn:PFTMX")
        String pw,
        @WebParam(name = "ordern", targetNamespace = "urn:PFTMX")
        String ordern,
        @WebParam(name = "m", targetNamespace = "urn:PFTMX")
        String m);

    @WebMethod(operationName = "PFT_Order_Submit", action = "urn:PFTMX#PFT_server#PFT_Order_Submit")
    @WebResult(name = "PFT_Order_Submit", targetNamespace = "urn:PFTMX")
    public String pFT_Order_Submit(
        @WebParam(name = "ac", targetNamespace = "urn:PFTMX")
        String ac,
        @WebParam(name = "pw", targetNamespace = "urn:PFTMX")
        String pw,
        @WebParam(name = "lid", targetNamespace = "urn:PFTMX")
        String lid,
        @WebParam(name = "tid", targetNamespace = "urn:PFTMX")
        String tid,
        @WebParam(name = "remotenum", targetNamespace = "urn:PFTMX")
        String remotenum,
        @WebParam(name = "tprice", targetNamespace = "urn:PFTMX")
        String tprice,
        @WebParam(name = "tnum", targetNamespace = "urn:PFTMX")
        String tnum,
        @WebParam(name = "playtime", targetNamespace = "urn:PFTMX")
        String playtime,
        @WebParam(name = "ordername", targetNamespace = "urn:PFTMX")
        String ordername,
        @WebParam(name = "ordertel", targetNamespace = "urn:PFTMX")
        String ordertel,
        @WebParam(name = "contactTEL", targetNamespace = "urn:PFTMX")
        String contactTEL,
        @WebParam(name = "smsSend", targetNamespace = "urn:PFTMX")
        String smsSend,
        @WebParam(name = "paymode", targetNamespace = "urn:PFTMX")
        String paymode,
        @WebParam(name = "ordermode", targetNamespace = "urn:PFTMX")
        String ordermode,
        @WebParam(name = "assembly", targetNamespace = "urn:PFTMX")
        String assembly,
        @WebParam(name = "series", targetNamespace = "urn:PFTMX")
        String series,
        @WebParam(name = "concatID", targetNamespace = "urn:PFTMX")
        String concatID,
        @WebParam(name = "pCode", targetNamespace = "urn:PFTMX")
        String pCode,
        @WebParam(name = "m", targetNamespace = "urn:PFTMX")
        String m,
        @WebParam(name = "personID", targetNamespace = "urn:PFTMX")
        String personID,
        @WebParam(name = "preferuuid", targetNamespace = "urn:PFTMX")
        String preferuuid,
        @WebParam(name = "p_start", targetNamespace = "urn:PFTMX")
        String p_start,
        @WebParam(name = "p_end", targetNamespace = "urn:PFTMX")
        String p_end);

    @WebMethod(operationName = "Get_ScenicSpot_Info", action = "urn:PFTMX#PFT_server#Get_ScenicSpot_Info")
    @WebResult(name = "Get_ScenicSpot_Info", targetNamespace = "urn:PFTMX")
    public String get_ScenicSpot_Info(
        @WebParam(name = "ac", targetNamespace = "urn:PFTMX")
        String ac,
        @WebParam(name = "pw", targetNamespace = "urn:PFTMX")
        String pw,
        @WebParam(name = "n", targetNamespace = "urn:PFTMX")
        String n);

    @WebMethod(operationName = "Get_ScenicSpot_List", action = "urn:PFTMX#PFT_server#Get_ScenicSpot_List")
    @WebResult(name = "Get_ScenicSpot_List", targetNamespace = "urn:PFTMX")
    public String get_ScenicSpot_List(
        @WebParam(name = "ac", targetNamespace = "urn:PFTMX")
        String ac,
        @WebParam(name = "pw", targetNamespace = "urn:PFTMX")
        String pw,
        @WebParam(name = "n", targetNamespace = "urn:PFTMX")
        String n,
        @WebParam(name = "m", targetNamespace = "urn:PFTMX")
        String m);

    @WebMethod(operationName = "Get_Ticket_List", action = "urn:PFTMX#PFT_server#Get_Ticket_List")
    @WebResult(name = "Get_Ticket_List", targetNamespace = "urn:PFTMX")
    public String get_Ticket_List(
        @WebParam(name = "ac", targetNamespace = "urn:PFTMX")
        String ac,
        @WebParam(name = "pw", targetNamespace = "urn:PFTMX")
        String pw,
        @WebParam(name = "n", targetNamespace = "urn:PFTMX")
        String n,
        @WebParam(name = "m", targetNamespace = "urn:PFTMX")
        String m);

    @WebMethod(operationName = "Send_SMS_System_Fee", action = "urn:PFTMX#PFT_server#Send_SMS_System_Fee")
    @WebResult(name = "Send_SMS_System_Fee", targetNamespace = "urn:PFTMX")
    public String send_SMS_System_Fee(
        @WebParam(name = "ac", targetNamespace = "urn:PFTMX")
        String ac,
        @WebParam(name = "pw", targetNamespace = "urn:PFTMX")
        String pw,
        @WebParam(name = "tel", targetNamespace = "urn:PFTMX")
        String tel,
        @WebParam(name = "msg", targetNamespace = "urn:PFTMX")
        String msg,
        @WebParam(name = "m", targetNamespace = "urn:PFTMX")
        String m);

    @WebMethod(operationName = "Order_Globle_Search", action = "urn:PFTMX#PFT_server#Order_Globle_Search")
    @WebResult(name = "Order_Globle_Search", targetNamespace = "urn:PFTMX")
    public String order_Globle_Search(
        @WebParam(name = "ac", targetNamespace = "urn:PFTMX")
        String ac,
        @WebParam(name = "pw", targetNamespace = "urn:PFTMX")
        String pw,
        @WebParam(name = "sid", targetNamespace = "urn:PFTMX")
        String sid,
        @WebParam(name = "mid", targetNamespace = "urn:PFTMX")
        String mid,
        @WebParam(name = "aid", targetNamespace = "urn:PFTMX")
        String aid,
        @WebParam(name = "tid", targetNamespace = "urn:PFTMX")
        String tid,
        @WebParam(name = "ltitle", targetNamespace = "urn:PFTMX")
        String ltitle,
        @WebParam(name = "ttitle", targetNamespace = "urn:PFTMX")
        String ttitle,
        @WebParam(name = "btime1", targetNamespace = "urn:PFTMX")
        String btime1,
        @WebParam(name = "etime1", targetNamespace = "urn:PFTMX")
        String etime1,
        @WebParam(name = "btime2", targetNamespace = "urn:PFTMX")
        String btime2,
        @WebParam(name = "etime2", targetNamespace = "urn:PFTMX")
        String etime2,
        @WebParam(name = "btime3", targetNamespace = "urn:PFTMX")
        String btime3,
        @WebParam(name = "etime3", targetNamespace = "urn:PFTMX")
        String etime3,
        @WebParam(name = "ordernum", targetNamespace = "urn:PFTMX")
        String ordernum,
        @WebParam(name = "remotenum", targetNamespace = "urn:PFTMX")
        String remotenum,
        @WebParam(name = "oname", targetNamespace = "urn:PFTMX")
        String oname,
        @WebParam(name = "otel", targetNamespace = "urn:PFTMX")
        String otel,
        @WebParam(name = "status", targetNamespace = "urn:PFTMX")
        String status,
        @WebParam(name = "pays", targetNamespace = "urn:PFTMX")
        String pays,
        @WebParam(name = "orderby", targetNamespace = "urn:PFTMX")
        String orderby,
        @WebParam(name = "sort", targetNamespace = "urn:PFTMX")
        String sort,
        @WebParam(name = "rstart", targetNamespace = "urn:PFTMX")
        String rstart,
        @WebParam(name = "n", targetNamespace = "urn:PFTMX")
        String n,
        @WebParam(name = "c", targetNamespace = "urn:PFTMX")
        String c,
        @WebParam(name = "contactTEL", targetNamespace = "urn:PFTMX")
        String contactTEL,
        @WebParam(name = "payinfo", targetNamespace = "urn:PFTMX")
        String payinfo,
        @WebParam(name = "p_type", targetNamespace = "urn:PFTMX")
        String p_type,
        @WebParam(name = "ordertype", targetNamespace = "urn:PFTMX")
        String ordertype,
        @WebParam(name = "concat", targetNamespace = "urn:PFTMX")
        String concat,
        @WebParam(name = "ifpack", targetNamespace = "urn:PFTMX")
        String ifpack,
        @WebParam(name = "m", targetNamespace = "urn:PFTMX")
        String m);

    @WebMethod(operationName = "authrize", action = "urn:PFTMX#PFT_server#authrize")
    @WebResult(name = "authrize", targetNamespace = "urn:PFTMX")
    public String authrize(
        @WebParam(name = "ac", targetNamespace = "urn:PFTMX")
        String ac,
        @WebParam(name = "pw", targetNamespace = "urn:PFTMX")
        String pw);

}
