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
  * Other Segment not available in the standard segment list
 **/
@ApiModel(description="Other Segment not available in the standard segment list")
public class BranchCurrentAccountResponseOtherSegment  {
  
  @ApiModelProperty(value = "The four letter Mnemonic used within an SWAGGER file to identify a code")
 /**
   * The four letter Mnemonic used within an SWAGGER file to identify a code
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
   * The four letter Mnemonic used within an SWAGGER file to identify a code
   * @return code
  **/
  @JsonProperty("Code")
 @Pattern(regexp="^\\w{0,4}$") @Size(min=0,max=4)  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public BranchCurrentAccountResponseOtherSegment code(String code) {
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

  public BranchCurrentAccountResponseOtherSegment description(String description) {
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

  public BranchCurrentAccountResponseOtherSegment name(String name) {
    this.name = name;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BranchCurrentAccountResponseOtherSegment {\n");
    
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

