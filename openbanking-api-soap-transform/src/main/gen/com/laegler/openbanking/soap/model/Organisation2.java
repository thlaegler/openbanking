
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Account details for an open banking organisation which are used for SCIM access to the Directory on behalf of an accredited organisation.
 * 
 * <p>Java class for Organisation2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organisation2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CreateTimestamp" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EmailAddresses" type="{http://laegler.com/openbanking/soap/model}EmailAddress" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ModifyTimestamp" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OBAuthorisationState" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OBOrganisationId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OrganisationCommonName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PersonalAccountRoles" type="{http://laegler.com/openbanking/soap/model}PersonalAccountRole" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNumbers" type="{http://laegler.com/openbanking/soap/model}PhoneNumber1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PostalAddresses" type="{http://laegler.com/openbanking/soap/model}PostalAddress" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="StatusDescription" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="status" minOccurs="0"&gt;
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
@XmlType(name = "Organisation2", propOrder = {
    "createTimestamp",
    "emailAddresses",
    "modifyTimestamp",
    "obAuthorisationState",
    "obOrganisationId",
    "organisationCommonName",
    "personalAccountRoles",
    "phoneNumbers",
    "postalAddresses",
    "statusDescription",
    "status"
})
public class Organisation2 {

    @XmlElement(name = "CreateTimestamp")
    protected String createTimestamp;
    @XmlElement(name = "EmailAddresses")
    protected List<EmailAddress> emailAddresses;
    @XmlElement(name = "ModifyTimestamp")
    protected String modifyTimestamp;
    @XmlElement(name = "OBAuthorisationState")
    protected String obAuthorisationState;
    @XmlElement(name = "OBOrganisationId")
    protected String obOrganisationId;
    @XmlElement(name = "OrganisationCommonName")
    protected String organisationCommonName;
    @XmlElement(name = "PersonalAccountRoles")
    protected List<PersonalAccountRole> personalAccountRoles;
    @XmlElement(name = "PhoneNumbers")
    protected List<PhoneNumber1> phoneNumbers;
    @XmlElement(name = "PostalAddresses")
    protected List<PostalAddress> postalAddresses;
    @XmlElement(name = "StatusDescription")
    protected String statusDescription;
    protected String status;

    /**
     * Gets the value of the createTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateTimestamp() {
        return createTimestamp;
    }

    /**
     * Sets the value of the createTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateTimestamp(String value) {
        this.createTimestamp = value;
    }

    /**
     * Gets the value of the emailAddresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailAddresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmailAddress }
     * 
     * 
     */
    public List<EmailAddress> getEmailAddresses() {
        if (emailAddresses == null) {
            emailAddresses = new ArrayList<EmailAddress>();
        }
        return this.emailAddresses;
    }

    /**
     * Gets the value of the modifyTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifyTimestamp() {
        return modifyTimestamp;
    }

    /**
     * Sets the value of the modifyTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifyTimestamp(String value) {
        this.modifyTimestamp = value;
    }

    /**
     * Gets the value of the obAuthorisationState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOBAuthorisationState() {
        return obAuthorisationState;
    }

    /**
     * Sets the value of the obAuthorisationState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOBAuthorisationState(String value) {
        this.obAuthorisationState = value;
    }

    /**
     * Gets the value of the obOrganisationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOBOrganisationId() {
        return obOrganisationId;
    }

    /**
     * Sets the value of the obOrganisationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOBOrganisationId(String value) {
        this.obOrganisationId = value;
    }

    /**
     * Gets the value of the organisationCommonName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationCommonName() {
        return organisationCommonName;
    }

    /**
     * Sets the value of the organisationCommonName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationCommonName(String value) {
        this.organisationCommonName = value;
    }

    /**
     * Gets the value of the personalAccountRoles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personalAccountRoles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonalAccountRoles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonalAccountRole }
     * 
     * 
     */
    public List<PersonalAccountRole> getPersonalAccountRoles() {
        if (personalAccountRoles == null) {
            personalAccountRoles = new ArrayList<PersonalAccountRole>();
        }
        return this.personalAccountRoles;
    }

    /**
     * Gets the value of the phoneNumbers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phoneNumbers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhoneNumbers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhoneNumber1 }
     * 
     * 
     */
    public List<PhoneNumber1> getPhoneNumbers() {
        if (phoneNumbers == null) {
            phoneNumbers = new ArrayList<PhoneNumber1>();
        }
        return this.phoneNumbers;
    }

    /**
     * Gets the value of the postalAddresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the postalAddresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPostalAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PostalAddress }
     * 
     * 
     */
    public List<PostalAddress> getPostalAddresses() {
        if (postalAddresses == null) {
            postalAddresses = new ArrayList<PostalAddress>();
        }
        return this.postalAddresses;
    }

    /**
     * Gets the value of the statusDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDescription() {
        return statusDescription;
    }

    /**
     * Sets the value of the statusDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDescription(String value) {
        this.statusDescription = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
