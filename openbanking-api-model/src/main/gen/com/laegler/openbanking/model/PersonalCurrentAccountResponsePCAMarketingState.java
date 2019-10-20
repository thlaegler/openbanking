package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.laegler.openbanking.model.CoreProduct2;
import com.laegler.openbanking.model.CreditInterest3;
import com.laegler.openbanking.model.Eligibility2;
import com.laegler.openbanking.model.FeaturesAndBenefits2;
import com.laegler.openbanking.model.OtherFeesCharges2;
import com.laegler.openbanking.model.Overdraft3;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes the type of the known state (regular, promotional )  of the product.
 */
@ApiModel(description = "Describes the type of the known state (regular, promotional )  of the product.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class PersonalCurrentAccountResponsePCAMarketingState   {
  @JsonProperty("CoreProduct")
  private CoreProduct2 coreProduct = null;

  @JsonProperty("CreditInterest")
  private CreditInterest3 creditInterest = null;

  @JsonProperty("Eligibility")
  private Eligibility2 eligibility = null;

  @JsonProperty("FeaturesAndBenefits")
  private FeaturesAndBenefits2 featuresAndBenefits = null;

  @JsonProperty("FirstMarketedDate")
  private LocalDate firstMarketedDate = null;

  @JsonProperty("Identification")
  private String identification = null;

  @JsonProperty("LastMarketedDate")
  private LocalDate lastMarketedDate = null;

  /**
   * Describes the marketing state (regular or promotional) for which the eligibility criteria applies
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
  private OtherFeesCharges2 otherFeesCharges = null;

  @JsonProperty("Overdraft")
  private Overdraft3 overdraft = null;

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

  public PersonalCurrentAccountResponsePCAMarketingState coreProduct(CoreProduct2 coreProduct) {
    this.coreProduct = coreProduct;
    return this;
  }

  /**
   * Get coreProduct
   * @return coreProduct
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CoreProduct2 getCoreProduct() {
    return coreProduct;
  }

  public void setCoreProduct(CoreProduct2 coreProduct) {
    this.coreProduct = coreProduct;
  }

  public PersonalCurrentAccountResponsePCAMarketingState creditInterest(CreditInterest3 creditInterest) {
    this.creditInterest = creditInterest;
    return this;
  }

  /**
   * Get creditInterest
   * @return creditInterest
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CreditInterest3 getCreditInterest() {
    return creditInterest;
  }

  public void setCreditInterest(CreditInterest3 creditInterest) {
    this.creditInterest = creditInterest;
  }

  public PersonalCurrentAccountResponsePCAMarketingState eligibility(Eligibility2 eligibility) {
    this.eligibility = eligibility;
    return this;
  }

  /**
   * Get eligibility
   * @return eligibility
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Eligibility2 getEligibility() {
    return eligibility;
  }

  public void setEligibility(Eligibility2 eligibility) {
    this.eligibility = eligibility;
  }

  public PersonalCurrentAccountResponsePCAMarketingState featuresAndBenefits(FeaturesAndBenefits2 featuresAndBenefits) {
    this.featuresAndBenefits = featuresAndBenefits;
    return this;
  }

  /**
   * Get featuresAndBenefits
   * @return featuresAndBenefits
  **/
  @ApiModelProperty(value = "")

  @Valid

  public FeaturesAndBenefits2 getFeaturesAndBenefits() {
    return featuresAndBenefits;
  }

  public void setFeaturesAndBenefits(FeaturesAndBenefits2 featuresAndBenefits) {
    this.featuresAndBenefits = featuresAndBenefits;
  }

  public PersonalCurrentAccountResponsePCAMarketingState firstMarketedDate(LocalDate firstMarketedDate) {
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

  public PersonalCurrentAccountResponsePCAMarketingState identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Unique and unambiguous identification of a  Eligibility Marketing state.
   * @return identification
  **/
  @ApiModelProperty(required = true, value = "Unique and unambiguous identification of a  Eligibility Marketing state.")
  @NotNull

@Size(min=1,max=35) 
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public PersonalCurrentAccountResponsePCAMarketingState lastMarketedDate(LocalDate lastMarketedDate) {
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

  public PersonalCurrentAccountResponsePCAMarketingState marketingState(MarketingStateEnum marketingState) {
    this.marketingState = marketingState;
    return this;
  }

  /**
   * Describes the marketing state (regular or promotional) for which the eligibility criteria applies
   * @return marketingState
  **/
  @ApiModelProperty(required = true, value = "Describes the marketing state (regular or promotional) for which the eligibility criteria applies")
  @NotNull


  public MarketingStateEnum getMarketingState() {
    return marketingState;
  }

  public void setMarketingState(MarketingStateEnum marketingState) {
    this.marketingState = marketingState;
  }

  public PersonalCurrentAccountResponsePCAMarketingState notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public PersonalCurrentAccountResponsePCAMarketingState addNotesItem(String notesItem) {
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

  public PersonalCurrentAccountResponsePCAMarketingState otherFeesCharges(OtherFeesCharges2 otherFeesCharges) {
    this.otherFeesCharges = otherFeesCharges;
    return this;
  }

  /**
   * Get otherFeesCharges
   * @return otherFeesCharges
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OtherFeesCharges2 getOtherFeesCharges() {
    return otherFeesCharges;
  }

  public void setOtherFeesCharges(OtherFeesCharges2 otherFeesCharges) {
    this.otherFeesCharges = otherFeesCharges;
  }

  public PersonalCurrentAccountResponsePCAMarketingState overdraft(Overdraft3 overdraft) {
    this.overdraft = overdraft;
    return this;
  }

  /**
   * Get overdraft
   * @return overdraft
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Overdraft3 getOverdraft() {
    return overdraft;
  }

  public void setOverdraft(Overdraft3 overdraft) {
    this.overdraft = overdraft;
  }

  public PersonalCurrentAccountResponsePCAMarketingState predecessorID(String predecessorID) {
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

  public PersonalCurrentAccountResponsePCAMarketingState stateTenureLength(Float stateTenureLength) {
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

  public PersonalCurrentAccountResponsePCAMarketingState stateTenurePeriod(StateTenurePeriodEnum stateTenurePeriod) {
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
    PersonalCurrentAccountResponsePCAMarketingState personalCurrentAccountResponsePCAMarketingState = (PersonalCurrentAccountResponsePCAMarketingState) o;
    return Objects.equals(this.coreProduct, personalCurrentAccountResponsePCAMarketingState.coreProduct) &&
        Objects.equals(this.creditInterest, personalCurrentAccountResponsePCAMarketingState.creditInterest) &&
        Objects.equals(this.eligibility, personalCurrentAccountResponsePCAMarketingState.eligibility) &&
        Objects.equals(this.featuresAndBenefits, personalCurrentAccountResponsePCAMarketingState.featuresAndBenefits) &&
        Objects.equals(this.firstMarketedDate, personalCurrentAccountResponsePCAMarketingState.firstMarketedDate) &&
        Objects.equals(this.identification, personalCurrentAccountResponsePCAMarketingState.identification) &&
        Objects.equals(this.lastMarketedDate, personalCurrentAccountResponsePCAMarketingState.lastMarketedDate) &&
        Objects.equals(this.marketingState, personalCurrentAccountResponsePCAMarketingState.marketingState) &&
        Objects.equals(this.notes, personalCurrentAccountResponsePCAMarketingState.notes) &&
        Objects.equals(this.otherFeesCharges, personalCurrentAccountResponsePCAMarketingState.otherFeesCharges) &&
        Objects.equals(this.overdraft, personalCurrentAccountResponsePCAMarketingState.overdraft) &&
        Objects.equals(this.predecessorID, personalCurrentAccountResponsePCAMarketingState.predecessorID) &&
        Objects.equals(this.stateTenureLength, personalCurrentAccountResponsePCAMarketingState.stateTenureLength) &&
        Objects.equals(this.stateTenurePeriod, personalCurrentAccountResponsePCAMarketingState.stateTenurePeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coreProduct, creditInterest, eligibility, featuresAndBenefits, firstMarketedDate, identification, lastMarketedDate, marketingState, notes, otherFeesCharges, overdraft, predecessorID, stateTenureLength, stateTenurePeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalCurrentAccountResponsePCAMarketingState {\n");
    
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

