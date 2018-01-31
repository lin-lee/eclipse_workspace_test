
package com.bjlyw.ts.service;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bjlyw.ts.service package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bjlyw.ts.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetEleInterfaceResponse }
     * 
     */
    public GetEleInterfaceResponse createGetEleInterfaceResponse() {
        return new GetEleInterfaceResponse();
    }

    /**
     * Create an instance of {@link GetEleInterface }
     * 
     */
    public GetEleInterface createGetEleInterface() {
        return new GetEleInterface();
    }

    /**
     * Create an instance of {@link GetProductInfoResponse }
     * 
     */
    public GetProductInfoResponse createGetProductInfoResponse() {
        return new GetProductInfoResponse();
    }

    /**
     * Create an instance of {@link GetProductInfo }
     * 
     */
    public GetProductInfo createGetProductInfo() {
        return new GetProductInfo();
    }

}
