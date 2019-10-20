
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Set of elements used to provide details of a generic amount for the statement resource.
 * 
 * <p>Java class for StatementAmount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatementAmount"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Amount" type="{http://laegler.com/openbanking/soap/model}OBActiveOrHistoricCurrencyAndAmount_6"/&gt;
 *         &lt;element name="CreditDebitIndicator" type="{http://laegler.com/openbanking/soap/model}OBCreditDebitCode_0"/&gt;
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
@XmlType(name = "StatementAmount", propOrder = {
    "amount",
    "creditDebitIndicator",
    "type"
})
public class StatementAmount {

    @XmlElement(name = "Amount", required = true)
    protected OBActiveOrHistoricCurrencyAndAmount6 amount;
    @XmlElement(name = "CreditDebitIndicator", required = true)
    @XmlSchemaType(name = "string")
    protected OBCreditDebitCode0 creditDebitIndicator;
    @XmlElement(name = "Type", required = true)
    protected String type;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link OBActiveOrHistoricCurrencyAndAmount6 }
     *     
     */
    public OBActiveOrHistoricCurrencyAndAmount6 getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBActiveOrHistoricCurrencyAndAmount6 }
     *     
     */
    public void setAmount(OBActiveOrHistoricCurrencyAndAmount6 value) {
        this.amount = value;
    }

    /**
     * Gets the value of the creditDebitIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link OBCreditDebitCode0 }
     *     
     */
    public OBCreditDebitCode0 getCreditDebitIndicator() {
        return creditDebitIndicator;
    }

    /**
     * Sets the value of the creditDebitIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBCreditDebitCode0 }
     *     
     */
    public void setCreditDebitIndicator(OBCreditDebitCode0 value) {
        this.creditDebitIndicator = value;
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
