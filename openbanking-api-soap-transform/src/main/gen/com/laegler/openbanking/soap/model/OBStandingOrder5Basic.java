
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OBStandingOrder5Basic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OBStandingOrder5Basic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountId"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FinalPaymentAmount" type="{http://laegler.com/openbanking/soap/model}OBActiveOrHistoricCurrencyAndAmount_2" minOccurs="0"/&gt;
 *         &lt;element name="FinalPaymentDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FirstPaymentAmount" type="{http://laegler.com/openbanking/soap/model}OBActiveOrHistoricCurrencyAndAmount_0" minOccurs="0"/&gt;
 *         &lt;element name="FirstPaymentDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Frequency"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^(EvryDay)$|^(EvryWorkgDay)$|^(IntrvlDay:((0[2-9])|([1-2][0-9])|3[0-1]))$|^(IntrvlWkDay:0[1-9]:0[1-7])$|^(WkInMnthDay:0[1-5]:0[1-7])$|^(IntrvlMnthDay:(0[1-6]|12|24):(-0[1-5]|0[1-9]|[12][0-9]|3[01]))$|^(QtrDay:(ENGLISH|SCOTTISH|RECEIVED))$"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NextPaymentAmount" type="{http://laegler.com/openbanking/soap/model}OBActiveOrHistoricCurrencyAndAmount_1" minOccurs="0"/&gt;
 *         &lt;element name="NextPaymentDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Reference" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="StandingOrderId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="StandingOrderStatusCode" type="{http://laegler.com/openbanking/soap/model}OBExternalStandingOrderStatus1Code" minOccurs="0"/&gt;
 *         &lt;element name="SupplementaryData" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OBStandingOrder5Basic", propOrder = {
    "accountId",
    "finalPaymentAmount",
    "finalPaymentDateTime",
    "firstPaymentAmount",
    "firstPaymentDateTime",
    "frequency",
    "nextPaymentAmount",
    "nextPaymentDateTime",
    "reference",
    "standingOrderId",
    "standingOrderStatusCode",
    "supplementaryData"
})
public class OBStandingOrder5Basic {

    @XmlElement(name = "AccountId", required = true)
    protected String accountId;
    @XmlElement(name = "FinalPaymentAmount")
    protected OBActiveOrHistoricCurrencyAndAmount2 finalPaymentAmount;
    @XmlElement(name = "FinalPaymentDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar finalPaymentDateTime;
    @XmlElement(name = "FirstPaymentAmount")
    protected OBActiveOrHistoricCurrencyAndAmount0 firstPaymentAmount;
    @XmlElement(name = "FirstPaymentDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstPaymentDateTime;
    @XmlElement(name = "Frequency", required = true)
    protected String frequency;
    @XmlElement(name = "NextPaymentAmount")
    protected OBActiveOrHistoricCurrencyAndAmount1 nextPaymentAmount;
    @XmlElement(name = "NextPaymentDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextPaymentDateTime;
    @XmlElement(name = "Reference")
    protected String reference;
    @XmlElement(name = "StandingOrderId")
    protected String standingOrderId;
    @XmlElement(name = "StandingOrderStatusCode")
    @XmlSchemaType(name = "string")
    protected OBExternalStandingOrderStatus1Code standingOrderStatusCode;
    @XmlElement(name = "SupplementaryData")
    protected Object supplementaryData;

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the finalPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link OBActiveOrHistoricCurrencyAndAmount2 }
     *     
     */
    public OBActiveOrHistoricCurrencyAndAmount2 getFinalPaymentAmount() {
        return finalPaymentAmount;
    }

    /**
     * Sets the value of the finalPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBActiveOrHistoricCurrencyAndAmount2 }
     *     
     */
    public void setFinalPaymentAmount(OBActiveOrHistoricCurrencyAndAmount2 value) {
        this.finalPaymentAmount = value;
    }

    /**
     * Gets the value of the finalPaymentDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFinalPaymentDateTime() {
        return finalPaymentDateTime;
    }

    /**
     * Sets the value of the finalPaymentDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFinalPaymentDateTime(XMLGregorianCalendar value) {
        this.finalPaymentDateTime = value;
    }

    /**
     * Gets the value of the firstPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link OBActiveOrHistoricCurrencyAndAmount0 }
     *     
     */
    public OBActiveOrHistoricCurrencyAndAmount0 getFirstPaymentAmount() {
        return firstPaymentAmount;
    }

    /**
     * Sets the value of the firstPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBActiveOrHistoricCurrencyAndAmount0 }
     *     
     */
    public void setFirstPaymentAmount(OBActiveOrHistoricCurrencyAndAmount0 value) {
        this.firstPaymentAmount = value;
    }

    /**
     * Gets the value of the firstPaymentDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstPaymentDateTime() {
        return firstPaymentDateTime;
    }

    /**
     * Sets the value of the firstPaymentDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstPaymentDateTime(XMLGregorianCalendar value) {
        this.firstPaymentDateTime = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequency(String value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the nextPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link OBActiveOrHistoricCurrencyAndAmount1 }
     *     
     */
    public OBActiveOrHistoricCurrencyAndAmount1 getNextPaymentAmount() {
        return nextPaymentAmount;
    }

    /**
     * Sets the value of the nextPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBActiveOrHistoricCurrencyAndAmount1 }
     *     
     */
    public void setNextPaymentAmount(OBActiveOrHistoricCurrencyAndAmount1 value) {
        this.nextPaymentAmount = value;
    }

    /**
     * Gets the value of the nextPaymentDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextPaymentDateTime() {
        return nextPaymentDateTime;
    }

    /**
     * Sets the value of the nextPaymentDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextPaymentDateTime(XMLGregorianCalendar value) {
        this.nextPaymentDateTime = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

    /**
     * Gets the value of the standingOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandingOrderId() {
        return standingOrderId;
    }

    /**
     * Sets the value of the standingOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandingOrderId(String value) {
        this.standingOrderId = value;
    }

    /**
     * Gets the value of the standingOrderStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link OBExternalStandingOrderStatus1Code }
     *     
     */
    public OBExternalStandingOrderStatus1Code getStandingOrderStatusCode() {
        return standingOrderStatusCode;
    }

    /**
     * Sets the value of the standingOrderStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBExternalStandingOrderStatus1Code }
     *     
     */
    public void setStandingOrderStatusCode(OBExternalStandingOrderStatus1Code value) {
        this.standingOrderStatusCode = value;
    }

    /**
     * Gets the value of the supplementaryData property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSupplementaryData() {
        return supplementaryData;
    }

    /**
     * Sets the value of the supplementaryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSupplementaryData(Object value) {
        this.supplementaryData = value;
    }

}
