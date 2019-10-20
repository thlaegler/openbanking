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

public class CertificateValidationResponseSchemaDataCertificate  {
  
  @ApiModelProperty(value = "")
  private String eidasProfile = null;

  @ApiModelProperty(value = "")
  private Boolean expired = null;

  @ApiModelProperty(value = "")
  private String qtspName = null;

  @ApiModelProperty(value = "")
  private String qtspUri = null;

  @ApiModelProperty(value = "")
  private Boolean revoked = null;

  @ApiModelProperty(value = "")
  private List<String> roles = null;

  @ApiModelProperty(value = "")
  private String type = null;

  @ApiModelProperty(value = "")
  private Boolean validEidasCertificate = null;

  @ApiModelProperty(value = "")
  private Boolean validObietfCertificate = null;
 /**
   * Get eidasProfile
   * @return eidasProfile
  **/
  @JsonProperty("eidas_profile")
  public String getEidasProfile() {
    return eidasProfile;
  }

  public void setEidasProfile(String eidasProfile) {
    this.eidasProfile = eidasProfile;
  }

  public CertificateValidationResponseSchemaDataCertificate eidasProfile(String eidasProfile) {
    this.eidasProfile = eidasProfile;
    return this;
  }

 /**
   * Get expired
   * @return expired
  **/
  @JsonProperty("expired")
  public Boolean isExpired() {
    return expired;
  }

  public void setExpired(Boolean expired) {
    this.expired = expired;
  }

  public CertificateValidationResponseSchemaDataCertificate expired(Boolean expired) {
    this.expired = expired;
    return this;
  }

 /**
   * Get qtspName
   * @return qtspName
  **/
  @JsonProperty("qtsp_name")
  public String getQtspName() {
    return qtspName;
  }

  public void setQtspName(String qtspName) {
    this.qtspName = qtspName;
  }

  public CertificateValidationResponseSchemaDataCertificate qtspName(String qtspName) {
    this.qtspName = qtspName;
    return this;
  }

 /**
   * Get qtspUri
   * @return qtspUri
  **/
  @JsonProperty("qtsp_uri")
  public String getQtspUri() {
    return qtspUri;
  }

  public void setQtspUri(String qtspUri) {
    this.qtspUri = qtspUri;
  }

  public CertificateValidationResponseSchemaDataCertificate qtspUri(String qtspUri) {
    this.qtspUri = qtspUri;
    return this;
  }

 /**
   * Get revoked
   * @return revoked
  **/
  @JsonProperty("revoked")
  public Boolean isRevoked() {
    return revoked;
  }

  public void setRevoked(Boolean revoked) {
    this.revoked = revoked;
  }

  public CertificateValidationResponseSchemaDataCertificate revoked(Boolean revoked) {
    this.revoked = revoked;
    return this;
  }

 /**
   * Get roles
   * @return roles
  **/
  @JsonProperty("roles")
  public List<String> getRoles() {
    return roles;
  }

  public void setRoles(List<String> roles) {
    this.roles = roles;
  }

  public CertificateValidationResponseSchemaDataCertificate roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public CertificateValidationResponseSchemaDataCertificate addRolesItem(String rolesItem) {
    this.roles.add(rolesItem);
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CertificateValidationResponseSchemaDataCertificate type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Get validEidasCertificate
   * @return validEidasCertificate
  **/
  @JsonProperty("valid_eidas_certificate")
  public Boolean isValidEidasCertificate() {
    return validEidasCertificate;
  }

  public void setValidEidasCertificate(Boolean validEidasCertificate) {
    this.validEidasCertificate = validEidasCertificate;
  }

  public CertificateValidationResponseSchemaDataCertificate validEidasCertificate(Boolean validEidasCertificate) {
    this.validEidasCertificate = validEidasCertificate;
    return this;
  }

 /**
   * Get validObietfCertificate
   * @return validObietfCertificate
  **/
  @JsonProperty("valid_obietf_certificate")
  public Boolean isValidObietfCertificate() {
    return validObietfCertificate;
  }

  public void setValidObietfCertificate(Boolean validObietfCertificate) {
    this.validObietfCertificate = validObietfCertificate;
  }

  public CertificateValidationResponseSchemaDataCertificate validObietfCertificate(Boolean validObietfCertificate) {
    this.validObietfCertificate = validObietfCertificate;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

