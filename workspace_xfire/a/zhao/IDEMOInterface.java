
package zhao;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name = "IDEMOInterface", targetNamespace = "http://tempuri.org/")
@SOAPBinding(style = SOAPBinding.Style.RPC, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface IDEMOInterface {


    @WebMethod(operationName = "DEMO_ReturnTicket", action = "urn:DEMOInterfaceIntf-IDEMOInterface#DEMO_ReturnTicket")
    @WebResult(name = "return", targetNamespace = "http://tempuri.org/")
    public String dEMO_ReturnTicket(
        @WebParam(name = "ParamInfo", targetNamespace = "http://tempuri.org/")
        String ParamInfo);

    @WebMethod(operationName = "DEMO_CreateOrderInfo", action = "urn:DEMOInterfaceIntf-IDEMOInterface#DEMO_CreateOrderInfo")
    @WebResult(name = "return", targetNamespace = "http://tempuri.org/")
    public String dEMO_CreateOrderInfo(
        @WebParam(name = "ParamInfo", targetNamespace = "http://tempuri.org/")
        String ParamInfo);

    @WebMethod(operationName = "DEMO_OrderTakeTicket", action = "urn:DEMOInterfaceIntf-IDEMOInterface#DEMO_OrderTakeTicket")
    @WebResult(name = "return", targetNamespace = "http://tempuri.org/")
    public String dEMO_OrderTakeTicket(
        @WebParam(name = "ParamInfo", targetNamespace = "http://tempuri.org/")
        String ParamInfo);

    @WebMethod(operationName = "DEMO_RegTerminal", action = "urn:DEMOInterfaceIntf-IDEMOInterface#DEMO_RegTerminal")
    @WebResult(name = "return", targetNamespace = "http://tempuri.org/")
    public String dEMO_RegTerminal(
        @WebParam(name = "ParamInfo", targetNamespace = "http://tempuri.org/")
        String ParamInfo);

    @WebMethod(operationName = "DEMO_GetAllTicketType", action = "urn:DEMOInterfaceIntf-IDEMOInterface#DEMO_GetAllTicketType")
    @WebResult(name = "return", targetNamespace = "http://tempuri.org/")
    public String dEMO_GetAllTicketType(
        @WebParam(name = "ParamInfo", targetNamespace = "http://tempuri.org/")
        String ParamInfo);

    @WebMethod(operationName = "DEMO_OrderStatusQuery", action = "urn:DEMOInterfaceIntf-IDEMOInterface#DEMO_OrderStatusQuery")
    @WebResult(name = "return", targetNamespace = "http://tempuri.org/")
    public String dEMO_OrderStatusQuery(
        @WebParam(name = "ParamInfo", targetNamespace = "http://tempuri.org/")
        String ParamInfo);

    @WebMethod(operationName = "DEMO_QueryOrderInfo", action = "urn:DEMOInterfaceIntf-IDEMOInterface#DEMO_QueryOrderInfo")
    @WebResult(name = "return", targetNamespace = "http://tempuri.org/")
    public String dEMO_QueryOrderInfo(
        @WebParam(name = "ParamInfo", targetNamespace = "http://tempuri.org/")
        String ParamInfo);

    @WebMethod(operationName = "DEMO_CancelOrderInfo", action = "urn:DEMOInterfaceIntf-IDEMOInterface#DEMO_CancelOrderInfo")
    @WebResult(name = "return", targetNamespace = "http://tempuri.org/")
    public String dEMO_CancelOrderInfo(
        @WebParam(name = "ParamInfo", targetNamespace = "http://tempuri.org/")
        String ParamInfo);

    @WebMethod(operationName = "DEMO_SearchTerminal", action = "urn:DEMOInterfaceIntf-IDEMOInterface#DEMO_SearchTerminal")
    @WebResult(name = "return", targetNamespace = "http://tempuri.org/")
    public String dEMO_SearchTerminal(
        @WebParam(name = "ParamInfo", targetNamespace = "http://tempuri.org/")
        String ParamInfo);

    @WebMethod(operationName = "DEMO_QueryAllTicketType", action = "urn:DEMOInterfaceIntf-IDEMOInterface#DEMO_QueryAllTicketType")
    @WebResult(name = "return", targetNamespace = "http://tempuri.org/")
    public String dEMO_QueryAllTicketType(
        @WebParam(name = "ParamInfo", targetNamespace = "http://tempuri.org/")
        String ParamInfo);

    @WebMethod(operationName = "DEMO_GetAllTicketTypeNoDate", action = "urn:DEMOInterfaceIntf-IDEMOInterface#DEMO_GetAllTicketTypeNoDate")
    @WebResult(name = "return", targetNamespace = "http://tempuri.org/")
    public String dEMO_GetAllTicketTypeNoDate(
        @WebParam(name = "ParamInfo", targetNamespace = "http://tempuri.org/")
        String ParamInfo);

    @WebMethod(operationName = "DEMO_GetOrgAgreementPrice", action = "urn:DEMOInterfaceIntf-IDEMOInterface#DEMO_GetOrgAgreementPrice")
    @WebResult(name = "return", targetNamespace = "http://tempuri.org/")
    public String dEMO_GetOrgAgreementPrice(
        @WebParam(name = "ParamInfo", targetNamespace = "http://tempuri.org/")
        String ParamInfo);

    @WebMethod(operationName = "DEMO_GetAllOrganization", action = "urn:DEMOInterfaceIntf-IDEMOInterface#DEMO_GetAllOrganization")
    @WebResult(name = "return", targetNamespace = "http://tempuri.org/")
    public String dEMO_GetAllOrganization();

}
