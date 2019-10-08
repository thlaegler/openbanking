package com.laegler.openbanking.model;

import com.laegler.openbanking.model.CertificateValidationResponseSchemaDataCertificate;
import com.laegler.openbanking.model.CertificateValidationResponseSchemaDataOrganisation;
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

public class CertificateValidationResponseSchemaData  {
  
  @ApiModelProperty(value = "")
  @Valid
  private CertificateValidationResponseSchemaDataCertificate certificate = null;

  @ApiModelProperty(value = "")
  @Valid
  private CertificateValidationResponseSchemaDataOrganisation organisation = null;
 /**
   * Get certificate
   * @return certificate
  **/
  @JsonProperty("certificate")
  public CertificateValidationResponseSchemaDataCertificate getCertificate() {
    return certificate;
  }

  public void setCertificate(CertificateValidationResponseSchemaDataCertificate certificate) {
    this.certificate = certificate;
  }

  public CertificateValidationResponseSchemaData certificate(CertificateValidationResponseSchemaDataCertificate certificate) {
    this.certificate = certificate;
    return this;
  }

 /**
   * Get organisation
   * @return organisation
  **/
  @JsonProperty("organisation")
  public CertificateValidationResponseSchemaDataOrganisation getOrganisation() {
    return organisation;
  }

  public void setOrganisation(CertificateValidationResponseSchemaDataOrganisation organisation) {
    this.organisation = organisation;
  }

  public CertificateValidationResponseSchemaData organisation(CertificateValidationResponseSchemaDataOrganisation organisation) {
    this.organisation = organisation;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

