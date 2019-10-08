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
 * OBAccountPaymentServiceProvidersAuthorisationServers
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class OBAccountPaymentServiceProvidersAuthorisationServers   {
  @JsonProperty("AutoRegistrationSupported")
  private Boolean autoRegistrationSupported = null;

  @JsonProperty("BaseApiDNSUri")
  private String baseApiDNSUri = null;

  @JsonProperty("ClientRegistrationUri")
  private String clientRegistrationUri = null;

  @JsonProperty("CustomerFriendlyDescription")
  private String customerFriendlyDescription = null;

  @JsonProperty("CustomerFriendlyLogoUri")
  private String customerFriendlyLogoUri = null;

  @JsonProperty("CustomerFriendlyName")
  private String customerFriendlyName = null;

  @JsonProperty("DeveloperPortalUri")
  private String developerPortalUri = null;

  @JsonProperty("EISCDId")
  @Valid
  private List<String> eiSCDId = null;

  @JsonProperty("Id")
  private String id = null;

  @JsonProperty("OpenIDConfigEndPointUri")
  private String openIDConfigEndPointUri = null;

  @JsonProperty("ParentAuthorisationServerId")
  private String parentAuthorisationServerId = null;

  @JsonProperty("PayloadSigningCertLocation")
  private String payloadSigningCertLocation = null;

  @JsonProperty("TermsOfService")
  private String termsOfService = null;

  public OBAccountPaymentServiceProvidersAuthorisationServers autoRegistrationSupported(Boolean autoRegistrationSupported) {
    this.autoRegistrationSupported = autoRegistrationSupported;
    return this;
  }

  /**
   * Authorisation Server supports auto-registration
   * @return autoRegistrationSupported
  **/
  @ApiModelProperty(value = "Authorisation Server supports auto-registration")


  public Boolean isAutoRegistrationSupported() {
    return autoRegistrationSupported;
  }

  public void setAutoRegistrationSupported(Boolean autoRegistrationSupported) {
    this.autoRegistrationSupported = autoRegistrationSupported;
  }

  public OBAccountPaymentServiceProvidersAuthorisationServers baseApiDNSUri(String baseApiDNSUri) {
    this.baseApiDNSUri = baseApiDNSUri;
    return this;
  }

  /**
   * Points to the Open Banking APIs V39 required
   * @return baseApiDNSUri
  **/
  @ApiModelProperty(value = "Points to the Open Banking APIs V39 required")


  public String getBaseApiDNSUri() {
    return baseApiDNSUri;
  }

  public void setBaseApiDNSUri(String baseApiDNSUri) {
    this.baseApiDNSUri = baseApiDNSUri;
  }

  public OBAccountPaymentServiceProvidersAuthorisationServers clientRegistrationUri(String clientRegistrationUri) {
    this.clientRegistrationUri = clientRegistrationUri;
    return this;
  }

  /**
   * The registration endpoint for TPP onboarding to ASPSPs. V39 required
   * @return clientRegistrationUri
  **/
  @ApiModelProperty(value = "The registration endpoint for TPP onboarding to ASPSPs. V39 required")


  public String getClientRegistrationUri() {
    return clientRegistrationUri;
  }

  public void setClientRegistrationUri(String clientRegistrationUri) {
    this.clientRegistrationUri = clientRegistrationUri;
  }

  public OBAccountPaymentServiceProvidersAuthorisationServers customerFriendlyDescription(String customerFriendlyDescription) {
    this.customerFriendlyDescription = customerFriendlyDescription;
    return this;
  }

  /**
   * Customer orientated description
   * @return customerFriendlyDescription
  **/
  @ApiModelProperty(value = "Customer orientated description")


  public String getCustomerFriendlyDescription() {
    return customerFriendlyDescription;
  }

  public void setCustomerFriendlyDescription(String customerFriendlyDescription) {
    this.customerFriendlyDescription = customerFriendlyDescription;
  }

  public OBAccountPaymentServiceProvidersAuthorisationServers customerFriendlyLogoUri(String customerFriendlyLogoUri) {
    this.customerFriendlyLogoUri = customerFriendlyLogoUri;
    return this;
  }

  /**
   * uri from which a TPP can retrieve a certified logo V39 required
   * @return customerFriendlyLogoUri
  **/
  @ApiModelProperty(value = "uri from which a TPP can retrieve a certified logo V39 required")


  public String getCustomerFriendlyLogoUri() {
    return customerFriendlyLogoUri;
  }

  public void setCustomerFriendlyLogoUri(String customerFriendlyLogoUri) {
    this.customerFriendlyLogoUri = customerFriendlyLogoUri;
  }

  public OBAccountPaymentServiceProvidersAuthorisationServers customerFriendlyName(String customerFriendlyName) {
    this.customerFriendlyName = customerFriendlyName;
    return this;
  }

  /**
   * Certified name
   * @return customerFriendlyName
  **/
  @ApiModelProperty(value = "Certified name")


  public String getCustomerFriendlyName() {
    return customerFriendlyName;
  }

  public void setCustomerFriendlyName(String customerFriendlyName) {
    this.customerFriendlyName = customerFriendlyName;
  }

  public OBAccountPaymentServiceProvidersAuthorisationServers developerPortalUri(String developerPortalUri) {
    this.developerPortalUri = developerPortalUri;
    return this;
  }

  /**
   * URI for TPP developer testing V39 required
   * @return developerPortalUri
  **/
  @ApiModelProperty(value = "URI for TPP developer testing V39 required")


  public String getDeveloperPortalUri() {
    return developerPortalUri;
  }

  public void setDeveloperPortalUri(String developerPortalUri) {
    this.developerPortalUri = developerPortalUri;
  }

  public OBAccountPaymentServiceProvidersAuthorisationServers eiSCDId(List<String> eiSCDId) {
    this.eiSCDId = eiSCDId;
    return this;
  }

  public OBAccountPaymentServiceProvidersAuthorisationServers addEiSCDIdItem(String eiSCDIdItem) {
    if (this.eiSCDId == null) {
      this.eiSCDId = new ArrayList<>();
    }
    this.eiSCDId.add(eiSCDIdItem);
    return this;
  }

  /**
   * Confirmation of payee bank identifier V37 was CoPBankIdentifier
   * @return eiSCDId
  **/
  @ApiModelProperty(value = "Confirmation of payee bank identifier V37 was CoPBankIdentifier")


  public List<String> getEiSCDId() {
    return eiSCDId;
  }

  public void setEiSCDId(List<String> eiSCDId) {
    this.eiSCDId = eiSCDId;
  }

  public OBAccountPaymentServiceProvidersAuthorisationServers id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Authorisation Server Id V39 required
   * @return id
  **/
  @ApiModelProperty(value = "Authorisation Server Id V39 required")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OBAccountPaymentServiceProvidersAuthorisationServers openIDConfigEndPointUri(String openIDConfigEndPointUri) {
    this.openIDConfigEndPointUri = openIDConfigEndPointUri;
    return this;
  }

  /**
   * Uri used for Oauth2.0 OpenId Configuration V39 required
   * @return openIDConfigEndPointUri
  **/
  @ApiModelProperty(value = "Uri used for Oauth2.0 OpenId Configuration V39 required")


  public String getOpenIDConfigEndPointUri() {
    return openIDConfigEndPointUri;
  }

  public void setOpenIDConfigEndPointUri(String openIDConfigEndPointUri) {
    this.openIDConfigEndPointUri = openIDConfigEndPointUri;
  }

  public OBAccountPaymentServiceProvidersAuthorisationServers parentAuthorisationServerId(String parentAuthorisationServerId) {
    this.parentAuthorisationServerId = parentAuthorisationServerId;
    return this;
  }

  /**
   * Authorisation Server Id of Parent Authorisation server, used for app to app linking
   * @return parentAuthorisationServerId
  **/
  @ApiModelProperty(value = "Authorisation Server Id of Parent Authorisation server, used for app to app linking")


  public String getParentAuthorisationServerId() {
    return parentAuthorisationServerId;
  }

  public void setParentAuthorisationServerId(String parentAuthorisationServerId) {
    this.parentAuthorisationServerId = parentAuthorisationServerId;
  }

  public OBAccountPaymentServiceProvidersAuthorisationServers payloadSigningCertLocation(String payloadSigningCertLocation) {
    this.payloadSigningCertLocation = payloadSigningCertLocation;
    return this;
  }

  /**
   * The location which is used for signing certificates V39 required
   * @return payloadSigningCertLocation
  **/
  @ApiModelProperty(value = "The location which is used for signing certificates V39 required")


  public String getPayloadSigningCertLocation() {
    return payloadSigningCertLocation;
  }

  public void setPayloadSigningCertLocation(String payloadSigningCertLocation) {
    this.payloadSigningCertLocation = payloadSigningCertLocation;
  }

  public OBAccountPaymentServiceProvidersAuthorisationServers termsOfService(String termsOfService) {
    this.termsOfService = termsOfService;
    return this;
  }

  /**
   * Uri from which the terms of service can be retrieved V39 required
   * @return termsOfService
  **/
  @ApiModelProperty(value = "Uri from which the terms of service can be retrieved V39 required")


  public String getTermsOfService() {
    return termsOfService;
  }

  public void setTermsOfService(String termsOfService) {
    this.termsOfService = termsOfService;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBAccountPaymentServiceProvidersAuthorisationServers obAccountPaymentServiceProvidersAuthorisationServers = (OBAccountPaymentServiceProvidersAuthorisationServers) o;
    return Objects.equals(this.autoRegistrationSupported, obAccountPaymentServiceProvidersAuthorisationServers.autoRegistrationSupported) &&
        Objects.equals(this.baseApiDNSUri, obAccountPaymentServiceProvidersAuthorisationServers.baseApiDNSUri) &&
        Objects.equals(this.clientRegistrationUri, obAccountPaymentServiceProvidersAuthorisationServers.clientRegistrationUri) &&
        Objects.equals(this.customerFriendlyDescription, obAccountPaymentServiceProvidersAuthorisationServers.customerFriendlyDescription) &&
        Objects.equals(this.customerFriendlyLogoUri, obAccountPaymentServiceProvidersAuthorisationServers.customerFriendlyLogoUri) &&
        Objects.equals(this.customerFriendlyName, obAccountPaymentServiceProvidersAuthorisationServers.customerFriendlyName) &&
        Objects.equals(this.developerPortalUri, obAccountPaymentServiceProvidersAuthorisationServers.developerPortalUri) &&
        Objects.equals(this.eiSCDId, obAccountPaymentServiceProvidersAuthorisationServers.eiSCDId) &&
        Objects.equals(this.id, obAccountPaymentServiceProvidersAuthorisationServers.id) &&
        Objects.equals(this.openIDConfigEndPointUri, obAccountPaymentServiceProvidersAuthorisationServers.openIDConfigEndPointUri) &&
        Objects.equals(this.parentAuthorisationServerId, obAccountPaymentServiceProvidersAuthorisationServers.parentAuthorisationServerId) &&
        Objects.equals(this.payloadSigningCertLocation, obAccountPaymentServiceProvidersAuthorisationServers.payloadSigningCertLocation) &&
        Objects.equals(this.termsOfService, obAccountPaymentServiceProvidersAuthorisationServers.termsOfService);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoRegistrationSupported, baseApiDNSUri, clientRegistrationUri, customerFriendlyDescription, customerFriendlyLogoUri, customerFriendlyName, developerPortalUri, eiSCDId, id, openIDConfigEndPointUri, parentAuthorisationServerId, payloadSigningCertLocation, termsOfService);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

