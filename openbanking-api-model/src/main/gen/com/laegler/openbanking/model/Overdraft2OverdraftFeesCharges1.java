package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.Overdraft2OverdraftFeeChargeCap;
import com.laegler.openbanking.model.Overdraft2OverdraftFeeChargeDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Overdraft fees and charges
 */
@ApiModel(description = "Overdraft fees and charges")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class Overdraft2OverdraftFeesCharges1   {
  @JsonProperty("OverdraftFeeChargeCap")
  @Valid
  private List<Overdraft2OverdraftFeeChargeCap> overdraftFeeChargeCap = null;

  @JsonProperty("OverdraftFeeChargeDetail")
  @Valid
  private List<Overdraft2OverdraftFeeChargeDetail> overdraftFeeChargeDetail = new ArrayList<>();

  public Overdraft2OverdraftFeesCharges1 overdraftFeeChargeCap(List<Overdraft2OverdraftFeeChargeCap> overdraftFeeChargeCap) {
    this.overdraftFeeChargeCap = overdraftFeeChargeCap;
    return this;
  }

  public Overdraft2OverdraftFeesCharges1 addOverdraftFeeChargeCapItem(Overdraft2OverdraftFeeChargeCap overdraftFeeChargeCapItem) {
    if (this.overdraftFeeChargeCap == null) {
      this.overdraftFeeChargeCap = new ArrayList<>();
    }
    this.overdraftFeeChargeCap.add(overdraftFeeChargeCapItem);
    return this;
  }

  /**
   * Details about any caps (maximum charges) that apply to a particular fee/charge
   * @return overdraftFeeChargeCap
  **/
  @ApiModelProperty(value = "Details about any caps (maximum charges) that apply to a particular fee/charge")

  @Valid

  public List<Overdraft2OverdraftFeeChargeCap> getOverdraftFeeChargeCap() {
    return overdraftFeeChargeCap;
  }

  public void setOverdraftFeeChargeCap(List<Overdraft2OverdraftFeeChargeCap> overdraftFeeChargeCap) {
    this.overdraftFeeChargeCap = overdraftFeeChargeCap;
  }

  public Overdraft2OverdraftFeesCharges1 overdraftFeeChargeDetail(List<Overdraft2OverdraftFeeChargeDetail> overdraftFeeChargeDetail) {
    this.overdraftFeeChargeDetail = overdraftFeeChargeDetail;
    return this;
  }

  public Overdraft2OverdraftFeesCharges1 addOverdraftFeeChargeDetailItem(Overdraft2OverdraftFeeChargeDetail overdraftFeeChargeDetailItem) {
    this.overdraftFeeChargeDetail.add(overdraftFeeChargeDetailItem);
    return this;
  }

  /**
   * Details about the fees/charges
   * @return overdraftFeeChargeDetail
  **/
  @ApiModelProperty(required = true, value = "Details about the fees/charges")
  @NotNull

  @Valid
@Size(min=1) 
  public List<Overdraft2OverdraftFeeChargeDetail> getOverdraftFeeChargeDetail() {
    return overdraftFeeChargeDetail;
  }

  public void setOverdraftFeeChargeDetail(List<Overdraft2OverdraftFeeChargeDetail> overdraftFeeChargeDetail) {
    this.overdraftFeeChargeDetail = overdraftFeeChargeDetail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Overdraft2OverdraftFeesCharges1 overdraft2OverdraftFeesCharges1 = (Overdraft2OverdraftFeesCharges1) o;
    return Objects.equals(this.overdraftFeeChargeCap, overdraft2OverdraftFeesCharges1.overdraftFeeChargeCap) &&
        Objects.equals(this.overdraftFeeChargeDetail, overdraft2OverdraftFeesCharges1.overdraftFeeChargeDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overdraftFeeChargeCap, overdraftFeeChargeDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Overdraft2OverdraftFeesCharges1 {\n");
    
    sb.append("    overdraftFeeChargeCap: ").append(toIndentedString(overdraftFeeChargeCap)).append("\n");
    sb.append("    overdraftFeeChargeDetail: ").append(toIndentedString(overdraftFeeChargeDetail)).append("\n");
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

