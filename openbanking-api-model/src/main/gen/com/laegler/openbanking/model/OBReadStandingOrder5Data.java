package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.OBStandingOrder5;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBReadStandingOrder5Data
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class OBReadStandingOrder5Data   {
  @JsonProperty("StandingOrder")
  @Valid
  private List<OBStandingOrder5> standingOrder = null;

  public OBReadStandingOrder5Data standingOrder(List<OBStandingOrder5> standingOrder) {
    this.standingOrder = standingOrder;
    return this;
  }

  public OBReadStandingOrder5Data addStandingOrderItem(OBStandingOrder5 standingOrderItem) {
    if (this.standingOrder == null) {
      this.standingOrder = new ArrayList<>();
    }
    this.standingOrder.add(standingOrderItem);
    return this;
  }

  /**
   * Get standingOrder
   * @return standingOrder
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<OBStandingOrder5> getStandingOrder() {
    return standingOrder;
  }

  public void setStandingOrder(List<OBStandingOrder5> standingOrder) {
    this.standingOrder = standingOrder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadStandingOrder5Data obReadStandingOrder5Data = (OBReadStandingOrder5Data) o;
    return Objects.equals(this.standingOrder, obReadStandingOrder5Data.standingOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(standingOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadStandingOrder5Data {\n");
    
    sb.append("    standingOrder: ").append(toIndentedString(standingOrder)).append("\n");
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

