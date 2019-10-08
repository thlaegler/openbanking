package com.laegler.openbanking.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SoftwareStatementSchema  {
  
  @ApiModelProperty(value = "Software Statement active/inactive flag")
 /**
   * Software Statement active/inactive flag
  **/
  private Boolean active = null;

  @ApiModelProperty(value = "Software Statement client Id")
 /**
   * Software Statement client Id
  **/
  private String clientId = null;

  @ApiModelProperty(value = "Software Statement client name")
 /**
   * Software Statement client name
  **/
  private String clientName = null;

  @ApiModelProperty(value = "The Software Statement client RFC-3986-compliant URI")
 /**
   * The Software Statement client RFC-3986-compliant URI
  **/
  private String clientUri = null;

  @ApiModelProperty(value = "Software Statement description")
 /**
   * Software Statement description
  **/
  private String description = null;

  @ApiModelProperty(value = "Software Statement Id")
 /**
   * Software Statement Id
  **/
  private String id = null;

  @ApiModelProperty(value = "The Software Statement logo RFC-3986-compliant URI")
 /**
   * The Software Statement logo RFC-3986-compliant URI
  **/
  private String logoUri = null;


@XmlType(name="ModeEnum")
@XmlEnum(String.class)
public enum ModeEnum {

@XmlEnumValue("Live") LIVE(String.valueOf("Live")), @XmlEnumValue("NotLive") NOTLIVE(String.valueOf("NotLive"));


    private String value;

    ModeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ModeEnum fromValue(String v) {
        for (ModeEnum b : ModeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Software Statement mode")
 /**
   * Software Statement mode
  **/
  private ModeEnum mode = null;

  @ApiModelProperty(value = "Client created flag")
 /**
   * Client created flag
  **/
  private Boolean obClientCreated = null;

  @ApiModelProperty(value = "A reference to fourth party organisation resource on the OB Directory if the registering TPP is acting on behalf of another")
 /**
   * A reference to fourth party organisation resource on the OB Directory if the registering TPP is acting on behalf of another
  **/
  private String onBehalfOfObOrganisation = null;

  @ApiModelProperty(value = "The Software Statement policy RFC-3986-compliant URI")
 /**
   * The Software Statement policy RFC-3986-compliant URI
  **/
  private String policyUri = null;

  @ApiModelProperty(value = "The Software Statement redirect RFC-3986-compliant URI")
 /**
   * The Software Statement redirect RFC-3986-compliant URI
  **/
  private List<String> redirectUri = null;

  @ApiModelProperty(value = "The list of Software Statement roles")
 /**
   * The list of Software Statement roles
  **/
  private List<String> roles = null;

  @ApiModelProperty(value = "The list of signing certificate Ids")
 /**
   * The list of signing certificate Ids
  **/
  private List<String> signingKeyIds = null;

  @ApiModelProperty(value = "The Software Statement terms of service RFC-3986-compliant URI")
 /**
   * The Software Statement terms of service RFC-3986-compliant URI
  **/
  private String termsOfServiceUri = null;

  @ApiModelProperty(value = "The list of transport certificate Ids")
 /**
   * The list of transport certificate Ids
  **/
  private List<String> transportKeyIds = null;

  @ApiModelProperty(value = "Software Statement version as provided by the organisation's PTC")
 /**
   * Software Statement version as provided by the organisation's PTC
  **/
  private BigDecimal version = null;
 /**
   * Software Statement active/inactive flag
   * @return active
  **/
  @JsonProperty("Active")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public SoftwareStatementSchema active(Boolean active) {
    this.active = active;
    return this;
  }

 /**
   * Software Statement client Id
   * @return clientId
  **/
  @JsonProperty("ClientId")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public SoftwareStatementSchema clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

 /**
   * Software Statement client name
   * @return clientName
  **/
  @JsonProperty("ClientName")
  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public SoftwareStatementSchema clientName(String clientName) {
    this.clientName = clientName;
    return this;
  }

 /**
   * The Software Statement client RFC-3986-compliant URI
   * @return clientUri
  **/
  @JsonProperty("ClientUri")
  public String getClientUri() {
    return clientUri;
  }

  public void setClientUri(String clientUri) {
    this.clientUri = clientUri;
  }

  public SoftwareStatementSchema clientUri(String clientUri) {
    this.clientUri = clientUri;
    return this;
  }

 /**
   * Software Statement description
   * @return description
  **/
  @JsonProperty("Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SoftwareStatementSchema description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Software Statement Id
   * @return id
  **/
  @JsonProperty("Id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SoftwareStatementSchema id(String id) {
    this.id = id;
    return this;
  }

 /**
   * The Software Statement logo RFC-3986-compliant URI
   * @return logoUri
  **/
  @JsonProperty("LogoUri")
  public String getLogoUri() {
    return logoUri;
  }

  public void setLogoUri(String logoUri) {
    this.logoUri = logoUri;
  }

  public SoftwareStatementSchema logoUri(String logoUri) {
    this.logoUri = logoUri;
    return this;
  }

 /**
   * Software Statement mode
   * @return mode
  **/
  @JsonProperty("Mode")
  public String getMode() {
    if (mode == null) {
      return null;
    }
    return mode.value();
  }

  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }

  public SoftwareStatementSchema mode(ModeEnum mode) {
    this.mode = mode;
    return this;
  }

 /**
   * Client created flag
   * @return obClientCreated
  **/
  @JsonProperty("ObClientCreated")
  public Boolean isObClientCreated() {
    return obClientCreated;
  }

  public void setObClientCreated(Boolean obClientCreated) {
    this.obClientCreated = obClientCreated;
  }

  public SoftwareStatementSchema obClientCreated(Boolean obClientCreated) {
    this.obClientCreated = obClientCreated;
    return this;
  }

 /**
   * A reference to fourth party organisation resource on the OB Directory if the registering TPP is acting on behalf of another
   * @return onBehalfOfObOrganisation
  **/
  @JsonProperty("OnBehalfOfObOrganisation")
  public String getOnBehalfOfObOrganisation() {
    return onBehalfOfObOrganisation;
  }

  public void setOnBehalfOfObOrganisation(String onBehalfOfObOrganisation) {
    this.onBehalfOfObOrganisation = onBehalfOfObOrganisation;
  }

  public SoftwareStatementSchema onBehalfOfObOrganisation(String onBehalfOfObOrganisation) {
    this.onBehalfOfObOrganisation = onBehalfOfObOrganisation;
    return this;
  }

 /**
   * The Software Statement policy RFC-3986-compliant URI
   * @return policyUri
  **/
  @JsonProperty("PolicyUri")
  public String getPolicyUri() {
    return policyUri;
  }

  public void setPolicyUri(String policyUri) {
    this.policyUri = policyUri;
  }

  public SoftwareStatementSchema policyUri(String policyUri) {
    this.policyUri = policyUri;
    return this;
  }

 /**
   * The Software Statement redirect RFC-3986-compliant URI
   * @return redirectUri
  **/
  @JsonProperty("RedirectUri")
  public List<String> getRedirectUri() {
    return redirectUri;
  }

  public void setRedirectUri(List<String> redirectUri) {
    this.redirectUri = redirectUri;
  }

  public SoftwareStatementSchema redirectUri(List<String> redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }

  public SoftwareStatementSchema addRedirectUriItem(String redirectUriItem) {
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

  public SoftwareStatementSchema roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public SoftwareStatementSchema addRolesItem(String rolesItem) {
    this.roles.add(rolesItem);
    return this;
  }

 /**
   * The list of signing certificate Ids
   * @return signingKeyIds
  **/
  @JsonProperty("SigningKeyIds")
  public List<String> getSigningKeyIds() {
    return signingKeyIds;
  }

  public void setSigningKeyIds(List<String> signingKeyIds) {
    this.signingKeyIds = signingKeyIds;
  }

  public SoftwareStatementSchema signingKeyIds(List<String> signingKeyIds) {
    this.signingKeyIds = signingKeyIds;
    return this;
  }

  public SoftwareStatementSchema addSigningKeyIdsItem(String signingKeyIdsItem) {
    this.signingKeyIds.add(signingKeyIdsItem);
    return this;
  }

 /**
   * The Software Statement terms of service RFC-3986-compliant URI
   * @return termsOfServiceUri
  **/
  @JsonProperty("TermsOfServiceUri")
  public String getTermsOfServiceUri() {
    return termsOfServiceUri;
  }

  public void setTermsOfServiceUri(String termsOfServiceUri) {
    this.termsOfServiceUri = termsOfServiceUri;
  }

  public SoftwareStatementSchema termsOfServiceUri(String termsOfServiceUri) {
    this.termsOfServiceUri = termsOfServiceUri;
    return this;
  }

 /**
   * The list of transport certificate Ids
   * @return transportKeyIds
  **/
  @JsonProperty("TransportKeyIds")
  public List<String> getTransportKeyIds() {
    return transportKeyIds;
  }

  public void setTransportKeyIds(List<String> transportKeyIds) {
    this.transportKeyIds = transportKeyIds;
  }

  public SoftwareStatementSchema transportKeyIds(List<String> transportKeyIds) {
    this.transportKeyIds = transportKeyIds;
    return this;
  }

  public SoftwareStatementSchema addTransportKeyIdsItem(String transportKeyIdsItem) {
    this.transportKeyIds.add(transportKeyIdsItem);
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

  public SoftwareStatementSchema version(BigDecimal version) {
    this.version = version;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

