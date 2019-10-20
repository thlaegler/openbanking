package com.laegler.openbanking.model;

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

public class EnrolSchema  {
  
  @ApiModelProperty(required = true, value = "")
  private String clientName = null;

  @ApiModelProperty(required = true, value = "An RFC-3986-compliant URI")
 /**
   * An RFC-3986-compliant URI
  **/
  private String clientUri = null;

  @ApiModelProperty(required = true, value = "")
  private List<String> contacts = new ArrayList<String>();

  @ApiModelProperty(required = true, value = "")
  private List<String> grantTypes = new ArrayList<String>();

  @ApiModelProperty(required = true, value = "")
  private Object jwks = null;

  @ApiModelProperty(required = true, value = "An RFC-3986-compliant URI")
 /**
   * An RFC-3986-compliant URI
  **/
  private String jwksUri = null;

  @ApiModelProperty(required = true, value = "An RFC-3986-compliant URI")
 /**
   * An RFC-3986-compliant URI
  **/
  private String logoUri = null;

  @ApiModelProperty(required = true, value = "An RFC-3986-compliant URI")
 /**
   * An RFC-3986-compliant URI
  **/
  private String policyUri = null;

  @ApiModelProperty(required = true, value = "")
  private List<String> redirectUris = new ArrayList<String>();

  @ApiModelProperty(required = true, value = "")
  private List<String> responseTypes = new ArrayList<String>();

  @ApiModelProperty(required = true, value = "")
  private String scope = null;

  @ApiModelProperty(required = true, value = "")
  private String softwareId = null;

  @ApiModelProperty(required = true, value = "")
  private String softwareVersion = null;

  @ApiModelProperty(required = true, value = "")
  private String tokenEndpointAuthMethod = null;

  @ApiModelProperty(required = true, value = "An RFC-3986-compliant URI")
 /**
   * An RFC-3986-compliant URI
  **/
  private String tosUri = null;
 /**
   * Get clientName
   * @return clientName
  **/
  @JsonProperty("client_name")
  @NotNull
  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public EnrolSchema clientName(String clientName) {
    this.clientName = clientName;
    return this;
  }

 /**
   * An RFC-3986-compliant URI
   * @return clientUri
  **/
  @JsonProperty("client_uri")
  @NotNull
  public String getClientUri() {
    return clientUri;
  }

  public void setClientUri(String clientUri) {
    this.clientUri = clientUri;
  }

  public EnrolSchema clientUri(String clientUri) {
    this.clientUri = clientUri;
    return this;
  }

 /**
   * Get contacts
   * @return contacts
  **/
  @JsonProperty("contacts")
  @NotNull
  public List<String> getContacts() {
    return contacts;
  }

  public void setContacts(List<String> contacts) {
    this.contacts = contacts;
  }

  public EnrolSchema contacts(List<String> contacts) {
    this.contacts = contacts;
    return this;
  }

  public EnrolSchema addContactsItem(String contactsItem) {
    this.contacts.add(contactsItem);
    return this;
  }

 /**
   * Get grantTypes
   * @return grantTypes
  **/
  @JsonProperty("grant_types")
  @NotNull
  public List<String> getGrantTypes() {
    return grantTypes;
  }

  public void setGrantTypes(List<String> grantTypes) {
    this.grantTypes = grantTypes;
  }

  public EnrolSchema grantTypes(List<String> grantTypes) {
    this.grantTypes = grantTypes;
    return this;
  }

  public EnrolSchema addGrantTypesItem(String grantTypesItem) {
    this.grantTypes.add(grantTypesItem);
    return this;
  }

 /**
   * Get jwks
   * @return jwks
  **/
  @JsonProperty("jwks")
  @NotNull
  public Object getJwks() {
    return jwks;
  }

  public void setJwks(Object jwks) {
    this.jwks = jwks;
  }

  public EnrolSchema jwks(Object jwks) {
    this.jwks = jwks;
    return this;
  }

 /**
   * An RFC-3986-compliant URI
   * @return jwksUri
  **/
  @JsonProperty("jwks_uri")
  @NotNull
  public String getJwksUri() {
    return jwksUri;
  }

  public void setJwksUri(String jwksUri) {
    this.jwksUri = jwksUri;
  }

  public EnrolSchema jwksUri(String jwksUri) {
    this.jwksUri = jwksUri;
    return this;
  }

