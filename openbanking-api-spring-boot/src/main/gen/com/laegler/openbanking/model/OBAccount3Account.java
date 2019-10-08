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
 * Provides the details to identify an account.
 */
@ApiModel(description = "Provides the details to identify an account.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class OBAccount3Account   {
  @JsonProperty("Identification")
  private String identification = null;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("SchemeName")
  private String schemeName = null;

  @JsonProperty("SecondaryIdentification")
  private String secondaryIdentification = null;

  public OBAccount3Account identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Get identification
   * @return identification
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(min=1,max=256) 
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public OBAccount3Account name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")

@Size(min=1,max=70) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OBAccount3Account schemeName(String schemeName) {
    this.schemeName = schemeName;
    return this;
  }

  /**
   * Get schemeName
   * @return schemeName
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getSchemeName() {
    return schemeName;
  }

  public void setSchemeName(String schemeName) {
    this.schemeName = schemeName;
  }

  public OBAccount3Account secondaryIdentification(String secondaryIdentification) {
    this.secondaryIdentification = secondaryIdentification;
    return this;
  }

  /**
   * Get secondaryIdentification
   * @return secondaryIdentification
  **/
  @ApiModelProperty(value = "")

@Size(min=1,max=34) 
  public String getSecondaryIdentification() {
    return secondaryIdentification;
  }

  public void setSecondaryIdentification(String secondaryIdentification) {
    this.secondaryIdentification = secondaryIdentification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBAccount3Account obAccount3Account = (OBAccount3Account) o;
    return Objects.equals(this.identification, obAccount3Account.identification) &&
        Objects.equals(this.name, obAccount3Account.name) &&
        Objects.equals(this.schemeName, obAccount3Account.schemeName) &&
        Objects.equals(this.secondaryIdentification, obAccount3Account.secondaryIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identification, name, schemeName, secondaryIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBAccount3Account {\n");
    
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    schemeName: ").append(toIndentedString(schemeName)).append("\n");
    sb.append("    secondaryIdentification: ").append(toIndentedString(secondaryIdentification)).append("\n");
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

