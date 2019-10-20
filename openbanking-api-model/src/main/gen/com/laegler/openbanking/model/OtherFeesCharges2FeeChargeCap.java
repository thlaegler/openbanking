package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.laegler.openbanking.model.BranchCurrentAccountResponseOtherFeeType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Details about any caps (maximum charges) that apply to a particular fee/charge
 */
@ApiModel(description = "Details about any caps (maximum charges) that apply to a particular fee/charge")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class OtherFeesCharges2FeeChargeCap   {
  /**
   * Period e.g. day, week, month etc. for which the fee/charge is capped
   */
  public enum CappingPeriodEnum {
    DAY("Day"),
    
    HALFYEAR("HalfYear"),
    
    MONTH("Month"),
    
    QUARTER("Quarter"),
    
    WEEK("Week"),
    
    ACADEMICTERM("AcademicTerm"),
    
    YEAR("Year");

    private String value;

    CappingPeriodEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CappingPeriodEnum fromValue(String text) {
      for (CappingPeriodEnum b : CappingPeriodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("CappingPeriod")
  private CappingPeriodEnum cappingPeriod = null;

  @JsonProperty("FeeCapAmount")
  private String feeCapAmount = null;

  @JsonProperty("FeeCapOccurrence")
  private Float feeCapOccurrence = null;

  /**
   * Fee/charge type which is being capped
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
  @Valid
  private List<FeeTypeEnum> feeType = new ArrayList<>();

  /**
   * Indicates that this is the minimum/ maximum fee/charge that can be applied by the financial institution
   */
  public enum MinMaxTypeEnum {
    MINIMUM("Minimum"),
    
    MAXIMUM("Maximum");

    private String value;

    MinMaxTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MinMaxTypeEnum fromValue(String text) {
      for (MinMaxTypeEnum b : MinMaxTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("MinMaxType")
  private MinMaxTypeEnum minMaxType = null;

  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("OtherFeeType")
  @Valid
  private List<BranchCurrentAccountResponseOtherFeeType> otherFeeType = null;

  public OtherFeesCharges2FeeChargeCap cappingPeriod(CappingPeriodEnum cappingPeriod) {
    this.cappingPeriod = cappingPeriod;
    return this;
  }

  /**
   * Period e.g. day, week, month etc. for which the fee/charge is capped
   * @return cappingPeriod
  **/
  @ApiModelProperty(value = "Period e.g. day, week, month etc. for which the fee/charge is capped")


  public CappingPeriodEnum getCappingPeriod() {
    return cappingPeriod;
  }

  public void setCappingPeriod(CappingPeriodEnum cappingPeriod) {
    this.cappingPeriod = cappingPeriod;
  }

  public OtherFeesCharges2FeeChargeCap feeCapAmount(String feeCapAmount) {
    this.feeCapAmount = feeCapAmount;
    return this;
  }

  /**
   * Cap amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)
   * @return feeCapAmount
  **/
  @ApiModelProperty(value = "Cap amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)")

@Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$") 
  public String getFeeCapAmount() {
    return feeCapAmount;
  }

  public void setFeeCapAmount(String feeCapAmount) {
    this.feeCapAmount = feeCapAmount;
  }

  public OtherFeesCharges2FeeChargeCap feeCapOccurrence(Float feeCapOccurrence) {
    this.feeCapOccurrence = feeCapOccurrence;
    return this;
  }

  /**
   * fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount
   * @return feeCapOccurrence
  **/
  @ApiModelProperty(value = "fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount")


  public Float getFeeCapOccurrence() {
    return feeCapOccurrence;
  }

  public void setFeeCapOccurrence(Float feeCapOccurrence) {
    this.feeCapOccurrence = feeCapOccurrence;
  }

  public OtherFeesCharges2FeeChargeCap feeType(List<FeeTypeEnum> feeType) {
    this.feeType = feeType;
    return this;
  }

  public OtherFeesCharges2FeeChargeCap addFeeTypeItem(FeeTypeEnum feeTypeItem) {
    this.feeType.add(feeTypeItem);
    return this;
  }

  /**
   * Fee/charge type which is being capped
   * @return feeType
  **/
  @ApiModelProperty(required = true, value = "Fee/charge type which is being capped")
  @NotNull

@Size(min=1) 
  public List<FeeTypeEnum> getFeeType() {
    return feeType;
  }

  public void setFeeType(List<FeeTypeEnum> feeType) {
    this.feeType = feeType;
  }

  public OtherFeesCharges2FeeChargeCap minMaxType(MinMaxTypeEnum minMaxType) {
    this.minMaxType = minMaxType;
    return this;
  }

  /**
   * Indicates that this is the minimum/ maximum fee/charge that can be applied by the financial institution
   * @return minMaxType
  **/
  @ApiModelProperty(required = true, value = "Indicates that this is the minimum/ maximum fee/charge that can be applied by the financial institution")
  @NotNull


  public MinMaxTypeEnum getMinMaxType() {
    return minMaxType;
  }

  public void setMinMaxType(MinMaxTypeEnum minMaxType) {
    this.minMaxType = minMaxType;
  }

  public OtherFeesCharges2FeeChargeCap notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OtherFeesCharges2FeeChargeCap addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Free text for adding  extra details for fee charge cap
   * @return notes
  **/
  @ApiModelProperty(value = "Free text for adding  extra details for fee charge cap")


  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public OtherFeesCharges2FeeChargeCap otherFeeType(List<BranchCurrentAccountResponseOtherFeeType> otherFeeType) {
    this.otherFeeType = otherFeeType;
    return this;
  }

  public OtherFeesCharges2FeeChargeCap addOtherFeeTypeItem(BranchCurrentAccountResponseOtherFeeType otherFeeTypeItem) {
    if (this.otherFeeType == null) {
      this.otherFeeType = new ArrayList<>();
    }
    this.otherFeeType.add(otherFeeTypeItem);
    return this;
  }

  /**
   * Other fee type code which is not available in the standard code set
   * @return otherFeeType
  **/
  @ApiModelProperty(value = "Other fee type code which is not available in the standard code set")

  @Valid

  public List<BranchCurrentAccountResponseOtherFeeType> getOtherFeeType() {
    return otherFeeType;
  }

  public void setOtherFeeType(List<BranchCurrentAccountResponseOtherFeeType> otherFeeType) {
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
    OtherFeesCharges2FeeChargeCap otherFeesCharges2FeeChargeCap = (OtherFeesCharges2FeeChargeCap) o;
    return Objects.equals(this.cappingPeriod, otherFeesCharges2FeeChargeCap.cappingPeriod) &&
        Objects.equals(this.feeCapAmount, otherFeesCharges2FeeChargeCap.feeCapAmount) &&
        Objects.equals(this.feeCapOccurrence, otherFeesCharges2FeeChargeCap.feeCapOccurrence) &&
        Objects.equals(this.feeType, otherFeesCharges2FeeChargeCap.feeType) &&
        Objects.equals(this.minMaxType, otherFeesCharges2FeeChargeCap.minMaxType) &&
        Objects.equals(this.notes, otherFeesCharges2FeeChargeCap.notes) &&
        Objects.equals(this.otherFeeType, otherFeesCharges2FeeChargeCap.otherFeeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cappingPeriod, feeCapAmount, feeCapOccurrence, feeType, minMaxType, notes, otherFeeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtherFeesCharges2FeeChargeCap {\n");
    
    sb.append("    cappingPeriod: ").append(toIndentedString(cappingPeriod)).append("\n");
    sb.append("    feeCapAmount: ").append(toIndentedString(feeCapAmount)).append("\n");
    sb.append("    feeCapOccurrence: ").append(toIndentedString(feeCapOccurrence)).append("\n");
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    minMaxType: ").append(toIndentedString(minMaxType)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

