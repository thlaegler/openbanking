package com.laegler.openbanking.model;

import io.swagger.annotations.ApiModel;

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
  * Other Fee/charge type which is not available in the standard code set
 **/
@ApiModel(description="Other Fee/charge type which is not available in the standard code set")
public class OtherFeeType  {
  
  @ApiModelProperty(value = "The four letter Mnemonic used within an XML file to identify a code")
 /**
   * The four letter Mnemonic used within an XML file to identify a code
  **/
  private String code = null;

  @ApiModelProperty(required = true, value = "Description to describe the purpose of the code")
 /**
   * Description to describe the purpose of the code
  **/
  private String description = null;


@XmlType(name="FeeCategoryEnum")
@XmlEnum(String.class)
public enum FeeCategoryEnum {

@XmlEnumValue("Auto") AUTO(String.valueOf("Auto")), @XmlEnumValue("ATM") ATM(String.valueOf("ATM")), @XmlEnumValue("BankersDrafts") BANKERSDRAFTS(String.valueOf("BankersDrafts")), @XmlEnumValue("CashCentre") CASHCENTRE(String.valueOf("CashCentre")), @XmlEnumValue("Card") CARD(String.valueOf("Card")), @XmlEnumValue("Cheque") CHEQUE(String.valueOf("Cheque")), @XmlEnumValue("CounterServices") COUNTERSERVICES(String.valueOf("CounterServices")), @XmlEnumValue("DirectDebit") DIRECTDEBIT(String.valueOf("DirectDebit")), @XmlEnumValue("Deeds") DEEDS(String.valueOf("Deeds")), @XmlEnumValue("Foreign") FOREIGN(String.valueOf("Foreign")), @XmlEnumValue("FX") FX(String.valueOf("FX")), @XmlEnumValue("International") INTERNATIONAL(String.valueOf("International")), @XmlEnumValue("Investigation") INVESTIGATION(String.valueOf("Investigation")), @XmlEnumValue("Legal") LEGAL(String.valueOf("Legal")), @XmlEnumValue("Loan") LOAN(String.valueOf("Loan")), @XmlEnumValue("NightSafe") NIGHTSAFE(String.valueOf("NightSafe")), @XmlEnumValue("Online") ONLINE(String.valueOf("Online")), @XmlEnumValue("Other") OTHER(String.valueOf("Other")), @XmlEnumValue("PostOffice") POSTOFFICE(String.valueOf("PostOffice")), @XmlEnumValue("PaymentScheme") PAYMENTSCHEME(String.valueOf("PaymentScheme")), @XmlEnumValue("Report") REPORT(String.valueOf("Report")), @XmlEnumValue("Safekeeping") SAFEKEEPING(String.valueOf("Safekeeping")), @XmlEnumValue("Servicing") SERVICING(String.valueOf("Servicing")), @XmlEnumValue("Transaction") TRANSACTION(String.valueOf("Transaction"));


    private String value;

    FeeCategoryEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static FeeCategoryEnum fromValue(String v) {
        for (FeeCategoryEnum b : FeeCategoryEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Categorisation of fees and charges into standard categories.")
 /**
   * Categorisation of fees and charges into standard categories.
  **/
  private FeeCategoryEnum feeCategory = null;

  @ApiModelProperty(required = true, value = "Long name associated with the code")
 /**
   * Long name associated with the code
  **/
  private String name = null;
 /**
   * The four letter Mnemonic used within an XML file to identify a code
   * @return code
  **/
  @JsonProperty("Code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public OtherFeeType code(String code) {
    this.code = code;
    return this;
  }

 /**
   * Description to describe the purpose of the code
   * @return description
  **/
  @JsonProperty("Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OtherFeeType description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Categorisation of fees and charges into standard categories.
   * @return feeCategory
  **/
  @JsonProperty("FeeCategory")
  public String getFeeCategory() {
    if (feeCategory == null) {
      return null;
    }
    return feeCategory.value();
  }

  public void setFeeCategory(FeeCategoryEnum feeCategory) {
    this.feeCategory = feeCategory;
  }

  public OtherFeeType feeCategory(FeeCategoryEnum feeCategory) {
    this.feeCategory = feeCategory;
    return this;
  }

 /**
   * Long name associated with the code
   * @return name
  **/
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OtherFeeType name(String name) {
    this.name = name;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtherFeeType {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    feeCategory: ").append(toIndentedString(feeCategory)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

