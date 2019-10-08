
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OBParty2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OBParty2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountRole" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Address" type="{http://laegler.com/openbanking/soap/model}Address" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BeneficialOwnership" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EmailAddress" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="256"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FullLegalName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="350"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LegalStructure" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Mobile" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\+[0-9]{1,3}-[0-9()+\-]{1,30}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Name" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PartyId"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PartyNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PartyType" type="{http://laegler.com/openbanking/soap/model}OBExternalPartyType1Code" minOccurs="0"/&gt;
 *         &lt;element name="Phone" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\+[0-9]{1,3}-[0-9()+\-]{1,30}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Relationships" type="{http://laegler.com/openbanking/soap/model}OBPartyRelationships1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OBParty2", propOrder = {
    "accountRole",
    "address",
    "beneficialOwnership",
    "emailAddress",
    "fullLegalName",
    "legalStructure",
    "mobile",
    "name",
    "partyId",
    "partyNumber",
    "partyType",
    "phone",
    "relationships"
})
public class OBParty2 {

    @XmlElement(name = "AccountRole")
    protected String accountRole;
    @XmlElement(name = "Address")
    protected List<Address> address;
    @XmlElement(name = "BeneficialOwnership")
    protected Boolean beneficialOwnership;
    @XmlElement(name = "EmailAddress")
    protected String emailAddress;
    @XmlElement(name = "FullLegalName")
    protected String fullLegalName;
    @XmlElement(name = "LegalStructure")
    protected String legalStructure;
    @XmlElement(name = "Mobile")
    protected String mobile;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "PartyId", required = true)
    protected String partyId;
    @XmlElement(name = "PartyNumber")
    protected String partyNumber;
    @XmlElement(name = "PartyType")
    @XmlSchemaType(name = "string")
    protected OBExternalPartyType1Code partyType;
    @XmlElement(name = "Phone")
    protected String phone;
    @XmlElement(name = "Relationships")
    protected OBPartyRelationships1 relationships;

    /**
     * Gets the value of the accountRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountRole() {
        return accountRole;
    }

    /**
     * Sets the value of the accountRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountRole(String value) {
        this.accountRole = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Address }
     * 
     * 
     */
    public List<Address> getAddress() {
        if (address == null) {
            address = new ArrayList<Address>();
        }
        return this.address;
    }

    /**
     * Gets the value of the beneficialOwnership property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBeneficialOwnership() {
        return beneficialOwnership;
    }

    /**
     * Sets the value of the beneficialOwnership property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBeneficialOwnership(Boolean value) {
        this.beneficialOwnership = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the fullLegalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullLegalName() {
        return fullLegalName;
    }

    /**
     * Sets the value of the fullLegalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullLegalName(String value) {
        this.fullLegalName = value;
    }

    /**
     * Gets the value of the legalStructure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalStructure() {
        return legalStructure;
    }

    /**
     * Sets the value of the legalStructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalStructure(String value) {
        this.legalStructure = value;
    }

    /**
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the partyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyId() {
        return partyId;
    }

    /**
     * Sets the value of the partyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyId(String value) {
        this.partyId = value;
    }

    /**
     * Gets the value of the partyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyNumber() {
        return partyNumber;
    }

    /**
     * Sets the value of the partyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyNumber(String value) {
        this.partyNumber = value;
    }

    /**
     * Gets the value of the partyType property.
     * 
     * @return
     *     possible object is
     *     {@link OBExternalPartyType1Code }
     *     
     */
    public OBExternalPartyType1Code getPartyType() {
        return partyType;
    }

    /**
     * Sets the value of the partyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBExternalPartyType1Code }
     *     
     */
    public void setPartyType(OBExternalPartyType1Code value) {
        this.partyType = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the relationships property.
     * 
     * @return
     *     possible object is
     *     {@link OBPartyRelationships1 }
     *     
     */
    public OBPartyRelationships1 getRelationships() {
        return relationships;
    }

    /**
     * Sets the value of the relationships property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBPartyRelationships1 }
     *     
     */
    public void setRelationships(OBPartyRelationships1 value) {
        this.relationships = value;
    }

}
