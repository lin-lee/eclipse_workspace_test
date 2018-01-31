
package testJiao;

import javax.jws.WebService;

@WebService(serviceName = "JiaomaService", targetNamespace = "http://www.jiaomalvyou.com/soap/JiaomaService", endpointInterface = "testJiao.JiaomaServicePortType")
public class JiaomaServiceImpl
    implements JiaomaServicePortType
{


    public String add_order_by_web(String user_md5, String wai_order_id, String ar_id, String username, String usertel, String od_num, String od_amount, String od_date, String user_id) {
        throw new UnsupportedOperationException();
    }

    public String get_data(String user_md5, String yesno_tp, String num) {
        throw new UnsupportedOperationException();
    }

    public String get_order_data(String user_md5, String user_id) {
        throw new UnsupportedOperationException();
    }

    public String get_jq_data(String user_md5, String ar_id) {
        throw new UnsupportedOperationException();
    }

    public String del_order_by_web(String user_md5, String user_id, String wai_order_id) {
        throw new UnsupportedOperationException();
    }

    public String get_order_by_order_id(String user_md5, String user_id, String order_id) {
        throw new UnsupportedOperationException();
    }

}
