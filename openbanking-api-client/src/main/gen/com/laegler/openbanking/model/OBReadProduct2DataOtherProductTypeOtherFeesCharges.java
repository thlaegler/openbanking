package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBReadProduct2DataOtherProductTypeFeeChargeCap;
import com.laegler.openbanking.model.OBReadProduct2DataOtherProductTypeFeeChargeDetail;
import com.laegler.openbanking.model.OBReadProduct2DataOtherProductTypeOtherTariffType;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;

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
public class OBReadProduct2DataOtherProductTypeOtherFeesCharges  {
  
  @ApiModelProperty(value = "")
  private List<OBReadProduct2DataOtherProductTypeFeeChargeCap> feeChargeCap = null;

  @ApiModelProperty(required = true, value = "")
  private List<OBReadProduct2DataOtherProductTypeFeeChargeDetail> feeChargeDetail = new ArrayList<OBReadProduct2DataOtherProductTypeFeeChargeDetail>();

  @ApiModelProperty(value = "")
  private OBReadProduct2DataOtherProductTypeOtherTariffType otherTariffType = null;

  @ApiModelProperty(value = "Name of the tariff")
 /**
   * Name of the tariff
  **/
  private String tariffName = null;


@XmlType(name="TariffTypeEnum")
@XmlEnum(String.class)
public enum TariffTypeEnum {

@XmlEnumValue("TTEL") TTEL(String.valueOf("TTEL")), @XmlEnumValue("TTMX") TTMX(String.valueOf("TTMX")), @XmlEnumValue("TTOT") TTOT(String.valueOf("TTOT"));


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
   * Get feeChargeCap
   * @return feeChargeCap
  **/
  @JsonProperty("FeeChargeCap")
  public List<OBReadProduct2DataOtherProductTypeFeeChargeCap> getFeeChargeCap() {
    return feeChargeCap;
  }

  public void setFeeChargeCap(List<OBReadProduct2DataOtherProductTypeFeeChargeCap> feeChargeCap) {
    this.feeChargeCap = feeChargeCap;
  }

  public OBReadProduct2DataOtherProductTypeOtherFeesCharges feeChargeCap(List<OBReadProduct2DataOtherProductTypeFeeChargeCap> feeChargeCap) {
    this.feeChargeCap = feeChargeCap;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeOtherFeesCharges addFeeChargeCapItem(OBReadProduct2DataOtherProductTypeFeeChargeCap feeChargeCapItem) {
    this.feeChargeCap.add(feeChargeCapItem);
    return this;
  }

 /**
   * Get feeChargeDetail
   * @return feeChargeDetail
  **/
  @JsonProperty("FeeChargeDetail")
  public List<OBReadProduct2DataOtherProductTypeFeeChargeDetail> getFeeChargeDetail() {
    return feeChargeDetail;
  }

  public void setFeeChargeDetail(List<OBReadProduct2DataOtherProductTypeFeeChargeDetail> feeChargeDetail) {
    this.feeChargeDetail = feeChargeDetail;
  }

  public OBReadProduct2DataOtherProductTypeOtherFeesCharges feeChargeDetail(List<OBReadProduct2DataOtherProductTypeFeeChargeDetail> feeChargeDetail) {
    this.feeChargeDetail = feeChargeDetail;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeOtherFeesCharges addFeeChargeDetailItem(OBReadProduct2DataOtherProductTypeFeeChargeDetail feeChargeDetailItem) {
    this.feeChargeDetail.add(feeChargeDetailItem);
    return this;
  }

 /**
   * Get otherTariffType
   * @return otherTariffType
  **/
  @JsonProperty("OtherTariffType")
  public OBReadProduct2DataOtherProductTypeOtherTariffType getOtherTariffType() {
    return otherTariffType;
  }

  public void setOtherTariffType(OBReadProduct2DataOtherProductTypeOtherTariffType otherTariffType) {
    this.otherTariffType = otherTariffType;
  }

  public OBReadProduct2DataOtherProductTypeOtherFeesCharges otherTariffType(OBReadProduct2DataOtherProductTypeOtherTariffType otherTariffType) {
    this.otherTariffType = otherTariffType;
    return this;
  }

 /**
   * Name of the tariff
   * @return tariffName
  **/
  @JsonProperty("TariffName")
  public String getTariffName() {
    return tariffName;
  }

  public void setTariffName(String tariffName) {
    this.tariffName = tariffName;
  }

  public OBReadProduct2DataOtherProductTypeOtherFeesCharges tariffName(String tariffName) {
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

  public OBReadProduct2DataOtherProductTypeOtherFeesCharges tariffType(TariffTypeEnum tariffType) {
    this.tariffType = tariffType;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataOtherProductTypeOtherFeesCharges {\n");
    
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

