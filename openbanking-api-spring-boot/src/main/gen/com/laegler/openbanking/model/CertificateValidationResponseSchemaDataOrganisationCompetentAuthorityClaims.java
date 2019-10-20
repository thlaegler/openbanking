package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.CertificateValidationResponseSchemaDataOrganisationAuthorizations;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CertificateValidationResponseSchemaDataOrganisationCompetentAuthorityClaims
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class CertificateValidationResponseSchemaDataOrganisationCompetentAuthorityClaims   {
  @JsonProperty("authority_id")
  private String authorityId = null;

  @JsonProperty("authorization_domain")
  private String authorizationDomain = null;

  @JsonProperty("authorizations")
  @Valid
  private List<CertificateValidationResponseSchemaDataOrganisationAuthorizations> authorizations = null;

  @JsonProperty("registration_id")
  private String registrationId = null;

  @JsonProperty("status")
  private String status = null;

  public CertificateValidationResponseSchemaDataOrganisationCompetentAuthorityClaims authorityId(String authorityId) {
    this.authorityId = authorityId;
    return this;
  }

  /**
   * Get authorityId
   * @return authorityId
  **/
  @ApiModelProperty(value = "")


  public String getAuthorityId() {
    return authorityId;
  }

  public void setAuthorityId(String authorityId) {
    this.authorityId = authorityId;
  }

  public CertificateValidationResponseSchemaDataOrganisationCompetentAuthorityClaims authorizationDomain(String authorizationDomain) {
    this.authorizationDomain = authorizationDomain;
    return this;
  }

  /**
   * Get authorizationDomain
   * @return authorizationDomain
  **/
  @ApiModelProperty(value = "")


  public String getAuthorizationDomain() {
    return authorizationDomain;
  }

  public void setAuthorizationDomain(String authorizationDomain) {
    this.authorizationDomain = authorizationDomain;
  }

  public CertificateValidationResponseSchemaDataOrganisationCompetentAuthorityClaims authorizations(List<CertificateValidationResponseSchemaDataOrganisationAuthorizations> authorizations) {
    this.authorizations = authorizations;
    return this;
  }

  public CertificateValidationResponseSchemaDataOrganisationCompetentAuthorityClaims addAuthorizationsItem(CertificateValidationResponseSchemaDataOrganisationAuthorizations authorizationsItem) {
    if (this.authorizations == null) {
      this.authorizations = new ArrayList<>();
    }
    this.authorizations.add(authorizationsItem);
    return this;
  }

  /**
   * Get authorizations
   * @return authorizations
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<CertificateValidationResponseSchemaDataOrganisationAuthorizations> getAuthorizations() {
    return authorizations;
  }

  public void setAuthorizations(List<CertificateValidationResponseSchemaDataOrganisationAuthorizations> authorizations) {
    this.authorizations = authorizations;
  }

  public CertificateValidationResponseSchemaDataOrganisationCompetentAuthorityClaims registrationId(String registrationId) {
    this.registrationId = registrationId;
    return this;
  }

  /**
   * Get registrationId
   * @return registrationId
  **/
  @ApiModelProperty(value = "")


  public String getRegistrationId() {
    return registrationId;
  }

  public void setRegistrationId(String registrationId) {
    this.registrationId = registrationId;
  }

  public CertificateValidationResponseSchemaDataOrganisationCompetentAuthorityClaims status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateValidationResponseSchemaDataOrganisationCompetentAuthorityClaims certificateValidationResponseSchemaDataOrganisationCompetentAuthorityClaims = (CertificateValidationResponseSchemaDataOrganisationCompetentAuthorityClaims) o;
    return Objects.equals(this.authorityId, certificateValidationResponseSchemaDataOrganisationCompetentAuthorityClaims.authorityId) &&
        Objects.equals(this.authorizationDomain, certificateValidationResponseSchemaDataOrganisationCompetentAuthorityClaims.authorizationDomain) &&
        Objects.equals(this.authorizations, certificateValidationResponseSchemaDataOrganisationCompetentAuthorityClaims.authorizations) &&
        Objects.equals(this.registrationId, certificateValidationResponseSchemaDataOrganisationCompetentAuthorityClaims.registrationId) &&
        Objects.equals(this.status, certificateValidationResponseSchemaDataOrganisationCompetentAuthorityClaims.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorityId, authorizationDomain, authorizations, registrationId, status);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

