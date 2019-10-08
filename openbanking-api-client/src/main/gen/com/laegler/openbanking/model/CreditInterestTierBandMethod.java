package com.laegler.openbanking.model;

import com.laegler.openbanking.model.TierBand;
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

public class CreditInterestTierBandMethod  {
  

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

  @ApiModelProperty(value = "Describes whether accrued interest is payable only to the BCA or to another bank account")
 /**
   * Describes whether accrued interest is payable only to the BCA or to another bank account
  **/
  private DestinationEnum destination = null;

  @ApiModelProperty(value = "Optional additional notes to supplement the Tier Band Set details")
 /**
   * Optional additional notes to supplement the Tier Band Set details
  **/
  private List<String> notes = null;

  @ApiModelProperty(value = "")
  private TierBand tierBand = null;
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

  public CreditInterestTierBandMethod calculationMethod(CalculationMethodEnum calculationMethod) {
    this.calculationMethod = calculationMethod;
    return this;
  }

 /**
   * Describes whether accrued interest is payable only to the BCA or to another bank account
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

  public CreditInterestTierBandMethod destination(DestinationEnum destination) {
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

  public CreditInterestTierBandMethod notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public CreditInterestTierBandMethod addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Get tierBand
   * @return tierBand
  **/
  @JsonProperty("TierBand")
  public TierBand getTierBand() {
    return tierBand;
  }

  public void setTierBand(TierBand tierBand) {
    this.tierBand = tierBand;
  }

  public CreditInterestTierBandMethod tierBand(TierBand tierBand) {
    this.tierBand = tierBand;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditInterestTierBandMethod {\n");
    
    sb.append("    calculationMethod: ").append(toIndentedString(calculationMethod)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    tierBand: ").append(toIndentedString(tierBand)).append("\n");
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

