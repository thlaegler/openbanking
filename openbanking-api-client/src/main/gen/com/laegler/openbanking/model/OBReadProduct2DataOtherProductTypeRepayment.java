package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBReadProduct2DataOtherProductTypeRepaymentOtherAmountType;
import com.laegler.openbanking.model.OBReadProduct2DataOtherProductTypeRepaymentOtherRepaymentFrequency;
import com.laegler.openbanking.model.OBReadProduct2DataOtherProductTypeRepaymentOtherRepaymentType;
import com.laegler.openbanking.model.OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeCharges;
import com.laegler.openbanking.model.OBReadProduct2DataOtherProductTypeRepaymentRepaymentHoliday;
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
  * Repayment details of the Loan product
 **/
@ApiModel(description="Repayment details of the Loan product")
public class OBReadProduct2DataOtherProductTypeRepayment  {
  

@XmlType(name="AmountTypeEnum")
@XmlEnum(String.class)
public enum AmountTypeEnum {

@XmlEnumValue("RABD") RABD(String.valueOf("RABD")), @XmlEnumValue("RABL") RABL(String.valueOf("RABL")), @XmlEnumValue("RACI") RACI(String.valueOf("RACI")), @XmlEnumValue("RAFC") RAFC(String.valueOf("RAFC")), @XmlEnumValue("RAIO") RAIO(String.valueOf("RAIO")), @XmlEnumValue("RALT") RALT(String.valueOf("RALT")), @XmlEnumValue("USOT") USOT(String.valueOf("USOT"));


    private String value;

    AmountTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AmountTypeEnum fromValue(String v) {
        for (AmountTypeEnum b : AmountTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "The repayment is for paying just the interest only or both interest and capital or bullet amount or balance to date etc")
 /**
   * The repayment is for paying just the interest only or both interest and capital or bullet amount or balance to date etc
  **/
  private AmountTypeEnum amountType = null;

  @ApiModelProperty(value = "")
  private List<String> notes = null;

  @ApiModelProperty(value = "")
  private OBReadProduct2DataOtherProductTypeRepaymentOtherAmountType otherAmountType = null;

  @ApiModelProperty(value = "")
  private OBReadProduct2DataOtherProductTypeRepaymentOtherRepaymentFrequency otherRepaymentFrequency = null;

  @ApiModelProperty(value = "")
  private OBReadProduct2DataOtherProductTypeRepaymentOtherRepaymentType otherRepaymentType = null;

  @ApiModelProperty(value = "")
  private OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeCharges repaymentFeeCharges = null;


@XmlType(name="RepaymentFrequencyEnum")
@XmlEnum(String.class)
public enum RepaymentFrequencyEnum {

@XmlEnumValue("SMDA") SMDA(String.valueOf("SMDA")), @XmlEnumValue("SMFL") SMFL(String.valueOf("SMFL")), @XmlEnumValue("SMFO") SMFO(String.valueOf("SMFO")), @XmlEnumValue("SMHY") SMHY(String.valueOf("SMHY")), @XmlEnumValue("SMMO") SMMO(String.valueOf("SMMO")), @XmlEnumValue("SMOT") SMOT(String.valueOf("SMOT")), @XmlEnumValue("SMQU") SMQU(String.valueOf("SMQU")), @XmlEnumValue("SMWE") SMWE(String.valueOf("SMWE")), @XmlEnumValue("SMYE") SMYE(String.valueOf("SMYE"));


    private String value;

    RepaymentFrequencyEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static RepaymentFrequencyEnum fromValue(String v) {
        for (RepaymentFrequencyEnum b : RepaymentFrequencyEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Repayment frequency")
 /**
   * Repayment frequency
  **/
  private RepaymentFrequencyEnum repaymentFrequency = null;

  @ApiModelProperty(value = "")
  private List<OBReadProduct2DataOtherProductTypeRepaymentRepaymentHoliday> repaymentHoliday = null;


@XmlType(name="RepaymentTypeEnum")
@XmlEnum(String.class)
public enum RepaymentTypeEnum {

@XmlEnumValue("USBA") USBA(String.valueOf("USBA")), @XmlEnumValue("USBU") USBU(String.valueOf("USBU")), @XmlEnumValue("USCI") USCI(String.valueOf("USCI")), @XmlEnumValue("USCS") USCS(String.valueOf("USCS")), @XmlEnumValue("USER") USER(String.valueOf("USER")), @XmlEnumValue("USFA") USFA(String.valueOf("USFA")), @XmlEnumValue("USFB") USFB(String.valueOf("USFB")), @XmlEnumValue("USFI") USFI(String.valueOf("USFI")), @XmlEnumValue("USIO") USIO(String.valueOf("USIO")), @XmlEnumValue("USOT") USOT(String.valueOf("USOT")), @XmlEnumValue("USPF") USPF(String.valueOf("USPF")), @XmlEnumValue("USRW") USRW(String.valueOf("USRW")), @XmlEnumValue("USSL") USSL(String.valueOf("USSL"));


    private String value;

    RepaymentTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static RepaymentTypeEnum fromValue(String v) {
        for (RepaymentTypeEnum b : RepaymentTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Repayment type")
 /**
   * Repayment type
  **/
  private RepaymentTypeEnum repaymentType = null;
 /**
   * The repayment is for paying just the interest only or both interest and capital or bullet amount or balance to date etc
   * @return amountType
  **/
  @JsonProperty("AmountType")
  public String getAmountType() {
    if (amountType == null) {
      return null;
    }
    return amountType.value();
  }

  public void setAmountType(AmountTypeEnum amountType) {
    this.amountType = amountType;
  }

  public OBReadProduct2DataOtherProductTypeRepayment amountType(AmountTypeEnum amountType) {
    this.amountType = amountType;
    return this;
  }

 /**
   * Get notes
   * @return notes
  **/
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public OBReadProduct2DataOtherProductTypeRepayment notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeRepayment addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Get otherAmountType
   * @return otherAmountType
  **/
  @JsonProperty("OtherAmountType")
  public OBReadProduct2DataOtherProductTypeRepaymentOtherAmountType getOtherAmountType() {
    return otherAmountType;
  }

  public void setOtherAmountType(OBReadProduct2DataOtherProductTypeRepaymentOtherAmountType otherAmountType) {
    this.otherAmountType = otherAmountType;
  }

  public OBReadProduct2DataOtherProductTypeRepayment otherAmountType(OBReadProduct2DataOtherProductTypeRepaymentOtherAmountType otherAmountType) {
    this.otherAmountType = otherAmountType;
    return this;
  }

 /**
   * Get otherRepaymentFrequency
   * @return otherRepaymentFrequency
  **/
  @JsonProperty("OtherRepaymentFrequency")
  public OBReadProduct2DataOtherProductTypeRepaymentOtherRepaymentFrequency getOtherRepaymentFrequency() {
    return otherRepaymentFrequency;
  }

  public void setOtherRepaymentFrequency(OBReadProduct2DataOtherProductTypeRepaymentOtherRepaymentFrequency otherRepaymentFrequency) {
    this.otherRepaymentFrequency = otherRepaymentFrequency;
  }

  public OBReadProduct2DataOtherProductTypeRepayment otherRepaymentFrequency(OBReadProduct2DataOtherProductTypeRepaymentOtherRepaymentFrequency otherRepaymentFrequency) {
    this.otherRepaymentFrequency = otherRepaymentFrequency;
    return this;
  }

 /**
   * Get otherRepaymentType
   * @return otherRepaymentType
  **/
  @JsonProperty("OtherRepaymentType")
  public OBReadProduct2DataOtherProductTypeRepaymentOtherRepaymentType getOtherRepaymentType() {
    return otherRepaymentType;
  }

  public void setOtherRepaymentType(OBReadProduct2DataOtherProductTypeRepaymentOtherRepaymentType otherRepaymentType) {
    this.otherRepaymentType = otherRepaymentType;
  }

  public OBReadProduct2DataOtherProductTypeRepayment otherRepaymentType(OBReadProduct2DataOtherProductTypeRepaymentOtherRepaymentType otherRepaymentType) {
    this.otherRepaymentType = otherRepaymentType;
    return this;
  }

 /**
   * Get repaymentFeeCharges
   * @return repaymentFeeCharges
  **/
  @JsonProperty("RepaymentFeeCharges")
  public OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeCharges getRepaymentFeeCharges() {
    return repaymentFeeCharges;
  }

  public void setRepaymentFeeCharges(OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeCharges repaymentFeeCharges) {
    this.repaymentFeeCharges = repaymentFeeCharges;
  }

  public OBReadProduct2DataOtherProductTypeRepayment repaymentFeeCharges(OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeCharges repaymentFeeCharges) {
    this.repaymentFeeCharges = repaymentFeeCharges;
    return this;
  }

 /**
   * Repayment frequency
   * @return repaymentFrequency
  **/
  @JsonProperty("RepaymentFrequency")
  public String getRepaymentFrequency() {
    if (repaymentFrequency == null) {
      return null;
    }
    return repaymentFrequency.value();
  }

  public void setRepaymentFrequency(RepaymentFrequencyEnum repaymentFrequency) {
    this.repaymentFrequency = repaymentFrequency;
  }

  public OBReadProduct2DataOtherProductTypeRepayment repaymentFrequency(RepaymentFrequencyEnum repaymentFrequency) {
    this.repaymentFrequency = repaymentFrequency;
    return this;
  }

 /**
   * Get repaymentHoliday
   * @return repaymentHoliday
  **/
  @JsonProperty("RepaymentHoliday")
  public List<OBReadProduct2DataOtherProductTypeRepaymentRepaymentHoliday> getRepaymentHoliday() {
    return repaymentHoliday;
  }

  public void setRepaymentHoliday(List<OBReadProduct2DataOtherProductTypeRepaymentRepaymentHoliday> repaymentHoliday) {
    this.repaymentHoliday = repaymentHoliday;
  }

  public OBReadProduct2DataOtherProductTypeRepayment repaymentHoliday(List<OBReadProduct2DataOtherProductTypeRepaymentRepaymentHoliday> repaymentHoliday) {
    this.repaymentHoliday = repaymentHoliday;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeRepayment addRepaymentHolidayItem(OBReadProduct2DataOtherProductTypeRepaymentRepaymentHoliday repaymentHolidayItem) {
    this.repaymentHoliday.add(repaymentHolidayItem);
    return this;
  }

 /**
   * Repayment type
   * @return repaymentType
  **/
  @JsonProperty("RepaymentType")
  public String getRepaymentType() {
    if (repaymentType == null) {
      return null;
    }
    return repaymentType.value();
  }

  public void setRepaymentType(RepaymentTypeEnum repaymentType) {
    this.repaymentType = repaymentType;
  }

  public OBReadProduct2DataOtherProductTypeRepayment repaymentType(RepaymentTypeEnum repaymentType) {
    this.repaymentType = repaymentType;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataOtherProductTypeRepayment {\n");
    
    sb.append("    amountType: ").append(toIndentedString(amountType)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherAmountType: ").append(toIndentedString(otherAmountType)).append("\n");
    sb.append("    otherRepaymentFrequency: ").append(toIndentedString(otherRepaymentFrequency)).append("\n");
    sb.append("    otherRepaymentType: ").append(toIndentedString(otherRepaymentType)).append("\n");
    sb.append("    repaymentFeeCharges: ").append(toIndentedString(repaymentFeeCharges)).append("\n");
    sb.append("    repaymentFrequency: ").append(toIndentedString(repaymentFrequency)).append("\n");
    sb.append("    repaymentHoliday: ").append(toIndentedString(repaymentHoliday)).append("\n");
    sb.append("    repaymentType: ").append(toIndentedString(repaymentType)).append("\n");
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

