
package com.lvmama.vst.passport.processor.dinosaurtown.n;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name = "DistributorSDK4ReportSoap", targetNamespace = "http://tempuri.org/")
@SOAPBinding(use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public interface DistributorSDK4ReportSoap {


    @WebMethod(operationName = "PostSearchBalance", action = "http://tempuri.org/PostSearchBalance")
    @WebResult(name = "PostSearchBalanceResult", targetNamespace = "http://tempuri.org/")
    public String postSearchBalance(
        @WebParam(name = "strPartnerCode", targetNamespace = "http://tempuri.org/")
        String strPartnerCode,
        @WebParam(name = "strSignature", targetNamespace = "http://tempuri.org/")
        String strSignature,
        @WebParam(name = "strPayWay", targetNamespace = "http://tempuri.org/")
        int strPayWay);

    @WebMethod(operationName = "PostOrdersProducts", action = "http://tempuri.org/PostOrdersProducts")
    @WebResult(name = "PostOrdersProductsResult", targetNamespace = "http://tempuri.org/")
    public String postOrdersProducts(
        @WebParam(name = "strPartnerCode", targetNamespace = "http://tempuri.org/")
        String strPartnerCode,
        @WebParam(name = "strSignature", targetNamespace = "http://tempuri.org/")
        String strSignature,
        @WebParam(name = "Customer", targetNamespace = "http://tempuri.org/")
        SDKCustomerInfo Customer,
        @WebParam(name = "OrderProduct", targetNamespace = "http://tempuri.org/")
        InsertProductInfo OrderProduct,
        @WebParam(name = "refNo", targetNamespace = "http://tempuri.org/")
        String refNo);

    @WebMethod(operationName = "SearchOrderInfoByOrderNo", action = "http://tempuri.org/SearchOrderInfoByOrderNo")
    @WebResult(name = "SearchOrderInfoByOrderNoResult", targetNamespace = "http://tempuri.org/")
    public ArrayOfKProductOrder searchOrderInfoByOrderNo(
        @WebParam(name = "strOrderNo", targetNamespace = "http://tempuri.org/")
        String strOrderNo);

    @WebMethod(operationName = "GetProductsInfoByTime", action = "http://tempuri.org/GetProductsInfoByTime")
    @WebResult(name = "GetProductsInfoByTimeResult", targetNamespace = "http://tempuri.org/")
    public ArrayOfSDKProductsInfo getProductsInfoByTime(
        @WebParam(name = "MerchantCode", targetNamespace = "http://tempuri.org/")
        String MerchantCode,
        @WebParam(name = "StartTime", targetNamespace = "http://tempuri.org/")
        String StartTime,
        @WebParam(name = "EndTime", targetNamespace = "http://tempuri.org/")
        String EndTime,
        @WebParam(name = "Signature", targetNamespace = "http://tempuri.org/")
        String Signature);

}
