
package taian;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name = "TicketInfoServiceSoap", targetNamespace = "http://localhost")
@SOAPBinding(use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public interface TicketInfoServiceSoap {


    @WebMethod(operationName = "GetTicketPriceList", action = "http://localhost/GetTicketPriceList")
    @WebResult(name = "GetTicketPriceListResult", targetNamespace = "http://localhost")
    public String getTicketPriceList(
        @WebParam(name = "sInputInfo", targetNamespace = "http://localhost")
        String sInputInfo);

    @WebMethod(operationName = "PartialOrderCancel", action = "http://localhost/PartialOrderCancel")
    @WebResult(name = "PartialOrderCancelResult", targetNamespace = "http://localhost")
    public String partialOrderCancel(
        @WebParam(name = "sInputInfo", targetNamespace = "http://localhost")
        String sInputInfo);

    @WebMethod(operationName = "GetCheckList", action = "http://localhost/GetCheckList")
    @WebResult(name = "GetCheckListResult", targetNamespace = "http://localhost")
    public String getCheckList(
        @WebParam(name = "sInputInfo", targetNamespace = "http://localhost")
        String sInputInfo);

    @WebMethod(operationName = "GetPromotionPriceList", action = "http://localhost/GetPromotionPriceList")
    @WebResult(name = "GetPromotionPriceListResult", targetNamespace = "http://localhost")
    public String getPromotionPriceList(
        @WebParam(name = "sInputInfo", targetNamespace = "http://localhost")
        String sInputInfo);

    @WebMethod(operationName = "CancelOrder", action = "http://localhost/CancelOrder")
    @WebResult(name = "CancelOrderResult", targetNamespace = "http://localhost")
    public String cancelOrder(
        @WebParam(name = "sInputInfo", targetNamespace = "http://localhost")
        String sInputInfo);

    @WebMethod(operationName = "SaveOrder", action = "http://localhost/SaveOrder")
    @WebResult(name = "SaveOrderResult", targetNamespace = "http://localhost")
    public String saveOrder(
        @WebParam(name = "sInputInfo", targetNamespace = "http://localhost")
        String sInputInfo);

    @WebMethod(operationName = "GetBookList", action = "http://localhost/GetBookList")
    @WebResult(name = "GetBookListResult", targetNamespace = "http://localhost")
    public String getBookList(
        @WebParam(name = "sInputInfo", targetNamespace = "http://localhost")
        String sInputInfo);

    @WebMethod(operationName = "GetSaleList", action = "http://localhost/GetSaleList")
    @WebResult(name = "GetSaleListResult", targetNamespace = "http://localhost")
    public String getSaleList(
        @WebParam(name = "sInputInfo", targetNamespace = "http://localhost")
        String sInputInfo);

}
