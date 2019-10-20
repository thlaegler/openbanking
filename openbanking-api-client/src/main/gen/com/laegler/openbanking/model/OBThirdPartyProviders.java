package com.laegler.openbanking.model;

import com.laegler.openbanking.model.CompetentAuthorityClaims;
import com.laegler.openbanking.model.LegalAuthotiryClaims;
import com.laegler.openbanking.model.Meta;
import com.laegler.openbanking.model.Organisation1;
import com.laegler.openbanking.model.SoftwareStatement1;
import io.swagger.annotations.ApiModel;
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

/**
  * Third party providers consisting of payment initiation service providers and account information service providers
 **/
@ApiModel(description="Third party providers consisting of payment initiation service providers and account information service providers")
public class OBThirdPartyProviders  {
  
  @ApiModelProperty(value = "")
  private String externalId = null;

  @ApiModelProperty(value = "")
  private String id = null;

  @ApiModelProperty(value = "")
  private Meta meta = null;

  @ApiModelProperty(required = true, value = "")
  private List<String> schemas = new ArrayList<String>();

  @ApiModelProperty(value = "")
  private CompetentAuthorityClaims urnopenbankingcompetentauthorityclaims10 = null;

  @ApiModelProperty(value = "")
  private LegalAuthotiryClaims urnopenbankinglegalauthorityclaims10 = null;

  @ApiModelProperty(required = true, value = "")
  private Organisation1 urnopenbankingorganisation10 = null;

  @ApiModelProperty(value = "")
  private SoftwareStatement1 urnopenbankingsoftwarestatement10 = null;
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

  public OBThirdPartyProviders externalId(String externalId) {
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

  public OBThirdPartyProviders meta(Meta meta) {
    this.meta = meta;
    return this;
  }

 /**
   * Get schemas
   * @return schemas
  **/
  @JsonProperty("schemas")
  public List<String> getSchemas() {
    return schemas;
  }

  public void setSchemas(List<String> schemas) {
    this.schemas = schemas;
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
   * Get urnopenbankingcompetentauthorityclaims10
   * @return urnopenbankingcompetentauthorityclaims10
  **/
  @JsonProperty("urn:openbanking:competentauthorityclaims:1.0")
  public CompetentAuthorityClaims getUrnopenbankingcompetentauthorityclaims10() {
    return urnopenbankingcompetentauthorityclaims10;
  }

  public void setUrnopenbankingcompetentauthorityclaims10(CompetentAuthorityClaims urnopenbankingcompetentauthorityclaims10) {
    this.urnopenbankingcompetentauthorityclaims10 = urnopenbankingcompetentauthorityclaims10;
  }

  public OBThirdPartyProviders urnopenbankingcompetentauthorityclaims10(CompetentAuthorityClaims urnopenbankingcompetentauthorityclaims10) {
    this.urnopenbankingcompetentauthorityclaims10 = urnopenbankingcompetentauthorityclaims10;
    return this;
  }

 /**
   * Get urnopenbankinglegalauthorityclaims10
   * @return urnopenbankinglegalauthorityclaims10
  **/
  @JsonProperty("urn:openbanking:legalauthorityclaims:1.0")
  public LegalAuthotiryClaims getUrnopenbankinglegalauthorityclaims10() {
    return urnopenbankinglegalauthorityclaims10;
  }

  public void setUrnopenbankinglegalauthorityclaims10(LegalAuthotiryClaims urnopenbankinglegalauthorityclaims10) {
    this.urnopenbankinglegalauthorityclaims10 = urnopenbankinglegalauthorityclaims10;
  }

  public OBThirdPartyProviders urnopenbankinglegalauthorityclaims10(LegalAuthotiryClaims urnopenbankinglegalauthorityclaims10) {
    this.urnopenbankinglegalauthorityclaims10 = urnopenbankinglegalauthorityclaims10;
    return this;
  }

 /**
   * Get urnopenbankingorganisation10
   * @return urnopenbankingorganisation10
  **/
  @JsonProperty("urn:openbanking:organisation:1.0")
  public Organisation1 getUrnopenbankingorganisation10() {
    return urnopenbankingorganisation10;
  }

  public void setUrnopenbankingorganisation10(Organisation1 urnopenbankingorganisation10) {
    this.urnopenbankingorganisation10 = urnopenbankingorganisation10;
  }

  public OBThirdPartyProviders urnopenbankingorganisation10(Organisation1 urnopenbankingorganisation10) {
    this.urnopenbankingorganisation10 = urnopenbankingorganisation10;
    return this;
  }

 /**
   * Get urnopenbankingsoftwarestatement10
   * @return urnopenbankingsoftwarestatement10
  **/
  @JsonProperty("urn:openbanking:softwarestatement:1.0")
  public SoftwareStatement1 getUrnopenbankingsoftwarestatement10() {
    return urnopenbankingsoftwarestatement10;
  }

  public void setUrnopenbankingsoftwarestatement10(SoftwareStatement1 urnopenbankingsoftwarestatement10) {
    this.urnopenbankingsoftwarestatement10 = urnopenbankingsoftwarestatement10;
  }

  public OBThirdPartyProviders urnopenbankingsoftwarestatement10(SoftwareStatement1 urnopenbankingsoftwarestatement10) {
    this.urnopenbankingsoftwarestatement10 = urnopenbankingsoftwarestatement10;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

