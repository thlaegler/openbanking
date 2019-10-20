package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.laegler.openbanking.model.OtherType5;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Details about the mobile application services that may be available with the PCA product
 */
@ApiModel(description = "Details about the mobile application services that may be available with the PCA product")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class FeaturesAndBenefits2MobileWallet   {
  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("OtherType")
  private OtherType5 otherType = null;

  /**
   * Mobile applications that the PCA product will support
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

  public FeaturesAndBenefits2MobileWallet notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public FeaturesAndBenefits2MobileWallet addNotesItem(String notesItem) {
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

  public FeaturesAndBenefits2MobileWallet otherType(OtherType5 otherType) {
    this.otherType = otherType;
    return this;
  }

  /**
   * Get otherType
   * @return otherType
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OtherType5 getOtherType() {
    return otherType;
  }

  public void setOtherType(OtherType5 otherType) {
    this.otherType = otherType;
  }

  public FeaturesAndBenefits2MobileWallet type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Mobile applications that the PCA product will support
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Mobile applications that the PCA product will support")
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
    FeaturesAndBenefits2MobileWallet featuresAndBenefits2MobileWallet = (FeaturesAndBenefits2MobileWallet) o;
    return Objects.equals(this.notes, featuresAndBenefits2MobileWallet.notes) &&
        Objects.equals(this.otherType, featuresAndBenefits2MobileWallet.otherType) &&
        Objects.equals(this.type, featuresAndBenefits2MobileWallet.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notes, otherType, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeaturesAndBenefits2MobileWallet {\n");
    
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

