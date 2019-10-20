package com.laegler.openbanking.model;

import com.laegler.openbanking.model.BranchCurrentAccountResponseFeeChargeCap;
import com.laegler.openbanking.model.BranchCurrentAccountResponseFeeChargeDetail;
import com.laegler.openbanking.model.OtherTariffType;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
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
  * Contains details of fees and charges which are not associated with either Overdraft or features/benefits
 **/
@ApiModel(description="Contains details of fees and charges which are not associated with either Overdraft or features/benefits")
public class BranchCurrentAccountResponseOtherFeesCharges  {
  
  @ApiModelProperty(value = "Details about any caps (maximum charges) that apply to a particular fee/charge")
  @Valid
 /**
   * Details about any caps (maximum charges) that apply to a particular fee/charge
  **/
  private List<BranchCurrentAccountResponseFeeChargeCap> feeChargeCap = null;

  @ApiModelProperty(required = true, value = "Other fees/charges details")
  @Valid
 /**
   * Other fees/charges details
  **/
  private List<BranchCurrentAccountResponseFeeChargeDetail> feeChargeDetail = new ArrayList<BranchCurrentAccountResponseFeeChargeDetail>();

  @ApiModelProperty(value = "")
  @Valid
  private OtherTariffType otherTariffType = null;

  @ApiModelProperty(value = "Name of the tariff")
 /**
   * Name of the tariff
  **/
  private String tariffName = null;


@XmlType(name="TariffTypeEnum")
@XmlEnum(String.class)
public enum TariffTypeEnum {

@XmlEnumValue("Electronic") ELECTRONIC(String.valueOf("Electronic")), @XmlEnumValue("Mixed") MIXED(String.valueOf("Mixed")), @XmlEnumValue("Other") OTHER(String.valueOf("Other"));


    private String value;

    TariffTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TariffTypeEnum fromValue(String v) {
        for (TariffTypeEnum b : TariffTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "TariffType which defines the fee and charges.")
 /**
   * TariffType which defines the fee and charges.
  **/
  private TariffTypeEnum tariffType = null;
 /**
   * Details about any caps (maximum charges) that apply to a particular fee/charge
   * @return feeChargeCap
  **/
  @JsonProperty("FeeChargeCap")
  public List<BranchCurrentAccountResponseFeeChargeCap> getFeeChargeCap() {
    return feeChargeCap;
  }

  public void setFeeChargeCap(List<BranchCurrentAccountResponseFeeChargeCap> feeChargeCap) {
    this.feeChargeCap = feeChargeCap;
  }

  public BranchCurrentAccountResponseOtherFeesCharges feeChargeCap(List<BranchCurrentAccountResponseFeeChargeCap> feeChargeCap) {
    this.feeChargeCap = feeChargeCap;
    return this;
  }

  public BranchCurrentAccountResponseOtherFeesCharges addFeeChargeCapItem(BranchCurrentAccountResponseFeeChargeCap feeChargeCapItem) {
    this.feeChargeCap.add(feeChargeCapItem);
    return this;
  }

 /**
   * Other fees/charges details
   * @return feeChargeDetail
  **/
  @JsonProperty("FeeChargeDetail")
  @NotNull
 @Size(min=1)  public List<BranchCurrentAccountResponseFeeChargeDetail> getFeeChargeDetail() {
    return feeChargeDetail;
  }

  public void setFeeChargeDetail(List<BranchCurrentAccountResponseFeeChargeDetail> feeChargeDetail) {
    this.feeChargeDetail = feeChargeDetail;
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
   * Get otherTariffType
   * @return otherTariffType
  **/
  @JsonProperty("OtherTariffType")
  public OtherTariffType getOtherTariffType() {
    return otherTariffType;
  }

  public void setOtherTariffType(OtherTariffType otherTariffType) {
    this.otherTariffType = otherTariffType;
  }

  public BranchCurrentAccountResponseOtherFeesCharges otherTariffType(OtherTariffType otherTariffType) {
    this.otherTariffType = otherTariffType;
    return this;
  }

 /**
   * Name of the tariff
   * @return tariffName
  **/
  @JsonProperty("TariffName")
 @Size(min=1,max=350)  public String getTariffName() {
    return tariffName;
  }

  public void setTariffName(String tariffName) {
    this.tariffName = tariffName;
  }

  public BranchCurrentAccountResponseOtherFeesCharges tariffName(String tariffName) {
    this.tariffName = tariffName;
    return this;
  }

 /**
   * TariffType which defines the fee and charges.
   * @return tariffType
  **/
  @JsonProperty("TariffType")
  public String getTariffType() {
    if (tariffType == null) {
      return null;
    }
    return tariffType.value();
  }

  public void setTariffType(TariffTypeEnum tariffType) {
    this.tariffType = tariffType;
  }

  public BranchCurrentAccountResponseOtherFeesCharges tariffType(TariffTypeEnum tariffType) {
    this.tariffType = tariffType;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

