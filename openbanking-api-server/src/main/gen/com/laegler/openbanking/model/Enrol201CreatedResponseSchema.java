package com.laegler.openbanking.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * A JSON object DCR response returned when client gets created.
 **/
@ApiModel(description="A JSON object DCR response returned when client gets created.")
public class Enrol201CreatedResponseSchema  {
  
  @ApiModelProperty(value = "Client ID assigned by Open Banking Directory")
 /**
   * Client ID assigned by Open Banking Directory
  **/
  private String clientId = null;

  @ApiModelProperty(value = "Timestamp")
 /**
   * Timestamp
  **/
  private Integer clientIdIssuedAt = null;

  @ApiModelProperty(value = "ORG name ar per eIDAS certificate")
 /**
   * ORG name ar per eIDAS certificate
  **/
  private String clientName = null;

  @ApiModelProperty(value = "Client secret generated by Open Banking Directory")
 /**
   * Client secret generated by Open Banking Directory
  **/
  private String clientSecret = null;

  @ApiModelProperty(value = "Timestamp")
 /**
   * Timestamp
  **/
  private Integer clientSecretExpiresAt = null;

  @ApiModelProperty(value = "An RFC-3986-compliant URI string of a web page providing information about the client")
 /**
   * An RFC-3986-compliant URI string of a web page providing information about the client
  **/
  private String clientUri = null;

  @ApiModelProperty(value = "Contacts to departments responsible for the client")
 /**
   * Contacts to departments responsible for the client
  **/
  private List<String> contacts = null;

  @ApiModelProperty(value = "client_credentials")
 /**
   * client_credentials
  **/
  private String grantTypes = null;

  @ApiModelProperty(value = "Client's JSON Web Key Set [RFC7517] document value")
 /**
   * Client's JSON Web Key Set [RFC7517] document value
  **/
  private Object jwks = null;

  @ApiModelProperty(value = "An RFC-3986-compliant URI string referencing the client's JSON Web Key (JWK) Set")
 /**
   * An RFC-3986-compliant URI string referencing the client's JSON Web Key (JWK) Set
  **/
  private String jwksUri = null;

  @ApiModelProperty(value = "An RFC-3986-compliant URI")
 /**
   * An RFC-3986-compliant URI
  **/
  private String logoUri = null;

  @ApiModelProperty(value = "Organisation ID assigned by Open Banking   Directory")
 /**
   * Organisation ID assigned by Open Banking   Directory
  **/
  private String obOrgId = null;

  @ApiModelProperty(value = "An RFC-3986-compliant URI string that points to a human-readable privacy policy document")
 /**
   * An RFC-3986-compliant URI string that points to a human-readable privacy policy document
  **/
  private String policyUri = null;

  @ApiModelProperty(value = "Array of Redirection URI values used by the Client, as supplied by the client")
 /**
   * Array of Redirection URI values used by the Client, as supplied by the client
  **/
  private List<String> redirectUris = null;

  @ApiModelProperty(value = "client_credentials")
 /**
   * client_credentials
  **/
  private String responseTypes = null;

  @ApiModelProperty(value = "ASPSPFullAccess")
 /**
   * ASPSPFullAccess
  **/
  private String scope = null;

  @ApiModelProperty(value = "UUID4 string")
 /**
   * UUID4 string
  **/
  private String softwareId = null;

  @ApiModelProperty(value = "Client-supplied software version string")
 /**
   * Client-supplied software version string
  **/
  private String softwareVersion = null;

  @ApiModelProperty(value = "client_secret_post")
 /**
   * client_secret_post
  **/
  private String tokenEndpointAuthMethod = null;

  @ApiModelProperty(value = "An RFC-3986-compliant URI string that points to a human-readable terms of service document for the client")
 /**
   * An RFC-3986-compliant URI string that points to a human-readable terms of service document for the client
  **/
  private String tosUri = null;
 /**
   * Client ID assigned by Open Banking Directory
   * @return clientId
  **/
  @JsonProperty("client_id")
 @Size(min=18,max=18)  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public Enrol201CreatedResponseSchema clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

 /**
   * Timestamp
   * @return clientIdIssuedAt
  **/
  @JsonProperty("client_id_issued_at")
  public Integer getClientIdIssuedAt() {
    return clientIdIssuedAt;
  }

  public void setClientIdIssuedAt(Integer clientIdIssuedAt) {
    this.clientIdIssuedAt = clientIdIssuedAt;
  }

  public Enrol201CreatedResponseSchema clientIdIssuedAt(Integer clientIdIssuedAt) {
    this.clientIdIssuedAt = clientIdIssuedAt;
    return this;
  }

