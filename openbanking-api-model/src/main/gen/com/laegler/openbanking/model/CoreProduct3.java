package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SME Loan core product details.
 */
@ApiModel(description = "SME Loan core product details.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class CoreProduct3   {
  @JsonProperty("EarlyPaymentFeeApplicable")
  private Boolean earlyPaymentFeeApplicable = null;

  @JsonProperty("FullEarlyRepaymentAllowedIndicator")
  private Boolean fullEarlyRepaymentAllowedIndicator = null;

  /**
   * Loan application fee charged type.
   */
  public enum LoanApplicationFeeChargeTypeEnum {
    CHARGEDAFTERLOANAPPROVAL("ChargedAfterLoanApproval"),
    
    CHARGEDIRRESPECTIVEOFLOANAPPROVAL("ChargedIrrespectiveOfLoanApproval"),
    
    NOLOANAPPLICATIONFEE("NoLoanApplicationFee");

    private String value;

    LoanApplicationFeeChargeTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LoanApplicationFeeChargeTypeEnum fromValue(String text) {
      for (LoanApplicationFeeChargeTypeEnum b : LoanApplicationFeeChargeTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("LoanApplicationFeeChargeType")
  private LoanApplicationFeeChargeTypeEnum loanApplicationFeeChargeType = null;

  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("OverPaymentFeeApplicable")
  private Boolean overPaymentFeeApplicable = null;

  @JsonProperty("OverpaymentAllowedIndicator")
  private Boolean overpaymentAllowedIndicator = null;

  @JsonProperty("ProductDescription")
  private String productDescription = null;

  @JsonProperty("ProductURL")
  private String productURL = null;

  /**
   * Methods by which a customer can access the services associated to the SME Loan product
   */
  public enum SalesAccessChannelsEnum {
    BRANCH("Branch"),
    
    CALLCENTRE("CallCentre"),
    
    POST("Post"),
    
    ONLINE("Online"),
    
    POSTOFFICE("PostOffice"),
    
    RELATIONSHIPMANAGER("RelationshipManager");

    private String value;

    SalesAccessChannelsEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SalesAccessChannelsEnum fromValue(String text) {
      for (SalesAccessChannelsEnum b : SalesAccessChannelsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("SalesAccessChannels")
  @Valid
  private List<SalesAccessChannelsEnum> salesAccessChannels = new ArrayList<>();

  /**
   * Methods by which a customer can access the services associated to the SME Loan product
   */
  public enum ServicingAccessChannelsEnum {
    ATM("ATM"),
    
    BRANCH("Branch"),
    
    CALLCENTRE("CallCentre"),
    
    POST("Post"),
    
    MOBILEBANKINGAPP("MobileBankingApp"),
    
    ONLINE("Online"),
    
    POSTOFFICE("PostOffice"),
    
    RELATIONSHIPMANAGER("RelationshipManager"),
    
    TEXT("Text");

    private String value;

    ServicingAccessChannelsEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ServicingAccessChannelsEnum fromValue(String text) {
      for (ServicingAccessChannelsEnum b : ServicingAccessChannelsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("ServicingAccessChannels")
  @Valid
  private List<ServicingAccessChannelsEnum> servicingAccessChannels = new ArrayList<>();

  @JsonProperty("TcsAndCsURL")
  private String tcsAndCsURL = null;

  public CoreProduct3 earlyPaymentFeeApplicable(Boolean earlyPaymentFeeApplicable) {
    this.earlyPaymentFeeApplicable = earlyPaymentFeeApplicable;
    return this;
  }

  /**
   * Early repayment fee charged for this loan product.
   * @return earlyPaymentFeeApplicable
  **/
  @ApiModelProperty(required = true, value = "Early repayment fee charged for this loan product.")
  @NotNull


  public Boolean isEarlyPaymentFeeApplicable() {
    return earlyPaymentFeeApplicable;
  }

  public void setEarlyPaymentFeeApplicable(Boolean earlyPaymentFeeApplicable) {
    this.earlyPaymentFeeApplicable = earlyPaymentFeeApplicable;
  }

  public CoreProduct3 fullEarlyRepaymentAllowedIndicator(Boolean fullEarlyRepaymentAllowedIndicator) {
    this.fullEarlyRepaymentAllowedIndicator = fullEarlyRepaymentAllowedIndicator;
    return this;
  }

  /**
   * FullEarlyRepaymentAllowedIndicator states whether a borrower can pay off the entire residual prior to the expected end of the loan term without incurring charges
   * @return fullEarlyRepaymentAllowedIndicator
  **/
  @ApiModelProperty(value = "FullEarlyRepaymentAllowedIndicator states whether a borrower can pay off the entire residual prior to the expected end of the loan term without incurring charges")


  public Boolean isFullEarlyRepaymentAllowedIndicator() {
    return fullEarlyRepaymentAllowedIndicator;
  }

  public void setFullEarlyRepaymentAllowedIndicator(Boolean fullEarlyRepaymentAllowedIndicator) {
    this.fullEarlyRepaymentAllowedIndicator = fullEarlyRepaymentAllowedIndicator;
  }

  public CoreProduct3 loanApplicationFeeChargeType(LoanApplicationFeeChargeTypeEnum loanApplicationFeeChargeType) {
    this.loanApplicationFeeChargeType = loanApplicationFeeChargeType;
    return this;
  }

  /**
   * Loan application fee charged type.
   * @return loanApplicationFeeChargeType
  **/
  @ApiModelProperty(required = true, value = "Loan application fee charged type.")
  @NotNull


  public LoanApplicationFeeChargeTypeEnum getLoanApplicationFeeChargeType() {
    return loanApplicationFeeChargeType;
  }

  public void setLoanApplicationFeeChargeType(LoanApplicationFeeChargeTypeEnum loanApplicationFeeChargeType) {
    this.loanApplicationFeeChargeType = loanApplicationFeeChargeType;
  }

  public CoreProduct3 notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public CoreProduct3 addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Optional additional notes to supplement the Core Product Details
   * @return notes
  **/
  @ApiModelProperty(value = "Optional additional notes to supplement the Core Product Details")


  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public CoreProduct3 overPaymentFeeApplicable(Boolean overPaymentFeeApplicable) {
    this.overPaymentFeeApplicable = overPaymentFeeApplicable;
    return this;
  }

  /**
   * Overpayment fee charged for this loan product.
   * @return overPaymentFeeApplicable
  **/
  @ApiModelProperty(required = true, value = "Overpayment fee charged for this loan product.")
  @NotNull


  public Boolean isOverPaymentFeeApplicable() {
    return overPaymentFeeApplicable;
  }

  public void setOverPaymentFeeApplicable(Boolean overPaymentFeeApplicable) {
    this.overPaymentFeeApplicable = overPaymentFeeApplicable;
  }

  public CoreProduct3 overpaymentAllowedIndicator(Boolean overpaymentAllowedIndicator) {
    this.overpaymentAllowedIndicator = overpaymentAllowedIndicator;
    return this;
  }

  /**
   * OverpaymentAllowedIndictor says whether a borrower can pay more than the repayment amount specified by the lender, in a particular period, without incurring charges.
   * @return overpaymentAllowedIndicator
  **/
  @ApiModelProperty(value = "OverpaymentAllowedIndictor says whether a borrower can pay more than the repayment amount specified by the lender, in a particular period, without incurring charges.")


  public Boolean isOverpaymentAllowedIndicator() {
    return overpaymentAllowedIndicator;
  }

  public void setOverpaymentAllowedIndicator(Boolean overpaymentAllowedIndicator) {
    this.overpaymentAllowedIndicator = overpaymentAllowedIndicator;
  }

  public CoreProduct3 productDescription(String productDescription) {
    this.productDescription = productDescription;
    return this;
  }

  /**
   * The description of the SME Loan product used for marketing purposes from a customer perspective.
   * @return productDescription
  **/
  @ApiModelProperty(value = "The description of the SME Loan product used for marketing purposes from a customer perspective.")

@Size(min=1,max=2000) 
  public String getProductDescription() {
    return productDescription;
  }

  public void setProductDescription(String productDescription) {
    this.productDescription = productDescription;
  }

  public CoreProduct3 productURL(String productURL) {
    this.productURL = productURL;
    return this;
  }

  /**
   * URL provided by the organisation which redirects to the product (on live products only) available on an external website. There might be more than one product at a given URL.
   * @return productURL
  **/
  @ApiModelProperty(required = true, value = "URL provided by the organisation which redirects to the product (on live products only) available on an external website. There might be more than one product at a given URL.")
  @NotNull

@Size(min=1,max=500) 
  public String getProductURL() {
    return productURL;
  }

  public void setProductURL(String productURL) {
    this.productURL = productURL;
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
   * @return salesAccessChannels
  **/
  @ApiModelProperty(required = true, value = "Methods by which a customer can access the services associated to the SME Loan product")
  @NotNull

@Size(min=1) 
  public List<SalesAccessChannelsEnum> getSalesAccessChannels() {
    return salesAccessChannels;
  }

  public void setSalesAccessChannels(List<SalesAccessChannelsEnum> salesAccessChannels) {
    this.salesAccessChannels = salesAccessChannels;
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
   * Methods by which a customer can access the services associated to the SME Loan product
   * @return servicingAccessChannels
  **/
  @ApiModelProperty(required = true, value = "Methods by which a customer can access the services associated to the SME Loan product")
  @NotNull

@Size(min=1) 
  public List<ServicingAccessChannelsEnum> getServicingAccessChannels() {
    return servicingAccessChannels;
  }

  public void setServicingAccessChannels(List<ServicingAccessChannelsEnum> servicingAccessChannels) {
    this.servicingAccessChannels = servicingAccessChannels;
  }

  public CoreProduct3 tcsAndCsURL(String tcsAndCsURL) {
    this.tcsAndCsURL = tcsAndCsURL;
    return this;
  }

  /**
   * URL provided by the financial institution which redirects to the SME Loan T&Cs on an external website
   * @return tcsAndCsURL
  **/
  @ApiModelProperty(required = true, value = "URL provided by the financial institution which redirects to the SME Loan T&Cs on an external website")
  @NotNull

@Size(min=1,max=500) 
  public String getTcsAndCsURL() {
    return tcsAndCsURL;
  }

  public void setTcsAndCsURL(String tcsAndCsURL) {
    this.tcsAndCsURL = tcsAndCsURL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreProduct3 coreProduct3 = (CoreProduct3) o;
    return Objects.equals(this.earlyPaymentFeeApplicable, coreProduct3.earlyPaymentFeeApplicable) &&
        Objects.equals(this.fullEarlyRepaymentAllowedIndicator, coreProduct3.fullEarlyRepaymentAllowedIndicator) &&
        Objects.equals(this.loanApplicationFeeChargeType, coreProduct3.loanApplicationFeeChargeType) &&
        Objects.equals(this.notes, coreProduct3.notes) &&
        Objects.equals(this.overPaymentFeeApplicable, coreProduct3.overPaymentFeeApplicable) &&
        Objects.equals(this.overpaymentAllowedIndicator, coreProduct3.overpaymentAllowedIndicator) &&
        Objects.equals(this.productDescription, coreProduct3.productDescription) &&
        Objects.equals(this.productURL, coreProduct3.productURL) &&
        Objects.equals(this.salesAccessChannels, coreProduct3.salesAccessChannels) &&
        Objects.equals(this.servicingAccessChannels, coreProduct3.servicingAccessChannels) &&
        Objects.equals(this.tcsAndCsURL, coreProduct3.tcsAndCsURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(earlyPaymentFeeApplicable, fullEarlyRepaymentAllowedIndicator, loanApplicationFeeChargeType, notes, overPaymentFeeApplicable, overpaymentAllowedIndicator, productDescription, productURL, salesAccessChannels, servicingAccessChannels, tcsAndCsURL);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

