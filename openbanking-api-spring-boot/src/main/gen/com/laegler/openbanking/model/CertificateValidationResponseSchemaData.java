package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.CertificateValidationResponseSchemaDataCertificate;
import com.laegler.openbanking.model.CertificateValidationResponseSchemaDataOrganisation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CertificateValidationResponseSchemaData
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class CertificateValidationResponseSchemaData   {
  @JsonProperty("certificate")
  private CertificateValidationResponseSchemaDataCertificate certificate = null;

  @JsonProperty("organisation")
  private CertificateValidationResponseSchemaDataOrganisation organisation = null;

  public CertificateValidationResponseSchemaData certificate(CertificateValidationResponseSchemaDataCertificate certificate) {
    this.certificate = certificate;
    return this;
  }

  /**
   * Get certificate
   * @return certificate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CertificateValidationResponseSchemaDataCertificate getCertificate() {
    return certificate;
  }

  public void setCertificate(CertificateValidationResponseSchemaDataCertificate certificate) {
    this.certificate = certificate;
  }

  public CertificateValidationResponseSchemaData organisation(CertificateValidationResponseSchemaDataOrganisation organisation) {
    this.organisation = organisation;
    return this;
  }

  /**
   * Get organisation
   * @return organisation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CertificateValidationResponseSchemaDataOrganisation getOrganisation() {
    return organisation;
  }

  public void setOrganisation(CertificateValidationResponseSchemaDataOrganisation organisation) {
    this.organisation = organisation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateValidationResponseSchemaData certificateValidationResponseSchemaData = (CertificateValidationResponseSchemaData) o;
    return Objects.equals(this.certificate, certificateValidationResponseSchemaData.certificate) &&
        Objects.equals(this.organisation, certificateValidationResponseSchemaData.organisation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificate, organisation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateValidationResponseSchemaData {\n");
    
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    organisation: ").append(toIndentedString(organisation)).append("\n");
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

