package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.CompetentAuthorityClaims;
import com.laegler.openbanking.model.LegalAuthotiryClaims;
import com.laegler.openbanking.model.Meta;
import com.laegler.openbanking.model.OBAccountPaymentServiceProvidersAuthorisationServers;
import com.laegler.openbanking.model.Organisation;
import com.laegler.openbanking.model.SoftwareStatement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ASPSP
 */
@ApiModel(description = "ASPSP")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class OBAccountPaymentServiceProviders   {
  @JsonProperty("AuthorisationServers")
  @Valid
  private List<OBAccountPaymentServiceProvidersAuthorisationServers> authorisationServers = null;

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
  private Organisation urnopenbankingorganisation10 = null;

  @JsonProperty("urn:openbanking:softwarestatement:1.0")
  private SoftwareStatement urnopenbankingsoftwarestatement10 = null;

  public OBAccountPaymentServiceProviders authorisationServers(List<OBAccountPaymentServiceProvidersAuthorisationServers> authorisationServers) {
    this.authorisationServers = authorisationServers;
    return this;
  }

  public OBAccountPaymentServiceProviders addAuthorisationServersItem(OBAccountPaymentServiceProvidersAuthorisationServers authorisationServersItem) {
    if (this.authorisationServers == null) {
      this.authorisationServers = new ArrayList<>();
    }
    this.authorisationServers.add(authorisationServersItem);
    return this;
  }

  /**
   * ASPSP Authorisation Server Portal
   * @return authorisationServers
  **/
  @ApiModelProperty(value = "ASPSP Authorisation Server Portal")

  @Valid

  public List<OBAccountPaymentServiceProvidersAuthorisationServers> getAuthorisationServers() {
    return authorisationServers;
  }

  public void setAuthorisationServers(List<OBAccountPaymentServiceProvidersAuthorisationServers> authorisationServers) {
    this.authorisationServers = authorisationServers;
  }

  public OBAccountPaymentServiceProviders externalId(String externalId) {
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

  public OBAccountPaymentServiceProviders id(String id) {
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

  public OBAccountPaymentServiceProviders meta(Meta meta) {
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

  public OBAccountPaymentServiceProviders schemas(List<String> schemas) {
    this.schemas = schemas;
    return this;
  }

  public OBAccountPaymentServiceProviders addSchemasItem(String schemasItem) {
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

  public OBAccountPaymentServiceProviders urnopenbankingcompetentauthorityclaims10(CompetentAuthorityClaims urnopenbankingcompetentauthorityclaims10) {
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

  public OBAccountPaymentServiceProviders urnopenbankinglegalauthorityclaims10(LegalAuthotiryClaims urnopenbankinglegalauthorityclaims10) {
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

  public OBAccountPaymentServiceProviders urnopenbankingorganisation10(Organisation urnopenbankingorganisation10) {
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

  public Organisation getUrnopenbankingorganisation10() {
    return urnopenbankingorganisation10;
  }

  public void setUrnopenbankingorganisation10(Organisation urnopenbankingorganisation10) {
    this.urnopenbankingorganisation10 = urnopenbankingorganisation10;
  }

  public OBAccountPaymentServiceProviders urnopenbankingsoftwarestatement10(SoftwareStatement urnopenbankingsoftwarestatement10) {
    this.urnopenbankingsoftwarestatement10 = urnopenbankingsoftwarestatement10;
    return this;
  }

  /**
   * Get urnopenbankingsoftwarestatement10
   * @return urnopenbankingsoftwarestatement10
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SoftwareStatement getUrnopenbankingsoftwarestatement10() {
    return urnopenbankingsoftwarestatement10;
  }

  public void setUrnopenbankingsoftwarestatement10(SoftwareStatement urnopenbankingsoftwarestatement10) {
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
    OBAccountPaymentServiceProviders obAccountPaymentServiceProviders = (OBAccountPaymentServiceProviders) o;
    return Objects.equals(this.authorisationServers, obAccountPaymentServiceProviders.authorisationServers) &&
        Objects.equals(this.externalId, obAccountPaymentServiceProviders.externalId) &&
        Objects.equals(this.id, obAccountPaymentServiceProviders.id) &&
        Objects.equals(this.meta, obAccountPaymentServiceProviders.meta) &&
        Objects.equals(this.schemas, obAccountPaymentServiceProviders.schemas) &&
        Objects.equals(this.urnopenbankingcompetentauthorityclaims10, obAccountPaymentServiceProviders.urnopenbankingcompetentauthorityclaims10) &&
        Objects.equals(this.urnopenbankinglegalauthorityclaims10, obAccountPaymentServiceProviders.urnopenbankinglegalauthorityclaims10) &&
        Objects.equals(this.urnopenbankingorganisation10, obAccountPaymentServiceProviders.urnopenbankingorganisation10) &&
        Objects.equals(this.urnopenbankingsoftwarestatement10, obAccountPaymentServiceProviders.urnopenbankingsoftwarestatement10);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorisationServers, externalId, id, meta, schemas, urnopenbankingcompetentauthorityclaims10, urnopenbankinglegalauthorityclaims10, urnopenbankingorganisation10, urnopenbankingsoftwarestatement10);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBAccountPaymentServiceProviders {\n");
    
    sb.append("    authorisationServers: ").append(toIndentedString(authorisationServers)).append("\n");
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

