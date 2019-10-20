package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.laegler.openbanking.model.FeaturesAndBenefitsOtherScheme;
import com.laegler.openbanking.model.OtherType1;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Payment Card Details
 */
@ApiModel(description = "Payment Card Details")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class FeaturesAndBenefits2Card   {
  @JsonProperty("ContactlessIndicator")
  private Boolean contactlessIndicator = null;

  @JsonProperty("MaxDailyCardWithdrawalLimit")
  private String maxDailyCardWithdrawalLimit = null;

  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("OtherScheme")
  private FeaturesAndBenefitsOtherScheme otherScheme = null;

  @JsonProperty("OtherType")
  private OtherType1 otherType = null;

  /**
   * Operator of Card Scheme e.g. Visa
   */
  public enum SchemeEnum {
    MASTERCARD("MasterCard"),
    
    OTHER("Other"),
    
    VISA("Visa");

    private String value;

    SchemeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SchemeEnum fromValue(String text) {
      for (SchemeEnum b : SchemeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("Scheme")
  @Valid
  private List<SchemeEnum> scheme = new ArrayList<>();

  /**
   * Card Type available e.g. Debit
   */
  public enum TypeEnum {
    CASHCARD("CashCard"),
    
    DEBITCARD("DebitCard"),
    
    OTHER("Other"),
    
    POCACARD("POCACard"),
    
    PREPAIDDEBITCARD("PrepaidDebitCard");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("Type")
  private TypeEnum type = null;

  public FeaturesAndBenefits2Card contactlessIndicator(Boolean contactlessIndicator) {
    this.contactlessIndicator = contactlessIndicator;
    return this;
  }

  /**
   * Indicates if the card can be used for contactless payments(Yes) or not(No).
   * @return contactlessIndicator
  **/
  @ApiModelProperty(required = true, value = "Indicates if the card can be used for contactless payments(Yes) or not(No).")
  @NotNull


  public Boolean isContactlessIndicator() {
    return contactlessIndicator;
  }

  public void setContactlessIndicator(Boolean contactlessIndicator) {
    this.contactlessIndicator = contactlessIndicator;
  }

  public FeaturesAndBenefits2Card maxDailyCardWithdrawalLimit(String maxDailyCardWithdrawalLimit) {
    this.maxDailyCardWithdrawalLimit = maxDailyCardWithdrawalLimit;
    return this;
  }

  /**
   * Maximum daily cash withdrawal limit on the card.
   * @return maxDailyCardWithdrawalLimit
  **/
  @ApiModelProperty(value = "Maximum daily cash withdrawal limit on the card.")

@Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$") 
  public String getMaxDailyCardWithdrawalLimit() {
    return maxDailyCardWithdrawalLimit;
  }

  public void setMaxDailyCardWithdrawalLimit(String maxDailyCardWithdrawalLimit) {
    this.maxDailyCardWithdrawalLimit = maxDailyCardWithdrawalLimit;
  }

  public FeaturesAndBenefits2Card notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public FeaturesAndBenefits2Card addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Optional additional notes to supplement the Card details
   * @return notes
  **/
  @ApiModelProperty(value = "Optional additional notes to supplement the Card details")


  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public FeaturesAndBenefits2Card otherScheme(FeaturesAndBenefitsOtherScheme otherScheme) {
    this.otherScheme = otherScheme;
    return this;
  }

  /**
   * Get otherScheme
   * @return otherScheme
  **/
  @ApiModelProperty(value = "")

  @Valid

  public FeaturesAndBenefitsOtherScheme getOtherScheme() {
    return otherScheme;
  }

  public void setOtherScheme(FeaturesAndBenefitsOtherScheme otherScheme) {
    this.otherScheme = otherScheme;
  }

  public FeaturesAndBenefits2Card otherType(OtherType1 otherType) {
    this.otherType = otherType;
    return this;
  }

  /**
   * Get otherType
   * @return otherType
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OtherType1 getOtherType() {
    return otherType;
  }

  public void setOtherType(OtherType1 otherType) {
    this.otherType = otherType;
  }

  public FeaturesAndBenefits2Card scheme(List<SchemeEnum> scheme) {
    this.scheme = scheme;
    return this;
  }

  public FeaturesAndBenefits2Card addSchemeItem(SchemeEnum schemeItem) {
    this.scheme.add(schemeItem);
    return this;
  }

  /**
   * Operator of Card Scheme e.g. Visa
   * @return scheme
  **/
  @ApiModelProperty(required = true, value = "Operator of Card Scheme e.g. Visa")
  @NotNull

@Size(min=1) 
  public List<SchemeEnum> getScheme() {
    return scheme;
  }

  public void setScheme(List<SchemeEnum> scheme) {
    this.scheme = scheme;
  }

  public FeaturesAndBenefits2Card type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Card Type available e.g. Debit
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Card Type available e.g. Debit")
  @NotNull


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeaturesAndBenefits2Card featuresAndBenefits2Card = (FeaturesAndBenefits2Card) o;
    return Objects.equals(this.contactlessIndicator, featuresAndBenefits2Card.contactlessIndicator) &&
        Objects.equals(this.maxDailyCardWithdrawalLimit, featuresAndBenefits2Card.maxDailyCardWithdrawalLimit) &&
        Objects.equals(this.notes, featuresAndBenefits2Card.notes) &&
        Objects.equals(this.otherScheme, featuresAndBenefits2Card.otherScheme) &&
        Objects.equals(this.otherType, featuresAndBenefits2Card.otherType) &&
        Objects.equals(this.scheme, featuresAndBenefits2Card.scheme) &&
        Objects.equals(this.type, featuresAndBenefits2Card.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactlessIndicator, maxDailyCardWithdrawalLimit, notes, otherScheme, otherType, scheme, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeaturesAndBenefits2Card {\n");
    
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

