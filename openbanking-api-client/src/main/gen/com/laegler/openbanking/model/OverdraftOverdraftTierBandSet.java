package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OverdraftOverdraftFeesCharges;
import com.laegler.openbanking.model.OverdraftOverdraftTierBand;
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
  * Tier band set details
 **/
@ApiModel(description="Tier band set details")
public class OverdraftOverdraftTierBandSet  {
  
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

  @ApiModelProperty(value = "An overdraft is an extension of credit from a lending institution when an account reaches zero. An overdraft allows the individual to continue withdrawing money even if the account has no funds in it or not enough to cover the withdrawal. Some banking products require an accountholder to take an Arranged Overdraft(minimum) of at least GBP X, or else a bank will not process an Arranged Overdraft request.")
 /**
   * An overdraft is an extension of credit from a lending institution when an account reaches zero. An overdraft allows the individual to continue withdrawing money even if the account has no funds in it or not enough to cover the withdrawal. Some banking products require an accountholder to take an Arranged Overdraft(minimum) of at least GBP X, or else a bank will not process an Arranged Overdraft request.
  **/
  private String minimumArrangedOverdraftAmount = null;

  @ApiModelProperty(value = "Optional additional notes to supplement the overdraft Tier Band Set details")
 /**
   * Optional additional notes to supplement the overdraft Tier Band Set details
  **/
  private List<String> notes = null;

  @ApiModelProperty(value = "Overdraft fees and charges details")
 /**
   * Overdraft fees and charges details
  **/
  private List<OverdraftOverdraftFeesCharges> overdraftFeesCharges = null;

  @ApiModelProperty(required = true, value = "Provides overdraft details for a specific tier or band")
 /**
   * Provides overdraft details for a specific tier or band
  **/
  private List<OverdraftOverdraftTierBand> overdraftTierBand = new ArrayList<OverdraftOverdraftTierBand>();


@XmlType(name="OverdraftTypeEnum")
@XmlEnum(String.class)
public enum OverdraftTypeEnum {

@XmlEnumValue("Committed") COMMITTED(String.valueOf("Committed")), @XmlEnumValue("OnDemand") ONDEMAND(String.valueOf("OnDemand"));


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

  @ApiModelProperty(value = "An overdraft can either be committed which means that the facility cannot be withdrawn without reasonable notification before its agreed end date, or on demand which means that the financial institution can demand repayment at any point in time.")
 /**
   * An overdraft can either be committed which means that the facility cannot be withdrawn without reasonable notification before its agreed end date, or on demand which means that the financial institution can demand repayment at any point in time.
  **/
  private OverdraftTypeEnum overdraftType = null;


@XmlType(name="TierBandMethodEnum")
@XmlEnum(String.class)
public enum TierBandMethodEnum {

@XmlEnumValue("Banded") BANDED(String.valueOf("Banded")), @XmlEnumValue("Tiered") TIERED(String.valueOf("Tiered")), @XmlEnumValue("Whole") WHOLE(String.valueOf("Whole"));


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

  @ApiModelProperty(required = true, value = "The methodology of how overdraft is charged. It can be: Whole  Where the same charge/rate is applied to the entirety of the overdraft balance (where charges are applicable).  Tiered Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount tiers defined by the lending financial organisation Banded Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount bands defined by a government organisation.")
 /**
   * The methodology of how overdraft is charged. It can be: Whole  Where the same charge/rate is applied to the entirety of the overdraft balance (where charges are applicable).  Tiered Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount tiers defined by the lending financial organisation Banded Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount bands defined by a government organisation.
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

  public OverdraftOverdraftTierBandSet authorisedIndicator(Boolean authorisedIndicator) {
    this.authorisedIndicator = authorisedIndicator;
    return this;
  }

 /**
   * When a customer exceeds their credit limit, a financial institution will not charge the customer unauthorised overdraft charges if they do not exceed by more than the buffer amount. Note: Authorised overdraft charges may still apply.
   * @return bufferAmount
  **/
  @JsonProperty("BufferAmount")
  public String getBufferAmount() {
    return bufferAmount;
  }

  public void setBufferAmount(String bufferAmount) {
    this.bufferAmount = bufferAmount;
  }

