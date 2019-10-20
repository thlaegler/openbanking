
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Initiation payload is sent by the initiating party to the ASPSP. It is used to request movement of funds from the debtor account to a creditor for a single domestic payment.
 * 
 * <p>Java class for Initiation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Initiation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CreditorAccount" type="{http://laegler.com/openbanking/soap/model}CreditorAccount"/&gt;
 *         &lt;element name="CreditorPostalAddress" type="{http://laegler.com/openbanking/soap/model}OBPostalAddress6" minOccurs="0"/&gt;
 *         &lt;element name="DebtorAccount" type="{http://laegler.com/openbanking/soap/model}DebtorAccount2" minOccurs="0"/&gt;
 *         &lt;element name="EndToEndIdentification"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="InstructedAmount" type="{http://laegler.com/openbanking/soap/model}OBActiveOrHistoricCurrencyAndAmount_9"/&gt;
 *         &lt;element name="InstructionIdentification"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LocalInstrument" minOccurs="0"&gt;
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
@XmlType(name = "Initiation", propOrder = {
    "creditorAccount",
    "creditorPostalAddress",
    "debtorAccount",
    "endToEndIdentification",
    "instructedAmount",
    "instructionIdentification",
    "localInstrument",
    "remittanceInformation",
    "supplementaryData"
})
public class Initiation {

    @XmlElement(name = "CreditorAccount", required = true)
    protected CreditorAccount creditorAccount;
    @XmlElement(name = "CreditorPostalAddress")
    protected OBPostalAddress6 creditorPostalAddress;
    @XmlElement(name = "DebtorAccount")
    protected DebtorAccount2 debtorAccount;
    @XmlElement(name = "EndToEndIdentification", required = true)
    protected String endToEndIdentification;
    @XmlElement(name = "InstructedAmount", required = true)
    protected OBActiveOrHistoricCurrencyAndAmount9 instructedAmount;
    @XmlElement(name = "InstructionIdentification", required = true)
    protected String instructionIdentification;
    @XmlElement(name = "LocalInstrument")
    protected String localInstrument;
    @XmlElement(name = "RemittanceInformation")
    protected RemittanceInformation remittanceInformation;
    @XmlElement(name = "SupplementaryData")
    protected Object supplementaryData;

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
     * Gets the value of the creditorPostalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link OBPostalAddress6 }
     *     
     */
    public OBPostalAddress6 getCreditorPostalAddress() {
        return creditorPostalAddress;
    }

    /**
     * Sets the value of the creditorPostalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBPostalAddress6 }
     *     
     */
    public void setCreditorPostalAddress(OBPostalAddress6 value) {
        this.creditorPostalAddress = value;
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
