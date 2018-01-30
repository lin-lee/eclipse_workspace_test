
package com;

import javax.jws.WebService;

@WebService(serviceName = "PFTMX", targetNamespace = "urn:PFTMX", endpointInterface = "com.PFTMXPort")
public class PFTMXImpl
    implements PFTMXPort
{


    public String order_Change_Pro(String ac, String pw, String ordern, String num, String ordertel, String m) {
        throw new UnsupportedOperationException();
    }

    public String get_Performance_And_Seats(String ac, String pw, String begintime, String endtime) {
        throw new UnsupportedOperationException();
    }

    public String reSend_SMS_Global_PL(String ac, String pw, String ordern, String m) {
        throw new UnsupportedOperationException();
    }

    public String pFT_Member_Fund(String ac, String pw, String dtype, String aid) {
        throw new UnsupportedOperationException();
    }

    public String dynamic_Price_And_Storage(String ac, String pw, String pid, String date, String mode, String ptype, String get_storage, String m) {
        throw new UnsupportedOperationException();
    }

    public String pFT_Member_Relationship(String ac, String pw, String n, String m) {
        throw new UnsupportedOperationException();
    }

    public String terminal_Code_Verify(String ac, String pw, String ordern, String m) {
        throw new UnsupportedOperationException();
    }

    public String pFT_Order_Submit(String ac, String pw, String lid, String tid, String remotenum, String tprice, String tnum, String playtime, String ordername, String ordertel, String contactTEL, String smsSend, String paymode, String ordermode, String assembly, String series, String concatID, String pCode, String m, String personID, String preferuuid, String p_start, String p_end) {
        throw new UnsupportedOperationException();
    }

    public String get_ScenicSpot_Info(String ac, String pw, String n) {
        throw new UnsupportedOperationException();
    }

    public String get_ScenicSpot_List(String ac, String pw, String n, String m) {
        throw new UnsupportedOperationException();
    }

    public String get_Ticket_List(String ac, String pw, String n, String m) {
        throw new UnsupportedOperationException();
    }

    public String send_SMS_System_Fee(String ac, String pw, String tel, String msg, String m) {
        throw new UnsupportedOperationException();
    }

    public String order_Globle_Search(String ac, String pw, String sid, String mid, String aid, String tid, String ltitle, String ttitle, String btime1, String etime1, String btime2, String etime2, String btime3, String etime3, String ordernum, String remotenum, String oname, String otel, String status, String pays, String orderby, String sort, String rstart, String n, String c, String contactTEL, String payinfo, String p_type, String ordertype, String concat, String ifpack, String m) {
        throw new UnsupportedOperationException();
    }

    public String authrize(String ac, String pw) {
        throw new UnsupportedOperationException();
    }

}
