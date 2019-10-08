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

public class SoftwareStatement1SoftwareStatements  {
  
  @ApiModelProperty(value = "Flag to show if software statement is active")
 /**
   * Flag to show if software statement is active
  **/
  private Boolean active = null;

  @ApiModelProperty(value = "Requested Client Id - note that OB will issue a set of credentials with this clientid for this given piece of software. ASPSPs are not obliged to honour this requested clientid")
 /**
   * Requested Client Id - note that OB will issue a set of credentials with this clientid for this given piece of software. ASPSPs are not obliged to honour this requested clientid
  **/
  private String clientId = null;

  @ApiModelProperty(value = "Human readable client name. May be localised.")
 /**
   * Human readable client name. May be localised.
  **/
  private String clientName = null;

  @ApiModelProperty(value = "The “home page” or other wise recognisable url of the application (oath client) Version 22, 14th November 2017. V39 Changed to required")
 /**
   * The “home page” or other wise recognisable url of the application (oath client) Version 22, 14th November 2017. V39 Changed to required
  **/
  private String clientUri = null;

  @ApiModelProperty(value = "Description of the unique instance of this piece of software. If only one instance of a piece of software is to be registered then this should be the same as the SoftwareDescription \\nV39 Changed to required")
 /**
   * Description of the unique instance of this piece of software. If only one instance of a piece of software is to be registered then this should be the same as the SoftwareDescription \\nV39 Changed to required
  **/
  private String description = null;

  @ApiModelProperty(value = "Unique Scheme Wide Software id")
 /**
   * Unique Scheme Wide Software id
  **/
  private String id = null;

  @ApiModelProperty(value = "The software logo Version 22, 14th November 2017. V39 Changed to required")
 /**
   * The software logo Version 22, 14th November 2017. V39 Changed to required
  **/
  private String logoUri = null;

  @ApiModelProperty(value = "A flag to identify if a piece of software should have access to production PSU accounts. This field has been added at the request of an ASPSP to allow BETA or Non Production testing against production platforms. The default for this system should be 'Live'")
 /**
   * A flag to identify if a piece of software should have access to production PSU accounts. This field has been added at the request of an ASPSP to allow BETA or Non Production testing against production platforms. The default for this system should be 'Live'
  **/
  private String mode = null;

  @ApiModelProperty(value = "An indicator to show if the client has been created in Open Banking")
 /**
   * An indicator to show if the client has been created in Open Banking
  **/
  private Boolean obClientCreated = null;

  @ApiModelProperty(value = "The organisation on whom this software statement is behalf of Altered from reference to string, 10/11/2017")
 /**
   * The organisation on whom this software statement is behalf of Altered from reference to string, 10/11/2017
  **/
  private String onBehalfOfObOrganisation = null;

  @ApiModelProperty(value = "An optional document containing a link to a Policy document governing the privacy information policy of for the application. Purely to be displayed a PSU at a ASPSP if the ASPSP supports it. Optional for the TPP to provide. V39 Changed to required")
 /**
   * An optional document containing a link to a Policy document governing the privacy information policy of for the application. Purely to be displayed a PSU at a ASPSP if the ASPSP supports it. Optional for the TPP to provide. V39 Changed to required
  **/
  private String policyUri = null;

  @ApiModelProperty(value = "Redirect Uri's for the registered piece of software. May be overridden by the RFC7591 payload. Changed in v27. V39 Changed to required")
 /**
   * Redirect Uri's for the registered piece of software. May be overridden by the RFC7591 payload. Changed in v27. V39 Changed to required
  **/
  private List<String> redirectUri = null;

  @ApiModelProperty(value = "Roles for which this software statement can be used. Changed to required Mike Ekers request")
 /**
   * Roles for which this software statement can be used. Changed to required Mike Ekers request
  **/
  private List<String> roles = null;

  @ApiModelProperty(value = "KeyIds of Keys  used for signing messages")
 /**
   * KeyIds of Keys  used for signing messages
  **/
  private List<String> signingKeyIds = null;

  @ApiModelProperty(value = "An optional document containing a link to a Terms of Service document governing the terms of service for the application. Purely to be displayed a PSU at a ASPSP if the ASPSP supports it. Optional for the TPP to provide. V39 Changed to required")
 /**
   * An optional document containing a link to a Terms of Service document governing the terms of service for the application. Purely to be displayed a PSU at a ASPSP if the ASPSP supports it. Optional for the TPP to provide. V39 Changed to required
  **/
  private String termsOfServiceUri = null;

