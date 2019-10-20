
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OBScheduledPayment2Basic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OBScheduledPayment2Basic"&gt;
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
 *         &lt;element name="InstructedAmount" type="{http://laegler.com/openbanking/soap/model}OBActiveOrHistoricCurrencyAndAmount_9"/&gt;
 *         &lt;element name="Reference" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ScheduledPaymentDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ScheduledPaymentId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ScheduledType" type="{http://laegler.com/openbanking/soap/model}OBExternalScheduleType1Code"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OBScheduledPayment2Basic", propOrder = {
    "accountId",
    "instructedAmount",
    "reference",
    "scheduledPaymentDateTime",
    "scheduledPaymentId",
    "scheduledType"
})
public class OBScheduledPayment2Basic {

    @XmlElement(name = "AccountId", required = true)
    protected String accountId;
    @XmlElement(name = "InstructedAmount", required = true)
    protected OBActiveOrHistoricCurrencyAndAmount9 instructedAmount;
    @XmlElement(name = "Reference")
    protected String reference;
    @XmlElement(name = "ScheduledPaymentDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledPaymentDateTime;
    @XmlElement(name = "ScheduledPaymentId")
    protected String scheduledPaymentId;
    @XmlElement(name = "ScheduledType", required = true)
    @XmlSchemaType(name = "string")
    protected OBExternalScheduleType1Code scheduledType;

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
     * Gets the value of the scheduledPaymentDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledPaymentDateTime() {
        return scheduledPaymentDateTime;
    }

    /**
     * Sets the value of the scheduledPaymentDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledPaymentDateTime(XMLGregorianCalendar value) {
        this.scheduledPaymentDateTime = value;
    }

    /**
     * Gets the value of the scheduledPaymentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduledPaymentId() {
        return scheduledPaymentId;
    }

    /**
     * Sets the value of the scheduledPaymentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduledPaymentId(String value) {
        this.scheduledPaymentId = value;
    }

    /**
     * Gets the value of the scheduledType property.
     * 
     * @return
     *     possible object is
     *     {@link OBExternalScheduleType1Code }
     *     
     */
    public OBExternalScheduleType1Code getScheduledType() {
        return scheduledType;
    }

    /**
     * Sets the value of the scheduledType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBExternalScheduleType1Code }
     *     
     */
    public void setScheduledType(OBExternalScheduleType1Code value) {
        this.scheduledType = value;
    }

}
