
package com.laegler.openbanking.soap.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A JSON object DCR response returned when client gets created.
 * 
 * <p>Java class for Enrol201CreatedResponseSchema complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Enrol201CreatedResponseSchema"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="client_id" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *               &lt;minLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="client_id_issued_at" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="client_name" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="client_secret" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="client_secret_expires_at" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="client_uri" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="contacts" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="grant_types" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="jwks" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="jwks_uri" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="logo_uri" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ob_org_id" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *               &lt;minLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="policy_uri" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="redirect_uris" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="response_types" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="scope" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="software_id" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="software_version" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="token_endpoint_auth_method" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="tos_uri" minOccurs="0"&gt;
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
@XmlType(name = "Enrol201CreatedResponseSchema", propOrder = {
    "clientId",
    "clientIdIssuedAt",
    "clientName",
    "clientSecret",
    "clientSecretExpiresAt",
    "clientUri",
    "contacts",
    "grantTypes",
    "jwks",
    "jwksUri",
    "logoUri",
    "obOrgId",
    "policyUri",
    "redirectUris",
    "responseTypes",
    "scope",
    "softwareId",
    "softwareVersion",
    "tokenEndpointAuthMethod",
    "tosUri"
})
public class Enrol201CreatedResponseSchema {

    @XmlElement(name = "client_id")
    protected String clientId;
    @XmlElement(name = "client_id_issued_at")
    protected BigInteger clientIdIssuedAt;
    @XmlElement(name = "client_name")
    protected String clientName;
    @XmlElement(name = "client_secret")
    protected String clientSecret;
    @XmlElement(name = "client_secret_expires_at")
    protected BigInteger clientSecretExpiresAt;
    @XmlElement(name = "client_uri")
    protected String clientUri;
    protected List<String> contacts;
    @XmlElement(name = "grant_types")
    protected String grantTypes;
    protected Object jwks;
    @XmlElement(name = "jwks_uri")
    protected String jwksUri;
    @XmlElement(name = "logo_uri")
    protected String logoUri;
    @XmlElement(name = "ob_org_id")
    protected String obOrgId;
    @XmlElement(name = "policy_uri")
    protected String policyUri;
    @XmlElement(name = "redirect_uris")
    protected List<String> redirectUris;
    @XmlElement(name = "response_types")
    protected String responseTypes;
    protected String scope;
    @XmlElement(name = "software_id")
    protected String softwareId;
    @XmlElement(name = "software_version")
    protected String softwareVersion;
    @XmlElement(name = "token_endpoint_auth_method")
    protected String tokenEndpointAuthMethod;
    @XmlElement(name = "tos_uri")
    protected String tosUri;

    /**
     * Gets the value of the clientId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientId(String value) {
        this.clientId = value;
    }

    /**
     * Gets the value of the clientIdIssuedAt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getClientIdIssuedAt() {
        return clientIdIssuedAt;
    }

    /**
     * Sets the value of the clientIdIssuedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setClientIdIssuedAt(BigInteger value) {
        this.clientIdIssuedAt = value;
    }

    /**
     * Gets the value of the clientName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * Sets the value of the clientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientName(String value) {
        this.clientName = value;
    }

    /**
     * Gets the value of the clientSecret property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientSecret() {
        return clientSecret;
    }

    /**
     * Sets the value of the clientSecret property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientSecret(String value) {
        this.clientSecret = value;
    }

    /**
     * Gets the value of the clientSecretExpiresAt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getClientSecretExpiresAt() {
        return clientSecretExpiresAt;
    }

    /**
     * Sets the value of the clientSecretExpiresAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setClientSecretExpiresAt(BigInteger value) {
        this.clientSecretExpiresAt = value;
    }

    /**
     * Gets the value of the clientUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientUri() {
        return clientUri;
    }

    /**
     * Sets the value of the clientUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientUri(String value) {
        this.clientUri = value;
    }

    /**
     * Gets the value of the contacts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contacts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContacts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getContacts() {
        if (contacts == null) {
            contacts = new ArrayList<String>();
        }
        return this.contacts;
    }

    /**
     * Gets the value of the grantTypes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrantTypes() {
        return grantTypes;
    }

    /**
     * Sets the value of the grantTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrantTypes(String value) {
        this.grantTypes = value;
    }

    /**
     * Gets the value of the jwks property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getJwks() {
        return jwks;
    }

    /**
     * Sets the value of the jwks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setJwks(Object value) {
        this.jwks = value;
    }

    /**
     * Gets the value of the jwksUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJwksUri() {
        return jwksUri;
    }

    /**
     * Sets the value of the jwksUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJwksUri(String value) {
        this.jwksUri = value;
    }

    /**
     * Gets the value of the logoUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogoUri() {
        return logoUri;
    }

    /**
     * Sets the value of the logoUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogoUri(String value) {
        this.logoUri = value;
    }

    /**
     * Gets the value of the obOrgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObOrgId() {
        return obOrgId;
    }

    /**
     * Sets the value of the obOrgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObOrgId(String value) {
        this.obOrgId = value;
    }

    /**
     * Gets the value of the policyUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyUri() {
        return policyUri;
    }

    /**
     * Sets the value of the policyUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyUri(String value) {
        this.policyUri = value;
    }

    /**
     * Gets the value of the redirectUris property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the redirectUris property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRedirectUris().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRedirectUris() {
        if (redirectUris == null) {
            redirectUris = new ArrayList<String>();
        }
        return this.redirectUris;
    }

    /**
     * Gets the value of the responseTypes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseTypes() {
        return responseTypes;
    }

    /**
     * Sets the value of the responseTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseTypes(String value) {
        this.responseTypes = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScope(String value) {
        this.scope = value;
    }

    /**
     * Gets the value of the softwareId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftwareId() {
        return softwareId;
    }

    /**
     * Sets the value of the softwareId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftwareId(String value) {
        this.softwareId = value;
    }

    /**
     * Gets the value of the softwareVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftwareVersion() {
        return softwareVersion;
    }

    /**
     * Sets the value of the softwareVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftwareVersion(String value) {
        this.softwareVersion = value;
    }

    /**
     * Gets the value of the tokenEndpointAuthMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenEndpointAuthMethod() {
        return tokenEndpointAuthMethod;
    }

    /**
     * Sets the value of the tokenEndpointAuthMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenEndpointAuthMethod(String value) {
        this.tokenEndpointAuthMethod = value;
    }

    /**
     * Gets the value of the tosUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTosUri() {
        return tosUri;
    }

    /**
     * Sets the value of the tosUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTosUri(String value) {
        this.tosUri = value;
    }

}