 /**
   * ORG name ar per eIDAS certificate
   * @return clientName
  **/
  @JsonProperty("client_name")
  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public Enrol201CreatedResponseSchema clientName(String clientName) {
    this.clientName = clientName;
    return this;
  }

 /**
   * Client secret generated by Open Banking Directory
   * @return clientSecret
  **/
  @JsonProperty("client_secret")
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public Enrol201CreatedResponseSchema clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

 /**
   * Timestamp
   * @return clientSecretExpiresAt
  **/
  @JsonProperty("client_secret_expires_at")
  public Integer getClientSecretExpiresAt() {
    return clientSecretExpiresAt;
  }

  public void setClientSecretExpiresAt(Integer clientSecretExpiresAt) {
    this.clientSecretExpiresAt = clientSecretExpiresAt;
  }

  public Enrol201CreatedResponseSchema clientSecretExpiresAt(Integer clientSecretExpiresAt) {
    this.clientSecretExpiresAt = clientSecretExpiresAt;
    return this;
  }

 /**
   * An RFC-3986-compliant URI string of a web page providing information about the client
   * @return clientUri
  **/
  @JsonProperty("client_uri")
  public String getClientUri() {
    return clientUri;
  }

  public void setClientUri(String clientUri) {
    this.clientUri = clientUri;
  }

  public Enrol201CreatedResponseSchema clientUri(String clientUri) {
    this.clientUri = clientUri;
    return this;
  }

 /**
   * Contacts to departments responsible for the client
   * @return contacts
  **/
  @JsonProperty("contacts")
 @Size(min=1)  public List<String> getContacts() {
    return contacts;
  }

  public void setContacts(List<String> contacts) {
    this.contacts = contacts;
  }

  public Enrol201CreatedResponseSchema contacts(List<String> contacts) {
    this.contacts = contacts;
    return this;
  }

  public Enrol201CreatedResponseSchema addContactsItem(String contactsItem) {
    this.contacts.add(contactsItem);
    return this;
  }

 /**
   * client_credentials
   * @return grantTypes
  **/
  @JsonProperty("grant_types")
  public String getGrantTypes() {
    return grantTypes;
  }

  public void setGrantTypes(String grantTypes) {
    this.grantTypes = grantTypes;
  }

  public Enrol201CreatedResponseSchema grantTypes(String grantTypes) {
    this.grantTypes = grantTypes;
    return this;
  }

 /**
   * Client&#39;s JSON Web Key Set [RFC7517] document value
   * @return jwks
  **/
  @JsonProperty("jwks")
  public Object getJwks() {
    return jwks;
  }

  public void setJwks(Object jwks) {
    this.jwks = jwks;
  }

  public Enrol201CreatedResponseSchema jwks(Object jwks) {
    this.jwks = jwks;
    return this;
  }

 /**
   * An RFC-3986-compliant URI string referencing the client&#39;s JSON Web Key (JWK) Set
   * @return jwksUri
  **/
  @JsonProperty("jwks_uri")
  public String getJwksUri() {
    return jwksUri;
  }

  public void setJwksUri(String jwksUri) {
    this.jwksUri = jwksUri;
  }

  public Enrol201CreatedResponseSchema jwksUri(String jwksUri) {
    this.jwksUri = jwksUri;
    return this;
  }

 /**
   * An RFC-3986-compliant URI
   * @return logoUri
  **/
  @JsonProperty("logo_uri")
  public String getLogoUri() {
    return logoUri;
  }

  public void setLogoUri(String logoUri) {
    this.logoUri = logoUri;
  }

  public Enrol201CreatedResponseSchema logoUri(String logoUri) {
    this.logoUri = logoUri;
    return this;
  }

 /**
   * Organisation ID assigned by Open Banking   Directory
   * @return obOrgId
  **/
  @JsonProperty("ob_org_id")
 @Size(min=18,max=18)  public String getObOrgId() {
    return obOrgId;
  }

  public void setObOrgId(String obOrgId) {
    this.obOrgId = obOrgId;
  }

  public Enrol201CreatedResponseSchema obOrgId(String obOrgId) {
    this.obOrgId = obOrgId;
    return this;
  }

 /**
   * An RFC-3986-compliant URI string that points to a human-readable privacy policy document
   * @return policyUri
  **/
  @JsonProperty("policy_uri")
  public String getPolicyUri() {
    return policyUri;
  }

  public void setPolicyUri(String policyUri) {
    this.policyUri = policyUri;
  }

  public Enrol201CreatedResponseSchema policyUri(String policyUri) {
    this.policyUri = policyUri;
    return this;
  }

