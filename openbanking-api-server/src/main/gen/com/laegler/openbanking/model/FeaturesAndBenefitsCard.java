package com.laegler.openbanking.model;

import com.laegler.openbanking.model.FeaturesAndBenefitsOtherScheme;
import com.laegler.openbanking.model.OtherType1;
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
  * Payment Card Details
 **/
@ApiModel(description="Payment Card Details")
public class FeaturesAndBenefitsCard  {
  
  @ApiModelProperty(required = true, value = "Indicates if the card can be used for contactless payments or not.")
 /**
   * Indicates if the card can be used for contactless payments or not.
  **/
  private Boolean contactlessIndicator = null;

  @ApiModelProperty(value = "Maximum daily cash withdrawallimit on the card.")
 /**
   * Maximum daily cash withdrawallimit on the card.
  **/
  private String maxDailyCardWithdrawalLimit = null;

  @ApiModelProperty(value = "Optional additional notes to supplement the Card details")
 /**
   * Optional additional notes to supplement the Card details
  **/
  private List<String> notes = null;

  @ApiModelProperty(value = "Operator of a card scheme which is not available in the standard scheme code list")
  @Valid
 /**
   * Operator of a card scheme which is not available in the standard scheme code list
  **/
  private List<FeaturesAndBenefitsOtherScheme> otherScheme = null;

  @ApiModelProperty(value = "")
  @Valid
  private OtherType1 otherType = null;


@XmlType(name="SchemeEnum")
@XmlEnum(String.class)
public enum SchemeEnum {

@XmlEnumValue("MasterCard") MASTERCARD(String.valueOf("MasterCard")), @XmlEnumValue("Other") OTHER(String.valueOf("Other")), @XmlEnumValue("Visa") VISA(String.valueOf("Visa"));


    private String value;

    SchemeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SchemeEnum fromValue(String v) {
        for (SchemeEnum b : SchemeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Operator of Card Scheme e.g. Visa")
 /**
   * Operator of Card Scheme e.g. Visa
  **/
  private List<SchemeEnum> scheme = new ArrayList<SchemeEnum>();


@XmlType(name="TypeEnum")
@XmlEnum(String.class)
public enum TypeEnum {

@XmlEnumValue("BusinessQuickLodgeCard") BUSINESSQUICKLODGECARD(String.valueOf("BusinessQuickLodgeCard")), @XmlEnumValue("CashCard") CASHCARD(String.valueOf("CashCard")), @XmlEnumValue("DebitCard") DEBITCARD(String.valueOf("DebitCard")), @XmlEnumValue("DepositCard") DEPOSITCARD(String.valueOf("DepositCard")), @XmlEnumValue("Other") OTHER(String.valueOf("Other"));


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

  @ApiModelProperty(required = true, value = "Card Type available e.g. Debit")
 /**
   * Card Type available e.g. Debit
  **/
  private TypeEnum type = null;
 /**
   * Indicates if the card can be used for contactless payments or not.
   * @return contactlessIndicator
  **/
  @JsonProperty("ContactlessIndicator")
  @NotNull
  public Boolean isContactlessIndicator() {
    return contactlessIndicator;
  }

  public void setContactlessIndicator(Boolean contactlessIndicator) {
    this.contactlessIndicator = contactlessIndicator;
  }

  public FeaturesAndBenefitsCard contactlessIndicator(Boolean contactlessIndicator) {
    this.contactlessIndicator = contactlessIndicator;
    return this;
  }

 /**
   * Maximum daily cash withdrawallimit on the card.
   * @return maxDailyCardWithdrawalLimit
  **/
  @JsonProperty("MaxDailyCardWithdrawalLimit")
 @Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")  public String getMaxDailyCardWithdrawalLimit() {
    return maxDailyCardWithdrawalLimit;
  }

  public void setMaxDailyCardWithdrawalLimit(String maxDailyCardWithdrawalLimit) {
    this.maxDailyCardWithdrawalLimit = maxDailyCardWithdrawalLimit;
  }

  public FeaturesAndBenefitsCard maxDailyCardWithdrawalLimit(String maxDailyCardWithdrawalLimit) {
    this.maxDailyCardWithdrawalLimit = maxDailyCardWithdrawalLimit;
    return this;
  }

 /**
   * Optional additional notes to supplement the Card details
   * @return notes
  **/
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public FeaturesAndBenefitsCard notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public FeaturesAndBenefitsCard addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Operator of a card scheme which is not available in the standard scheme code list
   * @return otherScheme
  **/
  @JsonProperty("OtherScheme")
  public List<FeaturesAndBenefitsOtherScheme> getOtherScheme() {
    return otherScheme;
  }

  public void setOtherScheme(List<FeaturesAndBenefitsOtherScheme> otherScheme) {
    this.otherScheme = otherScheme;
  }

  public FeaturesAndBenefitsCard otherScheme(List<FeaturesAndBenefitsOtherScheme> otherScheme) {
    this.otherScheme = otherScheme;
    return this;
  }

  public FeaturesAndBenefitsCard addOtherSchemeItem(FeaturesAndBenefitsOtherScheme otherSchemeItem) {
    this.otherScheme.add(otherSchemeItem);
    return this;
  }

 /**
   * Get otherType
   * @return otherType
  **/
  @JsonProperty("OtherType")
  public OtherType1 getOtherType() {
    return otherType;
  }

  public void setOtherType(OtherType1 otherType) {
    this.otherType = otherType;
  }

  public FeaturesAndBenefitsCard otherType(OtherType1 otherType) {
    this.otherType = otherType;
    return this;
  }

 /**
   * Operator of Card Scheme e.g. Visa
   * @return scheme
  **/
  @JsonProperty("Scheme")
  @NotNull
 @Size(min=1)  public List<SchemeEnum> getScheme() {
    return scheme;
  }

  public void setScheme(List<SchemeEnum> scheme) {
    this.scheme = scheme;
  }

  public FeaturesAndBenefitsCard scheme(List<SchemeEnum> scheme) {
    this.scheme = scheme;
    return this;
  }

  public FeaturesAndBenefitsCard addSchemeItem(SchemeEnum schemeItem) {
    this.scheme.add(schemeItem);
    return this;
  }

 /**
   * Card Type available e.g. Debit
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

  public FeaturesAndBenefitsCard type(TypeEnum type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeaturesAndBenefitsCard {\n");
    
    sb.append("    contactlessIndicator: ").append(toIndentedString(contactlessIndicator)).append("\n");
    sb.append("    maxDailyCardWithdrawalLimit: ").append(toIndentedString(maxDailyCardWithdrawalLimit)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherScheme: ").append(toIndentedString(otherScheme)).append("\n");
    sb.append("    otherType: ").append(toIndentedString(otherType)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
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

