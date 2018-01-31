
package com.xiexie.ticket.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.xiexie.ticket.webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetElementRequest_QNAME = new QName("http://webservice.ticket.xiexie.com/", "getElementRequest");
    private final static QName _GetElementRequestResponse_QNAME = new QName("http://webservice.ticket.xiexie.com/", "getElementRequestResponse");
    private final static QName _IllegalBlockSizeException_QNAME = new QName("http://webservice.ticket.xiexie.com/", "IllegalBlockSizeException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.xiexie.ticket.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetElementRequestResponse }
     * 
     */
    public GetElementRequestResponse createGetElementRequestResponse() {
        return new GetElementRequestResponse();
    }

    /**
     * Create an instance of {@link GetElementRequest }
     * 
     */
    public GetElementRequest createGetElementRequest() {
        return new GetElementRequest();
    }

    /**
     * Create an instance of {@link IllegalBlockSizeException }
     * 
     */
    public IllegalBlockSizeException createIllegalBlockSizeException() {
        return new IllegalBlockSizeException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetElementRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.ticket.xiexie.com/", name = "getElementRequest")
    public JAXBElement<GetElementRequest> createGetElementRequest(GetElementRequest value) {
        return new JAXBElement<GetElementRequest>(_GetElementRequest_QNAME, GetElementRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetElementRequestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.ticket.xiexie.com/", name = "getElementRequestResponse")
    public JAXBElement<GetElementRequestResponse> createGetElementRequestResponse(GetElementRequestResponse value) {
        return new JAXBElement<GetElementRequestResponse>(_GetElementRequestResponse_QNAME, GetElementRequestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IllegalBlockSizeException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.ticket.xiexie.com/", name = "IllegalBlockSizeException")
    public JAXBElement<IllegalBlockSizeException> createIllegalBlockSizeException(IllegalBlockSizeException value) {
        return new JAXBElement<IllegalBlockSizeException>(_IllegalBlockSizeException_QNAME, IllegalBlockSizeException.class, null, value);
    }

}
