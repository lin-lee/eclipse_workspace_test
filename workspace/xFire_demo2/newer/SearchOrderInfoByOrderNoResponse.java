
package newer;

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
 *         &lt;element name="SearchOrderInfoByOrderNoResult" type="{http://tempuri.org/}ArrayOfK_ProductOrder" minOccurs="0"/>
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
    "searchOrderInfoByOrderNoResult"
})
@XmlRootElement(name = "SearchOrderInfoByOrderNoResponse")
public class SearchOrderInfoByOrderNoResponse {

    @XmlElement(name = "SearchOrderInfoByOrderNoResult")
    protected ArrayOfKProductOrder searchOrderInfoByOrderNoResult;

    /**
     * Gets the value of the searchOrderInfoByOrderNoResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKProductOrder }
     *     
     */
    public ArrayOfKProductOrder getSearchOrderInfoByOrderNoResult() {
        return searchOrderInfoByOrderNoResult;
    }

    /**
     * Sets the value of the searchOrderInfoByOrderNoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKProductOrder }
     *     
     */
    public void setSearchOrderInfoByOrderNoResult(ArrayOfKProductOrder value) {
        this.searchOrderInfoByOrderNoResult = value;
    }

}
