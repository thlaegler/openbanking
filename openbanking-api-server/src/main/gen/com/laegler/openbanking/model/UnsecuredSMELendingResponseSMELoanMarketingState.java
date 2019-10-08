package com.laegler.openbanking.model;

import com.laegler.openbanking.model.CoreProduct3;
import com.laegler.openbanking.model.Eligibility3;
import com.laegler.openbanking.model.FeaturesAndBenefits3;
import com.laegler.openbanking.model.LoanInterest;
import com.laegler.openbanking.model.OtherFeesCharges3;
import com.laegler.openbanking.model.UnsecuredSMELendingResponseRepayment;
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
  * The marketing state (promotional or regular) of the SME Loan Product.
 **/
@ApiModel(description="The marketing state (promotional or regular) of the SME Loan Product.")
public class UnsecuredSMELendingResponseSMELoanMarketingState  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private CoreProduct3 coreProduct = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private Eligibility3 eligibility = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private FeaturesAndBenefits3 featuresAndBenefits = null;

  @ApiModelProperty(value = "Marketing state start date")
 /**
   * Marketing state start date
  **/
  private LocalDate firstMarketedDate = null;

  @ApiModelProperty(required = true, value = "Unique and unambiguous identification of a  SME Loan Product Marketing State.")
 /**
   * Unique and unambiguous identification of a  SME Loan Product Marketing State.
  **/
  private String identification = null;

  @ApiModelProperty(value = "Marketing state end date")
 /**
   * Marketing state end date
  **/
  private LocalDate lastMarketedDate = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private LoanInterest loanInterest = null;


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

  @ApiModelProperty(required = true, value = "Describes the marketing state (regular or promotional) of the SME Loan Product")
 /**
   * Describes the marketing state (regular or promotional) of the SME Loan Product
  **/
  private MarketingStateEnum marketingState = null;

  @ApiModelProperty(value = "Free text for adding details for marketing state")
 /**
   * Free text for adding details for marketing state
  **/
  private List<String> notes = null;

  @ApiModelProperty(value = "")
  @Valid
  private OtherFeesCharges3 otherFeesCharges = null;

  @ApiModelProperty(value = "Identifies the marketing state that precedes this marketing state")
 /**
   * Identifies the marketing state that precedes this marketing state
  **/
  private String predecessorID = null;

  @ApiModelProperty(required = true, value = "Repayment details of the Loan product")
  @Valid
 /**
   * Repayment details of the Loan product
  **/
  private List<UnsecuredSMELendingResponseRepayment> repayment = new ArrayList<UnsecuredSMELendingResponseRepayment>();

  @ApiModelProperty(value = "The length/duration of a promotional state")
 /**
   * The length/duration of a promotional state
  **/
  private Float stateTenureLength = null;


@XmlType(name="StateTenurePeriodEnum")
@XmlEnum(String.class)
public enum StateTenurePeriodEnum {

@XmlEnumValue("Day") DAY(String.valueOf("Day")), @XmlEnumValue("Half Year") HALF_YEAR(String.valueOf("Half Year")), @XmlEnumValue("Month") MONTH(String.valueOf("Month")), @XmlEnumValue("Quarter") QUARTER(String.valueOf("Quarter")), @XmlEnumValue("Week") WEEK(String.valueOf("Week")), @XmlEnumValue("Year") YEAR(String.valueOf("Year"));


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
  @NotNull
  public CoreProduct3 getCoreProduct() {
    return coreProduct;
  }

  public void setCoreProduct(CoreProduct3 coreProduct) {
    this.coreProduct = coreProduct;
  }

  public UnsecuredSMELendingResponseSMELoanMarketingState coreProduct(CoreProduct3 coreProduct) {
    this.coreProduct = coreProduct;
    return this;
  }

 /**
   * Get eligibility
   * @return eligibility
  **/
  @JsonProperty("Eligibility")
  @NotNull
  public Eligibility3 getEligibility() {
    return eligibility;
  }

  public void setEligibility(Eligibility3 eligibility) {
    this.eligibility = eligibility;
  }

  public UnsecuredSMELendingResponseSMELoanMarketingState eligibility(Eligibility3 eligibility) {
    this.eligibility = eligibility;
    return this;
  }

 /**
   * Get featuresAndBenefits
   * @return featuresAndBenefits
  **/
  @JsonProperty("FeaturesAndBenefits")
  @NotNull
  public FeaturesAndBenefits3 getFeaturesAndBenefits() {
    return featuresAndBenefits;
  }

  public void setFeaturesAndBenefits(FeaturesAndBenefits3 featuresAndBenefits) {
    this.featuresAndBenefits = featuresAndBenefits;
  }

  public UnsecuredSMELendingResponseSMELoanMarketingState featuresAndBenefits(FeaturesAndBenefits3 featuresAndBenefits) {
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

  public UnsecuredSMELendingResponseSMELoanMarketingState firstMarketedDate(LocalDate firstMarketedDate) {
    this.firstMarketedDate = firstMarketedDate;
    return this;
  }

 /**
   * Unique and unambiguous identification of a  SME Loan Product Marketing State.
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

  public UnsecuredSMELendingResponseSMELoanMarketingState identification(String identification) {
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

  public UnsecuredSMELendingResponseSMELoanMarketingState lastMarketedDate(LocalDate lastMarketedDate) {
    this.lastMarketedDate = lastMarketedDate;
    return this;
  }

 /**
   * Get loanInterest
   * @return loanInterest
  **/
  @JsonProperty("LoanInterest")
  @NotNull
  public LoanInterest getLoanInterest() {
    return loanInterest;
  }

  public void setLoanInterest(LoanInterest loanInterest) {
    this.loanInterest = loanInterest;
  }

  public UnsecuredSMELendingResponseSMELoanMarketingState loanInterest(LoanInterest loanInterest) {
    this.loanInterest = loanInterest;
    return this;
  }

 /**
   * Describes the marketing state (regular or promotional) of the SME Loan Product
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

  public UnsecuredSMELendingResponseSMELoanMarketingState marketingState(MarketingStateEnum marketingState) {
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

  public UnsecuredSMELendingResponseSMELoanMarketingState notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public UnsecuredSMELendingResponseSMELoanMarketingState addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Get otherFeesCharges
   * @return otherFeesCharges
  **/
  @JsonProperty("OtherFeesCharges")
  public OtherFeesCharges3 getOtherFeesCharges() {
    return otherFeesCharges;
  }

  public void setOtherFeesCharges(OtherFeesCharges3 otherFeesCharges) {
    this.otherFeesCharges = otherFeesCharges;
  }

  public UnsecuredSMELendingResponseSMELoanMarketingState otherFeesCharges(OtherFeesCharges3 otherFeesCharges) {
    this.otherFeesCharges = otherFeesCharges;
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

  public UnsecuredSMELendingResponseSMELoanMarketingState predecessorID(String predecessorID) {
    this.predecessorID = predecessorID;
    return this;
  }

 /**
   * Repayment details of the Loan product
   * @return repayment
  **/
  @JsonProperty("Repayment")
  @NotNull
 @Size(min=1)  public List<UnsecuredSMELendingResponseRepayment> getRepayment() {
    return repayment;
  }

  public void setRepayment(List<UnsecuredSMELendingResponseRepayment> repayment) {
    this.repayment = repayment;
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

  public UnsecuredSMELendingResponseSMELoanMarketingState stateTenureLength(Float stateTenureLength) {
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

  public UnsecuredSMELendingResponseSMELoanMarketingState stateTenurePeriod(StateTenurePeriodEnum stateTenurePeriod) {
    this.stateTenurePeriod = stateTenurePeriod;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

