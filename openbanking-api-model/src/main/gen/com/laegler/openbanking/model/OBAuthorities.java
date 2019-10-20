package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.Meta;
import com.laegler.openbanking.model.Organisation1;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A schema defining the extension attributes that a competent authority has.
 */
@ApiModel(description = "A schema defining the extension attributes that a competent authority has.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class OBAuthorities   {
  @JsonProperty("AuthorityDescription")
  private String authorityDescription = null;

  @JsonProperty("AuthorityId")
  private String authorityId = null;

  @JsonProperty("Country")
  private String country = null;

  @JsonProperty("externalId")
  private String externalId = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("meta")
  private Meta meta = null;

  @JsonProperty("schemas")
  @Valid
  private List<String> schemas = new ArrayList<>();

  @JsonProperty("urn:openbanking:organisation:1.0")
  private Organisation1 urnopenbankingorganisation10 = null;

  public OBAuthorities authorityDescription(String authorityDescription) {
    this.authorityDescription = authorityDescription;
    return this;
  }

  /**
   * Description of the Authority
   * @return authorityDescription
  **/
  @ApiModelProperty(required = true, value = "Description of the Authority")
  @NotNull


  public String getAuthorityDescription() {
    return authorityDescription;
  }

  public void setAuthorityDescription(String authorityDescription) {
    this.authorityDescription = authorityDescription;
  }

  public OBAuthorities authorityId(String authorityId) {
    this.authorityId = authorityId;
    return this;
  }

  /**
   * Unique string that the Authority is commonly known by. Will be referenced by the AuthorityClaims Set.
   * @return authorityId
  **/
  @ApiModelProperty(required = true, value = "Unique string that the Authority is commonly known by. Will be referenced by the AuthorityClaims Set.")
  @NotNull


  public String getAuthorityId() {
    return authorityId;
  }

  public void setAuthorityId(String authorityId) {
    this.authorityId = authorityId;
  }

  public OBAuthorities country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Country in which the Authority has juristiction
   * @return country
  **/
  @ApiModelProperty(required = true, value = "Country in which the Authority has juristiction")
  @NotNull


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public OBAuthorities externalId(String externalId) {
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

  public OBAuthorities id(String id) {
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

  public OBAuthorities meta(Meta meta) {
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

  public OBAuthorities schemas(List<String> schemas) {
    this.schemas = schemas;
    return this;
  }

  public OBAuthorities addSchemasItem(String schemasItem) {
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

  public OBAuthorities urnopenbankingorganisation10(Organisation1 urnopenbankingorganisation10) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBAuthorities obAuthorities = (OBAuthorities) o;
    return Objects.equals(this.authorityDescription, obAuthorities.authorityDescription) &&
        Objects.equals(this.authorityId, obAuthorities.authorityId) &&
        Objects.equals(this.country, obAuthorities.country) &&
        Objects.equals(this.externalId, obAuthorities.externalId) &&
        Objects.equals(this.id, obAuthorities.id) &&
        Objects.equals(this.meta, obAuthorities.meta) &&
        Objects.equals(this.schemas, obAuthorities.schemas) &&
        Objects.equals(this.urnopenbankingorganisation10, obAuthorities.urnopenbankingorganisation10);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorityDescription, authorityId, country, externalId, id, meta, schemas, urnopenbankingorganisation10);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBAuthorities {\n");
    
    sb.append("    authorityDescription: ").append(toIndentedString(authorityDescription)).append("\n");
    sb.append("    authorityId: ").append(toIndentedString(authorityId)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    urnopenbankingorganisation10: ").append(toIndentedString(urnopenbankingorganisation10)).append("\n");
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

