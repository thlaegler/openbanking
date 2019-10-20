package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.OBStandingOrder4;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBReadStandingOrder4Data
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class OBReadStandingOrder4Data   {
  @JsonProperty("StandingOrder")
  @Valid
  private List<OBStandingOrder4> standingOrder = null;

  public OBReadStandingOrder4Data standingOrder(List<OBStandingOrder4> standingOrder) {
    this.standingOrder = standingOrder;
    return this;
  }

  public OBReadStandingOrder4Data addStandingOrderItem(OBStandingOrder4 standingOrderItem) {
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

  public List<OBStandingOrder4> getStandingOrder() {
    return standingOrder;
  }

  public void setStandingOrder(List<OBStandingOrder4> standingOrder) {
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
    OBReadStandingOrder4Data obReadStandingOrder4Data = (OBReadStandingOrder4Data) o;
    return Objects.equals(this.standingOrder, obReadStandingOrder4Data.standingOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(standingOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadStandingOrder4Data {\n");
    
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

