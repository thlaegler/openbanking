package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBFeeCategory1Code;
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
  * Other Fee/charge type which is not available in the standard code set
 **/
@ApiModel(description="Other Fee/charge type which is not available in the standard code set")
public class OBOtherFeeChargeDetailType  {
  
  @ApiModelProperty(value = "")
  private String code = null;

  @ApiModelProperty(required = true, value = "")
  private String description = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private OBFeeCategory1Code feeCategory = null;

  @ApiModelProperty(required = true, value = "")
  private String name = null;
 /**
   * Get code
   * @return code
  **/
  @JsonProperty("Code")
 @Pattern(regexp="^\\w{0,4}$")  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public OBOtherFeeChargeDetailType code(String code) {
    this.code = code;
    return this;
  }

 /**
   * Get description
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

  public OBOtherFeeChargeDetailType description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get feeCategory
   * @return feeCategory
  **/
  @JsonProperty("FeeCategory")
  @NotNull
  public OBFeeCategory1Code getFeeCategory() {
    return feeCategory;
  }

  public void setFeeCategory(OBFeeCategory1Code feeCategory) {
    this.feeCategory = feeCategory;
  }

  public OBOtherFeeChargeDetailType feeCategory(OBFeeCategory1Code feeCategory) {
    this.feeCategory = feeCategory;
    return this;
  }

 /**
   * Get name
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

  public OBOtherFeeChargeDetailType name(String name) {
    this.name = name;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBOtherFeeChargeDetailType {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    feeCategory: ").append(toIndentedString(feeCategory)).append("\n");
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

