
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Set of elements used to provide details of a charge for the payment initiation.
 * 
 * <p>Java class for Charge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Charge"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Amount" type="{http://laegler.com/openbanking/soap/model}OBActiveOrHistoricCurrencyAndAmount"/&gt;
 *         &lt;element name="ChargeBearer" type="{http://laegler.com/openbanking/soap/model}OBChargeBearerType1Code"/&gt;
 *         &lt;element name="Type"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Charge", propOrder = {
    "amount",
    "chargeBearer",
    "type"
})
public class Charge {

    @XmlElement(name = "Amount", required = true)
    protected OBActiveOrHistoricCurrencyAndAmount amount;
    @XmlElement(name = "ChargeBearer", required = true)
    @XmlSchemaType(name = "string")
    protected OBChargeBearerType1Code chargeBearer;
    @XmlElement(name = "Type", required = true)
    protected String type;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link OBActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public OBActiveOrHistoricCurrencyAndAmount getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setAmount(OBActiveOrHistoricCurrencyAndAmount value) {
        this.amount = value;
    }

    /**
     * Gets the value of the chargeBearer property.
     * 
     * @return
     *     possible object is
     *     {@link OBChargeBearerType1Code }
     *     
     */
    public OBChargeBearerType1Code getChargeBearer() {
        return chargeBearer;
    }

    /**
     * Sets the value of the chargeBearer property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBChargeBearerType1Code }
     *     
     */
    public void setChargeBearer(OBChargeBearerType1Code value) {
        this.chargeBearer = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
