package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SoftwareStatementCreateSchema
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class SoftwareStatementCreateSchema   {
  @JsonProperty("ClientName")
  private String clientName = null;

  @JsonProperty("ClientUri")
  private String clientUri = null;

  @JsonProperty("Description")
  private String description = null;

  @JsonProperty("LogoUri")
  private String logoUri = null;

  @JsonProperty("OnBehalfOfObOrganisation")
  private String onBehalfOfObOrganisation = null;

  @JsonProperty("PolicyUri")
  private String policyUri = null;

  @JsonProperty("RedirectUri")
  @Valid
  private List<String> redirectUri = null;

  @JsonProperty("Roles")
  @Valid
  private List<String> roles = null;

  @JsonProperty("TermsOfServiceUri")
  private String termsOfServiceUri = null;

  @JsonProperty("Version")
  private BigDecimal version = null;

  public SoftwareStatementCreateSchema clientName(String clientName) {
    this.clientName = clientName;
    return this;
  }

  /**
   * Software Statement client name
   * @return clientName
  **/
  @ApiModelProperty(value = "Software Statement client name")

@Size(max=40) 
  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public SoftwareStatementCreateSchema clientUri(String clientUri) {
    this.clientUri = clientUri;
    return this;
  }

  /**
   * The Software Statement RFC-3986-compliant client URI
   * @return clientUri
  **/
  @ApiModelProperty(value = "The Software Statement RFC-3986-compliant client URI")

@Size(max=256) 
  public String getClientUri() {
    return clientUri;
  }

  public void setClientUri(String clientUri) {
    this.clientUri = clientUri;
  }

  public SoftwareStatementCreateSchema description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Software Statement description
   * @return description
  **/
  @ApiModelProperty(value = "Software Statement description")

@Size(max=256) 
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SoftwareStatementCreateSchema logoUri(String logoUri) {
    this.logoUri = logoUri;
    return this;
  }

  /**
   * The Software Statement RFC-3986-compliant logo URI
   * @return logoUri
  **/
  @ApiModelProperty(value = "The Software Statement RFC-3986-compliant logo URI")

@Size(max=256) 
  public String getLogoUri() {
    return logoUri;
  }

  public void setLogoUri(String logoUri) {
    this.logoUri = logoUri;
  }

  public SoftwareStatementCreateSchema onBehalfOfObOrganisation(String onBehalfOfObOrganisation) {
    this.onBehalfOfObOrganisation = onBehalfOfObOrganisation;
    return this;
  }

  /**
   * A reference to fourth party organisation resource on the OB Directory if the registering TPP is acting on behalf of another
   * @return onBehalfOfObOrganisation
  **/
  @ApiModelProperty(value = "A reference to fourth party organisation resource on the OB Directory if the registering TPP is acting on behalf of another")

@Size(max=40) 
  public String getOnBehalfOfObOrganisation() {
    return onBehalfOfObOrganisation;
  }

  public void setOnBehalfOfObOrganisation(String onBehalfOfObOrganisation) {
    this.onBehalfOfObOrganisation = onBehalfOfObOrganisation;
  }

  public SoftwareStatementCreateSchema policyUri(String policyUri) {
    this.policyUri = policyUri;
    return this;
  }

  /**
   * The Software Statement RFC-3986-compliant policy URI
   * @return policyUri
  **/
  @ApiModelProperty(value = "The Software Statement RFC-3986-compliant policy URI")

@Size(max=256) 
  public String getPolicyUri() {
    return policyUri;
  }

  public void setPolicyUri(String policyUri) {
    this.policyUri = policyUri;
  }

  public SoftwareStatementCreateSchema redirectUri(List<String> redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }

  public SoftwareStatementCreateSchema addRedirectUriItem(String redirectUriItem) {
    if (this.redirectUri == null) {
      this.redirectUri = new ArrayList<>();
    }
    this.redirectUri.add(redirectUriItem);
    return this;
  }

  /**
   * The Software Statement redirect URIs
   * @return redirectUri
  **/
  @ApiModelProperty(value = "The Software Statement redirect URIs")


  public List<String> getRedirectUri() {
    return redirectUri;
  }

  public void setRedirectUri(List<String> redirectUri) {
    this.redirectUri = redirectUri;
  }

  public SoftwareStatementCreateSchema roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public SoftwareStatementCreateSchema addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

  /**
   * The list of Software Statement roles
   * @return roles
  **/
  @ApiModelProperty(value = "The list of Software Statement roles")


  public List<String> getRoles() {
    return roles;
  }

  public void setRoles(List<String> roles) {
    this.roles = roles;
  }

  public SoftwareStatementCreateSchema termsOfServiceUri(String termsOfServiceUri) {
    this.termsOfServiceUri = termsOfServiceUri;
    return this;
  }

  /**
   * The Software Statement terms of service RFC-3986-compliant URI
   * @return termsOfServiceUri
  **/
  @ApiModelProperty(value = "The Software Statement terms of service RFC-3986-compliant URI")

@Size(max=256) 
  public String getTermsOfServiceUri() {
    return termsOfServiceUri;
  }

  public void setTermsOfServiceUri(String termsOfServiceUri) {
    this.termsOfServiceUri = termsOfServiceUri;
  }

  public SoftwareStatementCreateSchema version(BigDecimal version) {
    this.version = version;
    return this;
  }

  /**
   * Software Statement version as provided by the organisation's PTC
   * @return version
  **/
  @ApiModelProperty(value = "Software Statement version as provided by the organisation's PTC")

  @Valid

  public BigDecimal getVersion() {
    return version;
  }

  public void setVersion(BigDecimal version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SoftwareStatementCreateSchema softwareStatementCreateSchema = (SoftwareStatementCreateSchema) o;
    return Objects.equals(this.clientName, softwareStatementCreateSchema.clientName) &&
        Objects.equals(this.clientUri, softwareStatementCreateSchema.clientUri) &&
        Objects.equals(this.description, softwareStatementCreateSchema.description) &&
        Objects.equals(this.logoUri, softwareStatementCreateSchema.logoUri) &&
        Objects.equals(this.onBehalfOfObOrganisation, softwareStatementCreateSchema.onBehalfOfObOrganisation) &&
        Objects.equals(this.policyUri, softwareStatementCreateSchema.policyUri) &&
        Objects.equals(this.redirectUri, softwareStatementCreateSchema.redirectUri) &&
        Objects.equals(this.roles, softwareStatementCreateSchema.roles) &&
        Objects.equals(this.termsOfServiceUri, softwareStatementCreateSchema.termsOfServiceUri) &&
        Objects.equals(this.version, softwareStatementCreateSchema.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientName, clientUri, description, logoUri, onBehalfOfObOrganisation, policyUri, redirectUri, roles, termsOfServiceUri, version);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

