package com.laegler.openbanking.model;

import com.laegler.openbanking.model.CertificateValidationResponseSchemaDataOrganisationAuthorizations;
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

public class CertificateValidationResponseSchemaDataOrganisationCompetentAuthorityClaims  {
  
  @ApiModelProperty(value = "")
  private String authorityId = null;

  @ApiModelProperty(value = "")
  private String authorizationDomain = null;

  @ApiModelProperty(value = "")
  private List<CertificateValidationResponseSchemaDataOrganisationAuthorizations> authorizations = null;

  @ApiModelProperty(value = "")
  private String registrationId = null;

  @ApiModelProperty(value = "")
  private String status = null;
 /**
   * Get authorityId
   * @return authorityId
  **/
  @JsonProperty("authority_id")
  public String getAuthorityId() {
    return authorityId;
  }

  public void setAuthorityId(String authorityId) {
    this.authorityId = authorityId;
  }

  public CertificateValidationResponseSchemaDataOrganisationCompetentAuthorityClaims authorityId(String authorityId) {
    this.authorityId = authorityId;
    return this;
  }

 /**
   * Get authorizationDomain
   * @return authorizationDomain
  **/
  @JsonProperty("authorization_domain")
  public String getAuthorizationDomain() {
    return authorizationDomain;
  }

  public void setAuthorizationDomain(String authorizationDomain) {
    this.authorizationDomain = authorizationDomain;
  }

  public CertificateValidationResponseSchemaDataOrganisationCompetentAuthorityClaims authorizationDomain(String authorizationDomain) {
    this.authorizationDomain = authorizationDomain;
    return this;
  }

 /**
   * Get authorizations
   * @return authorizations
  **/
  @JsonProperty("authorizations")
  public List<CertificateValidationResponseSchemaDataOrganisationAuthorizations> getAuthorizations() {
    return authorizations;
  }

  public void setAuthorizations(List<CertificateValidationResponseSchemaDataOrganisationAuthorizations> authorizations) {
    this.authorizations = authorizations;
  }

  public CertificateValidationResponseSchemaDataOrganisationCompetentAuthorityClaims authorizations(List<CertificateValidationResponseSchemaDataOrganisationAuthorizations> authorizations) {
    this.authorizations = authorizations;
    return this;
  }

  public CertificateValidationResponseSchemaDataOrganisationCompetentAuthorityClaims addAuthorizationsItem(CertificateValidationResponseSchemaDataOrganisationAuthorizations authorizationsItem) {
    this.authorizations.add(authorizationsItem);
    return this;
  }

 /**
   * Get registrationId
   * @return registrationId
  **/
  @JsonProperty("registration_id")
  public String getRegistrationId() {
    return registrationId;
  }

  public void setRegistrationId(String registrationId) {
    this.registrationId = registrationId;
  }

  public CertificateValidationResponseSchemaDataOrganisationCompetentAuthorityClaims registrationId(String registrationId) {
    this.registrationId = registrationId;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public CertificateValidationResponseSchemaDataOrganisationCompetentAuthorityClaims status(String status) {
    this.status = status;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateValidationResponseSchemaDataOrganisationCompetentAuthorityClaims {\n");
    
    sb.append("    authorityId: ").append(toIndentedString(authorityId)).append("\n");
    sb.append("    authorizationDomain: ").append(toIndentedString(authorizationDomain)).append("\n");
    sb.append("    authorizations: ").append(toIndentedString(authorizations)).append("\n");
    sb.append("    registrationId: ").append(toIndentedString(registrationId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

