package com.laegler.openbanking.model;

import io.swagger.annotations.ApiModel;
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
  * Other SICCODE which is not present in the standard code set
 **/
@ApiModel(description="Other SICCODE which is not present in the standard code set")
public class OtherSICCode  {
  
  @ApiModelProperty(value = "SICCode which is not present in the standard code set.")
 /**
   * SICCode which is not present in the standard code set.
  **/
  private String code = null;

  @ApiModelProperty(required = true, value = "Description to describe the purpose of the code")
 /**
   * Description to describe the purpose of the code
  **/
  private String description = null;

  @ApiModelProperty(required = true, value = "Long name associated with the code")
 /**
   * Long name associated with the code
  **/
  private String name = null;
 /**
   * SICCode which is not present in the standard code set.
   * @return code
  **/
  @JsonProperty("Code")
 @Pattern(regexp="^[0-9]{0,5}$") @Size(min=0,max=5)  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public OtherSICCode code(String code) {
    this.code = code;
    return this;
  }

 /**
   * Description to describe the purpose of the code
   * @return description
  **/
  @JsonProperty("Description")
  @NotNull
 @Size(min=1,max=350)  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OtherSICCode description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Long name associated with the code
   * @return name
  **/
  @JsonProperty("Name")
  @NotNull
 @Size(min=1,max=70)  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OtherSICCode name(String name) {
    this.name = name;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtherSICCode {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

