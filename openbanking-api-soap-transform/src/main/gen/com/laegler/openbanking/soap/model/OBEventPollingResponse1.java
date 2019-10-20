
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OBEventPollingResponse1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OBEventPollingResponse1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="moreAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="sets"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
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
@XmlType(name = "OBEventPollingResponse1", propOrder = {
    "moreAvailable",
    "sets"
})
public class OBEventPollingResponse1 {

    protected boolean moreAvailable;
    @XmlElement(required = true)
    protected String sets;

    /**
     * Gets the value of the moreAvailable property.
     * 
     */
    public boolean isMoreAvailable() {
        return moreAvailable;
    }

    /**
     * Sets the value of the moreAvailable property.
     * 
     */
    public void setMoreAvailable(boolean value) {
        this.moreAvailable = value;
    }

    /**
     * Gets the value of the sets property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSets() {
        return sets;
    }

    /**
     * Sets the value of the sets property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSets(String value) {
        this.sets = value;
    }

}