  @ApiModelProperty(value = "KeyIds of Keys used for securing message transport (TLS)")
 /**
   * KeyIds of Keys used for securing message transport (TLS)
  **/
  private List<String> transportKeyIds = null;

  @ApiModelProperty(value = "Version of the sofware. V39 Changed to required")
  @Valid
 /**
   * Version of the sofware. V39 Changed to required
  **/
  private BigDecimal version = null;
 /**
   * Flag to show if software statement is active
   * @return active
  **/
  @JsonProperty("Active")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public SoftwareStatement1SoftwareStatements active(Boolean active) {
    this.active = active;
    return this;
  }

 /**
   * Requested Client Id - note that OB will issue a set of credentials with this clientid for this given piece of software. ASPSPs are not obliged to honour this requested clientid
   * @return clientId
  **/
  @JsonProperty("ClientId")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public SoftwareStatement1SoftwareStatements clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

 /**
   * Human readable client name. May be localised.
   * @return clientName
  **/
  @JsonProperty("ClientName")
  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public SoftwareStatement1SoftwareStatements clientName(String clientName) {
    this.clientName = clientName;
    return this;
  }

 /**
   * The “home page” or other wise recognisable url of the application (oath client) Version 22, 14th November 2017. V39 Changed to required
   * @return clientUri
  **/
  @JsonProperty("ClientUri")
  public String getClientUri() {
    return clientUri;
  }

  public void setClientUri(String clientUri) {
    this.clientUri = clientUri;
  }

  public SoftwareStatement1SoftwareStatements clientUri(String clientUri) {
    this.clientUri = clientUri;
    return this;
  }

