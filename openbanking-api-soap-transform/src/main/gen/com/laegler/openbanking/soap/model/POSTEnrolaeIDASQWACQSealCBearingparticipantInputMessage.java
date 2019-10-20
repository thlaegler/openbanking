
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrganisationTypeForQSealCOnboarding" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Enrol" type="{http://laegler.com/openbanking/soap/model}EnrolSchema"/&gt;
 *         &lt;element name="OrganisationType" type="{http://laegler.com/openbanking/soap/model}OrganisationType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "organisationTypeForQSealCOnboarding",
    "enrol",
    "organisationType"
})
@XmlRootElement(name = "POST_EnrolaeIDASQWACQSealC-bearingparticipant_InputMessage")
public class POSTEnrolaeIDASQWACQSealCBearingparticipantInputMessage {

    @XmlElement(name = "OrganisationTypeForQSealCOnboarding", required = true)
    protected String organisationTypeForQSealCOnboarding;
    @XmlElement(name = "Enrol", required = true)
    protected EnrolSchema enrol;
    @XmlElement(name = "OrganisationType", required = true)
    @XmlSchemaType(name = "string")
    protected OrganisationType organisationType;

    /**
     * Gets the value of the organisationTypeForQSealCOnboarding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationTypeForQSealCOnboarding() {
        return organisationTypeForQSealCOnboarding;
    }

    /**
     * Sets the value of the organisationTypeForQSealCOnboarding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationTypeForQSealCOnboarding(String value) {
        this.organisationTypeForQSealCOnboarding = value;
    }

    /**
     * Gets the value of the enrol property.
     * 
     * @return
     *     possible object is
     *     {@link EnrolSchema }
     *     
     */
    public EnrolSchema getEnrol() {
        return enrol;
    }

    /**
     * Sets the value of the enrol property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrolSchema }
     *     
     */
    public void setEnrol(EnrolSchema value) {
        this.enrol = value;
    }

    /**
     * Gets the value of the organisationType property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationType }
     *     
     */
    public OrganisationType getOrganisationType() {
        return organisationType;
    }

    /**
     * Sets the value of the organisationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationType }
     *     
     */
    public void setOrganisationType(OrganisationType value) {
        this.organisationType = value;
    }

}
