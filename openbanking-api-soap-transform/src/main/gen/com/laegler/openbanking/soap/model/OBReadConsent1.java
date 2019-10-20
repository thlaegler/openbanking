
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OBReadConsent1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OBReadConsent1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Data" type="{http://laegler.com/openbanking/soap/model}Data16"/&gt;
 *         &lt;element name="Risk" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OBReadConsent1", propOrder = {
    "data",
    "risk"
})
public class OBReadConsent1 {

    @XmlElement(name = "Data", required = true)
    protected Data16 data;
    @XmlElement(name = "Risk", required = true)
    protected Object risk;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link Data16 }
     *     
     */
    public Data16 getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link Data16 }
     *     
     */
    public void setData(Data16 value) {
        this.data = value;
    }

    /**
     * Gets the value of the risk property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRisk() {
        return risk;
    }

    /**
     * Sets the value of the risk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRisk(Object value) {
        this.risk = value;
    }

}
