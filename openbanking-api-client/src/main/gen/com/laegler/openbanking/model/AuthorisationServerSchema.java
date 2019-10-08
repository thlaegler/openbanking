package com.laegler.openbanking.model;

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

public class AuthorisationServerSchema  {
  
  @ApiModelProperty(value = "")
  private Boolean autoRegistrationSupported = null;

  @ApiModelProperty(value = "An RFC-3986-compliant URI")
 /**
   * An RFC-3986-compliant URI
  **/
  private String baseApiDNSUri = null;

  @ApiModelProperty(value = "")
  private String customerFriendlyDescription = null;

  @ApiModelProperty(value = "An RFC-3986-compliant URI")
 /**
   * An RFC-3986-compliant URI
  **/
  private String customerFriendlyLogoUri = null;

  @ApiModelProperty(value = "")
  private String customerFriendlyName = null;

  @ApiModelProperty(value = "An RFC-3986-compliant URI")
 /**
   * An RFC-3986-compliant URI
  **/
  private String developerPortalUri = null;

  @ApiModelProperty(value = "")
  private List<String> eiSCDId = null;

  @ApiModelProperty(value = "")
  private String id = null;

  @ApiModelProperty(value = "An RFC-3986-compliant URI")
 /**
   * An RFC-3986-compliant URI
  **/
  private String openIDConfigEndPointUri = null;

  @ApiModelProperty(value = "")
  private String parentAuthorisationServerId = null;

  @ApiModelProperty(value = "An RFC-3986-compliant URI")
 /**
   * An RFC-3986-compliant URI
  **/
  private String payloadSigningCertLocation = null;

  @ApiModelProperty(value = "An RFC-3986-compliant URI")
 /**
   * An RFC-3986-compliant URI
  **/
  private String termsOfService = null;
 /**
   * Get autoRegistrationSupported
   * @return autoRegistrationSupported
  **/
  @JsonProperty("AutoRegistrationSupported")
  public Boolean isAutoRegistrationSupported() {
    return autoRegistrationSupported;
  }

  public void setAutoRegistrationSupported(Boolean autoRegistrationSupported) {
    this.autoRegistrationSupported = autoRegistrationSupported;
  }

  public AuthorisationServerSchema autoRegistrationSupported(Boolean autoRegistrationSupported) {
    this.autoRegistrationSupported = autoRegistrationSupported;
    return this;
  }

 /**
   * An RFC-3986-compliant URI
   * @return baseApiDNSUri
  **/
  @JsonProperty("BaseApiDNSUri")
  public String getBaseApiDNSUri() {
    return baseApiDNSUri;
  }

  public void setBaseApiDNSUri(String baseApiDNSUri) {
    this.baseApiDNSUri = baseApiDNSUri;
  }

  public AuthorisationServerSchema baseApiDNSUri(String baseApiDNSUri) {
    this.baseApiDNSUri = baseApiDNSUri;
    return this;
  }

 /**
   * Get customerFriendlyDescription
   * @return customerFriendlyDescription
  **/
  @JsonProperty("CustomerFriendlyDescription")
  public String getCustomerFriendlyDescription() {
    return customerFriendlyDescription;
  }

  public void setCustomerFriendlyDescription(String customerFriendlyDescription) {
    this.customerFriendlyDescription = customerFriendlyDescription;
  }

  public AuthorisationServerSchema customerFriendlyDescription(String customerFriendlyDescription) {
    this.customerFriendlyDescription = customerFriendlyDescription;
    return this;
  }

 /**
   * An RFC-3986-compliant URI
   * @return customerFriendlyLogoUri
  **/
  @JsonProperty("CustomerFriendlyLogoUri")
  public String getCustomerFriendlyLogoUri() {
    return customerFriendlyLogoUri;
  }

  public void setCustomerFriendlyLogoUri(String customerFriendlyLogoUri) {
    this.customerFriendlyLogoUri = customerFriendlyLogoUri;
  }

  public AuthorisationServerSchema customerFriendlyLogoUri(String customerFriendlyLogoUri) {
    this.customerFriendlyLogoUri = customerFriendlyLogoUri;
    return this;
  }

 /**
   * Get customerFriendlyName
   * @return customerFriendlyName
  **/
  @JsonProperty("CustomerFriendlyName")
  public String getCustomerFriendlyName() {
    return customerFriendlyName;
  }

  public void setCustomerFriendlyName(String customerFriendlyName) {
    this.customerFriendlyName = customerFriendlyName;
  }

  public AuthorisationServerSchema customerFriendlyName(String customerFriendlyName) {
    this.customerFriendlyName = customerFriendlyName;
    return this;
  }

