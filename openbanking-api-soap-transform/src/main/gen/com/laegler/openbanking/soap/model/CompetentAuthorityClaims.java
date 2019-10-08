
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Claims sourced from a competent authority(e.g. FCA) - can be applied to either TPPs to ASPSP
 * 
 * <p>Java class for CompetentAuthorityClaims complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompetentAuthorityClaims"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Authorisations" type="{http://laegler.com/openbanking/soap/model}Authorisation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AuthorityId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EtsiIdentifier" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MemberState" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RegistrationId" minOccurs="0"&gt;
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
@XmlType(name = "CompetentAuthorityClaims", propOrder = {
    "authorisations",
    "authorityId",
    "etsiIdentifier",
    "memberState",
    "registrationId"
})
public class CompetentAuthorityClaims {

    @XmlElement(name = "Authorisations")
    protected List<Authorisation> authorisations;
    @XmlElement(name = "AuthorityId")
    protected String authorityId;
    @XmlElement(name = "EtsiIdentifier")
    protected String etsiIdentifier;
    @XmlElement(name = "MemberState")
    protected String memberState;
    @XmlElement(name = "RegistrationId")
    protected String registrationId;

    /**
     * Gets the value of the authorisations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authorisations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorisations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Authorisation }
     * 
     * 
     */
    public List<Authorisation> getAuthorisations() {
        if (authorisations == null) {
            authorisations = new ArrayList<Authorisation>();
        }
        return this.authorisations;
    }

    /**
     * Gets the value of the authorityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorityId() {
        return authorityId;
    }

    /**
     * Sets the value of the authorityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorityId(String value) {
        this.authorityId = value;
    }

    /**
     * Gets the value of the etsiIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtsiIdentifier() {
        return etsiIdentifier;
    }

    /**
     * Sets the value of the etsiIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtsiIdentifier(String value) {
        this.etsiIdentifier = value;
    }

    /**
     * Gets the value of the memberState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberState() {
        return memberState;
    }

    /**
     * Sets the value of the memberState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberState(String value) {
        this.memberState = value;
    }

    /**
     * Gets the value of the registrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationId() {
        return registrationId;
    }

    /**
     * Sets the value of the registrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationId(String value) {
        this.registrationId = value;
    }

}
