package com.laegler.openbanking.model;

import com.laegler.openbanking.model.Links;
import com.laegler.openbanking.model.Meta;
import com.laegler.openbanking.model.OBReadStandingOrder4Data;
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

public class OBReadStandingOrder4  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private OBReadStandingOrder4Data data = null;

  @ApiModelProperty(value = "")
  @Valid
  private Links links = null;

  @ApiModelProperty(value = "")
  @Valid
  private Meta meta = null;
 /**
   * Get data
   * @return data
  **/
  @JsonProperty("Data")
  @NotNull
  public OBReadStandingOrder4Data getData() {
    return data;
  }

  public void setData(OBReadStandingOrder4Data data) {
    this.data = data;
  }

  public OBReadStandingOrder4 data(OBReadStandingOrder4Data data) {
    this.data = data;
    return this;
  }

 /**
   * Get links
   * @return links
  **/
  @JsonProperty("Links")
  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }

  public OBReadStandingOrder4 links(Links links) {
    this.links = links;
    return this;
  }

 /**
   * Get meta
   * @return meta
  **/
  @JsonProperty("Meta")
  public Meta getMeta() {
    return meta;
  }

  public void setMeta(Meta meta) {
    this.meta = meta;
  }

  public OBReadStandingOrder4 meta(Meta meta) {
    this.meta = meta;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadStandingOrder4 {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

