
package com.laegler.openbanking.soap.model;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Meta Data relevant to the payload
 * 
 * <p>Java class for MetaData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MetaData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FirstAvailableDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastAvailableDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="TotalPages" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
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
@XmlType(name = "MetaData", propOrder = {
    "firstAvailableDateTime",
    "lastAvailableDateTime",
    "totalPages"
})
public class MetaData {

    @XmlElement(name = "FirstAvailableDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstAvailableDateTime;
    @XmlElement(name = "LastAvailableDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastAvailableDateTime;
    @XmlElement(name = "TotalPages")
    protected BigInteger totalPages;

    /**
     * Gets the value of the firstAvailableDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstAvailableDateTime() {
        return firstAvailableDateTime;
    }

    /**
     * Sets the value of the firstAvailableDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstAvailableDateTime(XMLGregorianCalendar value) {
        this.firstAvailableDateTime = value;
    }

    /**
     * Gets the value of the lastAvailableDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastAvailableDateTime() {
        return lastAvailableDateTime;
    }

    /**
     * Sets the value of the lastAvailableDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastAvailableDateTime(XMLGregorianCalendar value) {
        this.lastAvailableDateTime = value;
    }

    /**
     * Gets the value of the totalPages property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalPages() {
        return totalPages;
    }

    /**
     * Sets the value of the totalPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalPages(BigInteger value) {
        this.totalPages = value;
    }

}
