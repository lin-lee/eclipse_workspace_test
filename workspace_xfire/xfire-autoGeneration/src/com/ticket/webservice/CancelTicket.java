
package com.ticket.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cancelTicket complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cancelTicket">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgentOrderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgentPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cancelTicket", propOrder = {
    "agentOrderID",
    "agentID",
    "agentPassword",
    "companyID",
    "orderName",
    "orderPhoneNumber",
    "payFlag"
})
public class CancelTicket {

    @XmlElement(name = "AgentOrderID")
    protected String agentOrderID;
    @XmlElement(name = "AgentID")
    protected String agentID;
    @XmlElement(name = "AgentPassword")
    protected String agentPassword;
    @XmlElement(name = "CompanyID")
    protected String companyID;
    @XmlElement(name = "OrderName")
    protected String orderName;
    @XmlElement(name = "OrderPhoneNumber")
    protected String orderPhoneNumber;
    @XmlElement(name = "PayFlag")
    protected String payFlag;

    /**
     * Gets the value of the agentOrderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentOrderID() {
        return agentOrderID;
    }

    /**
     * Sets the value of the agentOrderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentOrderID(String value) {
        this.agentOrderID = value;
    }

    /**
     * Gets the value of the agentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentID() {
        return agentID;
    }

    /**
     * Sets the value of the agentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentID(String value) {
        this.agentID = value;
    }

    /**
     * Gets the value of the agentPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentPassword() {
        return agentPassword;
    }

    /**
     * Sets the value of the agentPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentPassword(String value) {
        this.agentPassword = value;
    }

    /**
     * Gets the value of the companyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyID() {
        return companyID;
    }

    /**
     * Sets the value of the companyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyID(String value) {
        this.companyID = value;
    }

    /**
     * Gets the value of the orderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderName() {
        return orderName;
    }

    /**
     * Sets the value of the orderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderName(String value) {
        this.orderName = value;
    }

    /**
     * Gets the value of the orderPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderPhoneNumber() {
        return orderPhoneNumber;
    }

    /**
     * Sets the value of the orderPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderPhoneNumber(String value) {
        this.orderPhoneNumber = value;
    }

    /**
     * Gets the value of the payFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayFlag() {
        return payFlag;
    }

    /**
     * Sets the value of the payFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayFlag(String value) {
        this.payFlag = value;
    }

}
