package com.laegler.openbanking.model;

import io.swagger.annotations.ApiModel;

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
  * Resource links to other available versions of the resource.
 **/
@ApiModel(description="Resource links to other available versions of the resource.")
public class OBEventLink1  {
  
  @ApiModelProperty(required = true, value = "Resource link.")
 /**
   * Resource link.
  **/
  private String link = null;

  @ApiModelProperty(required = true, value = "Resource version.")
 /**
   * Resource version.
  **/
  private String version = null;
 /**
   * Resource link.
   * @return link
  **/
  @JsonProperty("link")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public OBEventLink1 link(String link) {
    this.link = link;
    return this;
  }

 /**
   * Resource version.
   * @return version
  **/
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public OBEventLink1 version(String version) {
    this.version = version;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBEventLink1 {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

