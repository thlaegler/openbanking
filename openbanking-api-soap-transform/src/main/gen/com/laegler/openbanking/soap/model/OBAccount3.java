
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Unambiguous identification of the account to which credit and debit entries are made.
 * 
 * <p>Java class for OBAccount3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OBAccount3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Account" type="{http://laegler.com/openbanking/soap/model}Account" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AccountId"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AccountSubType" type="{http://laegler.com/openbanking/soap/model}OBExternalAccountSubType1Code"/&gt;
 *         &lt;element name="AccountType" type="{http://laegler.com/openbanking/soap/model}OBExternalAccountType1Code"/&gt;
 *         &lt;element name="Currency"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^[A-Z]{3,3}$"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Description" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Nickname" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Servicer" type="{http://laegler.com/openbanking/soap/model}OBBranchAndFinancialInstitutionIdentification5_0" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OBAccount3", propOrder = {
    "account",
    "accountId",
    "accountSubType",
    "accountType",
    "currency",
    "description",
    "nickname",
    "servicer"
})
public class OBAccount3 {

    @XmlElement(name = "Account")
    protected List<Account> account;
    @XmlElement(name = "AccountId", required = true)
    protected String accountId;
    @XmlElement(name = "AccountSubType", required = true)
    @XmlSchemaType(name = "string")
    protected OBExternalAccountSubType1Code accountSubType;
    @XmlElement(name = "AccountType", required = true)
    @XmlSchemaType(name = "string")
    protected OBExternalAccountType1Code accountType;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Nickname")
    protected String nickname;
    @XmlElement(name = "Servicer")
    protected OBBranchAndFinancialInstitutionIdentification50 servicer;

    /**
     * Gets the value of the account property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the account property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Account }
     * 
     * 
     */
    public List<Account> getAccount() {
        if (account == null) {
            account = new ArrayList<Account>();
        }
        return this.account;
    }

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
     * Gets the value of the accountSubType property.
     * 
     * @return
     *     possible object is
     *     {@link OBExternalAccountSubType1Code }
     *     
     */
    public OBExternalAccountSubType1Code getAccountSubType() {
        return accountSubType;
    }

    /**
     * Sets the value of the accountSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBExternalAccountSubType1Code }
     *     
     */
    public void setAccountSubType(OBExternalAccountSubType1Code value) {
        this.accountSubType = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link OBExternalAccountType1Code }
     *     
     */
    public OBExternalAccountType1Code getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBExternalAccountType1Code }
     *     
     */
    public void setAccountType(OBExternalAccountType1Code value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the nickname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * Sets the value of the nickname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickname(String value) {
        this.nickname = value;
    }

    /**
     * Gets the value of the servicer property.
     * 
     * @return
     *     possible object is
     *     {@link OBBranchAndFinancialInstitutionIdentification50 }
     *     
     */
    public OBBranchAndFinancialInstitutionIdentification50 getServicer() {
        return servicer;
    }

    /**
     * Sets the value of the servicer property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBBranchAndFinancialInstitutionIdentification50 }
     *     
     */
    public void setServicer(OBBranchAndFinancialInstitutionIdentification50 value) {
        this.servicer = value;
    }

}
