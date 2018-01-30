
package com.lvmama.vst.passport.processor.dinosaurtown.n;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
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

    private final static QName _String_QNAME = new QName("http://tempuri.org/", "string");
    private final static QName _ArrayOfKProductOrder_QNAME = new QName("http://tempuri.org/", "ArrayOfK_ProductOrder");
    private final static QName _ArrayOfSDKProductsInfo_QNAME = new QName("http://tempuri.org/", "ArrayOfSDKProductsInfo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsertProductInfo }
     * 
     */
    public InsertProductInfo createInsertProductInfo() {
        return new InsertProductInfo();
    }

    /**
     * Create an instance of {@link SearchOrderInfoByOrderNo }
     * 
     */
    public SearchOrderInfoByOrderNo createSearchOrderInfoByOrderNo() {
        return new SearchOrderInfoByOrderNo();
    }

    /**
     * Create an instance of {@link PostOrdersProducts }
     * 
     */
    public PostOrdersProducts createPostOrdersProducts() {
        return new PostOrdersProducts();
    }

    /**
     * Create an instance of {@link ArrayOfKProductOrder }
     * 
     */
    public ArrayOfKProductOrder createArrayOfKProductOrder() {
        return new ArrayOfKProductOrder();
    }

    /**
     * Create an instance of {@link GetProductsInfoByTime }
     * 
     */
    public GetProductsInfoByTime createGetProductsInfoByTime() {
        return new GetProductsInfoByTime();
    }

    /**
     * Create an instance of {@link SDKCustomerInfo }
     * 
     */
    public SDKCustomerInfo createSDKCustomerInfo() {
        return new SDKCustomerInfo();
    }

    /**
     * Create an instance of {@link PostOrdersProductsResponse }
     * 
     */
    public PostOrdersProductsResponse createPostOrdersProductsResponse() {
        return new PostOrdersProductsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfSDKProductsInfo }
     * 
     */
    public ArrayOfSDKProductsInfo createArrayOfSDKProductsInfo() {
        return new ArrayOfSDKProductsInfo();
    }

    /**
     * Create an instance of {@link SDKProductsInfo }
     * 
     */
    public SDKProductsInfo createSDKProductsInfo() {
        return new SDKProductsInfo();
    }

    /**
     * Create an instance of {@link GetProductsInfoByTimeResponse }
     * 
     */
    public GetProductsInfoByTimeResponse createGetProductsInfoByTimeResponse() {
        return new GetProductsInfoByTimeResponse();
    }

    /**
     * Create an instance of {@link SearchOrderInfoByOrderNoResponse }
     * 
     */
    public SearchOrderInfoByOrderNoResponse createSearchOrderInfoByOrderNoResponse() {
        return new SearchOrderInfoByOrderNoResponse();
    }

    /**
     * Create an instance of {@link PostSearchBalanceResponse }
     * 
     */
    public PostSearchBalanceResponse createPostSearchBalanceResponse() {
        return new PostSearchBalanceResponse();
    }

    /**
     * Create an instance of {@link KProductOrder }
     * 
     */
    public KProductOrder createKProductOrder() {
        return new KProductOrder();
    }

    /**
     * Create an instance of {@link PostSearchBalance }
     * 
     */
    public PostSearchBalance createPostSearchBalance() {
        return new PostSearchBalance();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKProductOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ArrayOfK_ProductOrder")
    public JAXBElement<ArrayOfKProductOrder> createArrayOfKProductOrder(ArrayOfKProductOrder value) {
        return new JAXBElement<ArrayOfKProductOrder>(_ArrayOfKProductOrder_QNAME, ArrayOfKProductOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSDKProductsInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ArrayOfSDKProductsInfo")
    public JAXBElement<ArrayOfSDKProductsInfo> createArrayOfSDKProductsInfo(ArrayOfSDKProductsInfo value) {
        return new JAXBElement<ArrayOfSDKProductsInfo>(_ArrayOfSDKProductsInfo_QNAME, ArrayOfSDKProductsInfo.class, null, value);
    }

}
