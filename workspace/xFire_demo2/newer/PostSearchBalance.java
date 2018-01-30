
package newer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="strPayWay" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "strPayWay"
})
@XmlRootElement(name = "PostSearchBalance")
public class PostSearchBalance {

    protected String strPartnerCode;
    protected String strSignature;
    protected int strPayWay;

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
     * Gets the value of the strPayWay property.
     * 
     */
    public int getStrPayWay() {
        return strPayWay;
    }

    /**
     * Sets the value of the strPayWay property.
     * 
     */
    public void setStrPayWay(int value) {
        this.strPayWay = value;
    }

}
