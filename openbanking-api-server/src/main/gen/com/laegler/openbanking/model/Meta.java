package com.laegler.openbanking.model;

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

public class Meta  {
  
  @ApiModelProperty(value = "Date and time the resource was created")
 /**
   * Date and time the resource was created
  **/
  private String created = null;

  @ApiModelProperty(value = "Date and time the resource was last modified")
 /**
   * Date and time the resource was last modified
  **/
  private String lastModified = null;

  @ApiModelProperty(value = "The location (URI) of the resource")
 /**
   * The location (URI) of the resource
  **/
  private String location = null;

  @ApiModelProperty(value = "The resource Type")
 /**
   * The resource Type
  **/
  private String resourceType = null;

  @ApiModelProperty(value = "The version of the resource")
 /**
   * The version of the resource
  **/
  private String version = null;
 /**
   * Date and time the resource was created
   * @return created
  **/
  @JsonProperty("created")
  public String getCreated() {
    return created;
  }


 /**
   * Date and time the resource was last modified
   * @return lastModified
  **/
  @JsonProperty("lastModified")
  public String getLastModified() {
    return lastModified;
  }


 /**
   * The location (URI) of the resource
   * @return location
  **/
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }


 /**
   * The resource Type
   * @return resourceType
  **/
  @JsonProperty("resourceType")
  public String getResourceType() {
    return resourceType;
  }


 /**
   * The version of the resource
   * @return version
  **/
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }



  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Meta {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
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

