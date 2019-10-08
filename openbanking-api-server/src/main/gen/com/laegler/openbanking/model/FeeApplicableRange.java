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
  * Range or amounts or rates for which the fee/charge applies
 **/
@ApiModel(description="Range or amounts or rates for which the fee/charge applies")
public class FeeApplicableRange  {
  
  @ApiModelProperty(value = "Maximum Amount on which fee is applicable (where it is expressed as an amount)")
 /**
   * Maximum Amount on which fee is applicable (where it is expressed as an amount)
  **/
  private String maximumAmount = null;

  @ApiModelProperty(value = "Maximum rate on which fee/charge is applicable(where it is expressed as an rate)")
 /**
   * Maximum rate on which fee/charge is applicable(where it is expressed as an rate)
  **/
  private String maximumRate = null;

  @ApiModelProperty(value = "Minimum Amount on which fee/charge is applicable (where it is expressed as an amount)")
 /**
   * Minimum Amount on which fee/charge is applicable (where it is expressed as an amount)
  **/
  private String minimumAmount = null;

  @ApiModelProperty(value = "Minimum rate on which fee/charge is applicable(where it is expressed as an rate)")
 /**
   * Minimum rate on which fee/charge is applicable(where it is expressed as an rate)
  **/
  private String minimumRate = null;
 /**
   * Maximum Amount on which fee is applicable (where it is expressed as an amount)
   * @return maximumAmount
  **/
  @JsonProperty("MaximumAmount")
 @Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")  public String getMaximumAmount() {
    return maximumAmount;
  }

  public void setMaximumAmount(String maximumAmount) {
    this.maximumAmount = maximumAmount;
  }

  public FeeApplicableRange maximumAmount(String maximumAmount) {
    this.maximumAmount = maximumAmount;
    return this;
  }

 /**
   * Maximum rate on which fee/charge is applicable(where it is expressed as an rate)
   * @return maximumRate
  **/
  @JsonProperty("MaximumRate")
 @Pattern(regexp="^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")  public String getMaximumRate() {
    return maximumRate;
  }

  public void setMaximumRate(String maximumRate) {
    this.maximumRate = maximumRate;
  }

  public FeeApplicableRange maximumRate(String maximumRate) {
    this.maximumRate = maximumRate;
    return this;
  }

 /**
   * Minimum Amount on which fee/charge is applicable (where it is expressed as an amount)
   * @return minimumAmount
  **/
  @JsonProperty("MinimumAmount")
 @Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")  public String getMinimumAmount() {
    return minimumAmount;
  }

  public void setMinimumAmount(String minimumAmount) {
    this.minimumAmount = minimumAmount;
  }

  public FeeApplicableRange minimumAmount(String minimumAmount) {
    this.minimumAmount = minimumAmount;
    return this;
  }

 /**
   * Minimum rate on which fee/charge is applicable(where it is expressed as an rate)
   * @return minimumRate
  **/
  @JsonProperty("MinimumRate")
 @Pattern(regexp="^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")  public String getMinimumRate() {
    return minimumRate;
  }

  public void setMinimumRate(String minimumRate) {
    this.minimumRate = minimumRate;
  }

  public FeeApplicableRange minimumRate(String minimumRate) {
    this.minimumRate = minimumRate;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeeApplicableRange {\n");
    
    sb.append("    maximumAmount: ").append(toIndentedString(maximumAmount)).append("\n");
    sb.append("    maximumRate: ").append(toIndentedString(maximumRate)).append("\n");
    sb.append("    minimumAmount: ").append(toIndentedString(minimumAmount)).append("\n");
    sb.append("    minimumRate: ").append(toIndentedString(minimumRate)).append("\n");
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

