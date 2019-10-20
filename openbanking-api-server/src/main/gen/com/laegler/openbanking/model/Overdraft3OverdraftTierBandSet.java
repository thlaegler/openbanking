package com.laegler.openbanking.model;

import com.laegler.openbanking.model.Overdraft3OverdraftFeesCharges;
import com.laegler.openbanking.model.Overdraft3OverdraftTierBand;
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
  * Tier band set details
 **/
@ApiModel(description="Tier band set details")
public class Overdraft3OverdraftTierBandSet  {
  
  @ApiModelProperty(value = "Indicates if the Overdraft is authorised (Y) or unauthorised (N)")
 /**
   * Indicates if the Overdraft is authorised (Y) or unauthorised (N)
  **/
  private Boolean authorisedIndicator = null;

  @ApiModelProperty(value = "When a customer exceeds their credit limit, a financial institution will not charge the customer unauthorised overdraft charges if they do not exceed by more than the buffer amount. Note: Authorised overdraft charges may still apply.")
 /**
   * When a customer exceeds their credit limit, a financial institution will not charge the customer unauthorised overdraft charges if they do not exceed by more than the buffer amount. Note: Authorised overdraft charges may still apply.
  **/
  private String bufferAmount = null;

  @ApiModelProperty(value = "Unique and unambiguous identification of a  Tier Band for a overdraft product.")
 /**
   * Unique and unambiguous identification of a  Tier Band for a overdraft product.
  **/
  private String identification = null;

  @ApiModelProperty(value = "An overdraft is an extension of credit from a lending institution when an account reaches zero. An overdraft allows the individual to continue withdrawing money even if the account has no funds in it or not enough to cover the withdrawal. Some banking products require an accountholder to take an Arranged Overdraft(minimum) of at least X amount, or else a bank will not process an Arranged Overdraft request.")
 /**
   * An overdraft is an extension of credit from a lending institution when an account reaches zero. An overdraft allows the individual to continue withdrawing money even if the account has no funds in it or not enough to cover the withdrawal. Some banking products require an accountholder to take an Arranged Overdraft(minimum) of at least X amount, or else a bank will not process an Arranged Overdraft request.
  **/
  private String minimumArrangedOverdraftAmount = null;

  @ApiModelProperty(value = "Optional additional notes to supplement the overdraft Tier Band Set details")
 /**
   * Optional additional notes to supplement the overdraft Tier Band Set details
  **/
  private List<String> notes = null;

  @ApiModelProperty(value = "Overdraft fees and charges details")
  @Valid
 /**
   * Overdraft fees and charges details
  **/
  private List<Overdraft3OverdraftFeesCharges> overdraftFeesCharges = null;

  @ApiModelProperty(required = true, value = "Provides overdraft details for a specific tier or band")
  @Valid
 /**
   * Provides overdraft details for a specific tier or band
  **/
  private List<Overdraft3OverdraftTierBand> overdraftTierBand = new ArrayList<Overdraft3OverdraftTierBand>();


@XmlType(name="OverdraftTypeEnum")
@XmlEnum(String.class)
public enum OverdraftTypeEnum {

@XmlEnumValue("Committed") COMMITTED(String.valueOf("Committed")), @XmlEnumValue("OnDemand") ONDEMAND(String.valueOf("OnDemand")), @XmlEnumValue("Other") OTHER(String.valueOf("Other"));


    private String value;

    OverdraftTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OverdraftTypeEnum fromValue(String v) {
        for (OverdraftTypeEnum b : OverdraftTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "An overdraft can either be 'committed' which means that the facility cannot be withdrawn without reasonable notification before it's agreed end date, or 'on demand' which means that the financial institution can demand repayment at any point in time.")
 /**
   * An overdraft can either be 'committed' which means that the facility cannot be withdrawn without reasonable notification before it's agreed end date, or 'on demand' which means that the financial institution can demand repayment at any point in time.
  **/
  private OverdraftTypeEnum overdraftType = null;


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

  @ApiModelProperty(required = true, value = "The methodology of how overdraft is charged. It can be: 'Whole'  Where the same charge/rate is applied to the entirety of the overdraft balance (where charges are applicable).  'Tiered' Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount tiers defined by the lending financial organisation 'Banded' Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount bands defined by a government organisation.")
 /**
   * The methodology of how overdraft is charged. It can be: 'Whole'  Where the same charge/rate is applied to the entirety of the overdraft balance (where charges are applicable).  'Tiered' Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount tiers defined by the lending financial organisation 'Banded' Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount bands defined by a government organisation.
  **/
  private TierBandMethodEnum tierBandMethod = null;
 /**
   * Indicates if the Overdraft is authorised (Y) or unauthorised (N)
   * @return authorisedIndicator
  **/
  @JsonProperty("AuthorisedIndicator")
  public Boolean isAuthorisedIndicator() {
    return authorisedIndicator;
  }

  public void setAuthorisedIndicator(Boolean authorisedIndicator) {
    this.authorisedIndicator = authorisedIndicator;
  }

  public Overdraft3OverdraftTierBandSet authorisedIndicator(Boolean authorisedIndicator) {
    this.authorisedIndicator = authorisedIndicator;
    return this;
  }

 /**
   * When a customer exceeds their credit limit, a financial institution will not charge the customer unauthorised overdraft charges if they do not exceed by more than the buffer amount. Note: Authorised overdraft charges may still apply.
   * @return bufferAmount
  **/
  @JsonProperty("BufferAmount")
 @Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")  public String getBufferAmount() {
    return bufferAmount;
  }

