package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.OtherFeesCharges1FeeChargeCap;
import com.laegler.openbanking.model.OtherFeesCharges1FeeChargeDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains details of fees and charges which are not associated with either borrowing or features/benefits
 */
@ApiModel(description = "Contains details of fees and charges which are not associated with either borrowing or features/benefits")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class OtherFeesCharges1   {
  @JsonProperty("FeeChargeCap")
  @Valid
  private List<OtherFeesCharges1FeeChargeCap> feeChargeCap = null;

  @JsonProperty("FeeChargeDetail")
  @Valid
  private List<OtherFeesCharges1FeeChargeDetail> feeChargeDetail = new ArrayList<>();

  public OtherFeesCharges1 feeChargeCap(List<OtherFeesCharges1FeeChargeCap> feeChargeCap) {
    this.feeChargeCap = feeChargeCap;
    return this;
  }

  public OtherFeesCharges1 addFeeChargeCapItem(OtherFeesCharges1FeeChargeCap feeChargeCapItem) {
    if (this.feeChargeCap == null) {
      this.feeChargeCap = new ArrayList<>();
    }
    this.feeChargeCap.add(feeChargeCapItem);
    return this;
  }

  /**
   * Details about any caps (maximum charges) that apply to a particular fee/charge
   * @return feeChargeCap
  **/
  @ApiModelProperty(value = "Details about any caps (maximum charges) that apply to a particular fee/charge")

  @Valid

  public List<OtherFeesCharges1FeeChargeCap> getFeeChargeCap() {
    return feeChargeCap;
  }

  public void setFeeChargeCap(List<OtherFeesCharges1FeeChargeCap> feeChargeCap) {
    this.feeChargeCap = feeChargeCap;
  }

  public OtherFeesCharges1 feeChargeDetail(List<OtherFeesCharges1FeeChargeDetail> feeChargeDetail) {
    this.feeChargeDetail = feeChargeDetail;
    return this;
  }

  public OtherFeesCharges1 addFeeChargeDetailItem(OtherFeesCharges1FeeChargeDetail feeChargeDetailItem) {
    this.feeChargeDetail.add(feeChargeDetailItem);
    return this;
  }

  /**
   * Other fees/charges details
   * @return feeChargeDetail
  **/
  @ApiModelProperty(required = true, value = "Other fees/charges details")
  @NotNull

  @Valid
@Size(min=1) 
  public List<OtherFeesCharges1FeeChargeDetail> getFeeChargeDetail() {
    return feeChargeDetail;
  }

  public void setFeeChargeDetail(List<OtherFeesCharges1FeeChargeDetail> feeChargeDetail) {
    this.feeChargeDetail = feeChargeDetail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OtherFeesCharges1 otherFeesCharges1 = (OtherFeesCharges1) o;
    return Objects.equals(this.feeChargeCap, otherFeesCharges1.feeChargeCap) &&
        Objects.equals(this.feeChargeDetail, otherFeesCharges1.feeChargeDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeChargeCap, feeChargeDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtherFeesCharges1 {\n");
    
    sb.append("    feeChargeCap: ").append(toIndentedString(feeChargeCap)).append("\n");
    sb.append("    feeChargeDetail: ").append(toIndentedString(feeChargeDetail)).append("\n");
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

