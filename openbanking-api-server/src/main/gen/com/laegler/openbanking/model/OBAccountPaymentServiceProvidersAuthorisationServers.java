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

public class OBAccountPaymentServiceProvidersAuthorisationServers  {
  
  @ApiModelProperty(value = "Authorisation Server supports auto-registration")
 /**
   * Authorisation Server supports auto-registration
  **/
  private Boolean autoRegistrationSupported = null;

  @ApiModelProperty(value = "Points to the Open Banking APIs V39 required")
 /**
   * Points to the Open Banking APIs V39 required
  **/
  private String baseApiDNSUri = null;

  @ApiModelProperty(value = "The registration endpoint for TPP onboarding to ASPSPs. V39 required")
 /**
   * The registration endpoint for TPP onboarding to ASPSPs. V39 required
  **/
  private String clientRegistrationUri = null;

  @ApiModelProperty(value = "Customer orientated description")
 /**
   * Customer orientated description
  **/
  private String customerFriendlyDescription = null;

  @ApiModelProperty(value = "uri from which a TPP can retrieve a certified logo V39 required")
 /**
   * uri from which a TPP can retrieve a certified logo V39 required
  **/
  private String customerFriendlyLogoUri = null;

  @ApiModelProperty(value = "Certified name")
 /**
   * Certified name
  **/
  private String customerFriendlyName = null;

  @ApiModelProperty(value = "URI for TPP developer testing V39 required")
 /**
   * URI for TPP developer testing V39 required
  **/
  private String developerPortalUri = null;

  @ApiModelProperty(value = "Confirmation of payee bank identifier V37 was CoPBankIdentifier")
 /**
   * Confirmation of payee bank identifier V37 was CoPBankIdentifier
  **/
  private List<String> eiSCDId = null;

  @ApiModelProperty(value = "Authorisation Server Id V39 required")
 /**
   * Authorisation Server Id V39 required
  **/
  private String id = null;

  @ApiModelProperty(value = "Uri used for Oauth2.0 OpenId Configuration V39 required")
 /**
   * Uri used for Oauth2.0 OpenId Configuration V39 required
  **/
  private String openIDConfigEndPointUri = null;

  @ApiModelProperty(value = "Authorisation Server Id of Parent Authorisation server, used for app to app linking")
 /**
   * Authorisation Server Id of Parent Authorisation server, used for app to app linking
  **/
  private String parentAuthorisationServerId = null;

  @ApiModelProperty(value = "The location which is used for signing certificates V39 required")
 /**
   * The location which is used for signing certificates V39 required
  **/
  private String payloadSigningCertLocation = null;

  @ApiModelProperty(value = "Uri from which the terms of service can be retrieved V39 required")
 /**
   * Uri from which the terms of service can be retrieved V39 required
  **/
  private String termsOfService = null;
 /**
   * Authorisation Server supports auto-registration
   * @return autoRegistrationSupported
  **/
  @JsonProperty("AutoRegistrationSupported")
  public Boolean isAutoRegistrationSupported() {
    return autoRegistrationSupported;
  }

  public void setAutoRegistrationSupported(Boolean autoRegistrationSupported) {
    this.autoRegistrationSupported = autoRegistrationSupported;
  }

  public OBAccountPaymentServiceProvidersAuthorisationServers autoRegistrationSupported(Boolean autoRegistrationSupported) {
    this.autoRegistrationSupported = autoRegistrationSupported;
    return this;
  }

 /**
   * Points to the Open Banking APIs V39 required
   * @return baseApiDNSUri
  **/
  @JsonProperty("BaseApiDNSUri")
  public String getBaseApiDNSUri() {
    return baseApiDNSUri;
  }

  public void setBaseApiDNSUri(String baseApiDNSUri) {
    this.baseApiDNSUri = baseApiDNSUri;
  }

  public OBAccountPaymentServiceProvidersAuthorisationServers baseApiDNSUri(String baseApiDNSUri) {
    this.baseApiDNSUri = baseApiDNSUri;
    return this;
  }

 /**
   * The registration endpoint for TPP onboarding to ASPSPs. V39 required
   * @return clientRegistrationUri
  **/
  @JsonProperty("ClientRegistrationUri")
  public String getClientRegistrationUri() {
    return clientRegistrationUri;
  }

  public void setClientRegistrationUri(String clientRegistrationUri) {
    this.clientRegistrationUri = clientRegistrationUri;
  }

  public OBAccountPaymentServiceProvidersAuthorisationServers clientRegistrationUri(String clientRegistrationUri) {
    this.clientRegistrationUri = clientRegistrationUri;
    return this;
  }

 /**
   * Customer orientated description
   * @return customerFriendlyDescription
  **/
  @JsonProperty("CustomerFriendlyDescription")
  public String getCustomerFriendlyDescription() {
    return customerFriendlyDescription;
  }

  public void setCustomerFriendlyDescription(String customerFriendlyDescription) {
    this.customerFriendlyDescription = customerFriendlyDescription;
  }

  public OBAccountPaymentServiceProvidersAuthorisationServers customerFriendlyDescription(String customerFriendlyDescription) {
    this.customerFriendlyDescription = customerFriendlyDescription;
    return this;
  }

 /**
   * uri from which a TPP can retrieve a certified logo V39 required
   * @return customerFriendlyLogoUri
  **/
  @JsonProperty("CustomerFriendlyLogoUri")
  public String getCustomerFriendlyLogoUri() {
    return customerFriendlyLogoUri;
  }

