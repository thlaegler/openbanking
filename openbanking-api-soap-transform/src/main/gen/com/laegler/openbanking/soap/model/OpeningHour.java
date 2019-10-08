
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Opening & Closing Times of a branch of an organisation
 * 
 * <p>Java class for OpeningHour complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpeningHour"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClosingTime"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^(2[0-3]|[01][0-9]):?([0-5][0-9])$"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OpeningTime"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^(2[0-3]|[01][0-9]):?([0-5][0-9])$"/&gt;
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
@XmlType(name = "OpeningHour", propOrder = {
    "closingTime",
    "openingTime"
})
public class OpeningHour {

    @XmlElement(name = "ClosingTime", required = true)
    protected String closingTime;
    @XmlElement(name = "OpeningTime", required = true)
    protected String openingTime;

    /**
     * Gets the value of the closingTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosingTime() {
        return closingTime;
    }

    /**
     * Sets the value of the closingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosingTime(String value) {
        this.closingTime = value;
    }

    /**
     * Gets the value of the openingTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpeningTime() {
        return openingTime;
    }

    /**
     * Sets the value of the openingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpeningTime(String value) {
        this.openingTime = value;
    }

}
