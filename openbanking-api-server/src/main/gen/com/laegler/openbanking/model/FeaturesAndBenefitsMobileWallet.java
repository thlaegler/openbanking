package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OtherType4;
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
  * Details about the mobile application services that may be available with the BCA product
 **/
@ApiModel(description="Details about the mobile application services that may be available with the BCA product")
public class FeaturesAndBenefitsMobileWallet  {
  
  @ApiModelProperty(value = "Free text for adding any extra information for MobileWallet.")
 /**
   * Free text for adding any extra information for MobileWallet.
  **/
  private List<String> notes = null;

  @ApiModelProperty(value = "")
  @Valid
  private OtherType4 otherType = null;


@XmlType(name="TypeEnum")
@XmlEnum(String.class)
public enum TypeEnum {

@XmlEnumValue("AndroidPay") ANDROIDPAY(String.valueOf("AndroidPay")), @XmlEnumValue("ApplePay") APPLEPAY(String.valueOf("ApplePay")), @XmlEnumValue("GooglePay") GOOGLEPAY(String.valueOf("GooglePay")), @XmlEnumValue("IssuerMobileApp") ISSUERMOBILEAPP(String.valueOf("IssuerMobileApp")), @XmlEnumValue("MobileBankingApp") MOBILEBANKINGAPP(String.valueOf("MobileBankingApp")), @XmlEnumValue("Other") OTHER(String.valueOf("Other")), @XmlEnumValue("PayM") PAYM(String.valueOf("PayM")), @XmlEnumValue("SamsungPay") SAMSUNGPAY(String.valueOf("SamsungPay")), @XmlEnumValue("VodafoneWallet") VODAFONEWALLET(String.valueOf("VodafoneWallet"));


    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TypeEnum fromValue(String v) {
        for (TypeEnum b : TypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Mobile applications that the BCA product will support")
 /**
   * Mobile applications that the BCA product will support
  **/
  private TypeEnum type = null;
 /**
   * Free text for adding any extra information for MobileWallet.
   * @return notes
  **/
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public FeaturesAndBenefitsMobileWallet notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public FeaturesAndBenefitsMobileWallet addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Get otherType
   * @return otherType
  **/
  @JsonProperty("OtherType")
  public OtherType4 getOtherType() {
    return otherType;
  }

  public void setOtherType(OtherType4 otherType) {
    this.otherType = otherType;
  }

  public FeaturesAndBenefitsMobileWallet otherType(OtherType4 otherType) {
    this.otherType = otherType;
    return this;
  }

 /**
   * Mobile applications that the BCA product will support
   * @return type
  **/
  @JsonProperty("Type")
  @NotNull
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.value();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public FeaturesAndBenefitsMobileWallet type(TypeEnum type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeaturesAndBenefitsMobileWallet {\n");
    
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherType: ").append(toIndentedString(otherType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

