package com.laegler.openbanking.model;

import com.laegler.openbanking.model.FeeApplicableRange;
import com.laegler.openbanking.model.OtherApplicationFrequency;
import com.laegler.openbanking.model.OtherCalculationFrequency;
import com.laegler.openbanking.model.OtherFeeCategory;
import com.laegler.openbanking.model.OtherFeeRateType;
import com.laegler.openbanking.model.OtherFeeType5;
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
  * Other fees/charges details
 **/
@ApiModel(description="Other fees/charges details")
public class OtherFeesCharges2FeeChargeDetail  {
  

@XmlType(name="ApplicationFrequencyEnum")
@XmlEnum(String.class)
public enum ApplicationFrequencyEnum {

@XmlEnumValue("AccountClosing") ACCOUNTCLOSING(String.valueOf("AccountClosing")), @XmlEnumValue("AccountOpening") ACCOUNTOPENING(String.valueOf("AccountOpening")), @XmlEnumValue("AcademicTerm") ACADEMICTERM(String.valueOf("AcademicTerm")), @XmlEnumValue("ChargingPeriod") CHARGINGPERIOD(String.valueOf("ChargingPeriod")), @XmlEnumValue("Daily") DAILY(String.valueOf("Daily")), @XmlEnumValue("PerItem") PERITEM(String.valueOf("PerItem")), @XmlEnumValue("Monthly") MONTHLY(String.valueOf("Monthly")), @XmlEnumValue("OnAccountAnniversary") ONACCOUNTANNIVERSARY(String.valueOf("OnAccountAnniversary")), @XmlEnumValue("Other") OTHER(String.valueOf("Other")), @XmlEnumValue("PerHour") PERHOUR(String.valueOf("PerHour")), @XmlEnumValue("PerOccurrence") PEROCCURRENCE(String.valueOf("PerOccurrence")), @XmlEnumValue("PerSheet") PERSHEET(String.valueOf("PerSheet")), @XmlEnumValue("PerTransaction") PERTRANSACTION(String.valueOf("PerTransaction")), @XmlEnumValue("PerTransactionAmount") PERTRANSACTIONAMOUNT(String.valueOf("PerTransactionAmount")), @XmlEnumValue("PerTransactionPercentage") PERTRANSACTIONPERCENTAGE(String.valueOf("PerTransactionPercentage")), @XmlEnumValue("Quarterly") QUARTERLY(String.valueOf("Quarterly")), @XmlEnumValue("SixMonthly") SIXMONTHLY(String.valueOf("SixMonthly")), @XmlEnumValue("StatementMonthly") STATEMENTMONTHLY(String.valueOf("StatementMonthly")), @XmlEnumValue("Weekly") WEEKLY(String.valueOf("Weekly")), @XmlEnumValue("Yearly") YEARLY(String.valueOf("Yearly"));


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

  @ApiModelProperty(required = true, value = "How frequently the fee/charge is applied to the account")
 /**
   * How frequently the fee/charge is applied to the account
  **/
  private ApplicationFrequencyEnum applicationFrequency = null;


@XmlType(name="CalculationFrequencyEnum")
@XmlEnum(String.class)
public enum CalculationFrequencyEnum {

@XmlEnumValue("AccountClosing") ACCOUNTCLOSING(String.valueOf("AccountClosing")), @XmlEnumValue("AccountOpening") ACCOUNTOPENING(String.valueOf("AccountOpening")), @XmlEnumValue("AcademicTerm") ACADEMICTERM(String.valueOf("AcademicTerm")), @XmlEnumValue("ChargingPeriod") CHARGINGPERIOD(String.valueOf("ChargingPeriod")), @XmlEnumValue("Daily") DAILY(String.valueOf("Daily")), @XmlEnumValue("PerItem") PERITEM(String.valueOf("PerItem")), @XmlEnumValue("Monthly") MONTHLY(String.valueOf("Monthly")), @XmlEnumValue("OnAccountAnniversary") ONACCOUNTANNIVERSARY(String.valueOf("OnAccountAnniversary")), @XmlEnumValue("Other") OTHER(String.valueOf("Other")), @XmlEnumValue("PerHour") PERHOUR(String.valueOf("PerHour")), @XmlEnumValue("PerOccurrence") PEROCCURRENCE(String.valueOf("PerOccurrence")), @XmlEnumValue("PerSheet") PERSHEET(String.valueOf("PerSheet")), @XmlEnumValue("PerTransaction") PERTRANSACTION(String.valueOf("PerTransaction")), @XmlEnumValue("PerTransactionAmount") PERTRANSACTIONAMOUNT(String.valueOf("PerTransactionAmount")), @XmlEnumValue("PerTransactionPercentage") PERTRANSACTIONPERCENTAGE(String.valueOf("PerTransactionPercentage")), @XmlEnumValue("Quarterly") QUARTERLY(String.valueOf("Quarterly")), @XmlEnumValue("SixMonthly") SIXMONTHLY(String.valueOf("SixMonthly")), @XmlEnumValue("StatementMonthly") STATEMENTMONTHLY(String.valueOf("StatementMonthly")), @XmlEnumValue("Weekly") WEEKLY(String.valueOf("Weekly")), @XmlEnumValue("Yearly") YEARLY(String.valueOf("Yearly"));


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

