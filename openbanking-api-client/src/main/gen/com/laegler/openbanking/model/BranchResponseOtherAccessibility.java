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
  * Enter any new code , name and description for any other Accessibility
 **/
@ApiModel(description="Enter any new code , name and description for any other Accessibility")
public class BranchResponseOtherAccessibility  {
  
  @ApiModelProperty(value = "The four letter Mnemonic used within an XML file to identify a code")
 /**
   * The four letter Mnemonic used within an XML file to identify a code
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
   * The four letter Mnemonic used within an XML file to identify a code
   * @return code
  **/
  @JsonProperty("Code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public BranchResponseOtherAccessibility code(String code) {
    this.code = code;
    return this;
  }

 /**
   * Description to describe the purpose of the code
   * @return description
  **/
  @JsonProperty("Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BranchResponseOtherAccessibility description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Long name associated with the code
   * @return name
  **/
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BranchResponseOtherAccessibility name(String name) {
    this.name = name;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BranchResponseOtherAccessibility {\n");
    
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

