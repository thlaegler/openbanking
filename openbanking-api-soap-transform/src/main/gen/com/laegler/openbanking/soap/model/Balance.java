
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Set of elements used to define the balance details.
 * 
 * <p>Java class for Balance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Balance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountId"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Amount" type="{http://laegler.com/openbanking/soap/model}Amount"/&gt;
 *         &lt;element name="CreditDebitIndicator" type="{http://laegler.com/openbanking/soap/model}OBCreditDebitCode_2"/&gt;
 *         &lt;element name="CreditLine" type="{http://laegler.com/openbanking/soap/model}CreditLine" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
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
@XmlType(name = "Balance", propOrder = {
    "accountId",
    "amount",
    "creditDebitIndicator",
    "creditLine",
    "dateTime",
    "type"
})
public class Balance {

    @XmlElement(name = "AccountId", required = true)
    protected String accountId;
    @XmlElement(name = "Amount", required = true)
    protected Amount amount;
    @XmlElement(name = "CreditDebitIndicator", required = true)
    @XmlSchemaType(name = "string")
    protected OBCreditDebitCode2 creditDebitIndicator;
    @XmlElement(name = "CreditLine")
    protected List<CreditLine> creditLine;
    @XmlElement(name = "DateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected OBBalanceType1Code type;

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setAmount(Amount value) {
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
     * Gets the value of the creditLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditLine }
     * 
     * 
     */
    public List<CreditLine> getCreditLine() {
        if (creditLine == null) {
            creditLine = new ArrayList<CreditLine>();
        }
        return this.creditLine;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
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
