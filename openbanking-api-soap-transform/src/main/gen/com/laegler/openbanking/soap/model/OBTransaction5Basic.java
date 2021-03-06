
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Provides further details on an entry in the report.
 * 
 * <p>Java class for OBTransaction5Basic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OBTransaction5Basic"&gt;
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
 *         &lt;element name="AddressLine" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Amount" type="{http://laegler.com/openbanking/soap/model}OBActiveOrHistoricCurrencyAndAmount_7"/&gt;
 *         &lt;element name="BankTransactionCode" type="{http://laegler.com/openbanking/soap/model}OBBankTransactionCodeStructure1" minOccurs="0"/&gt;
 *         &lt;element name="BookingDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="CardInstrument" type="{http://laegler.com/openbanking/soap/model}OBTransactionCardInstrument1" minOccurs="0"/&gt;
 *         &lt;element name="ChargeAmount" type="{http://laegler.com/openbanking/soap/model}OBActiveOrHistoricCurrencyAndAmount_8" minOccurs="0"/&gt;
 *         &lt;element name="CreditDebitIndicator" type="{http://laegler.com/openbanking/soap/model}OBCreditDebitCode_1"/&gt;
 *         &lt;element name="CurrencyExchange" type="{http://laegler.com/openbanking/soap/model}OBCurrencyExchange5" minOccurs="0"/&gt;
 *         &lt;element name="ProprietaryBankTransactionCode" type="{http://laegler.com/openbanking/soap/model}ProprietaryBankTransactionCodeStructure1" minOccurs="0"/&gt;
 *         &lt;element name="StatementReference" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Status" type="{http://laegler.com/openbanking/soap/model}OBEntryStatus1Code"/&gt;
 *         &lt;element name="SupplementaryData" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TransactionId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="210"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TransactionReference" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ValueDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OBTransaction5Basic", propOrder = {
    "accountId",
    "addressLine",
    "amount",
    "bankTransactionCode",
    "bookingDateTime",
    "cardInstrument",
    "chargeAmount",
    "creditDebitIndicator",
    "currencyExchange",
    "proprietaryBankTransactionCode",
    "statementReference",
    "status",
    "supplementaryData",
    "transactionId",
    "transactionReference",
    "valueDateTime"
})
public class OBTransaction5Basic {

    @XmlElement(name = "AccountId", required = true)
    protected String accountId;
    @XmlElement(name = "AddressLine")
    protected String addressLine;
    @XmlElement(name = "Amount", required = true)
    protected OBActiveOrHistoricCurrencyAndAmount7 amount;
    @XmlElement(name = "BankTransactionCode")
    protected OBBankTransactionCodeStructure1 bankTransactionCode;
    @XmlElement(name = "BookingDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bookingDateTime;
    @XmlElement(name = "CardInstrument")
    protected OBTransactionCardInstrument1 cardInstrument;
    @XmlElement(name = "ChargeAmount")
    protected OBActiveOrHistoricCurrencyAndAmount8 chargeAmount;
    @XmlElement(name = "CreditDebitIndicator", required = true)
    @XmlSchemaType(name = "string")
    protected OBCreditDebitCode1 creditDebitIndicator;
    @XmlElement(name = "CurrencyExchange")
    protected OBCurrencyExchange5 currencyExchange;
    @XmlElement(name = "ProprietaryBankTransactionCode")
    protected ProprietaryBankTransactionCodeStructure1 proprietaryBankTransactionCode;
    @XmlElement(name = "StatementReference")
    protected List<String> statementReference;
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected OBEntryStatus1Code status;
    @XmlElement(name = "SupplementaryData")
    protected Object supplementaryData;
    @XmlElement(name = "TransactionId")
    protected String transactionId;
    @XmlElement(name = "TransactionReference")
    protected String transactionReference;
    @XmlElement(name = "ValueDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar valueDateTime;

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
     * Gets the value of the addressLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine() {
        return addressLine;
    }

    /**
     * Sets the value of the addressLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine(String value) {
        this.addressLine = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link OBActiveOrHistoricCurrencyAndAmount7 }
     *     
     */
    public OBActiveOrHistoricCurrencyAndAmount7 getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBActiveOrHistoricCurrencyAndAmount7 }
     *     
     */
    public void setAmount(OBActiveOrHistoricCurrencyAndAmount7 value) {
        this.amount = value;
    }

    /**
     * Gets the value of the bankTransactionCode property.
     * 
     * @return
     *     possible object is
     *     {@link OBBankTransactionCodeStructure1 }
     *     
     */
    public OBBankTransactionCodeStructure1 getBankTransactionCode() {
        return bankTransactionCode;
    }

    /**
     * Sets the value of the bankTransactionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBBankTransactionCodeStructure1 }
     *     
     */
    public void setBankTransactionCode(OBBankTransactionCodeStructure1 value) {
        this.bankTransactionCode = value;
    }

    /**
     * Gets the value of the bookingDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBookingDateTime() {
        return bookingDateTime;
    }

    /**
     * Sets the value of the bookingDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBookingDateTime(XMLGregorianCalendar value) {
        this.bookingDateTime = value;
    }

    /**
     * Gets the value of the cardInstrument property.
     * 
     * @return
     *     possible object is
     *     {@link OBTransactionCardInstrument1 }
     *     
     */
    public OBTransactionCardInstrument1 getCardInstrument() {
        return cardInstrument;
    }

    /**
     * Sets the value of the cardInstrument property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBTransactionCardInstrument1 }
     *     
     */
    public void setCardInstrument(OBTransactionCardInstrument1 value) {
        this.cardInstrument = value;
    }

    /**
     * Gets the value of the chargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link OBActiveOrHistoricCurrencyAndAmount8 }
     *     
     */
    public OBActiveOrHistoricCurrencyAndAmount8 getChargeAmount() {
        return chargeAmount;
    }

    /**
     * Sets the value of the chargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBActiveOrHistoricCurrencyAndAmount8 }
     *     
     */
    public void setChargeAmount(OBActiveOrHistoricCurrencyAndAmount8 value) {
        this.chargeAmount = value;
    }

    /**
     * Gets the value of the creditDebitIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link OBCreditDebitCode1 }
     *     
     */
    public OBCreditDebitCode1 getCreditDebitIndicator() {
        return creditDebitIndicator;
    }

    /**
     * Sets the value of the creditDebitIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBCreditDebitCode1 }
     *     
     */
    public void setCreditDebitIndicator(OBCreditDebitCode1 value) {
        this.creditDebitIndicator = value;
    }

    /**
     * Gets the value of the currencyExchange property.
     * 
     * @return
     *     possible object is
     *     {@link OBCurrencyExchange5 }
     *     
     */
    public OBCurrencyExchange5 getCurrencyExchange() {
        return currencyExchange;
    }

    /**
     * Sets the value of the currencyExchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBCurrencyExchange5 }
     *     
     */
    public void setCurrencyExchange(OBCurrencyExchange5 value) {
        this.currencyExchange = value;
    }

    /**
     * Gets the value of the proprietaryBankTransactionCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryBankTransactionCodeStructure1 }
     *     
     */
    public ProprietaryBankTransactionCodeStructure1 getProprietaryBankTransactionCode() {
        return proprietaryBankTransactionCode;
    }

    /**
     * Sets the value of the proprietaryBankTransactionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryBankTransactionCodeStructure1 }
     *     
     */
    public void setProprietaryBankTransactionCode(ProprietaryBankTransactionCodeStructure1 value) {
        this.proprietaryBankTransactionCode = value;
    }

    /**
     * Gets the value of the statementReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statementReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatementReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStatementReference() {
        if (statementReference == null) {
            statementReference = new ArrayList<String>();
        }
        return this.statementReference;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link OBEntryStatus1Code }
     *     
     */
    public OBEntryStatus1Code getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBEntryStatus1Code }
     *     
     */
    public void setStatus(OBEntryStatus1Code value) {
        this.status = value;
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

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the transactionReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionReference() {
        return transactionReference;
    }

    /**
     * Sets the value of the transactionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionReference(String value) {
        this.transactionReference = value;
    }

    /**
     * Gets the value of the valueDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValueDateTime() {
        return valueDateTime;
    }

    /**
     * Sets the value of the valueDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValueDateTime(XMLGregorianCalendar value) {
        this.valueDateTime = value;
    }

}
