
package com.laegler.openbanking.soap.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetaclientbywayofClientIDResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetaclientbywayofClientIDResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="application_type" type="{http://laegler.com/openbanking/soap/model}ApplicationType"/&gt;
 *         &lt;element name="client_id"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="36"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="client_id_issued_at" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;minInclusive value="0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="client_secret" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="36"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="client_secret_expires_at" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;minInclusive value="0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="grant_types" type="{http://laegler.com/openbanking/soap/model}GrantType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="id_token_signed_response_alg" type="{http://laegler.com/openbanking/soap/model}SupportedAlgorithms"/&gt;
 *         &lt;element name="redirect_uris" maxOccurs="unbounded"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="256"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="request_object_signing_alg" type="{http://laegler.com/openbanking/soap/model}SupportedAlgorithms"/&gt;
 *         &lt;element name="response_types" type="{http://laegler.com/openbanking/soap/model}ResponseType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="scope"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="256"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="software_id" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^[0-9a-zA-Z]{1,22}$"/&gt;
 *               &lt;maxLength value="22"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="software_statement"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="tls_client_auth_subject_dn" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="128"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="token_endpoint_auth_method" type="{http://laegler.com/openbanking/soap/model}TokenEndpointAuthMethod"/&gt;
 *         &lt;element name="token_endpoint_auth_signing_alg" type="{http://laegler.com/openbanking/soap/model}SupportedAlgorithms" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetaclientbywayofClientIDResponse", propOrder = {
    "applicationType",
    "clientId",
    "clientIdIssuedAt",
    "clientSecret",
    "clientSecretExpiresAt",
    "grantTypes",
    "idTokenSignedResponseAlg",
    "redirectUris",
    "requestObjectSigningAlg",
    "responseTypes",
    "scope",
    "softwareId",
    "softwareStatement",
    "tlsClientAuthSubjectDn",
    "tokenEndpointAuthMethod",
    "tokenEndpointAuthSigningAlg"
})
public class GetaclientbywayofClientIDResponse {

    @XmlElement(name = "application_type", required = true)
    @XmlSchemaType(name = "string")
    protected ApplicationType applicationType;
    @XmlElement(name = "client_id", required = true)
    protected String clientId;
    @XmlElement(name = "client_id_issued_at")
    protected BigInteger clientIdIssuedAt;
    @XmlElement(name = "client_secret")
    protected String clientSecret;
    @XmlElement(name = "client_secret_expires_at")
    protected BigInteger clientSecretExpiresAt;
    @XmlElement(name = "grant_types", required = true)
    @XmlSchemaType(name = "string")
    protected List<GrantType> grantTypes;
    @XmlElement(name = "id_token_signed_response_alg", required = true)
    @XmlSchemaType(name = "string")
    protected SupportedAlgorithms idTokenSignedResponseAlg;
    @XmlElement(name = "redirect_uris", required = true)
    protected List<String> redirectUris;
    @XmlElement(name = "request_object_signing_alg", required = true)
    @XmlSchemaType(name = "string")
    protected SupportedAlgorithms requestObjectSigningAlg;
    @XmlElement(name = "response_types")
    @XmlSchemaType(name = "string")
    protected List<ResponseType> responseTypes;
    @XmlElement(required = true)
    protected String scope;
    @XmlElement(name = "software_id")
    protected String softwareId;
    @XmlElement(name = "software_statement", required = true)
    protected String softwareStatement;
    @XmlElement(name = "tls_client_auth_subject_dn")
    protected String tlsClientAuthSubjectDn;
    @XmlElement(name = "token_endpoint_auth_method", required = true)
    @XmlSchemaType(name = "string")
    protected TokenEndpointAuthMethod tokenEndpointAuthMethod;
    @XmlElement(name = "token_endpoint_auth_signing_alg")
    @XmlSchemaType(name = "string")
    protected SupportedAlgorithms tokenEndpointAuthSigningAlg;

    /**
     * Gets the value of the applicationType property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationType }
     *     
     */
    public ApplicationType getApplicationType() {
        return applicationType;
    }

    /**
     * Sets the value of the applicationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationType }
     *     
     */
    public void setApplicationType(ApplicationType value) {
        this.applicationType = value;
    }

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
     * {@link GrantType }
     * 
     * 
     */
    public List<GrantType> getGrantTypes() {
        if (grantTypes == null) {
            grantTypes = new ArrayList<GrantType>();
        }
        return this.grantTypes;
    }

    /**
     * Gets the value of the idTokenSignedResponseAlg property.
     * 
     * @return
     *     possible object is
     *     {@link SupportedAlgorithms }
     *     
     */
    public SupportedAlgorithms getIdTokenSignedResponseAlg() {
        return idTokenSignedResponseAlg;
    }

    /**
     * Sets the value of the idTokenSignedResponseAlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportedAlgorithms }
     *     
     */
    public void setIdTokenSignedResponseAlg(SupportedAlgorithms value) {
        this.idTokenSignedResponseAlg = value;
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
     * Gets the value of the requestObjectSigningAlg property.
     * 
     * @return
     *     possible object is
     *     {@link SupportedAlgorithms }
     *     
     */
    public SupportedAlgorithms getRequestObjectSigningAlg() {
        return requestObjectSigningAlg;
    }

    /**
     * Sets the value of the requestObjectSigningAlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportedAlgorithms }
     *     
     */
    public void setRequestObjectSigningAlg(SupportedAlgorithms value) {
        this.requestObjectSigningAlg = value;
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
     * {@link ResponseType }
     * 
     * 
     */
    public List<ResponseType> getResponseTypes() {
        if (responseTypes == null) {
            responseTypes = new ArrayList<ResponseType>();
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
     * Gets the value of the softwareStatement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftwareStatement() {
        return softwareStatement;
    }

    /**
     * Sets the value of the softwareStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftwareStatement(String value) {
        this.softwareStatement = value;
    }

    /**
     * Gets the value of the tlsClientAuthSubjectDn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTlsClientAuthSubjectDn() {
        return tlsClientAuthSubjectDn;
    }

    /**
     * Sets the value of the tlsClientAuthSubjectDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTlsClientAuthSubjectDn(String value) {
        this.tlsClientAuthSubjectDn = value;
    }

    /**
     * Gets the value of the tokenEndpointAuthMethod property.
     * 
     * @return
     *     possible object is
     *     {@link TokenEndpointAuthMethod }
     *     
     */
    public TokenEndpointAuthMethod getTokenEndpointAuthMethod() {
        return tokenEndpointAuthMethod;
    }

    /**
     * Sets the value of the tokenEndpointAuthMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenEndpointAuthMethod }
     *     
     */
    public void setTokenEndpointAuthMethod(TokenEndpointAuthMethod value) {
        this.tokenEndpointAuthMethod = value;
    }

    /**
     * Gets the value of the tokenEndpointAuthSigningAlg property.
     * 
     * @return
     *     possible object is
     *     {@link SupportedAlgorithms }
     *     
     */
    public SupportedAlgorithms getTokenEndpointAuthSigningAlg() {
        return tokenEndpointAuthSigningAlg;
    }

    /**
     * Sets the value of the tokenEndpointAuthSigningAlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportedAlgorithms }
     *     
     */
    public void setTokenEndpointAuthSigningAlg(SupportedAlgorithms value) {
        this.tokenEndpointAuthSigningAlg = value;
    }

}
