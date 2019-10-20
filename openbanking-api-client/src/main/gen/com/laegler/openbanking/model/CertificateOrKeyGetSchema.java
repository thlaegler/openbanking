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

public class CertificateOrKeyGetSchema  {
  
  @ApiModelProperty(value = "")
  private String isFalse = null;

  @ApiModelProperty(value = "")
  private String e = null;

  @ApiModelProperty(value = "")
  private String expiryDateTime = null;

  @ApiModelProperty(value = "")
  private String keyType = null;

  @ApiModelProperty(value = "")
  private String kid = null;

  @ApiModelProperty(value = "")
  private String kty = null;

  @ApiModelProperty(value = "OB organisation Id")
 /**
   * OB organisation Id
  **/
  private String obOrganisationId = null;

  @ApiModelProperty(value = "Software Statement Id")
 /**
   * Software Statement Id
  **/
  private String softwareStatementId = null;

  @ApiModelProperty(value = "")
  private String status = null;

  @ApiModelProperty(value = "")
  private String use = null;

  @ApiModelProperty(value = "")
  private List<String> x5c = null;

  @ApiModelProperty(value = "")
  private String x5t = null;

  @ApiModelProperty(value = "")
  private String x5tS256 = null;

  @ApiModelProperty(value = "")
  private String x5u = null;
 /**
   * Get isFalse
   * @return isFalse
  **/
  @JsonProperty("isFalse")
  public String getIsFalse() {
    return isFalse;
  }

  public void setIsFalse(String isFalse) {
    this.isFalse = isFalse;
  }

  public CertificateOrKeyGetSchema isFalse(String isFalse) {
    this.isFalse = isFalse;
    return this;
  }

 /**
   * Get e
   * @return e
  **/
  @JsonProperty("e")
  public String getE() {
    return e;
  }

  public void setE(String e) {
    this.e = e;
  }

  public CertificateOrKeyGetSchema e(String e) {
    this.e = e;
    return this;
  }

 /**
   * Get expiryDateTime
   * @return expiryDateTime
  **/
  @JsonProperty("expiryDateTime")
  public String getExpiryDateTime() {
    return expiryDateTime;
  }

  public void setExpiryDateTime(String expiryDateTime) {
    this.expiryDateTime = expiryDateTime;
  }

  public CertificateOrKeyGetSchema expiryDateTime(String expiryDateTime) {
    this.expiryDateTime = expiryDateTime;
    return this;
  }

 /**
   * Get keyType
   * @return keyType
  **/
  @JsonProperty("keyType")
  public String getKeyType() {
    return keyType;
  }

  public void setKeyType(String keyType) {
    this.keyType = keyType;
  }

  public CertificateOrKeyGetSchema keyType(String keyType) {
    this.keyType = keyType;
    return this;
  }

 /**
   * Get kid
   * @return kid
  **/
  @JsonProperty("kid")
  public String getKid() {
    return kid;
  }

  public void setKid(String kid) {
    this.kid = kid;
  }

  public CertificateOrKeyGetSchema kid(String kid) {
    this.kid = kid;
    return this;
  }

 /**
   * Get kty
   * @return kty
  **/
  @JsonProperty("kty")
  public String getKty() {
    return kty;
  }

  public void setKty(String kty) {
    this.kty = kty;
  }

  public CertificateOrKeyGetSchema kty(String kty) {
    this.kty = kty;
    return this;
  }

 /**
   * OB organisation Id
   * @return obOrganisationId
  **/
  @JsonProperty("obOrganisationId")
  public String getObOrganisationId() {
    return obOrganisationId;
  }

  public void setObOrganisationId(String obOrganisationId) {
    this.obOrganisationId = obOrganisationId;
  }

  public CertificateOrKeyGetSchema obOrganisationId(String obOrganisationId) {
    this.obOrganisationId = obOrganisationId;
    return this;
  }

 /**
   * Software Statement Id
   * @return softwareStatementId
  **/
  @JsonProperty("softwareStatementId")
  public String getSoftwareStatementId() {
    return softwareStatementId;
  }

  public void setSoftwareStatementId(String softwareStatementId) {
    this.softwareStatementId = softwareStatementId;
  }

  public CertificateOrKeyGetSchema softwareStatementId(String softwareStatementId) {
    this.softwareStatementId = softwareStatementId;
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

  public CertificateOrKeyGetSchema status(String status) {
    this.status = status;
    return this;
  }

 /**
   * Get use
   * @return use
  **/
  @JsonProperty("use")
  public String getUse() {
    return use;
  }

  public void setUse(String use) {
    this.use = use;
  }

  public CertificateOrKeyGetSchema use(String use) {
    this.use = use;
    return this;
  }

 /**
   * Get x5c
   * @return x5c
  **/
  @JsonProperty("x5c")
  public List<String> getX5c() {
    return x5c;
  }

  public void setX5c(List<String> x5c) {
    this.x5c = x5c;
  }

  public CertificateOrKeyGetSchema x5c(List<String> x5c) {
    this.x5c = x5c;
    return this;
  }

  public CertificateOrKeyGetSchema addX5cItem(String x5cItem) {
    this.x5c.add(x5cItem);
    return this;
  }

 /**
   * Get x5t
   * @return x5t
  **/
  @JsonProperty("x5t")
  public String getX5t() {
    return x5t;
  }

  public void setX5t(String x5t) {
    this.x5t = x5t;
  }

  public CertificateOrKeyGetSchema x5t(String x5t) {
    this.x5t = x5t;
    return this;
  }

 /**
   * Get x5tS256
   * @return x5tS256
  **/
  @JsonProperty("x5t#S256")
  public String getX5tS256() {
    return x5tS256;
  }

  public void setX5tS256(String x5tS256) {
    this.x5tS256 = x5tS256;
  }

  public CertificateOrKeyGetSchema x5tS256(String x5tS256) {
    this.x5tS256 = x5tS256;
    return this;
  }

 /**
   * Get x5u
   * @return x5u
  **/
  @JsonProperty("x5u")
  public String getX5u() {
    return x5u;
  }

  public void setX5u(String x5u) {
    this.x5u = x5u;
  }

  public CertificateOrKeyGetSchema x5u(String x5u) {
    this.x5u = x5u;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateOrKeyGetSchema {\n");
    
    sb.append("    isFalse: ").append(toIndentedString(isFalse)).append("\n");
    sb.append("    e: ").append(toIndentedString(e)).append("\n");
    sb.append("    expiryDateTime: ").append(toIndentedString(expiryDateTime)).append("\n");
    sb.append("    keyType: ").append(toIndentedString(keyType)).append("\n");
    sb.append("    kid: ").append(toIndentedString(kid)).append("\n");
    sb.append("    kty: ").append(toIndentedString(kty)).append("\n");
    sb.append("    obOrganisationId: ").append(toIndentedString(obOrganisationId)).append("\n");
    sb.append("    softwareStatementId: ").append(toIndentedString(softwareStatementId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    use: ").append(toIndentedString(use)).append("\n");
    sb.append("    x5c: ").append(toIndentedString(x5c)).append("\n");
    sb.append("    x5t: ").append(toIndentedString(x5t)).append("\n");
    sb.append("    x5tS256: ").append(toIndentedString(x5tS256)).append("\n");
    sb.append("    x5u: ").append(toIndentedString(x5u)).append("\n");
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

