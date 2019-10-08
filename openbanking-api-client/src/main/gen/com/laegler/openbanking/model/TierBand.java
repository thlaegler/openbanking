package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OtherApplicationFrequency;
import com.laegler.openbanking.model.OtherBankInterestType;
import com.laegler.openbanking.model.OtherCalculationFrequency;
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
  * Tier Band Details
 **/
@ApiModel(description="Tier Band Details")
public class TierBand  {
  
  @ApiModelProperty(required = true, value = "'The annual equivalent rate (AER) is interest that is calculated under the assumption that any interest paid is combined with the original balance and the next interest payment will be based on the slightly higher account balance. Overall, this means that interest can be compounded several times in a year depending on the number of times that interest payments are made. \\nRead more: Annual Equivalent Rate (AER) http://www.investopedia.com/terms/a/aer.asp#ixzz4gfR7IO1A'")
 /**
   * 'The annual equivalent rate (AER) is interest that is calculated under the assumption that any interest paid is combined with the original balance and the next interest payment will be based on the slightly higher account balance. Overall, this means that interest can be compounded several times in a year depending on the number of times that interest payments are made. \\nRead more: Annual Equivalent Rate (AER) http://www.investopedia.com/terms/a/aer.asp#ixzz4gfR7IO1A'
  **/
  private String AER = null;

  @ApiModelProperty(value = "Bank Interest for the BCA product")
 /**
   * Bank Interest for the BCA product
  **/
  private String bankInterestRate = null;


@XmlType(name="BankInterestRateTypeEnum")
@XmlEnum(String.class)
public enum BankInterestRateTypeEnum {

@XmlEnumValue("Gross") GROSS(String.valueOf("Gross")), @XmlEnumValue("Other") OTHER(String.valueOf("Other"));


    private String value;

    BankInterestRateTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BankInterestRateTypeEnum fromValue(String v) {
        for (BankInterestRateTypeEnum b : BankInterestRateTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Interest rate types, other than AER, which financial institutions may use to describe the annual interest rate payable to the BCA.")
 /**
   * Interest rate types, other than AER, which financial institutions may use to describe the annual interest rate payable to the BCA.
  **/
  private BankInterestRateTypeEnum bankInterestRateType = null;

  @ApiModelProperty(value = "Optional additional notes to supplement the Tier Band details")
 /**
   * Optional additional notes to supplement the Tier Band details
  **/
  private List<String> notes = null;

  @ApiModelProperty(value = "")
  private OtherApplicationFrequency otherApplicationFrequency = null;

  @ApiModelProperty(value = "")
  private OtherBankInterestType otherBankInterestType = null;

  @ApiModelProperty(value = "")
  private OtherCalculationFrequency otherCalculationFrequency = null;
 /**
   * &#39;The annual equivalent rate (AER) is interest that is calculated under the assumption that any interest paid is combined with the original balance and the next interest payment will be based on the slightly higher account balance. Overall, this means that interest can be compounded several times in a year depending on the number of times that interest payments are made. \\nRead more: Annual Equivalent Rate (AER) http://www.investopedia.com/terms/a/aer.asp#ixzz4gfR7IO1A&#39;
   * @return AER
  **/
  @JsonProperty("AER")
  public String getAER() {
    return AER;
  }

  public void setAER(String AER) {
    this.AER = AER;
  }

  public TierBand AER(String AER) {
    this.AER = AER;
    return this;
  }

 /**
   * Bank Interest for the BCA product
   * @return bankInterestRate
  **/
  @JsonProperty("BankInterestRate")
  public String getBankInterestRate() {
    return bankInterestRate;
  }

  public void setBankInterestRate(String bankInterestRate) {
    this.bankInterestRate = bankInterestRate;
  }

  public TierBand bankInterestRate(String bankInterestRate) {
    this.bankInterestRate = bankInterestRate;
    return this;
  }

 /**
   * Interest rate types, other than AER, which financial institutions may use to describe the annual interest rate payable to the BCA.
   * @return bankInterestRateType
  **/
  @JsonProperty("BankInterestRateType")
  public String getBankInterestRateType() {
    if (bankInterestRateType == null) {
      return null;
    }
    return bankInterestRateType.value();
  }

  public void setBankInterestRateType(BankInterestRateTypeEnum bankInterestRateType) {
    this.bankInterestRateType = bankInterestRateType;
  }

  public TierBand bankInterestRateType(BankInterestRateTypeEnum bankInterestRateType) {
    this.bankInterestRateType = bankInterestRateType;
    return this;
  }

 /**
   * Optional additional notes to supplement the Tier Band details
   * @return notes
  **/
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public TierBand notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public TierBand addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Get otherApplicationFrequency
   * @return otherApplicationFrequency
  **/
  @JsonProperty("OtherApplicationFrequency")
  public OtherApplicationFrequency getOtherApplicationFrequency() {
    return otherApplicationFrequency;
  }

  public void setOtherApplicationFrequency(OtherApplicationFrequency otherApplicationFrequency) {
    this.otherApplicationFrequency = otherApplicationFrequency;
  }

  public TierBand otherApplicationFrequency(OtherApplicationFrequency otherApplicationFrequency) {
    this.otherApplicationFrequency = otherApplicationFrequency;
    return this;
  }

 /**
   * Get otherBankInterestType
   * @return otherBankInterestType
  **/
  @JsonProperty("OtherBankInterestType")
  public OtherBankInterestType getOtherBankInterestType() {
    return otherBankInterestType;
  }

  public void setOtherBankInterestType(OtherBankInterestType otherBankInterestType) {
    this.otherBankInterestType = otherBankInterestType;
  }

  public TierBand otherBankInterestType(OtherBankInterestType otherBankInterestType) {
    this.otherBankInterestType = otherBankInterestType;
    return this;
  }

 /**
   * Get otherCalculationFrequency
   * @return otherCalculationFrequency
  **/
  @JsonProperty("OtherCalculationFrequency")
  public OtherCalculationFrequency getOtherCalculationFrequency() {
    return otherCalculationFrequency;
  }

  public void setOtherCalculationFrequency(OtherCalculationFrequency otherCalculationFrequency) {
    this.otherCalculationFrequency = otherCalculationFrequency;
  }

  public TierBand otherCalculationFrequency(OtherCalculationFrequency otherCalculationFrequency) {
    this.otherCalculationFrequency = otherCalculationFrequency;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TierBand {\n");
    
    sb.append("    AER: ").append(toIndentedString(AER)).append("\n");
    sb.append("    bankInterestRate: ").append(toIndentedString(bankInterestRate)).append("\n");
    sb.append("    bankInterestRateType: ").append(toIndentedString(bankInterestRateType)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherApplicationFrequency: ").append(toIndentedString(otherApplicationFrequency)).append("\n");
    sb.append("    otherBankInterestType: ").append(toIndentedString(otherBankInterestType)).append("\n");
    sb.append("    otherCalculationFrequency: ").append(toIndentedString(otherCalculationFrequency)).append("\n");
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

