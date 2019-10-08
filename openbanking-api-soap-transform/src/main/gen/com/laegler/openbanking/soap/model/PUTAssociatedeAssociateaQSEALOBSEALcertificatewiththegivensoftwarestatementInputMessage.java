
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
 *         &lt;element name="CertificateOrKeyAssociation" type="{http://laegler.com/openbanking/soap/model}CertificateOrKeyAssociationSchema"/&gt;
 *         &lt;element name="OrganisationType" type="{http://laegler.com/openbanking/soap/model}OrganisationType"/&gt;
 *         &lt;element name="OrganisationId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SoftwareStatementId"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="22"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OrganisationAssociativeCertificateType" type="{http://laegler.com/openbanking/soap/model}OrganisationAssociativeCertificateType"/&gt;
 *         &lt;element name="CertificateOrKeyId"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="256"/&gt;
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
@XmlType(name = "", propOrder = {
    "certificateOrKeyAssociation",
    "organisationType",
    "organisationId",
    "softwareStatementId",
    "organisationAssociativeCertificateType",
    "certificateOrKeyId"
})
@XmlRootElement(name = "PUT_Associatede-associateaQSEALOBSEALcertificatewiththegivensoftwarestatement_InputMessage")
public class PUTAssociatedeAssociateaQSEALOBSEALcertificatewiththegivensoftwarestatementInputMessage {

    @XmlElement(name = "CertificateOrKeyAssociation", required = true)
    protected CertificateOrKeyAssociationSchema certificateOrKeyAssociation;
    @XmlElement(name = "OrganisationType", required = true)
    @XmlSchemaType(name = "string")
    protected OrganisationType organisationType;
    @XmlElement(name = "OrganisationId", required = true)
    protected String organisationId;
    @XmlElement(name = "SoftwareStatementId", required = true)
    protected String softwareStatementId;
    @XmlElement(name = "OrganisationAssociativeCertificateType", required = true)
    @XmlSchemaType(name = "string")
    protected OrganisationAssociativeCertificateType organisationAssociativeCertificateType;
    @XmlElement(name = "CertificateOrKeyId", required = true)
    protected String certificateOrKeyId;

    /**
     * Gets the value of the certificateOrKeyAssociation property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateOrKeyAssociationSchema }
     *     
     */
    public CertificateOrKeyAssociationSchema getCertificateOrKeyAssociation() {
        return certificateOrKeyAssociation;
    }

    /**
     * Sets the value of the certificateOrKeyAssociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateOrKeyAssociationSchema }
     *     
     */
    public void setCertificateOrKeyAssociation(CertificateOrKeyAssociationSchema value) {
        this.certificateOrKeyAssociation = value;
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
     * Gets the value of the organisationAssociativeCertificateType property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationAssociativeCertificateType }
     *     
     */
    public OrganisationAssociativeCertificateType getOrganisationAssociativeCertificateType() {
        return organisationAssociativeCertificateType;
    }

    /**
     * Sets the value of the organisationAssociativeCertificateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationAssociativeCertificateType }
     *     
     */
    public void setOrganisationAssociativeCertificateType(OrganisationAssociativeCertificateType value) {
        this.organisationAssociativeCertificateType = value;
    }

    /**
     * Gets the value of the certificateOrKeyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateOrKeyId() {
        return certificateOrKeyId;
    }

    /**
     * Sets the value of the certificateOrKeyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateOrKeyId(String value) {
        this.certificateOrKeyId = value;
    }

}
