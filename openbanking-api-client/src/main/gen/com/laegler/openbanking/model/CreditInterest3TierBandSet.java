package com.laegler.openbanking.model;

import com.laegler.openbanking.model.CreditInterest3CreditInterestEligibility;
import com.laegler.openbanking.model.CreditInterest3TierBand;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;

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
  * The group of tiers or bands for which credit interest can be applied.
 **/
@ApiModel(description="The group of tiers or bands for which credit interest can be applied.")
public class CreditInterest3TierBandSet  {
  

@XmlType(name="CalculationMethodEnum")
@XmlEnum(String.class)
public enum CalculationMethodEnum {

@XmlEnumValue("Compound") COMPOUND(String.valueOf("Compound")), @XmlEnumValue("SimpleInterest") SIMPLEINTEREST(String.valueOf("SimpleInterest"));


    private String value;

    CalculationMethodEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CalculationMethodEnum fromValue(String v) {
        for (CalculationMethodEnum b : CalculationMethodEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Methods of calculating interest")
 /**
   * Methods of calculating interest
  **/
  private CalculationMethodEnum calculationMethod = null;

  @ApiModelProperty(value = "Eligibility for credit interest")
 /**
   * Eligibility for credit interest
  **/
  private List<CreditInterest3CreditInterestEligibility> creditInterestEligibility = null;


@XmlType(name="DestinationEnum")
@XmlEnum(String.class)
public enum DestinationEnum {

@XmlEnumValue("PayAway") PAYAWAY(String.valueOf("PayAway")), @XmlEnumValue("SelfCredit") SELFCREDIT(String.valueOf("SelfCredit"));


    private String value;

    DestinationEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DestinationEnum fromValue(String v) {
        for (DestinationEnum b : DestinationEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Describes whether accrued interest is payable only to the PCA or to another bank account")
 /**
   * Describes whether accrued interest is payable only to the PCA or to another bank account
  **/
  private DestinationEnum destination = null;

  @ApiModelProperty(value = "Optional additional notes to supplement the Tier Band Set details")
 /**
   * Optional additional notes to supplement the Tier Band Set details
  **/
  private List<String> notes = null;

  @ApiModelProperty(required = true, value = "Tier Band Details")
 /**
   * Tier Band Details
  **/
  private List<CreditInterest3TierBand> tierBand = new ArrayList<CreditInterest3TierBand>();


@XmlType(name="TierBandMethodEnum")
@XmlEnum(String.class)
public enum TierBandMethodEnum {

@XmlEnumValue("Tiered") TIERED(String.valueOf("Tiered")), @XmlEnumValue("Whole") WHOLE(String.valueOf("Whole"));


    private String value;

    TierBandMethodEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TierBandMethodEnum fromValue(String v) {
        for (TierBandMethodEnum b : TierBandMethodEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "The methodology of how credit interest is paid/applied. It can be:-  1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases.  2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance.  3. Whole The same interest rate is applied irrespective of the PCA balance")
 /**
   * The methodology of how credit interest is paid/applied. It can be:-  1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases.  2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance.  3. Whole The same interest rate is applied irrespective of the PCA balance
  **/
  private TierBandMethodEnum tierBandMethod = null;
 /**
   * Methods of calculating interest
   * @return calculationMethod
  **/
  @JsonProperty("CalculationMethod")
  public String getCalculationMethod() {
    if (calculationMethod == null) {
      return null;
    }
    return calculationMethod.value();
  }

  public void setCalculationMethod(CalculationMethodEnum calculationMethod) {
    this.calculationMethod = calculationMethod;
  }

  public CreditInterest3TierBandSet calculationMethod(CalculationMethodEnum calculationMethod) {
    this.calculationMethod = calculationMethod;
    return this;
  }

 /**
   * Eligibility for credit interest
   * @return creditInterestEligibility
  **/
  @JsonProperty("CreditInterestEligibility")
  public List<CreditInterest3CreditInterestEligibility> getCreditInterestEligibility() {
    return creditInterestEligibility;
  }

  public void setCreditInterestEligibility(List<CreditInterest3CreditInterestEligibility> creditInterestEligibility) {
    this.creditInterestEligibility = creditInterestEligibility;
  }

  public CreditInterest3TierBandSet creditInterestEligibility(List<CreditInterest3CreditInterestEligibility> creditInterestEligibility) {
    this.creditInterestEligibility = creditInterestEligibility;
    return this;
  }

  public CreditInterest3TierBandSet addCreditInterestEligibilityItem(CreditInterest3CreditInterestEligibility creditInterestEligibilityItem) {
    this.creditInterestEligibility.add(creditInterestEligibilityItem);
    return this;
  }

 /**
   * Describes whether accrued interest is payable only to the PCA or to another bank account
   * @return destination
  **/
  @JsonProperty("Destination")
  public String getDestination() {
    if (destination == null) {
      return null;
    }
    return destination.value();
  }

  public void setDestination(DestinationEnum destination) {
    this.destination = destination;
  }

  public CreditInterest3TierBandSet destination(DestinationEnum destination) {
    this.destination = destination;
    return this;
  }

 /**
   * Optional additional notes to supplement the Tier Band Set details
   * @return notes
  **/
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public CreditInterest3TierBandSet notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public CreditInterest3TierBandSet addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Tier Band Details
   * @return tierBand
  **/
  @JsonProperty("TierBand")
  public List<CreditInterest3TierBand> getTierBand() {
    return tierBand;
  }

  public void setTierBand(List<CreditInterest3TierBand> tierBand) {
    this.tierBand = tierBand;
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
   * The methodology of how credit interest is paid/applied. It can be:-  1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases.  2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance.  3. Whole The same interest rate is applied irrespective of the PCA balance
   * @return tierBandMethod
  **/
  @JsonProperty("TierBandMethod")
  public String getTierBandMethod() {
    if (tierBandMethod == null) {
      return null;
    }
    return tierBandMethod.value();
  }

  public void setTierBandMethod(TierBandMethodEnum tierBandMethod) {
    this.tierBandMethod = tierBandMethod;
  }

  public CreditInterest3TierBandSet tierBandMethod(TierBandMethodEnum tierBandMethod) {
    this.tierBandMethod = tierBandMethod;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

