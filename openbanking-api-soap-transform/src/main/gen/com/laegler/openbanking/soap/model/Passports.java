
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Passports complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Passports"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nca_name" type="{http://laegler.com/openbanking/soap/model}NcaName" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Passports", propOrder = {
    "ncaName"
})
public class Passports {

    @XmlElement(name = "nca_name")
    protected NcaName ncaName;

    /**
     * Gets the value of the ncaName property.
     * 
     * @return
     *     possible object is
     *     {@link NcaName }
     *     
     */
    public NcaName getNcaName() {
        return ncaName;
    }

    /**
     * Sets the value of the ncaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NcaName }
     *     
     */
    public void setNcaName(NcaName value) {
        this.ncaName = value;
    }

}
