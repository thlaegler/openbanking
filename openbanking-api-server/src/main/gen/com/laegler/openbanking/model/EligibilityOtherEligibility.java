package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OtherType;
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
  * Other eligibility which is not covered by the main eligibility of the BCA product
 **/
@ApiModel(description="Other eligibility which is not covered by the main eligibility of the BCA product")
public class EligibilityOtherEligibility  {
  
  @ApiModelProperty(value = "Any eligibility criteria where an amount is required to be specified e.g. Minimum Age.")
 /**
   * Any eligibility criteria where an amount is required to be specified e.g. Minimum Age.
  **/
  private String amount = null;

  @ApiModelProperty(value = "Full description for the eligibility criteria")
 /**
   * Full description for the eligibility criteria
  **/
  private String description = null;

  @ApiModelProperty(value = "Any eligibility criteria where the value can be indicated by a true or false value. UKResident is True or False")
 /**
   * Any eligibility criteria where the value can be indicated by a true or false value. UKResident is True or False
  **/
  private Boolean indicator = null;

  @ApiModelProperty(required = true, value = "Name provided for the eligibility criteria")
 /**
   * Name provided for the eligibility criteria
  **/
  private String name = null;

  @ApiModelProperty(value = "Optional additional notes to supplement the eligibility conditions.")
 /**
   * Optional additional notes to supplement the eligibility conditions.
  **/
  private List<String> notes = null;

  @ApiModelProperty(value = "")
  @Valid
  private OtherType otherType = null;


@XmlType(name="PeriodEnum")
@XmlEnum(String.class)
public enum PeriodEnum {

@XmlEnumValue("Daily") DAILY(String.valueOf("Daily")), @XmlEnumValue("HalfYearly") HALFYEARLY(String.valueOf("HalfYearly")), @XmlEnumValue("Monthly") MONTHLY(String.valueOf("Monthly")), @XmlEnumValue("Other") OTHER(String.valueOf("Other")), @XmlEnumValue("Quarterly") QUARTERLY(String.valueOf("Quarterly")), @XmlEnumValue("PerStatementDate") PERSTATEMENTDATE(String.valueOf("PerStatementDate")), @XmlEnumValue("Weekly") WEEKLY(String.valueOf("Weekly")), @XmlEnumValue("Yearly") YEARLY(String.valueOf("Yearly"));


    private String value;

    PeriodEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PeriodEnum fromValue(String v) {
        for (PeriodEnum b : PeriodEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Period for which the other eligibility criteria applies.")
 /**
   * Period for which the other eligibility criteria applies.
  **/
  private PeriodEnum period = null;

  @ApiModelProperty(value = "Any eligibility criteria where a long description is supplied")
 /**
   * Any eligibility criteria where a long description is supplied
  **/
  private String textual = null;


@XmlType(name="TypeEnum")
@XmlEnum(String.class)
public enum TypeEnum {

@XmlEnumValue("AnyBusinessCustomer") ANYBUSINESSCUSTOMER(String.valueOf("AnyBusinessCustomer")), @XmlEnumValue("MinimumAnniversary") MINIMUMANNIVERSARY(String.valueOf("MinimumAnniversary")), @XmlEnumValue("ExistingCustomers") EXISTINGCUSTOMERS(String.valueOf("ExistingCustomers")), @XmlEnumValue("MinimumDeposit") MINIMUMDEPOSIT(String.valueOf("MinimumDeposit")), @XmlEnumValue("MinimumTransactions") MINIMUMTRANSACTIONS(String.valueOf("MinimumTransactions")), @XmlEnumValue("NewCustomersOnly") NEWCUSTOMERSONLY(String.valueOf("NewCustomersOnly")), @XmlEnumValue("Other") OTHER(String.valueOf("Other")), @XmlEnumValue("SwitchersOnly") SWITCHERSONLY(String.valueOf("SwitchersOnly")), @XmlEnumValue("StartUp") STARTUP(String.valueOf("StartUp")), @XmlEnumValue("SoleUkAccount") SOLEUKACCOUNT(String.valueOf("SoleUkAccount")), @XmlEnumValue("ThirdSectorOnly") THIRDSECTORONLY(String.valueOf("ThirdSectorOnly"));


    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TypeEnum fromValue(String v) {
        for (TypeEnum b : TypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Eligibility type - method by which we group eligibilities for comparison purposes.")
 /**
   * Eligibility type - method by which we group eligibilities for comparison purposes.
  **/
  private TypeEnum type = null;
 /**
   * Any eligibility criteria where an amount is required to be specified e.g. Minimum Age.
   * @return amount
  **/
  @JsonProperty("Amount")
 @Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public EligibilityOtherEligibility amount(String amount) {
    this.amount = amount;
    return this;
  }

 /**
   * Full description for the eligibility criteria
   * @return description
  **/
  @JsonProperty("Description")
 @Size(min=1,max=500)  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public EligibilityOtherEligibility description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Any eligibility criteria where the value can be indicated by a true or false value. UKResident is True or False
   * @return indicator
  **/
  @JsonProperty("Indicator")
  public Boolean isIndicator() {
    return indicator;
  }

  public void setIndicator(Boolean indicator) {
    this.indicator = indicator;
  }

  public EligibilityOtherEligibility indicator(Boolean indicator) {
    this.indicator = indicator;
    return this;
  }

 /**
   * Name provided for the eligibility criteria
   * @return name
  **/
  @JsonProperty("Name")
  @NotNull
 @Size(min=1,max=350)  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EligibilityOtherEligibility name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Optional additional notes to supplement the eligibility conditions.
   * @return notes
  **/
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public EligibilityOtherEligibility notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public EligibilityOtherEligibility addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Get otherType
   * @return otherType
  **/
  @JsonProperty("OtherType")
  public OtherType getOtherType() {
    return otherType;
  }

  public void setOtherType(OtherType otherType) {
    this.otherType = otherType;
  }

  public EligibilityOtherEligibility otherType(OtherType otherType) {
    this.otherType = otherType;
    return this;
  }

 /**
   * Period for which the other eligibility criteria applies.
   * @return period
  **/
  @JsonProperty("Period")
  public String getPeriod() {
    if (period == null) {
      return null;
    }
    return period.value();
  }

  public void setPeriod(PeriodEnum period) {
    this.period = period;
  }

  public EligibilityOtherEligibility period(PeriodEnum period) {
    this.period = period;
    return this;
  }

 /**
   * Any eligibility criteria where a long description is supplied
   * @return textual
  **/
  @JsonProperty("Textual")
 @Size(min=1,max=500)  public String getTextual() {
    return textual;
  }

  public void setTextual(String textual) {
    this.textual = textual;
  }

  public EligibilityOtherEligibility textual(String textual) {
    this.textual = textual;
    return this;
  }

 /**
   * Eligibility type - method by which we group eligibilities for comparison purposes.
   * @return type
  **/
  @JsonProperty("Type")
  @NotNull
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.value();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public EligibilityOtherEligibility type(TypeEnum type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EligibilityOtherEligibility {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    indicator: ").append(toIndentedString(indicator)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherType: ").append(toIndentedString(otherType)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    textual: ").append(toIndentedString(textual)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

