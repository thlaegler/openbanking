package com.laegler.openbanking.model;

import java.math.BigDecimal;
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

public class SoftwareStatementCreateSchema  {
  
  @ApiModelProperty(value = "Software Statement client name")
 /**
   * Software Statement client name
  **/
  private String clientName = null;

  @ApiModelProperty(value = "The Software Statement RFC-3986-compliant client URI")
 /**
   * The Software Statement RFC-3986-compliant client URI
  **/
  private String clientUri = null;

  @ApiModelProperty(value = "Software Statement description")
 /**
   * Software Statement description
  **/
  private String description = null;

  @ApiModelProperty(value = "The Software Statement RFC-3986-compliant logo URI")
 /**
   * The Software Statement RFC-3986-compliant logo URI
  **/
  private String logoUri = null;

  @ApiModelProperty(value = "A reference to fourth party organisation resource on the OB Directory if the registering TPP is acting on behalf of another")
 /**
   * A reference to fourth party organisation resource on the OB Directory if the registering TPP is acting on behalf of another
  **/
  private String onBehalfOfObOrganisation = null;

  @ApiModelProperty(value = "The Software Statement RFC-3986-compliant policy URI")
 /**
   * The Software Statement RFC-3986-compliant policy URI
  **/
  private String policyUri = null;

  @ApiModelProperty(value = "The Software Statement redirect URIs")
 /**
   * The Software Statement redirect URIs
  **/
  private List<String> redirectUri = null;

  @ApiModelProperty(value = "The list of Software Statement roles")
 /**
   * The list of Software Statement roles
  **/
  private List<String> roles = null;

  @ApiModelProperty(value = "The Software Statement terms of service RFC-3986-compliant URI")
 /**
   * The Software Statement terms of service RFC-3986-compliant URI
  **/
  private String termsOfServiceUri = null;

  @ApiModelProperty(value = "Software Statement version as provided by the organisation's PTC")
  @Valid
 /**
   * Software Statement version as provided by the organisation's PTC
  **/
  private BigDecimal version = null;
 /**
   * Software Statement client name
   * @return clientName
  **/
  @JsonProperty("ClientName")
 @Size(max=40)  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public SoftwareStatementCreateSchema clientName(String clientName) {
    this.clientName = clientName;
    return this;
  }

 /**
   * The Software Statement RFC-3986-compliant client URI
   * @return clientUri
  **/
  @JsonProperty("ClientUri")
 @Size(max=256)  public String getClientUri() {
    return clientUri;
  }

  public void setClientUri(String clientUri) {
    this.clientUri = clientUri;
  }

  public SoftwareStatementCreateSchema clientUri(String clientUri) {
    this.clientUri = clientUri;
    return this;
  }

 /**
   * Software Statement description
   * @return description
  **/
  @JsonProperty("Description")
 @Size(max=256)  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SoftwareStatementCreateSchema description(String description) {
    this.description = description;
    return this;
  }

 /**
   * The Software Statement RFC-3986-compliant logo URI
   * @return logoUri
  **/
  @JsonProperty("LogoUri")
 @Size(max=256)  public String getLogoUri() {
    return logoUri;
  }

  public void setLogoUri(String logoUri) {
    this.logoUri = logoUri;
  }

  public SoftwareStatementCreateSchema logoUri(String logoUri) {
    this.logoUri = logoUri;
    return this;
  }

 /**
   * A reference to fourth party organisation resource on the OB Directory if the registering TPP is acting on behalf of another
   * @return onBehalfOfObOrganisation
  **/
  @JsonProperty("OnBehalfOfObOrganisation")
 @Size(max=40)  public String getOnBehalfOfObOrganisation() {
    return onBehalfOfObOrganisation;
  }

  public void setOnBehalfOfObOrganisation(String onBehalfOfObOrganisation) {
    this.onBehalfOfObOrganisation = onBehalfOfObOrganisation;
  }

  public SoftwareStatementCreateSchema onBehalfOfObOrganisation(String onBehalfOfObOrganisation) {
    this.onBehalfOfObOrganisation = onBehalfOfObOrganisation;
    return this;
  }

 /**
   * The Software Statement RFC-3986-compliant policy URI
   * @return policyUri
  **/
  @JsonProperty("PolicyUri")
 @Size(max=256)  public String getPolicyUri() {
    return policyUri;
  }

  public void setPolicyUri(String policyUri) {
    this.policyUri = policyUri;
  }

  public SoftwareStatementCreateSchema policyUri(String policyUri) {
    this.policyUri = policyUri;
    return this;
  }

 /**
   * The Software Statement redirect URIs
   * @return redirectUri
  **/
  @JsonProperty("RedirectUri")
  public List<String> getRedirectUri() {
    return redirectUri;
  }

  public void setRedirectUri(List<String> redirectUri) {
    this.redirectUri = redirectUri;
  }

  public SoftwareStatementCreateSchema redirectUri(List<String> redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }

  public SoftwareStatementCreateSchema addRedirectUriItem(String redirectUriItem) {
    this.redirectUri.add(redirectUriItem);
    return this;
  }

 /**
   * The list of Software Statement roles
   * @return roles
  **/
  @JsonProperty("Roles")
  public List<String> getRoles() {
    return roles;
  }

  public void setRoles(List<String> roles) {
    this.roles = roles;
  }

  public SoftwareStatementCreateSchema roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public SoftwareStatementCreateSchema addRolesItem(String rolesItem) {
    this.roles.add(rolesItem);
    return this;
  }

 /**
   * The Software Statement terms of service RFC-3986-compliant URI
   * @return termsOfServiceUri
  **/
  @JsonProperty("TermsOfServiceUri")
 @Size(max=256)  public String getTermsOfServiceUri() {
    return termsOfServiceUri;
  }

  public void setTermsOfServiceUri(String termsOfServiceUri) {
    this.termsOfServiceUri = termsOfServiceUri;
  }

  public SoftwareStatementCreateSchema termsOfServiceUri(String termsOfServiceUri) {
    this.termsOfServiceUri = termsOfServiceUri;
    return this;
  }

 /**
   * Software Statement version as provided by the organisation&#39;s PTC
   * @return version
  **/
  @JsonProperty("Version")
  public BigDecimal getVersion() {
    return version;
  }

  public void setVersion(BigDecimal version) {
    this.version = version;
  }

  public SoftwareStatementCreateSchema version(BigDecimal version) {
    this.version = version;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SoftwareStatementCreateSchema {\n");
    
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    clientUri: ").append(toIndentedString(clientUri)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    logoUri: ").append(toIndentedString(logoUri)).append("\n");
    sb.append("    onBehalfOfObOrganisation: ").append(toIndentedString(onBehalfOfObOrganisation)).append("\n");
    sb.append("    policyUri: ").append(toIndentedString(policyUri)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    termsOfServiceUri: ").append(toIndentedString(termsOfServiceUri)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

