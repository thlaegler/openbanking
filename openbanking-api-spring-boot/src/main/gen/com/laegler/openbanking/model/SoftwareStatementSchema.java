package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SoftwareStatementSchema
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class SoftwareStatementSchema   {
  @JsonProperty("Active")
  private Boolean active = null;

  @JsonProperty("ClientId")
  private String clientId = null;

  @JsonProperty("ClientName")
  private String clientName = null;

  @JsonProperty("ClientUri")
  private String clientUri = null;

  @JsonProperty("Description")
  private String description = null;

  @JsonProperty("Id")
  private String id = null;

  @JsonProperty("LogoUri")
  private String logoUri = null;

  /**
   * Software Statement mode
   */
  public enum ModeEnum {
    LIVE("Live"),
    
    NOTLIVE("NotLive");

    private String value;

    ModeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ModeEnum fromValue(String text) {
      for (ModeEnum b : ModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("Mode")
  private ModeEnum mode = null;

  @JsonProperty("ObClientCreated")
  private Boolean obClientCreated = null;

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

  @JsonProperty("SigningKeyIds")
  @Valid
  private List<String> signingKeyIds = null;

  @JsonProperty("TermsOfServiceUri")
  private String termsOfServiceUri = null;

  @JsonProperty("TransportKeyIds")
  @Valid
  private List<String> transportKeyIds = null;

  @JsonProperty("Version")
  private BigDecimal version = null;

  public SoftwareStatementSchema active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Software Statement active/inactive flag
   * @return active
  **/
  @ApiModelProperty(value = "Software Statement active/inactive flag")


  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public SoftwareStatementSchema clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Software Statement client Id
   * @return clientId
  **/
  @ApiModelProperty(value = "Software Statement client Id")

@Size(max=22) 
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public SoftwareStatementSchema clientName(String clientName) {
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

  public SoftwareStatementSchema clientUri(String clientUri) {
    this.clientUri = clientUri;
    return this;
  }

  /**
   * The Software Statement client RFC-3986-compliant URI
   * @return clientUri
  **/
  @ApiModelProperty(value = "The Software Statement client RFC-3986-compliant URI")

@Size(max=256) 
  public String getClientUri() {
    return clientUri;
  }

  public void setClientUri(String clientUri) {
    this.clientUri = clientUri;
  }

  public SoftwareStatementSchema description(String description) {
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

  public SoftwareStatementSchema id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Software Statement Id
   * @return id
  **/
  @ApiModelProperty(value = "Software Statement Id")

@Size(max=22) 
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SoftwareStatementSchema logoUri(String logoUri) {
    this.logoUri = logoUri;
    return this;
  }

  /**
   * The Software Statement logo RFC-3986-compliant URI
   * @return logoUri
  **/
  @ApiModelProperty(value = "The Software Statement logo RFC-3986-compliant URI")

@Size(max=256) 
  public String getLogoUri() {
    return logoUri;
  }

  public void setLogoUri(String logoUri) {
    this.logoUri = logoUri;
  }

  public SoftwareStatementSchema mode(ModeEnum mode) {
    this.mode = mode;
    return this;
  }

  /**
   * Software Statement mode
   * @return mode
  **/
  @ApiModelProperty(value = "Software Statement mode")

@Size(max=8) 
  public ModeEnum getMode() {
    return mode;
  }

  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }

  public SoftwareStatementSchema obClientCreated(Boolean obClientCreated) {
    this.obClientCreated = obClientCreated;
    return this;
  }

  /**
   * Client created flag
   * @return obClientCreated
  **/
  @ApiModelProperty(value = "Client created flag")


  public Boolean isObClientCreated() {
    return obClientCreated;
  }

  public void setObClientCreated(Boolean obClientCreated) {
    this.obClientCreated = obClientCreated;
  }

  public SoftwareStatementSchema onBehalfOfObOrganisation(String onBehalfOfObOrganisation) {
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

  public SoftwareStatementSchema policyUri(String policyUri) {
    this.policyUri = policyUri;
    return this;
  }

  /**
   * The Software Statement policy RFC-3986-compliant URI
   * @return policyUri
  **/
  @ApiModelProperty(value = "The Software Statement policy RFC-3986-compliant URI")

@Size(max=256) 
  public String getPolicyUri() {
    return policyUri;
  }

  public void setPolicyUri(String policyUri) {
    this.policyUri = policyUri;
  }

  public SoftwareStatementSchema redirectUri(List<String> redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }

  public SoftwareStatementSchema addRedirectUriItem(String redirectUriItem) {
    if (this.redirectUri == null) {
      this.redirectUri = new ArrayList<>();
    }
    this.redirectUri.add(redirectUriItem);
    return this;
  }

  /**
   * The Software Statement redirect RFC-3986-compliant URI
   * @return redirectUri
  **/
  @ApiModelProperty(value = "The Software Statement redirect RFC-3986-compliant URI")


  public List<String> getRedirectUri() {
    return redirectUri;
  }

  public void setRedirectUri(List<String> redirectUri) {
    this.redirectUri = redirectUri;
  }

  public SoftwareStatementSchema roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public SoftwareStatementSchema addRolesItem(String rolesItem) {
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

  public SoftwareStatementSchema signingKeyIds(List<String> signingKeyIds) {
    this.signingKeyIds = signingKeyIds;
    return this;
  }

  public SoftwareStatementSchema addSigningKeyIdsItem(String signingKeyIdsItem) {
    if (this.signingKeyIds == null) {
      this.signingKeyIds = new ArrayList<>();
    }
    this.signingKeyIds.add(signingKeyIdsItem);
    return this;
  }

  /**
   * The list of signing certificate Ids
   * @return signingKeyIds
  **/
  @ApiModelProperty(value = "The list of signing certificate Ids")


  public List<String> getSigningKeyIds() {
    return signingKeyIds;
  }

  public void setSigningKeyIds(List<String> signingKeyIds) {
    this.signingKeyIds = signingKeyIds;
  }

  public SoftwareStatementSchema termsOfServiceUri(String termsOfServiceUri) {
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

  public SoftwareStatementSchema transportKeyIds(List<String> transportKeyIds) {
    this.transportKeyIds = transportKeyIds;
    return this;
  }

  public SoftwareStatementSchema addTransportKeyIdsItem(String transportKeyIdsItem) {
    if (this.transportKeyIds == null) {
      this.transportKeyIds = new ArrayList<>();
    }
    this.transportKeyIds.add(transportKeyIdsItem);
    return this;
  }

  /**
   * The list of transport certificate Ids
   * @return transportKeyIds
  **/
  @ApiModelProperty(value = "The list of transport certificate Ids")


  public List<String> getTransportKeyIds() {
    return transportKeyIds;
  }

  public void setTransportKeyIds(List<String> transportKeyIds) {
    this.transportKeyIds = transportKeyIds;
  }

  public SoftwareStatementSchema version(BigDecimal version) {
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
    SoftwareStatementSchema softwareStatementSchema = (SoftwareStatementSchema) o;
    return Objects.equals(this.active, softwareStatementSchema.active) &&
        Objects.equals(this.clientId, softwareStatementSchema.clientId) &&
        Objects.equals(this.clientName, softwareStatementSchema.clientName) &&
        Objects.equals(this.clientUri, softwareStatementSchema.clientUri) &&
        Objects.equals(this.description, softwareStatementSchema.description) &&
        Objects.equals(this.id, softwareStatementSchema.id) &&
        Objects.equals(this.logoUri, softwareStatementSchema.logoUri) &&
        Objects.equals(this.mode, softwareStatementSchema.mode) &&
        Objects.equals(this.obClientCreated, softwareStatementSchema.obClientCreated) &&
        Objects.equals(this.onBehalfOfObOrganisation, softwareStatementSchema.onBehalfOfObOrganisation) &&
        Objects.equals(this.policyUri, softwareStatementSchema.policyUri) &&
        Objects.equals(this.redirectUri, softwareStatementSchema.redirectUri) &&
        Objects.equals(this.roles, softwareStatementSchema.roles) &&
        Objects.equals(this.signingKeyIds, softwareStatementSchema.signingKeyIds) &&
        Objects.equals(this.termsOfServiceUri, softwareStatementSchema.termsOfServiceUri) &&
        Objects.equals(this.transportKeyIds, softwareStatementSchema.transportKeyIds) &&
        Objects.equals(this.version, softwareStatementSchema.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, clientId, clientName, clientUri, description, id, logoUri, mode, obClientCreated, onBehalfOfObOrganisation, policyUri, redirectUri, roles, signingKeyIds, termsOfServiceUri, transportKeyIds, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SoftwareStatementSchema {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    clientUri: ").append(toIndentedString(clientUri)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    logoUri: ").append(toIndentedString(logoUri)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    obClientCreated: ").append(toIndentedString(obClientCreated)).append("\n");
    sb.append("    onBehalfOfObOrganisation: ").append(toIndentedString(onBehalfOfObOrganisation)).append("\n");
    sb.append("    policyUri: ").append(toIndentedString(policyUri)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    signingKeyIds: ").append(toIndentedString(signingKeyIds)).append("\n");
    sb.append("    termsOfServiceUri: ").append(toIndentedString(termsOfServiceUri)).append("\n");
    sb.append("    transportKeyIds: ").append(toIndentedString(transportKeyIds)).append("\n");
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

