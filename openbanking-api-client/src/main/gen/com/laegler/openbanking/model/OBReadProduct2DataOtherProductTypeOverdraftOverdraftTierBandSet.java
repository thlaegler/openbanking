package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges;
import com.laegler.openbanking.model.OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand;
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
public class OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet  {
  
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

  @ApiModelProperty(value = "")
  private List<String> notes = null;

  @ApiModelProperty(value = "")
  private List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges> overdraftFeesCharges = null;

  @ApiModelProperty(required = true, value = "")
  private List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand> overdraftTierBand = new ArrayList<OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand>();


@XmlType(name="OverdraftTypeEnum")
@XmlEnum(String.class)
public enum OverdraftTypeEnum {

@XmlEnumValue("OVCO") OVCO(String.valueOf("OVCO")), @XmlEnumValue("OVOD") OVOD(String.valueOf("OVOD")), @XmlEnumValue("OVOT") OVOT(String.valueOf("OVOT"));


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

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet authorisedIndicator(Boolean authorisedIndicator) {
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

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet bufferAmount(String bufferAmount) {
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

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet identification(String identification) {
    this.identification = identification;
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

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Get overdraftFeesCharges
   * @return overdraftFeesCharges
  **/
  @JsonProperty("OverdraftFeesCharges")
  public List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges> getOverdraftFeesCharges() {
    return overdraftFeesCharges;
  }

  public void setOverdraftFeesCharges(List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges> overdraftFeesCharges) {
    this.overdraftFeesCharges = overdraftFeesCharges;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet overdraftFeesCharges(List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges> overdraftFeesCharges) {
    this.overdraftFeesCharges = overdraftFeesCharges;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet addOverdraftFeesChargesItem(OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges overdraftFeesChargesItem) {
    this.overdraftFeesCharges.add(overdraftFeesChargesItem);
    return this;
  }

 /**
   * Get overdraftTierBand
   * @return overdraftTierBand
  **/
  @JsonProperty("OverdraftTierBand")
  public List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand> getOverdraftTierBand() {
    return overdraftTierBand;
  }

  public void setOverdraftTierBand(List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand> overdraftTierBand) {
    this.overdraftTierBand = overdraftTierBand;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet overdraftTierBand(List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand> overdraftTierBand) {
    this.overdraftTierBand = overdraftTierBand;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet addOverdraftTierBandItem(OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand overdraftTierBandItem) {
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

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet overdraftType(OverdraftTypeEnum overdraftType) {
    this.overdraftType = overdraftType;
    return this;
  }

 /**
   * The methodology of how overdraft is charged. It can be: &#39;Whole&#39;  Where the same charge/rate is applied to the entirety of the overdraft balance (where charges are applicable).  &#39;Tiered&#39; Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount tiers defined by the lending financial organisation &#39;Banded&#39; Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount bands defined by a government organisation.
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

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet tierBandMethod(TierBandMethodEnum tierBandMethod) {
    this.tierBandMethod = tierBandMethod;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet {\n");
    
    sb.append("    authorisedIndicator: ").append(toIndentedString(authorisedIndicator)).append("\n");
    sb.append("    bufferAmount: ").append(toIndentedString(bufferAmount)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
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

