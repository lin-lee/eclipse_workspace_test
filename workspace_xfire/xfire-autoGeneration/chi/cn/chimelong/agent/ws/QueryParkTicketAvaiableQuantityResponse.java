
package cn.chimelong.agent.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import cn.chimelong.agent.ws.model.ArrayOfParkQuantity;


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
 *         &lt;element name="out" type="{http://model.ws.agent.chimelong.cn}ArrayOfParkQuantity"/>
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
    "out"
})
@XmlRootElement(name = "QueryParkTicketAvaiableQuantityResponse")
public class QueryParkTicketAvaiableQuantityResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfParkQuantity out;

    /**
     * Gets the value of the out property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfParkQuantity }
     *     
     */
    public ArrayOfParkQuantity getOut() {
        return out;
    }

    /**
     * Sets the value of the out property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfParkQuantity }
     *     
     */
    public void setOut(ArrayOfParkQuantity value) {
        this.out = value;
    }

}
