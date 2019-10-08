package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.laegler.openbanking.model.FeeApplicableRange;
import com.laegler.openbanking.model.OtherApplicationFrequency;
import com.laegler.openbanking.model.OtherCalculationFrequency;
import com.laegler.openbanking.model.OtherFeeCategory;
import com.laegler.openbanking.model.OtherFeeRateType;
import com.laegler.openbanking.model.OtherFeeType5;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Other fees/charges details
 */
@ApiModel(description = "Other fees/charges details")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class OtherFeesCharges2FeeChargeDetail   {
  /**
   * How frequently the fee/charge is applied to the account
   */
  public enum ApplicationFrequencyEnum {
    ACCOUNTCLOSING("AccountClosing"),
    
    ACCOUNTOPENING("AccountOpening"),
    
    ACADEMICTERM("AcademicTerm"),
    
    CHARGINGPERIOD("ChargingPeriod"),
    
    DAILY("Daily"),
    
    PERITEM("PerItem"),
    
    MONTHLY("Monthly"),
    
    ONACCOUNTANNIVERSARY("OnAccountAnniversary"),
    
    OTHER("Other"),
    
    PERHOUR("PerHour"),
    
    PEROCCURRENCE("PerOccurrence"),
    
    PERSHEET("PerSheet"),
    
    PERTRANSACTION("PerTransaction"),
    
    PERTRANSACTIONAMOUNT("PerTransactionAmount"),
    
    PERTRANSACTIONPERCENTAGE("PerTransactionPercentage"),
    
    QUARTERLY("Quarterly"),
    
    SIXMONTHLY("SixMonthly"),
    
    STATEMENTMONTHLY("StatementMonthly"),
    
    WEEKLY("Weekly"),
    
    YEARLY("Yearly");

    private String value;

    ApplicationFrequencyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ApplicationFrequencyEnum fromValue(String text) {
      for (ApplicationFrequencyEnum b : ApplicationFrequencyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("ApplicationFrequency")
  private ApplicationFrequencyEnum applicationFrequency = null;

  /**
   * How frequently the fee/charge is calculated
   */
  public enum CalculationFrequencyEnum {
    ACCOUNTCLOSING("AccountClosing"),
    
    ACCOUNTOPENING("AccountOpening"),
    
    ACADEMICTERM("AcademicTerm"),
    
    CHARGINGPERIOD("ChargingPeriod"),
    
    DAILY("Daily"),
    
    PERITEM("PerItem"),
    
    MONTHLY("Monthly"),
    
    ONACCOUNTANNIVERSARY("OnAccountAnniversary"),
    
    OTHER("Other"),
    
    PERHOUR("PerHour"),
    
    PEROCCURRENCE("PerOccurrence"),
    
    PERSHEET("PerSheet"),
    
    PERTRANSACTION("PerTransaction"),
    
    PERTRANSACTIONAMOUNT("PerTransactionAmount"),
    
    PERTRANSACTIONPERCENTAGE("PerTransactionPercentage"),
    
    QUARTERLY("Quarterly"),
    
    SIXMONTHLY("SixMonthly"),
    
    STATEMENTMONTHLY("StatementMonthly"),
    
    WEEKLY("Weekly"),
    
    YEARLY("Yearly");

    private String value;

    CalculationFrequencyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CalculationFrequencyEnum fromValue(String text) {
      for (CalculationFrequencyEnum b : CalculationFrequencyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("CalculationFrequency")
  private CalculationFrequencyEnum calculationFrequency = null;

  @JsonProperty("FeeAmount")
  private String feeAmount = null;

  @JsonProperty("FeeApplicableRange")
  private FeeApplicableRange feeApplicableRange = null;

  /**
   * Categorisation of fees and charges into standard categories.
   */
  public enum FeeCategoryEnum {
    AUTO("AUTO"),
    
    ATM("ATM"),
    
    BANKERSDRAFTS("BankersDrafts"),
    
    CASHCENTRE("CashCentre"),
    
    CARD("Card"),
    
    CHEQUE("Cheque"),
    
    COUNTERSERVICES("CounterServices"),
    
    FOREIGN("Foreign"),
    
    FX("FX"),
    
    INTERNATIONAL("International"),
    
    INVESTIGATION("Investigation"),
    
    LEGAL("Legal"),
    
    NIGHTSAFE("NightSafe"),
    
    ONLINE("Online"),
    
    OTHER("Other"),
    
    PAYMENTSCHEME("PaymentScheme"),
    
    REPORT("Report"),
    
    SAFEKEEPING("Safekeeping"),
    
    SERVICING("Servicing"),
    
    TRANSACTION("Transaction");

    private String value;

    FeeCategoryEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FeeCategoryEnum fromValue(String text) {
      for (FeeCategoryEnum b : FeeCategoryEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("FeeCategory")
  private FeeCategoryEnum feeCategory = null;

  @JsonProperty("FeeRate")
  private String feeRate = null;

  /**
   * Rate type for Fee/Charge (where it is charged in terms of a rate rather than an amount)
   */
  public enum FeeRateTypeEnum {
    LINKEDBASERATE("LinkedBaseRate"),
    
    GROSS("Gross"),
    
    NET("Net"),
    
    OTHER("Other");

    private String value;

    FeeRateTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FeeRateTypeEnum fromValue(String text) {
      for (FeeRateTypeEnum b : FeeRateTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("FeeRateType")
  private FeeRateTypeEnum feeRateType = null;

  /**
   * Fee/Charge Type
   */
  public enum FeeTypeEnum {
    CASHCENTRECOINHANDLING("CashCentreCoinHandling"),
    
    CASHCENTRECASHX("CashCentreCashX"),
    
    CASHCENTRECASHFEEPERCENT("CashCentreCashFeePercent"),
    
    CASHCENTRECASHFEERATE("CashCentreCashFeeRate"),
    
    CASHCENTRENOTESLODGED("CashCentreNotesLodged"),
    
    CASHCENTRENOTESOUT("CashCentreNotesOut"),
    
    CASHCENTRECASHIN("CashCentreCashIn"),
    
    CASHCENTRECASHOUT("CashCentreCashOut"),
    
    REPORTCERTBALANCE("ReportCertBalance"),
    
    ATMABROADCONVISADEBIT("ATMAbroadConVisaDebit"),
    
    ATMCONGROUPATM("ATMConGroupATM"),
    
    ATMABROAD("ATMAbroad"),
    
    ATMFOREIGNCASHDEBCARD("ATMForeignCashDebCard"),
    
    ATMABROADGOLDVISADEBIT("ATMAbroadGoldVisaDebit"),
    
    ATMNONSTERLINGWITHDRAWAL("ATMNonSterlingWithdrawal"),
    
    ATMABROADVISADEBIT("ATMAbroadVisaDebit"),
    
    CHAPSOUTBRANCH("CHAPSOutBranch"),
    
    CHAPSCANCELLATION("CHAPSCancellation"),
    
    CHAPSIN("CHAPSIn"),
    
    CHAPSOUTINTERBANK("CHAPSOutInterBank"),
    
    CHAPSINTERBANK("CHAPSInterBank"),
    
    CHAPSOUTPOST("CHAPSOutPost"),
    
    CHAPSOUTINTERBRANCH("CHAPSOutInterBranch"),
    
    CHAPSOUT("CHAPSOut"),
    
    CHAPSOUTONLINE("CHAPSOutOnline"),
    
    CARDCARDREPLACEMENT("CardCardReplacement"),
    
    DRAFTSCOUNTER("DraftsCounter"),
    
    DRAFTSBANKERS("DraftsBankers"),
    
    DRAFTSCANCELLATION("DraftsCancellation"),
    
    CARDGUARANTEED("CardGuaranteed"),
    
    DRAFTSINTLPAYABLEABROAD("DraftsIntlPayableAbroad"),
    
    DRAFTSLOSTSTOLEN("DraftsLostStolen"),
    
    CARDPERSONALISEDCARD("CardPersonalisedCard"),
    
    DRAFTSINTLSTOPPEDCANCELLED("DraftsIntlStoppedCancelled"),
    
    EMERGENCYLENDING("EmergencyLending"),
    
    FPSINBRANCH("FPSInBranch"),
    
    LEGALCOURTORDER("LegalCourtOrder"),
    
    INTLPAYFXPAYMENTIN("IntlPayFXPaymentIn"),
    
    INTLPAYFOREIGNPAYMENTINUKACC("IntlPayForeignPaymentInUKAcc"),
    
    INTLPAYFOREIGNCHARGE("IntlPayForeignCharge"),
    
    INTLPAYFOREIGNINTERNET("IntlPayForeignInternet"),
    
    INTLPAYFXPAYMENTOUT("IntlPayFXPaymentOut"),
    
    INTLPAYFXPAYMENTOUTIR("IntlPayFXPaymentOutIR"),
    
    INTLPAYPURCHASENONSTERLING("IntlPayPurchaseNonSterling"),
    
    INTLPAYPAYMENTTRACING("IntlPayPaymentTracing"),
    
    INTLPAYTRANSNONSTERLING("IntlPayTransNonSterling"),
    
    INTLPAYTRANSRATENONSTERLING("IntlPayTransRateNonSterling"),
    
    INTLPAYWORLDPAYPAYMENT("IntlPayWorldpayPayment"),
    
    INVPAYBANKDETAILSWRONG("InvPayBankDetailsWrong"),
    
    INVPAYFOREIGNBCNR("InvPayForeignBCNR"),
    
    INVPAYFOREIGNRECALL("InvPayForeignRecall"),
    
    INVPAYSTANDINGORDUNPAID("InvPayStandingOrdUnpaid"),
    
    SAFEKEEPINGENVELOPE("SafeKeepingEnvelope"),
    
    SAFEKEEPINGINSPECTION("SafeKeepingInspection"),
    
    SAFEKEEPINGLARGEITEM("SafeKeepingLargeItem"),
    
    SAFEKEEPINGPARCEL("SafeKeepingParcel"),
    
    NIGHTSAFENIGHTSAFEPAIDIN("NightSafeNightSafePaidIn"),
    
    OVERDRAFTREVIEW("OverdraftReview"),
    
    CHQBOOKTHEFTLOSSALLSTOPPED("ChqBookTheftLossAllStopped"),
    
    CHQCOPY("ChqCopy"),
    
    CHQDRAFTSTERLING("ChqDraftSterling"),
    
    CHQOUTISSUED("ChqOutIssued"),
    
    CHQSPECIALCHQPRESENTATION("ChqSpecialChqPresentation"),
    
    CHQSPECIALCHQCLEARANCE("ChqSpecialChqClearance"),
    
    CHQSTOPPED("ChqStopped"),
    
    CHQINCASHCENTRE("ChqinCashCentre"),
    
    CHQDRAFTFX("ChqDraftFX"),
    
    CHQFOREIGNCOURIER("ChqForeignCourier"),
    
    CHQGIFTCHEQUE("ChqGiftCheque"),
    
    CHQFOREIGN("ChqForeign"),
    
    CHQCHEQUEPHOTOCOPY("ChqChequePhotocopy"),
    
    CHQCHEQUERETRIEVAL("ChqChequeRetrieval"),
    
    CHQSPECIALPRESENTATIONCOUNT("ChqSpecialPresentationCount"),
    
    CHQSPECIALPRESENTATIONPTT("ChqSpecialPresentationPTT"),
    
    CHQUNPAIDCHARGE("ChqUnpaidCharge"),
    
    CHQUNPAIDTRANSIN("ChqUnpaidTransIn"),
    
    CHQUNPAIDTRANSOUT("ChqUnpaidTransOut"),
    
    CHQUNPAIDCHEQUE("ChqUnpaidCheque"),
    
    REPORTCERTINTERESTDUPLICATE("ReportCertInterestDuplicate"),
    
    REPORTCERTINTEREST("ReportCertInterest"),
    
    REPORTREFERENCE("ReportReference"),
    
    REPORTREFERRALITEM("ReportReferralItem"),
    
    REPORTSTATEMENTCOPYREGULAR("ReportStatementCopyRegular"),
    
    REPORTSTATUSENQUIRY("ReportStatusEnquiry"),
    
    REPORTSTATEMENTFREQUENT("ReportStatementFrequent"),
    
    REPORTSTATEMENTCOPY1("ReportStatementCopy1"),
    
    SEPAIN("SEPAIn"),
    
    SEPAEURO("SEPAEuro"),
    
    SEPAOUT("SEPAOut"),
    
    TRANSCREDITTRANSFERUKDIFFERENT("TransCreditTransferUKDifferent"),
    
    TRANSCREDIT("TransCredit"),
    
    TRANSCREDITTRANSFER("TransCreditTransfer"),
    
    TRANSBUYFOREIGNWITHGBP("TransBuyForeignWithGBP"),
    
    TRANSSWIFTOUTUKFOREIGN("TransSWIFTOutUKForeign"),
    
    TRANSPOSSALEFOREIGN("TransPOSSaleForeign"),
    
    TRANSRETURNPAYMENT("TransReturnPayment"),
    
    TRANSTRANSFEREXGROUP("TransTransferExGroup"),
    
    TRANSSWIFTOUTNONEEASTERLING("TransSWIFTOutNonEEASterling"),
    
    AUTOAUTOMATEDENTRIES("AutoAutomatedEntries"),
    
    ONLINEREPLACEMENTCARDREADER("OnlineReplacementCardReader"),
    
    ONLINEURGENTPAYMENT("OnlineUrgentPayment"),
    
    FOREIGNCHQSENT("ForeignChqSent"),
    
    FOREIGNFXINWARDSCUST("ForeignFXInwardsCust"),
    
    FOREIGNFXOUTWARDS("ForeignFXOutwards"),
    
    FOREIGNPURCHASE("ForeignPurchase"),
    
    FOREIGNCHQDRAFT("ForeignChqDraft"),
    
    SERVICECACCOUNTFEE("ServiceCAccountFee"),
    
    SERVICECACCOUNTFEEMONTHLY("ServiceCAccountFeeMonthly"),
    
    SERVICECOTHER("ServiceCOther"),
    
    COUNTERCASHOUT("CounterCashOut"),
    
    COUNTERFOREIGNNOTEHANDLING("CounterForeignNoteHandling"),
    
    COUNTERFOREIGNCASHOUT("CounterForeignCashOut"),
    
    COUNTERCASHFEERATE("CounterCashFeeRate"),
    
    OTHER("Other");

    private String value;

    FeeTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FeeTypeEnum fromValue(String text) {
      for (FeeTypeEnum b : FeeTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("FeeType")
  private FeeTypeEnum feeType = null;

  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("OtherApplicationFrequency")
  private OtherApplicationFrequency otherApplicationFrequency = null;

  @JsonProperty("OtherCalculationFrequency")
  private OtherCalculationFrequency otherCalculationFrequency = null;

  @JsonProperty("OtherFeeCategory")
  private OtherFeeCategory otherFeeCategory = null;

  @JsonProperty("OtherFeeRateType")
  private OtherFeeRateType otherFeeRateType = null;

  @JsonProperty("OtherFeeType")
  private OtherFeeType5 otherFeeType = null;

  public OtherFeesCharges2FeeChargeDetail applicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
    this.applicationFrequency = applicationFrequency;
    return this;
  }

  /**
   * How frequently the fee/charge is applied to the account
   * @return applicationFrequency
  **/
  @ApiModelProperty(required = true, value = "How frequently the fee/charge is applied to the account")
  @NotNull


  public ApplicationFrequencyEnum getApplicationFrequency() {
    return applicationFrequency;
  }

  public void setApplicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
    this.applicationFrequency = applicationFrequency;
  }

  public OtherFeesCharges2FeeChargeDetail calculationFrequency(CalculationFrequencyEnum calculationFrequency) {
    this.calculationFrequency = calculationFrequency;
    return this;
  }

  /**
   * How frequently the fee/charge is calculated
   * @return calculationFrequency
  **/
  @ApiModelProperty(required = true, value = "How frequently the fee/charge is calculated")
  @NotNull


  public CalculationFrequencyEnum getCalculationFrequency() {
    return calculationFrequency;
  }

  public void setCalculationFrequency(CalculationFrequencyEnum calculationFrequency) {
    this.calculationFrequency = calculationFrequency;
  }

  public OtherFeesCharges2FeeChargeDetail feeAmount(String feeAmount) {
    this.feeAmount = feeAmount;
    return this;
  }

  /**
   * Fee Amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)
   * @return feeAmount
  **/
  @ApiModelProperty(value = "Fee Amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)")

@Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$") 
  public String getFeeAmount() {
    return feeAmount;
  }

  public void setFeeAmount(String feeAmount) {
    this.feeAmount = feeAmount;
  }

  public OtherFeesCharges2FeeChargeDetail feeApplicableRange(FeeApplicableRange feeApplicableRange) {
    this.feeApplicableRange = feeApplicableRange;
    return this;
  }

  /**
   * Get feeApplicableRange
   * @return feeApplicableRange
  **/
  @ApiModelProperty(value = "")

  @Valid

  public FeeApplicableRange getFeeApplicableRange() {
    return feeApplicableRange;
  }

  public void setFeeApplicableRange(FeeApplicableRange feeApplicableRange) {
    this.feeApplicableRange = feeApplicableRange;
  }

  public OtherFeesCharges2FeeChargeDetail feeCategory(FeeCategoryEnum feeCategory) {
    this.feeCategory = feeCategory;
    return this;
  }

  /**
   * Categorisation of fees and charges into standard categories.
   * @return feeCategory
  **/
  @ApiModelProperty(required = true, value = "Categorisation of fees and charges into standard categories.")
  @NotNull


  public FeeCategoryEnum getFeeCategory() {
    return feeCategory;
  }

  public void setFeeCategory(FeeCategoryEnum feeCategory) {
    this.feeCategory = feeCategory;
  }

  public OtherFeesCharges2FeeChargeDetail feeRate(String feeRate) {
    this.feeRate = feeRate;
    return this;
  }

  /**
   * Rate charged for Fee/Charge (where it is charged in terms of a rate rather than an amount)
   * @return feeRate
  **/
  @ApiModelProperty(value = "Rate charged for Fee/Charge (where it is charged in terms of a rate rather than an amount)")

@Pattern(regexp="^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$") 
  public String getFeeRate() {
    return feeRate;
  }

  public void setFeeRate(String feeRate) {
    this.feeRate = feeRate;
  }

  public OtherFeesCharges2FeeChargeDetail feeRateType(FeeRateTypeEnum feeRateType) {
    this.feeRateType = feeRateType;
    return this;
  }

  /**
   * Rate type for Fee/Charge (where it is charged in terms of a rate rather than an amount)
   * @return feeRateType
  **/
  @ApiModelProperty(value = "Rate type for Fee/Charge (where it is charged in terms of a rate rather than an amount)")


  public FeeRateTypeEnum getFeeRateType() {
    return feeRateType;
  }

  public void setFeeRateType(FeeRateTypeEnum feeRateType) {
    this.feeRateType = feeRateType;
  }

  public OtherFeesCharges2FeeChargeDetail feeType(FeeTypeEnum feeType) {
    this.feeType = feeType;
    return this;
  }

  /**
   * Fee/Charge Type
   * @return feeType
  **/
  @ApiModelProperty(required = true, value = "Fee/Charge Type")
  @NotNull


  public FeeTypeEnum getFeeType() {
    return feeType;
  }

  public void setFeeType(FeeTypeEnum feeType) {
    this.feeType = feeType;
  }

  public OtherFeesCharges2FeeChargeDetail notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OtherFeesCharges2FeeChargeDetail addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Optional additional notes to supplement the fee/charge details.
   * @return notes
  **/
  @ApiModelProperty(value = "Optional additional notes to supplement the fee/charge details.")


  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public OtherFeesCharges2FeeChargeDetail otherApplicationFrequency(OtherApplicationFrequency otherApplicationFrequency) {
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

  public OtherFeesCharges2FeeChargeDetail otherCalculationFrequency(OtherCalculationFrequency otherCalculationFrequency) {
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

  public OtherFeesCharges2FeeChargeDetail otherFeeCategory(OtherFeeCategory otherFeeCategory) {
    this.otherFeeCategory = otherFeeCategory;
    return this;
  }

  /**
   * Get otherFeeCategory
   * @return otherFeeCategory
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OtherFeeCategory getOtherFeeCategory() {
    return otherFeeCategory;
  }

  public void setOtherFeeCategory(OtherFeeCategory otherFeeCategory) {
    this.otherFeeCategory = otherFeeCategory;
  }

  public OtherFeesCharges2FeeChargeDetail otherFeeRateType(OtherFeeRateType otherFeeRateType) {
    this.otherFeeRateType = otherFeeRateType;
    return this;
  }

  /**
   * Get otherFeeRateType
   * @return otherFeeRateType
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OtherFeeRateType getOtherFeeRateType() {
    return otherFeeRateType;
  }

  public void setOtherFeeRateType(OtherFeeRateType otherFeeRateType) {
    this.otherFeeRateType = otherFeeRateType;
  }

  public OtherFeesCharges2FeeChargeDetail otherFeeType(OtherFeeType5 otherFeeType) {
    this.otherFeeType = otherFeeType;
    return this;
  }

  /**
   * Get otherFeeType
   * @return otherFeeType
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OtherFeeType5 getOtherFeeType() {
    return otherFeeType;
  }

  public void setOtherFeeType(OtherFeeType5 otherFeeType) {
    this.otherFeeType = otherFeeType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OtherFeesCharges2FeeChargeDetail otherFeesCharges2FeeChargeDetail = (OtherFeesCharges2FeeChargeDetail) o;
    return Objects.equals(this.applicationFrequency, otherFeesCharges2FeeChargeDetail.applicationFrequency) &&
        Objects.equals(this.calculationFrequency, otherFeesCharges2FeeChargeDetail.calculationFrequency) &&
        Objects.equals(this.feeAmount, otherFeesCharges2FeeChargeDetail.feeAmount) &&
        Objects.equals(this.feeApplicableRange, otherFeesCharges2FeeChargeDetail.feeApplicableRange) &&
        Objects.equals(this.feeCategory, otherFeesCharges2FeeChargeDetail.feeCategory) &&
        Objects.equals(this.feeRate, otherFeesCharges2FeeChargeDetail.feeRate) &&
        Objects.equals(this.feeRateType, otherFeesCharges2FeeChargeDetail.feeRateType) &&
        Objects.equals(this.feeType, otherFeesCharges2FeeChargeDetail.feeType) &&
        Objects.equals(this.notes, otherFeesCharges2FeeChargeDetail.notes) &&
        Objects.equals(this.otherApplicationFrequency, otherFeesCharges2FeeChargeDetail.otherApplicationFrequency) &&
        Objects.equals(this.otherCalculationFrequency, otherFeesCharges2FeeChargeDetail.otherCalculationFrequency) &&
        Objects.equals(this.otherFeeCategory, otherFeesCharges2FeeChargeDetail.otherFeeCategory) &&
        Objects.equals(this.otherFeeRateType, otherFeesCharges2FeeChargeDetail.otherFeeRateType) &&
        Objects.equals(this.otherFeeType, otherFeesCharges2FeeChargeDetail.otherFeeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationFrequency, calculationFrequency, feeAmount, feeApplicableRange, feeCategory, feeRate, feeRateType, feeType, notes, otherApplicationFrequency, otherCalculationFrequency, otherFeeCategory, otherFeeRateType, otherFeeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtherFeesCharges2FeeChargeDetail {\n");
    
    sb.append("    applicationFrequency: ").append(toIndentedString(applicationFrequency)).append("\n");
    sb.append("    calculationFrequency: ").append(toIndentedString(calculationFrequency)).append("\n");
    sb.append("    feeAmount: ").append(toIndentedString(feeAmount)).append("\n");
    sb.append("    feeApplicableRange: ").append(toIndentedString(feeApplicableRange)).append("\n");
    sb.append("    feeCategory: ").append(toIndentedString(feeCategory)).append("\n");
    sb.append("    feeRate: ").append(toIndentedString(feeRate)).append("\n");
    sb.append("    feeRateType: ").append(toIndentedString(feeRateType)).append("\n");
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherApplicationFrequency: ").append(toIndentedString(otherApplicationFrequency)).append("\n");
    sb.append("    otherCalculationFrequency: ").append(toIndentedString(otherCalculationFrequency)).append("\n");
    sb.append("    otherFeeCategory: ").append(toIndentedString(otherFeeCategory)).append("\n");
    sb.append("    otherFeeRateType: ").append(toIndentedString(otherFeeRateType)).append("\n");
    sb.append("    otherFeeType: ").append(toIndentedString(otherFeeType)).append("\n");
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

