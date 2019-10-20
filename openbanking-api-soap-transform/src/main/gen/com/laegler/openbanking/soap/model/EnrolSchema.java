
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnrolSchema complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnrolSchema"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="client_name"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="client_uri"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="contacts" maxOccurs="unbounded"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="grant_types" maxOccurs="unbounded"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="jwks" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="jwks_uri"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="logo_uri"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="policy_uri"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="redirect_uris" maxOccurs="unbounded"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="response_types" maxOccurs="unbounded"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="scope"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="software_id"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="software_version"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="token_endpoint_auth_method"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="tos_uri"&gt;
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
@XmlType(name = "EnrolSchema", propOrder = {
    "clientName",
    "clientUri",
    "contacts",
    "grantTypes",
    "jwks",
    "jwksUri",
    "logoUri",
    "policyUri",
    "redirectUris",
    "responseTypes",
    "scope",
    "softwareId",
    "softwareVersion",
    "tokenEndpointAuthMethod",
    "tosUri"
})
public class EnrolSchema {

    @XmlElement(name = "client_name", required = true)
    protected String clientName;
    @XmlElement(name = "client_uri", required = true)
    protected String clientUri;
    @XmlElement(required = true)
    protected List<String> contacts;
    @XmlElement(name = "grant_types", required = true)
    protected List<String> grantTypes;
    @XmlElement(required = true)
    protected Object jwks;
    @XmlElement(name = "jwks_uri", required = true)
    protected String jwksUri;
    @XmlElement(name = "logo_uri", required = true)
    protected String logoUri;
    @XmlElement(name = "policy_uri", required = true)
    protected String policyUri;
    @XmlElement(name = "redirect_uris", required = true)
    protected List<String> redirectUris;
    @XmlElement(name = "response_types", required = true)
    protected List<String> responseTypes;
    @XmlElement(required = true)
    protected String scope;
    @XmlElement(name = "software_id", required = true)
    protected String softwareId;
    @XmlElement(name = "software_version", required = true)
    protected String softwareVersion;
    @XmlElement(name = "token_endpoint_auth_method", required = true)
    protected String tokenEndpointAuthMethod;
    @XmlElement(name = "tos_uri", required = true)
    protected String tosUri;

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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grantTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrantTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGrantTypes() {
        if (grantTypes == null) {
            grantTypes = new ArrayList<String>();
        }
        return this.grantTypes;
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getResponseTypes() {
        if (responseTypes == null) {
            responseTypes = new ArrayList<String>();
        }
        return this.responseTypes;
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
