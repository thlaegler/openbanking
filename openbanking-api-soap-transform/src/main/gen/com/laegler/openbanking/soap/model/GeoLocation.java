
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Geographic location of the ATM specified by geographic coordinates or UTM coordinates.
 * 
 * <p>Java class for GeoLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeoLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GeographicCoordinates" type="{http://laegler.com/openbanking/soap/model}GeographicCoordinates"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoLocation", propOrder = {
    "geographicCoordinates"
})
public class GeoLocation {

    @XmlElement(name = "GeographicCoordinates", required = true)
    protected GeographicCoordinates geographicCoordinates;

    /**
     * Gets the value of the geographicCoordinates property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicCoordinates }
     *     
     */
    public GeographicCoordinates getGeographicCoordinates() {
        return geographicCoordinates;
    }

    /**
     * Sets the value of the geographicCoordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicCoordinates }
     *     
     */
    public void setGeographicCoordinates(GeographicCoordinates value) {
        this.geographicCoordinates = value;
    }

}
