
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The Initiation payload is sent by the initiating party to the ASPSP. It is used to request movement of funds from the debtor account to a creditor for a domestic standing order.
 * 
 * <p>Java class for Initiation8 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Initiation8"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CreditorAccount" type="{http://laegler.com/openbanking/soap/model}CreditorAccount8"/&gt;
 *         &lt;element name="DebtorAccount" type="{http://laegler.com/openbanking/soap/model}DebtorAccount10" minOccurs="0"/&gt;
 *         &lt;element name="FinalPaymentAmount" type="{http://laegler.com/openbanking/soap/model}OBActiveOrHistoricCurrencyAndAmount_2" minOccurs="0"/&gt;
 *         &lt;element name="FinalPaymentDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FirstPaymentAmount" type="{http://laegler.com/openbanking/soap/model}OBActiveOrHistoricCurrencyAndAmount_0"/&gt;
 *         &lt;element name="FirstPaymentDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Frequency"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^(EvryDay)$|^(EvryWorkgDay)$|^(IntrvlDay:((0[2-9])|([1-2][0-9])|3[0-1]))$|^(IntrvlWkDay:0[1-9]:0[1-7])$|^(WkInMnthDay:0[1-5]:0[1-7])$|^(IntrvlMnthDay:(0[1-6]|12|24):(-0[1-5]|0[1-9]|[12][0-9]|3[01]))$|^(QtrDay:(ENGLISH|SCOTTISH|RECEIVED))$"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NumberOfPayments" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RecurringPaymentAmount" type="{http://laegler.com/openbanking/soap/model}RecurringPaymentAmount" minOccurs="0"/&gt;
 *         &lt;element name="RecurringPaymentDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Reference" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
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
@XmlType(name = "Initiation8", propOrder = {
    "creditorAccount",
    "debtorAccount",
    "finalPaymentAmount",
    "finalPaymentDateTime",
    "firstPaymentAmount",
    "firstPaymentDateTime",
    "frequency",
    "numberOfPayments",
    "recurringPaymentAmount",
    "recurringPaymentDateTime",
    "reference",
    "supplementaryData"
})
public class Initiation8 {

    @XmlElement(name = "CreditorAccount", required = true)
    protected CreditorAccount8 creditorAccount;
    @XmlElement(name = "DebtorAccount")
    protected DebtorAccount10 debtorAccount;
    @XmlElement(name = "FinalPaymentAmount")
    protected OBActiveOrHistoricCurrencyAndAmount2 finalPaymentAmount;
    @XmlElement(name = "FinalPaymentDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar finalPaymentDateTime;
    @XmlElement(name = "FirstPaymentAmount", required = true)
    protected OBActiveOrHistoricCurrencyAndAmount0 firstPaymentAmount;
    @XmlElement(name = "FirstPaymentDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstPaymentDateTime;
    @XmlElement(name = "Frequency", required = true)
    protected String frequency;
    @XmlElement(name = "NumberOfPayments")
    protected String numberOfPayments;
    @XmlElement(name = "RecurringPaymentAmount")
    protected RecurringPaymentAmount recurringPaymentAmount;
    @XmlElement(name = "RecurringPaymentDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar recurringPaymentDateTime;
    @XmlElement(name = "Reference")
    protected String reference;
    @XmlElement(name = "SupplementaryData")
    protected Object supplementaryData;

    /**
     * Gets the value of the creditorAccount property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorAccount8 }
     *     
     */
    public CreditorAccount8 getCreditorAccount() {
        return creditorAccount;
    }

    /**
     * Sets the value of the creditorAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorAccount8 }
     *     
     */
    public void setCreditorAccount(CreditorAccount8 value) {
        this.creditorAccount = value;
    }

    /**
     * Gets the value of the debtorAccount property.
     * 
     * @return
     *     possible object is
     *     {@link DebtorAccount10 }
     *     
     */
    public DebtorAccount10 getDebtorAccount() {
        return debtorAccount;
    }

    /**
     * Sets the value of the debtorAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtorAccount10 }
     *     
     */
    public void setDebtorAccount(DebtorAccount10 value) {
        this.debtorAccount = value;
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
     * Gets the value of the numberOfPayments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfPayments() {
        return numberOfPayments;
    }

    /**
     * Sets the value of the numberOfPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfPayments(String value) {
        this.numberOfPayments = value;
    }

    /**
     * Gets the value of the recurringPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link RecurringPaymentAmount }
     *     
     */
    public RecurringPaymentAmount getRecurringPaymentAmount() {
        return recurringPaymentAmount;
    }

    /**
     * Sets the value of the recurringPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurringPaymentAmount }
     *     
     */
    public void setRecurringPaymentAmount(RecurringPaymentAmount value) {
        this.recurringPaymentAmount = value;
    }

    /**
     * Gets the value of the recurringPaymentDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecurringPaymentDateTime() {
        return recurringPaymentDateTime;
    }

    /**
     * Sets the value of the recurringPaymentDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecurringPaymentDateTime(XMLGregorianCalendar value) {
        this.recurringPaymentDateTime = value;
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