  @ApiModelProperty(required = true, value = "How frequently the fee/charge is calculated")
 /**
   * How frequently the fee/charge is calculated
  **/
  private CalculationFrequencyEnum calculationFrequency = null;

  @ApiModelProperty(value = "Fee Amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)")
 /**
   * Fee Amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)
  **/
  private String feeAmount = null;

  @ApiModelProperty(value = "")
  @Valid
  private FeeApplicableRange feeApplicableRange = null;


@XmlType(name="FeeCategoryEnum")
@XmlEnum(String.class)
public enum FeeCategoryEnum {

@XmlEnumValue("AUTO") AUTO(String.valueOf("AUTO")), @XmlEnumValue("ATM") ATM(String.valueOf("ATM")), @XmlEnumValue("BankersDrafts") BANKERSDRAFTS(String.valueOf("BankersDrafts")), @XmlEnumValue("CashCentre") CASHCENTRE(String.valueOf("CashCentre")), @XmlEnumValue("Card") CARD(String.valueOf("Card")), @XmlEnumValue("Cheque") CHEQUE(String.valueOf("Cheque")), @XmlEnumValue("CounterServices") COUNTERSERVICES(String.valueOf("CounterServices")), @XmlEnumValue("Foreign") FOREIGN(String.valueOf("Foreign")), @XmlEnumValue("FX") FX(String.valueOf("FX")), @XmlEnumValue("International") INTERNATIONAL(String.valueOf("International")), @XmlEnumValue("Investigation") INVESTIGATION(String.valueOf("Investigation")), @XmlEnumValue("Legal") LEGAL(String.valueOf("Legal")), @XmlEnumValue("NightSafe") NIGHTSAFE(String.valueOf("NightSafe")), @XmlEnumValue("Online") ONLINE(String.valueOf("Online")), @XmlEnumValue("Other") OTHER(String.valueOf("Other")), @XmlEnumValue("PaymentScheme") PAYMENTSCHEME(String.valueOf("PaymentScheme")), @XmlEnumValue("Report") REPORT(String.valueOf("Report")), @XmlEnumValue("Safekeeping") SAFEKEEPING(String.valueOf("Safekeeping")), @XmlEnumValue("Servicing") SERVICING(String.valueOf("Servicing")), @XmlEnumValue("Transaction") TRANSACTION(String.valueOf("Transaction"));


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

  @ApiModelProperty(value = "Rate charged for Fee/Charge (where it is charged in terms of a rate rather than an amount)")
 /**
   * Rate charged for Fee/Charge (where it is charged in terms of a rate rather than an amount)
  **/
  private String feeRate = null;


@XmlType(name="FeeRateTypeEnum")
@XmlEnum(String.class)
public enum FeeRateTypeEnum {

@XmlEnumValue("LinkedBaseRate") LINKEDBASERATE(String.valueOf("LinkedBaseRate")), @XmlEnumValue("Gross") GROSS(String.valueOf("Gross")), @XmlEnumValue("Net") NET(String.valueOf("Net")), @XmlEnumValue("Other") OTHER(String.valueOf("Other"));


