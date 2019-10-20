
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The Initiation payload is sent by the initiating party to the ASPSP. It is used to request movement of funds from the debtor account to a creditor for a single international payment.
 * 
 * <p>Java class for Initiation16 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Initiation16"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChargeBearer" type="{http://laegler.com/openbanking/soap/model}OBChargeBearerType1Code" minOccurs="0"/&gt;
 *         &lt;element name="Creditor" type="{http://laegler.com/openbanking/soap/model}Creditor" minOccurs="0"/&gt;
 *         &lt;element name="CreditorAccount" type="{http://laegler.com/openbanking/soap/model}CreditorAccount"/&gt;
 *         &lt;element name="CreditorAgent" type="{http://laegler.com/openbanking/soap/model}OBBranchAndFinancialInstitutionIdentification6_0" minOccurs="0"/&gt;
 *         &lt;element name="CurrencyOfTransfer"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^[A-Z]{3,3}$"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DebtorAccount" type="{http://laegler.com/openbanking/soap/model}DebtorAccount2" minOccurs="0"/&gt;
 *         &lt;element name="EndToEndIdentification"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ExchangeRateInformation" type="{http://laegler.com/openbanking/soap/model}ExchangeRateInformation" minOccurs="0"/&gt;
 *         &lt;element name="InstructedAmount" type="{http://laegler.com/openbanking/soap/model}OBActiveOrHistoricCurrencyAndAmount_9"/&gt;
 *         &lt;element name="InstructionIdentification"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="InstructionPriority" type="{http://laegler.com/openbanking/soap/model}InstructionPriority" minOccurs="0"/&gt;
 *         &lt;element name="LocalInstrument" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Purpose" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RemittanceInformation" type="{http://laegler.com/openbanking/soap/model}RemittanceInformation" minOccurs="0"/&gt;
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
@XmlType(name = "Initiation16", propOrder = {
    "chargeBearer",
    "creditor",
    "creditorAccount",
    "creditorAgent",
    "currencyOfTransfer",
    "debtorAccount",
    "endToEndIdentification",
    "exchangeRateInformation",
    "instructedAmount",
    "instructionIdentification",
    "instructionPriority",
    "localInstrument",
    "purpose",
    "remittanceInformation",
    "supplementaryData"
})
public class Initiation16 {

    @XmlElement(name = "ChargeBearer")
    @XmlSchemaType(name = "string")
    protected OBChargeBearerType1Code chargeBearer;
    @XmlElement(name = "Creditor")
    protected Creditor creditor;
    @XmlElement(name = "CreditorAccount", required = true)
    protected CreditorAccount creditorAccount;
    @XmlElement(name = "CreditorAgent")
    protected OBBranchAndFinancialInstitutionIdentification60 creditorAgent;
    @XmlElement(name = "CurrencyOfTransfer", required = true)
    protected String currencyOfTransfer;
    @XmlElement(name = "DebtorAccount")
    protected DebtorAccount2 debtorAccount;
    @XmlElement(name = "EndToEndIdentification", required = true)
    protected String endToEndIdentification;
    @XmlElement(name = "ExchangeRateInformation")
    protected ExchangeRateInformation exchangeRateInformation;
    @XmlElement(name = "InstructedAmount", required = true)
    protected OBActiveOrHistoricCurrencyAndAmount9 instructedAmount;
    @XmlElement(name = "InstructionIdentification", required = true)
    protected String instructionIdentification;
    @XmlElement(name = "InstructionPriority")
    @XmlSchemaType(name = "string")
    protected InstructionPriority instructionPriority;
    @XmlElement(name = "LocalInstrument")
    protected String localInstrument;
    @XmlElement(name = "Purpose")
    protected String purpose;
    @XmlElement(name = "RemittanceInformation")
    protected RemittanceInformation remittanceInformation;
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
     *     {@link CreditorAccount }
     *     
     */
    public CreditorAccount getCreditorAccount() {
        return creditorAccount;
    }

    /**
     * Sets the value of the creditorAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorAccount }
     *     
     */
    public void setCreditorAccount(CreditorAccount value) {
        this.creditorAccount = value;
    }

    /**
     * Gets the value of the creditorAgent property.
     * 
     * @return
     *     possible object is
     *     {@link OBBranchAndFinancialInstitutionIdentification60 }
     *     
     */
    public OBBranchAndFinancialInstitutionIdentification60 getCreditorAgent() {
        return creditorAgent;
    }

    /**
     * Sets the value of the creditorAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBBranchAndFinancialInstitutionIdentification60 }
     *     
     */
    public void setCreditorAgent(OBBranchAndFinancialInstitutionIdentification60 value) {
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
     *     {@link DebtorAccount2 }
     *     
     */
    public DebtorAccount2 getDebtorAccount() {
        return debtorAccount;
    }

    /**
     * Sets the value of the debtorAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtorAccount2 }
     *     
     */
    public void setDebtorAccount(DebtorAccount2 value) {
        this.debtorAccount = value;
    }

    /**
     * Gets the value of the endToEndIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndToEndIdentification() {
        return endToEndIdentification;
    }

    /**
     * Sets the value of the endToEndIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndToEndIdentification(String value) {
        this.endToEndIdentification = value;
    }

    /**
     * Gets the value of the exchangeRateInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateInformation }
     *     
     */
    public ExchangeRateInformation getExchangeRateInformation() {
        return exchangeRateInformation;
    }

    /**
     * Sets the value of the exchangeRateInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateInformation }
     *     
     */
    public void setExchangeRateInformation(ExchangeRateInformation value) {
        this.exchangeRateInformation = value;
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
     * Gets the value of the instructionIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstructionIdentification() {
        return instructionIdentification;
    }

    /**
     * Sets the value of the instructionIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstructionIdentification(String value) {
        this.instructionIdentification = value;
    }

    /**
     * Gets the value of the instructionPriority property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionPriority }
     *     
     */
    public InstructionPriority getInstructionPriority() {
        return instructionPriority;
    }

    /**
     * Sets the value of the instructionPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionPriority }
     *     
     */
    public void setInstructionPriority(InstructionPriority value) {
        this.instructionPriority = value;
    }

    /**
     * Gets the value of the localInstrument property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalInstrument() {
        return localInstrument;
    }

    /**
     * Sets the value of the localInstrument property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalInstrument(String value) {
        this.localInstrument = value;
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
     * Gets the value of the remittanceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link RemittanceInformation }
     *     
     */
    public RemittanceInformation getRemittanceInformation() {
        return remittanceInformation;
    }

    /**
     * Sets the value of the remittanceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemittanceInformation }
     *     
     */
    public void setRemittanceInformation(RemittanceInformation value) {
        this.remittanceInformation = value;
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
