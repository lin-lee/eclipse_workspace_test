
package com.lvmama.vst.passport.processor.dinosaurtown.n;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for K_ProductOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="K_ProductOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MemberID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OrderTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ShipTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BuyerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BuyerPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BuyerEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BuyerAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BuyerPostalcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReceiverName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReceiverPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReceiverCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReceiverEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReceiverProCities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReceiverAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReceiverPostalcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ProductIDs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CustomItemPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="AdvancePayment" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ShippingType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Score" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NeedInvoice" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InvoiceHead" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvoiceContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsCancelled" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsConfirmed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PayStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ShippingStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsFinished" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ManageHistory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastModify" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OrderNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsAgentF" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsAgentFContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsShippingFree" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PaymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Paymentstyle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderProductType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CheckInTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="LeaveTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ConfirmTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PostagePay" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="PaymentOrderNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderSource" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CombinationType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CouponParvalue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CouponNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FromOrderNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UpdQApproval" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "K_ProductOrder", propOrder = {
    "orderID",
    "memberID",
    "orderTime",
    "shipTime",
    "buyerName",
    "buyerPhone",
    "buyerEmail",
    "buyerAddress",
    "buyerPostalcode",
    "receiverName",
    "receiverPhone",
    "receiverCard",
    "receiverEmail",
    "receiverProCities",
    "receiverAddress",
    "receiverPostalcode",
    "remark",
    "totalPrice",
    "productIDs",
    "productPrice",
    "customItemPrice",
    "discount",
    "shipPrice",
    "advancePayment",
    "paymentType",
    "shippingType",
    "score",
    "weight",
    "quantity",
    "needInvoice",
    "invoiceHead",
    "invoiceContent",
    "isCancelled",
    "isConfirmed",
    "payStatus",
    "shippingStatus",
    "isFinished",
    "manageHistory",
    "lastModify",
    "orderNo",
    "code",
    "isAgentF",
    "isAgentFContent",
    "isShippingFree",
    "paymentDate",
    "paymentstyle",
    "orderProductType",
    "checkInTime",
    "leaveTime",
    "confirmTime",
    "postagePay",
    "paymentOrderNo",
    "orderSource",
    "combinationType",
    "couponParvalue",
    "couponNumber",
    "fromOrderNo",
    "updQuantity",
    "updQApproval"
})
public class KProductOrder {

