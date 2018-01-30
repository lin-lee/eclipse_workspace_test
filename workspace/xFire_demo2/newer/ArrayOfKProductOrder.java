
package newer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfK_ProductOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfK_ProductOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="K_ProductOrder" type="{http://tempuri.org/}K_ProductOrder" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfK_ProductOrder", propOrder = {
    "kProductOrder"
})
public class ArrayOfKProductOrder {

    @XmlElement(name = "K_ProductOrder", required = true, nillable = true)
    protected List<KProductOrder> kProductOrder;

    /**
     * Gets the value of the kProductOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kProductOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKProductOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KProductOrder }
     * 
     * 
     */
    public List<KProductOrder> getKProductOrder() {
        if (kProductOrder == null) {
            kProductOrder = new ArrayList<KProductOrder>();
        }
        return this.kProductOrder;
    }

}
