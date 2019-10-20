
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Events.
 * 
 * <p>Java class for OBEvent1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OBEvent1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="urnukorgopenbankingeventsresource-update" type="{http://laegler.com/openbanking/soap/model}OBEventResourceUpdate1"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OBEvent1", propOrder = {
    "urnukorgopenbankingeventsresourceUpdate"
})
public class OBEvent1 {

    @XmlElement(name = "urnukorgopenbankingeventsresource-update", required = true)
    protected OBEventResourceUpdate1 urnukorgopenbankingeventsresourceUpdate;

    /**
     * Gets the value of the urnukorgopenbankingeventsresourceUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link OBEventResourceUpdate1 }
     *     
     */
    public OBEventResourceUpdate1 getUrnukorgopenbankingeventsresourceUpdate() {
        return urnukorgopenbankingeventsresourceUpdate;
    }

    /**
     * Sets the value of the urnukorgopenbankingeventsresourceUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBEventResourceUpdate1 }
     *     
     */
    public void setUrnukorgopenbankingeventsresourceUpdate(OBEventResourceUpdate1 value) {
        this.urnukorgopenbankingeventsresourceUpdate = value;
    }

}
