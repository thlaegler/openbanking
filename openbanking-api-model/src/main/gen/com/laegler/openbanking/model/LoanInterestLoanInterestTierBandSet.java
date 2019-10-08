package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.laegler.openbanking.model.LoanInterestLoanInterestFeesCharges;
import com.laegler.openbanking.model.LoanInterestLoanInterestTierBand;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The group of tiers or bands for which debit interest can be applied.
 */
@ApiModel(description = "The group of tiers or bands for which debit interest can be applied.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class LoanInterestLoanInterestTierBandSet   {
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

  @JsonProperty("Identification")
  private String identification = null;

  @JsonProperty("LoanInterestFeesCharges")
  @Valid
  private List<LoanInterestLoanInterestFeesCharges> loanInterestFeesCharges = null;

  @JsonProperty("LoanInterestTierBand")
  @Valid
  private List<LoanInterestLoanInterestTierBand> loanInterestTierBand = new ArrayList<>();

  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  /**
   * The methodology of how credit interest is charged. It can be:-  1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases.  2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance.  3. Whole The same interest rate is applied irrespective of the SME Loan balance
   */
  public enum TierBandMethodEnum {
    BANDED("Banded"),
    
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

  public LoanInterestLoanInterestTierBandSet calculationMethod(CalculationMethodEnum calculationMethod) {
    this.calculationMethod = calculationMethod;
    return this;
  }

  /**
   * Methods of calculating interest
   * @return calculationMethod
  **/
  @ApiModelProperty(required = true, value = "Methods of calculating interest")
  @NotNull


  public CalculationMethodEnum getCalculationMethod() {
    return calculationMethod;
  }

  public void setCalculationMethod(CalculationMethodEnum calculationMethod) {
    this.calculationMethod = calculationMethod;
  }

  public LoanInterestLoanInterestTierBandSet identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Loan interest tierbandset identification. Used by  loan providers for internal use purpose.
   * @return identification
  **/
  @ApiModelProperty(value = "Loan interest tierbandset identification. Used by  loan providers for internal use purpose.")

@Size(min=1,max=35) 
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public LoanInterestLoanInterestTierBandSet loanInterestFeesCharges(List<LoanInterestLoanInterestFeesCharges> loanInterestFeesCharges) {
    this.loanInterestFeesCharges = loanInterestFeesCharges;
    return this;
  }

  public LoanInterestLoanInterestTierBandSet addLoanInterestFeesChargesItem(LoanInterestLoanInterestFeesCharges loanInterestFeesChargesItem) {
    if (this.loanInterestFeesCharges == null) {
      this.loanInterestFeesCharges = new ArrayList<>();
    }
    this.loanInterestFeesCharges.add(loanInterestFeesChargesItem);
    return this;
  }

  /**
   * Contains details of fees and charges which are not associated with either LoanRepayment or features/benefits
   * @return loanInterestFeesCharges
  **/
  @ApiModelProperty(value = "Contains details of fees and charges which are not associated with either LoanRepayment or features/benefits")

  @Valid

  public List<LoanInterestLoanInterestFeesCharges> getLoanInterestFeesCharges() {
    return loanInterestFeesCharges;
  }

  public void setLoanInterestFeesCharges(List<LoanInterestLoanInterestFeesCharges> loanInterestFeesCharges) {
    this.loanInterestFeesCharges = loanInterestFeesCharges;
  }

  public LoanInterestLoanInterestTierBandSet loanInterestTierBand(List<LoanInterestLoanInterestTierBand> loanInterestTierBand) {
    this.loanInterestTierBand = loanInterestTierBand;
    return this;
  }

  public LoanInterestLoanInterestTierBandSet addLoanInterestTierBandItem(LoanInterestLoanInterestTierBand loanInterestTierBandItem) {
    this.loanInterestTierBand.add(loanInterestTierBandItem);
    return this;
  }

  /**
   * Tier Band Details
   * @return loanInterestTierBand
  **/
  @ApiModelProperty(required = true, value = "Tier Band Details")
  @NotNull

  @Valid
@Size(min=1) 
  public List<LoanInterestLoanInterestTierBand> getLoanInterestTierBand() {
    return loanInterestTierBand;
  }

  public void setLoanInterestTierBand(List<LoanInterestLoanInterestTierBand> loanInterestTierBand) {
    this.loanInterestTierBand = loanInterestTierBand;
  }

  public LoanInterestLoanInterestTierBandSet notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public LoanInterestLoanInterestTierBandSet addNotesItem(String notesItem) {
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

  public LoanInterestLoanInterestTierBandSet tierBandMethod(TierBandMethodEnum tierBandMethod) {
    this.tierBandMethod = tierBandMethod;
    return this;
  }

  /**
   * The methodology of how credit interest is charged. It can be:-  1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases.  2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance.  3. Whole The same interest rate is applied irrespective of the SME Loan balance
   * @return tierBandMethod
  **/
  @ApiModelProperty(required = true, value = "The methodology of how credit interest is charged. It can be:-  1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases.  2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance.  3. Whole The same interest rate is applied irrespective of the SME Loan balance")
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
    LoanInterestLoanInterestTierBandSet loanInterestLoanInterestTierBandSet = (LoanInterestLoanInterestTierBandSet) o;
    return Objects.equals(this.calculationMethod, loanInterestLoanInterestTierBandSet.calculationMethod) &&
        Objects.equals(this.identification, loanInterestLoanInterestTierBandSet.identification) &&
        Objects.equals(this.loanInterestFeesCharges, loanInterestLoanInterestTierBandSet.loanInterestFeesCharges) &&
        Objects.equals(this.loanInterestTierBand, loanInterestLoanInterestTierBandSet.loanInterestTierBand) &&
        Objects.equals(this.notes, loanInterestLoanInterestTierBandSet.notes) &&
        Objects.equals(this.tierBandMethod, loanInterestLoanInterestTierBandSet.tierBandMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calculationMethod, identification, loanInterestFeesCharges, loanInterestTierBand, notes, tierBandMethod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanInterestLoanInterestTierBandSet {\n");
    
    sb.append("    calculationMethod: ").append(toIndentedString(calculationMethod)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    loanInterestFeesCharges: ").append(toIndentedString(loanInterestFeesCharges)).append("\n");
    sb.append("    loanInterestTierBand: ").append(toIndentedString(loanInterestTierBand)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

