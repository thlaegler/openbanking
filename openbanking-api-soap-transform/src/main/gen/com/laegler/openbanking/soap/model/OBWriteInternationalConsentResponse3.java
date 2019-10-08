
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OBWriteInternationalConsentResponse3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OBWriteInternationalConsentResponse3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Data" type="{http://laegler.com/openbanking/soap/model}Data46"/&gt;
 *         &lt;element name="Links" type="{http://laegler.com/openbanking/soap/model}Links" minOccurs="0"/&gt;
 *         &lt;element name="Meta" type="{http://laegler.com/openbanking/soap/model}MetaData" minOccurs="0"/&gt;
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
@XmlType(name = "OBWriteInternationalConsentResponse3", propOrder = {
    "data",
    "links",
    "meta",
    "risk"
})
public class OBWriteInternationalConsentResponse3 {

    @XmlElement(name = "Data", required = true)
    protected Data46 data;
    @XmlElement(name = "Links")
    protected Links links;
    @XmlElement(name = "Meta")
    protected MetaData meta;
    @XmlElement(name = "Risk", required = true)
    protected OBRisk1 risk;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link Data46 }
     *     
     */
    public Data46 getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link Data46 }
     *     
     */
    public void setData(Data46 value) {
        this.data = value;
    }

    /**
     * Gets the value of the links property.
     * 
     * @return
     *     possible object is
     *     {@link Links }
     *     
     */
    public Links getLinks() {
        return links;
    }

    /**
     * Sets the value of the links property.
     * 
     * @param value
     *     allowed object is
     *     {@link Links }
     *     
     */
    public void setLinks(Links value) {
        this.links = value;
    }

    /**
     * Gets the value of the meta property.
     * 
     * @return
     *     possible object is
     *     {@link MetaData }
     *     
     */
    public MetaData getMeta() {
        return meta;
    }

    /**
     * Sets the value of the meta property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaData }
     *     
     */
    public void setMeta(MetaData value) {
        this.meta = value;
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
