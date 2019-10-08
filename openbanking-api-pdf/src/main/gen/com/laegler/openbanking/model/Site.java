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
 * Used by a Financial Institution internally to identify the location of an ATM.
 */
@ApiModel(description = "Used by a Financial Institution internally to identify the location of an ATM.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class Site   {
  @JsonProperty("Identification")
  private String identification = null;

  @JsonProperty("Name")
  private String name = null;

  public Site identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * ATM site identification for the Financial Institution.
   * @return identification
  **/
  @ApiModelProperty(value = "ATM site identification for the Financial Institution.")

@Size(min=1,max=35) 
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public Site name(String name) {
    this.name = name;
    return this;
  }

  /**
   * ATM site name as used by Financial Institution.
   * @return name
  **/
  @ApiModelProperty(value = "ATM site name as used by Financial Institution.")

@Size(min=1,max=140) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Site site = (Site) o;
    return Objects.equals(this.identification, site.identification) &&
        Objects.equals(this.name, site.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identification, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Site {\n");
    
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

