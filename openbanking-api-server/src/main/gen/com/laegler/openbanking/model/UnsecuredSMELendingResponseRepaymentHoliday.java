package com.laegler.openbanking.model;

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
  * Details of capital repayment holiday if any
 **/
@ApiModel(description="Details of capital repayment holiday if any")
public class UnsecuredSMELendingResponseRepaymentHoliday  {
  
  @ApiModelProperty(value = "The maximum length/duration of a Repayment Holiday")
 /**
   * The maximum length/duration of a Repayment Holiday
  **/
  private Float maxHolidayLength = null;


@XmlType(name="MaxHolidayPeriodEnum")
@XmlEnum(String.class)
public enum MaxHolidayPeriodEnum {

@XmlEnumValue("Day") DAY(String.valueOf("Day")), @XmlEnumValue("Half Year") HALF_YEAR(String.valueOf("Half Year")), @XmlEnumValue("Month") MONTH(String.valueOf("Month")), @XmlEnumValue("Quarter") QUARTER(String.valueOf("Quarter")), @XmlEnumValue("Week") WEEK(String.valueOf("Week")), @XmlEnumValue("Year") YEAR(String.valueOf("Year"));


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

  @ApiModelProperty(value = "Free text for adding details for repayment holiday")
 /**
   * Free text for adding details for repayment holiday
  **/
  private List<String> notes = null;
 /**
   * The maximum length/duration of a Repayment Holiday
   * @return maxHolidayLength
  **/
  @JsonProperty("MaxHolidayLength")
  public Float getMaxHolidayLength() {
    return maxHolidayLength;
  }

  public void setMaxHolidayLength(Float maxHolidayLength) {
    this.maxHolidayLength = maxHolidayLength;
  }

  public UnsecuredSMELendingResponseRepaymentHoliday maxHolidayLength(Float maxHolidayLength) {
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

  public UnsecuredSMELendingResponseRepaymentHoliday maxHolidayPeriod(MaxHolidayPeriodEnum maxHolidayPeriod) {
    this.maxHolidayPeriod = maxHolidayPeriod;
    return this;
  }

 /**
   * Free text for adding details for repayment holiday
   * @return notes
  **/
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public UnsecuredSMELendingResponseRepaymentHoliday notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public UnsecuredSMELendingResponseRepaymentHoliday addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnsecuredSMELendingResponseRepaymentHoliday {\n");
    
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

