package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Details of capital repayment holiday if any
 */
@ApiModel(description = "Details of capital repayment holiday if any")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class UnsecuredSMELendingResponseRepaymentHoliday   {
  @JsonProperty("MaxHolidayLength")
  private Float maxHolidayLength = null;

  /**
   * The unit of period (days, weeks, months etc.) of the repayment holiday
   */
  public enum MaxHolidayPeriodEnum {
    DAY("Day"),
    
    HALF_YEAR("Half Year"),
    
    MONTH("Month"),
    
    QUARTER("Quarter"),
    
    WEEK("Week"),
    
    YEAR("Year");

    private String value;

    MaxHolidayPeriodEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MaxHolidayPeriodEnum fromValue(String text) {
      for (MaxHolidayPeriodEnum b : MaxHolidayPeriodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("MaxHolidayPeriod")
  private MaxHolidayPeriodEnum maxHolidayPeriod = null;

  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  public UnsecuredSMELendingResponseRepaymentHoliday maxHolidayLength(Float maxHolidayLength) {
    this.maxHolidayLength = maxHolidayLength;
    return this;
  }

  /**
   * The maximum length/duration of a Repayment Holiday
   * @return maxHolidayLength
  **/
  @ApiModelProperty(value = "The maximum length/duration of a Repayment Holiday")


  public Float getMaxHolidayLength() {
    return maxHolidayLength;
  }

  public void setMaxHolidayLength(Float maxHolidayLength) {
    this.maxHolidayLength = maxHolidayLength;
  }

  public UnsecuredSMELendingResponseRepaymentHoliday maxHolidayPeriod(MaxHolidayPeriodEnum maxHolidayPeriod) {
    this.maxHolidayPeriod = maxHolidayPeriod;
    return this;
  }

  /**
   * The unit of period (days, weeks, months etc.) of the repayment holiday
   * @return maxHolidayPeriod
  **/
  @ApiModelProperty(value = "The unit of period (days, weeks, months etc.) of the repayment holiday")


  public MaxHolidayPeriodEnum getMaxHolidayPeriod() {
    return maxHolidayPeriod;
  }

  public void setMaxHolidayPeriod(MaxHolidayPeriodEnum maxHolidayPeriod) {
    this.maxHolidayPeriod = maxHolidayPeriod;
  }

  public UnsecuredSMELendingResponseRepaymentHoliday notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public UnsecuredSMELendingResponseRepaymentHoliday addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Free text for adding details for repayment holiday
   * @return notes
  **/
  @ApiModelProperty(value = "Free text for adding details for repayment holiday")


  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnsecuredSMELendingResponseRepaymentHoliday unsecuredSMELendingResponseRepaymentHoliday = (UnsecuredSMELendingResponseRepaymentHoliday) o;
    return Objects.equals(this.maxHolidayLength, unsecuredSMELendingResponseRepaymentHoliday.maxHolidayLength) &&
        Objects.equals(this.maxHolidayPeriod, unsecuredSMELendingResponseRepaymentHoliday.maxHolidayPeriod) &&
        Objects.equals(this.notes, unsecuredSMELendingResponseRepaymentHoliday.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxHolidayLength, maxHolidayPeriod, notes);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

