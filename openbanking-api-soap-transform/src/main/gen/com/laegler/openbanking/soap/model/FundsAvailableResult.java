
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Result of a funds availability check.
 * 
 * <p>Java class for FundsAvailableResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundsAvailableResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FundsAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="FundsAvailableDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundsAvailableResult", propOrder = {
    "fundsAvailable",
    "fundsAvailableDateTime"
})
public class FundsAvailableResult {

    @XmlElement(name = "FundsAvailable")
    protected boolean fundsAvailable;
    @XmlElement(name = "FundsAvailableDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fundsAvailableDateTime;

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
     * Gets the value of the fundsAvailableDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFundsAvailableDateTime() {
        return fundsAvailableDateTime;
    }

    /**
     * Sets the value of the fundsAvailableDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFundsAvailableDateTime(XMLGregorianCalendar value) {
        this.fundsAvailableDateTime = value;
    }

}
