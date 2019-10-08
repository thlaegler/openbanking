package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.laegler.openbanking.model.OtherType4;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Details about the mobile application services that may be available with the BCA product
 */
@ApiModel(description = "Details about the mobile application services that may be available with the BCA product")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class FeaturesAndBenefitsMobileWallet   {
  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("OtherType")
  private OtherType4 otherType = null;

  /**
   * Mobile applications that the BCA product will support
   */
  public enum TypeEnum {
    ANDROIDPAY("AndroidPay"),
    
    APPLEPAY("ApplePay"),
    
    GOOGLEPAY("GooglePay"),
    
    ISSUERMOBILEAPP("IssuerMobileApp"),
    
    MOBILEBANKINGAPP("MobileBankingApp"),
    
    OTHER("Other"),
    
    PAYM("PayM"),
    
    SAMSUNGPAY("SamsungPay"),
    
    VODAFONEWALLET("VodafoneWallet");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("Type")
  private TypeEnum type = null;

  public FeaturesAndBenefitsMobileWallet notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public FeaturesAndBenefitsMobileWallet addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Free text for adding any extra information for MobileWallet.
   * @return notes
  **/
  @ApiModelProperty(value = "Free text for adding any extra information for MobileWallet.")


  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public FeaturesAndBenefitsMobileWallet otherType(OtherType4 otherType) {
    this.otherType = otherType;
    return this;
  }

  /**
   * Get otherType
   * @return otherType
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OtherType4 getOtherType() {
    return otherType;
  }

  public void setOtherType(OtherType4 otherType) {
    this.otherType = otherType;
  }

  public FeaturesAndBenefitsMobileWallet type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Mobile applications that the BCA product will support
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Mobile applications that the BCA product will support")
  @NotNull


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeaturesAndBenefitsMobileWallet featuresAndBenefitsMobileWallet = (FeaturesAndBenefitsMobileWallet) o;
    return Objects.equals(this.notes, featuresAndBenefitsMobileWallet.notes) &&
        Objects.equals(this.otherType, featuresAndBenefitsMobileWallet.otherType) &&
        Objects.equals(this.type, featuresAndBenefitsMobileWallet.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notes, otherType, type);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

