
package com;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import com.ticket.webservice.ResultQueryTicketType;

@WebService(name = "QueryTicketEntrance", targetNamespace = "http://webservice.ticket.com/")
@SOAPBinding(use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public interface QueryTicketEntrance {


    @WebMethod(operationName = "queryTicketEntrance", action = "")
    @WebResult(name = "return", targetNamespace = "")
    public ResultQueryTicketType queryTicketEntrance(
        @WebParam(name = "AgentID", targetNamespace = "")
        String AgentID,
        @WebParam(name = "AgentPassword", targetNamespace = "")
        String AgentPassword,
        @WebParam(name = "CompanyID", targetNamespace = "")
        String CompanyID,
        @WebParam(name = "OrderId", targetNamespace = "")
        String OrderId,
        @WebParam(name = "EntranceTimeStart", targetNamespace = "")
        String EntranceTimeStart,
        @WebParam(name = "EntranceTimeEnd", targetNamespace = "")
        String EntranceTimeEnd);

}
