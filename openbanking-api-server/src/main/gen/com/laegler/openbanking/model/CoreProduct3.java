package com.laegler.openbanking.model;

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
  * SME Loan core product details.
 **/
@ApiModel(description="SME Loan core product details.")
public class CoreProduct3  {
  
  @ApiModelProperty(required = true, value = "Early repayment fee charged for this loan product.")
 /**
   * Early repayment fee charged for this loan product.
  **/
  private Boolean earlyPaymentFeeApplicable = null;

  @ApiModelProperty(value = "FullEarlyRepaymentAllowedIndicator states whether a borrower can pay off the entire residual prior to the expected end of the loan term without incurring charges")
 /**
   * FullEarlyRepaymentAllowedIndicator states whether a borrower can pay off the entire residual prior to the expected end of the loan term without incurring charges
  **/
  private Boolean fullEarlyRepaymentAllowedIndicator = null;


@XmlType(name="LoanApplicationFeeChargeTypeEnum")
@XmlEnum(String.class)
public enum LoanApplicationFeeChargeTypeEnum {

@XmlEnumValue("ChargedAfterLoanApproval") CHARGEDAFTERLOANAPPROVAL(String.valueOf("ChargedAfterLoanApproval")), @XmlEnumValue("ChargedIrrespectiveOfLoanApproval") CHARGEDIRRESPECTIVEOFLOANAPPROVAL(String.valueOf("ChargedIrrespectiveOfLoanApproval")), @XmlEnumValue("NoLoanApplicationFee") NOLOANAPPLICATIONFEE(String.valueOf("NoLoanApplicationFee"));


    private String value;

    LoanApplicationFeeChargeTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static LoanApplicationFeeChargeTypeEnum fromValue(String v) {
        for (LoanApplicationFeeChargeTypeEnum b : LoanApplicationFeeChargeTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Loan application fee charged type.")
 /**
   * Loan application fee charged type.
  **/
  private LoanApplicationFeeChargeTypeEnum loanApplicationFeeChargeType = null;

  @ApiModelProperty(value = "Optional additional notes to supplement the Core Product Details")
 /**
   * Optional additional notes to supplement the Core Product Details
  **/
  private List<String> notes = null;

  @ApiModelProperty(required = true, value = "Overpayment fee charged for this loan product.")
 /**
   * Overpayment fee charged for this loan product.
  **/
  private Boolean overPaymentFeeApplicable = null;

  @ApiModelProperty(value = "OverpaymentAllowedIndictor says whether a borrower can pay more than the repayment amount specified by the lender, in a particular period, without incurring charges.")
 /**
   * OverpaymentAllowedIndictor says whether a borrower can pay more than the repayment amount specified by the lender, in a particular period, without incurring charges.
  **/
  private Boolean overpaymentAllowedIndicator = null;

  @ApiModelProperty(value = "The description of the SME Loan product used for marketing purposes from a customer perspective.")
 /**
   * The description of the SME Loan product used for marketing purposes from a customer perspective.
  **/
  private String productDescription = null;

  @ApiModelProperty(required = true, value = "URL provided by the organisation which redirects to the product (on live products only) available on an external website. There might be more than one product at a given URL.")
 /**
   * URL provided by the organisation which redirects to the product (on live products only) available on an external website. There might be more than one product at a given URL.
  **/
  private String productURL = null;


@XmlType(name="SalesAccessChannelsEnum")
@XmlEnum(String.class)
public enum SalesAccessChannelsEnum {

@XmlEnumValue("Branch") BRANCH(String.valueOf("Branch")), @XmlEnumValue("CallCentre") CALLCENTRE(String.valueOf("CallCentre")), @XmlEnumValue("Post") POST(String.valueOf("Post")), @XmlEnumValue("Online") ONLINE(String.valueOf("Online")), @XmlEnumValue("PostOffice") POSTOFFICE(String.valueOf("PostOffice")), @XmlEnumValue("RelationshipManager") RELATIONSHIPMANAGER(String.valueOf("RelationshipManager"));


    private String value;

    SalesAccessChannelsEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SalesAccessChannelsEnum fromValue(String v) {
        for (SalesAccessChannelsEnum b : SalesAccessChannelsEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Methods by which a customer can access the services associated to the SME Loan product")
 /**
   * Methods by which a customer can access the services associated to the SME Loan product
  **/
  private List<SalesAccessChannelsEnum> salesAccessChannels = new ArrayList<SalesAccessChannelsEnum>();


@XmlType(name="ServicingAccessChannelsEnum")
@XmlEnum(String.class)
public enum ServicingAccessChannelsEnum {

@XmlEnumValue("ATM") ATM(String.valueOf("ATM")), @XmlEnumValue("Branch") BRANCH(String.valueOf("Branch")), @XmlEnumValue("CallCentre") CALLCENTRE(String.valueOf("CallCentre")), @XmlEnumValue("Post") POST(String.valueOf("Post")), @XmlEnumValue("MobileBankingApp") MOBILEBANKINGAPP(String.valueOf("MobileBankingApp")), @XmlEnumValue("Online") ONLINE(String.valueOf("Online")), @XmlEnumValue("PostOffice") POSTOFFICE(String.valueOf("PostOffice")), @XmlEnumValue("RelationshipManager") RELATIONSHIPMANAGER(String.valueOf("RelationshipManager")), @XmlEnumValue("Text") TEXT(String.valueOf("Text"));


    private String value;

    ServicingAccessChannelsEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ServicingAccessChannelsEnum fromValue(String v) {
        for (ServicingAccessChannelsEnum b : ServicingAccessChannelsEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Methods by which a customer can access the services associated to the SME Loan product")
 /**
   * Methods by which a customer can access the services associated to the SME Loan product
  **/
  private List<ServicingAccessChannelsEnum> servicingAccessChannels = new ArrayList<ServicingAccessChannelsEnum>();

  @ApiModelProperty(required = true, value = "URL provided by the financial institution which redirects to the SME Loan T&Cs on an external website")
 /**
   * URL provided by the financial institution which redirects to the SME Loan T&Cs on an external website
  **/
  private String tcsAndCsURL = null;
 /**
   * Early repayment fee charged for this loan product.
   * @return earlyPaymentFeeApplicable
  **/
  @JsonProperty("EarlyPaymentFeeApplicable")
  @NotNull
  public Boolean isEarlyPaymentFeeApplicable() {
    return earlyPaymentFeeApplicable;
  }

  public void setEarlyPaymentFeeApplicable(Boolean earlyPaymentFeeApplicable) {
    this.earlyPaymentFeeApplicable = earlyPaymentFeeApplicable;
  }

  public CoreProduct3 earlyPaymentFeeApplicable(Boolean earlyPaymentFeeApplicable) {
    this.earlyPaymentFeeApplicable = earlyPaymentFeeApplicable;
    return this;
  }

 /**
   * FullEarlyRepaymentAllowedIndicator states whether a borrower can pay off the entire residual prior to the expected end of the loan term without incurring charges
   * @return fullEarlyRepaymentAllowedIndicator
  **/
  @JsonProperty("FullEarlyRepaymentAllowedIndicator")
  public Boolean isFullEarlyRepaymentAllowedIndicator() {
    return fullEarlyRepaymentAllowedIndicator;
  }

  public void setFullEarlyRepaymentAllowedIndicator(Boolean fullEarlyRepaymentAllowedIndicator) {
    this.fullEarlyRepaymentAllowedIndicator = fullEarlyRepaymentAllowedIndicator;
  }

  public CoreProduct3 fullEarlyRepaymentAllowedIndicator(Boolean fullEarlyRepaymentAllowedIndicator) {
    this.fullEarlyRepaymentAllowedIndicator = fullEarlyRepaymentAllowedIndicator;
    return this;
  }

 /**
   * Loan application fee charged type.
   * @return loanApplicationFeeChargeType
  **/
  @JsonProperty("LoanApplicationFeeChargeType")
  @NotNull
  public String getLoanApplicationFeeChargeType() {
    if (loanApplicationFeeChargeType == null) {
      return null;
    }
    return loanApplicationFeeChargeType.value();
  }

  public void setLoanApplicationFeeChargeType(LoanApplicationFeeChargeTypeEnum loanApplicationFeeChargeType) {
    this.loanApplicationFeeChargeType = loanApplicationFeeChargeType;
  }

  public CoreProduct3 loanApplicationFeeChargeType(LoanApplicationFeeChargeTypeEnum loanApplicationFeeChargeType) {
    this.loanApplicationFeeChargeType = loanApplicationFeeChargeType;
    return this;
  }

 /**
   * Optional additional notes to supplement the Core Product Details
   * @return notes
  **/
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public CoreProduct3 notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public CoreProduct3 addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Overpayment fee charged for this loan product.
   * @return overPaymentFeeApplicable
  **/
  @JsonProperty("OverPaymentFeeApplicable")
  @NotNull
  public Boolean isOverPaymentFeeApplicable() {
    return overPaymentFeeApplicable;
  }

  public void setOverPaymentFeeApplicable(Boolean overPaymentFeeApplicable) {
    this.overPaymentFeeApplicable = overPaymentFeeApplicable;
  }

  public CoreProduct3 overPaymentFeeApplicable(Boolean overPaymentFeeApplicable) {
    this.overPaymentFeeApplicable = overPaymentFeeApplicable;
    return this;
  }

 /**
   * OverpaymentAllowedIndictor says whether a borrower can pay more than the repayment amount specified by the lender, in a particular period, without incurring charges.
   * @return overpaymentAllowedIndicator
  **/
  @JsonProperty("OverpaymentAllowedIndicator")
  public Boolean isOverpaymentAllowedIndicator() {
    return overpaymentAllowedIndicator;
  }

  public void setOverpaymentAllowedIndicator(Boolean overpaymentAllowedIndicator) {
    this.overpaymentAllowedIndicator = overpaymentAllowedIndicator;
  }

  public CoreProduct3 overpaymentAllowedIndicator(Boolean overpaymentAllowedIndicator) {
    this.overpaymentAllowedIndicator = overpaymentAllowedIndicator;
    return this;
  }

 /**
   * The description of the SME Loan product used for marketing purposes from a customer perspective.
   * @return productDescription
  **/
  @JsonProperty("ProductDescription")
 @Size(min=1,max=2000)  public String getProductDescription() {
    return productDescription;
  }

  public void setProductDescription(String productDescription) {
    this.productDescription = productDescription;
  }

  public CoreProduct3 productDescription(String productDescription) {
    this.productDescription = productDescription;
    return this;
  }

 /**
   * URL provided by the organisation which redirects to the product (on live products only) available on an external website. There might be more than one product at a given URL.
   * @return productURL
  **/
  @JsonProperty("ProductURL")
  @NotNull
 @Size(min=1,max=500)  public String getProductURL() {
    return productURL;
  }

  public void setProductURL(String productURL) {
    this.productURL = productURL;
  }

  public CoreProduct3 productURL(String productURL) {
    this.productURL = productURL;
    return this;
  }

 /**
   * Methods by which a customer can access the services associated to the SME Loan product
   * @return salesAccessChannels
  **/
  @JsonProperty("SalesAccessChannels")
  @NotNull
 @Size(min=1)  public List<SalesAccessChannelsEnum> getSalesAccessChannels() {
    return salesAccessChannels;
  }

  public void setSalesAccessChannels(List<SalesAccessChannelsEnum> salesAccessChannels) {
    this.salesAccessChannels = salesAccessChannels;
  }

  public CoreProduct3 salesAccessChannels(List<SalesAccessChannelsEnum> salesAccessChannels) {
    this.salesAccessChannels = salesAccessChannels;
    return this;
  }

  public CoreProduct3 addSalesAccessChannelsItem(SalesAccessChannelsEnum salesAccessChannelsItem) {
    this.salesAccessChannels.add(salesAccessChannelsItem);
    return this;
  }

 /**
   * Methods by which a customer can access the services associated to the SME Loan product
   * @return servicingAccessChannels
  **/
  @JsonProperty("ServicingAccessChannels")
  @NotNull
 @Size(min=1)  public List<ServicingAccessChannelsEnum> getServicingAccessChannels() {
    return servicingAccessChannels;
  }

  public void setServicingAccessChannels(List<ServicingAccessChannelsEnum> servicingAccessChannels) {
    this.servicingAccessChannels = servicingAccessChannels;
  }

  public CoreProduct3 servicingAccessChannels(List<ServicingAccessChannelsEnum> servicingAccessChannels) {
    this.servicingAccessChannels = servicingAccessChannels;
    return this;
  }

  public CoreProduct3 addServicingAccessChannelsItem(ServicingAccessChannelsEnum servicingAccessChannelsItem) {
    this.servicingAccessChannels.add(servicingAccessChannelsItem);
    return this;
  }

 /**
   * URL provided by the financial institution which redirects to the SME Loan T&amp;Cs on an external website
   * @return tcsAndCsURL
  **/
  @JsonProperty("TcsAndCsURL")
  @NotNull
 @Size(min=1,max=500)  public String getTcsAndCsURL() {
    return tcsAndCsURL;
  }

  public void setTcsAndCsURL(String tcsAndCsURL) {
    this.tcsAndCsURL = tcsAndCsURL;
  }

  public CoreProduct3 tcsAndCsURL(String tcsAndCsURL) {
    this.tcsAndCsURL = tcsAndCsURL;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreProduct3 {\n");
    
    sb.append("    earlyPaymentFeeApplicable: ").append(toIndentedString(earlyPaymentFeeApplicable)).append("\n");
    sb.append("    fullEarlyRepaymentAllowedIndicator: ").append(toIndentedString(fullEarlyRepaymentAllowedIndicator)).append("\n");
    sb.append("    loanApplicationFeeChargeType: ").append(toIndentedString(loanApplicationFeeChargeType)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    overPaymentFeeApplicable: ").append(toIndentedString(overPaymentFeeApplicable)).append("\n");
    sb.append("    overpaymentAllowedIndicator: ").append(toIndentedString(overpaymentAllowedIndicator)).append("\n");
    sb.append("    productDescription: ").append(toIndentedString(productDescription)).append("\n");
    sb.append("    productURL: ").append(toIndentedString(productURL)).append("\n");
    sb.append("    salesAccessChannels: ").append(toIndentedString(salesAccessChannels)).append("\n");
    sb.append("    servicingAccessChannels: ").append(toIndentedString(servicingAccessChannels)).append("\n");
    sb.append("    tcsAndCsURL: ").append(toIndentedString(tcsAndCsURL)).append("\n");
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

