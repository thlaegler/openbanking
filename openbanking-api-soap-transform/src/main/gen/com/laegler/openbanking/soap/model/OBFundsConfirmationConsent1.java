
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OBFundsConfirmationConsent1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OBFundsConfirmationConsent1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Data" type="{http://laegler.com/openbanking/soap/model}Data9"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OBFundsConfirmationConsent1", propOrder = {
    "data"
})
public class OBFundsConfirmationConsent1 {

    @XmlElement(name = "Data", required = true)
    protected Data9 data;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link Data9 }
     *     
     */
    public Data9 getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link Data9 }
     *     
     */
    public void setData(Data9 value) {
        this.data = value;
    }

}
