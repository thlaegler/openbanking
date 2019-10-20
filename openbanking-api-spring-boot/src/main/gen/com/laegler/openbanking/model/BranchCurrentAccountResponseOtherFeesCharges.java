package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.laegler.openbanking.model.BranchCurrentAccountResponseFeeChargeCap;
import com.laegler.openbanking.model.BranchCurrentAccountResponseFeeChargeDetail;
import com.laegler.openbanking.model.OtherTariffType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains details of fees and charges which are not associated with either Overdraft or features/benefits
 */
@ApiModel(description = "Contains details of fees and charges which are not associated with either Overdraft or features/benefits")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class BranchCurrentAccountResponseOtherFeesCharges   {
  @JsonProperty("FeeChargeCap")
  @Valid
  private List<BranchCurrentAccountResponseFeeChargeCap> feeChargeCap = null;

  @JsonProperty("FeeChargeDetail")
  @Valid
  private List<BranchCurrentAccountResponseFeeChargeDetail> feeChargeDetail = new ArrayList<>();

  @JsonProperty("OtherTariffType")
  private OtherTariffType otherTariffType = null;

  @JsonProperty("TariffName")
  private String tariffName = null;

  /**
   * TariffType which defines the fee and charges.
   */
  public enum TariffTypeEnum {
    ELECTRONIC("Electronic"),
    
    MIXED("Mixed"),
    
    OTHER("Other");

    private String value;

    TariffTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TariffTypeEnum fromValue(String text) {
      for (TariffTypeEnum b : TariffTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("TariffType")
  private TariffTypeEnum tariffType = null;

  public BranchCurrentAccountResponseOtherFeesCharges feeChargeCap(List<BranchCurrentAccountResponseFeeChargeCap> feeChargeCap) {
    this.feeChargeCap = feeChargeCap;
    return this;
  }

  public BranchCurrentAccountResponseOtherFeesCharges addFeeChargeCapItem(BranchCurrentAccountResponseFeeChargeCap feeChargeCapItem) {
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

  public List<BranchCurrentAccountResponseFeeChargeCap> getFeeChargeCap() {
    return feeChargeCap;
  }

  public void setFeeChargeCap(List<BranchCurrentAccountResponseFeeChargeCap> feeChargeCap) {
    this.feeChargeCap = feeChargeCap;
  }

  public BranchCurrentAccountResponseOtherFeesCharges feeChargeDetail(List<BranchCurrentAccountResponseFeeChargeDetail> feeChargeDetail) {
    this.feeChargeDetail = feeChargeDetail;
    return this;
  }

  public BranchCurrentAccountResponseOtherFeesCharges addFeeChargeDetailItem(BranchCurrentAccountResponseFeeChargeDetail feeChargeDetailItem) {
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
  public List<BranchCurrentAccountResponseFeeChargeDetail> getFeeChargeDetail() {
    return feeChargeDetail;
  }

  public void setFeeChargeDetail(List<BranchCurrentAccountResponseFeeChargeDetail> feeChargeDetail) {
    this.feeChargeDetail = feeChargeDetail;
  }

  public BranchCurrentAccountResponseOtherFeesCharges otherTariffType(OtherTariffType otherTariffType) {
    this.otherTariffType = otherTariffType;
    return this;
  }

  /**
   * Get otherTariffType
   * @return otherTariffType
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OtherTariffType getOtherTariffType() {
    return otherTariffType;
  }

  public void setOtherTariffType(OtherTariffType otherTariffType) {
    this.otherTariffType = otherTariffType;
  }

  public BranchCurrentAccountResponseOtherFeesCharges tariffName(String tariffName) {
    this.tariffName = tariffName;
    return this;
  }

  /**
   * Name of the tariff
   * @return tariffName
  **/
  @ApiModelProperty(value = "Name of the tariff")

@Size(min=1,max=350) 
  public String getTariffName() {
    return tariffName;
  }

  public void setTariffName(String tariffName) {
    this.tariffName = tariffName;
  }

  public BranchCurrentAccountResponseOtherFeesCharges tariffType(TariffTypeEnum tariffType) {
    this.tariffType = tariffType;
    return this;
  }

  /**
   * TariffType which defines the fee and charges.
   * @return tariffType
  **/
  @ApiModelProperty(value = "TariffType which defines the fee and charges.")


  public TariffTypeEnum getTariffType() {
    return tariffType;
  }

  public void setTariffType(TariffTypeEnum tariffType) {
    this.tariffType = tariffType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BranchCurrentAccountResponseOtherFeesCharges branchCurrentAccountResponseOtherFeesCharges = (BranchCurrentAccountResponseOtherFeesCharges) o;
    return Objects.equals(this.feeChargeCap, branchCurrentAccountResponseOtherFeesCharges.feeChargeCap) &&
        Objects.equals(this.feeChargeDetail, branchCurrentAccountResponseOtherFeesCharges.feeChargeDetail) &&
        Objects.equals(this.otherTariffType, branchCurrentAccountResponseOtherFeesCharges.otherTariffType) &&
        Objects.equals(this.tariffName, branchCurrentAccountResponseOtherFeesCharges.tariffName) &&
        Objects.equals(this.tariffType, branchCurrentAccountResponseOtherFeesCharges.tariffType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeChargeCap, feeChargeDetail, otherTariffType, tariffName, tariffType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BranchCurrentAccountResponseOtherFeesCharges {\n");
    
    sb.append("    feeChargeCap: ").append(toIndentedString(feeChargeCap)).append("\n");
    sb.append("    feeChargeDetail: ").append(toIndentedString(feeChargeDetail)).append("\n");
    sb.append("    otherTariffType: ").append(toIndentedString(otherTariffType)).append("\n");
    sb.append("    tariffName: ").append(toIndentedString(tariffName)).append("\n");
    sb.append("    tariffType: ").append(toIndentedString(tariffType)).append("\n");
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

