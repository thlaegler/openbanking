package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.Links;
import com.laegler.openbanking.model.Meta;
import com.laegler.openbanking.model.OBRisk1;
import com.laegler.openbanking.model.OBWriteDomesticConsentResponse3Data;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBWriteDomesticConsentResponse3
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class OBWriteDomesticConsentResponse3   {
  @JsonProperty("Data")
  private OBWriteDomesticConsentResponse3Data data = null;

  @JsonProperty("Links")
  private Links links = null;

  @JsonProperty("Meta")
  private Meta meta = null;

  @JsonProperty("Risk")
  private OBRisk1 risk = null;

  public OBWriteDomesticConsentResponse3 data(OBWriteDomesticConsentResponse3Data data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OBWriteDomesticConsentResponse3Data getData() {
    return data;
  }

  public void setData(OBWriteDomesticConsentResponse3Data data) {
    this.data = data;
  }

  public OBWriteDomesticConsentResponse3 links(Links links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }

  public OBWriteDomesticConsentResponse3 meta(Meta meta) {
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

  public OBWriteDomesticConsentResponse3 risk(OBRisk1 risk) {
    this.risk = risk;
    return this;
  }

  /**
   * Get risk
   * @return risk
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OBRisk1 getRisk() {
    return risk;
  }

  public void setRisk(OBRisk1 risk) {
    this.risk = risk;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBWriteDomesticConsentResponse3 obWriteDomesticConsentResponse3 = (OBWriteDomesticConsentResponse3) o;
    return Objects.equals(this.data, obWriteDomesticConsentResponse3.data) &&
        Objects.equals(this.links, obWriteDomesticConsentResponse3.links) &&
        Objects.equals(this.meta, obWriteDomesticConsentResponse3.meta) &&
        Objects.equals(this.risk, obWriteDomesticConsentResponse3.risk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, meta, risk);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteDomesticConsentResponse3 {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
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

