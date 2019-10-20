package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBInterestCalculationMethod1Code;
import com.laegler.openbanking.model.OBOtherCodeType10;
import com.laegler.openbanking.model.OBReadProduct2DataOtherProductTypeCreditInterestTierBand;
import io.swagger.annotations.ApiModel;
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
  * The group of tiers or bands for which credit interest can be applied.
 **/
@ApiModel(description="The group of tiers or bands for which credit interest can be applied.")
public class OBReadProduct2DataOtherProductTypeCreditInterestTierBandSet  {
  
  @ApiModelProperty(value = "")
  @Valid
  private OBInterestCalculationMethod1Code calculationMethod = null;


@XmlType(name="DestinationEnum")
@XmlEnum(String.class)
public enum DestinationEnum {

@XmlEnumValue("INOT") INOT(String.valueOf("INOT")), @XmlEnumValue("INPA") INPA(String.valueOf("INPA")), @XmlEnumValue("INSC") INSC(String.valueOf("INSC"));


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

  @ApiModelProperty(required = true, value = "Describes whether accrued interest is payable only to the BCA or to another bank account")
 /**
   * Describes whether accrued interest is payable only to the BCA or to another bank account
  **/
  private DestinationEnum destination = null;

  @ApiModelProperty(value = "")
  private List<String> notes = null;

  @ApiModelProperty(value = "")
  @Valid
  private OBOtherCodeType10 otherCalculationMethod = null;

  @ApiModelProperty(value = "")
  @Valid
  private OBOtherCodeType10 otherDestination = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<OBReadProduct2DataOtherProductTypeCreditInterestTierBand> tierBand = new ArrayList<OBReadProduct2DataOtherProductTypeCreditInterestTierBand>();


@XmlType(name="TierBandMethodEnum")
@XmlEnum(String.class)
public enum TierBandMethodEnum {

@XmlEnumValue("INBA") INBA(String.valueOf("INBA")), @XmlEnumValue("INTI") INTI(String.valueOf("INTI")), @XmlEnumValue("INWH") INWH(String.valueOf("INWH"));


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

  @ApiModelProperty(required = true, value = "The methodology of how credit interest is paid/applied. It can be:- 1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases. 2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance. 3. Whole The same interest rate is applied irrespective of the product holder's account balance")
 /**
   * The methodology of how credit interest is paid/applied. It can be:- 1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases. 2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance. 3. Whole The same interest rate is applied irrespective of the product holder's account balance
  **/
  private TierBandMethodEnum tierBandMethod = null;
 /**
   * Get calculationMethod
   * @return calculationMethod
  **/
  @JsonProperty("CalculationMethod")
  public OBInterestCalculationMethod1Code getCalculationMethod() {
    return calculationMethod;
  }

  public void setCalculationMethod(OBInterestCalculationMethod1Code calculationMethod) {
    this.calculationMethod = calculationMethod;
  }

  public OBReadProduct2DataOtherProductTypeCreditInterestTierBandSet calculationMethod(OBInterestCalculationMethod1Code calculationMethod) {
    this.calculationMethod = calculationMethod;
    return this;
  }

 /**
   * Describes whether accrued interest is payable only to the BCA or to another bank account
   * @return destination
  **/
  @JsonProperty("Destination")
  @NotNull
  public String getDestination() {
    if (destination == null) {
      return null;
    }
    return destination.value();
  }

  public void setDestination(DestinationEnum destination) {
    this.destination = destination;
  }

  public OBReadProduct2DataOtherProductTypeCreditInterestTierBandSet destination(DestinationEnum destination) {
    this.destination = destination;
    return this;
  }

 /**
   * Get notes
   * @return notes
  **/
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public OBReadProduct2DataOtherProductTypeCreditInterestTierBandSet notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeCreditInterestTierBandSet addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Get otherCalculationMethod
   * @return otherCalculationMethod
  **/
  @JsonProperty("OtherCalculationMethod")
  public OBOtherCodeType10 getOtherCalculationMethod() {
    return otherCalculationMethod;
  }

  public void setOtherCalculationMethod(OBOtherCodeType10 otherCalculationMethod) {
    this.otherCalculationMethod = otherCalculationMethod;
  }

  public OBReadProduct2DataOtherProductTypeCreditInterestTierBandSet otherCalculationMethod(OBOtherCodeType10 otherCalculationMethod) {
    this.otherCalculationMethod = otherCalculationMethod;
    return this;
  }

 /**
   * Get otherDestination
   * @return otherDestination
  **/
  @JsonProperty("OtherDestination")
  public OBOtherCodeType10 getOtherDestination() {
    return otherDestination;
  }

  public void setOtherDestination(OBOtherCodeType10 otherDestination) {
    this.otherDestination = otherDestination;
  }

  public OBReadProduct2DataOtherProductTypeCreditInterestTierBandSet otherDestination(OBOtherCodeType10 otherDestination) {
    this.otherDestination = otherDestination;
    return this;
  }

 /**
   * Get tierBand
   * @return tierBand
  **/
  @JsonProperty("TierBand")
  @NotNull
 @Size(min=1)  public List<OBReadProduct2DataOtherProductTypeCreditInterestTierBand> getTierBand() {
    return tierBand;
  }

  public void setTierBand(List<OBReadProduct2DataOtherProductTypeCreditInterestTierBand> tierBand) {
    this.tierBand = tierBand;
  }

  public OBReadProduct2DataOtherProductTypeCreditInterestTierBandSet tierBand(List<OBReadProduct2DataOtherProductTypeCreditInterestTierBand> tierBand) {
    this.tierBand = tierBand;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeCreditInterestTierBandSet addTierBandItem(OBReadProduct2DataOtherProductTypeCreditInterestTierBand tierBandItem) {
    this.tierBand.add(tierBandItem);
    return this;
  }

 /**
   * The methodology of how credit interest is paid/applied. It can be:- 1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases. 2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance. 3. Whole The same interest rate is applied irrespective of the product holder&#39;s account balance
   * @return tierBandMethod
  **/
  @JsonProperty("TierBandMethod")
  @NotNull
  public String getTierBandMethod() {
    if (tierBandMethod == null) {
      return null;
    }
    return tierBandMethod.value();
  }

  public void setTierBandMethod(TierBandMethodEnum tierBandMethod) {
    this.tierBandMethod = tierBandMethod;
  }

  public OBReadProduct2DataOtherProductTypeCreditInterestTierBandSet tierBandMethod(TierBandMethodEnum tierBandMethod) {
    this.tierBandMethod = tierBandMethod;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataOtherProductTypeCreditInterestTierBandSet {\n");
    
    sb.append("    calculationMethod: ").append(toIndentedString(calculationMethod)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherCalculationMethod: ").append(toIndentedString(otherCalculationMethod)).append("\n");
    sb.append("    otherDestination: ").append(toIndentedString(otherDestination)).append("\n");
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

