
package cn;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import com.ticket.webservice.ResultCancelTicket;

@WebService(name = "CancelTicket", targetNamespace = "http://webservice.ticket.com/")
@SOAPBinding(use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public interface CancelTicket {


    @WebMethod(operationName = "cancelTicket", action = "")
    @WebResult(name = "return", targetNamespace = "")
    public ResultCancelTicket cancelTicket(
        @WebParam(name = "AgentOrderID", targetNamespace = "")
        String AgentOrderID,
        @WebParam(name = "AgentID", targetNamespace = "")
        String AgentID,
        @WebParam(name = "AgentPassword", targetNamespace = "")
        String AgentPassword,
        @WebParam(name = "CompanyID", targetNamespace = "")
        String CompanyID,
        @WebParam(name = "OrderName", targetNamespace = "")
        String OrderName,
        @WebParam(name = "OrderPhoneNumber", targetNamespace = "")
        String OrderPhoneNumber,
        @WebParam(name = "PayFlag", targetNamespace = "")
        String PayFlag);

}
