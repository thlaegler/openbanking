
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Geographic location of the ATM specified by geographic coordinates or UTM coordinates.
 * 
 * <p>Java class for GeoLocation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeoLocation1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GeographicCoordinates" type="{http://laegler.com/openbanking/soap/model}GeographicCoordinates1"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoLocation1", propOrder = {
    "geographicCoordinates"
})
public class GeoLocation1 {

    @XmlElement(name = "GeographicCoordinates", required = true)
    protected GeographicCoordinates1 geographicCoordinates;

    /**
     * Gets the value of the geographicCoordinates property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicCoordinates1 }
     *     
     */
    public GeographicCoordinates1 getGeographicCoordinates() {
        return geographicCoordinates;
    }

    /**
     * Sets the value of the geographicCoordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicCoordinates1 }
     *     
     */
    public void setGeographicCoordinates(GeographicCoordinates1 value) {
        this.geographicCoordinates = value;
    }

}
