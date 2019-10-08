package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Meta
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class Meta   {
  @JsonProperty("created")
  private String created = null;

  @JsonProperty("lastModified")
  private String lastModified = null;

  @JsonProperty("location")
  private String location = null;

  @JsonProperty("resourceType")
  private String resourceType = null;

  @JsonProperty("version")
  private String version = null;

  public Meta created(String created) {
    this.created = created;
    return this;
  }

  /**
   * Date and time the resource was created
   * @return created
  **/
  @ApiModelProperty(readOnly = true, value = "Date and time the resource was created")


  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public Meta lastModified(String lastModified) {
    this.lastModified = lastModified;
    return this;
  }

  /**
   * Date and time the resource was last modified
   * @return lastModified
  **/
  @ApiModelProperty(readOnly = true, value = "Date and time the resource was last modified")


  public String getLastModified() {
    return lastModified;
  }

  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }

  public Meta location(String location) {
    this.location = location;
    return this;
  }

  /**
   * The location (URI) of the resource
   * @return location
  **/
  @ApiModelProperty(readOnly = true, value = "The location (URI) of the resource")


  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public Meta resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The resource Type
   * @return resourceType
  **/
  @ApiModelProperty(readOnly = true, value = "The resource Type")


  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  public Meta version(String version) {
    this.version = version;
    return this;
  }

  /**
   * The version of the resource
   * @return version
  **/
  @ApiModelProperty(readOnly = true, value = "The version of the resource")


  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Meta meta = (Meta) o;
    return Objects.equals(this.created, meta.created) &&
        Objects.equals(this.lastModified, meta.lastModified) &&
        Objects.equals(this.location, meta.location) &&
        Objects.equals(this.resourceType, meta.resourceType) &&
        Objects.equals(this.version, meta.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, lastModified, location, resourceType, version);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

