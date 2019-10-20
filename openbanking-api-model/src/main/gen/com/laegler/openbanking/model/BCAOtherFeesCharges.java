package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.laegler.openbanking.model.BCAFeeChargeCap;
import com.laegler.openbanking.model.BCAFeeChargeDetail;
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
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class BCAOtherFeesCharges   {
  @JsonProperty("FeeChargeCap")
  @Valid
  private List<BCAFeeChargeCap> feeChargeCap = null;

  @JsonProperty("FeeChargeDetail")
  @Valid
  private List<BCAFeeChargeDetail> feeChargeDetail = new ArrayList<>();

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

  public BCAOtherFeesCharges feeChargeCap(List<BCAFeeChargeCap> feeChargeCap) {
    this.feeChargeCap = feeChargeCap;
    return this;
  }

  public BCAOtherFeesCharges addFeeChargeCapItem(BCAFeeChargeCap feeChargeCapItem) {
    if (this.feeChargeCap == null) {
      this.feeChargeCap = new ArrayList<>();
    }
    this.feeChargeCap.add(feeChargeCapItem);
    return this;
  }

  /**
   * Details about any caps (maximum charges) that apply to a particular or group of fee/charge
   * @return feeChargeCap
  **/
  @ApiModelProperty(value = "Details about any caps (maximum charges) that apply to a particular or group of fee/charge")

  @Valid

  public List<BCAFeeChargeCap> getFeeChargeCap() {
    return feeChargeCap;
  }

  public void setFeeChargeCap(List<BCAFeeChargeCap> feeChargeCap) {
    this.feeChargeCap = feeChargeCap;
  }

  public BCAOtherFeesCharges feeChargeDetail(List<BCAFeeChargeDetail> feeChargeDetail) {
    this.feeChargeDetail = feeChargeDetail;
    return this;
  }

  public BCAOtherFeesCharges addFeeChargeDetailItem(BCAFeeChargeDetail feeChargeDetailItem) {
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
  public List<BCAFeeChargeDetail> getFeeChargeDetail() {
    return feeChargeDetail;
  }

  public void setFeeChargeDetail(List<BCAFeeChargeDetail> feeChargeDetail) {
    this.feeChargeDetail = feeChargeDetail;
  }

  public BCAOtherFeesCharges otherTariffType(OtherTariffType otherTariffType) {
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

  public BCAOtherFeesCharges tariffName(String tariffName) {
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

  public BCAOtherFeesCharges tariffType(TariffTypeEnum tariffType) {
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
    BCAOtherFeesCharges bcAOtherFeesCharges = (BCAOtherFeesCharges) o;
    return Objects.equals(this.feeChargeCap, bcAOtherFeesCharges.feeChargeCap) &&
        Objects.equals(this.feeChargeDetail, bcAOtherFeesCharges.feeChargeDetail) &&
        Objects.equals(this.otherTariffType, bcAOtherFeesCharges.otherTariffType) &&
        Objects.equals(this.tariffName, bcAOtherFeesCharges.tariffName) &&
        Objects.equals(this.tariffType, bcAOtherFeesCharges.tariffType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeChargeCap, feeChargeDetail, otherTariffType, tariffName, tariffType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BCAOtherFeesCharges {\n");
    
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

