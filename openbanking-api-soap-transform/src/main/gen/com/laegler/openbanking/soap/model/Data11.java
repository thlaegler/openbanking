
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Data11 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Data11"&gt;
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
 *         &lt;element name="FundsAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="FundsConfirmationId"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="InstructedAmount" type="{http://laegler.com/openbanking/soap/model}InstructedAmount1"/&gt;
 *         &lt;element name="Reference"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Data11", propOrder = {
    "consentId",
    "creationDateTime",
    "fundsAvailable",
    "fundsConfirmationId",
    "instructedAmount",
    "reference"
})
public class Data11 {

    @XmlElement(name = "ConsentId", required = true)
    protected String consentId;
    @XmlElement(name = "CreationDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDateTime;
    @XmlElement(name = "FundsAvailable")
    protected boolean fundsAvailable;
    @XmlElement(name = "FundsConfirmationId", required = true)
    protected String fundsConfirmationId;
    @XmlElement(name = "InstructedAmount", required = true)
    protected InstructedAmount1 instructedAmount;
    @XmlElement(name = "Reference", required = true)
    protected String reference;

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
     * Gets the value of the fundsAvailable property.
     * 
     */
    public boolean isFundsAvailable() {
        return fundsAvailable;
    }

    /**
     * Sets the value of the fundsAvailable property.
     * 
     */
    public void setFundsAvailable(boolean value) {
        this.fundsAvailable = value;
    }

    /**
     * Gets the value of the fundsConfirmationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundsConfirmationId() {
        return fundsConfirmationId;
    }

    /**
     * Sets the value of the fundsConfirmationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundsConfirmationId(String value) {
        this.fundsConfirmationId = value;
    }

    /**
     * Gets the value of the instructedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link InstructedAmount1 }
     *     
     */
    public InstructedAmount1 getInstructedAmount() {
        return instructedAmount;
    }

    /**
     * Sets the value of the instructedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructedAmount1 }
     *     
     */
    public void setInstructedAmount(InstructedAmount1 value) {
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

}
