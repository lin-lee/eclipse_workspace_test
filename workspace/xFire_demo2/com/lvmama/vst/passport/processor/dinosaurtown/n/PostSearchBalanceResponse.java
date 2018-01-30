
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
 *         &lt;element name="PostSearchBalanceResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "postSearchBalanceResult"
})
@XmlRootElement(name = "PostSearchBalanceResponse")
public class PostSearchBalanceResponse {

    @XmlElement(name = "PostSearchBalanceResult")
    protected String postSearchBalanceResult;

    /**
     * Gets the value of the postSearchBalanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostSearchBalanceResult() {
        return postSearchBalanceResult;
    }

    /**
     * Sets the value of the postSearchBalanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostSearchBalanceResult(String value) {
        this.postSearchBalanceResult = value;
    }

}
