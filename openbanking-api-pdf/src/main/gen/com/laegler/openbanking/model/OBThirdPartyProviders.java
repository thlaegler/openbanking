package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.CompetentAuthorityClaims;
import com.laegler.openbanking.model.LegalAuthotiryClaims;
import com.laegler.openbanking.model.Meta;
import com.laegler.openbanking.model.Organisation1;
import com.laegler.openbanking.model.SoftwareStatement1;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Third party providers consisting of payment initiation service providers and account information service providers
 */
@ApiModel(description = "Third party providers consisting of payment initiation service providers and account information service providers")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class OBThirdPartyProviders   {
  @JsonProperty("externalId")
  private String externalId = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("meta")
  private Meta meta = null;

  @JsonProperty("schemas")
  @Valid
  private List<String> schemas = new ArrayList<>();

  @JsonProperty("urn:openbanking:competentauthorityclaims:1.0")
  private CompetentAuthorityClaims urnopenbankingcompetentauthorityclaims10 = null;

  @JsonProperty("urn:openbanking:legalauthorityclaims:1.0")
  private LegalAuthotiryClaims urnopenbankinglegalauthorityclaims10 = null;

  @JsonProperty("urn:openbanking:organisation:1.0")
  private Organisation1 urnopenbankingorganisation10 = null;

  @JsonProperty("urn:openbanking:softwarestatement:1.0")
  private SoftwareStatement1 urnopenbankingsoftwarestatement10 = null;

  public OBThirdPartyProviders externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * Get externalId
   * @return externalId
  **/
  @ApiModelProperty(value = "")


  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public OBThirdPartyProviders id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(readOnly = true, value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OBThirdPartyProviders meta(Meta meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Meta getMeta() {
    return meta;
  }

  public void setMeta(Meta meta) {
    this.meta = meta;
  }

  public OBThirdPartyProviders schemas(List<String> schemas) {
    this.schemas = schemas;
    return this;
  }

  public OBThirdPartyProviders addSchemasItem(String schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

  /**
   * Get schemas
   * @return schemas
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public List<String> getSchemas() {
    return schemas;
  }

  public void setSchemas(List<String> schemas) {
    this.schemas = schemas;
  }

  public OBThirdPartyProviders urnopenbankingcompetentauthorityclaims10(CompetentAuthorityClaims urnopenbankingcompetentauthorityclaims10) {
    this.urnopenbankingcompetentauthorityclaims10 = urnopenbankingcompetentauthorityclaims10;
    return this;
  }

  /**
   * Get urnopenbankingcompetentauthorityclaims10
   * @return urnopenbankingcompetentauthorityclaims10
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CompetentAuthorityClaims getUrnopenbankingcompetentauthorityclaims10() {
    return urnopenbankingcompetentauthorityclaims10;
  }

  public void setUrnopenbankingcompetentauthorityclaims10(CompetentAuthorityClaims urnopenbankingcompetentauthorityclaims10) {
    this.urnopenbankingcompetentauthorityclaims10 = urnopenbankingcompetentauthorityclaims10;
  }

  public OBThirdPartyProviders urnopenbankinglegalauthorityclaims10(LegalAuthotiryClaims urnopenbankinglegalauthorityclaims10) {
    this.urnopenbankinglegalauthorityclaims10 = urnopenbankinglegalauthorityclaims10;
    return this;
  }

  /**
   * Get urnopenbankinglegalauthorityclaims10
   * @return urnopenbankinglegalauthorityclaims10
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LegalAuthotiryClaims getUrnopenbankinglegalauthorityclaims10() {
    return urnopenbankinglegalauthorityclaims10;
  }

  public void setUrnopenbankinglegalauthorityclaims10(LegalAuthotiryClaims urnopenbankinglegalauthorityclaims10) {
    this.urnopenbankinglegalauthorityclaims10 = urnopenbankinglegalauthorityclaims10;
  }

  public OBThirdPartyProviders urnopenbankingorganisation10(Organisation1 urnopenbankingorganisation10) {
    this.urnopenbankingorganisation10 = urnopenbankingorganisation10;
    return this;
  }

  /**
   * Get urnopenbankingorganisation10
   * @return urnopenbankingorganisation10
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Organisation1 getUrnopenbankingorganisation10() {
    return urnopenbankingorganisation10;
  }

  public void setUrnopenbankingorganisation10(Organisation1 urnopenbankingorganisation10) {
    this.urnopenbankingorganisation10 = urnopenbankingorganisation10;
  }

  public OBThirdPartyProviders urnopenbankingsoftwarestatement10(SoftwareStatement1 urnopenbankingsoftwarestatement10) {
    this.urnopenbankingsoftwarestatement10 = urnopenbankingsoftwarestatement10;
    return this;
  }

  /**
   * Get urnopenbankingsoftwarestatement10
   * @return urnopenbankingsoftwarestatement10
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SoftwareStatement1 getUrnopenbankingsoftwarestatement10() {
    return urnopenbankingsoftwarestatement10;
  }

  public void setUrnopenbankingsoftwarestatement10(SoftwareStatement1 urnopenbankingsoftwarestatement10) {
    this.urnopenbankingsoftwarestatement10 = urnopenbankingsoftwarestatement10;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBThirdPartyProviders obThirdPartyProviders = (OBThirdPartyProviders) o;
    return Objects.equals(this.externalId, obThirdPartyProviders.externalId) &&
        Objects.equals(this.id, obThirdPartyProviders.id) &&
        Objects.equals(this.meta, obThirdPartyProviders.meta) &&
        Objects.equals(this.schemas, obThirdPartyProviders.schemas) &&
        Objects.equals(this.urnopenbankingcompetentauthorityclaims10, obThirdPartyProviders.urnopenbankingcompetentauthorityclaims10) &&
        Objects.equals(this.urnopenbankinglegalauthorityclaims10, obThirdPartyProviders.urnopenbankinglegalauthorityclaims10) &&
        Objects.equals(this.urnopenbankingorganisation10, obThirdPartyProviders.urnopenbankingorganisation10) &&
        Objects.equals(this.urnopenbankingsoftwarestatement10, obThirdPartyProviders.urnopenbankingsoftwarestatement10);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalId, id, meta, schemas, urnopenbankingcompetentauthorityclaims10, urnopenbankinglegalauthorityclaims10, urnopenbankingorganisation10, urnopenbankingsoftwarestatement10);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBThirdPartyProviders {\n");
    
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    urnopenbankingcompetentauthorityclaims10: ").append(toIndentedString(urnopenbankingcompetentauthorityclaims10)).append("\n");
    sb.append("    urnopenbankinglegalauthorityclaims10: ").append(toIndentedString(urnopenbankinglegalauthorityclaims10)).append("\n");
    sb.append("    urnopenbankingorganisation10: ").append(toIndentedString(urnopenbankingorganisation10)).append("\n");
    sb.append("    urnopenbankingsoftwarestatement10: ").append(toIndentedString(urnopenbankingsoftwarestatement10)).append("\n");
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

