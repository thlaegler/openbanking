
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Data27 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Data27"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConsentId"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="128"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Initiation" type="{http://laegler.com/openbanking/soap/model}Initiation"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Data27", propOrder = {
    "consentId",
    "initiation"
})
public class Data27 {

    @XmlElement(name = "ConsentId", required = true)
    protected String consentId;
    @XmlElement(name = "Initiation", required = true)
    protected Initiation initiation;

    /**
     * Gets the value of the consentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsentId() {
        return consentId;
    }

    /**
     * Sets the value of the consentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsentId(String value) {
        this.consentId = value;
    }

    /**
     * Gets the value of the initiation property.
     * 
     * @return
     *     possible object is
     *     {@link Initiation }
     *     
     */
    public Initiation getInitiation() {
        return initiation;
    }

    /**
     * Sets the value of the initiation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Initiation }
     *     
     */
    public void setInitiation(Initiation value) {
        this.initiation = value;
    }

}
