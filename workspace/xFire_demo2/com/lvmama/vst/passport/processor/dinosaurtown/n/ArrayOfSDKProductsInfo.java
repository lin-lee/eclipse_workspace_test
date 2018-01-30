
package com.lvmama.vst.passport.processor.dinosaurtown.n;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSDKProductsInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSDKProductsInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SDKProductsInfo" type="{http://tempuri.org/}SDKProductsInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSDKProductsInfo", propOrder = {
    "sdkProductsInfo"
})
public class ArrayOfSDKProductsInfo {

    @XmlElement(name = "SDKProductsInfo", required = true, nillable = true)
    protected List<SDKProductsInfo> sdkProductsInfo;

    /**
     * Gets the value of the sdkProductsInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sdkProductsInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSDKProductsInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SDKProductsInfo }
     * 
     * 
     */
    public List<SDKProductsInfo> getSDKProductsInfo() {
        if (sdkProductsInfo == null) {
            sdkProductsInfo = new ArrayList<SDKProductsInfo>();
        }
        return this.sdkProductsInfo;
    }

}
