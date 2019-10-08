
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Set of elements used to define the balance as a numerical representation of the net increases and decreases in an account after a transaction entry is applied to the account.
 * 
 * <p>Java class for OBTransactionCashBalance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OBTransactionCashBalance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Amount" type="{http://laegler.com/openbanking/soap/model}Amount2"/&gt;
 *         &lt;element name="CreditDebitIndicator" type="{http://laegler.com/openbanking/soap/model}OBCreditDebitCode_2"/&gt;
 *         &lt;element name="Type" type="{http://laegler.com/openbanking/soap/model}OBBalanceType1Code"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OBTransactionCashBalance", propOrder = {
    "amount",
    "creditDebitIndicator",
    "type"
})
public class OBTransactionCashBalance {

    @XmlElement(name = "Amount", required = true)
    protected Amount2 amount;
    @XmlElement(name = "CreditDebitIndicator", required = true)
    @XmlSchemaType(name = "string")
    protected OBCreditDebitCode2 creditDebitIndicator;
    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected OBBalanceType1Code type;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Amount2 }
     *     
     */
    public Amount2 getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount2 }
     *     
     */
    public void setAmount(Amount2 value) {
        this.amount = value;
    }

    /**
     * Gets the value of the creditDebitIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link OBCreditDebitCode2 }
     *     
     */
    public OBCreditDebitCode2 getCreditDebitIndicator() {
        return creditDebitIndicator;
    }

    /**
     * Sets the value of the creditDebitIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBCreditDebitCode2 }
     *     
     */
    public void setCreditDebitIndicator(OBCreditDebitCode2 value) {
        this.creditDebitIndicator = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link OBBalanceType1Code }
     *     
     */
    public OBBalanceType1Code getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBBalanceType1Code }
     *     
     */
    public void setType(OBBalanceType1Code value) {
        this.type = value;
    }

}
