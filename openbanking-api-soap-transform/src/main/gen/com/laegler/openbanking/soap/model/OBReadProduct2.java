
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Product details of Other Product which is not avaiable in the standard list
 * 
 * <p>Java class for OBReadProduct2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OBReadProduct2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Data" type="{http://laegler.com/openbanking/soap/model}Data23"/&gt;
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
@XmlType(name = "OBReadProduct2", propOrder = {
    "data",
    "links",
    "meta"
})
public class OBReadProduct2 {

    @XmlElement(name = "Data", required = true)
    protected Data23 data;
    @XmlElement(name = "Links")
    protected Links links;
    @XmlElement(name = "Meta")
    protected MetaData meta;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link Data23 }
     *     
     */
    public Data23 getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link Data23 }
     *     
     */
    public void setData(Data23 value) {
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
