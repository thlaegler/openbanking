package com.laegler.openbanking.model;

import io.swagger.annotations.ApiModel;
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
  * Other Fee/charge type which is not available in the standard code set
 **/
@ApiModel(description="Other Fee/charge type which is not available in the standard code set")
public class OtherFeeType2  {
  
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

@XmlEnumValue("CashAdvance") CASHADVANCE(String.valueOf("CashAdvance")), @XmlEnumValue("BalanceTransfer") BALANCETRANSFER(String.valueOf("BalanceTransfer")), @XmlEnumValue("Purchase") PURCHASE(String.valueOf("Purchase")), @XmlEnumValue("Cheque") CHEQUE(String.valueOf("Cheque")), @XmlEnumValue("Card") CARD(String.valueOf("Card")), @XmlEnumValue("FX") FX(String.valueOf("FX")), @XmlEnumValue("Penalty") PENALTY(String.valueOf("Penalty")), @XmlEnumValue("Servicing") SERVICING(String.valueOf("Servicing")), @XmlEnumValue("Other") OTHER(String.valueOf("Other"));


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
 @Pattern(regexp="^\\w{0,4}$") @Size(min=0,max=4)  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public OtherFeeType2 code(String code) {
    this.code = code;
    return this;
  }

 /**
   * Description to describe the purpose of the code
   * @return description
  **/
  @JsonProperty("Description")
  @NotNull
 @Size(min=1,max=350)  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OtherFeeType2 description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Categorisation of fees and charges into standard categories.
   * @return feeCategory
  **/
  @JsonProperty("FeeCategory")
  @NotNull
  public String getFeeCategory() {
    if (feeCategory == null) {
      return null;
    }
    return feeCategory.value();
  }

  public void setFeeCategory(FeeCategoryEnum feeCategory) {
    this.feeCategory = feeCategory;
  }

  public OtherFeeType2 feeCategory(FeeCategoryEnum feeCategory) {
    this.feeCategory = feeCategory;
    return this;
  }

 /**
   * Long name associated with the code
   * @return name
  **/
  @JsonProperty("Name")
  @NotNull
 @Size(min=1,max=70)  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OtherFeeType2 name(String name) {
    this.name = name;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtherFeeType2 {\n");
    
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

