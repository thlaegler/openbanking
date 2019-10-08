package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.laegler.openbanking.model.OtherApplicationFrequency;
import com.laegler.openbanking.model.OtherBankInterestType;
import com.laegler.openbanking.model.OtherCalculationFrequency;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Tier Band Details
 */
@ApiModel(description = "Tier Band Details")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class TierBand   {
  @JsonProperty("AER")
  private String AER = null;

  @JsonProperty("BankInterestRate")
  private String bankInterestRate = null;

  /**
   * Interest rate types, other than AER, which financial institutions may use to describe the annual interest rate payable to the BCA.
   */
  public enum BankInterestRateTypeEnum {
    GROSS("Gross"),
    
    OTHER("Other");

    private String value;

    BankInterestRateTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BankInterestRateTypeEnum fromValue(String text) {
      for (BankInterestRateTypeEnum b : BankInterestRateTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("BankInterestRateType")
  private BankInterestRateTypeEnum bankInterestRateType = null;

  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("OtherApplicationFrequency")
  private OtherApplicationFrequency otherApplicationFrequency = null;

  @JsonProperty("OtherBankInterestType")
  private OtherBankInterestType otherBankInterestType = null;

  @JsonProperty("OtherCalculationFrequency")
  private OtherCalculationFrequency otherCalculationFrequency = null;

  public TierBand AER(String AER) {
    this.AER = AER;
    return this;
  }

  /**
   * 'The annual equivalent rate (AER) is interest that is calculated under the assumption that any interest paid is combined with the original balance and the next interest payment will be based on the slightly higher account balance. Overall, this means that interest can be compounded several times in a year depending on the number of times that interest payments are made. \\nRead more: Annual Equivalent Rate (AER) http://www.investopedia.com/terms/a/aer.asp#ixzz4gfR7IO1A'
   * @return AER
  **/
  @ApiModelProperty(required = true, value = "'The annual equivalent rate (AER) is interest that is calculated under the assumption that any interest paid is combined with the original balance and the next interest payment will be based on the slightly higher account balance. Overall, this means that interest can be compounded several times in a year depending on the number of times that interest payments are made. \\nRead more: Annual Equivalent Rate (AER) http://www.investopedia.com/terms/a/aer.asp#ixzz4gfR7IO1A'")
  @NotNull

@Pattern(regexp="^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$") 
  public String getAER() {
    return AER;
  }

  public void setAER(String AER) {
    this.AER = AER;
  }

  public TierBand bankInterestRate(String bankInterestRate) {
    this.bankInterestRate = bankInterestRate;
    return this;
  }

  /**
   * Bank Interest for the BCA product
   * @return bankInterestRate
  **/
  @ApiModelProperty(value = "Bank Interest for the BCA product")

@Pattern(regexp="^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$") 
  public String getBankInterestRate() {
    return bankInterestRate;
  }

  public void setBankInterestRate(String bankInterestRate) {
    this.bankInterestRate = bankInterestRate;
  }

  public TierBand bankInterestRateType(BankInterestRateTypeEnum bankInterestRateType) {
    this.bankInterestRateType = bankInterestRateType;
    return this;
  }

  /**
   * Interest rate types, other than AER, which financial institutions may use to describe the annual interest rate payable to the BCA.
   * @return bankInterestRateType
  **/
  @ApiModelProperty(value = "Interest rate types, other than AER, which financial institutions may use to describe the annual interest rate payable to the BCA.")


  public BankInterestRateTypeEnum getBankInterestRateType() {
    return bankInterestRateType;
  }

  public void setBankInterestRateType(BankInterestRateTypeEnum bankInterestRateType) {
    this.bankInterestRateType = bankInterestRateType;
  }

  public TierBand notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public TierBand addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Optional additional notes to supplement the Tier Band details
   * @return notes
  **/
  @ApiModelProperty(value = "Optional additional notes to supplement the Tier Band details")


  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public TierBand otherApplicationFrequency(OtherApplicationFrequency otherApplicationFrequency) {
    this.otherApplicationFrequency = otherApplicationFrequency;
    return this;
  }

  /**
   * Get otherApplicationFrequency
   * @return otherApplicationFrequency
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OtherApplicationFrequency getOtherApplicationFrequency() {
    return otherApplicationFrequency;
  }

  public void setOtherApplicationFrequency(OtherApplicationFrequency otherApplicationFrequency) {
    this.otherApplicationFrequency = otherApplicationFrequency;
  }

  public TierBand otherBankInterestType(OtherBankInterestType otherBankInterestType) {
    this.otherBankInterestType = otherBankInterestType;
    return this;
  }

  /**
   * Get otherBankInterestType
   * @return otherBankInterestType
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OtherBankInterestType getOtherBankInterestType() {
    return otherBankInterestType;
  }

  public void setOtherBankInterestType(OtherBankInterestType otherBankInterestType) {
    this.otherBankInterestType = otherBankInterestType;
  }

  public TierBand otherCalculationFrequency(OtherCalculationFrequency otherCalculationFrequency) {
    this.otherCalculationFrequency = otherCalculationFrequency;
    return this;
  }

  /**
   * Get otherCalculationFrequency
   * @return otherCalculationFrequency
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OtherCalculationFrequency getOtherCalculationFrequency() {
    return otherCalculationFrequency;
  }

  public void setOtherCalculationFrequency(OtherCalculationFrequency otherCalculationFrequency) {
    this.otherCalculationFrequency = otherCalculationFrequency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TierBand tierBand = (TierBand) o;
    return Objects.equals(this.AER, tierBand.AER) &&
        Objects.equals(this.bankInterestRate, tierBand.bankInterestRate) &&
        Objects.equals(this.bankInterestRateType, tierBand.bankInterestRateType) &&
        Objects.equals(this.notes, tierBand.notes) &&
        Objects.equals(this.otherApplicationFrequency, tierBand.otherApplicationFrequency) &&
        Objects.equals(this.otherBankInterestType, tierBand.otherBankInterestType) &&
        Objects.equals(this.otherCalculationFrequency, tierBand.otherCalculationFrequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(AER, bankInterestRate, bankInterestRateType, notes, otherApplicationFrequency, otherBankInterestType, otherCalculationFrequency);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

