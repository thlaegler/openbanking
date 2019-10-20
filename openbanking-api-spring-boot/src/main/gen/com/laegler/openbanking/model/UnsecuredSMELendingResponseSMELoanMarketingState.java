package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.laegler.openbanking.model.CoreProduct3;
import com.laegler.openbanking.model.Eligibility3;
import com.laegler.openbanking.model.FeaturesAndBenefits3;
import com.laegler.openbanking.model.LoanInterest;
import com.laegler.openbanking.model.OtherFeesCharges3;
import com.laegler.openbanking.model.UnsecuredSMELendingResponseRepayment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The marketing state (promotional or regular) of the SME Loan Product.
 */
@ApiModel(description = "The marketing state (promotional or regular) of the SME Loan Product.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class UnsecuredSMELendingResponseSMELoanMarketingState   {
  @JsonProperty("CoreProduct")
  private CoreProduct3 coreProduct = null;

  @JsonProperty("Eligibility")
  private Eligibility3 eligibility = null;

  @JsonProperty("FeaturesAndBenefits")
  private FeaturesAndBenefits3 featuresAndBenefits = null;

  @JsonProperty("FirstMarketedDate")
  private LocalDate firstMarketedDate = null;

  @JsonProperty("Identification")
  private String identification = null;

  @JsonProperty("LastMarketedDate")
  private LocalDate lastMarketedDate = null;

  @JsonProperty("LoanInterest")
  private LoanInterest loanInterest = null;

  /**
   * Describes the marketing state (regular or promotional) of the SME Loan Product
   */
  public enum MarketingStateEnum {
    PROMOTIONAL("Promotional"),
    
    REGULAR("Regular");

    private String value;

    MarketingStateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MarketingStateEnum fromValue(String text) {
      for (MarketingStateEnum b : MarketingStateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("MarketingState")
  private MarketingStateEnum marketingState = null;

  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("OtherFeesCharges")
  private OtherFeesCharges3 otherFeesCharges = null;

  @JsonProperty("PredecessorID")
  private String predecessorID = null;

  @JsonProperty("Repayment")
  @Valid
  private List<UnsecuredSMELendingResponseRepayment> repayment = new ArrayList<>();

  @JsonProperty("StateTenureLength")
  private Float stateTenureLength = null;

  /**
   * The unit of period (days, weeks, months etc.) of the promotional length
   */
  public enum StateTenurePeriodEnum {
    DAY("Day"),
    
    HALF_YEAR("Half Year"),
    
    MONTH("Month"),
    
    QUARTER("Quarter"),
    
    WEEK("Week"),
    
    YEAR("Year");

    private String value;

    StateTenurePeriodEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StateTenurePeriodEnum fromValue(String text) {
      for (StateTenurePeriodEnum b : StateTenurePeriodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("StateTenurePeriod")
  private StateTenurePeriodEnum stateTenurePeriod = null;

  public UnsecuredSMELendingResponseSMELoanMarketingState coreProduct(CoreProduct3 coreProduct) {
    this.coreProduct = coreProduct;
    return this;
  }

  /**
   * Get coreProduct
   * @return coreProduct
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public CoreProduct3 getCoreProduct() {
    return coreProduct;
  }

  public void setCoreProduct(CoreProduct3 coreProduct) {
    this.coreProduct = coreProduct;
  }

  public UnsecuredSMELendingResponseSMELoanMarketingState eligibility(Eligibility3 eligibility) {
    this.eligibility = eligibility;
    return this;
  }

  /**
   * Get eligibility
   * @return eligibility
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Eligibility3 getEligibility() {
    return eligibility;
  }

  public void setEligibility(Eligibility3 eligibility) {
    this.eligibility = eligibility;
  }

  public UnsecuredSMELendingResponseSMELoanMarketingState featuresAndBenefits(FeaturesAndBenefits3 featuresAndBenefits) {
    this.featuresAndBenefits = featuresAndBenefits;
    return this;
  }

  /**
   * Get featuresAndBenefits
   * @return featuresAndBenefits
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public FeaturesAndBenefits3 getFeaturesAndBenefits() {
    return featuresAndBenefits;
  }

  public void setFeaturesAndBenefits(FeaturesAndBenefits3 featuresAndBenefits) {
    this.featuresAndBenefits = featuresAndBenefits;
  }

  public UnsecuredSMELendingResponseSMELoanMarketingState firstMarketedDate(LocalDate firstMarketedDate) {
    this.firstMarketedDate = firstMarketedDate;
    return this;
  }

  /**
   * Marketing state start date
   * @return firstMarketedDate
  **/
  @ApiModelProperty(value = "Marketing state start date")

  @Valid

  public LocalDate getFirstMarketedDate() {
    return firstMarketedDate;
  }

  public void setFirstMarketedDate(LocalDate firstMarketedDate) {
    this.firstMarketedDate = firstMarketedDate;
  }

  public UnsecuredSMELendingResponseSMELoanMarketingState identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Unique and unambiguous identification of a  SME Loan Product Marketing State.
   * @return identification
  **/
  @ApiModelProperty(required = true, value = "Unique and unambiguous identification of a  SME Loan Product Marketing State.")
  @NotNull

@Size(min=1,max=35) 
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public UnsecuredSMELendingResponseSMELoanMarketingState lastMarketedDate(LocalDate lastMarketedDate) {
    this.lastMarketedDate = lastMarketedDate;
    return this;
  }

  /**
   * Marketing state end date
   * @return lastMarketedDate
  **/
  @ApiModelProperty(value = "Marketing state end date")

  @Valid

  public LocalDate getLastMarketedDate() {
    return lastMarketedDate;
  }

  public void setLastMarketedDate(LocalDate lastMarketedDate) {
    this.lastMarketedDate = lastMarketedDate;
  }

  public UnsecuredSMELendingResponseSMELoanMarketingState loanInterest(LoanInterest loanInterest) {
    this.loanInterest = loanInterest;
    return this;
  }

  /**
   * Get loanInterest
   * @return loanInterest
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public LoanInterest getLoanInterest() {
    return loanInterest;
  }

  public void setLoanInterest(LoanInterest loanInterest) {
    this.loanInterest = loanInterest;
  }

  public UnsecuredSMELendingResponseSMELoanMarketingState marketingState(MarketingStateEnum marketingState) {
    this.marketingState = marketingState;
    return this;
  }

  /**
   * Describes the marketing state (regular or promotional) of the SME Loan Product
   * @return marketingState
  **/
  @ApiModelProperty(required = true, value = "Describes the marketing state (regular or promotional) of the SME Loan Product")
  @NotNull


  public MarketingStateEnum getMarketingState() {
    return marketingState;
  }

  public void setMarketingState(MarketingStateEnum marketingState) {
    this.marketingState = marketingState;
  }

  public UnsecuredSMELendingResponseSMELoanMarketingState notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public UnsecuredSMELendingResponseSMELoanMarketingState addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Free text for adding details for marketing state
   * @return notes
  **/
  @ApiModelProperty(value = "Free text for adding details for marketing state")


  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public UnsecuredSMELendingResponseSMELoanMarketingState otherFeesCharges(OtherFeesCharges3 otherFeesCharges) {
    this.otherFeesCharges = otherFeesCharges;
    return this;
  }

  /**
   * Get otherFeesCharges
   * @return otherFeesCharges
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OtherFeesCharges3 getOtherFeesCharges() {
    return otherFeesCharges;
  }

  public void setOtherFeesCharges(OtherFeesCharges3 otherFeesCharges) {
    this.otherFeesCharges = otherFeesCharges;
  }

  public UnsecuredSMELendingResponseSMELoanMarketingState predecessorID(String predecessorID) {
    this.predecessorID = predecessorID;
    return this;
  }

  /**
   * Identifies the marketing state that precedes this marketing state
   * @return predecessorID
  **/
  @ApiModelProperty(value = "Identifies the marketing state that precedes this marketing state")

@Size(min=1,max=35) 
  public String getPredecessorID() {
    return predecessorID;
  }

  public void setPredecessorID(String predecessorID) {
    this.predecessorID = predecessorID;
  }

  public UnsecuredSMELendingResponseSMELoanMarketingState repayment(List<UnsecuredSMELendingResponseRepayment> repayment) {
    this.repayment = repayment;
    return this;
  }

  public UnsecuredSMELendingResponseSMELoanMarketingState addRepaymentItem(UnsecuredSMELendingResponseRepayment repaymentItem) {
    this.repayment.add(repaymentItem);
    return this;
  }

  /**
   * Repayment details of the Loan product
   * @return repayment
  **/
  @ApiModelProperty(required = true, value = "Repayment details of the Loan product")
  @NotNull

  @Valid
@Size(min=1) 
  public List<UnsecuredSMELendingResponseRepayment> getRepayment() {
    return repayment;
  }

  public void setRepayment(List<UnsecuredSMELendingResponseRepayment> repayment) {
    this.repayment = repayment;
  }

  public UnsecuredSMELendingResponseSMELoanMarketingState stateTenureLength(Float stateTenureLength) {
    this.stateTenureLength = stateTenureLength;
    return this;
  }

  /**
   * The length/duration of a promotional state
   * @return stateTenureLength
  **/
  @ApiModelProperty(value = "The length/duration of a promotional state")


  public Float getStateTenureLength() {
    return stateTenureLength;
  }

  public void setStateTenureLength(Float stateTenureLength) {
    this.stateTenureLength = stateTenureLength;
  }

  public UnsecuredSMELendingResponseSMELoanMarketingState stateTenurePeriod(StateTenurePeriodEnum stateTenurePeriod) {
    this.stateTenurePeriod = stateTenurePeriod;
    return this;
  }

  /**
   * The unit of period (days, weeks, months etc.) of the promotional length
   * @return stateTenurePeriod
  **/
  @ApiModelProperty(value = "The unit of period (days, weeks, months etc.) of the promotional length")


  public StateTenurePeriodEnum getStateTenurePeriod() {
    return stateTenurePeriod;
  }

  public void setStateTenurePeriod(StateTenurePeriodEnum stateTenurePeriod) {
    this.stateTenurePeriod = stateTenurePeriod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnsecuredSMELendingResponseSMELoanMarketingState unsecuredSMELendingResponseSMELoanMarketingState = (UnsecuredSMELendingResponseSMELoanMarketingState) o;
    return Objects.equals(this.coreProduct, unsecuredSMELendingResponseSMELoanMarketingState.coreProduct) &&
        Objects.equals(this.eligibility, unsecuredSMELendingResponseSMELoanMarketingState.eligibility) &&
        Objects.equals(this.featuresAndBenefits, unsecuredSMELendingResponseSMELoanMarketingState.featuresAndBenefits) &&
        Objects.equals(this.firstMarketedDate, unsecuredSMELendingResponseSMELoanMarketingState.firstMarketedDate) &&
        Objects.equals(this.identification, unsecuredSMELendingResponseSMELoanMarketingState.identification) &&
        Objects.equals(this.lastMarketedDate, unsecuredSMELendingResponseSMELoanMarketingState.lastMarketedDate) &&
        Objects.equals(this.loanInterest, unsecuredSMELendingResponseSMELoanMarketingState.loanInterest) &&
        Objects.equals(this.marketingState, unsecuredSMELendingResponseSMELoanMarketingState.marketingState) &&
        Objects.equals(this.notes, unsecuredSMELendingResponseSMELoanMarketingState.notes) &&
        Objects.equals(this.otherFeesCharges, unsecuredSMELendingResponseSMELoanMarketingState.otherFeesCharges) &&
        Objects.equals(this.predecessorID, unsecuredSMELendingResponseSMELoanMarketingState.predecessorID) &&
        Objects.equals(this.repayment, unsecuredSMELendingResponseSMELoanMarketingState.repayment) &&
        Objects.equals(this.stateTenureLength, unsecuredSMELendingResponseSMELoanMarketingState.stateTenureLength) &&
        Objects.equals(this.stateTenurePeriod, unsecuredSMELendingResponseSMELoanMarketingState.stateTenurePeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coreProduct, eligibility, featuresAndBenefits, firstMarketedDate, identification, lastMarketedDate, loanInterest, marketingState, notes, otherFeesCharges, predecessorID, repayment, stateTenureLength, stateTenurePeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnsecuredSMELendingResponseSMELoanMarketingState {\n");
    
    sb.append("    coreProduct: ").append(toIndentedString(coreProduct)).append("\n");
    sb.append("    eligibility: ").append(toIndentedString(eligibility)).append("\n");
    sb.append("    featuresAndBenefits: ").append(toIndentedString(featuresAndBenefits)).append("\n");
    sb.append("    firstMarketedDate: ").append(toIndentedString(firstMarketedDate)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    lastMarketedDate: ").append(toIndentedString(lastMarketedDate)).append("\n");
    sb.append("    loanInterest: ").append(toIndentedString(loanInterest)).append("\n");
    sb.append("    marketingState: ").append(toIndentedString(marketingState)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherFeesCharges: ").append(toIndentedString(otherFeesCharges)).append("\n");
    sb.append("    predecessorID: ").append(toIndentedString(predecessorID)).append("\n");
    sb.append("    repayment: ").append(toIndentedString(repayment)).append("\n");
    sb.append("    stateTenureLength: ").append(toIndentedString(stateTenureLength)).append("\n");
    sb.append("    stateTenurePeriod: ").append(toIndentedString(stateTenurePeriod)).append("\n");
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

