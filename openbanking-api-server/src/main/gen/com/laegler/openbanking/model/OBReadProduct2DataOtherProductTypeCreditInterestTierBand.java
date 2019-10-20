package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBInterestFixedVariableType1Code;
import com.laegler.openbanking.model.OBOtherCodeType11;
import com.laegler.openbanking.model.OBOtherCodeType12;
import com.laegler.openbanking.model.OBReadProduct2DataOtherProductTypeCreditInterestOtherBankInterestType;
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
  * Tier Band Details
 **/
@ApiModel(description="Tier Band Details")
public class OBReadProduct2DataOtherProductTypeCreditInterestTierBand  {
  
  @ApiModelProperty(required = true, value = "The annual equivalent rate (AER) is interest that is calculated under the assumption that any interest paid is combined with the original balance and the next interest payment will be based on the slightly higher account balance. Overall, this means that interest can be compounded several times in a year depending on the number of times that interest payments are made.  Read more: Annual Equivalent Rate (AER) http://www.investopedia.com/terms/a/aer.asp#ixzz4gfR7IO1A")
 /**
   * The annual equivalent rate (AER) is interest that is calculated under the assumption that any interest paid is combined with the original balance and the next interest payment will be based on the slightly higher account balance. Overall, this means that interest can be compounded several times in a year depending on the number of times that interest payments are made.  Read more: Annual Equivalent Rate (AER) http://www.investopedia.com/terms/a/aer.asp#ixzz4gfR7IO1A
  **/
  private String AER = null;


@XmlType(name="ApplicationFrequencyEnum")
@XmlEnum(String.class)
public enum ApplicationFrequencyEnum {

@XmlEnumValue("FQAT") FQAT(String.valueOf("FQAT")), @XmlEnumValue("FQDY") FQDY(String.valueOf("FQDY")), @XmlEnumValue("FQHY") FQHY(String.valueOf("FQHY")), @XmlEnumValue("FQMY") FQMY(String.valueOf("FQMY")), @XmlEnumValue("FQOT") FQOT(String.valueOf("FQOT")), @XmlEnumValue("FQQY") FQQY(String.valueOf("FQQY")), @XmlEnumValue("FQSD") FQSD(String.valueOf("FQSD")), @XmlEnumValue("FQWY") FQWY(String.valueOf("FQWY")), @XmlEnumValue("FQYY") FQYY(String.valueOf("FQYY"));


    private String value;

    ApplicationFrequencyEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ApplicationFrequencyEnum fromValue(String v) {
        for (ApplicationFrequencyEnum b : ApplicationFrequencyEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "How often is interest applied to the Product for this tier/band i.e. how often the financial institution pays accumulated interest to the customer's account.")
 /**
   * How often is interest applied to the Product for this tier/band i.e. how often the financial institution pays accumulated interest to the customer's account.
  **/
  private ApplicationFrequencyEnum applicationFrequency = null;

  @ApiModelProperty(value = "Bank Interest for the product")
 /**
   * Bank Interest for the product
  **/
  private String bankInterestRate = null;


@XmlType(name="BankInterestRateTypeEnum")
@XmlEnum(String.class)
public enum BankInterestRateTypeEnum {

@XmlEnumValue("INBB") INBB(String.valueOf("INBB")), @XmlEnumValue("INFR") INFR(String.valueOf("INFR")), @XmlEnumValue("INGR") INGR(String.valueOf("INGR")), @XmlEnumValue("INLR") INLR(String.valueOf("INLR")), @XmlEnumValue("INNE") INNE(String.valueOf("INNE")), @XmlEnumValue("INOT") INOT(String.valueOf("INOT"));


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

  @ApiModelProperty(value = "Interest rate types, other than AER, which financial institutions may use to describe the annual interest rate payable to the account holder's account.")
 /**
   * Interest rate types, other than AER, which financial institutions may use to describe the annual interest rate payable to the account holder's account.
  **/
  private BankInterestRateTypeEnum bankInterestRateType = null;


@XmlType(name="CalculationFrequencyEnum")
@XmlEnum(String.class)
public enum CalculationFrequencyEnum {

@XmlEnumValue("FQAT") FQAT(String.valueOf("FQAT")), @XmlEnumValue("FQDY") FQDY(String.valueOf("FQDY")), @XmlEnumValue("FQHY") FQHY(String.valueOf("FQHY")), @XmlEnumValue("FQMY") FQMY(String.valueOf("FQMY")), @XmlEnumValue("FQOT") FQOT(String.valueOf("FQOT")), @XmlEnumValue("FQQY") FQQY(String.valueOf("FQQY")), @XmlEnumValue("FQSD") FQSD(String.valueOf("FQSD")), @XmlEnumValue("FQWY") FQWY(String.valueOf("FQWY")), @XmlEnumValue("FQYY") FQYY(String.valueOf("FQYY"));


    private String value;

    CalculationFrequencyEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CalculationFrequencyEnum fromValue(String v) {
        for (CalculationFrequencyEnum b : CalculationFrequencyEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "How often is credit interest calculated for the account.")
 /**
   * How often is credit interest calculated for the account.
  **/
  private CalculationFrequencyEnum calculationFrequency = null;


@XmlType(name="DepositInterestAppliedCoverageEnum")
@XmlEnum(String.class)
public enum DepositInterestAppliedCoverageEnum {

@XmlEnumValue("INBA") INBA(String.valueOf("INBA")), @XmlEnumValue("INTI") INTI(String.valueOf("INTI")), @XmlEnumValue("INWH") INWH(String.valueOf("INWH"));


    private String value;

    DepositInterestAppliedCoverageEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DepositInterestAppliedCoverageEnum fromValue(String v) {
        for (DepositInterestAppliedCoverageEnum b : DepositInterestAppliedCoverageEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Amount on which Interest applied.")
 /**
   * Amount on which Interest applied.
  **/
  private DepositInterestAppliedCoverageEnum depositInterestAppliedCoverage = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private OBInterestFixedVariableType1Code fixedVariableInterestRateType = null;

  @ApiModelProperty(value = "Unique and unambiguous identification of a  Tier Band for the Product.")
 /**
   * Unique and unambiguous identification of a  Tier Band for the Product.
  **/
  private String identification = null;

  @ApiModelProperty(value = "")
  private List<String> notes = null;

  @ApiModelProperty(value = "")
  @Valid
  private OBOtherCodeType11 otherApplicationFrequency = null;

  @ApiModelProperty(value = "")
  @Valid
  private OBReadProduct2DataOtherProductTypeCreditInterestOtherBankInterestType otherBankInterestType = null;

  @ApiModelProperty(value = "")
  @Valid
  private OBOtherCodeType12 otherCalculationFrequency = null;

  @ApiModelProperty(value = "Maximum deposit value for which the credit interest tier applies.")
 /**
   * Maximum deposit value for which the credit interest tier applies.
  **/
  private String tierValueMaximum = null;

  @ApiModelProperty(required = true, value = "Minimum deposit value for which the credit interest tier applies.")
 /**
   * Minimum deposit value for which the credit interest tier applies.
  **/
  private String tierValueMinimum = null;
 /**
   * The annual equivalent rate (AER) is interest that is calculated under the assumption that any interest paid is combined with the original balance and the next interest payment will be based on the slightly higher account balance. Overall, this means that interest can be compounded several times in a year depending on the number of times that interest payments are made.  Read more: Annual Equivalent Rate (AER) http://www.investopedia.com/terms/a/aer.asp#ixzz4gfR7IO1A
   * @return AER
  **/
  @JsonProperty("AER")
  @NotNull
 @Pattern(regexp="^(-?\\\\d{1,3}){1}(\\\\.\\\\d{1,4}){0,1}$")  public String getAER() {
    return AER;
  }

  public void setAER(String AER) {
    this.AER = AER;
  }

  public OBReadProduct2DataOtherProductTypeCreditInterestTierBand AER(String AER) {
    this.AER = AER;
    return this;
  }

 /**
   * How often is interest applied to the Product for this tier/band i.e. how often the financial institution pays accumulated interest to the customer&#39;s account.
   * @return applicationFrequency
  **/
  @JsonProperty("ApplicationFrequency")
  @NotNull
  public String getApplicationFrequency() {
    if (applicationFrequency == null) {
      return null;
    }
    return applicationFrequency.value();
  }

  public void setApplicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
    this.applicationFrequency = applicationFrequency;
  }

  public OBReadProduct2DataOtherProductTypeCreditInterestTierBand applicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
    this.applicationFrequency = applicationFrequency;
    return this;
  }

 /**
   * Bank Interest for the product
   * @return bankInterestRate
  **/
  @JsonProperty("BankInterestRate")
 @Pattern(regexp="^(-?\\\\d{1,3}){1}(\\\\.\\\\d{1,4}){0,1}$")  public String getBankInterestRate() {
    return bankInterestRate;
  }

  public void setBankInterestRate(String bankInterestRate) {
    this.bankInterestRate = bankInterestRate;
  }

  public OBReadProduct2DataOtherProductTypeCreditInterestTierBand bankInterestRate(String bankInterestRate) {
    this.bankInterestRate = bankInterestRate;
    return this;
  }

 /**
   * Interest rate types, other than AER, which financial institutions may use to describe the annual interest rate payable to the account holder&#39;s account.
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

  public OBReadProduct2DataOtherProductTypeCreditInterestTierBand bankInterestRateType(BankInterestRateTypeEnum bankInterestRateType) {
    this.bankInterestRateType = bankInterestRateType;
    return this;
  }

 /**
   * How often is credit interest calculated for the account.
   * @return calculationFrequency
  **/
  @JsonProperty("CalculationFrequency")
  public String getCalculationFrequency() {
    if (calculationFrequency == null) {
      return null;
    }
    return calculationFrequency.value();
  }

  public void setCalculationFrequency(CalculationFrequencyEnum calculationFrequency) {
    this.calculationFrequency = calculationFrequency;
  }

  public OBReadProduct2DataOtherProductTypeCreditInterestTierBand calculationFrequency(CalculationFrequencyEnum calculationFrequency) {
    this.calculationFrequency = calculationFrequency;
    return this;
  }

 /**
   * Amount on which Interest applied.
   * @return depositInterestAppliedCoverage
  **/
  @JsonProperty("DepositInterestAppliedCoverage")
  public String getDepositInterestAppliedCoverage() {
    if (depositInterestAppliedCoverage == null) {
      return null;
    }
    return depositInterestAppliedCoverage.value();
  }

  public void setDepositInterestAppliedCoverage(DepositInterestAppliedCoverageEnum depositInterestAppliedCoverage) {
    this.depositInterestAppliedCoverage = depositInterestAppliedCoverage;
  }

  public OBReadProduct2DataOtherProductTypeCreditInterestTierBand depositInterestAppliedCoverage(DepositInterestAppliedCoverageEnum depositInterestAppliedCoverage) {
    this.depositInterestAppliedCoverage = depositInterestAppliedCoverage;
    return this;
  }

 /**
   * Get fixedVariableInterestRateType
   * @return fixedVariableInterestRateType
  **/
  @JsonProperty("FixedVariableInterestRateType")
  @NotNull
  public OBInterestFixedVariableType1Code getFixedVariableInterestRateType() {
    return fixedVariableInterestRateType;
  }

  public void setFixedVariableInterestRateType(OBInterestFixedVariableType1Code fixedVariableInterestRateType) {
    this.fixedVariableInterestRateType = fixedVariableInterestRateType;
  }

  public OBReadProduct2DataOtherProductTypeCreditInterestTierBand fixedVariableInterestRateType(OBInterestFixedVariableType1Code fixedVariableInterestRateType) {
    this.fixedVariableInterestRateType = fixedVariableInterestRateType;
    return this;
  }

 /**
   * Unique and unambiguous identification of a  Tier Band for the Product.
   * @return identification
  **/
  @JsonProperty("Identification")
 @Size(min=1,max=35)  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public OBReadProduct2DataOtherProductTypeCreditInterestTierBand identification(String identification) {
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

  public OBReadProduct2DataOtherProductTypeCreditInterestTierBand notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeCreditInterestTierBand addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Get otherApplicationFrequency
   * @return otherApplicationFrequency
  **/
  @JsonProperty("OtherApplicationFrequency")
  public OBOtherCodeType11 getOtherApplicationFrequency() {
    return otherApplicationFrequency;
  }

  public void setOtherApplicationFrequency(OBOtherCodeType11 otherApplicationFrequency) {
    this.otherApplicationFrequency = otherApplicationFrequency;
  }

  public OBReadProduct2DataOtherProductTypeCreditInterestTierBand otherApplicationFrequency(OBOtherCodeType11 otherApplicationFrequency) {
    this.otherApplicationFrequency = otherApplicationFrequency;
    return this;
  }

 /**
   * Get otherBankInterestType
   * @return otherBankInterestType
  **/
  @JsonProperty("OtherBankInterestType")
  public OBReadProduct2DataOtherProductTypeCreditInterestOtherBankInterestType getOtherBankInterestType() {
    return otherBankInterestType;
  }

  public void setOtherBankInterestType(OBReadProduct2DataOtherProductTypeCreditInterestOtherBankInterestType otherBankInterestType) {
    this.otherBankInterestType = otherBankInterestType;
  }

  public OBReadProduct2DataOtherProductTypeCreditInterestTierBand otherBankInterestType(OBReadProduct2DataOtherProductTypeCreditInterestOtherBankInterestType otherBankInterestType) {
    this.otherBankInterestType = otherBankInterestType;
    return this;
  }

 /**
   * Get otherCalculationFrequency
   * @return otherCalculationFrequency
  **/
  @JsonProperty("OtherCalculationFrequency")
  public OBOtherCodeType12 getOtherCalculationFrequency() {
    return otherCalculationFrequency;
  }

  public void setOtherCalculationFrequency(OBOtherCodeType12 otherCalculationFrequency) {
    this.otherCalculationFrequency = otherCalculationFrequency;
  }

  public OBReadProduct2DataOtherProductTypeCreditInterestTierBand otherCalculationFrequency(OBOtherCodeType12 otherCalculationFrequency) {
    this.otherCalculationFrequency = otherCalculationFrequency;
    return this;
  }

 /**
   * Maximum deposit value for which the credit interest tier applies.
   * @return tierValueMaximum
  **/
  @JsonProperty("TierValueMaximum")
 @Pattern(regexp="^(-?\\\\d{1,14}){1}(\\\\.\\\\d{1,4}){0,1}$")  public String getTierValueMaximum() {
    return tierValueMaximum;
  }

  public void setTierValueMaximum(String tierValueMaximum) {
    this.tierValueMaximum = tierValueMaximum;
  }

  public OBReadProduct2DataOtherProductTypeCreditInterestTierBand tierValueMaximum(String tierValueMaximum) {
    this.tierValueMaximum = tierValueMaximum;
    return this;
  }

 /**
   * Minimum deposit value for which the credit interest tier applies.
   * @return tierValueMinimum
  **/
  @JsonProperty("TierValueMinimum")
  @NotNull
 @Pattern(regexp="^(-?\\\\d{1,14}){1}(\\\\.\\\\d{1,4}){0,1}$")  public String getTierValueMinimum() {
    return tierValueMinimum;
  }

  public void setTierValueMinimum(String tierValueMinimum) {
    this.tierValueMinimum = tierValueMinimum;
  }

  public OBReadProduct2DataOtherProductTypeCreditInterestTierBand tierValueMinimum(String tierValueMinimum) {
    this.tierValueMinimum = tierValueMinimum;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataOtherProductTypeCreditInterestTierBand {\n");
    
    sb.append("    AER: ").append(toIndentedString(AER)).append("\n");
    sb.append("    applicationFrequency: ").append(toIndentedString(applicationFrequency)).append("\n");
    sb.append("    bankInterestRate: ").append(toIndentedString(bankInterestRate)).append("\n");
    sb.append("    bankInterestRateType: ").append(toIndentedString(bankInterestRateType)).append("\n");
    sb.append("    calculationFrequency: ").append(toIndentedString(calculationFrequency)).append("\n");
    sb.append("    depositInterestAppliedCoverage: ").append(toIndentedString(depositInterestAppliedCoverage)).append("\n");
    sb.append("    fixedVariableInterestRateType: ").append(toIndentedString(fixedVariableInterestRateType)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherApplicationFrequency: ").append(toIndentedString(otherApplicationFrequency)).append("\n");
    sb.append("    otherBankInterestType: ").append(toIndentedString(otherBankInterestType)).append("\n");
    sb.append("    otherCalculationFrequency: ").append(toIndentedString(otherCalculationFrequency)).append("\n");
    sb.append("    tierValueMaximum: ").append(toIndentedString(tierValueMaximum)).append("\n");
    sb.append("    tierValueMinimum: ").append(toIndentedString(tierValueMinimum)).append("\n");
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

