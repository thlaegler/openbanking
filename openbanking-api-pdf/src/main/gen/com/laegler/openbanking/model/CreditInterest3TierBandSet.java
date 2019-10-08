package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.laegler.openbanking.model.CreditInterest3CreditInterestEligibility;
import com.laegler.openbanking.model.CreditInterest3TierBand;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The group of tiers or bands for which credit interest can be applied.
 */
@ApiModel(description = "The group of tiers or bands for which credit interest can be applied.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class CreditInterest3TierBandSet   {
  /**
   * Methods of calculating interest
   */
  public enum CalculationMethodEnum {
    COMPOUND("Compound"),
    
    SIMPLEINTEREST("SimpleInterest");

    private String value;

    CalculationMethodEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CalculationMethodEnum fromValue(String text) {
      for (CalculationMethodEnum b : CalculationMethodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("CalculationMethod")
  private CalculationMethodEnum calculationMethod = null;

  @JsonProperty("CreditInterestEligibility")
  @Valid
  private List<CreditInterest3CreditInterestEligibility> creditInterestEligibility = null;

  /**
   * Describes whether accrued interest is payable only to the PCA or to another bank account
   */
  public enum DestinationEnum {
    PAYAWAY("PayAway"),
    
    SELFCREDIT("SelfCredit");

    private String value;

    DestinationEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DestinationEnum fromValue(String text) {
      for (DestinationEnum b : DestinationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("Destination")
  private DestinationEnum destination = null;

  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("TierBand")
  @Valid
  private List<CreditInterest3TierBand> tierBand = new ArrayList<>();

  /**
   * The methodology of how credit interest is paid/applied. It can be:-  1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases.  2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance.  3. Whole The same interest rate is applied irrespective of the PCA balance
   */
  public enum TierBandMethodEnum {
    TIERED("Tiered"),
    
    WHOLE("Whole");

    private String value;

    TierBandMethodEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TierBandMethodEnum fromValue(String text) {
      for (TierBandMethodEnum b : TierBandMethodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("TierBandMethod")
  private TierBandMethodEnum tierBandMethod = null;

  public CreditInterest3TierBandSet calculationMethod(CalculationMethodEnum calculationMethod) {
    this.calculationMethod = calculationMethod;
    return this;
  }

  /**
   * Methods of calculating interest
   * @return calculationMethod
  **/
  @ApiModelProperty(value = "Methods of calculating interest")


  public CalculationMethodEnum getCalculationMethod() {
    return calculationMethod;
  }

  public void setCalculationMethod(CalculationMethodEnum calculationMethod) {
    this.calculationMethod = calculationMethod;
  }

  public CreditInterest3TierBandSet creditInterestEligibility(List<CreditInterest3CreditInterestEligibility> creditInterestEligibility) {
    this.creditInterestEligibility = creditInterestEligibility;
    return this;
  }

  public CreditInterest3TierBandSet addCreditInterestEligibilityItem(CreditInterest3CreditInterestEligibility creditInterestEligibilityItem) {
    if (this.creditInterestEligibility == null) {
      this.creditInterestEligibility = new ArrayList<>();
    }
    this.creditInterestEligibility.add(creditInterestEligibilityItem);
    return this;
  }

  /**
   * Eligibility for credit interest
   * @return creditInterestEligibility
  **/
  @ApiModelProperty(value = "Eligibility for credit interest")

  @Valid

  public List<CreditInterest3CreditInterestEligibility> getCreditInterestEligibility() {
    return creditInterestEligibility;
  }

  public void setCreditInterestEligibility(List<CreditInterest3CreditInterestEligibility> creditInterestEligibility) {
    this.creditInterestEligibility = creditInterestEligibility;
  }

  public CreditInterest3TierBandSet destination(DestinationEnum destination) {
    this.destination = destination;
    return this;
  }

  /**
   * Describes whether accrued interest is payable only to the PCA or to another bank account
   * @return destination
  **/
  @ApiModelProperty(value = "Describes whether accrued interest is payable only to the PCA or to another bank account")


  public DestinationEnum getDestination() {
    return destination;
  }

  public void setDestination(DestinationEnum destination) {
    this.destination = destination;
  }

  public CreditInterest3TierBandSet notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public CreditInterest3TierBandSet addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Optional additional notes to supplement the Tier Band Set details
   * @return notes
  **/
  @ApiModelProperty(value = "Optional additional notes to supplement the Tier Band Set details")


  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public CreditInterest3TierBandSet tierBand(List<CreditInterest3TierBand> tierBand) {
    this.tierBand = tierBand;
    return this;
  }

  public CreditInterest3TierBandSet addTierBandItem(CreditInterest3TierBand tierBandItem) {
    this.tierBand.add(tierBandItem);
    return this;
  }

  /**
   * Tier Band Details
   * @return tierBand
  **/
  @ApiModelProperty(required = true, value = "Tier Band Details")
  @NotNull

  @Valid
@Size(min=1) 
  public List<CreditInterest3TierBand> getTierBand() {
    return tierBand;
  }

  public void setTierBand(List<CreditInterest3TierBand> tierBand) {
    this.tierBand = tierBand;
  }

  public CreditInterest3TierBandSet tierBandMethod(TierBandMethodEnum tierBandMethod) {
    this.tierBandMethod = tierBandMethod;
    return this;
  }

  /**
   * The methodology of how credit interest is paid/applied. It can be:-  1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases.  2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance.  3. Whole The same interest rate is applied irrespective of the PCA balance
   * @return tierBandMethod
  **/
  @ApiModelProperty(required = true, value = "The methodology of how credit interest is paid/applied. It can be:-  1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases.  2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance.  3. Whole The same interest rate is applied irrespective of the PCA balance")
  @NotNull


  public TierBandMethodEnum getTierBandMethod() {
    return tierBandMethod;
  }

  public void setTierBandMethod(TierBandMethodEnum tierBandMethod) {
    this.tierBandMethod = tierBandMethod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditInterest3TierBandSet creditInterest3TierBandSet = (CreditInterest3TierBandSet) o;
    return Objects.equals(this.calculationMethod, creditInterest3TierBandSet.calculationMethod) &&
        Objects.equals(this.creditInterestEligibility, creditInterest3TierBandSet.creditInterestEligibility) &&
        Objects.equals(this.destination, creditInterest3TierBandSet.destination) &&
        Objects.equals(this.notes, creditInterest3TierBandSet.notes) &&
        Objects.equals(this.tierBand, creditInterest3TierBandSet.tierBand) &&
        Objects.equals(this.tierBandMethod, creditInterest3TierBandSet.tierBandMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calculationMethod, creditInterestEligibility, destination, notes, tierBand, tierBandMethod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditInterest3TierBandSet {\n");
    
    sb.append("    calculationMethod: ").append(toIndentedString(calculationMethod)).append("\n");
    sb.append("    creditInterestEligibility: ").append(toIndentedString(creditInterestEligibility)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    tierBand: ").append(toIndentedString(tierBand)).append("\n");
    sb.append("    tierBandMethod: ").append(toIndentedString(tierBandMethod)).append("\n");
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

