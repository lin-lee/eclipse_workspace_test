
package com.bjlyw.ts.service;

import javax.jws.WebService;

@WebService(serviceName = "ITicketService", targetNamespace = "http://service.ts.bjlyw.com", endpointInterface = "com.bjlyw.ts.service.ITicketServicePortType")
public class ITicketServiceImpl
    implements ITicketServicePortType
{


    public String getProductInfo(String organization, String xml) {
        throw new UnsupportedOperationException();
    }

    public String getEleInterface(String organization, String xml) {
        throw new UnsupportedOperationException();
    }

}
