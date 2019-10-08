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
 * Resource links to other available versions of the resource.
 */
@ApiModel(description = "Resource links to other available versions of the resource.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class OBEventLink1   {
  @JsonProperty("link")
  private String link = null;

  @JsonProperty("version")
  private String version = null;

  public OBEventLink1 link(String link) {
    this.link = link;
    return this;
  }

  /**
   * Resource link.
   * @return link
  **/
  @ApiModelProperty(required = true, value = "Resource link.")
  @NotNull


  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public OBEventLink1 version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Resource version.
   * @return version
  **/
  @ApiModelProperty(required = true, value = "Resource version.")
  @NotNull

@Size(min=1,max=10) 
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
    OBEventLink1 obEventLink1 = (OBEventLink1) o;
    return Objects.equals(this.link, obEventLink1.link) &&
        Objects.equals(this.version, obEventLink1.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, version);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

