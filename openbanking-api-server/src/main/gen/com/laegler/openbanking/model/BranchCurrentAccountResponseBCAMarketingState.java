package com.laegler.openbanking.model;

import com.laegler.openbanking.model.BranchCurrentAccountResponseOtherFeesCharges;
import com.laegler.openbanking.model.CoreProduct;
import com.laegler.openbanking.model.CreditInterest;
import com.laegler.openbanking.model.Eligibility;
import com.laegler.openbanking.model.FeaturesAndBenefits;
import com.laegler.openbanking.model.Overdraft;
import io.swagger.annotations.ApiModel;
import java.time.LocalDate;
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
  * The marketing state (promotional or regular) of the BCA Product.
 **/
@ApiModel(description="The marketing state (promotional or regular) of the BCA Product.")
public class BranchCurrentAccountResponseBCAMarketingState  {
  
  @ApiModelProperty(value = "")
  @Valid
  private CoreProduct coreProduct = null;

  @ApiModelProperty(value = "")
  @Valid
  private CreditInterest creditInterest = null;

  @ApiModelProperty(value = "")
  @Valid
  private Eligibility eligibility = null;

  @ApiModelProperty(value = "")
  @Valid
  private FeaturesAndBenefits featuresAndBenefits = null;

  @ApiModelProperty(value = "Marketing state start date")
 /**
   * Marketing state start date
  **/
  private LocalDate firstMarketedDate = null;

  @ApiModelProperty(required = true, value = "Unique and unambiguous identification of a  BCA Product Marketing State.")
 /**
   * Unique and unambiguous identification of a  BCA Product Marketing State.
  **/
  private String identification = null;

  @ApiModelProperty(value = "Marketing state end date")
 /**
   * Marketing state end date
  **/
  private LocalDate lastMarketedDate = null;


@XmlType(name="MarketingStateEnum")
@XmlEnum(String.class)
public enum MarketingStateEnum {

@XmlEnumValue("Promotional") PROMOTIONAL(String.valueOf("Promotional")), @XmlEnumValue("Regular") REGULAR(String.valueOf("Regular"));


    private String value;

    MarketingStateEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static MarketingStateEnum fromValue(String v) {
        for (MarketingStateEnum b : MarketingStateEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Describes the marketing state (regular or promotional) of the BCA Product")
 /**
   * Describes the marketing state (regular or promotional) of the BCA Product
  **/
  private MarketingStateEnum marketingState = null;

  @ApiModelProperty(value = "Free text for adding details for marketing state")
 /**
   * Free text for adding details for marketing state
  **/
  private List<String> notes = null;

  @ApiModelProperty(value = "Contains details of fees and charges which are not associated with either Overdraft or features/benefits")
  @Valid
 /**
   * Contains details of fees and charges which are not associated with either Overdraft or features/benefits
  **/
  private List<BranchCurrentAccountResponseOtherFeesCharges> otherFeesCharges = null;

  @ApiModelProperty(value = "")
  @Valid
  private Overdraft overdraft = null;

  @ApiModelProperty(value = "Identifies the marketing state that precedes this marketing state")
 /**
   * Identifies the marketing state that precedes this marketing state
  **/
  private String predecessorID = null;

  @ApiModelProperty(value = "The length/duration of a promotional state")
 /**
   * The length/duration of a promotional state
  **/
  private Float stateTenureLength = null;


@XmlType(name="StateTenurePeriodEnum")
@XmlEnum(String.class)
public enum StateTenurePeriodEnum {

@XmlEnumValue("Day") DAY(String.valueOf("Day")), @XmlEnumValue("HalfYear") HALFYEAR(String.valueOf("HalfYear")), @XmlEnumValue("Month") MONTH(String.valueOf("Month")), @XmlEnumValue("Quarter") QUARTER(String.valueOf("Quarter")), @XmlEnumValue("Week") WEEK(String.valueOf("Week")), @XmlEnumValue("AcademicTerm") ACADEMICTERM(String.valueOf("AcademicTerm")), @XmlEnumValue("Year") YEAR(String.valueOf("Year"));


    private String value;

    StateTenurePeriodEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StateTenurePeriodEnum fromValue(String v) {
        for (StateTenurePeriodEnum b : StateTenurePeriodEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "The unit of period (days, weeks, months etc.) of the promotional length")
 /**
   * The unit of period (days, weeks, months etc.) of the promotional length
  **/
  private StateTenurePeriodEnum stateTenurePeriod = null;
 /**
   * Get coreProduct
   * @return coreProduct
  **/
  @JsonProperty("CoreProduct")
  public CoreProduct getCoreProduct() {
    return coreProduct;
  }

  public void setCoreProduct(CoreProduct coreProduct) {
    this.coreProduct = coreProduct;
  }

  public BranchCurrentAccountResponseBCAMarketingState coreProduct(CoreProduct coreProduct) {
    this.coreProduct = coreProduct;
    return this;
  }

 /**
   * Get creditInterest
   * @return creditInterest
  **/
  @JsonProperty("CreditInterest")
  public CreditInterest getCreditInterest() {
    return creditInterest;
  }

  public void setCreditInterest(CreditInterest creditInterest) {
    this.creditInterest = creditInterest;
  }

  public BranchCurrentAccountResponseBCAMarketingState creditInterest(CreditInterest creditInterest) {
    this.creditInterest = creditInterest;
    return this;
  }

 /**
   * Get eligibility
   * @return eligibility
  **/
  @JsonProperty("Eligibility")
  public Eligibility getEligibility() {
    return eligibility;
  }

  public void setEligibility(Eligibility eligibility) {
    this.eligibility = eligibility;
  }

  public BranchCurrentAccountResponseBCAMarketingState eligibility(Eligibility eligibility) {
    this.eligibility = eligibility;
    return this;
  }

 /**
   * Get featuresAndBenefits
   * @return featuresAndBenefits
  **/
  @JsonProperty("FeaturesAndBenefits")
  public FeaturesAndBenefits getFeaturesAndBenefits() {
    return featuresAndBenefits;
  }

  public void setFeaturesAndBenefits(FeaturesAndBenefits featuresAndBenefits) {
    this.featuresAndBenefits = featuresAndBenefits;
  }

  public BranchCurrentAccountResponseBCAMarketingState featuresAndBenefits(FeaturesAndBenefits featuresAndBenefits) {
    this.featuresAndBenefits = featuresAndBenefits;
    return this;
  }

 /**
   * Marketing state start date
   * @return firstMarketedDate
  **/
  @JsonProperty("FirstMarketedDate")
  public LocalDate getFirstMarketedDate() {
    return firstMarketedDate;
  }

  public void setFirstMarketedDate(LocalDate firstMarketedDate) {
    this.firstMarketedDate = firstMarketedDate;
  }

  public BranchCurrentAccountResponseBCAMarketingState firstMarketedDate(LocalDate firstMarketedDate) {
    this.firstMarketedDate = firstMarketedDate;
    return this;
  }

 /**
   * Unique and unambiguous identification of a  BCA Product Marketing State.
   * @return identification
  **/
  @JsonProperty("Identification")
  @NotNull
 @Size(min=1,max=35)  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public BranchCurrentAccountResponseBCAMarketingState identification(String identification) {
    this.identification = identification;
    return this;
  }

 /**
   * Marketing state end date
   * @return lastMarketedDate
  **/
  @JsonProperty("LastMarketedDate")
  public LocalDate getLastMarketedDate() {
    return lastMarketedDate;
  }

  public void setLastMarketedDate(LocalDate lastMarketedDate) {
    this.lastMarketedDate = lastMarketedDate;
  }

  public BranchCurrentAccountResponseBCAMarketingState lastMarketedDate(LocalDate lastMarketedDate) {
    this.lastMarketedDate = lastMarketedDate;
    return this;
  }

 /**
   * Describes the marketing state (regular or promotional) of the BCA Product
   * @return marketingState
  **/
  @JsonProperty("MarketingState")
  @NotNull
  public String getMarketingState() {
    if (marketingState == null) {
      return null;
    }
    return marketingState.value();
  }

  public void setMarketingState(MarketingStateEnum marketingState) {
    this.marketingState = marketingState;
  }

  public BranchCurrentAccountResponseBCAMarketingState marketingState(MarketingStateEnum marketingState) {
    this.marketingState = marketingState;
    return this;
  }

 /**
   * Free text for adding details for marketing state
   * @return notes
  **/
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public BranchCurrentAccountResponseBCAMarketingState notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public BranchCurrentAccountResponseBCAMarketingState addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Contains details of fees and charges which are not associated with either Overdraft or features/benefits
   * @return otherFeesCharges
  **/
  @JsonProperty("OtherFeesCharges")
  public List<BranchCurrentAccountResponseOtherFeesCharges> getOtherFeesCharges() {
    return otherFeesCharges;
  }

  public void setOtherFeesCharges(List<BranchCurrentAccountResponseOtherFeesCharges> otherFeesCharges) {
    this.otherFeesCharges = otherFeesCharges;
  }

  public BranchCurrentAccountResponseBCAMarketingState otherFeesCharges(List<BranchCurrentAccountResponseOtherFeesCharges> otherFeesCharges) {
    this.otherFeesCharges = otherFeesCharges;
    return this;
  }

  public BranchCurrentAccountResponseBCAMarketingState addOtherFeesChargesItem(BranchCurrentAccountResponseOtherFeesCharges otherFeesChargesItem) {
    this.otherFeesCharges.add(otherFeesChargesItem);
    return this;
  }

 /**
   * Get overdraft
   * @return overdraft
  **/
  @JsonProperty("Overdraft")
  public Overdraft getOverdraft() {
    return overdraft;
  }

  public void setOverdraft(Overdraft overdraft) {
    this.overdraft = overdraft;
  }

  public BranchCurrentAccountResponseBCAMarketingState overdraft(Overdraft overdraft) {
    this.overdraft = overdraft;
    return this;
  }

 /**
   * Identifies the marketing state that precedes this marketing state
   * @return predecessorID
  **/
  @JsonProperty("PredecessorID")
 @Size(min=1,max=35)  public String getPredecessorID() {
    return predecessorID;
  }

  public void setPredecessorID(String predecessorID) {
    this.predecessorID = predecessorID;
  }

  public BranchCurrentAccountResponseBCAMarketingState predecessorID(String predecessorID) {
    this.predecessorID = predecessorID;
    return this;
  }

 /**
   * The length/duration of a promotional state
   * @return stateTenureLength
  **/
  @JsonProperty("StateTenureLength")
  public Float getStateTenureLength() {
    return stateTenureLength;
  }

  public void setStateTenureLength(Float stateTenureLength) {
    this.stateTenureLength = stateTenureLength;
  }

  public BranchCurrentAccountResponseBCAMarketingState stateTenureLength(Float stateTenureLength) {
    this.stateTenureLength = stateTenureLength;
    return this;
  }

 /**
   * The unit of period (days, weeks, months etc.) of the promotional length
   * @return stateTenurePeriod
  **/
  @JsonProperty("StateTenurePeriod")
  public String getStateTenurePeriod() {
    if (stateTenurePeriod == null) {
      return null;
    }
    return stateTenurePeriod.value();
  }

  public void setStateTenurePeriod(StateTenurePeriodEnum stateTenurePeriod) {
    this.stateTenurePeriod = stateTenurePeriod;
  }

  public BranchCurrentAccountResponseBCAMarketingState stateTenurePeriod(StateTenurePeriodEnum stateTenurePeriod) {
    this.stateTenurePeriod = stateTenurePeriod;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

