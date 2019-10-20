
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
 *         &lt;element name="OrganisationId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SoftwareStatementId"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="22"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CSROrKey" type="{http://laegler.com/openbanking/soap/model}CertificateOrKeyGetSchema"/&gt;
 *         &lt;element name="OrganisationType" type="{http://laegler.com/openbanking/soap/model}OrganisationType"/&gt;
 *         &lt;element name="SoftwareStatementCertificateOrKeyType" type="{http://laegler.com/openbanking/soap/model}SoftwareStatementCertificateOrKeyType"/&gt;
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
    "organisationId",
    "softwareStatementId",
    "csrOrKey",
    "organisationType",
    "softwareStatementCertificateOrKeyType"
})
@XmlRootElement(name = "POST_Addakeyorcreateanewcertificateforthegivensoftwarestatement_InputMessage")
public class POSTAddakeyorcreateanewcertificateforthegivensoftwarestatementInputMessage {

    @XmlElement(name = "OrganisationId", required = true)
    protected String organisationId;
    @XmlElement(name = "SoftwareStatementId", required = true)
    protected String softwareStatementId;
    @XmlElement(name = "CSROrKey", required = true)
    protected CertificateOrKeyGetSchema csrOrKey;
    @XmlElement(name = "OrganisationType", required = true)
    @XmlSchemaType(name = "string")
    protected OrganisationType organisationType;
    @XmlElement(name = "SoftwareStatementCertificateOrKeyType", required = true)
    @XmlSchemaType(name = "string")
    protected SoftwareStatementCertificateOrKeyType softwareStatementCertificateOrKeyType;

    /**
     * Gets the value of the organisationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationId() {
        return organisationId;
    }

    /**
     * Sets the value of the organisationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationId(String value) {
        this.organisationId = value;
    }

    /**
     * Gets the value of the softwareStatementId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftwareStatementId() {
        return softwareStatementId;
    }

    /**
     * Sets the value of the softwareStatementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftwareStatementId(String value) {
        this.softwareStatementId = value;
    }

    /**
     * Gets the value of the csrOrKey property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateOrKeyGetSchema }
     *     
     */
    public CertificateOrKeyGetSchema getCSROrKey() {
        return csrOrKey;
    }

    /**
     * Sets the value of the csrOrKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateOrKeyGetSchema }
     *     
     */
    public void setCSROrKey(CertificateOrKeyGetSchema value) {
        this.csrOrKey = value;
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

    /**
     * Gets the value of the softwareStatementCertificateOrKeyType property.
     * 
     * @return
     *     possible object is
     *     {@link SoftwareStatementCertificateOrKeyType }
     *     
     */
    public SoftwareStatementCertificateOrKeyType getSoftwareStatementCertificateOrKeyType() {
        return softwareStatementCertificateOrKeyType;
    }

    /**
     * Sets the value of the softwareStatementCertificateOrKeyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoftwareStatementCertificateOrKeyType }
     *     
     */
    public void setSoftwareStatementCertificateOrKeyType(SoftwareStatementCertificateOrKeyType value) {
        this.softwareStatementCertificateOrKeyType = value;
    }

}
