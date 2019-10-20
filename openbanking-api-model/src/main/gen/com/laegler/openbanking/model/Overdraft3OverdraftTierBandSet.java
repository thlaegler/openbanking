package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.laegler.openbanking.model.Overdraft3OverdraftFeesCharges;
import com.laegler.openbanking.model.Overdraft3OverdraftTierBand;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Tier band set details
 */
@ApiModel(description = "Tier band set details")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class Overdraft3OverdraftTierBandSet   {
  @JsonProperty("AuthorisedIndicator")
  private Boolean authorisedIndicator = null;

  @JsonProperty("BufferAmount")
  private String bufferAmount = null;

  @JsonProperty("Identification")
  private String identification = null;

  @JsonProperty("MinimumArrangedOverdraftAmount")
  private String minimumArrangedOverdraftAmount = null;

  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("OverdraftFeesCharges")
  @Valid
  private List<Overdraft3OverdraftFeesCharges> overdraftFeesCharges = null;

  @JsonProperty("OverdraftTierBand")
  @Valid
  private List<Overdraft3OverdraftTierBand> overdraftTierBand = new ArrayList<>();

  /**
   * An overdraft can either be 'committed' which means that the facility cannot be withdrawn without reasonable notification before it's agreed end date, or 'on demand' which means that the financial institution can demand repayment at any point in time.
   */
  public enum OverdraftTypeEnum {
    COMMITTED("Committed"),
    
    ONDEMAND("OnDemand"),
    
    OTHER("Other");

    private String value;

    OverdraftTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OverdraftTypeEnum fromValue(String text) {
      for (OverdraftTypeEnum b : OverdraftTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("OverdraftType")
  private OverdraftTypeEnum overdraftType = null;

  /**
   * The methodology of how overdraft is charged. It can be: 'Whole'  Where the same charge/rate is applied to the entirety of the overdraft balance (where charges are applicable).  'Tiered' Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount tiers defined by the lending financial organisation 'Banded' Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount bands defined by a government organisation.
   */
  public enum TierBandMethodEnum {
    TIERED("Tiered"),
    
    WHOLE("Whole");

    private String value;

    TierBandMethodEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TierBandMethodEnum fromValue(String text) {
      for (TierBandMethodEnum b : TierBandMethodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("TierBandMethod")
  private TierBandMethodEnum tierBandMethod = null;

  public Overdraft3OverdraftTierBandSet authorisedIndicator(Boolean authorisedIndicator) {
    this.authorisedIndicator = authorisedIndicator;
    return this;
  }

  /**
   * Indicates if the Overdraft is authorised (Y) or unauthorised (N)
   * @return authorisedIndicator
  **/
  @ApiModelProperty(value = "Indicates if the Overdraft is authorised (Y) or unauthorised (N)")


  public Boolean isAuthorisedIndicator() {
    return authorisedIndicator;
  }

  public void setAuthorisedIndicator(Boolean authorisedIndicator) {
    this.authorisedIndicator = authorisedIndicator;
  }

  public Overdraft3OverdraftTierBandSet bufferAmount(String bufferAmount) {
    this.bufferAmount = bufferAmount;
    return this;
  }

  /**
   * When a customer exceeds their credit limit, a financial institution will not charge the customer unauthorised overdraft charges if they do not exceed by more than the buffer amount. Note: Authorised overdraft charges may still apply.
   * @return bufferAmount
  **/
  @ApiModelProperty(value = "When a customer exceeds their credit limit, a financial institution will not charge the customer unauthorised overdraft charges if they do not exceed by more than the buffer amount. Note: Authorised overdraft charges may still apply.")

@Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$") 
  public String getBufferAmount() {
    return bufferAmount;
  }

  public void setBufferAmount(String bufferAmount) {
    this.bufferAmount = bufferAmount;
  }

  public Overdraft3OverdraftTierBandSet identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Unique and unambiguous identification of a  Tier Band for a overdraft product.
   * @return identification
  **/
  @ApiModelProperty(value = "Unique and unambiguous identification of a  Tier Band for a overdraft product.")

@Size(min=1,max=35) 
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public Overdraft3OverdraftTierBandSet minimumArrangedOverdraftAmount(String minimumArrangedOverdraftAmount) {
    this.minimumArrangedOverdraftAmount = minimumArrangedOverdraftAmount;
    return this;
  }

  /**
   * An overdraft is an extension of credit from a lending institution when an account reaches zero. An overdraft allows the individual to continue withdrawing money even if the account has no funds in it or not enough to cover the withdrawal. Some banking products require an accountholder to take an Arranged Overdraft(minimum) of at least X amount, or else a bank will not process an Arranged Overdraft request.
   * @return minimumArrangedOverdraftAmount
  **/
  @ApiModelProperty(value = "An overdraft is an extension of credit from a lending institution when an account reaches zero. An overdraft allows the individual to continue withdrawing money even if the account has no funds in it or not enough to cover the withdrawal. Some banking products require an accountholder to take an Arranged Overdraft(minimum) of at least X amount, or else a bank will not process an Arranged Overdraft request.")

@Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$") 
  public String getMinimumArrangedOverdraftAmount() {
    return minimumArrangedOverdraftAmount;
  }

  public void setMinimumArrangedOverdraftAmount(String minimumArrangedOverdraftAmount) {
    this.minimumArrangedOverdraftAmount = minimumArrangedOverdraftAmount;
  }

  public Overdraft3OverdraftTierBandSet notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public Overdraft3OverdraftTierBandSet addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Optional additional notes to supplement the overdraft Tier Band Set details
   * @return notes
  **/
  @ApiModelProperty(value = "Optional additional notes to supplement the overdraft Tier Band Set details")


  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public Overdraft3OverdraftTierBandSet overdraftFeesCharges(List<Overdraft3OverdraftFeesCharges> overdraftFeesCharges) {
    this.overdraftFeesCharges = overdraftFeesCharges;
    return this;
  }

  public Overdraft3OverdraftTierBandSet addOverdraftFeesChargesItem(Overdraft3OverdraftFeesCharges overdraftFeesChargesItem) {
    if (this.overdraftFeesCharges == null) {
      this.overdraftFeesCharges = new ArrayList<>();
    }
    this.overdraftFeesCharges.add(overdraftFeesChargesItem);
    return this;
  }

  /**
   * Overdraft fees and charges details
   * @return overdraftFeesCharges
  **/
  @ApiModelProperty(value = "Overdraft fees and charges details")

  @Valid

  public List<Overdraft3OverdraftFeesCharges> getOverdraftFeesCharges() {
    return overdraftFeesCharges;
  }

  public void setOverdraftFeesCharges(List<Overdraft3OverdraftFeesCharges> overdraftFeesCharges) {
    this.overdraftFeesCharges = overdraftFeesCharges;
  }

  public Overdraft3OverdraftTierBandSet overdraftTierBand(List<Overdraft3OverdraftTierBand> overdraftTierBand) {
    this.overdraftTierBand = overdraftTierBand;
    return this;
  }

  public Overdraft3OverdraftTierBandSet addOverdraftTierBandItem(Overdraft3OverdraftTierBand overdraftTierBandItem) {
    this.overdraftTierBand.add(overdraftTierBandItem);
    return this;
  }

  /**
   * Provides overdraft details for a specific tier or band
   * @return overdraftTierBand
  **/
  @ApiModelProperty(required = true, value = "Provides overdraft details for a specific tier or band")
  @NotNull

  @Valid
@Size(min=1) 
  public List<Overdraft3OverdraftTierBand> getOverdraftTierBand() {
    return overdraftTierBand;
  }

  public void setOverdraftTierBand(List<Overdraft3OverdraftTierBand> overdraftTierBand) {
    this.overdraftTierBand = overdraftTierBand;
  }

  public Overdraft3OverdraftTierBandSet overdraftType(OverdraftTypeEnum overdraftType) {
    this.overdraftType = overdraftType;
    return this;
  }

  /**
   * An overdraft can either be 'committed' which means that the facility cannot be withdrawn without reasonable notification before it's agreed end date, or 'on demand' which means that the financial institution can demand repayment at any point in time.
   * @return overdraftType
  **/
  @ApiModelProperty(value = "An overdraft can either be 'committed' which means that the facility cannot be withdrawn without reasonable notification before it's agreed end date, or 'on demand' which means that the financial institution can demand repayment at any point in time.")


  public OverdraftTypeEnum getOverdraftType() {
    return overdraftType;
  }

  public void setOverdraftType(OverdraftTypeEnum overdraftType) {
    this.overdraftType = overdraftType;
  }

  public Overdraft3OverdraftTierBandSet tierBandMethod(TierBandMethodEnum tierBandMethod) {
    this.tierBandMethod = tierBandMethod;
    return this;
  }

  /**
   * The methodology of how overdraft is charged. It can be: 'Whole'  Where the same charge/rate is applied to the entirety of the overdraft balance (where charges are applicable).  'Tiered' Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount tiers defined by the lending financial organisation 'Banded' Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount bands defined by a government organisation.
   * @return tierBandMethod
  **/
  @ApiModelProperty(required = true, value = "The methodology of how overdraft is charged. It can be: 'Whole'  Where the same charge/rate is applied to the entirety of the overdraft balance (where charges are applicable).  'Tiered' Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount tiers defined by the lending financial organisation 'Banded' Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount bands defined by a government organisation.")
  @NotNull


  public TierBandMethodEnum getTierBandMethod() {
    return tierBandMethod;
  }

  public void setTierBandMethod(TierBandMethodEnum tierBandMethod) {
    this.tierBandMethod = tierBandMethod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Overdraft3OverdraftTierBandSet overdraft3OverdraftTierBandSet = (Overdraft3OverdraftTierBandSet) o;
    return Objects.equals(this.authorisedIndicator, overdraft3OverdraftTierBandSet.authorisedIndicator) &&
        Objects.equals(this.bufferAmount, overdraft3OverdraftTierBandSet.bufferAmount) &&
        Objects.equals(this.identification, overdraft3OverdraftTierBandSet.identification) &&
        Objects.equals(this.minimumArrangedOverdraftAmount, overdraft3OverdraftTierBandSet.minimumArrangedOverdraftAmount) &&
        Objects.equals(this.notes, overdraft3OverdraftTierBandSet.notes) &&
        Objects.equals(this.overdraftFeesCharges, overdraft3OverdraftTierBandSet.overdraftFeesCharges) &&
        Objects.equals(this.overdraftTierBand, overdraft3OverdraftTierBandSet.overdraftTierBand) &&
        Objects.equals(this.overdraftType, overdraft3OverdraftTierBandSet.overdraftType) &&
        Objects.equals(this.tierBandMethod, overdraft3OverdraftTierBandSet.tierBandMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorisedIndicator, bufferAmount, identification, minimumArrangedOverdraftAmount, notes, overdraftFeesCharges, overdraftTierBand, overdraftType, tierBandMethod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Overdraft3OverdraftTierBandSet {\n");
    
    sb.append("    authorisedIndicator: ").append(toIndentedString(authorisedIndicator)).append("\n");
    sb.append("    bufferAmount: ").append(toIndentedString(bufferAmount)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    minimumArrangedOverdraftAmount: ").append(toIndentedString(minimumArrangedOverdraftAmount)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    overdraftFeesCharges: ").append(toIndentedString(overdraftFeesCharges)).append("\n");
    sb.append("    overdraftTierBand: ").append(toIndentedString(overdraftTierBand)).append("\n");
    sb.append("    overdraftType: ").append(toIndentedString(overdraftType)).append("\n");
    sb.append("    tierBandMethod: ").append(toIndentedString(tierBandMethod)).append("\n");
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

