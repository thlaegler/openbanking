
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Set of elements used to provide details on the credit line.
 * 
 * <p>Java class for CreditLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditLine"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Amount" type="{http://laegler.com/openbanking/soap/model}Amount1" minOccurs="0"/&gt;
 *         &lt;element name="Included" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Type" type="{http://laegler.com/openbanking/soap/model}Type18" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditLine", propOrder = {
    "amount",
    "included",
    "type"
})
public class CreditLine {

    @XmlElement(name = "Amount")
    protected Amount1 amount;
    @XmlElement(name = "Included")
    protected boolean included;
    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected Type18 type;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Amount1 }
     *     
     */
    public Amount1 getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount1 }
     *     
     */
    public void setAmount(Amount1 value) {
        this.amount = value;
    }

    /**
     * Gets the value of the included property.
     * 
     */
    public boolean isIncluded() {
        return included;
    }

    /**
     * Sets the value of the included property.
     * 
     */
    public void setIncluded(boolean value) {
        this.included = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Type18 }
     *     
     */
    public Type18 getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Type18 }
     *     
     */
    public void setType(Type18 value) {
        this.type = value;
    }

}
