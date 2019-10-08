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
 * CertificateValidationResponseSchemaDataCertificate
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class CertificateValidationResponseSchemaDataCertificate   {
  @JsonProperty("eidas_profile")
  private String eidasProfile = null;

  @JsonProperty("expired")
  private Boolean expired = null;

  @JsonProperty("qtsp_name")
  private String qtspName = null;

  @JsonProperty("qtsp_uri")
  private String qtspUri = null;

  @JsonProperty("revoked")
  private Boolean revoked = null;

  @JsonProperty("roles")
  @Valid
  private List<String> roles = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("valid_eidas_certificate")
  private Boolean validEidasCertificate = null;

  @JsonProperty("valid_obietf_certificate")
  private Boolean validObietfCertificate = null;

  public CertificateValidationResponseSchemaDataCertificate eidasProfile(String eidasProfile) {
    this.eidasProfile = eidasProfile;
    return this;
  }

  /**
   * Get eidasProfile
   * @return eidasProfile
  **/
  @ApiModelProperty(value = "")


  public String getEidasProfile() {
    return eidasProfile;
  }

  public void setEidasProfile(String eidasProfile) {
    this.eidasProfile = eidasProfile;
  }

  public CertificateValidationResponseSchemaDataCertificate expired(Boolean expired) {
    this.expired = expired;
    return this;
  }

  /**
   * Get expired
   * @return expired
  **/
  @ApiModelProperty(value = "")


  public Boolean isExpired() {
    return expired;
  }

  public void setExpired(Boolean expired) {
    this.expired = expired;
  }

  public CertificateValidationResponseSchemaDataCertificate qtspName(String qtspName) {
    this.qtspName = qtspName;
    return this;
  }

  /**
   * Get qtspName
   * @return qtspName
  **/
  @ApiModelProperty(value = "")


  public String getQtspName() {
    return qtspName;
  }

  public void setQtspName(String qtspName) {
    this.qtspName = qtspName;
  }

  public CertificateValidationResponseSchemaDataCertificate qtspUri(String qtspUri) {
    this.qtspUri = qtspUri;
    return this;
  }

  /**
   * Get qtspUri
   * @return qtspUri
  **/
  @ApiModelProperty(value = "")


  public String getQtspUri() {
    return qtspUri;
  }

  public void setQtspUri(String qtspUri) {
    this.qtspUri = qtspUri;
  }

  public CertificateValidationResponseSchemaDataCertificate revoked(Boolean revoked) {
    this.revoked = revoked;
    return this;
  }

  /**
   * Get revoked
   * @return revoked
  **/
  @ApiModelProperty(value = "")


  public Boolean isRevoked() {
    return revoked;
  }

  public void setRevoked(Boolean revoked) {
    this.revoked = revoked;
  }

  public CertificateValidationResponseSchemaDataCertificate roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public CertificateValidationResponseSchemaDataCertificate addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

  /**
   * Get roles
   * @return roles
  **/
  @ApiModelProperty(value = "")


  public List<String> getRoles() {
    return roles;
  }

  public void setRoles(List<String> roles) {
    this.roles = roles;
  }

  public CertificateValidationResponseSchemaDataCertificate type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CertificateValidationResponseSchemaDataCertificate validEidasCertificate(Boolean validEidasCertificate) {
    this.validEidasCertificate = validEidasCertificate;
    return this;
  }

  /**
   * Get validEidasCertificate
   * @return validEidasCertificate
  **/
  @ApiModelProperty(value = "")


  public Boolean isValidEidasCertificate() {
    return validEidasCertificate;
  }

  public void setValidEidasCertificate(Boolean validEidasCertificate) {
    this.validEidasCertificate = validEidasCertificate;
  }

  public CertificateValidationResponseSchemaDataCertificate validObietfCertificate(Boolean validObietfCertificate) {
    this.validObietfCertificate = validObietfCertificate;
    return this;
  }

  /**
   * Get validObietfCertificate
   * @return validObietfCertificate
  **/
  @ApiModelProperty(value = "")


  public Boolean isValidObietfCertificate() {
    return validObietfCertificate;
  }

  public void setValidObietfCertificate(Boolean validObietfCertificate) {
    this.validObietfCertificate = validObietfCertificate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateValidationResponseSchemaDataCertificate certificateValidationResponseSchemaDataCertificate = (CertificateValidationResponseSchemaDataCertificate) o;
    return Objects.equals(this.eidasProfile, certificateValidationResponseSchemaDataCertificate.eidasProfile) &&
        Objects.equals(this.expired, certificateValidationResponseSchemaDataCertificate.expired) &&
        Objects.equals(this.qtspName, certificateValidationResponseSchemaDataCertificate.qtspName) &&
        Objects.equals(this.qtspUri, certificateValidationResponseSchemaDataCertificate.qtspUri) &&
        Objects.equals(this.revoked, certificateValidationResponseSchemaDataCertificate.revoked) &&
        Objects.equals(this.roles, certificateValidationResponseSchemaDataCertificate.roles) &&
        Objects.equals(this.type, certificateValidationResponseSchemaDataCertificate.type) &&
        Objects.equals(this.validEidasCertificate, certificateValidationResponseSchemaDataCertificate.validEidasCertificate) &&
        Objects.equals(this.validObietfCertificate, certificateValidationResponseSchemaDataCertificate.validObietfCertificate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eidasProfile, expired, qtspName, qtspUri, revoked, roles, type, validEidasCertificate, validObietfCertificate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateValidationResponseSchemaDataCertificate {\n");
    
    sb.append("    eidasProfile: ").append(toIndentedString(eidasProfile)).append("\n");
    sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
    sb.append("    qtspName: ").append(toIndentedString(qtspName)).append("\n");
    sb.append("    qtspUri: ").append(toIndentedString(qtspUri)).append("\n");
    sb.append("    revoked: ").append(toIndentedString(revoked)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    validEidasCertificate: ").append(toIndentedString(validEidasCertificate)).append("\n");
    sb.append("    validObietfCertificate: ").append(toIndentedString(validObietfCertificate)).append("\n");
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

