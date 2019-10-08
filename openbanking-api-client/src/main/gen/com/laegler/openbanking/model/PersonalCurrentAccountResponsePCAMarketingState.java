package com.laegler.openbanking.model;

import com.laegler.openbanking.model.CoreProduct2;
import com.laegler.openbanking.model.CreditInterest3;
import com.laegler.openbanking.model.Eligibility2;
import com.laegler.openbanking.model.FeaturesAndBenefits2;
import com.laegler.openbanking.model.OtherFeesCharges2;
import com.laegler.openbanking.model.Overdraft3;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

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
  * Describes the type of the known state (regular, promotional )  of the product.
 **/
@ApiModel(description="Describes the type of the known state (regular, promotional )  of the product.")
public class PersonalCurrentAccountResponsePCAMarketingState  {
  
  @ApiModelProperty(value = "")
  private CoreProduct2 coreProduct = null;

  @ApiModelProperty(value = "")
  private CreditInterest3 creditInterest = null;

  @ApiModelProperty(value = "")
  private Eligibility2 eligibility = null;

  @ApiModelProperty(value = "")
  private FeaturesAndBenefits2 featuresAndBenefits = null;

  @ApiModelProperty(value = "Marketing state start date")
 /**
   * Marketing state start date
  **/
  private LocalDate firstMarketedDate = null;

  @ApiModelProperty(required = true, value = "Unique and unambiguous identification of a  Eligibility Marketing state.")
 /**
   * Unique and unambiguous identification of a  Eligibility Marketing state.
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

  @ApiModelProperty(required = true, value = "Describes the marketing state (regular or promotional) for which the eligibility criteria applies")
 /**
   * Describes the marketing state (regular or promotional) for which the eligibility criteria applies
  **/
  private MarketingStateEnum marketingState = null;

  @ApiModelProperty(value = "Free text for adding details for marketing state")
 /**
   * Free text for adding details for marketing state
  **/
  private List<String> notes = null;

  @ApiModelProperty(value = "")
  private OtherFeesCharges2 otherFeesCharges = null;

  @ApiModelProperty(value = "")
  private Overdraft3 overdraft = null;

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
  public CoreProduct2 getCoreProduct() {
    return coreProduct;
  }

  public void setCoreProduct(CoreProduct2 coreProduct) {
    this.coreProduct = coreProduct;
  }

  public PersonalCurrentAccountResponsePCAMarketingState coreProduct(CoreProduct2 coreProduct) {
    this.coreProduct = coreProduct;
    return this;
  }

 /**
   * Get creditInterest
   * @return creditInterest
  **/
  @JsonProperty("CreditInterest")
  public CreditInterest3 getCreditInterest() {
    return creditInterest;
  }

  public void setCreditInterest(CreditInterest3 creditInterest) {
    this.creditInterest = creditInterest;
  }

  public PersonalCurrentAccountResponsePCAMarketingState creditInterest(CreditInterest3 creditInterest) {
    this.creditInterest = creditInterest;
    return this;
  }

 /**
   * Get eligibility
   * @return eligibility
  **/
  @JsonProperty("Eligibility")
  public Eligibility2 getEligibility() {
    return eligibility;
  }

  public void setEligibility(Eligibility2 eligibility) {
    this.eligibility = eligibility;
  }

  public PersonalCurrentAccountResponsePCAMarketingState eligibility(Eligibility2 eligibility) {
    this.eligibility = eligibility;
    return this;
  }

 /**
   * Get featuresAndBenefits
   * @return featuresAndBenefits
  **/
  @JsonProperty("FeaturesAndBenefits")
  public FeaturesAndBenefits2 getFeaturesAndBenefits() {
    return featuresAndBenefits;
  }

  public void setFeaturesAndBenefits(FeaturesAndBenefits2 featuresAndBenefits) {
    this.featuresAndBenefits = featuresAndBenefits;
  }

  public PersonalCurrentAccountResponsePCAMarketingState featuresAndBenefits(FeaturesAndBenefits2 featuresAndBenefits) {
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

  public PersonalCurrentAccountResponsePCAMarketingState firstMarketedDate(LocalDate firstMarketedDate) {
    this.firstMarketedDate = firstMarketedDate;
    return this;
  }

 /**
   * Unique and unambiguous identification of a  Eligibility Marketing state.
   * @return identification
  **/
  @JsonProperty("Identification")
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public PersonalCurrentAccountResponsePCAMarketingState identification(String identification) {
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

  public PersonalCurrentAccountResponsePCAMarketingState lastMarketedDate(LocalDate lastMarketedDate) {
    this.lastMarketedDate = lastMarketedDate;
    return this;
  }

 /**
   * Describes the marketing state (regular or promotional) for which the eligibility criteria applies
   * @return marketingState
  **/
  @JsonProperty("MarketingState")
  public String getMarketingState() {
    if (marketingState == null) {
      return null;
    }
    return marketingState.value();
  }

  public void setMarketingState(MarketingStateEnum marketingState) {
    this.marketingState = marketingState;
  }

  public PersonalCurrentAccountResponsePCAMarketingState marketingState(MarketingStateEnum marketingState) {
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

  public PersonalCurrentAccountResponsePCAMarketingState notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public PersonalCurrentAccountResponsePCAMarketingState addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Get otherFeesCharges
   * @return otherFeesCharges
  **/
  @JsonProperty("OtherFeesCharges")
  public OtherFeesCharges2 getOtherFeesCharges() {
    return otherFeesCharges;
  }

  public void setOtherFeesCharges(OtherFeesCharges2 otherFeesCharges) {
    this.otherFeesCharges = otherFeesCharges;
  }

  public PersonalCurrentAccountResponsePCAMarketingState otherFeesCharges(OtherFeesCharges2 otherFeesCharges) {
    this.otherFeesCharges = otherFeesCharges;
    return this;
  }

 /**
   * Get overdraft
   * @return overdraft
  **/
  @JsonProperty("Overdraft")
  public Overdraft3 getOverdraft() {
    return overdraft;
  }

  public void setOverdraft(Overdraft3 overdraft) {
    this.overdraft = overdraft;
  }

  public PersonalCurrentAccountResponsePCAMarketingState overdraft(Overdraft3 overdraft) {
    this.overdraft = overdraft;
    return this;
  }

 /**
   * Identifies the marketing state that precedes this marketing state
   * @return predecessorID
  **/
  @JsonProperty("PredecessorID")
  public String getPredecessorID() {
    return predecessorID;
  }

  public void setPredecessorID(String predecessorID) {
    this.predecessorID = predecessorID;
  }

  public PersonalCurrentAccountResponsePCAMarketingState predecessorID(String predecessorID) {
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

  public PersonalCurrentAccountResponsePCAMarketingState stateTenureLength(Float stateTenureLength) {
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

  public PersonalCurrentAccountResponsePCAMarketingState stateTenurePeriod(StateTenurePeriodEnum stateTenurePeriod) {
    this.stateTenurePeriod = stateTenurePeriod;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

