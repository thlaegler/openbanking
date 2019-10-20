package com.laegler.openbanking.model;

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
  * Details of capital repayment holiday if any
 **/
@ApiModel(description="Details of capital repayment holiday if any")
public class OBReadProduct2DataOtherProductTypeRepaymentRepaymentHoliday  {
  
  @ApiModelProperty(value = "The maximum length/duration of a Repayment Holiday")
 /**
   * The maximum length/duration of a Repayment Holiday
  **/
  private Integer maxHolidayLength = null;


@XmlType(name="MaxHolidayPeriodEnum")
@XmlEnum(String.class)
public enum MaxHolidayPeriodEnum {

@XmlEnumValue("PACT") PACT(String.valueOf("PACT")), @XmlEnumValue("PDAY") PDAY(String.valueOf("PDAY")), @XmlEnumValue("PHYR") PHYR(String.valueOf("PHYR")), @XmlEnumValue("PMTH") PMTH(String.valueOf("PMTH")), @XmlEnumValue("PQTR") PQTR(String.valueOf("PQTR")), @XmlEnumValue("PWEK") PWEK(String.valueOf("PWEK")), @XmlEnumValue("PYER") PYER(String.valueOf("PYER"));


    private String value;

    MaxHolidayPeriodEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static MaxHolidayPeriodEnum fromValue(String v) {
        for (MaxHolidayPeriodEnum b : MaxHolidayPeriodEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "The unit of period (days, weeks, months etc.) of the repayment holiday")
 /**
   * The unit of period (days, weeks, months etc.) of the repayment holiday
  **/
  private MaxHolidayPeriodEnum maxHolidayPeriod = null;

  @ApiModelProperty(value = "")
  private List<String> notes = null;
 /**
   * The maximum length/duration of a Repayment Holiday
   * @return maxHolidayLength
  **/
  @JsonProperty("MaxHolidayLength")
  public Integer getMaxHolidayLength() {
    return maxHolidayLength;
  }

  public void setMaxHolidayLength(Integer maxHolidayLength) {
    this.maxHolidayLength = maxHolidayLength;
  }

  public OBReadProduct2DataOtherProductTypeRepaymentRepaymentHoliday maxHolidayLength(Integer maxHolidayLength) {
    this.maxHolidayLength = maxHolidayLength;
    return this;
  }

 /**
   * The unit of period (days, weeks, months etc.) of the repayment holiday
   * @return maxHolidayPeriod
  **/
  @JsonProperty("MaxHolidayPeriod")
  public String getMaxHolidayPeriod() {
    if (maxHolidayPeriod == null) {
      return null;
    }
    return maxHolidayPeriod.value();
  }

  public void setMaxHolidayPeriod(MaxHolidayPeriodEnum maxHolidayPeriod) {
    this.maxHolidayPeriod = maxHolidayPeriod;
  }

  public OBReadProduct2DataOtherProductTypeRepaymentRepaymentHoliday maxHolidayPeriod(MaxHolidayPeriodEnum maxHolidayPeriod) {
    this.maxHolidayPeriod = maxHolidayPeriod;
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

  public OBReadProduct2DataOtherProductTypeRepaymentRepaymentHoliday notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeRepaymentRepaymentHoliday addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataOtherProductTypeRepaymentRepaymentHoliday {\n");
    
    sb.append("    maxHolidayLength: ").append(toIndentedString(maxHolidayLength)).append("\n");
    sb.append("    maxHolidayPeriod: ").append(toIndentedString(maxHolidayPeriod)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

