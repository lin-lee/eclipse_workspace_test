
package com.lvmama.vst.passport.processor.dinosaurtown.n;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="strPartnerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strSignature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Customer" type="{http://tempuri.org/}SDKCustomerInfo" minOccurs="0"/>
 *         &lt;element name="OrderProduct" type="{http://tempuri.org/}InsertProductInfo" minOccurs="0"/>
 *         &lt;element name="refNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "strPartnerCode",
    "strSignature",
    "customer",
    "orderProduct",
    "refNo"
})
@XmlRootElement(name = "PostOrdersProducts")
public class PostOrdersProducts {

    protected String strPartnerCode;
    protected String strSignature;
    @XmlElement(name = "Customer")
    protected SDKCustomerInfo customer;
    @XmlElement(name = "OrderProduct")
    protected InsertProductInfo orderProduct;
    protected String refNo;

    /**
     * Gets the value of the strPartnerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrPartnerCode() {
        return strPartnerCode;
    }

    /**
     * Sets the value of the strPartnerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrPartnerCode(String value) {
        this.strPartnerCode = value;
    }

    /**
     * Gets the value of the strSignature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrSignature() {
        return strSignature;
    }

    /**
     * Sets the value of the strSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrSignature(String value) {
        this.strSignature = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link SDKCustomerInfo }
     *     
     */
    public SDKCustomerInfo getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link SDKCustomerInfo }
     *     
     */
    public void setCustomer(SDKCustomerInfo value) {
        this.customer = value;
    }

    /**
     * Gets the value of the orderProduct property.
     * 
     * @return
     *     possible object is
     *     {@link InsertProductInfo }
     *     
     */
    public InsertProductInfo getOrderProduct() {
        return orderProduct;
    }

    /**
     * Sets the value of the orderProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsertProductInfo }
     *     
     */
    public void setOrderProduct(InsertProductInfo value) {
        this.orderProduct = value;
    }

    /**
     * Gets the value of the refNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefNo() {
        return refNo;
    }

    /**
     * Sets the value of the refNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefNo(String value) {
        this.refNo = value;
    }

}