  public OverdraftOverdraftTierBandSet bufferAmount(String bufferAmount) {
    this.bufferAmount = bufferAmount;
    return this;
  }

 /**
   * Unique and unambiguous identification of a  Tier Band for a overdraft product.
   * @return identification
  **/
  @JsonProperty("Identification")
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public OverdraftOverdraftTierBandSet identification(String identification) {
    this.identification = identification;
    return this;
  }

 /**
   * An overdraft is an extension of credit from a lending institution when an account reaches zero. An overdraft allows the individual to continue withdrawing money even if the account has no funds in it or not enough to cover the withdrawal. Some banking products require an accountholder to take an Arranged Overdraft(minimum) of at least GBP X, or else a bank will not process an Arranged Overdraft request.
   * @return minimumArrangedOverdraftAmount
  **/
  @JsonProperty("MinimumArrangedOverdraftAmount")
  public String getMinimumArrangedOverdraftAmount() {
    return minimumArrangedOverdraftAmount;
  }

  public void setMinimumArrangedOverdraftAmount(String minimumArrangedOverdraftAmount) {
    this.minimumArrangedOverdraftAmount = minimumArrangedOverdraftAmount;
  }

  public OverdraftOverdraftTierBandSet minimumArrangedOverdraftAmount(String minimumArrangedOverdraftAmount) {
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

  public OverdraftOverdraftTierBandSet notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OverdraftOverdraftTierBandSet addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Overdraft fees and charges details
   * @return overdraftFeesCharges
  **/
  @JsonProperty("OverdraftFeesCharges")
  public List<OverdraftOverdraftFeesCharges> getOverdraftFeesCharges() {
    return overdraftFeesCharges;
  }

  public void setOverdraftFeesCharges(List<OverdraftOverdraftFeesCharges> overdraftFeesCharges) {
    this.overdraftFeesCharges = overdraftFeesCharges;
  }

  public OverdraftOverdraftTierBandSet overdraftFeesCharges(List<OverdraftOverdraftFeesCharges> overdraftFeesCharges) {
    this.overdraftFeesCharges = overdraftFeesCharges;
    return this;
  }

  public OverdraftOverdraftTierBandSet addOverdraftFeesChargesItem(OverdraftOverdraftFeesCharges overdraftFeesChargesItem) {
    this.overdraftFeesCharges.add(overdraftFeesChargesItem);
    return this;
  }

 /**
   * Provides overdraft details for a specific tier or band
   * @return overdraftTierBand
  **/
  @JsonProperty("OverdraftTierBand")
  public List<OverdraftOverdraftTierBand> getOverdraftTierBand() {
    return overdraftTierBand;
  }

  public void setOverdraftTierBand(List<OverdraftOverdraftTierBand> overdraftTierBand) {
    this.overdraftTierBand = overdraftTierBand;
  }

  public OverdraftOverdraftTierBandSet overdraftTierBand(List<OverdraftOverdraftTierBand> overdraftTierBand) {
    this.overdraftTierBand = overdraftTierBand;
    return this;
  }

  public OverdraftOverdraftTierBandSet addOverdraftTierBandItem(OverdraftOverdraftTierBand overdraftTierBandItem) {
    this.overdraftTierBand.add(overdraftTierBandItem);
    return this;
  }

 /**
   * An overdraft can either be committed which means that the facility cannot be withdrawn without reasonable notification before its agreed end date, or on demand which means that the financial institution can demand repayment at any point in time.
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

  public OverdraftOverdraftTierBandSet overdraftType(OverdraftTypeEnum overdraftType) {
    this.overdraftType = overdraftType;
    return this;
  }

 /**
   * The methodology of how overdraft is charged. It can be: Whole  Where the same charge/rate is applied to the entirety of the overdraft balance (where charges are applicable).  Tiered Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount tiers defined by the lending financial organisation Banded Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount bands defined by a government organisation.
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

  public OverdraftOverdraftTierBandSet tierBandMethod(TierBandMethodEnum tierBandMethod) {
    this.tierBandMethod = tierBandMethod;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OverdraftOverdraftTierBandSet {\n");
    
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

