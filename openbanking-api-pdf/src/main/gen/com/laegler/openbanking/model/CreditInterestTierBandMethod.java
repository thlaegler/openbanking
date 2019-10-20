package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.laegler.openbanking.model.TierBand;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreditInterestTierBandMethod
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class CreditInterestTierBandMethod   {
  /**
   * Methods of calculating interest
   */
  public enum CalculationMethodEnum {
    COMPOUND("Compound"),
    
    SIMPLEINTEREST("SimpleInterest");

    private String value;

    CalculationMethodEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CalculationMethodEnum fromValue(String text) {
      for (CalculationMethodEnum b : CalculationMethodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("CalculationMethod")
  private CalculationMethodEnum calculationMethod = null;

  /**
   * Describes whether accrued interest is payable only to the BCA or to another bank account
   */
  public enum DestinationEnum {
    PAYAWAY("PayAway"),
    
    SELFCREDIT("SelfCredit");

    private String value;

    DestinationEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DestinationEnum fromValue(String text) {
      for (DestinationEnum b : DestinationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("Destination")
  private DestinationEnum destination = null;

  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("TierBand")
  private TierBand tierBand = null;

  public CreditInterestTierBandMethod calculationMethod(CalculationMethodEnum calculationMethod) {
    this.calculationMethod = calculationMethod;
    return this;
  }

  /**
   * Methods of calculating interest
   * @return calculationMethod
  **/
  @ApiModelProperty(value = "Methods of calculating interest")


  public CalculationMethodEnum getCalculationMethod() {
    return calculationMethod;
  }

  public void setCalculationMethod(CalculationMethodEnum calculationMethod) {
    this.calculationMethod = calculationMethod;
  }

  public CreditInterestTierBandMethod destination(DestinationEnum destination) {
    this.destination = destination;
    return this;
  }

  /**
   * Describes whether accrued interest is payable only to the BCA or to another bank account
   * @return destination
  **/
  @ApiModelProperty(value = "Describes whether accrued interest is payable only to the BCA or to another bank account")


  public DestinationEnum getDestination() {
    return destination;
  }

  public void setDestination(DestinationEnum destination) {
    this.destination = destination;
  }

  public CreditInterestTierBandMethod notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public CreditInterestTierBandMethod addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Optional additional notes to supplement the Tier Band Set details
   * @return notes
  **/
  @ApiModelProperty(value = "Optional additional notes to supplement the Tier Band Set details")


  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public CreditInterestTierBandMethod tierBand(TierBand tierBand) {
    this.tierBand = tierBand;
    return this;
  }

  /**
   * Get tierBand
   * @return tierBand
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TierBand getTierBand() {
    return tierBand;
  }

  public void setTierBand(TierBand tierBand) {
    this.tierBand = tierBand;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditInterestTierBandMethod creditInterestTierBandMethod = (CreditInterestTierBandMethod) o;
    return Objects.equals(this.calculationMethod, creditInterestTierBandMethod.calculationMethod) &&
        Objects.equals(this.destination, creditInterestTierBandMethod.destination) &&
        Objects.equals(this.notes, creditInterestTierBandMethod.notes) &&
        Objects.equals(this.tierBand, creditInterestTierBandMethod.tierBand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calculationMethod, destination, notes, tierBand);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

