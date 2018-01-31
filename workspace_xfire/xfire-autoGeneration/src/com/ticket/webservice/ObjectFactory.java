
package com.ticket.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ticket.webservice package. 
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

    private final static QName _QueryTicketEntranceResponse_QNAME = new QName("http://webservice.ticket.com/", "queryTicketEntranceResponse");
    private final static QName _QueryTicketEntrance_QNAME = new QName("http://webservice.ticket.com/", "queryTicketEntrance");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ticket.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryTicketEntrance }
     * 
     */
    public QueryTicketEntrance createQueryTicketEntrance() {
        return new QueryTicketEntrance();
    }

    /**
     * Create an instance of {@link ResultQueryTicketType }
     * 
     */
    public ResultQueryTicketType createResultQueryTicketType() {
        return new ResultQueryTicketType();
    }

    /**
     * Create an instance of {@link QueryTicketEntranceResponse }
     * 
     */
    public QueryTicketEntranceResponse createQueryTicketEntranceResponse() {
        return new QueryTicketEntranceResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryTicketEntranceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.ticket.com/", name = "queryTicketEntranceResponse")
    public JAXBElement<QueryTicketEntranceResponse> createQueryTicketEntranceResponse(QueryTicketEntranceResponse value) {
        return new JAXBElement<QueryTicketEntranceResponse>(_QueryTicketEntranceResponse_QNAME, QueryTicketEntranceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryTicketEntrance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.ticket.com/", name = "queryTicketEntrance")
    public JAXBElement<QueryTicketEntrance> createQueryTicketEntrance(QueryTicketEntrance value) {
        return new JAXBElement<QueryTicketEntrance>(_QueryTicketEntrance_QNAME, QueryTicketEntrance.class, null, value);
    }

}
