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
 * SoftwareStatement1SoftwareStatements
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class SoftwareStatement1SoftwareStatements   {
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

  @JsonProperty("Mode")
  private String mode = null;

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

  public SoftwareStatement1SoftwareStatements active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Flag to show if software statement is active
   * @return active
  **/
  @ApiModelProperty(value = "Flag to show if software statement is active")


  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public SoftwareStatement1SoftwareStatements clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Requested Client Id - note that OB will issue a set of credentials with this clientid for this given piece of software. ASPSPs are not obliged to honour this requested clientid
   * @return clientId
  **/
  @ApiModelProperty(value = "Requested Client Id - note that OB will issue a set of credentials with this clientid for this given piece of software. ASPSPs are not obliged to honour this requested clientid")


  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public SoftwareStatement1SoftwareStatements clientName(String clientName) {
    this.clientName = clientName;
    return this;
  }

  /**
   * Human readable client name. May be localised.
   * @return clientName
  **/
  @ApiModelProperty(value = "Human readable client name. May be localised.")


  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public SoftwareStatement1SoftwareStatements clientUri(String clientUri) {
    this.clientUri = clientUri;
    return this;
  }

  /**
   * The “home page” or other wise recognisable url of the application (oath client) Version 22, 14th November 2017. V39 Changed to required
   * @return clientUri
  **/
  @ApiModelProperty(value = "The “home page” or other wise recognisable url of the application (oath client) Version 22, 14th November 2017. V39 Changed to required")


  public String getClientUri() {
    return clientUri;
  }

  public void setClientUri(String clientUri) {
    this.clientUri = clientUri;
  }

  public SoftwareStatement1SoftwareStatements description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the unique instance of this piece of software. If only one instance of a piece of software is to be registered then this should be the same as the SoftwareDescription \\nV39 Changed to required
   * @return description
  **/
  @ApiModelProperty(value = "Description of the unique instance of this piece of software. If only one instance of a piece of software is to be registered then this should be the same as the SoftwareDescription \\nV39 Changed to required")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SoftwareStatement1SoftwareStatements id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique Scheme Wide Software id
   * @return id
  **/
  @ApiModelProperty(value = "Unique Scheme Wide Software id")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SoftwareStatement1SoftwareStatements logoUri(String logoUri) {
    this.logoUri = logoUri;
    return this;
  }

  /**
   * The software logo Version 22, 14th November 2017. V39 Changed to required
   * @return logoUri
  **/
  @ApiModelProperty(value = "The software logo Version 22, 14th November 2017. V39 Changed to required")


  public String getLogoUri() {
    return logoUri;
  }

  public void setLogoUri(String logoUri) {
    this.logoUri = logoUri;
  }

  public SoftwareStatement1SoftwareStatements mode(String mode) {
    this.mode = mode;
    return this;
  }

  /**
   * A flag to identify if a piece of software should have access to production PSU accounts. This field has been added at the request of an ASPSP to allow BETA or Non Production testing against production platforms. The default for this system should be 'Live'
   * @return mode
  **/
  @ApiModelProperty(value = "A flag to identify if a piece of software should have access to production PSU accounts. This field has been added at the request of an ASPSP to allow BETA or Non Production testing against production platforms. The default for this system should be 'Live'")


  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  public SoftwareStatement1SoftwareStatements obClientCreated(Boolean obClientCreated) {
    this.obClientCreated = obClientCreated;
    return this;
  }

  /**
   * An indicator to show if the client has been created in Open Banking
   * @return obClientCreated
  **/
  @ApiModelProperty(value = "An indicator to show if the client has been created in Open Banking")


  public Boolean isObClientCreated() {
    return obClientCreated;
  }

  public void setObClientCreated(Boolean obClientCreated) {
    this.obClientCreated = obClientCreated;
  }

  public SoftwareStatement1SoftwareStatements onBehalfOfObOrganisation(String onBehalfOfObOrganisation) {
    this.onBehalfOfObOrganisation = onBehalfOfObOrganisation;
    return this;
  }

  /**
   * The organisation on whom this software statement is behalf of Altered from reference to string, 10/11/2017
   * @return onBehalfOfObOrganisation
  **/
  @ApiModelProperty(value = "The organisation on whom this software statement is behalf of Altered from reference to string, 10/11/2017")


  public String getOnBehalfOfObOrganisation() {
    return onBehalfOfObOrganisation;
  }

  public void setOnBehalfOfObOrganisation(String onBehalfOfObOrganisation) {
    this.onBehalfOfObOrganisation = onBehalfOfObOrganisation;
  }

  public SoftwareStatement1SoftwareStatements policyUri(String policyUri) {
    this.policyUri = policyUri;
    return this;
  }

  /**
   * An optional document containing a link to a Policy document governing the privacy information policy of for the application. Purely to be displayed a PSU at a ASPSP if the ASPSP supports it. Optional for the TPP to provide. V39 Changed to required
   * @return policyUri
  **/
  @ApiModelProperty(value = "An optional document containing a link to a Policy document governing the privacy information policy of for the application. Purely to be displayed a PSU at a ASPSP if the ASPSP supports it. Optional for the TPP to provide. V39 Changed to required")


  public String getPolicyUri() {
    return policyUri;
  }

  public void setPolicyUri(String policyUri) {
    this.policyUri = policyUri;
  }

  public SoftwareStatement1SoftwareStatements redirectUri(List<String> redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }

  public SoftwareStatement1SoftwareStatements addRedirectUriItem(String redirectUriItem) {
    if (this.redirectUri == null) {
      this.redirectUri = new ArrayList<>();
    }
    this.redirectUri.add(redirectUriItem);
    return this;
  }

  /**
   * Redirect Uri's for the registered piece of software. May be overridden by the RFC7591 payload. Changed in v27. V39 Changed to required
   * @return redirectUri
  **/
  @ApiModelProperty(value = "Redirect Uri's for the registered piece of software. May be overridden by the RFC7591 payload. Changed in v27. V39 Changed to required")


  public List<String> getRedirectUri() {
    return redirectUri;
  }

  public void setRedirectUri(List<String> redirectUri) {
    this.redirectUri = redirectUri;
  }

  public SoftwareStatement1SoftwareStatements roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public SoftwareStatement1SoftwareStatements addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

  /**
   * Roles for which this software statement can be used. Changed to required Mike Ekers request
   * @return roles
  **/
  @ApiModelProperty(value = "Roles for which this software statement can be used. Changed to required Mike Ekers request")


  public List<String> getRoles() {
    return roles;
  }

  public void setRoles(List<String> roles) {
    this.roles = roles;
  }

  public SoftwareStatement1SoftwareStatements signingKeyIds(List<String> signingKeyIds) {
    this.signingKeyIds = signingKeyIds;
    return this;
  }

  public SoftwareStatement1SoftwareStatements addSigningKeyIdsItem(String signingKeyIdsItem) {
    if (this.signingKeyIds == null) {
      this.signingKeyIds = new ArrayList<>();
    }
    this.signingKeyIds.add(signingKeyIdsItem);
    return this;
  }

  /**
   * KeyIds of Keys  used for signing messages
   * @return signingKeyIds
  **/
  @ApiModelProperty(value = "KeyIds of Keys  used for signing messages")


  public List<String> getSigningKeyIds() {
    return signingKeyIds;
  }

  public void setSigningKeyIds(List<String> signingKeyIds) {
    this.signingKeyIds = signingKeyIds;
  }

  public SoftwareStatement1SoftwareStatements termsOfServiceUri(String termsOfServiceUri) {
    this.termsOfServiceUri = termsOfServiceUri;
    return this;
  }

  /**
   * An optional document containing a link to a Terms of Service document governing the terms of service for the application. Purely to be displayed a PSU at a ASPSP if the ASPSP supports it. Optional for the TPP to provide. V39 Changed to required
   * @return termsOfServiceUri
  **/
  @ApiModelProperty(value = "An optional document containing a link to a Terms of Service document governing the terms of service for the application. Purely to be displayed a PSU at a ASPSP if the ASPSP supports it. Optional for the TPP to provide. V39 Changed to required")


  public String getTermsOfServiceUri() {
    return termsOfServiceUri;
  }

  public void setTermsOfServiceUri(String termsOfServiceUri) {
    this.termsOfServiceUri = termsOfServiceUri;
  }

  public SoftwareStatement1SoftwareStatements transportKeyIds(List<String> transportKeyIds) {
    this.transportKeyIds = transportKeyIds;
    return this;
  }

  public SoftwareStatement1SoftwareStatements addTransportKeyIdsItem(String transportKeyIdsItem) {
    if (this.transportKeyIds == null) {
      this.transportKeyIds = new ArrayList<>();
    }
    this.transportKeyIds.add(transportKeyIdsItem);
    return this;
  }

  /**
   * KeyIds of Keys used for securing message transport (TLS)
   * @return transportKeyIds
  **/
  @ApiModelProperty(value = "KeyIds of Keys used for securing message transport (TLS)")


  public List<String> getTransportKeyIds() {
    return transportKeyIds;
  }

  public void setTransportKeyIds(List<String> transportKeyIds) {
    this.transportKeyIds = transportKeyIds;
  }

  public SoftwareStatement1SoftwareStatements version(BigDecimal version) {
    this.version = version;
    return this;
  }

  /**
   * Version of the sofware. V39 Changed to required
   * @return version
  **/
  @ApiModelProperty(value = "Version of the sofware. V39 Changed to required")

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
    SoftwareStatement1SoftwareStatements softwareStatement1SoftwareStatements = (SoftwareStatement1SoftwareStatements) o;
    return Objects.equals(this.active, softwareStatement1SoftwareStatements.active) &&
        Objects.equals(this.clientId, softwareStatement1SoftwareStatements.clientId) &&
        Objects.equals(this.clientName, softwareStatement1SoftwareStatements.clientName) &&
        Objects.equals(this.clientUri, softwareStatement1SoftwareStatements.clientUri) &&
        Objects.equals(this.description, softwareStatement1SoftwareStatements.description) &&
        Objects.equals(this.id, softwareStatement1SoftwareStatements.id) &&
        Objects.equals(this.logoUri, softwareStatement1SoftwareStatements.logoUri) &&
        Objects.equals(this.mode, softwareStatement1SoftwareStatements.mode) &&
        Objects.equals(this.obClientCreated, softwareStatement1SoftwareStatements.obClientCreated) &&
        Objects.equals(this.onBehalfOfObOrganisation, softwareStatement1SoftwareStatements.onBehalfOfObOrganisation) &&
        Objects.equals(this.policyUri, softwareStatement1SoftwareStatements.policyUri) &&
        Objects.equals(this.redirectUri, softwareStatement1SoftwareStatements.redirectUri) &&
        Objects.equals(this.roles, softwareStatement1SoftwareStatements.roles) &&
        Objects.equals(this.signingKeyIds, softwareStatement1SoftwareStatements.signingKeyIds) &&
        Objects.equals(this.termsOfServiceUri, softwareStatement1SoftwareStatements.termsOfServiceUri) &&
        Objects.equals(this.transportKeyIds, softwareStatement1SoftwareStatements.transportKeyIds) &&
        Objects.equals(this.version, softwareStatement1SoftwareStatements.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, clientId, clientName, clientUri, description, id, logoUri, mode, obClientCreated, onBehalfOfObOrganisation, policyUri, redirectUri, roles, signingKeyIds, termsOfServiceUri, transportKeyIds, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SoftwareStatement1SoftwareStatements {\n");
    
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

