
package com.xiexie.ticket.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getElementRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getElementRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getElementRequest", propOrder = {
    "parm"
})
public class GetElementRequest {

    protected String parm;

    /**
     * Gets the value of the parm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParm() {
        return parm;
    }

    /**
     * Sets the value of the parm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParm(String value) {
        this.parm = value;
    }

}
