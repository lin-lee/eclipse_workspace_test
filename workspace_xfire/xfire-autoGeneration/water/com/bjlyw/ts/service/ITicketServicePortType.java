
package com.bjlyw.ts.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name = "ITicketServicePortType", targetNamespace = "http://service.ts.bjlyw.com")
@SOAPBinding(use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public interface ITicketServicePortType {


    @WebMethod(operationName = "getProductInfo", action = "")
    @WebResult(name = "out", targetNamespace = "http://service.ts.bjlyw.com")
    public String getProductInfo(
        @WebParam(name = "organization", targetNamespace = "http://service.ts.bjlyw.com")
        String organization,
        @WebParam(name = "xml", targetNamespace = "http://service.ts.bjlyw.com")
        String xml);

    @WebMethod(operationName = "getEleInterface", action = "")
    @WebResult(name = "out", targetNamespace = "http://service.ts.bjlyw.com")
    public String getEleInterface(
        @WebParam(name = "organization", targetNamespace = "http://service.ts.bjlyw.com")
        String organization,
        @WebParam(name = "xml", targetNamespace = "http://service.ts.bjlyw.com")
        String xml);

}