 /**
   * An RFC-3986-compliant URI
   * @return logoUri
  **/
  @JsonProperty("logo_uri")
  @NotNull
  public String getLogoUri() {
    return logoUri;
  }

  public void setLogoUri(String logoUri) {
    this.logoUri = logoUri;
  }

  public EnrolSchema logoUri(String logoUri) {
    this.logoUri = logoUri;
    return this;
  }

 /**
   * An RFC-3986-compliant URI
   * @return policyUri
  **/
  @JsonProperty("policy_uri")
  @NotNull
  public String getPolicyUri() {
    return policyUri;
  }

  public void setPolicyUri(String policyUri) {
    this.policyUri = policyUri;
  }

  public EnrolSchema policyUri(String policyUri) {
    this.policyUri = policyUri;
    return this;
  }

 /**
   * Get redirectUris
   * @return redirectUris
  **/
  @JsonProperty("redirect_uris")
  @NotNull
  public List<String> getRedirectUris() {
    return redirectUris;
  }

  public void setRedirectUris(List<String> redirectUris) {
    this.redirectUris = redirectUris;
  }

  public EnrolSchema redirectUris(List<String> redirectUris) {
    this.redirectUris = redirectUris;
    return this;
  }

  public EnrolSchema addRedirectUrisItem(String redirectUrisItem) {
    this.redirectUris.add(redirectUrisItem);
    return this;
  }

 /**
   * Get responseTypes
   * @return responseTypes
  **/
  @JsonProperty("response_types")
  @NotNull
  public List<String> getResponseTypes() {
    return responseTypes;
  }

  public void setResponseTypes(List<String> responseTypes) {
    this.responseTypes = responseTypes;
  }

  public EnrolSchema responseTypes(List<String> responseTypes) {
    this.responseTypes = responseTypes;
    return this;
  }

  public EnrolSchema addResponseTypesItem(String responseTypesItem) {
    this.responseTypes.add(responseTypesItem);
    return this;
  }

 /**
   * Get scope
   * @return scope
  **/
  @JsonProperty("scope")
  @NotNull
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public EnrolSchema scope(String scope) {
    this.scope = scope;
    return this;
  }

 /**
   * Get softwareId
   * @return softwareId
  **/
  @JsonProperty("software_id")
  @NotNull
  public String getSoftwareId() {
    return softwareId;
  }

  public void setSoftwareId(String softwareId) {
    this.softwareId = softwareId;
  }

  public EnrolSchema softwareId(String softwareId) {
    this.softwareId = softwareId;
    return this;
  }

 /**
   * Get softwareVersion
   * @return softwareVersion
  **/
  @JsonProperty("software_version")
  @NotNull
  public String getSoftwareVersion() {
    return softwareVersion;
  }

  public void setSoftwareVersion(String softwareVersion) {
    this.softwareVersion = softwareVersion;
  }

  public EnrolSchema softwareVersion(String softwareVersion) {
    this.softwareVersion = softwareVersion;
    return this;
  }

 /**
   * Get tokenEndpointAuthMethod
   * @return tokenEndpointAuthMethod
  **/
  @JsonProperty("token_endpoint_auth_method")
  @NotNull
  public String getTokenEndpointAuthMethod() {
    return tokenEndpointAuthMethod;
  }

  public void setTokenEndpointAuthMethod(String tokenEndpointAuthMethod) {
    this.tokenEndpointAuthMethod = tokenEndpointAuthMethod;
  }

  public EnrolSchema tokenEndpointAuthMethod(String tokenEndpointAuthMethod) {
    this.tokenEndpointAuthMethod = tokenEndpointAuthMethod;
    return this;
  }

 /**
   * An RFC-3986-compliant URI
   * @return tosUri
  **/
  @JsonProperty("tos_uri")
  @NotNull
  public String getTosUri() {
    return tosUri;
  }

  public void setTosUri(String tosUri) {
    this.tosUri = tosUri;
  }

  public EnrolSchema tosUri(String tosUri) {
    this.tosUri = tosUri;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnrolSchema {\n");
    
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    clientUri: ").append(toIndentedString(clientUri)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    grantTypes: ").append(toIndentedString(grantTypes)).append("\n");
    sb.append("    jwks: ").append(toIndentedString(jwks)).append("\n");
    sb.append("    jwksUri: ").append(toIndentedString(jwksUri)).append("\n");
    sb.append("    logoUri: ").append(toIndentedString(logoUri)).append("\n");
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