    @XmlElement(name = "OrderID")
    protected int orderID;
    @XmlElement(name = "MemberID", required = true, type = Integer.class, nillable = true)
    protected Integer memberID;
    @XmlElement(name = "OrderTime", required = true, nillable = true)
    protected XMLGregorianCalendar orderTime;
    @XmlElement(name = "ShipTime")
    protected String shipTime;
    @XmlElement(name = "BuyerName")
    protected String buyerName;
    @XmlElement(name = "BuyerPhone")
    protected String buyerPhone;
    @XmlElement(name = "BuyerEmail")
    protected String buyerEmail;
    @XmlElement(name = "BuyerAddress")
    protected String buyerAddress;
    @XmlElement(name = "BuyerPostalcode")
    protected String buyerPostalcode;
    @XmlElement(name = "ReceiverName")
    protected String receiverName;
    @XmlElement(name = "ReceiverPhone")
    protected String receiverPhone;
    @XmlElement(name = "ReceiverCard")
    protected String receiverCard;
    @XmlElement(name = "ReceiverEmail")
    protected String receiverEmail;
    @XmlElement(name = "ReceiverProCities")
    protected String receiverProCities;
    @XmlElement(name = "ReceiverAddress")
    protected String receiverAddress;
    @XmlElement(name = "ReceiverPostalcode")
    protected String receiverPostalcode;
    @XmlElement(name = "Remark")
    protected String remark;
    @XmlElement(name = "TotalPrice", required = true)
    protected BigDecimal totalPrice;
    @XmlElement(name = "ProductIDs")
    protected String productIDs;
    @XmlElement(name = "ProductPrice", required = true, nillable = true)
    protected BigDecimal productPrice;
    @XmlElement(name = "CustomItemPrice", required = true, nillable = true)
    protected BigDecimal customItemPrice;
    @XmlElement(name = "Discount")
    protected String discount;
    @XmlElement(name = "ShipPrice", required = true)
    protected BigDecimal shipPrice;
    @XmlElement(name = "AdvancePayment", required = true, nillable = true)
    protected BigDecimal advancePayment;
    @XmlElement(name = "PaymentType", required = true, type = Integer.class, nillable = true)
    protected Integer paymentType;
    @XmlElement(name = "ShippingType", required = true, type = Integer.class, nillable = true)
    protected Integer shippingType;
    @XmlElement(name = "Score", required = true, type = Integer.class, nillable = true)
    protected Integer score;
    @XmlElement(name = "Weight", required = true, nillable = true)
    protected BigDecimal weight;
    @XmlElement(name = "Quantity", required = true, type = Integer.class, nillable = true)
    protected Integer quantity;
    @XmlElement(name = "NeedInvoice", required = true, type = Integer.class, nillable = true)
    protected Integer needInvoice;
    @XmlElement(name = "InvoiceHead")
    protected String invoiceHead;
    @XmlElement(name = "InvoiceContent")
    protected String invoiceContent;
    @XmlElement(name = "IsCancelled", required = true, type = Integer.class, nillable = true)
    protected Integer isCancelled;
    @XmlElement(name = "IsConfirmed", required = true, type = Integer.class, nillable = true)
    protected Integer isConfirmed;
    @XmlElement(name = "PayStatus", required = true, type = Integer.class, nillable = true)
    protected Integer payStatus;
    @XmlElement(name = "ShippingStatus", required = true, type = Integer.class, nillable = true)
    protected Integer shippingStatus;
    @XmlElement(name = "IsFinished", required = true, type = Integer.class, nillable = true)
    protected Integer isFinished;
    @XmlElement(name = "ManageHistory")
    protected String manageHistory;
    @XmlElement(name = "LastModify", required = true, type = Integer.class, nillable = true)
    protected Integer lastModify;
    @XmlElement(name = "OrderNo")
    protected String orderNo;
    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "IsAgentF", required = true, type = Integer.class, nillable = true)
    protected Integer isAgentF;
    @XmlElement(name = "IsAgentFContent")
    protected String isAgentFContent;
    @XmlElement(name = "IsShippingFree", required = true, type = Integer.class, nillable = true)
    protected Integer isShippingFree;
    @XmlElement(name = "PaymentDate", required = true, nillable = true)
    protected XMLGregorianCalendar paymentDate;
    @XmlElement(name = "Paymentstyle")
    protected String paymentstyle;
    @XmlElement(name = "OrderProductType", required = true, type = Integer.class, nillable = true)
    protected Integer orderProductType;
    @XmlElement(name = "CheckInTime", required = true, nillable = true)
    protected XMLGregorianCalendar checkInTime;
    @XmlElement(name = "LeaveTime", required = true, nillable = true)
    protected XMLGregorianCalendar leaveTime;
    @XmlElement(name = "ConfirmTime", required = true, nillable = true)
    protected XMLGregorianCalendar confirmTime;
    @XmlElement(name = "PostagePay", required = true)
    protected BigDecimal postagePay;
    @XmlElement(name = "PaymentOrderNo")
    protected String paymentOrderNo;
    @XmlElement(name = "OrderSource")
    protected int orderSource;
    @XmlElement(name = "CombinationType")
    protected int combinationType;
    @XmlElement(name = "CouponParvalue", required = true)
    protected BigDecimal couponParvalue;
    @XmlElement(name = "CouponNumber")
    protected String couponNumber;
    @XmlElement(name = "FromOrderNo")
    protected String fromOrderNo;
    @XmlElement(name = "UpdQuantity")
    protected int updQuantity;
    @XmlElement(name = "UpdQApproval", required = true, type = Integer.class, nillable = true)
    protected Integer updQApproval;

    /**
     * Gets the value of the orderID property.
     * 
     */
    public int getOrderID() {
        return orderID;
    }

    /**
     * Sets the value of the orderID property.
     * 
     */
    public void setOrderID(int value) {
        this.orderID = value;
    }

    /**
     * Gets the value of the memberID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMemberID() {
        return memberID;
    }

    /**
     * Sets the value of the memberID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMemberID(Integer value) {
        this.memberID = value;
    }

    /**
     * Gets the value of the orderTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderTime() {
        return orderTime;
    }

    /**
     * Sets the value of the orderTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderTime(XMLGregorianCalendar value) {
        this.orderTime = value;
    }

    /**
     * Gets the value of the shipTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipTime() {
        return shipTime;
    }

    /**
     * Sets the value of the shipTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipTime(String value) {
        this.shipTime = value;
    }

    /**
     * Gets the value of the buyerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerName() {
        return buyerName;
    }

    /**
     * Sets the value of the buyerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerName(String value) {
        this.buyerName = value;
    }

    /**
     * Gets the value of the buyerPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerPhone() {
        return buyerPhone;
    }

    /**
     * Sets the value of the buyerPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerPhone(String value) {
        this.buyerPhone = value;
    }

    /**
     * Gets the value of the buyerEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerEmail() {
        return buyerEmail;
    }

    /**
     * Sets the value of the buyerEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerEmail(String value) {
        this.buyerEmail = value;
    }

    /**
     * Gets the value of the buyerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerAddress() {
        return buyerAddress;
    }

    /**
     * Sets the value of the buyerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerAddress(String value) {
        this.buyerAddress = value;
    }

    /**
     * Gets the value of the buyerPostalcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerPostalcode() {
        return buyerPostalcode;
    }

    /**
     * Sets the value of the buyerPostalcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerPostalcode(String value) {
        this.buyerPostalcode = value;
    }

    /**
     * Gets the value of the receiverName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * Sets the value of the receiverName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverName(String value) {
        this.receiverName = value;
    }

    /**
     * Gets the value of the receiverPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverPhone() {
        return receiverPhone;
    }

    /**
     * Sets the value of the receiverPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverPhone(String value) {
        this.receiverPhone = value;
    }

    /**
     * Gets the value of the receiverCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverCard() {
        return receiverCard;
    }

    /**
     * Sets the value of the receiverCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverCard(String value) {
        this.receiverCard = value;
    }

    /**
     * Gets the value of the receiverEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverEmail() {
        return receiverEmail;
    }

    /**
     * Sets the value of the receiverEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverEmail(String value) {
        this.receiverEmail = value;
    }

    /**
     * Gets the value of the receiverProCities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverProCities() {
        return receiverProCities;
    }

    /**
     * Sets the value of the receiverProCities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverProCities(String value) {
        this.receiverProCities = value;
    }

    /**
     * Gets the value of the receiverAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverAddress() {
        return receiverAddress;
    }

    /**
     * Sets the value of the receiverAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverAddress(String value) {
        this.receiverAddress = value;
    }

    /**
     * Gets the value of the receiverPostalcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverPostalcode() {
        return receiverPostalcode;
    }

    /**
     * Sets the value of the receiverPostalcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverPostalcode(String value) {
        this.receiverPostalcode = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPrice(BigDecimal value) {
        this.totalPrice = value;
    }

    /**
     * Gets the value of the productIDs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductIDs() {
        return productIDs;
    }

    /**
     * Sets the value of the productIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductIDs(String value) {
        this.productIDs = value;
    }

    /**
     * Gets the value of the productPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProductPrice() {
        return productPrice;
    }

    /**
     * Sets the value of the productPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProductPrice(BigDecimal value) {
        this.productPrice = value;
    }

    /**
     * Gets the value of the customItemPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCustomItemPrice() {
        return customItemPrice;
    }

    /**
     * Sets the value of the customItemPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCustomItemPrice(BigDecimal value) {
        this.customItemPrice = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscount(String value) {
        this.discount = value;
    }

    /**
     * Gets the value of the shipPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getShipPrice() {
        return shipPrice;
    }

    /**
     * Sets the value of the shipPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setShipPrice(BigDecimal value) {
        this.shipPrice = value;
    }

    /**
     * Gets the value of the advancePayment property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdvancePayment() {
        return advancePayment;
    }

    /**
     * Sets the value of the advancePayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdvancePayment(BigDecimal value) {
        this.advancePayment = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaymentType(Integer value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the shippingType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShippingType() {
        return shippingType;
    }

    /**
     * Sets the value of the shippingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShippingType(Integer value) {
        this.shippingType = value;
    }

    /**
     * Gets the value of the score property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScore(Integer value) {
        this.score = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeight(BigDecimal value) {
        this.weight = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantity(Integer value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the needInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNeedInvoice() {
        return needInvoice;
    }

    /**
     * Sets the value of the needInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNeedInvoice(Integer value) {
        this.needInvoice = value;
    }

    /**
     * Gets the value of the invoiceHead property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceHead() {
        return invoiceHead;
    }

    /**
     * Sets the value of the invoiceHead property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceHead(String value) {
        this.invoiceHead = value;
    }

    /**
     * Gets the value of the invoiceContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceContent() {
        return invoiceContent;
    }

    /**
     * Sets the value of the invoiceContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceContent(String value) {
        this.invoiceContent = value;
    }

    /**
     * Gets the value of the isCancelled property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsCancelled() {
        return isCancelled;
    }

    /**
     * Sets the value of the isCancelled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsCancelled(Integer value) {
        this.isCancelled = value;
    }

    /**
     * Gets the value of the isConfirmed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsConfirmed() {
        return isConfirmed;
    }

    /**
     * Sets the value of the isConfirmed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsConfirmed(Integer value) {
        this.isConfirmed = value;
    }

    /**
     * Gets the value of the payStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPayStatus() {
        return payStatus;
    }

    /**
     * Sets the value of the payStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPayStatus(Integer value) {
        this.payStatus = value;
    }

    /**
     * Gets the value of the shippingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShippingStatus() {
        return shippingStatus;
    }

    /**
     * Sets the value of the shippingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShippingStatus(Integer value) {
        this.shippingStatus = value;
    }

    /**
     * Gets the value of the isFinished property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsFinished() {
        return isFinished;
    }

    /**
     * Sets the value of the isFinished property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsFinished(Integer value) {
        this.isFinished = value;
    }

    /**
     * Gets the value of the manageHistory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManageHistory() {
        return manageHistory;
    }

    /**
     * Sets the value of the manageHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManageHistory(String value) {
        this.manageHistory = value;
    }

    /**
     * Gets the value of the lastModify property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLastModify() {
        return lastModify;
    }

    /**
     * Sets the value of the lastModify property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLastModify(Integer value) {
        this.lastModify = value;
    }

    /**
     * Gets the value of the orderNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * Sets the value of the orderNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNo(String value) {
        this.orderNo = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the isAgentF property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsAgentF() {
        return isAgentF;
    }

    /**
     * Sets the value of the isAgentF property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsAgentF(Integer value) {
        this.isAgentF = value;
    }

    /**
     * Gets the value of the isAgentFContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsAgentFContent() {
        return isAgentFContent;
    }

    /**
     * Sets the value of the isAgentFContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsAgentFContent(String value) {
        this.isAgentFContent = value;
    }

    /**
     * Gets the value of the isShippingFree property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsShippingFree() {
        return isShippingFree;
    }

    /**
     * Sets the value of the isShippingFree property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsShippingFree(Integer value) {
        this.isShippingFree = value;
    }

    /**
     * Gets the value of the paymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets the value of the paymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentDate(XMLGregorianCalendar value) {
        this.paymentDate = value;
    }

    /**
     * Gets the value of the paymentstyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentstyle() {
        return paymentstyle;
    }

    /**
     * Sets the value of the paymentstyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentstyle(String value) {
        this.paymentstyle = value;
    }

    /**
     * Gets the value of the orderProductType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrderProductType() {
        return orderProductType;
    }

    /**
     * Sets the value of the orderProductType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrderProductType(Integer value) {
        this.orderProductType = value;
    }

    /**
     * Gets the value of the checkInTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckInTime() {
        return checkInTime;
    }

    /**
     * Sets the value of the checkInTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckInTime(XMLGregorianCalendar value) {
        this.checkInTime = value;
    }

    /**
     * Gets the value of the leaveTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLeaveTime() {
        return leaveTime;
    }

    /**
     * Sets the value of the leaveTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLeaveTime(XMLGregorianCalendar value) {
        this.leaveTime = value;
    }

    /**
     * Gets the value of the confirmTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConfirmTime() {
        return confirmTime;
    }

    /**
     * Sets the value of the confirmTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConfirmTime(XMLGregorianCalendar value) {
        this.confirmTime = value;
    }

    /**
     * Gets the value of the postagePay property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPostagePay() {
        return postagePay;
    }

    /**
     * Sets the value of the postagePay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPostagePay(BigDecimal value) {
        this.postagePay = value;
    }

    /**
     * Gets the value of the paymentOrderNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentOrderNo() {
        return paymentOrderNo;
    }

    /**
     * Sets the value of the paymentOrderNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentOrderNo(String value) {
        this.paymentOrderNo = value;
    }

    /**
     * Gets the value of the orderSource property.
     * 
     */
    public int getOrderSource() {
        return orderSource;
    }

    /**
     * Sets the value of the orderSource property.
     * 
     */
    public void setOrderSource(int value) {
        this.orderSource = value;
    }

    /**
     * Gets the value of the combinationType property.
     * 
     */
    public int getCombinationType() {
        return combinationType;
    }

    /**
     * Sets the value of the combinationType property.
     * 
     */
    public void setCombinationType(int value) {
        this.combinationType = value;
    }

    /**
     * Gets the value of the couponParvalue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCouponParvalue() {
        return couponParvalue;
    }

    /**
     * Sets the value of the couponParvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCouponParvalue(BigDecimal value) {
        this.couponParvalue = value;
    }

    /**
     * Gets the value of the couponNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponNumber() {
        return couponNumber;
    }

    /**
     * Sets the value of the couponNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponNumber(String value) {
        this.couponNumber = value;
    }

    /**
     * Gets the value of the fromOrderNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromOrderNo() {
        return fromOrderNo;
    }

    /**
     * Sets the value of the fromOrderNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromOrderNo(String value) {
        this.fromOrderNo = value;
    }

    /**
     * Gets the value of the updQuantity property.
     * 
     */
    public int getUpdQuantity() {
        return updQuantity;
    }

    /**
     * Sets the value of the updQuantity property.
     * 
     */
    public void setUpdQuantity(int value) {
        this.updQuantity = value;
    }

    /**
     * Gets the value of the updQApproval property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUpdQApproval() {
        return updQApproval;
    }

    /**
     * Sets the value of the updQApproval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUpdQApproval(Integer value) {
        this.updQApproval = value;
    }

}
