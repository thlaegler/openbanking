package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.laegler.openbanking.model.BranchCurrentAccountResponseOtherFeesCharges;
import com.laegler.openbanking.model.CoreProduct;
import com.laegler.openbanking.model.CreditInterest;
import com.laegler.openbanking.model.Eligibility;
import com.laegler.openbanking.model.FeaturesAndBenefits;
import com.laegler.openbanking.model.Overdraft;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The marketing state (promotional or regular) of the BCA Product.
 */
@ApiModel(description = "The marketing state (promotional or regular) of the BCA Product.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class BranchCurrentAccountResponseBCAMarketingState   {
  @JsonProperty("CoreProduct")
  private CoreProduct coreProduct = null;

  @JsonProperty("CreditInterest")
  private CreditInterest creditInterest = null;

  @JsonProperty("Eligibility")
  private Eligibility eligibility = null;

  @JsonProperty("FeaturesAndBenefits")
  private FeaturesAndBenefits featuresAndBenefits = null;

  @JsonProperty("FirstMarketedDate")
  private LocalDate firstMarketedDate = null;

  @JsonProperty("Identification")
  private String identification = null;

  @JsonProperty("LastMarketedDate")
  private LocalDate lastMarketedDate = null;

  /**
   * Describes the marketing state (regular or promotional) of the BCA Product
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
  @Valid
  private List<BranchCurrentAccountResponseOtherFeesCharges> otherFeesCharges = null;

  @JsonProperty("Overdraft")
  private Overdraft overdraft = null;

  @JsonProperty("PredecessorID")
  private String predecessorID = null;

  @JsonProperty("StateTenureLength")
  private Float stateTenureLength = null;

  /**
   * The unit of period (days, weeks, months etc.) of the promotional length
   */
  public enum StateTenurePeriodEnum {
    DAY("Day"),
    
    HALFYEAR("HalfYear"),
    
    MONTH("Month"),
    
    QUARTER("Quarter"),
    
    WEEK("Week"),
    
    ACADEMICTERM("AcademicTerm"),
    
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

  public BranchCurrentAccountResponseBCAMarketingState coreProduct(CoreProduct coreProduct) {
    this.coreProduct = coreProduct;
    return this;
  }

  /**
   * Get coreProduct
   * @return coreProduct
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CoreProduct getCoreProduct() {
    return coreProduct;
  }

  public void setCoreProduct(CoreProduct coreProduct) {
    this.coreProduct = coreProduct;
  }

  public BranchCurrentAccountResponseBCAMarketingState creditInterest(CreditInterest creditInterest) {
    this.creditInterest = creditInterest;
    return this;
  }

  /**
   * Get creditInterest
   * @return creditInterest
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CreditInterest getCreditInterest() {
    return creditInterest;
  }

  public void setCreditInterest(CreditInterest creditInterest) {
    this.creditInterest = creditInterest;
  }

  public BranchCurrentAccountResponseBCAMarketingState eligibility(Eligibility eligibility) {
    this.eligibility = eligibility;
    return this;
  }

  /**
   * Get eligibility
   * @return eligibility
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Eligibility getEligibility() {
    return eligibility;
  }

  public void setEligibility(Eligibility eligibility) {
    this.eligibility = eligibility;
  }

  public BranchCurrentAccountResponseBCAMarketingState featuresAndBenefits(FeaturesAndBenefits featuresAndBenefits) {
    this.featuresAndBenefits = featuresAndBenefits;
    return this;
  }

  /**
   * Get featuresAndBenefits
   * @return featuresAndBenefits
  **/
  @ApiModelProperty(value = "")

  @Valid

  public FeaturesAndBenefits getFeaturesAndBenefits() {
    return featuresAndBenefits;
  }

  public void setFeaturesAndBenefits(FeaturesAndBenefits featuresAndBenefits) {
    this.featuresAndBenefits = featuresAndBenefits;
  }

  public BranchCurrentAccountResponseBCAMarketingState firstMarketedDate(LocalDate firstMarketedDate) {
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

  public BranchCurrentAccountResponseBCAMarketingState identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Unique and unambiguous identification of a  BCA Product Marketing State.
   * @return identification
  **/
  @ApiModelProperty(required = true, value = "Unique and unambiguous identification of a  BCA Product Marketing State.")
  @NotNull

@Size(min=1,max=35) 
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public BranchCurrentAccountResponseBCAMarketingState lastMarketedDate(LocalDate lastMarketedDate) {
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

  public BranchCurrentAccountResponseBCAMarketingState marketingState(MarketingStateEnum marketingState) {
    this.marketingState = marketingState;
    return this;
  }

  /**
   * Describes the marketing state (regular or promotional) of the BCA Product
   * @return marketingState
  **/
  @ApiModelProperty(required = true, value = "Describes the marketing state (regular or promotional) of the BCA Product")
  @NotNull


  public MarketingStateEnum getMarketingState() {
    return marketingState;
  }

  public void setMarketingState(MarketingStateEnum marketingState) {
    this.marketingState = marketingState;
  }

  public BranchCurrentAccountResponseBCAMarketingState notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public BranchCurrentAccountResponseBCAMarketingState addNotesItem(String notesItem) {
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

  public BranchCurrentAccountResponseBCAMarketingState otherFeesCharges(List<BranchCurrentAccountResponseOtherFeesCharges> otherFeesCharges) {
    this.otherFeesCharges = otherFeesCharges;
    return this;
  }

  public BranchCurrentAccountResponseBCAMarketingState addOtherFeesChargesItem(BranchCurrentAccountResponseOtherFeesCharges otherFeesChargesItem) {
    if (this.otherFeesCharges == null) {
      this.otherFeesCharges = new ArrayList<>();
    }
    this.otherFeesCharges.add(otherFeesChargesItem);
    return this;
  }

  /**
   * Contains details of fees and charges which are not associated with either Overdraft or features/benefits
   * @return otherFeesCharges
  **/
  @ApiModelProperty(value = "Contains details of fees and charges which are not associated with either Overdraft or features/benefits")

  @Valid

  public List<BranchCurrentAccountResponseOtherFeesCharges> getOtherFeesCharges() {
    return otherFeesCharges;
  }

  public void setOtherFeesCharges(List<BranchCurrentAccountResponseOtherFeesCharges> otherFeesCharges) {
    this.otherFeesCharges = otherFeesCharges;
  }

  public BranchCurrentAccountResponseBCAMarketingState overdraft(Overdraft overdraft) {
    this.overdraft = overdraft;
    return this;
  }

  /**
   * Get overdraft
   * @return overdraft
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Overdraft getOverdraft() {
    return overdraft;
  }

  public void setOverdraft(Overdraft overdraft) {
    this.overdraft = overdraft;
  }

  public BranchCurrentAccountResponseBCAMarketingState predecessorID(String predecessorID) {
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

  public BranchCurrentAccountResponseBCAMarketingState stateTenureLength(Float stateTenureLength) {
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

  public BranchCurrentAccountResponseBCAMarketingState stateTenurePeriod(StateTenurePeriodEnum stateTenurePeriod) {
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
    BranchCurrentAccountResponseBCAMarketingState branchCurrentAccountResponseBCAMarketingState = (BranchCurrentAccountResponseBCAMarketingState) o;
    return Objects.equals(this.coreProduct, branchCurrentAccountResponseBCAMarketingState.coreProduct) &&
        Objects.equals(this.creditInterest, branchCurrentAccountResponseBCAMarketingState.creditInterest) &&
        Objects.equals(this.eligibility, branchCurrentAccountResponseBCAMarketingState.eligibility) &&
        Objects.equals(this.featuresAndBenefits, branchCurrentAccountResponseBCAMarketingState.featuresAndBenefits) &&
        Objects.equals(this.firstMarketedDate, branchCurrentAccountResponseBCAMarketingState.firstMarketedDate) &&
        Objects.equals(this.identification, branchCurrentAccountResponseBCAMarketingState.identification) &&
        Objects.equals(this.lastMarketedDate, branchCurrentAccountResponseBCAMarketingState.lastMarketedDate) &&
        Objects.equals(this.marketingState, branchCurrentAccountResponseBCAMarketingState.marketingState) &&
        Objects.equals(this.notes, branchCurrentAccountResponseBCAMarketingState.notes) &&
        Objects.equals(this.otherFeesCharges, branchCurrentAccountResponseBCAMarketingState.otherFeesCharges) &&
        Objects.equals(this.overdraft, branchCurrentAccountResponseBCAMarketingState.overdraft) &&
        Objects.equals(this.predecessorID, branchCurrentAccountResponseBCAMarketingState.predecessorID) &&
        Objects.equals(this.stateTenureLength, branchCurrentAccountResponseBCAMarketingState.stateTenureLength) &&
        Objects.equals(this.stateTenurePeriod, branchCurrentAccountResponseBCAMarketingState.stateTenurePeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coreProduct, creditInterest, eligibility, featuresAndBenefits, firstMarketedDate, identification, lastMarketedDate, marketingState, notes, otherFeesCharges, overdraft, predecessorID, stateTenureLength, stateTenurePeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BranchCurrentAccountResponseBCAMarketingState {\n");
    
    sb.append("    coreProduct: ").append(toIndentedString(coreProduct)).append("\n");
    sb.append("    creditInterest: ").append(toIndentedString(creditInterest)).append("\n");
    sb.append("    eligibility: ").append(toIndentedString(eligibility)).append("\n");
    sb.append("    featuresAndBenefits: ").append(toIndentedString(featuresAndBenefits)).append("\n");
    sb.append("    firstMarketedDate: ").append(toIndentedString(firstMarketedDate)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    lastMarketedDate: ").append(toIndentedString(lastMarketedDate)).append("\n");
    sb.append("    marketingState: ").append(toIndentedString(marketingState)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherFeesCharges: ").append(toIndentedString(otherFeesCharges)).append("\n");
    sb.append("    overdraft: ").append(toIndentedString(overdraft)).append("\n");
    sb.append("    predecessorID: ").append(toIndentedString(predecessorID)).append("\n");
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

