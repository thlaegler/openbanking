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
 * CertificateOrKeyGetSchema
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class CertificateOrKeyGetSchema   {
  @JsonProperty("isFalse")
  private String isFalse = null;

  @JsonProperty("e")
  private String e = null;

  @JsonProperty("expiryDateTime")
  private String expiryDateTime = null;

  @JsonProperty("keyType")
  private String keyType = null;

  @JsonProperty("kid")
  private String kid = null;

  @JsonProperty("kty")
  private String kty = null;

  @JsonProperty("obOrganisationId")
  private String obOrganisationId = null;

  @JsonProperty("softwareStatementId")
  private String softwareStatementId = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("use")
  private String use = null;

  @JsonProperty("x5c")
  @Valid
  private List<String> x5c = null;

  @JsonProperty("x5t")
  private String x5t = null;

  @JsonProperty("x5t#S256")
  private String x5tS256 = null;

  @JsonProperty("x5u")
  private String x5u = null;

  public CertificateOrKeyGetSchema isFalse(String isFalse) {
    this.isFalse = isFalse;
    return this;
  }

  /**
   * Get isFalse
   * @return isFalse
  **/
  @ApiModelProperty(value = "")


  public String getIsFalse() {
    return isFalse;
  }

  public void setIsFalse(String isFalse) {
    this.isFalse = isFalse;
  }

  public CertificateOrKeyGetSchema e(String e) {
    this.e = e;
    return this;
  }

  /**
   * Get e
   * @return e
  **/
  @ApiModelProperty(value = "")


  public String getE() {
    return e;
  }

  public void setE(String e) {
    this.e = e;
  }

  public CertificateOrKeyGetSchema expiryDateTime(String expiryDateTime) {
    this.expiryDateTime = expiryDateTime;
    return this;
  }

  /**
   * Get expiryDateTime
   * @return expiryDateTime
  **/
  @ApiModelProperty(value = "")


  public String getExpiryDateTime() {
    return expiryDateTime;
  }

  public void setExpiryDateTime(String expiryDateTime) {
    this.expiryDateTime = expiryDateTime;
  }

  public CertificateOrKeyGetSchema keyType(String keyType) {
    this.keyType = keyType;
    return this;
  }

  /**
   * Get keyType
   * @return keyType
  **/
  @ApiModelProperty(value = "")


  public String getKeyType() {
    return keyType;
  }

  public void setKeyType(String keyType) {
    this.keyType = keyType;
  }

  public CertificateOrKeyGetSchema kid(String kid) {
    this.kid = kid;
    return this;
  }

  /**
   * Get kid
   * @return kid
  **/
  @ApiModelProperty(value = "")


  public String getKid() {
    return kid;
  }

  public void setKid(String kid) {
    this.kid = kid;
  }

  public CertificateOrKeyGetSchema kty(String kty) {
    this.kty = kty;
    return this;
  }

  /**
   * Get kty
   * @return kty
  **/
  @ApiModelProperty(value = "")


  public String getKty() {
    return kty;
  }

  public void setKty(String kty) {
    this.kty = kty;
  }

  public CertificateOrKeyGetSchema obOrganisationId(String obOrganisationId) {
    this.obOrganisationId = obOrganisationId;
    return this;
  }

  /**
   * OB organisation Id
   * @return obOrganisationId
  **/
  @ApiModelProperty(value = "OB organisation Id")


  public String getObOrganisationId() {
    return obOrganisationId;
  }

  public void setObOrganisationId(String obOrganisationId) {
    this.obOrganisationId = obOrganisationId;
  }

  public CertificateOrKeyGetSchema softwareStatementId(String softwareStatementId) {
    this.softwareStatementId = softwareStatementId;
    return this;
  }

  /**
   * Software Statement Id
   * @return softwareStatementId
  **/
  @ApiModelProperty(value = "Software Statement Id")


  public String getSoftwareStatementId() {
    return softwareStatementId;
  }

  public void setSoftwareStatementId(String softwareStatementId) {
    this.softwareStatementId = softwareStatementId;
  }

  public CertificateOrKeyGetSchema status(String status) {
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

  public CertificateOrKeyGetSchema use(String use) {
    this.use = use;
    return this;
  }

  /**
   * Get use
   * @return use
  **/
  @ApiModelProperty(value = "")


  public String getUse() {
    return use;
  }

  public void setUse(String use) {
    this.use = use;
  }

  public CertificateOrKeyGetSchema x5c(List<String> x5c) {
    this.x5c = x5c;
    return this;
  }

  public CertificateOrKeyGetSchema addX5cItem(String x5cItem) {
    if (this.x5c == null) {
      this.x5c = new ArrayList<>();
    }
    this.x5c.add(x5cItem);
    return this;
  }

  /**
   * Get x5c
   * @return x5c
  **/
  @ApiModelProperty(value = "")


  public List<String> getX5c() {
    return x5c;
  }

  public void setX5c(List<String> x5c) {
    this.x5c = x5c;
  }

  public CertificateOrKeyGetSchema x5t(String x5t) {
    this.x5t = x5t;
    return this;
  }

  /**
   * Get x5t
   * @return x5t
  **/
  @ApiModelProperty(value = "")


  public String getX5t() {
    return x5t;
  }

  public void setX5t(String x5t) {
    this.x5t = x5t;
  }

  public CertificateOrKeyGetSchema x5tS256(String x5tS256) {
    this.x5tS256 = x5tS256;
    return this;
  }

  /**
   * Get x5tS256
   * @return x5tS256
  **/
  @ApiModelProperty(value = "")


  public String getX5tS256() {
    return x5tS256;
  }

  public void setX5tS256(String x5tS256) {
    this.x5tS256 = x5tS256;
  }

  public CertificateOrKeyGetSchema x5u(String x5u) {
    this.x5u = x5u;
    return this;
  }

  /**
   * Get x5u
   * @return x5u
  **/
  @ApiModelProperty(value = "")


  public String getX5u() {
    return x5u;
  }

  public void setX5u(String x5u) {
    this.x5u = x5u;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateOrKeyGetSchema certificateOrKeyGetSchema = (CertificateOrKeyGetSchema) o;
    return Objects.equals(this.isFalse, certificateOrKeyGetSchema.isFalse) &&
        Objects.equals(this.e, certificateOrKeyGetSchema.e) &&
        Objects.equals(this.expiryDateTime, certificateOrKeyGetSchema.expiryDateTime) &&
        Objects.equals(this.keyType, certificateOrKeyGetSchema.keyType) &&
        Objects.equals(this.kid, certificateOrKeyGetSchema.kid) &&
        Objects.equals(this.kty, certificateOrKeyGetSchema.kty) &&
        Objects.equals(this.obOrganisationId, certificateOrKeyGetSchema.obOrganisationId) &&
        Objects.equals(this.softwareStatementId, certificateOrKeyGetSchema.softwareStatementId) &&
        Objects.equals(this.status, certificateOrKeyGetSchema.status) &&
        Objects.equals(this.use, certificateOrKeyGetSchema.use) &&
        Objects.equals(this.x5c, certificateOrKeyGetSchema.x5c) &&
        Objects.equals(this.x5t, certificateOrKeyGetSchema.x5t) &&
        Objects.equals(this.x5tS256, certificateOrKeyGetSchema.x5tS256) &&
        Objects.equals(this.x5u, certificateOrKeyGetSchema.x5u);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isFalse, e, expiryDateTime, keyType, kid, kty, obOrganisationId, softwareStatementId, status, use, x5c, x5t, x5tS256, x5u);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

