
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OBBeneficiary3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OBBeneficiary3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BeneficiaryId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CreditorAccount" type="{http://laegler.com/openbanking/soap/model}OBCashAccount5_1" minOccurs="0"/&gt;
 *         &lt;element name="CreditorAgent" type="{http://laegler.com/openbanking/soap/model}OBBranchAndFinancialInstitutionIdentification6_2" minOccurs="0"/&gt;
 *         &lt;element name="Reference" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
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
@XmlType(name = "OBBeneficiary3", propOrder = {
    "accountId",
    "beneficiaryId",
    "creditorAccount",
    "creditorAgent",
    "reference"
})
public class OBBeneficiary3 {

    @XmlElement(name = "AccountId")
    protected String accountId;
    @XmlElement(name = "BeneficiaryId")
    protected String beneficiaryId;
    @XmlElement(name = "CreditorAccount")
    protected OBCashAccount51 creditorAccount;
    @XmlElement(name = "CreditorAgent")
    protected OBBranchAndFinancialInstitutionIdentification62 creditorAgent;
    @XmlElement(name = "Reference")
    protected String reference;

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
     * Gets the value of the beneficiaryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryId() {
        return beneficiaryId;
    }

    /**
     * Sets the value of the beneficiaryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryId(String value) {
        this.beneficiaryId = value;
    }

    /**
     * Gets the value of the creditorAccount property.
     * 
     * @return
     *     possible object is
     *     {@link OBCashAccount51 }
     *     
     */
    public OBCashAccount51 getCreditorAccount() {
        return creditorAccount;
    }

    /**
     * Sets the value of the creditorAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBCashAccount51 }
     *     
     */
    public void setCreditorAccount(OBCashAccount51 value) {
        this.creditorAccount = value;
    }

    /**
     * Gets the value of the creditorAgent property.
     * 
     * @return
     *     possible object is
     *     {@link OBBranchAndFinancialInstitutionIdentification62 }
     *     
     */
    public OBBranchAndFinancialInstitutionIdentification62 getCreditorAgent() {
        return creditorAgent;
    }

    /**
     * Sets the value of the creditorAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBBranchAndFinancialInstitutionIdentification62 }
     *     
     */
    public void setCreditorAgent(OBBranchAndFinancialInstitutionIdentification62 value) {
        this.creditorAgent = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

}
