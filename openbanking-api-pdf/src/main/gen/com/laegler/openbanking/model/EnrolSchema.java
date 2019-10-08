package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EnrolSchema
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class EnrolSchema   {
  @JsonProperty("client_name")
  private String clientName = null;

  @JsonProperty("client_uri")
  private String clientUri = null;

  @JsonProperty("contacts")
  @Valid
  private List<String> contacts = new ArrayList<>();

  @JsonProperty("grant_types")
  @Valid
  private List<String> grantTypes = new ArrayList<>();

  @JsonProperty("jwks")
  private Object jwks = null;

  @JsonProperty("jwks_uri")
  private String jwksUri = null;

  @JsonProperty("logo_uri")
  private String logoUri = null;

  @JsonProperty("policy_uri")
  private String policyUri = null;

  @JsonProperty("redirect_uris")
  @Valid
  private List<String> redirectUris = new ArrayList<>();

  @JsonProperty("response_types")
  @Valid
  private List<String> responseTypes = new ArrayList<>();

  @JsonProperty("scope")
  private String scope = null;

  @JsonProperty("software_id")
  private String softwareId = null;

  @JsonProperty("software_version")
  private String softwareVersion = null;

  @JsonProperty("token_endpoint_auth_method")
  private String tokenEndpointAuthMethod = null;

  @JsonProperty("tos_uri")
  private String tosUri = null;

  public EnrolSchema clientName(String clientName) {
    this.clientName = clientName;
    return this;
  }

  /**
   * Get clientName
   * @return clientName
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public EnrolSchema clientUri(String clientUri) {
    this.clientUri = clientUri;
    return this;
  }

  /**
   * An RFC-3986-compliant URI
   * @return clientUri
  **/
  @ApiModelProperty(required = true, value = "An RFC-3986-compliant URI")
  @NotNull


  public String getClientUri() {
    return clientUri;
  }

  public void setClientUri(String clientUri) {
    this.clientUri = clientUri;
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
   * Get contacts
   * @return contacts
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public List<String> getContacts() {
    return contacts;
  }

  public void setContacts(List<String> contacts) {
    this.contacts = contacts;
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
   * Get grantTypes
   * @return grantTypes
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public List<String> getGrantTypes() {
    return grantTypes;
  }

  public void setGrantTypes(List<String> grantTypes) {
    this.grantTypes = grantTypes;
  }

  public EnrolSchema jwks(Object jwks) {
    this.jwks = jwks;
    return this;
  }

  /**
   * Get jwks
   * @return jwks
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Object getJwks() {
    return jwks;
  }

  public void setJwks(Object jwks) {
    this.jwks = jwks;
  }

  public EnrolSchema jwksUri(String jwksUri) {
    this.jwksUri = jwksUri;
    return this;
  }

  /**
   * An RFC-3986-compliant URI
   * @return jwksUri
  **/
  @ApiModelProperty(required = true, value = "An RFC-3986-compliant URI")
  @NotNull


  public String getJwksUri() {
    return jwksUri;
  }

  public void setJwksUri(String jwksUri) {
    this.jwksUri = jwksUri;
  }

  public EnrolSchema logoUri(String logoUri) {
    this.logoUri = logoUri;
    return this;
  }

  /**
   * An RFC-3986-compliant URI
   * @return logoUri
  **/
  @ApiModelProperty(required = true, value = "An RFC-3986-compliant URI")
  @NotNull


  public String getLogoUri() {
    return logoUri;
  }

  public void setLogoUri(String logoUri) {
    this.logoUri = logoUri;
  }

  public EnrolSchema policyUri(String policyUri) {
    this.policyUri = policyUri;
    return this;
  }

  /**
   * An RFC-3986-compliant URI
   * @return policyUri
  **/
  @ApiModelProperty(required = true, value = "An RFC-3986-compliant URI")
  @NotNull


  public String getPolicyUri() {
    return policyUri;
  }

  public void setPolicyUri(String policyUri) {
    this.policyUri = policyUri;
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
   * Get redirectUris
   * @return redirectUris
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public List<String> getRedirectUris() {
    return redirectUris;
  }

  public void setRedirectUris(List<String> redirectUris) {
    this.redirectUris = redirectUris;
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
   * Get responseTypes
   * @return responseTypes
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public List<String> getResponseTypes() {
    return responseTypes;
  }

  public void setResponseTypes(List<String> responseTypes) {
    this.responseTypes = responseTypes;
  }

  public EnrolSchema scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Get scope
   * @return scope
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public EnrolSchema softwareId(String softwareId) {
    this.softwareId = softwareId;
    return this;
  }

  /**
   * Get softwareId
   * @return softwareId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getSoftwareId() {
    return softwareId;
  }

  public void setSoftwareId(String softwareId) {
    this.softwareId = softwareId;
  }

  public EnrolSchema softwareVersion(String softwareVersion) {
    this.softwareVersion = softwareVersion;
    return this;
  }

  /**
   * Get softwareVersion
   * @return softwareVersion
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getSoftwareVersion() {
    return softwareVersion;
  }

  public void setSoftwareVersion(String softwareVersion) {
    this.softwareVersion = softwareVersion;
  }

  public EnrolSchema tokenEndpointAuthMethod(String tokenEndpointAuthMethod) {
    this.tokenEndpointAuthMethod = tokenEndpointAuthMethod;
    return this;
  }

  /**
   * Get tokenEndpointAuthMethod
   * @return tokenEndpointAuthMethod
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getTokenEndpointAuthMethod() {
    return tokenEndpointAuthMethod;
  }

  public void setTokenEndpointAuthMethod(String tokenEndpointAuthMethod) {
    this.tokenEndpointAuthMethod = tokenEndpointAuthMethod;
  }

  public EnrolSchema tosUri(String tosUri) {
    this.tosUri = tosUri;
    return this;
  }

  /**
   * An RFC-3986-compliant URI
   * @return tosUri
  **/
  @ApiModelProperty(required = true, value = "An RFC-3986-compliant URI")
  @NotNull


  public String getTosUri() {
    return tosUri;
  }

  public void setTosUri(String tosUri) {
    this.tosUri = tosUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnrolSchema enrolSchema = (EnrolSchema) o;
    return Objects.equals(this.clientName, enrolSchema.clientName) &&
        Objects.equals(this.clientUri, enrolSchema.clientUri) &&
        Objects.equals(this.contacts, enrolSchema.contacts) &&
        Objects.equals(this.grantTypes, enrolSchema.grantTypes) &&
        Objects.equals(this.jwks, enrolSchema.jwks) &&
        Objects.equals(this.jwksUri, enrolSchema.jwksUri) &&
        Objects.equals(this.logoUri, enrolSchema.logoUri) &&
        Objects.equals(this.policyUri, enrolSchema.policyUri) &&
        Objects.equals(this.redirectUris, enrolSchema.redirectUris) &&
        Objects.equals(this.responseTypes, enrolSchema.responseTypes) &&
        Objects.equals(this.scope, enrolSchema.scope) &&
        Objects.equals(this.softwareId, enrolSchema.softwareId) &&
        Objects.equals(this.softwareVersion, enrolSchema.softwareVersion) &&
        Objects.equals(this.tokenEndpointAuthMethod, enrolSchema.tokenEndpointAuthMethod) &&
        Objects.equals(this.tosUri, enrolSchema.tosUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientName, clientUri, contacts, grantTypes, jwks, jwksUri, logoUri, policyUri, redirectUris, responseTypes, scope, softwareId, softwareVersion, tokenEndpointAuthMethod, tosUri);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

