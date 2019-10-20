package com.laegler.openbanking.model;

import com.laegler.openbanking.model.Meta;
import com.laegler.openbanking.model.Organisation1;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
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

/**
  * A schema defining the extension attributes that a competent authority has.
 **/
@ApiModel(description="A schema defining the extension attributes that a competent authority has.")
public class OBAuthorities  {
  
  @ApiModelProperty(required = true, value = "Description of the Authority")
 /**
   * Description of the Authority
  **/
  private String authorityDescription = null;

  @ApiModelProperty(required = true, value = "Unique string that the Authority is commonly known by. Will be referenced by the AuthorityClaims Set.")
 /**
   * Unique string that the Authority is commonly known by. Will be referenced by the AuthorityClaims Set.
  **/
  private String authorityId = null;

  @ApiModelProperty(required = true, value = "Country in which the Authority has juristiction")
 /**
   * Country in which the Authority has juristiction
  **/
  private String country = null;

  @ApiModelProperty(value = "")
  private String externalId = null;

  @ApiModelProperty(value = "")
  private String id = null;

  @ApiModelProperty(value = "")
  @Valid
  private Meta meta = null;

  @ApiModelProperty(required = true, value = "")
  private List<String> schemas = new ArrayList<String>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private Organisation1 urnopenbankingorganisation10 = null;
 /**
   * Description of the Authority
   * @return authorityDescription
  **/
  @JsonProperty("AuthorityDescription")
  @NotNull
  public String getAuthorityDescription() {
    return authorityDescription;
  }

  public void setAuthorityDescription(String authorityDescription) {
    this.authorityDescription = authorityDescription;
  }

  public OBAuthorities authorityDescription(String authorityDescription) {
    this.authorityDescription = authorityDescription;
    return this;
  }

 /**
   * Unique string that the Authority is commonly known by. Will be referenced by the AuthorityClaims Set.
   * @return authorityId
  **/
  @JsonProperty("AuthorityId")
  @NotNull
  public String getAuthorityId() {
    return authorityId;
  }

  public void setAuthorityId(String authorityId) {
    this.authorityId = authorityId;
  }

  public OBAuthorities authorityId(String authorityId) {
    this.authorityId = authorityId;
    return this;
  }

 /**
   * Country in which the Authority has juristiction
   * @return country
  **/
  @JsonProperty("Country")
  @NotNull
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public OBAuthorities country(String country) {
    this.country = country;
    return this;
  }

 /**
   * Get externalId
   * @return externalId
  **/
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public OBAuthorities externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }


 /**
   * Get meta
   * @return meta
  **/
  @JsonProperty("meta")
  public Meta getMeta() {
    return meta;
  }

  public void setMeta(Meta meta) {
    this.meta = meta;
  }

  public OBAuthorities meta(Meta meta) {
    this.meta = meta;
    return this;
  }

 /**
   * Get schemas
   * @return schemas
  **/
  @JsonProperty("schemas")
  @NotNull
  public List<String> getSchemas() {
    return schemas;
  }

  public void setSchemas(List<String> schemas) {
    this.schemas = schemas;
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
   * Get urnopenbankingorganisation10
   * @return urnopenbankingorganisation10
  **/
  @JsonProperty("urn:openbanking:organisation:1.0")
  @NotNull
  public Organisation1 getUrnopenbankingorganisation10() {
    return urnopenbankingorganisation10;
  }

  public void setUrnopenbankingorganisation10(Organisation1 urnopenbankingorganisation10) {
    this.urnopenbankingorganisation10 = urnopenbankingorganisation10;
  }

  public OBAuthorities urnopenbankingorganisation10(Organisation1 urnopenbankingorganisation10) {
    this.urnopenbankingorganisation10 = urnopenbankingorganisation10;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

