package com.laegler.openbanking.model;

import com.laegler.openbanking.model.CoreProduct1;
import com.laegler.openbanking.model.Eligibility1;
import com.laegler.openbanking.model.FeaturesAndBenefits1;
import com.laegler.openbanking.model.OtherFeesCharges;
import com.laegler.openbanking.model.Repayment;
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
  * The marketing state (promotional or regular) of the CCC Product.
 **/
@ApiModel(description="The marketing state (promotional or regular) of the CCC Product.")
public class CommercialCreditCardResponseCCCMarketingState  {
  
  @ApiModelProperty(required = true, value = "")
  private CoreProduct1 coreProduct = null;

  @ApiModelProperty(required = true, value = "")
  private Eligibility1 eligibility = null;

  @ApiModelProperty(required = true, value = "")
  private FeaturesAndBenefits1 featuresAndBenefits = null;

  @ApiModelProperty(value = "Marketing state start date")
 /**
   * Marketing state start date
  **/
  private LocalDate firstMarketedDate = null;

  @ApiModelProperty(required = true, value = "Unique and unambiguous identification of a  CCC Product Marketing State.")
 /**
   * Unique and unambiguous identification of a  CCC Product Marketing State.
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

  @ApiModelProperty(required = true, value = "Describes the marketing state (regular or promotional) of the CCC Product")
 /**
   * Describes the marketing state (regular or promotional) of the CCC Product
  **/
  private MarketingStateEnum marketingState = null;

  @ApiModelProperty(value = "Free text for adding details for marketing state")
 /**
   * Free text for adding details for marketing state
  **/
  private List<String> notes = null;

  @ApiModelProperty(required = true, value = "")
  private OtherFeesCharges otherFeesCharges = null;

  @ApiModelProperty(value = "Identifies the marketing state that precedes this marketing state")
 /**
   * Identifies the marketing state that precedes this marketing state
  **/
  private String predecessorID = null;

  @ApiModelProperty(value = "")
  private Repayment repayment = null;

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
  public CoreProduct1 getCoreProduct() {
    return coreProduct;
  }

  public void setCoreProduct(CoreProduct1 coreProduct) {
    this.coreProduct = coreProduct;
  }

  public CommercialCreditCardResponseCCCMarketingState coreProduct(CoreProduct1 coreProduct) {
    this.coreProduct = coreProduct;
    return this;
  }

 /**
   * Get eligibility
   * @return eligibility
  **/
  @JsonProperty("Eligibility")
  public Eligibility1 getEligibility() {
    return eligibility;
  }

  public void setEligibility(Eligibility1 eligibility) {
    this.eligibility = eligibility;
  }

  public CommercialCreditCardResponseCCCMarketingState eligibility(Eligibility1 eligibility) {
    this.eligibility = eligibility;
    return this;
  }

 /**
   * Get featuresAndBenefits
   * @return featuresAndBenefits
  **/
  @JsonProperty("FeaturesAndBenefits")
  public FeaturesAndBenefits1 getFeaturesAndBenefits() {
    return featuresAndBenefits;
  }

  public void setFeaturesAndBenefits(FeaturesAndBenefits1 featuresAndBenefits) {
    this.featuresAndBenefits = featuresAndBenefits;
  }

  public CommercialCreditCardResponseCCCMarketingState featuresAndBenefits(FeaturesAndBenefits1 featuresAndBenefits) {
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

  public CommercialCreditCardResponseCCCMarketingState firstMarketedDate(LocalDate firstMarketedDate) {
    this.firstMarketedDate = firstMarketedDate;
    return this;
  }

 /**
   * Unique and unambiguous identification of a  CCC Product Marketing State.
   * @return identification
  **/
  @JsonProperty("Identification")
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public CommercialCreditCardResponseCCCMarketingState identification(String identification) {
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

  public CommercialCreditCardResponseCCCMarketingState lastMarketedDate(LocalDate lastMarketedDate) {
    this.lastMarketedDate = lastMarketedDate;
    return this;
  }

 /**
   * Describes the marketing state (regular or promotional) of the CCC Product
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

  public CommercialCreditCardResponseCCCMarketingState marketingState(MarketingStateEnum marketingState) {
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

  public CommercialCreditCardResponseCCCMarketingState notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public CommercialCreditCardResponseCCCMarketingState addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Get otherFeesCharges
   * @return otherFeesCharges
  **/
  @JsonProperty("OtherFeesCharges")
  public OtherFeesCharges getOtherFeesCharges() {
    return otherFeesCharges;
  }

  public void setOtherFeesCharges(OtherFeesCharges otherFeesCharges) {
    this.otherFeesCharges = otherFeesCharges;
  }

  public CommercialCreditCardResponseCCCMarketingState otherFeesCharges(OtherFeesCharges otherFeesCharges) {
    this.otherFeesCharges = otherFeesCharges;
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

  public CommercialCreditCardResponseCCCMarketingState predecessorID(String predecessorID) {
    this.predecessorID = predecessorID;
    return this;
  }

 /**
   * Get repayment
   * @return repayment
  **/
  @JsonProperty("Repayment")
  public Repayment getRepayment() {
    return repayment;
  }

  public void setRepayment(Repayment repayment) {
    this.repayment = repayment;
  }

  public CommercialCreditCardResponseCCCMarketingState repayment(Repayment repayment) {
    this.repayment = repayment;
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

  public CommercialCreditCardResponseCCCMarketingState stateTenureLength(Float stateTenureLength) {
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

  public CommercialCreditCardResponseCCCMarketingState stateTenurePeriod(StateTenurePeriodEnum stateTenurePeriod) {
    this.stateTenurePeriod = stateTenurePeriod;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