  public void setBufferAmount(String bufferAmount) {
    this.bufferAmount = bufferAmount;
  }

  public Overdraft3OverdraftTierBandSet bufferAmount(String bufferAmount) {
    this.bufferAmount = bufferAmount;
    return this;
  }

 /**
   * Unique and unambiguous identification of a  Tier Band for a overdraft product.
   * @return identification
  **/
  @JsonProperty("Identification")
 @Size(min=1,max=35)  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public Overdraft3OverdraftTierBandSet identification(String identification) {
    this.identification = identification;
    return this;
  }

 /**
   * An overdraft is an extension of credit from a lending institution when an account reaches zero. An overdraft allows the individual to continue withdrawing money even if the account has no funds in it or not enough to cover the withdrawal. Some banking products require an accountholder to take an Arranged Overdraft(minimum) of at least X amount, or else a bank will not process an Arranged Overdraft request.
   * @return minimumArrangedOverdraftAmount
  **/
  @JsonProperty("MinimumArrangedOverdraftAmount")
 @Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")  public String getMinimumArrangedOverdraftAmount() {
    return minimumArrangedOverdraftAmount;
  }

  public void setMinimumArrangedOverdraftAmount(String minimumArrangedOverdraftAmount) {
    this.minimumArrangedOverdraftAmount = minimumArrangedOverdraftAmount;
  }

  public Overdraft3OverdraftTierBandSet minimumArrangedOverdraftAmount(String minimumArrangedOverdraftAmount) {
    this.minimumArrangedOverdraftAmount = minimumArrangedOverdraftAmount;
    return this;
  }

 /**
   * Optional additional notes to supplement the overdraft Tier Band Set details
   * @return notes
  **/
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public Overdraft3OverdraftTierBandSet notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public Overdraft3OverdraftTierBandSet addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Overdraft fees and charges details
   * @return overdraftFeesCharges
  **/
  @JsonProperty("OverdraftFeesCharges")
  public List<Overdraft3OverdraftFeesCharges> getOverdraftFeesCharges() {
    return overdraftFeesCharges;
  }

  public void setOverdraftFeesCharges(List<Overdraft3OverdraftFeesCharges> overdraftFeesCharges) {
    this.overdraftFeesCharges = overdraftFeesCharges;
  }

  public Overdraft3OverdraftTierBandSet overdraftFeesCharges(List<Overdraft3OverdraftFeesCharges> overdraftFeesCharges) {
    this.overdraftFeesCharges = overdraftFeesCharges;
    return this;
  }

  public Overdraft3OverdraftTierBandSet addOverdraftFeesChargesItem(Overdraft3OverdraftFeesCharges overdraftFeesChargesItem) {
    this.overdraftFeesCharges.add(overdraftFeesChargesItem);
    return this;
  }

 /**
   * Provides overdraft details for a specific tier or band
   * @return overdraftTierBand
  **/
  @JsonProperty("OverdraftTierBand")
  @NotNull
 @Size(min=1)  public List<Overdraft3OverdraftTierBand> getOverdraftTierBand() {
    return overdraftTierBand;
  }

  public void setOverdraftTierBand(List<Overdraft3OverdraftTierBand> overdraftTierBand) {
    this.overdraftTierBand = overdraftTierBand;
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
   * An overdraft can either be &#39;committed&#39; which means that the facility cannot be withdrawn without reasonable notification before it&#39;s agreed end date, or &#39;on demand&#39; which means that the financial institution can demand repayment at any point in time.
   * @return overdraftType
  **/
  @JsonProperty("OverdraftType")
  public String getOverdraftType() {
    if (overdraftType == null) {
      return null;
    }
    return overdraftType.value();
  }

  public void setOverdraftType(OverdraftTypeEnum overdraftType) {
    this.overdraftType = overdraftType;
  }

  public Overdraft3OverdraftTierBandSet overdraftType(OverdraftTypeEnum overdraftType) {
    this.overdraftType = overdraftType;
    return this;
  }

 /**
   * The methodology of how overdraft is charged. It can be: &#39;Whole&#39;  Where the same charge/rate is applied to the entirety of the overdraft balance (where charges are applicable).  &#39;Tiered&#39; Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount tiers defined by the lending financial organisation &#39;Banded&#39; Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount bands defined by a government organisation.
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

  public Overdraft3OverdraftTierBandSet tierBandMethod(TierBandMethodEnum tierBandMethod) {
    this.tierBandMethod = tierBandMethod;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

