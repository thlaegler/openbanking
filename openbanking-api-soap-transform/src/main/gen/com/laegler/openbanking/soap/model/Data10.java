
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Data10 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Data10"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConsentId"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="128"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CreationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DebtorAccount" type="{http://laegler.com/openbanking/soap/model}DebtorAccount1"/&gt;
 *         &lt;element name="ExpirationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://laegler.com/openbanking/soap/model}Status"/&gt;
 *         &lt;element name="StatusUpdateDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Data10", propOrder = {
    "consentId",
    "creationDateTime",
    "debtorAccount",
    "expirationDateTime",
    "status",
    "statusUpdateDateTime"
})
public class Data10 {

    @XmlElement(name = "ConsentId", required = true)
    protected String consentId;
    @XmlElement(name = "CreationDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDateTime;
    @XmlElement(name = "DebtorAccount", required = true)
    protected DebtorAccount1 debtorAccount;
    @XmlElement(name = "ExpirationDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDateTime;
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected Status status;
    @XmlElement(name = "StatusUpdateDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar statusUpdateDateTime;

    /**
     * Gets the value of the consentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsentId() {
        return consentId;
    }

    /**
     * Sets the value of the consentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsentId(String value) {
        this.consentId = value;
    }

    /**
     * Gets the value of the creationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * Sets the value of the creationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDateTime(XMLGregorianCalendar value) {
        this.creationDateTime = value;
    }

    /**
     * Gets the value of the debtorAccount property.
     * 
     * @return
     *     possible object is
     *     {@link DebtorAccount1 }
     *     
     */
    public DebtorAccount1 getDebtorAccount() {
        return debtorAccount;
    }

    /**
     * Sets the value of the debtorAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtorAccount1 }
     *     
     */
    public void setDebtorAccount(DebtorAccount1 value) {
        this.debtorAccount = value;
    }

    /**
     * Gets the value of the expirationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDateTime() {
        return expirationDateTime;
    }

    /**
     * Sets the value of the expirationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDateTime(XMLGregorianCalendar value) {
        this.expirationDateTime = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusUpdateDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatusUpdateDateTime() {
        return statusUpdateDateTime;
    }

    /**
     * Sets the value of the statusUpdateDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatusUpdateDateTime(XMLGregorianCalendar value) {
        this.statusUpdateDateTime = value;
    }

}
