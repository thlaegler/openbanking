
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Organisation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organisation1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="competent_authority_claims" type="{http://laegler.com/openbanking/soap/model}CompetentAuthorityClaims1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="onboarded_to_open_banking" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="org_name" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="passports" type="{http://laegler.com/openbanking/soap/model}Passports" minOccurs="0"/&gt;
 *         &lt;element name="software_statements" type="{http://laegler.com/openbanking/soap/model}SoftwareStatement2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organisation1", propOrder = {
    "competentAuthorityClaims",
    "onboardedToOpenBanking",
    "orgName",
    "passports",
    "softwareStatements"
})
public class Organisation1 {

    @XmlElement(name = "competent_authority_claims")
    protected List<CompetentAuthorityClaims1> competentAuthorityClaims;
    @XmlElement(name = "onboarded_to_open_banking")
    protected Boolean onboardedToOpenBanking;
    @XmlElement(name = "org_name")
    protected String orgName;
    protected Passports passports;
    @XmlElement(name = "software_statements")
    protected List<SoftwareStatement2> softwareStatements;

    /**
     * Gets the value of the competentAuthorityClaims property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the competentAuthorityClaims property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompetentAuthorityClaims().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompetentAuthorityClaims1 }
     * 
     * 
     */
    public List<CompetentAuthorityClaims1> getCompetentAuthorityClaims() {
        if (competentAuthorityClaims == null) {
            competentAuthorityClaims = new ArrayList<CompetentAuthorityClaims1>();
        }
        return this.competentAuthorityClaims;
    }

    /**
     * Gets the value of the onboardedToOpenBanking property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnboardedToOpenBanking() {
        return onboardedToOpenBanking;
    }

    /**
     * Sets the value of the onboardedToOpenBanking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnboardedToOpenBanking(Boolean value) {
        this.onboardedToOpenBanking = value;
    }

    /**
     * Gets the value of the orgName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * Sets the value of the orgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgName(String value) {
        this.orgName = value;
    }

    /**
     * Gets the value of the passports property.
     * 
     * @return
     *     possible object is
     *     {@link Passports }
     *     
     */
    public Passports getPassports() {
        return passports;
    }

    /**
     * Sets the value of the passports property.
     * 
     * @param value
     *     allowed object is
     *     {@link Passports }
     *     
     */
    public void setPassports(Passports value) {
        this.passports = value;
    }

    /**
     * Gets the value of the softwareStatements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the softwareStatements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSoftwareStatements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoftwareStatement2 }
     * 
     * 
     */
    public List<SoftwareStatement2> getSoftwareStatements() {
        if (softwareStatements == null) {
            softwareStatements = new ArrayList<SoftwareStatement2>();
        }
        return this.softwareStatements;
    }

}
