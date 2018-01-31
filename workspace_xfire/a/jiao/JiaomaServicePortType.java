
package testJiao;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name = "JiaomaServicePortType", targetNamespace = "http://www.jiaomalvyou.com/soap/JiaomaService")
@SOAPBinding(style = SOAPBinding.Style.RPC, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface JiaomaServicePortType {


    @WebMethod(operationName = "add_order_by_web", action = "http://www.jiaomalvyou.com/soap/jq_wsdl.php/add_order_by_web")
    @WebResult(name = "return", targetNamespace = "http://www.jiaomalvyou.com/soap/JiaomaService")
    public String add_order_by_web(
        @WebParam(name = "user_md5", targetNamespace = "http://www.jiaomalvyou.com/soap/JiaomaService")
        String user_md5,
        @WebParam(name = "wai_order_id", targetNamespace = "http://www.jiaomalvyou.com/soap/JiaomaService")
        String wai_order_id,
        @WebParam(name = "ar_id", targetNamespace = "http://www.jiaomalvyou.com/soap/JiaomaService")
        String ar_id,
        @WebParam(name = "username", targetNamespace = "http://www.jiaomalvyou.com/soap/JiaomaService")
        String username,
        @WebParam(name = "usertel", targetNamespace = "http://www.jiaomalvyou.com/soap/JiaomaService")
        String usertel,
        @WebParam(name = "od_num", targetNamespace = "http://www.jiaomalvyou.com/soap/JiaomaService")
        String od_num,
        @WebParam(name = "od_amount", targetNamespace = "http://www.jiaomalvyou.com/soap/JiaomaService")
        String od_amount,
        @WebParam(name = "od_date", targetNamespace = "http://www.jiaomalvyou.com/soap/JiaomaService")
        String od_date,
        @WebParam(name = "user_id", targetNamespace = "http://www.jiaomalvyou.com/soap/JiaomaService")
        String user_id);

    @WebMethod(operationName = "get_data", action = "http://www.jiaomalvyou.com/soap/jq_wsdl.php/get_data")
    @WebResult(name = "return", targetNamespace = "http://www.jiaomalvyou.com/soap/JiaomaService")
    public String get_data(
        @WebParam(name = "user_md5", targetNamespace = "http://www.jiaomalvyou.com/soap/JiaomaService")
        String user_md5,
        @WebParam(name = "yesno_tp", targetNamespace = "http://www.jiaomalvyou.com/soap/JiaomaService")
        String yesno_tp,
        @WebParam(name = "num", targetNamespace = "http://www.jiaomalvyou.com/soap/JiaomaService")
        String num);

    @WebMethod(operationName = "get_order_data", action = "http://www.jiaomalvyou.com/soap/jq_wsdl.php/get_order_data")
    @WebResult(name = "return", targetNamespace = "http://www.jiaomalvyou.com/soap/JiaomaService")
    public String get_order_data(
        @WebParam(name = "user_md5", targetNamespace = "http://www.jiaomalvyou.com/soap/JiaomaService")
        String user_md5,
        @WebParam(name = "user_id", targetNamespace = "http://www.jiaomalvyou.com/soap/JiaomaService")
        String user_id);

    @WebMethod(operationName = "get_jq_data", action = "http://www.jiaomalvyou.com/soap/jq_wsdl.php/get_jq_data")
    @WebResult(name = "return", targetNamespace = "http://www.jiaomalvyou.com/soap/JiaomaService")
    public String get_jq_data(
        @WebParam(name = "user_md5", targetNamespace = "http://www.jiaomalvyou.com/soap/JiaomaService")
        String user_md5,
        @WebParam(name = "ar_id", targetNamespace = "http://www.jiaomalvyou.com/soap/JiaomaService")
        String ar_id);

    @WebMethod(operationName = "del_order_by_web", action = "http://www.jiaomalvyou.com/soap/jq_wsdl.php/del_order_by_web")
    @WebResult(name = "return", targetNamespace = "http://www.jiaomalvyou.com/soap/JiaomaService")
    public String del_order_by_web(
        @WebParam(name = "user_md5", targetNamespace = "http://www.jiaomalvyou.com/soap/JiaomaService")
        String user_md5,
        @WebParam(name = "user_id", targetNamespace = "http://www.jiaomalvyou.com/soap/JiaomaService")
        String user_id,
        @WebParam(name = "wai_order_id", targetNamespace = "http://www.jiaomalvyou.com/soap/JiaomaService")
        String wai_order_id);

    @WebMethod(operationName = "get_order_by_order_id", action = "http://www.jiaomalvyou.com/soap/jq_wsdl.php/get_order_by_order_id")
    @WebResult(name = "return", targetNamespace = "http://www.jiaomalvyou.com/soap/JiaomaService")
    public String get_order_by_order_id(
        @WebParam(name = "user_md5", targetNamespace = "http://www.jiaomalvyou.com/soap/JiaomaService")
        String user_md5,
        @WebParam(name = "user_id", targetNamespace = "http://www.jiaomalvyou.com/soap/JiaomaService")
        String user_id,
        @WebParam(name = "order_id", targetNamespace = "http://www.jiaomalvyou.com/soap/JiaomaService")
        String order_id);

}