 /**
   * Array of Redirection URI values used by the Client, as supplied by the client
   * @return redirectUris
  **/
  @JsonProperty("redirect_uris")
 @Size(min=1)  public List<String> getRedirectUris() {
    return redirectUris;
  }

  public void setRedirectUris(List<String> redirectUris) {
    this.redirectUris = redirectUris;
  }

  public Enrol201CreatedResponseSchema redirectUris(List<String> redirectUris) {
    this.redirectUris = redirectUris;
    return this;
  }

  public Enrol201CreatedResponseSchema addRedirectUrisItem(String redirectUrisItem) {
    this.redirectUris.add(redirectUrisItem);
    return this;
  }

 /**
   * client_credentials
   * @return responseTypes
  **/
  @JsonProperty("response_types")
  public String getResponseTypes() {
    return responseTypes;
  }

  public void setResponseTypes(String responseTypes) {
    this.responseTypes = responseTypes;
  }

  public Enrol201CreatedResponseSchema responseTypes(String responseTypes) {
    this.responseTypes = responseTypes;
    return this;
  }

 /**
   * ASPSPFullAccess
   * @return scope
  **/
  @JsonProperty("scope")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public Enrol201CreatedResponseSchema scope(String scope) {
    this.scope = scope;
    return this;
  }

 /**
   * UUID4 string
   * @return softwareId
  **/
  @JsonProperty("software_id")
  public String getSoftwareId() {
    return softwareId;
  }

  public void setSoftwareId(String softwareId) {
    this.softwareId = softwareId;
  }

  public Enrol201CreatedResponseSchema softwareId(String softwareId) {
    this.softwareId = softwareId;
    return this;
  }

 /**
   * Client-supplied software version string
   * @return softwareVersion
  **/
  @JsonProperty("software_version")
  public String getSoftwareVersion() {
    return softwareVersion;
  }

  public void setSoftwareVersion(String softwareVersion) {
    this.softwareVersion = softwareVersion;
  }

  public Enrol201CreatedResponseSchema softwareVersion(String softwareVersion) {
    this.softwareVersion = softwareVersion;
    return this;
  }

 /**
   * client_secret_post
   * @return tokenEndpointAuthMethod
  **/
  @JsonProperty("token_endpoint_auth_method")
  public String getTokenEndpointAuthMethod() {
    return tokenEndpointAuthMethod;
  }

  public void setTokenEndpointAuthMethod(String tokenEndpointAuthMethod) {
    this.tokenEndpointAuthMethod = tokenEndpointAuthMethod;
  }

  public Enrol201CreatedResponseSchema tokenEndpointAuthMethod(String tokenEndpointAuthMethod) {
    this.tokenEndpointAuthMethod = tokenEndpointAuthMethod;
    return this;
  }

 /**
   * An RFC-3986-compliant URI string that points to a human-readable terms of service document for the client
   * @return tosUri
  **/
  @JsonProperty("tos_uri")
  public String getTosUri() {
    return tosUri;
  }

  public void setTosUri(String tosUri) {
    this.tosUri = tosUri;
  }

  public Enrol201CreatedResponseSchema tosUri(String tosUri) {
    this.tosUri = tosUri;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Enrol201CreatedResponseSchema {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientIdIssuedAt: ").append(toIndentedString(clientIdIssuedAt)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    clientSecretExpiresAt: ").append(toIndentedString(clientSecretExpiresAt)).append("\n");
    sb.append("    clientUri: ").append(toIndentedString(clientUri)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    grantTypes: ").append(toIndentedString(grantTypes)).append("\n");
    sb.append("    jwks: ").append(toIndentedString(jwks)).append("\n");
    sb.append("    jwksUri: ").append(toIndentedString(jwksUri)).append("\n");
    sb.append("    logoUri: ").append(toIndentedString(logoUri)).append("\n");
    sb.append("    obOrgId: ").append(toIndentedString(obOrgId)).append("\n");
    sb.append("    policyUri: ").append(toIndentedString(policyUri)).append("\n");
    sb.append("    redirectUris: ").append(toIndentedString(redirectUris)).append("\n");
    sb.append("    responseTypes: ").append(toIndentedString(responseTypes)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    softwareId: ").append(toIndentedString(softwareId)).append("\n");
    sb.append("    softwareVersion: ").append(toIndentedString(softwareVersion)).append("\n");
    sb.append("    tokenEndpointAuthMethod: ").append(toIndentedString(tokenEndpointAuthMethod)).append("\n");
    sb.append("    tosUri: ").append(toIndentedString(tosUri)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