  public void setCustomerFriendlyLogoUri(String customerFriendlyLogoUri) {
    this.customerFriendlyLogoUri = customerFriendlyLogoUri;
  }

  public OBAccountPaymentServiceProvidersAuthorisationServers customerFriendlyLogoUri(String customerFriendlyLogoUri) {
    this.customerFriendlyLogoUri = customerFriendlyLogoUri;
    return this;
  }

 /**
   * Certified name
   * @return customerFriendlyName
  **/
  @JsonProperty("CustomerFriendlyName")
  public String getCustomerFriendlyName() {
    return customerFriendlyName;
  }

  public void setCustomerFriendlyName(String customerFriendlyName) {
    this.customerFriendlyName = customerFriendlyName;
  }

  public OBAccountPaymentServiceProvidersAuthorisationServers customerFriendlyName(String customerFriendlyName) {
    this.customerFriendlyName = customerFriendlyName;
    return this;
  }

 /**
   * URI for TPP developer testing V39 required
   * @return developerPortalUri
  **/
  @JsonProperty("DeveloperPortalUri")
  public String getDeveloperPortalUri() {
    return developerPortalUri;
  }

  public void setDeveloperPortalUri(String developerPortalUri) {
    this.developerPortalUri = developerPortalUri;
  }

  public OBAccountPaymentServiceProvidersAuthorisationServers developerPortalUri(String developerPortalUri) {
    this.developerPortalUri = developerPortalUri;
    return this;
  }

 /**
   * Confirmation of payee bank identifier V37 was CoPBankIdentifier
   * @return eiSCDId
  **/
  @JsonProperty("EISCDId")
  public List<String> getEiSCDId() {
    return eiSCDId;
  }

  public void setEiSCDId(List<String> eiSCDId) {
    this.eiSCDId = eiSCDId;
  }

  public OBAccountPaymentServiceProvidersAuthorisationServers eiSCDId(List<String> eiSCDId) {
    this.eiSCDId = eiSCDId;
    return this;
  }

  public OBAccountPaymentServiceProvidersAuthorisationServers addEiSCDIdItem(String eiSCDIdItem) {
    this.eiSCDId.add(eiSCDIdItem);
    return this;
  }

 /**
   * Authorisation Server Id V39 required
   * @return id
  **/
  @JsonProperty("Id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OBAccountPaymentServiceProvidersAuthorisationServers id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Uri used for Oauth2.0 OpenId Configuration V39 required
   * @return openIDConfigEndPointUri
  **/
  @JsonProperty("OpenIDConfigEndPointUri")
  public String getOpenIDConfigEndPointUri() {
    return openIDConfigEndPointUri;
  }

  public void setOpenIDConfigEndPointUri(String openIDConfigEndPointUri) {
    this.openIDConfigEndPointUri = openIDConfigEndPointUri;
  }

  public OBAccountPaymentServiceProvidersAuthorisationServers openIDConfigEndPointUri(String openIDConfigEndPointUri) {
    this.openIDConfigEndPointUri = openIDConfigEndPointUri;
    return this;
  }

 /**
   * Authorisation Server Id of Parent Authorisation server, used for app to app linking
   * @return parentAuthorisationServerId
  **/
  @JsonProperty("ParentAuthorisationServerId")
  public String getParentAuthorisationServerId() {
    return parentAuthorisationServerId;
  }

  public void setParentAuthorisationServerId(String parentAuthorisationServerId) {
    this.parentAuthorisationServerId = parentAuthorisationServerId;
  }

  public OBAccountPaymentServiceProvidersAuthorisationServers parentAuthorisationServerId(String parentAuthorisationServerId) {
    this.parentAuthorisationServerId = parentAuthorisationServerId;
    return this;
  }

 /**
   * The location which is used for signing certificates V39 required
   * @return payloadSigningCertLocation
  **/
  @JsonProperty("PayloadSigningCertLocation")
  public String getPayloadSigningCertLocation() {
    return payloadSigningCertLocation;
  }

  public void setPayloadSigningCertLocation(String payloadSigningCertLocation) {
    this.payloadSigningCertLocation = payloadSigningCertLocation;
  }

  public OBAccountPaymentServiceProvidersAuthorisationServers payloadSigningCertLocation(String payloadSigningCertLocation) {
    this.payloadSigningCertLocation = payloadSigningCertLocation;
    return this;
  }

 /**
   * Uri from which the terms of service can be retrieved V39 required
   * @return termsOfService
  **/
  @JsonProperty("TermsOfService")
  public String getTermsOfService() {
    return termsOfService;
  }

  public void setTermsOfService(String termsOfService) {
    this.termsOfService = termsOfService;
  }

  public OBAccountPaymentServiceProvidersAuthorisationServers termsOfService(String termsOfService) {
    this.termsOfService = termsOfService;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBAccountPaymentServiceProvidersAuthorisationServers {\n");
    
    sb.append("    autoRegistrationSupported: ").append(toIndentedString(autoRegistrationSupported)).append("\n");
    sb.append("    baseApiDNSUri: ").append(toIndentedString(baseApiDNSUri)).append("\n");
    sb.append("    clientRegistrationUri: ").append(toIndentedString(clientRegistrationUri)).append("\n");
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