 /**
   * An RFC-3986-compliant URI
   * @return developerPortalUri
  **/
  @JsonProperty("DeveloperPortalUri")
  public String getDeveloperPortalUri() {
    return developerPortalUri;
  }

  public void setDeveloperPortalUri(String developerPortalUri) {
    this.developerPortalUri = developerPortalUri;
  }

  public AuthorisationServerSchema developerPortalUri(String developerPortalUri) {
    this.developerPortalUri = developerPortalUri;
    return this;
  }

 /**
   * Get eiSCDId
   * @return eiSCDId
  **/
  @JsonProperty("EISCDId")
  public List<String> getEiSCDId() {
    return eiSCDId;
  }

  public void setEiSCDId(List<String> eiSCDId) {
    this.eiSCDId = eiSCDId;
  }

  public AuthorisationServerSchema eiSCDId(List<String> eiSCDId) {
    this.eiSCDId = eiSCDId;
    return this;
  }

  public AuthorisationServerSchema addEiSCDIdItem(String eiSCDIdItem) {
    this.eiSCDId.add(eiSCDIdItem);
    return this;
  }

 /**
   * Get id
   * @return id
  **/
  @JsonProperty("Id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AuthorisationServerSchema id(String id) {
    this.id = id;
    return this;
  }

 /**
   * An RFC-3986-compliant URI
   * @return openIDConfigEndPointUri
  **/
  @JsonProperty("OpenIDConfigEndPointUri")
  public String getOpenIDConfigEndPointUri() {
    return openIDConfigEndPointUri;
  }

  public void setOpenIDConfigEndPointUri(String openIDConfigEndPointUri) {
    this.openIDConfigEndPointUri = openIDConfigEndPointUri;
  }

  public AuthorisationServerSchema openIDConfigEndPointUri(String openIDConfigEndPointUri) {
    this.openIDConfigEndPointUri = openIDConfigEndPointUri;
    return this;
  }

 /**
   * Get parentAuthorisationServerId
   * @return parentAuthorisationServerId
  **/
  @JsonProperty("ParentAuthorisationServerId")
  public String getParentAuthorisationServerId() {
    return parentAuthorisationServerId;
  }

  public void setParentAuthorisationServerId(String parentAuthorisationServerId) {
    this.parentAuthorisationServerId = parentAuthorisationServerId;
  }

  public AuthorisationServerSchema parentAuthorisationServerId(String parentAuthorisationServerId) {
    this.parentAuthorisationServerId = parentAuthorisationServerId;
    return this;
  }

 /**
   * An RFC-3986-compliant URI
   * @return payloadSigningCertLocation
  **/
  @JsonProperty("PayloadSigningCertLocation")
  public String getPayloadSigningCertLocation() {
    return payloadSigningCertLocation;
  }

  public void setPayloadSigningCertLocation(String payloadSigningCertLocation) {
    this.payloadSigningCertLocation = payloadSigningCertLocation;
  }

  public AuthorisationServerSchema payloadSigningCertLocation(String payloadSigningCertLocation) {
    this.payloadSigningCertLocation = payloadSigningCertLocation;
    return this;
  }

 /**
   * An RFC-3986-compliant URI
   * @return termsOfService
  **/
  @JsonProperty("TermsOfService")
  public String getTermsOfService() {
    return termsOfService;
  }

  public void setTermsOfService(String termsOfService) {
    this.termsOfService = termsOfService;
  }

  public AuthorisationServerSchema termsOfService(String termsOfService) {
    this.termsOfService = termsOfService;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorisationServerSchema {\n");
    
    sb.append("    autoRegistrationSupported: ").append(toIndentedString(autoRegistrationSupported)).append("\n");
    sb.append("    baseApiDNSUri: ").append(toIndentedString(baseApiDNSUri)).append("\n");
    sb.append("    customerFriendlyDescription: ").append(toIndentedString(customerFriendlyDescription)).append("\n");
    sb.append("    customerFriendlyLogoUri: ").append(toIndentedString(customerFriendlyLogoUri)).append("\n");
    sb.append("    customerFriendlyName: ").append(toIndentedString(customerFriendlyName)).append("\n");
    sb.append("    developerPortalUri: ").append(toIndentedString(developerPortalUri)).append("\n");
    sb.append("    eiSCDId: ").append(toIndentedString(eiSCDId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    openIDConfigEndPointUri: ").append(toIndentedString(openIDConfigEndPointUri)).append("\n");
    sb.append("    parentAuthorisationServerId: ").append(toIndentedString(parentAuthorisationServerId)).append("\n");
    sb.append("    payloadSigningCertLocation: ").append(toIndentedString(payloadSigningCertLocation)).append("\n");
    sb.append("    termsOfService: ").append(toIndentedString(termsOfService)).append("\n");
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

