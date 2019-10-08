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
 * AuthorisationServerRequestSchema
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class AuthorisationServerRequestSchema   {
  @JsonProperty("AutoRegistrationSupported")
  private Boolean autoRegistrationSupported = null;

  @JsonProperty("BaseApiDNSUri")
  private String baseApiDNSUri = null;

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

  @JsonProperty("OpenIDConfigEndPointUri")
  private String openIDConfigEndPointUri = null;

  @JsonProperty("ParentAuthorisationServerId")
  private String parentAuthorisationServerId = null;

  @JsonProperty("PayloadSigningCertLocation")
  private String payloadSigningCertLocation = null;

  @JsonProperty("TermsOfService")
  private String termsOfService = null;

  public AuthorisationServerRequestSchema autoRegistrationSupported(Boolean autoRegistrationSupported) {
    this.autoRegistrationSupported = autoRegistrationSupported;
    return this;
  }

  /**
   * Get autoRegistrationSupported
   * @return autoRegistrationSupported
  **/
  @ApiModelProperty(value = "")


  public Boolean isAutoRegistrationSupported() {
    return autoRegistrationSupported;
  }

  public void setAutoRegistrationSupported(Boolean autoRegistrationSupported) {
    this.autoRegistrationSupported = autoRegistrationSupported;
  }

  public AuthorisationServerRequestSchema baseApiDNSUri(String baseApiDNSUri) {
    this.baseApiDNSUri = baseApiDNSUri;
    return this;
  }

  /**
   * An RFC-3986-compliant URI
   * @return baseApiDNSUri
  **/
  @ApiModelProperty(value = "An RFC-3986-compliant URI")

@Size(max=256) 
  public String getBaseApiDNSUri() {
    return baseApiDNSUri;
  }

  public void setBaseApiDNSUri(String baseApiDNSUri) {
    this.baseApiDNSUri = baseApiDNSUri;
  }

  public AuthorisationServerRequestSchema customerFriendlyDescription(String customerFriendlyDescription) {
    this.customerFriendlyDescription = customerFriendlyDescription;
    return this;
  }

  /**
   * An RFC-3986-compliant URI
   * @return customerFriendlyDescription
  **/
  @ApiModelProperty(value = "An RFC-3986-compliant URI")

@Size(max=256) 
  public String getCustomerFriendlyDescription() {
    return customerFriendlyDescription;
  }

  public void setCustomerFriendlyDescription(String customerFriendlyDescription) {
    this.customerFriendlyDescription = customerFriendlyDescription;
  }

  public AuthorisationServerRequestSchema customerFriendlyLogoUri(String customerFriendlyLogoUri) {
    this.customerFriendlyLogoUri = customerFriendlyLogoUri;
    return this;
  }

  /**
   * An RFC-3986-compliant URI
   * @return customerFriendlyLogoUri
  **/
  @ApiModelProperty(value = "An RFC-3986-compliant URI")

@Size(max=256) 
  public String getCustomerFriendlyLogoUri() {
    return customerFriendlyLogoUri;
  }

  public void setCustomerFriendlyLogoUri(String customerFriendlyLogoUri) {
    this.customerFriendlyLogoUri = customerFriendlyLogoUri;
  }

  public AuthorisationServerRequestSchema customerFriendlyName(String customerFriendlyName) {
    this.customerFriendlyName = customerFriendlyName;
    return this;
  }

  /**
   * Get customerFriendlyName
   * @return customerFriendlyName
  **/
  @ApiModelProperty(value = "")

@Size(max=256) 
  public String getCustomerFriendlyName() {
    return customerFriendlyName;
  }

  public void setCustomerFriendlyName(String customerFriendlyName) {
    this.customerFriendlyName = customerFriendlyName;
  }

  public AuthorisationServerRequestSchema developerPortalUri(String developerPortalUri) {
    this.developerPortalUri = developerPortalUri;
    return this;
  }

  /**
   * An RFC-3986-compliant URI
   * @return developerPortalUri
  **/
  @ApiModelProperty(value = "An RFC-3986-compliant URI")

@Size(max=256) 
  public String getDeveloperPortalUri() {
    return developerPortalUri;
  }

  public void setDeveloperPortalUri(String developerPortalUri) {
    this.developerPortalUri = developerPortalUri;
  }

  public AuthorisationServerRequestSchema eiSCDId(List<String> eiSCDId) {
    this.eiSCDId = eiSCDId;
    return this;
  }

  public AuthorisationServerRequestSchema addEiSCDIdItem(String eiSCDIdItem) {
    if (this.eiSCDId == null) {
      this.eiSCDId = new ArrayList<>();
    }
    this.eiSCDId.add(eiSCDIdItem);
    return this;
  }

  /**
   * Get eiSCDId
   * @return eiSCDId
  **/
  @ApiModelProperty(value = "")


  public List<String> getEiSCDId() {
    return eiSCDId;
  }

  public void setEiSCDId(List<String> eiSCDId) {
    this.eiSCDId = eiSCDId;
  }

  public AuthorisationServerRequestSchema openIDConfigEndPointUri(String openIDConfigEndPointUri) {
    this.openIDConfigEndPointUri = openIDConfigEndPointUri;
    return this;
  }

  /**
   * An RFC-3986-compliant URI
   * @return openIDConfigEndPointUri
  **/
  @ApiModelProperty(value = "An RFC-3986-compliant URI")

@Size(max=256) 
  public String getOpenIDConfigEndPointUri() {
    return openIDConfigEndPointUri;
  }

  public void setOpenIDConfigEndPointUri(String openIDConfigEndPointUri) {
    this.openIDConfigEndPointUri = openIDConfigEndPointUri;
  }

  public AuthorisationServerRequestSchema parentAuthorisationServerId(String parentAuthorisationServerId) {
    this.parentAuthorisationServerId = parentAuthorisationServerId;
    return this;
  }

  /**
   * Get parentAuthorisationServerId
   * @return parentAuthorisationServerId
  **/
  @ApiModelProperty(value = "")

@Size(max=22) 
  public String getParentAuthorisationServerId() {
    return parentAuthorisationServerId;
  }

  public void setParentAuthorisationServerId(String parentAuthorisationServerId) {
    this.parentAuthorisationServerId = parentAuthorisationServerId;
  }

  public AuthorisationServerRequestSchema payloadSigningCertLocation(String payloadSigningCertLocation) {
    this.payloadSigningCertLocation = payloadSigningCertLocation;
    return this;
  }

  /**
   * An RFC-3986-compliant URI
   * @return payloadSigningCertLocation
  **/
  @ApiModelProperty(value = "An RFC-3986-compliant URI")

@Size(max=256) 
  public String getPayloadSigningCertLocation() {
    return payloadSigningCertLocation;
  }

  public void setPayloadSigningCertLocation(String payloadSigningCertLocation) {
    this.payloadSigningCertLocation = payloadSigningCertLocation;
  }

  public AuthorisationServerRequestSchema termsOfService(String termsOfService) {
    this.termsOfService = termsOfService;
    return this;
  }

  /**
   * An RFC-3986-compliant URI
   * @return termsOfService
  **/
  @ApiModelProperty(value = "An RFC-3986-compliant URI")

@Size(max=256) 
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
    AuthorisationServerRequestSchema authorisationServerRequestSchema = (AuthorisationServerRequestSchema) o;
    return Objects.equals(this.autoRegistrationSupported, authorisationServerRequestSchema.autoRegistrationSupported) &&
        Objects.equals(this.baseApiDNSUri, authorisationServerRequestSchema.baseApiDNSUri) &&
        Objects.equals(this.customerFriendlyDescription, authorisationServerRequestSchema.customerFriendlyDescription) &&
        Objects.equals(this.customerFriendlyLogoUri, authorisationServerRequestSchema.customerFriendlyLogoUri) &&
        Objects.equals(this.customerFriendlyName, authorisationServerRequestSchema.customerFriendlyName) &&
        Objects.equals(this.developerPortalUri, authorisationServerRequestSchema.developerPortalUri) &&
        Objects.equals(this.eiSCDId, authorisationServerRequestSchema.eiSCDId) &&
        Objects.equals(this.openIDConfigEndPointUri, authorisationServerRequestSchema.openIDConfigEndPointUri) &&
        Objects.equals(this.parentAuthorisationServerId, authorisationServerRequestSchema.parentAuthorisationServerId) &&
        Objects.equals(this.payloadSigningCertLocation, authorisationServerRequestSchema.payloadSigningCertLocation) &&
        Objects.equals(this.termsOfService, authorisationServerRequestSchema.termsOfService);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoRegistrationSupported, baseApiDNSUri, customerFriendlyDescription, customerFriendlyLogoUri, customerFriendlyName, developerPortalUri, eiSCDId, openIDConfigEndPointUri, parentAuthorisationServerId, payloadSigningCertLocation, termsOfService);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorisationServerRequestSchema {\n");
    
    sb.append("    autoRegistrationSupported: ").append(toIndentedString(autoRegistrationSupported)).append("\n");
    sb.append("    baseApiDNSUri: ").append(toIndentedString(baseApiDNSUri)).append("\n");
    sb.append("    customerFriendlyDescription: ").append(toIndentedString(customerFriendlyDescription)).append("\n");
    sb.append("    customerFriendlyLogoUri: ").append(toIndentedString(customerFriendlyLogoUri)).append("\n");
    sb.append("    customerFriendlyName: ").append(toIndentedString(customerFriendlyName)).append("\n");
    sb.append("    developerPortalUri: ").append(toIndentedString(developerPortalUri)).append("\n");
    sb.append("    eiSCDId: ").append(toIndentedString(eiSCDId)).append("\n");
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

