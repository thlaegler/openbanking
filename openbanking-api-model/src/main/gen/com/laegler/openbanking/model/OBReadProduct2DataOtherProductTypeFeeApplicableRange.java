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
 * Range or amounts or rates for which the fee/charge applies
 */
@ApiModel(description = "Range or amounts or rates for which the fee/charge applies")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class OBReadProduct2DataOtherProductTypeFeeApplicableRange   {
  @JsonProperty("MaximumAmount")
  private String maximumAmount = null;

  @JsonProperty("MaximumRate")
  private String maximumRate = null;

  @JsonProperty("MinimumAmount")
  private String minimumAmount = null;

  @JsonProperty("MinimumRate")
  private String minimumRate = null;

  public OBReadProduct2DataOtherProductTypeFeeApplicableRange maximumAmount(String maximumAmount) {
    this.maximumAmount = maximumAmount;
    return this;
  }

  /**
   * Maximum Amount on which fee is applicable (where it is expressed as an amount)
   * @return maximumAmount
  **/
  @ApiModelProperty(value = "Maximum Amount on which fee is applicable (where it is expressed as an amount)")

@Pattern(regexp="^(-?\\\\d{1,14}){1}(\\\\.\\\\d{1,4}){0,1}$") 
  public String getMaximumAmount() {
    return maximumAmount;
  }

  public void setMaximumAmount(String maximumAmount) {
    this.maximumAmount = maximumAmount;
  }

  public OBReadProduct2DataOtherProductTypeFeeApplicableRange maximumRate(String maximumRate) {
    this.maximumRate = maximumRate;
    return this;
  }

  /**
   * Maximum rate on which fee/charge is applicable(where it is expressed as an rate)
   * @return maximumRate
  **/
  @ApiModelProperty(value = "Maximum rate on which fee/charge is applicable(where it is expressed as an rate)")

@Pattern(regexp="^(-?\\\\d{1,3}){1}(\\\\.\\\\d{1,4}){0,1}$") 
  public String getMaximumRate() {
    return maximumRate;
  }

  public void setMaximumRate(String maximumRate) {
    this.maximumRate = maximumRate;
  }

  public OBReadProduct2DataOtherProductTypeFeeApplicableRange minimumAmount(String minimumAmount) {
    this.minimumAmount = minimumAmount;
    return this;
  }

  /**
   * Minimum Amount on which fee/charge is applicable (where it is expressed as an amount)
   * @return minimumAmount
  **/
  @ApiModelProperty(value = "Minimum Amount on which fee/charge is applicable (where it is expressed as an amount)")

@Pattern(regexp="^(-?\\\\d{1,14}){1}(\\\\.\\\\d{1,4}){0,1}$") 
  public String getMinimumAmount() {
    return minimumAmount;
  }

  public void setMinimumAmount(String minimumAmount) {
    this.minimumAmount = minimumAmount;
  }

  public OBReadProduct2DataOtherProductTypeFeeApplicableRange minimumRate(String minimumRate) {
    this.minimumRate = minimumRate;
    return this;
  }

  /**
   * Minimum rate on which fee/charge is applicable(where it is expressed as an rate)
   * @return minimumRate
  **/
  @ApiModelProperty(value = "Minimum rate on which fee/charge is applicable(where it is expressed as an rate)")

@Pattern(regexp="^(-?\\\\d{1,3}){1}(\\\\.\\\\d{1,4}){0,1}$") 
  public String getMinimumRate() {
    return minimumRate;
  }

  public void setMinimumRate(String minimumRate) {
    this.minimumRate = minimumRate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadProduct2DataOtherProductTypeFeeApplicableRange obReadProduct2DataOtherProductTypeFeeApplicableRange = (OBReadProduct2DataOtherProductTypeFeeApplicableRange) o;
    return Objects.equals(this.maximumAmount, obReadProduct2DataOtherProductTypeFeeApplicableRange.maximumAmount) &&
        Objects.equals(this.maximumRate, obReadProduct2DataOtherProductTypeFeeApplicableRange.maximumRate) &&
        Objects.equals(this.minimumAmount, obReadProduct2DataOtherProductTypeFeeApplicableRange.minimumAmount) &&
        Objects.equals(this.minimumRate, obReadProduct2DataOtherProductTypeFeeApplicableRange.minimumRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maximumAmount, maximumRate, minimumAmount, minimumRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataOtherProductTypeFeeApplicableRange {\n");
    
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
