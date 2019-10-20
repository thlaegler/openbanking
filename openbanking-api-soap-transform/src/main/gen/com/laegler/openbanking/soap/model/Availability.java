
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Days and times defining when the branch is available for use by a customer
 * 
 * <p>Java class for Availability complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Availability"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NonStandardAvailability" type="{http://laegler.com/openbanking/soap/model}NonStandardAvailability" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="StandardAvailability" type="{http://laegler.com/openbanking/soap/model}StandardAvailability"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Availability", propOrder = {
    "nonStandardAvailability",
    "standardAvailability"
})
public class Availability {

    @XmlElement(name = "NonStandardAvailability")
    protected List<NonStandardAvailability> nonStandardAvailability;
    @XmlElement(name = "StandardAvailability", required = true)
    protected StandardAvailability standardAvailability;

    /**
     * Gets the value of the nonStandardAvailability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonStandardAvailability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonStandardAvailability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NonStandardAvailability }
     * 
     * 
     */
    public List<NonStandardAvailability> getNonStandardAvailability() {
        if (nonStandardAvailability == null) {
            nonStandardAvailability = new ArrayList<NonStandardAvailability>();
        }
        return this.nonStandardAvailability;
    }

    /**
     * Gets the value of the standardAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link StandardAvailability }
     *     
     */
    public StandardAvailability getStandardAvailability() {
        return standardAvailability;
    }

    /**
     * Sets the value of the standardAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardAvailability }
     *     
     */
    public void setStandardAvailability(StandardAvailability value) {
        this.standardAvailability = value;
    }

}
