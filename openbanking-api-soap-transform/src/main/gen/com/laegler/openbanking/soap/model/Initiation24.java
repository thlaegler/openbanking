
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The Initiation payload is sent by the initiating party to the ASPSP. It is used to request movement of funds from the debtor account to a creditor for an international standing order.
 * 
 * <p>Java class for Initiation24 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Initiation24"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChargeBearer" type="{http://laegler.com/openbanking/soap/model}OBChargeBearerType1Code" minOccurs="0"/&gt;
 *         &lt;element name="Creditor" type="{http://laegler.com/openbanking/soap/model}Creditor" minOccurs="0"/&gt;
 *         &lt;element name="CreditorAccount" type="{http://laegler.com/openbanking/soap/model}CreditorAccount20"/&gt;
 *         &lt;element name="CreditorAgent" type="{http://laegler.com/openbanking/soap/model}OBBranchAndFinancialInstitutionIdentification6_2" minOccurs="0"/&gt;
 *         &lt;element name="CurrencyOfTransfer"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^[A-Z]{3,3}$"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DebtorAccount" type="{http://laegler.com/openbanking/soap/model}DebtorAccount10" minOccurs="0"/&gt;
 *         &lt;element name="FinalPaymentDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FirstPaymentDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Frequency"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^(EvryDay)$|^(EvryWorkgDay)$|^(IntrvlDay:((0[2-9])|([1-2][0-9])|3[0-1]))$|^(IntrvlWkDay:0[1-9]:0[1-7])$|^(WkInMnthDay:0[1-5]:0[1-7])$|^(IntrvlMnthDay:(0[1-6]|12|24):(-0[1-5]|0[1-9]|[12][0-9]|3[01]))$|^(QtrDay:(ENGLISH|SCOTTISH|RECEIVED))$"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="InstructedAmount" type="{http://laegler.com/openbanking/soap/model}OBActiveOrHistoricCurrencyAndAmount_9"/&gt;
 *         &lt;element name="NumberOfPayments" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Purpose" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
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
@XmlType(name = "Initiation24", propOrder = {
    "chargeBearer",
    "creditor",
    "creditorAccount",
    "creditorAgent",
    "currencyOfTransfer",
    "debtorAccount",
    "finalPaymentDateTime",
    "firstPaymentDateTime",
    "frequency",
    "instructedAmount",
    "numberOfPayments",
    "purpose",
    "reference",
    "supplementaryData"
})
public class Initiation24 {

    @XmlElement(name = "ChargeBearer")
    @XmlSchemaType(name = "string")
    protected OBChargeBearerType1Code chargeBearer;
    @XmlElement(name = "Creditor")
    protected Creditor creditor;
    @XmlElement(name = "CreditorAccount", required = true)
    protected CreditorAccount20 creditorAccount;
    @XmlElement(name = "CreditorAgent")
    protected OBBranchAndFinancialInstitutionIdentification62 creditorAgent;
    @XmlElement(name = "CurrencyOfTransfer", required = true)
    protected String currencyOfTransfer;
    @XmlElement(name = "DebtorAccount")
    protected DebtorAccount10 debtorAccount;
    @XmlElement(name = "FinalPaymentDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar finalPaymentDateTime;
    @XmlElement(name = "FirstPaymentDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstPaymentDateTime;
    @XmlElement(name = "Frequency", required = true)
    protected String frequency;
    @XmlElement(name = "InstructedAmount", required = true)
    protected OBActiveOrHistoricCurrencyAndAmount9 instructedAmount;
    @XmlElement(name = "NumberOfPayments")
    protected String numberOfPayments;
    @XmlElement(name = "Purpose")
    protected String purpose;
    @XmlElement(name = "Reference")
    protected String reference;
    @XmlElement(name = "SupplementaryData")
    protected Object supplementaryData;

    /**
     * Gets the value of the chargeBearer property.
     * 
     * @return
     *     possible object is
     *     {@link OBChargeBearerType1Code }
     *     
     */
    public OBChargeBearerType1Code getChargeBearer() {
        return chargeBearer;
    }

    /**
     * Sets the value of the chargeBearer property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBChargeBearerType1Code }
     *     
     */
    public void setChargeBearer(OBChargeBearerType1Code value) {
        this.chargeBearer = value;
    }

    /**
     * Gets the value of the creditor property.
     * 
     * @return
     *     possible object is
     *     {@link Creditor }
     *     
     */
    public Creditor getCreditor() {
        return creditor;
    }

    /**
     * Sets the value of the creditor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Creditor }
     *     
     */
    public void setCreditor(Creditor value) {
        this.creditor = value;
    }

    /**
     * Gets the value of the creditorAccount property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorAccount20 }
     *     
     */
    public CreditorAccount20 getCreditorAccount() {
        return creditorAccount;
    }

    /**
     * Sets the value of the creditorAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorAccount20 }
     *     
     */
    public void setCreditorAccount(CreditorAccount20 value) {
        this.creditorAccount = value;
    }

    /**
     * Gets the value of the creditorAgent property.
     * 
     * @return
     *     possible object is
     *     {@link OBBranchAndFinancialInstitutionIdentification62 }
     *     
     */
    public OBBranchAndFinancialInstitutionIdentification62 getCreditorAgent() {
        return creditorAgent;
    }

    /**
     * Sets the value of the creditorAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBBranchAndFinancialInstitutionIdentification62 }
     *     
     */
    public void setCreditorAgent(OBBranchAndFinancialInstitutionIdentification62 value) {
        this.creditorAgent = value;
    }

    /**
     * Gets the value of the currencyOfTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyOfTransfer() {
        return currencyOfTransfer;
    }

    /**
     * Sets the value of the currencyOfTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyOfTransfer(String value) {
        this.currencyOfTransfer = value;
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
     * Gets the value of the instructedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link OBActiveOrHistoricCurrencyAndAmount9 }
     *     
     */
    public OBActiveOrHistoricCurrencyAndAmount9 getInstructedAmount() {
        return instructedAmount;
    }

    /**
     * Sets the value of the instructedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBActiveOrHistoricCurrencyAndAmount9 }
     *     
     */
    public void setInstructedAmount(OBActiveOrHistoricCurrencyAndAmount9 value) {
        this.instructedAmount = value;
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
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurpose(String value) {
        this.purpose = value;
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
