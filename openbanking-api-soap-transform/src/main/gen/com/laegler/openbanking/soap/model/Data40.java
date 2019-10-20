
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Data40 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Data40"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Authorisation" type="{http://laegler.com/openbanking/soap/model}Authorisation2" minOccurs="0"/&gt;
 *         &lt;element name="Initiation" type="{http://laegler.com/openbanking/soap/model}Initiation12"/&gt;
 *         &lt;element name="SCASupportData" type="{http://laegler.com/openbanking/soap/model}SCASupportData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Data40", propOrder = {
    "authorisation",
    "initiation",
    "scaSupportData"
})
public class Data40 {

    @XmlElement(name = "Authorisation")
    protected Authorisation2 authorisation;
    @XmlElement(name = "Initiation", required = true)
    protected Initiation12 initiation;
    @XmlElement(name = "SCASupportData")
    protected SCASupportData scaSupportData;

    /**
     * Gets the value of the authorisation property.
     * 
     * @return
     *     possible object is
     *     {@link Authorisation2 }
     *     
     */
    public Authorisation2 getAuthorisation() {
        return authorisation;
    }

    /**
     * Sets the value of the authorisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Authorisation2 }
     *     
     */
    public void setAuthorisation(Authorisation2 value) {
        this.authorisation = value;
    }

    /**
     * Gets the value of the initiation property.
     * 
     * @return
     *     possible object is
     *     {@link Initiation12 }
     *     
     */
    public Initiation12 getInitiation() {
        return initiation;
    }

    /**
     * Sets the value of the initiation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Initiation12 }
     *     
     */
    public void setInitiation(Initiation12 value) {
        this.initiation = value;
    }

    /**
     * Gets the value of the scaSupportData property.
     * 
     * @return
     *     possible object is
     *     {@link SCASupportData }
     *     
     */
    public SCASupportData getSCASupportData() {
        return scaSupportData;
    }

    /**
     * Sets the value of the scaSupportData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCASupportData }
     *     
     */
    public void setSCASupportData(SCASupportData value) {
        this.scaSupportData = value;
    }

}