 /**
   * Description of the unique instance of this piece of software. If only one instance of a piece of software is to be registered then this should be the same as the SoftwareDescription \\nV39 Changed to required
   * @return description
  **/
  @JsonProperty("Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SoftwareStatement1SoftwareStatements description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Unique Scheme Wide Software id
   * @return id
  **/
  @JsonProperty("Id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SoftwareStatement1SoftwareStatements id(String id) {
    this.id = id;
    return this;
  }

 /**
   * The software logo Version 22, 14th November 2017. V39 Changed to required
   * @return logoUri
  **/
  @JsonProperty("LogoUri")
  public String getLogoUri() {
    return logoUri;
  }

  public void setLogoUri(String logoUri) {
    this.logoUri = logoUri;
  }

  public SoftwareStatement1SoftwareStatements logoUri(String logoUri) {
    this.logoUri = logoUri;
    return this;
  }

 /**
   * A flag to identify if a piece of software should have access to production PSU accounts. This field has been added at the request of an ASPSP to allow BETA or Non Production testing against production platforms. The default for this system should be &#39;Live&#39;
   * @return mode
  **/
  @JsonProperty("Mode")
  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  public SoftwareStatement1SoftwareStatements mode(String mode) {
    this.mode = mode;
    return this;
  }

 /**
   * An indicator to show if the client has been created in Open Banking
   * @return obClientCreated
  **/
  @JsonProperty("ObClientCreated")
  public Boolean isObClientCreated() {
    return obClientCreated;
  }

  public void setObClientCreated(Boolean obClientCreated) {
    this.obClientCreated = obClientCreated;
  }

  public SoftwareStatement1SoftwareStatements obClientCreated(Boolean obClientCreated) {
    this.obClientCreated = obClientCreated;
    return this;
  }

 /**
   * The organisation on whom this software statement is behalf of Altered from reference to string, 10/11/2017
   * @return onBehalfOfObOrganisation
  **/
  @JsonProperty("OnBehalfOfObOrganisation")
  public String getOnBehalfOfObOrganisation() {
    return onBehalfOfObOrganisation;
  }

  public void setOnBehalfOfObOrganisation(String onBehalfOfObOrganisation) {
    this.onBehalfOfObOrganisation = onBehalfOfObOrganisation;
  }

  public SoftwareStatement1SoftwareStatements onBehalfOfObOrganisation(String onBehalfOfObOrganisation) {
    this.onBehalfOfObOrganisation = onBehalfOfObOrganisation;
    return this;
  }

 /**
   * An optional document containing a link to a Policy document governing the privacy information policy of for the application. Purely to be displayed a PSU at a ASPSP if the ASPSP supports it. Optional for the TPP to provide. V39 Changed to required
   * @return policyUri
  **/
  @JsonProperty("PolicyUri")
  public String getPolicyUri() {
    return policyUri;
  }

  public void setPolicyUri(String policyUri) {
    this.policyUri = policyUri;
  }

  public SoftwareStatement1SoftwareStatements policyUri(String policyUri) {
    this.policyUri = policyUri;
    return this;
  }

 /**
   * Redirect Uri&#39;s for the registered piece of software. May be overridden by the RFC7591 payload. Changed in v27. V39 Changed to required
   * @return redirectUri
  **/
  @JsonProperty("RedirectUri")
  public List<String> getRedirectUri() {
    return redirectUri;
  }

  public void setRedirectUri(List<String> redirectUri) {
    this.redirectUri = redirectUri;
  }

  public SoftwareStatement1SoftwareStatements redirectUri(List<String> redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }

  public SoftwareStatement1SoftwareStatements addRedirectUriItem(String redirectUriItem) {
    this.redirectUri.add(redirectUriItem);
    return this;
  }

 /**
   * Roles for which this software statement can be used. Changed to required Mike Ekers request
   * @return roles
  **/
  @JsonProperty("Roles")
  public List<String> getRoles() {
    return roles;
  }

  public void setRoles(List<String> roles) {
    this.roles = roles;
  }

  public SoftwareStatement1SoftwareStatements roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public SoftwareStatement1SoftwareStatements addRolesItem(String rolesItem) {
    this.roles.add(rolesItem);
    return this;
  }

 /**
   * KeyIds of Keys  used for signing messages
   * @return signingKeyIds
  **/
  @JsonProperty("SigningKeyIds")
  public List<String> getSigningKeyIds() {
    return signingKeyIds;
  }

  public void setSigningKeyIds(List<String> signingKeyIds) {
    this.signingKeyIds = signingKeyIds;
  }

  public SoftwareStatement1SoftwareStatements signingKeyIds(List<String> signingKeyIds) {
    this.signingKeyIds = signingKeyIds;
    return this;
  }

  public SoftwareStatement1SoftwareStatements addSigningKeyIdsItem(String signingKeyIdsItem) {
    this.signingKeyIds.add(signingKeyIdsItem);
    return this;
  }

 /**
   * An optional document containing a link to a Terms of Service document governing the terms of service for the application. Purely to be displayed a PSU at a ASPSP if the ASPSP supports it. Optional for the TPP to provide. V39 Changed to required
   * @return termsOfServiceUri
  **/
  @JsonProperty("TermsOfServiceUri")
  public String getTermsOfServiceUri() {
    return termsOfServiceUri;
  }

  public void setTermsOfServiceUri(String termsOfServiceUri) {
    this.termsOfServiceUri = termsOfServiceUri;
  }

  public SoftwareStatement1SoftwareStatements termsOfServiceUri(String termsOfServiceUri) {
    this.termsOfServiceUri = termsOfServiceUri;
    return this;
  }

 /**
   * KeyIds of Keys used for securing message transport (TLS)
   * @return transportKeyIds
  **/
  @JsonProperty("TransportKeyIds")
  public List<String> getTransportKeyIds() {
    return transportKeyIds;
  }

  public void setTransportKeyIds(List<String> transportKeyIds) {
    this.transportKeyIds = transportKeyIds;
  }

  public SoftwareStatement1SoftwareStatements transportKeyIds(List<String> transportKeyIds) {
    this.transportKeyIds = transportKeyIds;
    return this;
  }

  public SoftwareStatement1SoftwareStatements addTransportKeyIdsItem(String transportKeyIdsItem) {
    this.transportKeyIds.add(transportKeyIdsItem);
    return this;
  }

 /**
   * Version of the sofware. V39 Changed to required
   * @return version
  **/
  @JsonProperty("Version")
  public BigDecimal getVersion() {
    return version;
  }

  public void setVersion(BigDecimal version) {
    this.version = version;
  }

  public SoftwareStatement1SoftwareStatements version(BigDecimal version) {
    this.version = version;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

