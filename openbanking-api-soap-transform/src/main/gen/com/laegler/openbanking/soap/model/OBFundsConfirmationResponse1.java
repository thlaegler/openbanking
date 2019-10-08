
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OBFundsConfirmationResponse1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OBFundsConfirmationResponse1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Data" type="{http://laegler.com/openbanking/soap/model}Data11"/&gt;
 *         &lt;element name="Links" type="{http://laegler.com/openbanking/soap/model}Links" minOccurs="0"/&gt;
 *         &lt;element name="Meta" type="{http://laegler.com/openbanking/soap/model}MetaData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OBFundsConfirmationResponse1", propOrder = {
    "data",
    "links",
    "meta"
})
public class OBFundsConfirmationResponse1 {

    @XmlElement(name = "Data", required = true)
    protected Data11 data;
    @XmlElement(name = "Links")
    protected Links links;
    @XmlElement(name = "Meta")
    protected MetaData meta;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link Data11 }
     *     
     */
    public Data11 getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link Data11 }
     *     
     */
    public void setData(Data11 value) {
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

}
