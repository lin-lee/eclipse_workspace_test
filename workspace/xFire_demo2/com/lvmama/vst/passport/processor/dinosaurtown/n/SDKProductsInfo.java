
package com.lvmama.vst.passport.processor.dinosaurtown.n;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SDKProductsInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SDKProductsInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BeginUseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndUseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ProductFlag" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SDKProductsInfo", propOrder = {
    "productID",
    "productName",
    "beginUseDate",
    "endUseDate",
    "price",
    "quantity",
    "productFlag"
})
public class SDKProductsInfo {

    @XmlElement(name = "ProductID")
    protected int productID;
    @XmlElement(name = "ProductName")
    protected String productName;
    @XmlElement(name = "BeginUseDate")
    protected String beginUseDate;
    @XmlElement(name = "EndUseDate")
    protected String endUseDate;
    @XmlElement(name = "Price")
    protected double price;
    @XmlElement(name = "Quantity")
    protected int quantity;
    @XmlElement(name = "ProductFlag")
    protected int productFlag;

    /**
     * Gets the value of the productID property.
     * 
     */
    public int getProductID() {
        return productID;
    }

    /**
     * Sets the value of the productID property.
     * 
     */
    public void setProductID(int value) {
        this.productID = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the beginUseDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeginUseDate() {
        return beginUseDate;
    }

    /**
     * Sets the value of the beginUseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginUseDate(String value) {
        this.beginUseDate = value;
    }

    /**
     * Gets the value of the endUseDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndUseDate() {
        return endUseDate;
    }

    /**
     * Sets the value of the endUseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndUseDate(String value) {
        this.endUseDate = value;
    }

    /**
     * Gets the value of the price property.
     * 
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(double value) {
        this.price = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(int value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the productFlag property.
     * 
     */
    public int getProductFlag() {
        return productFlag;
    }

    /**
     * Sets the value of the productFlag property.
     * 
     */
    public void setProductFlag(int value) {
        this.productFlag = value;
    }

}
