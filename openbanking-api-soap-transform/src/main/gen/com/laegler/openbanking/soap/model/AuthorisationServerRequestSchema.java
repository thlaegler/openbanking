
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthorisationServerRequestSchema complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthorisationServerRequestSchema"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AutoRegistrationSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BaseApiDNSUri" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="256"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CustomerFriendlyDescription" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="256"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CustomerFriendlyLogoUri" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="256"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CustomerFriendlyName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="256"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DeveloperPortalUri" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="256"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EISCDId" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="256"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OpenIDConfigEndPointUri" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="256"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ParentAuthorisationServerId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="22"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PayloadSigningCertLocation" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="256"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TermsOfService" minOccurs="0"&gt;
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
@XmlType(name = "AuthorisationServerRequestSchema", propOrder = {
    "autoRegistrationSupported",
    "baseApiDNSUri",
    "customerFriendlyDescription",
    "customerFriendlyLogoUri",
    "customerFriendlyName",
    "developerPortalUri",
    "eiscdId",
    "openIDConfigEndPointUri",
    "parentAuthorisationServerId",
    "payloadSigningCertLocation",
    "termsOfService"
})
public class AuthorisationServerRequestSchema {

    @XmlElement(name = "AutoRegistrationSupported")
    protected Boolean autoRegistrationSupported;
    @XmlElement(name = "BaseApiDNSUri")
    protected String baseApiDNSUri;
    @XmlElement(name = "CustomerFriendlyDescription")
    protected String customerFriendlyDescription;
    @XmlElement(name = "CustomerFriendlyLogoUri")
    protected String customerFriendlyLogoUri;
    @XmlElement(name = "CustomerFriendlyName")
    protected String customerFriendlyName;
    @XmlElement(name = "DeveloperPortalUri")
    protected String developerPortalUri;
    @XmlElement(name = "EISCDId")
    protected List<String> eiscdId;
    @XmlElement(name = "OpenIDConfigEndPointUri")
    protected String openIDConfigEndPointUri;
    @XmlElement(name = "ParentAuthorisationServerId")
    protected String parentAuthorisationServerId;
    @XmlElement(name = "PayloadSigningCertLocation")
    protected String payloadSigningCertLocation;
    @XmlElement(name = "TermsOfService")
    protected String termsOfService;

    /**
     * Gets the value of the autoRegistrationSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoRegistrationSupported() {
        return autoRegistrationSupported;
    }

    /**
     * Sets the value of the autoRegistrationSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoRegistrationSupported(Boolean value) {
        this.autoRegistrationSupported = value;
    }

    /**
     * Gets the value of the baseApiDNSUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseApiDNSUri() {
        return baseApiDNSUri;
    }

    /**
     * Sets the value of the baseApiDNSUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseApiDNSUri(String value) {
        this.baseApiDNSUri = value;
    }

    /**
     * Gets the value of the customerFriendlyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerFriendlyDescription() {
        return customerFriendlyDescription;
    }

    /**
     * Sets the value of the customerFriendlyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerFriendlyDescription(String value) {
        this.customerFriendlyDescription = value;
    }

    /**
     * Gets the value of the customerFriendlyLogoUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerFriendlyLogoUri() {
        return customerFriendlyLogoUri;
    }

    /**
     * Sets the value of the customerFriendlyLogoUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerFriendlyLogoUri(String value) {
        this.customerFriendlyLogoUri = value;
    }

    /**
     * Gets the value of the customerFriendlyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerFriendlyName() {
        return customerFriendlyName;
    }

    /**
     * Sets the value of the customerFriendlyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerFriendlyName(String value) {
        this.customerFriendlyName = value;
    }

    /**
     * Gets the value of the developerPortalUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeveloperPortalUri() {
        return developerPortalUri;
    }

    /**
     * Sets the value of the developerPortalUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeveloperPortalUri(String value) {
        this.developerPortalUri = value;
    }

    /**
     * Gets the value of the eiscdId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eiscdId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEISCDId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEISCDId() {
        if (eiscdId == null) {
            eiscdId = new ArrayList<String>();
        }
        return this.eiscdId;
    }

    /**
     * Gets the value of the openIDConfigEndPointUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenIDConfigEndPointUri() {
        return openIDConfigEndPointUri;
    }

    /**
     * Sets the value of the openIDConfigEndPointUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenIDConfigEndPointUri(String value) {
        this.openIDConfigEndPointUri = value;
    }

    /**
     * Gets the value of the parentAuthorisationServerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentAuthorisationServerId() {
        return parentAuthorisationServerId;
    }

    /**
     * Sets the value of the parentAuthorisationServerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentAuthorisationServerId(String value) {
        this.parentAuthorisationServerId = value;
    }

    /**
     * Gets the value of the payloadSigningCertLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayloadSigningCertLocation() {
        return payloadSigningCertLocation;
    }

    /**
     * Sets the value of the payloadSigningCertLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayloadSigningCertLocation(String value) {
        this.payloadSigningCertLocation = value;
    }

    /**
     * Gets the value of the termsOfService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermsOfService() {
        return termsOfService;
    }

    /**
     * Sets the value of the termsOfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermsOfService(String value) {
        this.termsOfService = value;
    }

}
