
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OBWriteInternationalScheduledConsent3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OBWriteInternationalScheduledConsent3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Data" type="{http://laegler.com/openbanking/soap/model}Data49"/&gt;
 *         &lt;element name="Risk" type="{http://laegler.com/openbanking/soap/model}OBRisk1"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OBWriteInternationalScheduledConsent3", propOrder = {
    "data",
    "risk"
})
public class OBWriteInternationalScheduledConsent3 {

    @XmlElement(name = "Data", required = true)
    protected Data49 data;
    @XmlElement(name = "Risk", required = true)
    protected OBRisk1 risk;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link Data49 }
     *     
     */
    public Data49 getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link Data49 }
     *     
     */
    public void setData(Data49 value) {
        this.data = value;
    }

    /**
     * Gets the value of the risk property.
     * 
     * @return
     *     possible object is
     *     {@link OBRisk1 }
     *     
     */
    public OBRisk1 getRisk() {
        return risk;
    }

    /**
     * Sets the value of the risk property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBRisk1 }
     *     
     */
    public void setRisk(OBRisk1 value) {
        this.risk = value;
    }

}