    private String value;

    FeeRateTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static FeeRateTypeEnum fromValue(String v) {
        for (FeeRateTypeEnum b : FeeRateTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Rate type for Fee/Charge (where it is charged in terms of a rate rather than an amount)")
 /**
   * Rate type for Fee/Charge (where it is charged in terms of a rate rather than an amount)
  **/
  private FeeRateTypeEnum feeRateType = null;


@XmlType(name="FeeTypeEnum")
@XmlEnum(String.class)
public enum FeeTypeEnum {

@XmlEnumValue("CashCentreCoinHandling") CASHCENTRECOINHANDLING(String.valueOf("CashCentreCoinHandling")), @XmlEnumValue("CashCentreCashX") CASHCENTRECASHX(String.valueOf("CashCentreCashX")), @XmlEnumValue("CashCentreCashFeePercent") CASHCENTRECASHFEEPERCENT(String.valueOf("CashCentreCashFeePercent")), @XmlEnumValue("CashCentreCashFeeRate") CASHCENTRECASHFEERATE(String.valueOf("CashCentreCashFeeRate")), @XmlEnumValue("CashCentreNotesLodged") CASHCENTRENOTESLODGED(String.valueOf("CashCentreNotesLodged")), @XmlEnumValue("CashCentreNotesOut") CASHCENTRENOTESOUT(String.valueOf("CashCentreNotesOut")), @XmlEnumValue("CashCentreCashIn") CASHCENTRECASHIN(String.valueOf("CashCentreCashIn")), @XmlEnumValue("CashCentreCashOut") CASHCENTRECASHOUT(String.valueOf("CashCentreCashOut")), @XmlEnumValue("ReportCertBalance") REPORTCERTBALANCE(String.valueOf("ReportCertBalance")), @XmlEnumValue("ATMAbroadConVisaDebit") ATMABROADCONVISADEBIT(String.valueOf("ATMAbroadConVisaDebit")), @XmlEnumValue("ATMConGroupATM") ATMCONGROUPATM(String.valueOf("ATMConGroupATM")), @XmlEnumValue("ATMAbroad") ATMABROAD(String.valueOf("ATMAbroad")), @XmlEnumValue("ATMForeignCashDebCard") ATMFOREIGNCASHDEBCARD(String.valueOf("ATMForeignCashDebCard")), @XmlEnumValue("ATMAbroadGoldVisaDebit") ATMABROADGOLDVISADEBIT(String.valueOf("ATMAbroadGoldVisaDebit")), @XmlEnumValue("ATMNonSterlingWithdrawal") ATMNONSTERLINGWITHDRAWAL(String.valueOf("ATMNonSterlingWithdrawal")), @XmlEnumValue("ATMAbroadVisaDebit") ATMABROADVISADEBIT(String.valueOf("ATMAbroadVisaDebit")), @XmlEnumValue("CHAPSOutBranch") CHAPSOUTBRANCH(String.valueOf("CHAPSOutBranch")), @XmlEnumValue("CHAPSCancellation") CHAPSCANCELLATION(String.valueOf("CHAPSCancellation")), @XmlEnumValue("CHAPSIn") CHAPSIN(String.valueOf("CHAPSIn")), @XmlEnumValue("CHAPSOutInterBank") CHAPSOUTINTERBANK(String.valueOf("CHAPSOutInterBank")), @XmlEnumValue("CHAPSInterBank") CHAPSINTERBANK(String.valueOf("CHAPSInterBank")), @XmlEnumValue("CHAPSOutPost") CHAPSOUTPOST(String.valueOf("CHAPSOutPost")), @XmlEnumValue("CHAPSOutInterBranch") CHAPSOUTINTERBRANCH(String.valueOf("CHAPSOutInterBranch")), @XmlEnumValue("CHAPSOut") CHAPSOUT(String.valueOf("CHAPSOut")), @XmlEnumValue("CHAPSOutOnline") CHAPSOUTONLINE(String.valueOf("CHAPSOutOnline")), @XmlEnumValue("CardCardReplacement") CARDCARDREPLACEMENT(String.valueOf("CardCardReplacement")), @XmlEnumValue("DraftsCounter") DRAFTSCOUNTER(String.valueOf("DraftsCounter")), @XmlEnumValue("DraftsBankers") DRAFTSBANKERS(String.valueOf("DraftsBankers")), @XmlEnumValue("DraftsCancellation") DRAFTSCANCELLATION(String.valueOf("DraftsCancellation")), @XmlEnumValue("CardGuaranteed") CARDGUARANTEED(String.valueOf("CardGuaranteed")), @XmlEnumValue("DraftsIntlPayableAbroad") DRAFTSINTLPAYABLEABROAD(String.valueOf("DraftsIntlPayableAbroad")), @XmlEnumValue("DraftsLostStolen") DRAFTSLOSTSTOLEN(String.valueOf("DraftsLostStolen")), @XmlEnumValue("CardPersonalisedCard") CARDPERSONALISEDCARD(String.valueOf("CardPersonalisedCard")), @XmlEnumValue("DraftsIntlStoppedCancelled") DRAFTSINTLSTOPPEDCANCELLED(String.valueOf("DraftsIntlStoppedCancelled")), @XmlEnumValue("EmergencyLending") EMERGENCYLENDING(String.valueOf("EmergencyLending")), @XmlEnumValue("FPSInBranch") FPSINBRANCH(String.valueOf("FPSInBranch")), @XmlEnumValue("LegalCourtOrder") LEGALCOURTORDER(String.valueOf("LegalCourtOrder")), @XmlEnumValue("IntlPayFXPaymentIn") INTLPAYFXPAYMENTIN(String.valueOf("IntlPayFXPaymentIn")), @XmlEnumValue("IntlPayForeignPaymentInUKAcc") INTLPAYFOREIGNPAYMENTINUKACC(String.valueOf("IntlPayForeignPaymentInUKAcc")), @XmlEnumValue("IntlPayForeignCharge") INTLPAYFOREIGNCHARGE(String.valueOf("IntlPayForeignCharge")), @XmlEnumValue("IntlPayForeignInternet") INTLPAYFOREIGNINTERNET(String.valueOf("IntlPayForeignInternet")), @XmlEnumValue("IntlPayFXPaymentOut") INTLPAYFXPAYMENTOUT(String.valueOf("IntlPayFXPaymentOut")), @XmlEnumValue("IntlPayFXPaymentOutIR") INTLPAYFXPAYMENTOUTIR(String.valueOf("IntlPayFXPaymentOutIR")), @XmlEnumValue("IntlPayPurchaseNonSterling") INTLPAYPURCHASENONSTERLING(String.valueOf("IntlPayPurchaseNonSterling")), @XmlEnumValue("IntlPayPaymentTracing") INTLPAYPAYMENTTRACING(String.valueOf("IntlPayPaymentTracing")), @XmlEnumValue("IntlPayTransNonSterling") INTLPAYTRANSNONSTERLING(String.valueOf("IntlPayTransNonSterling")), @XmlEnumValue("IntlPayTransRateNonSterling") INTLPAYTRANSRATENONSTERLING(String.valueOf("IntlPayTransRateNonSterling")), @XmlEnumValue("IntlPayWorldpayPayment") INTLPAYWORLDPAYPAYMENT(String.valueOf("IntlPayWorldpayPayment")), @XmlEnumValue("InvPayBankDetailsWrong") INVPAYBANKDETAILSWRONG(String.valueOf("InvPayBankDetailsWrong")), @XmlEnumValue("InvPayForeignBCNR") INVPAYFOREIGNBCNR(String.valueOf("InvPayForeignBCNR")), @XmlEnumValue("InvPayForeignRecall") INVPAYFOREIGNRECALL(String.valueOf("InvPayForeignRecall")), @XmlEnumValue("InvPayStandingOrdUnpaid") INVPAYSTANDINGORDUNPAID(String.valueOf("InvPayStandingOrdUnpaid")), @XmlEnumValue("SafeKeepingEnvelope") SAFEKEEPINGENVELOPE(String.valueOf("SafeKeepingEnvelope")), @XmlEnumValue("SafeKeepingInspection") SAFEKEEPINGINSPECTION(String.valueOf("SafeKeepingInspection")), @XmlEnumValue("SafeKeepingLargeItem") SAFEKEEPINGLARGEITEM(String.valueOf("SafeKeepingLargeItem")), @XmlEnumValue("SafeKeepingParcel") SAFEKEEPINGPARCEL(String.valueOf("SafeKeepingParcel")), @XmlEnumValue("NightSafeNightSafePaidIn") NIGHTSAFENIGHTSAFEPAIDIN(String.valueOf("NightSafeNightSafePaidIn")), @XmlEnumValue("OverdraftReview") OVERDRAFTREVIEW(String.valueOf("OverdraftReview")), @XmlEnumValue("ChqBookTheftLossAllStopped") CHQBOOKTHEFTLOSSALLSTOPPED(String.valueOf("ChqBookTheftLossAllStopped")), @XmlEnumValue("ChqCopy") CHQCOPY(String.valueOf("ChqCopy")), @XmlEnumValue("ChqDraftSterling") CHQDRAFTSTERLING(String.valueOf("ChqDraftSterling")), @XmlEnumValue("ChqOutIssued") CHQOUTISSUED(String.valueOf("ChqOutIssued")), @XmlEnumValue("ChqSpecialChqPresentation") CHQSPECIALCHQPRESENTATION(String.valueOf("ChqSpecialChqPresentation")), @XmlEnumValue("ChqSpecialChqClearance") CHQSPECIALCHQCLEARANCE(String.valueOf("ChqSpecialChqClearance")), @XmlEnumValue("ChqStopped") CHQSTOPPED(String.valueOf("ChqStopped")), @XmlEnumValue("ChqinCashCentre") CHQINCASHCENTRE(String.valueOf("ChqinCashCentre")), @XmlEnumValue("ChqDraftFX") CHQDRAFTFX(String.valueOf("ChqDraftFX")), @XmlEnumValue("ChqForeignCourier") CHQFOREIGNCOURIER(String.valueOf("ChqForeignCourier")), @XmlEnumValue("ChqGiftCheque") CHQGIFTCHEQUE(String.valueOf("ChqGiftCheque")), @XmlEnumValue("ChqForeign") CHQFOREIGN(String.valueOf("ChqForeign")), @XmlEnumValue("ChqChequePhotocopy") CHQCHEQUEPHOTOCOPY(String.valueOf("ChqChequePhotocopy")), @XmlEnumValue("ChqChequeRetrieval") CHQCHEQUERETRIEVAL(String.valueOf("ChqChequeRetrieval")), @XmlEnumValue("ChqSpecialPresentationCount") CHQSPECIALPRESENTATIONCOUNT(String.valueOf("ChqSpecialPresentationCount")), @XmlEnumValue("ChqSpecialPresentationPTT") CHQSPECIALPRESENTATIONPTT(String.valueOf("ChqSpecialPresentationPTT")), @XmlEnumValue("ChqUnpaidCharge") CHQUNPAIDCHARGE(String.valueOf("ChqUnpaidCharge")), @XmlEnumValue("ChqUnpaidTransIn") CHQUNPAIDTRANSIN(String.valueOf("ChqUnpaidTransIn")), @XmlEnumValue("ChqUnpaidTransOut") CHQUNPAIDTRANSOUT(String.valueOf("ChqUnpaidTransOut")), @XmlEnumValue("ChqUnpaidCheque") CHQUNPAIDCHEQUE(String.valueOf("ChqUnpaidCheque")), @XmlEnumValue("ReportCertInterestDuplicate") REPORTCERTINTERESTDUPLICATE(String.valueOf("ReportCertInterestDuplicate")), @XmlEnumValue("ReportCertInterest") REPORTCERTINTEREST(String.valueOf("ReportCertInterest")), @XmlEnumValue("ReportReference") REPORTREFERENCE(String.valueOf("ReportReference")), @XmlEnumValue("ReportReferralItem") REPORTREFERRALITEM(String.valueOf("ReportReferralItem")), @XmlEnumValue("ReportStatementCopyRegular") REPORTSTATEMENTCOPYREGULAR(String.valueOf("ReportStatementCopyRegular")), @XmlEnumValue("ReportStatusEnquiry") REPORTSTATUSENQUIRY(String.valueOf("ReportStatusEnquiry")), @XmlEnumValue("ReportStatementFrequent") REPORTSTATEMENTFREQUENT(String.valueOf("ReportStatementFrequent")), @XmlEnumValue("ReportStatementCopy1") REPORTSTATEMENTCOPY1(String.valueOf("ReportStatementCopy1")), @XmlEnumValue("SEPAIn") SEPAIN(String.valueOf("SEPAIn")), @XmlEnumValue("SEPAEuro") SEPAEURO(String.valueOf("SEPAEuro")), @XmlEnumValue("SEPAOut") SEPAOUT(String.valueOf("SEPAOut")), @XmlEnumValue("TransCreditTransferUKDifferent") TRANSCREDITTRANSFERUKDIFFERENT(String.valueOf("TransCreditTransferUKDifferent")), @XmlEnumValue("TransCredit") TRANSCREDIT(String.valueOf("TransCredit")), @XmlEnumValue("TransCreditTransfer") TRANSCREDITTRANSFER(String.valueOf("TransCreditTransfer")), @XmlEnumValue("TransBuyForeignWithGBP") TRANSBUYFOREIGNWITHGBP(String.valueOf("TransBuyForeignWithGBP")), @XmlEnumValue("TransSWIFTOutUKForeign") TRANSSWIFTOUTUKFOREIGN(String.valueOf("TransSWIFTOutUKForeign")), @XmlEnumValue("TransPOSSaleForeign") TRANSPOSSALEFOREIGN(String.valueOf("TransPOSSaleForeign")), @XmlEnumValue("TransReturnPayment") TRANSRETURNPAYMENT(String.valueOf("TransReturnPayment")), @XmlEnumValue("TransTransferExGroup") TRANSTRANSFEREXGROUP(String.valueOf("TransTransferExGroup")), @XmlEnumValue("TransSWIFTOutNonEEASterling") TRANSSWIFTOUTNONEEASTERLING(String.valueOf("TransSWIFTOutNonEEASterling")), @XmlEnumValue("AutoAutomatedEntries") AUTOAUTOMATEDENTRIES(String.valueOf("AutoAutomatedEntries")), @XmlEnumValue("OnlineReplacementCardReader") ONLINEREPLACEMENTCARDREADER(String.valueOf("OnlineReplacementCardReader")), @XmlEnumValue("OnlineUrgentPayment") ONLINEURGENTPAYMENT(String.valueOf("OnlineUrgentPayment")), @XmlEnumValue("ForeignChqSent") FOREIGNCHQSENT(String.valueOf("ForeignChqSent")), @XmlEnumValue("ForeignFXInwardsCust") FOREIGNFXINWARDSCUST(String.valueOf("ForeignFXInwardsCust")), @XmlEnumValue("ForeignFXOutwards") FOREIGNFXOUTWARDS(String.valueOf("ForeignFXOutwards")), @XmlEnumValue("ForeignPurchase") FOREIGNPURCHASE(String.valueOf("ForeignPurchase")), @XmlEnumValue("ForeignChqDraft") FOREIGNCHQDRAFT(String.valueOf("ForeignChqDraft")), @XmlEnumValue("ServiceCAccountFee") SERVICECACCOUNTFEE(String.valueOf("ServiceCAccountFee")), @XmlEnumValue("ServiceCAccountFeeMonthly") SERVICECACCOUNTFEEMONTHLY(String.valueOf("ServiceCAccountFeeMonthly")), @XmlEnumValue("ServiceCOther") SERVICECOTHER(String.valueOf("ServiceCOther")), @XmlEnumValue("CounterCashOut") COUNTERCASHOUT(String.valueOf("CounterCashOut")), @XmlEnumValue("CounterForeignNoteHandling") COUNTERFOREIGNNOTEHANDLING(String.valueOf("CounterForeignNoteHandling")), @XmlEnumValue("CounterForeignCashOut") COUNTERFOREIGNCASHOUT(String.valueOf("CounterForeignCashOut")), @XmlEnumValue("CounterCashFeeRate") COUNTERCASHFEERATE(String.valueOf("CounterCashFeeRate")), @XmlEnumValue("Other") OTHER(String.valueOf("Other"));


    private String value;

    FeeTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static FeeTypeEnum fromValue(String v) {
        for (FeeTypeEnum b : FeeTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Fee/Charge Type")
 /**
   * Fee/Charge Type
  **/
  private FeeTypeEnum feeType = null;

  @ApiModelProperty(value = "Optional additional notes to supplement the fee/charge details.")
 /**
   * Optional additional notes to supplement the fee/charge details.
  **/
  private List<String> notes = null;

  @ApiModelProperty(value = "")
  @Valid
  private OtherApplicationFrequency otherApplicationFrequency = null;

  @ApiModelProperty(value = "")
  @Valid
  private OtherCalculationFrequency otherCalculationFrequency = null;

  @ApiModelProperty(value = "")
  @Valid
  private OtherFeeCategory otherFeeCategory = null;

  @ApiModelProperty(value = "")
  @Valid
  private OtherFeeRateType otherFeeRateType = null;

  @ApiModelProperty(value = "")
  @Valid
  private OtherFeeType5 otherFeeType = null;
 /**
   * How frequently the fee/charge is applied to the account
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

  public OtherFeesCharges2FeeChargeDetail applicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
    this.applicationFrequency = applicationFrequency;
    return this;
  }

 /**
   * How frequently the fee/charge is calculated
   * @return calculationFrequency
  **/
  @JsonProperty("CalculationFrequency")
  @NotNull
  public String getCalculationFrequency() {
    if (calculationFrequency == null) {
      return null;
    }
    return calculationFrequency.value();
  }

  public void setCalculationFrequency(CalculationFrequencyEnum calculationFrequency) {
    this.calculationFrequency = calculationFrequency;
  }

  public OtherFeesCharges2FeeChargeDetail calculationFrequency(CalculationFrequencyEnum calculationFrequency) {
    this.calculationFrequency = calculationFrequency;
    return this;
  }

 /**
   * Fee Amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)
   * @return feeAmount
  **/
  @JsonProperty("FeeAmount")
 @Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")  public String getFeeAmount() {
    return feeAmount;
  }

  public void setFeeAmount(String feeAmount) {
    this.feeAmount = feeAmount;
  }

  public OtherFeesCharges2FeeChargeDetail feeAmount(String feeAmount) {
    this.feeAmount = feeAmount;
    return this;
  }

 /**
   * Get feeApplicableRange
   * @return feeApplicableRange
  **/
  @JsonProperty("FeeApplicableRange")
  public FeeApplicableRange getFeeApplicableRange() {
    return feeApplicableRange;
  }

  public void setFeeApplicableRange(FeeApplicableRange feeApplicableRange) {
    this.feeApplicableRange = feeApplicableRange;
  }

  public OtherFeesCharges2FeeChargeDetail feeApplicableRange(FeeApplicableRange feeApplicableRange) {
    this.feeApplicableRange = feeApplicableRange;
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

  public OtherFeesCharges2FeeChargeDetail feeCategory(FeeCategoryEnum feeCategory) {
    this.feeCategory = feeCategory;
    return this;
  }

 /**
   * Rate charged for Fee/Charge (where it is charged in terms of a rate rather than an amount)
   * @return feeRate
  **/
  @JsonProperty("FeeRate")
 @Pattern(regexp="^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")  public String getFeeRate() {
    return feeRate;
  }

  public void setFeeRate(String feeRate) {
    this.feeRate = feeRate;
  }

  public OtherFeesCharges2FeeChargeDetail feeRate(String feeRate) {
    this.feeRate = feeRate;
    return this;
  }

 /**
   * Rate type for Fee/Charge (where it is charged in terms of a rate rather than an amount)
   * @return feeRateType
  **/
  @JsonProperty("FeeRateType")
  public String getFeeRateType() {
    if (feeRateType == null) {
      return null;
    }
    return feeRateType.value();
  }

  public void setFeeRateType(FeeRateTypeEnum feeRateType) {
    this.feeRateType = feeRateType;
  }

  public OtherFeesCharges2FeeChargeDetail feeRateType(FeeRateTypeEnum feeRateType) {
    this.feeRateType = feeRateType;
    return this;
  }

 /**
   * Fee/Charge Type
   * @return feeType
  **/
  @JsonProperty("FeeType")
  @NotNull
  public String getFeeType() {
    if (feeType == null) {
      return null;
    }
    return feeType.value();
  }

  public void setFeeType(FeeTypeEnum feeType) {
    this.feeType = feeType;
  }

  public OtherFeesCharges2FeeChargeDetail feeType(FeeTypeEnum feeType) {
    this.feeType = feeType;
    return this;
  }

 /**
   * Optional additional notes to supplement the fee/charge details.
   * @return notes
  **/
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public OtherFeesCharges2FeeChargeDetail notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OtherFeesCharges2FeeChargeDetail addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Get otherApplicationFrequency
   * @return otherApplicationFrequency
  **/
  @JsonProperty("OtherApplicationFrequency")
  public OtherApplicationFrequency getOtherApplicationFrequency() {
    return otherApplicationFrequency;
  }

  public void setOtherApplicationFrequency(OtherApplicationFrequency otherApplicationFrequency) {
    this.otherApplicationFrequency = otherApplicationFrequency;
  }

  public OtherFeesCharges2FeeChargeDetail otherApplicationFrequency(OtherApplicationFrequency otherApplicationFrequency) {
    this.otherApplicationFrequency = otherApplicationFrequency;
    return this;
  }

 /**
   * Get otherCalculationFrequency
   * @return otherCalculationFrequency
  **/
  @JsonProperty("OtherCalculationFrequency")
  public OtherCalculationFrequency getOtherCalculationFrequency() {
    return otherCalculationFrequency;
  }

  public void setOtherCalculationFrequency(OtherCalculationFrequency otherCalculationFrequency) {
    this.otherCalculationFrequency = otherCalculationFrequency;
  }

  public OtherFeesCharges2FeeChargeDetail otherCalculationFrequency(OtherCalculationFrequency otherCalculationFrequency) {
    this.otherCalculationFrequency = otherCalculationFrequency;
    return this;
  }

 /**
   * Get otherFeeCategory
   * @return otherFeeCategory
  **/
  @JsonProperty("OtherFeeCategory")
  public OtherFeeCategory getOtherFeeCategory() {
    return otherFeeCategory;
  }

  public void setOtherFeeCategory(OtherFeeCategory otherFeeCategory) {
    this.otherFeeCategory = otherFeeCategory;
  }

  public OtherFeesCharges2FeeChargeDetail otherFeeCategory(OtherFeeCategory otherFeeCategory) {
    this.otherFeeCategory = otherFeeCategory;
    return this;
  }

 /**
   * Get otherFeeRateType
   * @return otherFeeRateType
  **/
  @JsonProperty("OtherFeeRateType")
  public OtherFeeRateType getOtherFeeRateType() {
    return otherFeeRateType;
  }

  public void setOtherFeeRateType(OtherFeeRateType otherFeeRateType) {
    this.otherFeeRateType = otherFeeRateType;
  }

  public OtherFeesCharges2FeeChargeDetail otherFeeRateType(OtherFeeRateType otherFeeRateType) {
    this.otherFeeRateType = otherFeeRateType;
    return this;
  }

 /**
   * Get otherFeeType
   * @return otherFeeType
  **/
  @JsonProperty("OtherFeeType")
  public OtherFeeType5 getOtherFeeType() {
    return otherFeeType;
  }

  public void setOtherFeeType(OtherFeeType5 otherFeeType) {
    this.otherFeeType = otherFeeType;
  }

  public OtherFeesCharges2FeeChargeDetail otherFeeType(OtherFeeType5 otherFeeType) {
    this.otherFeeType = otherFeeType;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

