
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Account to or from which a cash entry is made.
 * 
 * <p>Java class for DirectDebit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DirectDebit"&gt;
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
 *         &lt;element name="DirectDebitId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DirectDebitStatusCode" type="{http://laegler.com/openbanking/soap/model}DirectDebitStatusCode" minOccurs="0"/&gt;
 *         &lt;element name="MandateIdentification"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Name"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PreviousPaymentAmount" type="{http://laegler.com/openbanking/soap/model}PreviousPaymentAmount" minOccurs="0"/&gt;
 *         &lt;element name="PreviousPaymentDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectDebit", propOrder = {
    "accountId",
    "directDebitId",
    "directDebitStatusCode",
    "mandateIdentification",
    "name",
    "previousPaymentAmount",
    "previousPaymentDateTime"
})
public class DirectDebit {

    @XmlElement(name = "AccountId", required = true)
    protected String accountId;
    @XmlElement(name = "DirectDebitId")
    protected String directDebitId;
    @XmlElement(name = "DirectDebitStatusCode")
    @XmlSchemaType(name = "string")
    protected DirectDebitStatusCode directDebitStatusCode;
    @XmlElement(name = "MandateIdentification", required = true)
    protected String mandateIdentification;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "PreviousPaymentAmount")
    protected PreviousPaymentAmount previousPaymentAmount;
    @XmlElement(name = "PreviousPaymentDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar previousPaymentDateTime;

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
     * Gets the value of the directDebitId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectDebitId() {
        return directDebitId;
    }

    /**
     * Sets the value of the directDebitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectDebitId(String value) {
        this.directDebitId = value;
    }

    /**
     * Gets the value of the directDebitStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link DirectDebitStatusCode }
     *     
     */
    public DirectDebitStatusCode getDirectDebitStatusCode() {
        return directDebitStatusCode;
    }

    /**
     * Sets the value of the directDebitStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectDebitStatusCode }
     *     
     */
    public void setDirectDebitStatusCode(DirectDebitStatusCode value) {
        this.directDebitStatusCode = value;
    }

    /**
     * Gets the value of the mandateIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMandateIdentification() {
        return mandateIdentification;
    }

    /**
     * Sets the value of the mandateIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMandateIdentification(String value) {
        this.mandateIdentification = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the previousPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link PreviousPaymentAmount }
     *     
     */
    public PreviousPaymentAmount getPreviousPaymentAmount() {
        return previousPaymentAmount;
    }

    /**
     * Sets the value of the previousPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviousPaymentAmount }
     *     
     */
    public void setPreviousPaymentAmount(PreviousPaymentAmount value) {
        this.previousPaymentAmount = value;
    }

    /**
     * Gets the value of the previousPaymentDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPreviousPaymentDateTime() {
        return previousPaymentDateTime;
    }

    /**
     * Sets the value of the previousPaymentDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPreviousPaymentDateTime(XMLGregorianCalendar value) {
        this.previousPaymentDateTime = value;
    }

}
