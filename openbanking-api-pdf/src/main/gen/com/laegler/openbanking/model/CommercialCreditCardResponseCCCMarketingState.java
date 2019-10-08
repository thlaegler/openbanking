package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.laegler.openbanking.model.CoreProduct1;
import com.laegler.openbanking.model.Eligibility1;
import com.laegler.openbanking.model.FeaturesAndBenefits1;
import com.laegler.openbanking.model.OtherFeesCharges;
import com.laegler.openbanking.model.Repayment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The marketing state (promotional or regular) of the CCC Product.
 */
@ApiModel(description = "The marketing state (promotional or regular) of the CCC Product.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class CommercialCreditCardResponseCCCMarketingState   {
  @JsonProperty("CoreProduct")
  private CoreProduct1 coreProduct = null;

  @JsonProperty("Eligibility")
  private Eligibility1 eligibility = null;

  @JsonProperty("FeaturesAndBenefits")
  private FeaturesAndBenefits1 featuresAndBenefits = null;

  @JsonProperty("FirstMarketedDate")
  private LocalDate firstMarketedDate = null;

  @JsonProperty("Identification")
  private String identification = null;

  @JsonProperty("LastMarketedDate")
  private LocalDate lastMarketedDate = null;

  /**
   * Describes the marketing state (regular or promotional) of the CCC Product
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
  private OtherFeesCharges otherFeesCharges = null;

  @JsonProperty("PredecessorID")
  private String predecessorID = null;

  @JsonProperty("Repayment")
  private Repayment repayment = null;

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

  public CommercialCreditCardResponseCCCMarketingState coreProduct(CoreProduct1 coreProduct) {
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

  public CoreProduct1 getCoreProduct() {
    return coreProduct;
  }

  public void setCoreProduct(CoreProduct1 coreProduct) {
    this.coreProduct = coreProduct;
  }

  public CommercialCreditCardResponseCCCMarketingState eligibility(Eligibility1 eligibility) {
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

  public Eligibility1 getEligibility() {
    return eligibility;
  }

  public void setEligibility(Eligibility1 eligibility) {
    this.eligibility = eligibility;
  }

  public CommercialCreditCardResponseCCCMarketingState featuresAndBenefits(FeaturesAndBenefits1 featuresAndBenefits) {
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

  public FeaturesAndBenefits1 getFeaturesAndBenefits() {
    return featuresAndBenefits;
  }

  public void setFeaturesAndBenefits(FeaturesAndBenefits1 featuresAndBenefits) {
    this.featuresAndBenefits = featuresAndBenefits;
  }

  public CommercialCreditCardResponseCCCMarketingState firstMarketedDate(LocalDate firstMarketedDate) {
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

  public CommercialCreditCardResponseCCCMarketingState identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Unique and unambiguous identification of a  CCC Product Marketing State.
   * @return identification
  **/
  @ApiModelProperty(required = true, value = "Unique and unambiguous identification of a  CCC Product Marketing State.")
  @NotNull

@Size(min=1,max=35) 
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public CommercialCreditCardResponseCCCMarketingState lastMarketedDate(LocalDate lastMarketedDate) {
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

  public CommercialCreditCardResponseCCCMarketingState marketingState(MarketingStateEnum marketingState) {
    this.marketingState = marketingState;
    return this;
  }

  /**
   * Describes the marketing state (regular or promotional) of the CCC Product
   * @return marketingState
  **/
  @ApiModelProperty(required = true, value = "Describes the marketing state (regular or promotional) of the CCC Product")
  @NotNull


  public MarketingStateEnum getMarketingState() {
    return marketingState;
  }

  public void setMarketingState(MarketingStateEnum marketingState) {
    this.marketingState = marketingState;
  }

  public CommercialCreditCardResponseCCCMarketingState notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public CommercialCreditCardResponseCCCMarketingState addNotesItem(String notesItem) {
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

  public CommercialCreditCardResponseCCCMarketingState otherFeesCharges(OtherFeesCharges otherFeesCharges) {
    this.otherFeesCharges = otherFeesCharges;
    return this;
  }

  /**
   * Get otherFeesCharges
   * @return otherFeesCharges
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OtherFeesCharges getOtherFeesCharges() {
    return otherFeesCharges;
  }

  public void setOtherFeesCharges(OtherFeesCharges otherFeesCharges) {
    this.otherFeesCharges = otherFeesCharges;
  }

  public CommercialCreditCardResponseCCCMarketingState predecessorID(String predecessorID) {
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

  public CommercialCreditCardResponseCCCMarketingState repayment(Repayment repayment) {
    this.repayment = repayment;
    return this;
  }

  /**
   * Get repayment
   * @return repayment
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Repayment getRepayment() {
    return repayment;
  }

  public void setRepayment(Repayment repayment) {
    this.repayment = repayment;
  }

  public CommercialCreditCardResponseCCCMarketingState stateTenureLength(Float stateTenureLength) {
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

  public CommercialCreditCardResponseCCCMarketingState stateTenurePeriod(StateTenurePeriodEnum stateTenurePeriod) {
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
    CommercialCreditCardResponseCCCMarketingState commercialCreditCardResponseCCCMarketingState = (CommercialCreditCardResponseCCCMarketingState) o;
    return Objects.equals(this.coreProduct, commercialCreditCardResponseCCCMarketingState.coreProduct) &&
        Objects.equals(this.eligibility, commercialCreditCardResponseCCCMarketingState.eligibility) &&
        Objects.equals(this.featuresAndBenefits, commercialCreditCardResponseCCCMarketingState.featuresAndBenefits) &&
        Objects.equals(this.firstMarketedDate, commercialCreditCardResponseCCCMarketingState.firstMarketedDate) &&
        Objects.equals(this.identification, commercialCreditCardResponseCCCMarketingState.identification) &&
        Objects.equals(this.lastMarketedDate, commercialCreditCardResponseCCCMarketingState.lastMarketedDate) &&
        Objects.equals(this.marketingState, commercialCreditCardResponseCCCMarketingState.marketingState) &&
        Objects.equals(this.notes, commercialCreditCardResponseCCCMarketingState.notes) &&
        Objects.equals(this.otherFeesCharges, commercialCreditCardResponseCCCMarketingState.otherFeesCharges) &&
        Objects.equals(this.predecessorID, commercialCreditCardResponseCCCMarketingState.predecessorID) &&
        Objects.equals(this.repayment, commercialCreditCardResponseCCCMarketingState.repayment) &&
        Objects.equals(this.stateTenureLength, commercialCreditCardResponseCCCMarketingState.stateTenureLength) &&
        Objects.equals(this.stateTenurePeriod, commercialCreditCardResponseCCCMarketingState.stateTenurePeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coreProduct, eligibility, featuresAndBenefits, firstMarketedDate, identification, lastMarketedDate, marketingState, notes, otherFeesCharges, predecessorID, repayment, stateTenureLength, stateTenurePeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommercialCreditCardResponseCCCMarketingState {\n");
    
    sb.append("    coreProduct: ").append(toIndentedString(coreProduct)).append("\n");
    sb.append("    eligibility: ").append(toIndentedString(eligibility)).append("\n");
    sb.append("    featuresAndBenefits: ").append(toIndentedString(featuresAndBenefits)).append("\n");
    sb.append("    firstMarketedDate: ").append(toIndentedString(firstMarketedDate)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    lastMarketedDate: ").append(toIndentedString(lastMarketedDate)).append("\n");
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

