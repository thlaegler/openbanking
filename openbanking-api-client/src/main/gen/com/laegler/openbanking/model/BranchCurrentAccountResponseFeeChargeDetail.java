package com.laegler.openbanking.model;

import com.laegler.openbanking.model.FeeApplicableRange;
import com.laegler.openbanking.model.OtherApplicationFrequency;
import com.laegler.openbanking.model.OtherCalculationFrequency;
import com.laegler.openbanking.model.OtherFeeCategory;
import com.laegler.openbanking.model.OtherFeeRateType;
import com.laegler.openbanking.model.OtherFeeType;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;

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
public class BranchCurrentAccountResponseFeeChargeDetail  {
  

@XmlType(name="ApplicationFrequencyEnum")
@XmlEnum(String.class)
public enum ApplicationFrequencyEnum {

@XmlEnumValue("OnClosing") ONCLOSING(String.valueOf("OnClosing")), @XmlEnumValue("OnOpening") ONOPENING(String.valueOf("OnOpening")), @XmlEnumValue("ChargingPeriod") CHARGINGPERIOD(String.valueOf("ChargingPeriod")), @XmlEnumValue("Daily") DAILY(String.valueOf("Daily")), @XmlEnumValue("PerItem") PERITEM(String.valueOf("PerItem")), @XmlEnumValue("Monthly") MONTHLY(String.valueOf("Monthly")), @XmlEnumValue("OnAnniversary") ONANNIVERSARY(String.valueOf("OnAnniversary")), @XmlEnumValue("Other") OTHER(String.valueOf("Other")), @XmlEnumValue("PerHundredPounds") PERHUNDREDPOUNDS(String.valueOf("PerHundredPounds")), @XmlEnumValue("PerHour") PERHOUR(String.valueOf("PerHour")), @XmlEnumValue("PerOccurrence") PEROCCURRENCE(String.valueOf("PerOccurrence")), @XmlEnumValue("PerSheet") PERSHEET(String.valueOf("PerSheet")), @XmlEnumValue("PerTransaction") PERTRANSACTION(String.valueOf("PerTransaction")), @XmlEnumValue("PerTransactionAmount") PERTRANSACTIONAMOUNT(String.valueOf("PerTransactionAmount")), @XmlEnumValue("PerTransactionPercentage") PERTRANSACTIONPERCENTAGE(String.valueOf("PerTransactionPercentage")), @XmlEnumValue("Quarterly") QUARTERLY(String.valueOf("Quarterly")), @XmlEnumValue("SixMonthly") SIXMONTHLY(String.valueOf("SixMonthly")), @XmlEnumValue("StatementMonthly") STATEMENTMONTHLY(String.valueOf("StatementMonthly")), @XmlEnumValue("Weekly") WEEKLY(String.valueOf("Weekly")), @XmlEnumValue("Yearly") YEARLY(String.valueOf("Yearly"));


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

@XmlEnumValue("OnClosing") ONCLOSING(String.valueOf("OnClosing")), @XmlEnumValue("OnOpening") ONOPENING(String.valueOf("OnOpening")), @XmlEnumValue("ChargingPeriod") CHARGINGPERIOD(String.valueOf("ChargingPeriod")), @XmlEnumValue("Daily") DAILY(String.valueOf("Daily")), @XmlEnumValue("PerItem") PERITEM(String.valueOf("PerItem")), @XmlEnumValue("Monthly") MONTHLY(String.valueOf("Monthly")), @XmlEnumValue("OnAnniversary") ONANNIVERSARY(String.valueOf("OnAnniversary")), @XmlEnumValue("Other") OTHER(String.valueOf("Other")), @XmlEnumValue("PerHundredPounds") PERHUNDREDPOUNDS(String.valueOf("PerHundredPounds")), @XmlEnumValue("PerHour") PERHOUR(String.valueOf("PerHour")), @XmlEnumValue("PerOccurrence") PEROCCURRENCE(String.valueOf("PerOccurrence")), @XmlEnumValue("PerSheet") PERSHEET(String.valueOf("PerSheet")), @XmlEnumValue("PerTransaction") PERTRANSACTION(String.valueOf("PerTransaction")), @XmlEnumValue("PerTransactionAmount") PERTRANSACTIONAMOUNT(String.valueOf("PerTransactionAmount")), @XmlEnumValue("PerTransactionPercentage") PERTRANSACTIONPERCENTAGE(String.valueOf("PerTransactionPercentage")), @XmlEnumValue("Quarterly") QUARTERLY(String.valueOf("Quarterly")), @XmlEnumValue("SixMonthly") SIXMONTHLY(String.valueOf("SixMonthly")), @XmlEnumValue("StatementMonthly") STATEMENTMONTHLY(String.valueOf("StatementMonthly")), @XmlEnumValue("Weekly") WEEKLY(String.valueOf("Weekly")), @XmlEnumValue("Yearly") YEARLY(String.valueOf("Yearly"));


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
  private FeeApplicableRange feeApplicableRange = null;


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

  @ApiModelProperty(value = "Rate charged for Fee/Charge (where it is charged in terms of a rate rather than an amount)")
 /**
   * Rate charged for Fee/Charge (where it is charged in terms of a rate rather than an amount)
  **/
  private String feeRate = null;


@XmlType(name="FeeRateTypeEnum")
@XmlEnum(String.class)
public enum FeeRateTypeEnum {

@XmlEnumValue("Gross") GROSS(String.valueOf("Gross")), @XmlEnumValue("Other") OTHER(String.valueOf("Other"));


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

@XmlEnumValue("CashCentreCoinHandling") CASHCENTRECOINHANDLING(String.valueOf("CashCentreCoinHandling")), @XmlEnumValue("CashCentreCashX") CASHCENTRECASHX(String.valueOf("CashCentreCashX")), @XmlEnumValue("CashCentreCashFeePercent") CASHCENTRECASHFEEPERCENT(String.valueOf("CashCentreCashFeePercent")), @XmlEnumValue("CashCentreCashFeeRate") CASHCENTRECASHFEERATE(String.valueOf("CashCentreCashFeeRate")), @XmlEnumValue("CashCentreNotesLodged") CASHCENTRENOTESLODGED(String.valueOf("CashCentreNotesLodged")), @XmlEnumValue("CashCentreNotesOut") CASHCENTRENOTESOUT(String.valueOf("CashCentreNotesOut")), @XmlEnumValue("CashCentreCashIn") CASHCENTRECASHIN(String.valueOf("CashCentreCashIn")), @XmlEnumValue("CashCentreCashOut") CASHCENTRECASHOUT(String.valueOf("CashCentreCashOut")), @XmlEnumValue("ATMDeposATMPaidIn") ATMDEPOSATMPAIDIN(String.valueOf("ATMDeposATMPaidIn")), @XmlEnumValue("ReportCertBalance") REPORTCERTBALANCE(String.valueOf("ReportCertBalance")), @XmlEnumValue("ATMAbroadConVisaDebit") ATMABROADCONVISADEBIT(String.valueOf("ATMAbroadConVisaDebit")), @XmlEnumValue("ATMCardnetEnvIn") ATMCARDNETENVIN(String.valueOf("ATMCardnetEnvIn")), @XmlEnumValue("ATMCashGroupATMDebitCard") ATMCASHGROUPATMDEBITCARD(String.valueOf("ATMCashGroupATMDebitCard")), @XmlEnumValue("ATMCashNonGroupATMDebitcard") ATMCASHNONGROUPATMDEBITCARD(String.valueOf("ATMCashNonGroupATMDebitcard")), @XmlEnumValue("ATMConGroupATM") ATMCONGROUPATM(String.valueOf("ATMConGroupATM")), @XmlEnumValue("ATMAbroad") ATMABROAD(String.valueOf("ATMAbroad")), @XmlEnumValue("ATMForeignCashDebCard") ATMFOREIGNCASHDEBCARD(String.valueOf("ATMForeignCashDebCard")), @XmlEnumValue("ATMAbroadGoldVisaDebit") ATMABROADGOLDVISADEBIT(String.valueOf("ATMAbroadGoldVisaDebit")), @XmlEnumValue("ATMNonSterlingWithdrawal") ATMNONSTERLINGWITHDRAWAL(String.valueOf("ATMNonSterlingWithdrawal")), @XmlEnumValue("ATMAbroadVisaDebit") ATMABROADVISADEBIT(String.valueOf("ATMAbroadVisaDebit")), @XmlEnumValue("ATMWithdrawCash") ATMWITHDRAWCASH(String.valueOf("ATMWithdrawCash")), @XmlEnumValue("BACSOnLineAncilliary") BACSONLINEANCILLIARY(String.valueOf("BACSOnLineAncilliary")), @XmlEnumValue("BACSBatch") BACSBATCH(String.valueOf("BACSBatch")), @XmlEnumValue("BACSOnLineFile") BACSONLINEFILE(String.valueOf("BACSOnLineFile")), @XmlEnumValue("BACSItem") BACSITEM(String.valueOf("BACSItem")), @XmlEnumValue("BACSBulkBatch") BACSBULKBATCH(String.valueOf("BACSBulkBatch")), @XmlEnumValue("BACSOnLineOverlimit") BACSONLINEOVERLIMIT(String.valueOf("BACSOnLineOverlimit")), @XmlEnumValue("BACSOnLinePayment") BACSONLINEPAYMENT(String.valueOf("BACSOnLinePayment")), @XmlEnumValue("BACSOnLineService") BACSONLINESERVICE(String.valueOf("BACSOnLineService")), @XmlEnumValue("BACSBulkInternet") BACSBULKINTERNET(String.valueOf("BACSBulkInternet")), @XmlEnumValue("BACSTELDirDebSmartCard") BACSTELDIRDEBSMARTCARD(String.valueOf("BACSTELDirDebSmartCard")), @XmlEnumValue("BACSTELDirDebWebInit") BACSTELDIRDEBWEBINIT(String.valueOf("BACSTELDirDebWebInit")), @XmlEnumValue("BACSTELirDebWebInit") BACSTELIRDEBWEBINIT(String.valueOf("BACSTELirDebWebInit")), @XmlEnumValue("BACSTELDirDebOverlimit") BACSTELDIRDEBOVERLIMIT(String.valueOf("BACSTELDirDebOverlimit")), @XmlEnumValue("BACSTELDirDebPayment") BACSTELDIRDEBPAYMENT(String.valueOf("BACSTELDirDebPayment")), @XmlEnumValue("BACSTELDirDebService") BACSTELDIRDEBSERVICE(String.valueOf("BACSTELDirDebService")), @XmlEnumValue("BACSTELDirDebAncilliary") BACSTELDIRDEBANCILLIARY(String.valueOf("BACSTELDirDebAncilliary")), @XmlEnumValue("BACSTELAncilliary") BACSTELANCILLIARY(String.valueOf("BACSTELAncilliary")), @XmlEnumValue("BACSTELSmartCard") BACSTELSMARTCARD(String.valueOf("BACSTELSmartCard")), @XmlEnumValue("BACSTELFile") BACSTELFILE(String.valueOf("BACSTELFile")), @XmlEnumValue("BACSTELOverlimit") BACSTELOVERLIMIT(String.valueOf("BACSTELOverlimit")), @XmlEnumValue("BACSTELPayment") BACSTELPAYMENT(String.valueOf("BACSTELPayment")), @XmlEnumValue("BACSTELService") BACSTELSERVICE(String.valueOf("BACSTELService")), @XmlEnumValue("CHAPSOutBranch") CHAPSOUTBRANCH(String.valueOf("CHAPSOutBranch")), @XmlEnumValue("CHAPSOutOnlineDepositAcc") CHAPSOUTONLINEDEPOSITACC(String.valueOf("CHAPSOutOnlineDepositAcc")), @XmlEnumValue("CHAPSIn") CHAPSIN(String.valueOf("CHAPSIn")), @XmlEnumValue("CHAPSOutPost") CHAPSOUTPOST(String.valueOf("CHAPSOutPost")), @XmlEnumValue("CHAPSOut") CHAPSOUT(String.valueOf("CHAPSOut")), @XmlEnumValue("CHAPSOutOnline") CHAPSOUTONLINE(String.valueOf("CHAPSOutOnline")), @XmlEnumValue("CHAPSOutManual") CHAPSOUTMANUAL(String.valueOf("CHAPSOutManual")), @XmlEnumValue("CardCardReplacement") CARDCARDREPLACEMENT(String.valueOf("CardCardReplacement")), @XmlEnumValue("DraftsBankers") DRAFTSBANKERS(String.valueOf("DraftsBankers")), @XmlEnumValue("DraftsCancellation") DRAFTSCANCELLATION(String.valueOf("DraftsCancellation")), @XmlEnumValue("CardGuaranteed") CARDGUARANTEED(String.valueOf("CardGuaranteed")), @XmlEnumValue("DraftsIntlPayableAbroad") DRAFTSINTLPAYABLEABROAD(String.valueOf("DraftsIntlPayableAbroad")), @XmlEnumValue("DraftsIntlStoppedCancelled") DRAFTSINTLSTOPPEDCANCELLED(String.valueOf("DraftsIntlStoppedCancelled")), @XmlEnumValue("EuroChqXLess") EUROCHQXLESS(String.valueOf("EuroChqXLess")), @XmlEnumValue("EuroChqXPlus") EUROCHQXPLUS(String.valueOf("EuroChqXPlus")), @XmlEnumValue("FPSOut") FPSOUT(String.valueOf("FPSOut")), @XmlEnumValue("FPSOutOwn") FPSOUTOWN(String.valueOf("FPSOutOwn")), @XmlEnumValue("FPSInBranch") FPSINBRANCH(String.valueOf("FPSInBranch")), @XmlEnumValue("LegalArticlesReport") LEGALARTICLESREPORT(String.valueOf("LegalArticlesReport")), @XmlEnumValue("LegalSealing") LEGALSEALING(String.valueOf("LegalSealing")), @XmlEnumValue("LegalBondAndGuarantee") LEGALBONDANDGUARANTEE(String.valueOf("LegalBondAndGuarantee")), @XmlEnumValue("LegalCoSearch") LEGALCOSEARCH(String.valueOf("LegalCoSearch")), @XmlEnumValue("LegalDepositAssignment") LEGALDEPOSITASSIGNMENT(String.valueOf("LegalDepositAssignment")), @XmlEnumValue("LegalGuaranteePrep") LEGALGUARANTEEPREP(String.valueOf("LegalGuaranteePrep")), @XmlEnumValue("LegalLifePolicyPrepCo") LEGALLIFEPOLICYPREPCO(String.valueOf("LegalLifePolicyPrepCo")), @XmlEnumValue("LegalLifePolicyPrepPersonal") LEGALLIFEPOLICYPREPPERSONAL(String.valueOf("LegalLifePolicyPrepPersonal")), @XmlEnumValue("LegalPriorityPariPassu") LEGALPRIORITYPARIPASSU(String.valueOf("LegalPriorityPariPassu")), @XmlEnumValue("LegalSubordinationAgreement") LEGALSUBORDINATIONAGREEMENT(String.valueOf("LegalSubordinationAgreement")), @XmlEnumValue("DirDebDirectDebitAdmin") DIRDEBDIRECTDEBITADMIN(String.valueOf("DirDebDirectDebitAdmin")), @XmlEnumValue("DirDebDirectDebitCancel") DIRDEBDIRECTDEBITCANCEL(String.valueOf("DirDebDirectDebitCancel")), @XmlEnumValue("IntlPayBIBForeignLimit") INTLPAYBIBFOREIGNLIMIT(String.valueOf("IntlPayBIBForeignLimit")), @XmlEnumValue("IntlPayCreditTransCust") INTLPAYCREDITTRANSCUST(String.valueOf("IntlPayCreditTransCust")), @XmlEnumValue("IntlPayCreditTransNonCust") INTLPAYCREDITTRANSNONCUST(String.valueOf("IntlPayCreditTransNonCust")), @XmlEnumValue("IntlPayExpressMoneyMover") INTLPAYEXPRESSMONEYMOVER(String.valueOf("IntlPayExpressMoneyMover")), @XmlEnumValue("IntlPayEEAPayUrgent") INTLPAYEEAPAYURGENT(String.valueOf("IntlPayEEAPayUrgent")), @XmlEnumValue("IntlPayIrishPayUrgent") INTLPAYIRISHPAYURGENT(String.valueOf("IntlPayIrishPayUrgent")), @XmlEnumValue("IntlPayEEAPay") INTLPAYEEAPAY(String.valueOf("IntlPayEEAPay")), @XmlEnumValue("IntlPayFXPaymentIn") INTLPAYFXPAYMENTIN(String.valueOf("IntlPayFXPaymentIn")), @XmlEnumValue("IntlPayForeignIn1CPlus") INTLPAYFOREIGNIN1CPLUS(String.valueOf("IntlPayForeignIn1CPlus")), @XmlEnumValue("IntlPayForeignCharge") INTLPAYFOREIGNCHARGE(String.valueOf("IntlPayForeignCharge")), @XmlEnumValue("IntlPayForeignInternet") INTLPAYFOREIGNINTERNET(String.valueOf("IntlPayForeignInternet")), @XmlEnumValue("IntlPayForeignInSub1C") INTLPAYFOREIGNINSUB1C(String.valueOf("IntlPayForeignInSub1C")), @XmlEnumValue("IntlPayPurchaseNonSterling") INTLPAYPURCHASENONSTERLING(String.valueOf("IntlPayPurchaseNonSterling")), @XmlEnumValue("IntlPayPaymentTracing") INTLPAYPAYMENTTRACING(String.valueOf("IntlPayPaymentTracing")), @XmlEnumValue("IntlPayStandardMoneyMover") INTLPAYSTANDARDMONEYMOVER(String.valueOf("IntlPayStandardMoneyMover")), @XmlEnumValue("IntlPayMT101Transaction") INTLPAYMT101TRANSACTION(String.valueOf("IntlPayMT101Transaction")), @XmlEnumValue("IntlPayWorldpayPayment") INTLPAYWORLDPAYPAYMENT(String.valueOf("IntlPayWorldpayPayment")), @XmlEnumValue("InvPayBankDetailsWrong") INVPAYBANKDETAILSWRONG(String.valueOf("InvPayBankDetailsWrong")), @XmlEnumValue("InvPayForeignBCNR") INVPAYFOREIGNBCNR(String.valueOf("InvPayForeignBCNR")), @XmlEnumValue("InvPayForeignRecall") INVPAYFOREIGNRECALL(String.valueOf("InvPayForeignRecall")), @XmlEnumValue("InvGeneralInq") INVGENERALINQ(String.valueOf("InvGeneralInq")), @XmlEnumValue("InvOldInstruction") INVOLDINSTRUCTION(String.valueOf("InvOldInstruction")), @XmlEnumValue("InvPayReturnDebitXVLess") INVPAYRETURNDEBITXVLESS(String.valueOf("InvPayReturnDebitXVLess")), @XmlEnumValue("InvPayReturnDebitXVPlus") INVPAYRETURNDEBITXVPLUS(String.valueOf("InvPayReturnDebitXVPlus")), @XmlEnumValue("InvPayStopPayment") INVPAYSTOPPAYMENT(String.valueOf("InvPayStopPayment")), @XmlEnumValue("InvPayStandingOrdUnpaid") INVPAYSTANDINGORDUNPAID(String.valueOf("InvPayStandingOrdUnpaid")), @XmlEnumValue("SafeKeepAccess") SAFEKEEPACCESS(String.valueOf("SafeKeepAccess")), @XmlEnumValue("SafeKeepDeedMedium") SAFEKEEPDEEDMEDIUM(String.valueOf("SafeKeepDeedMedium")), @XmlEnumValue("SafeKeepingEnvelope") SAFEKEEPINGENVELOPE(String.valueOf("SafeKeepingEnvelope")), @XmlEnumValue("SafeKeepingInspection") SAFEKEEPINGINSPECTION(String.valueOf("SafeKeepingInspection")), @XmlEnumValue("SafeKeepingLargeItem") SAFEKEEPINGLARGEITEM(String.valueOf("SafeKeepingLargeItem")), @XmlEnumValue("SafeKeepMultipleItems") SAFEKEEPMULTIPLEITEMS(String.valueOf("SafeKeepMultipleItems")), @XmlEnumValue("SafeKeepingParcel") SAFEKEEPINGPARCEL(String.valueOf("SafeKeepingParcel")), @XmlEnumValue("SafeKeepDeedSmall") SAFEKEEPDEEDSMALL(String.valueOf("SafeKeepDeedSmall")), @XmlEnumValue("SafeKeepOneItem") SAFEKEEPONEITEM(String.valueOf("SafeKeepOneItem")), @XmlEnumValue("LoanArrangement") LOANARRANGEMENT(String.valueOf("LoanArrangement")), @XmlEnumValue("NightSafeNightSafeBankOpen") NIGHTSAFENIGHTSAFEBANKOPEN(String.valueOf("NightSafeNightSafeBankOpen")), @XmlEnumValue("NightSafeCreditSub5K") NIGHTSAFECREDITSUB5K(String.valueOf("NightSafeCreditSub5K")), @XmlEnumValue("NightSafeNightSafe") NIGHTSAFENIGHTSAFE(String.valueOf("NightSafeNightSafe")), @XmlEnumValue("NightSafeNightSafePaidIn") NIGHTSAFENIGHTSAFEPAIDIN(String.valueOf("NightSafeNightSafePaidIn")), @XmlEnumValue("POPostOfficeCounterCredit") POPOSTOFFICECOUNTERCREDIT(String.valueOf("POPostOfficeCounterCredit")), @XmlEnumValue("POPostOfficeCashCredit") POPOSTOFFICECASHCREDIT(String.valueOf("POPostOfficeCashCredit")), @XmlEnumValue("POPostOfficeCashOut") POPOSTOFFICECASHOUT(String.valueOf("POPostOfficeCashOut")), @XmlEnumValue("POPostOfficeWithdrawal") POPOSTOFFICEWITHDRAWAL(String.valueOf("POPostOfficeWithdrawal")), @XmlEnumValue("ChqBookTheftLossAllStopped") CHQBOOKTHEFTLOSSALLSTOPPED(String.valueOf("ChqBookTheftLossAllStopped")), @XmlEnumValue("ChqIssuedCurrencyAcc") CHQISSUEDCURRENCYACC(String.valueOf("ChqIssuedCurrencyAcc")), @XmlEnumValue("ChqCopy") CHQCOPY(String.valueOf("ChqCopy")), @XmlEnumValue("ChqDraft") CHQDRAFT(String.valueOf("ChqDraft")), @XmlEnumValue("ChqIn") CHQIN(String.valueOf("ChqIn")), @XmlEnumValue("ChqSpecialChqClearance") CHQSPECIALCHQCLEARANCE(String.valueOf("ChqSpecialChqClearance")), @XmlEnumValue("ChqinCashCentre") CHQINCASHCENTRE(String.valueOf("ChqinCashCentre")), @XmlEnumValue("ChqOutIssued") CHQOUTISSUED(String.valueOf("ChqOutIssued")), @XmlEnumValue("ChqSpecialChqPresentation") CHQSPECIALCHQPRESENTATION(String.valueOf("ChqSpecialChqPresentation")), @XmlEnumValue("ChqCounterCheque") CHQCOUNTERCHEQUE(String.valueOf("ChqCounterCheque")), @XmlEnumValue("ChqChequeswithStatement") CHQCHEQUESWITHSTATEMENT(String.valueOf("ChqChequeswithStatement")), @XmlEnumValue("ChqStopped") CHQSTOPPED(String.valueOf("ChqStopped")), @XmlEnumValue("ChqTrans") CHQTRANS(String.valueOf("ChqTrans")), @XmlEnumValue("ChqDraftFX") CHQDRAFTFX(String.valueOf("ChqDraftFX")), @XmlEnumValue("ChqForeignCourier") CHQFOREIGNCOURIER(String.valueOf("ChqForeignCourier")), @XmlEnumValue("ChqForeignNegTenThou") CHQFOREIGNNEGTENTHOU(String.valueOf("ChqForeignNegTenThou")), @XmlEnumValue("ChqForeignNegHundred") CHQFOREIGNNEGHUNDRED(String.valueOf("ChqForeignNegHundred")), @XmlEnumValue("ChequeForeignBankDivi") CHEQUEFOREIGNBANKDIVI(String.valueOf("ChequeForeignBankDivi")), @XmlEnumValue("ChqForeignNegFiftyThou") CHQFOREIGNNEGFIFTYTHOU(String.valueOf("ChqForeignNegFiftyThou")), @XmlEnumValue("ChqPensionCheque") CHQPENSIONCHEQUE(String.valueOf("ChqPensionCheque")), @XmlEnumValue("ChequeForeignOtherDivi") CHEQUEFOREIGNOTHERDIVI(String.valueOf("ChequeForeignOtherDivi")), @XmlEnumValue("ChqForeignNegFiveThou") CHQFOREIGNNEGFIVETHOU(String.valueOf("ChqForeignNegFiveThou")), @XmlEnumValue("ChqForeignNegMax") CHQFOREIGNNEGMAX(String.valueOf("ChqForeignNegMax")), @XmlEnumValue("ChqForeignGBPMMDPlus") CHQFOREIGNGBPMMDPLUS(String.valueOf("ChqForeignGBPMMDPlus")), @XmlEnumValue("ChqGiftCheque") CHQGIFTCHEQUE(String.valueOf("ChqGiftCheque")), @XmlEnumValue("ChqCounterLodgement") CHQCOUNTERLODGEMENT(String.valueOf("ChqCounterLodgement")), @XmlEnumValue("ChqCashDropLodgement") CHQCASHDROPLODGEMENT(String.valueOf("ChqCashDropLodgement")), @XmlEnumValue("ChqForeign") CHQFOREIGN(String.valueOf("ChqForeign")), @XmlEnumValue("ChqChequePhotocopy") CHQCHEQUEPHOTOCOPY(String.valueOf("ChqChequePhotocopy")), @XmlEnumValue("ChqPostOfficeCredit") CHQPOSTOFFICECREDIT(String.valueOf("ChqPostOfficeCredit")), @XmlEnumValue("ChqPostOfficeChequeCollected") CHQPOSTOFFICECHEQUECOLLECTED(String.valueOf("ChqPostOfficeChequeCollected")), @XmlEnumValue("ChqChequeRetrieval") CHQCHEQUERETRIEVAL(String.valueOf("ChqChequeRetrieval")), @XmlEnumValue("ChqReconcilliationPerTrans") CHQRECONCILLIATIONPERTRANS(String.valueOf("ChqReconcilliationPerTrans")), @XmlEnumValue("ChqSpecialPresentationCount") CHQSPECIALPRESENTATIONCOUNT(String.valueOf("ChqSpecialPresentationCount")), @XmlEnumValue("ChqSpecialPresentationPTT") CHQSPECIALPRESENTATIONPTT(String.valueOf("ChqSpecialPresentationPTT")), @XmlEnumValue("ChqDraftSterling") CHQDRAFTSTERLING(String.valueOf("ChqDraftSterling")), @XmlEnumValue("ChqUnpaidCharge") CHQUNPAIDCHARGE(String.valueOf("ChqUnpaidCharge")), @XmlEnumValue("ChqUnpaidTransIn") CHQUNPAIDTRANSIN(String.valueOf("ChqUnpaidTransIn")), @XmlEnumValue("ChqUnpaidTransOut") CHQUNPAIDTRANSOUT(String.valueOf("ChqUnpaidTransOut")), @XmlEnumValue("ChqUnpaidCheque") CHQUNPAIDCHEQUE(String.valueOf("ChqUnpaidCheque")), @XmlEnumValue("ReportAuditLetter") REPORTAUDITLETTER(String.valueOf("ReportAuditLetter")), @XmlEnumValue("ReportFAXAdviceAdditional") REPORTFAXADVICEADDITIONAL(String.valueOf("ReportFAXAdviceAdditional")), @XmlEnumValue("ReportTelAdviceAdditional") REPORTTELADVICEADDITIONAL(String.valueOf("ReportTelAdviceAdditional")), @XmlEnumValue("ReportCreditHistory") REPORTCREDITHISTORY(String.valueOf("ReportCreditHistory")), @XmlEnumValue("ReportCertInterestDuplicate") REPORTCERTINTERESTDUPLICATE(String.valueOf("ReportCertInterestDuplicate")), @XmlEnumValue("ReportCertInterest") REPORTCERTINTEREST(String.valueOf("ReportCertInterest")), @XmlEnumValue("ReportCreditHistoryAdditionalInYear") REPORTCREDITHISTORYADDITIONALINYEAR(String.valueOf("ReportCreditHistoryAdditionalInYear")), @XmlEnumValue("ReportForeignStatusEnqElec") REPORTFOREIGNSTATUSENQELEC(String.valueOf("ReportForeignStatusEnqElec")), @XmlEnumValue("ReportForeignStatusEnq") REPORTFOREIGNSTATUSENQ(String.valueOf("ReportForeignStatusEnq")), @XmlEnumValue("ReportStatementChqDaily") REPORTSTATEMENTCHQDAILY(String.valueOf("ReportStatementChqDaily")), @XmlEnumValue("ReportStatementChqFortnightly") REPORTSTATEMENTCHQFORTNIGHTLY(String.valueOf("ReportStatementChqFortnightly")), @XmlEnumValue("ReportStatementChqMonthly") REPORTSTATEMENTCHQMONTHLY(String.valueOf("ReportStatementChqMonthly")), @XmlEnumValue("ReportStatementChqWeekly") REPORTSTATEMENTCHQWEEKLY(String.valueOf("ReportStatementChqWeekly")), @XmlEnumValue("ReportStatementAndDiviChq") REPORTSTATEMENTANDDIVICHQ(String.valueOf("ReportStatementAndDiviChq")), @XmlEnumValue("ReportReferralItem") REPORTREFERRALITEM(String.valueOf("ReportReferralItem")), @XmlEnumValue("ReportStatementByATM") REPORTSTATEMENTBYATM(String.valueOf("ReportStatementByATM")), @XmlEnumValue("ReportStatementByBranch") REPORTSTATEMENTBYBRANCH(String.valueOf("ReportStatementByBranch")), @XmlEnumValue("ReportStatementCopyRegular") REPORTSTATEMENTCOPYREGULAR(String.valueOf("ReportStatementCopyRegular")), @XmlEnumValue("ReportStatementDaily") REPORTSTATEMENTDAILY(String.valueOf("ReportStatementDaily")), @XmlEnumValue("ReportStatusEnquiry") REPORTSTATUSENQUIRY(String.valueOf("ReportStatusEnquiry")), @XmlEnumValue("ReportStatementFrequent") REPORTSTATEMENTFREQUENT(String.valueOf("ReportStatementFrequent")), @XmlEnumValue("ReportStatementMonthly") REPORTSTATEMENTMONTHLY(String.valueOf("ReportStatementMonthly")), @XmlEnumValue("ReportStatementCopy1") REPORTSTATEMENTCOPY1(String.valueOf("ReportStatementCopy1")), @XmlEnumValue("ReportStatementToBranch") REPORTSTATEMENTTOBRANCH(String.valueOf("ReportStatementToBranch")), @XmlEnumValue("ReportSMSTextMiniStatementorAlert") REPORTSMSTEXTMINISTATEMENTORALERT(String.valueOf("ReportSMSTextMiniStatementorAlert")), @XmlEnumValue("ReportStatementFortnightly") REPORTSTATEMENTFORTNIGHTLY(String.valueOf("ReportStatementFortnightly")), @XmlEnumValue("ReportSMSTextMiniStatementWoM") REPORTSMSTEXTMINISTATEMENTWOM(String.valueOf("ReportSMSTextMiniStatementWoM")), @XmlEnumValue("ReportSMSTextAlertBalance") REPORTSMSTEXTALERTBALANCE(String.valueOf("ReportSMSTextAlertBalance")), @XmlEnumValue("ReportSMSTextAlert") REPORTSMSTEXTALERT(String.valueOf("ReportSMSTextAlert")), @XmlEnumValue("ReportTaxCert") REPORTTAXCERT(String.valueOf("ReportTaxCert")), @XmlEnumValue("ReportWeeklyStatement") REPORTWEEKLYSTATEMENT(String.valueOf("ReportWeeklyStatement")), @XmlEnumValue("SEPABranch") SEPABRANCH(String.valueOf("SEPABranch")), @XmlEnumValue("SEPACredit") SEPACREDIT(String.valueOf("SEPACredit")), @XmlEnumValue("SEPADirectDebit") SEPADIRECTDEBIT(String.valueOf("SEPADirectDebit")), @XmlEnumValue("SEPAIn") SEPAIN(String.valueOf("SEPAIn")), @XmlEnumValue("SEPAEuro") SEPAEURO(String.valueOf("SEPAEuro")), @XmlEnumValue("SEPAOut") SEPAOUT(String.valueOf("SEPAOut")), @XmlEnumValue("SEPAUnpaid") SEPAUNPAID(String.valueOf("SEPAUnpaid")), @XmlEnumValue("SEPAWinbitsTransaction") SEPAWINBITSTRANSACTION(String.valueOf("SEPAWinbitsTransaction")), @XmlEnumValue("TransBillPaymentBranch") TRANSBILLPAYMENTBRANCH(String.valueOf("TransBillPaymentBranch")), @XmlEnumValue("TransBillCollect") TRANSBILLCOLLECT(String.valueOf("TransBillCollect")), @XmlEnumValue("TransTelephoneBillPayment") TRANSTELEPHONEBILLPAYMENT(String.valueOf("TransTelephoneBillPayment")), @XmlEnumValue("TransBankPayment") TRANSBANKPAYMENT(String.valueOf("TransBankPayment")), @XmlEnumValue("TransBillPaymentTelephone") TRANSBILLPAYMENTTELEPHONE(String.valueOf("TransBillPaymentTelephone")), @XmlEnumValue("TransCorrespondentBankFee") TRANSCORRESPONDENTBANKFEE(String.valueOf("TransCorrespondentBankFee")), @XmlEnumValue("TransCreditTransferUKDifferent") TRANSCREDITTRANSFERUKDIFFERENT(String.valueOf("TransCreditTransferUKDifferent")), @XmlEnumValue("TransCreditTransferUKSame") TRANSCREDITTRANSFERUKSAME(String.valueOf("TransCreditTransferUKSame")), @XmlEnumValue("TransCredit") TRANSCREDIT(String.valueOf("TransCredit")), @XmlEnumValue("TransCreditTransfer") TRANSCREDITTRANSFER(String.valueOf("TransCreditTransfer")), @XmlEnumValue("TransBranchCredit") TRANSBRANCHCREDIT(String.valueOf("TransBranchCredit")), @XmlEnumValue("TransDebit") TRANSDEBIT(String.valueOf("TransDebit")), @XmlEnumValue("TransDebCardDeb") TRANSDEBCARDDEB(String.valueOf("TransDebCardDeb")), @XmlEnumValue("TransUKDirDeb") TRANSUKDIRDEB(String.valueOf("TransUKDirDeb")), @XmlEnumValue("TransManualDeb") TRANSMANUALDEB(String.valueOf("TransManualDeb")), @XmlEnumValue("TitleDeeds") TITLEDEEDS(String.valueOf("TitleDeeds")), @XmlEnumValue("TransBuyForeignWithGBP") TRANSBUYFOREIGNWITHGBP(String.valueOf("TransBuyForeignWithGBP")), @XmlEnumValue("TransGoodValueReq") TRANSGOODVALUEREQ(String.valueOf("TransGoodValueReq")), @XmlEnumValue("TransSWIFTOutUKForeign") TRANSSWIFTOUTUKFOREIGN(String.valueOf("TransSWIFTOutUKForeign")), @XmlEnumValue("TransInconpleteInstruction") TRANSINCONPLETEINSTRUCTION(String.valueOf("TransInconpleteInstruction")), @XmlEnumValue("TransManualEntries") TRANSMANUALENTRIES(String.valueOf("TransManualEntries")), @XmlEnumValue("TransManualTrans") TRANSMANUALTRANS(String.valueOf("TransManualTrans")), @XmlEnumValue("TransNonSterling") TRANSNONSTERLING(String.valueOf("TransNonSterling")), @XmlEnumValue("Other") OTHER(String.valueOf("Other")), @XmlEnumValue("TransPOSSaleForeign") TRANSPOSSALEFOREIGN(String.valueOf("TransPOSSaleForeign")), @XmlEnumValue("TransPriPaymentPost") TRANSPRIPAYMENTPOST(String.valueOf("TransPriPaymentPost")), @XmlEnumValue("TransPOSSaleUK") TRANSPOSSALEUK(String.valueOf("TransPOSSaleUK")), @XmlEnumValue("TransReconciliationPerTrans") TRANSRECONCILIATIONPERTRANS(String.valueOf("TransReconciliationPerTrans")), @XmlEnumValue("TransStandingOrdAdmin") TRANSSTANDINGORDADMIN(String.valueOf("TransStandingOrdAdmin")), @XmlEnumValue("TransStandingOrd") TRANSSTANDINGORD(String.valueOf("TransStandingOrd")), @XmlEnumValue("TransStandingOrdManPay") TRANSSTANDINGORDMANPAY(String.valueOf("TransStandingOrdManPay")), @XmlEnumValue("TransTelBusiPriPaymentForeignToUKAcc") TRANSTELBUSIPRIPAYMENTFOREIGNTOUKACC(String.valueOf("TransTelBusiPriPaymentForeignToUKAcc")), @XmlEnumValue("TransTeleItem") TRANSTELEITEM(String.valueOf("TransTeleItem")), @XmlEnumValue("TransTelBusiPriPaymentToGrpAcc") TRANSTELBUSIPRIPAYMENTTOGRPACC(String.valueOf("TransTelBusiPriPaymentToGrpAcc")), @XmlEnumValue("TransTransferExGroup") TRANSTRANSFEREXGROUP(String.valueOf("TransTransferExGroup")), @XmlEnumValue("TransTelBusiPriPaymentToNonGrpAcc") TRANSTELBUSIPRIPAYMENTTONONGRPACC(String.valueOf("TransTelBusiPriPaymentToNonGrpAcc")), @XmlEnumValue("TransSWIFTOutNonEEASterling") TRANSSWIFTOUTNONEEASTERLING(String.valueOf("TransSWIFTOutNonEEASterling")), @XmlEnumValue("AutoAutoCredit") AUTOAUTOCREDIT(String.valueOf("AutoAutoCredit")), @XmlEnumValue("AutoAutomatedEntries") AUTOAUTOMATEDENTRIES(String.valueOf("AutoAutomatedEntries")), @XmlEnumValue("AutoAutoCreditPhoneInet") AUTOAUTOCREDITPHONEINET(String.valueOf("AutoAutoCreditPhoneInet")), @XmlEnumValue("AutoAutomatedTrans") AUTOAUTOMATEDTRANS(String.valueOf("AutoAutomatedTrans")), @XmlEnumValue("AutoDebitCardCommercial") AUTODEBITCARDCOMMERCIAL(String.valueOf("AutoDebitCardCommercial")), @XmlEnumValue("AutoFPSAutoCredit") AUTOFPSAUTOCREDIT(String.valueOf("AutoFPSAutoCredit")), @XmlEnumValue("VisaTravellersChqorCurrency") VISATRAVELLERSCHQORCURRENCY(String.valueOf("VisaTravellersChqorCurrency")), @XmlEnumValue("OnlineInternetBillPayment") ONLINEINTERNETBILLPAYMENT(String.valueOf("OnlineInternetBillPayment")), @XmlEnumValue("OnlineBusinessOnlineEuroPayment") ONLINEBUSINESSONLINEEUROPAYMENT(String.valueOf("OnlineBusinessOnlineEuroPayment")), @XmlEnumValue("OnlineBusinessOnlineUrgentEuroPayment") ONLINEBUSINESSONLINEURGENTEUROPAYMENT(String.valueOf("OnlineBusinessOnlineUrgentEuroPayment")), @XmlEnumValue("OnlineBusinessOnlineForeignPayment") ONLINEBUSINESSONLINEFOREIGNPAYMENT(String.valueOf("OnlineBusinessOnlineForeignPayment")), @XmlEnumValue("OnlineInterbankTransfer") ONLINEINTERBANKTRANSFER(String.valueOf("OnlineInterbankTransfer")), @XmlEnumValue("OnlineInterbankPerTransfer") ONLINEINTERBANKPERTRANSFER(String.valueOf("OnlineInterbankPerTransfer")), @XmlEnumValue("OnlineInterbranchTransfer") ONLINEINTERBRANCHTRANSFER(String.valueOf("OnlineInterbranchTransfer")), @XmlEnumValue("OnlineInterbranchPerTransfer") ONLINEINTERBRANCHPERTRANSFER(String.valueOf("OnlineInterbranchPerTransfer")), @XmlEnumValue("OnlineSubscriptionMonthly") ONLINESUBSCRIPTIONMONTHLY(String.valueOf("OnlineSubscriptionMonthly")), @XmlEnumValue("OnlineBankingPayment") ONLINEBANKINGPAYMENT(String.valueOf("OnlineBankingPayment")), @XmlEnumValue("OnlineReplacementCardReader") ONLINEREPLACEMENTCARDREADER(String.valueOf("OnlineReplacementCardReader")), @XmlEnumValue("OnlinePaymentinGBPtoUK") ONLINEPAYMENTINGBPTOUK(String.valueOf("OnlinePaymentinGBPtoUK")), @XmlEnumValue("OnlineUrgentPayment") ONLINEURGENTPAYMENT(String.valueOf("OnlineUrgentPayment")), @XmlEnumValue("OnlinePaymentinUSDtoUS") ONLINEPAYMENTINUSDTOUS(String.valueOf("OnlinePaymentinUSDtoUS")), @XmlEnumValue("OnlineBulkDirectDebSterling") ONLINEBULKDIRECTDEBSTERLING(String.valueOf("OnlineBulkDirectDebSterling")), @XmlEnumValue("ForeignChqSent") FOREIGNCHQSENT(String.valueOf("ForeignChqSent")), @XmlEnumValue("ForeignChqSelf") FOREIGNCHQSELF(String.valueOf("ForeignChqSelf")), @XmlEnumValue("ForeignChqEncashment") FOREIGNCHQENCASHMENT(String.valueOf("ForeignChqEncashment")), @XmlEnumValue("ForeignFXInwardsCust") FOREIGNFXINWARDSCUST(String.valueOf("ForeignFXInwardsCust")), @XmlEnumValue("ForeignFXTransfersROI") FOREIGNFXTRANSFERSROI(String.valueOf("ForeignFXTransfersROI")), @XmlEnumValue("ForeignFXForwardTrans") FOREIGNFXFORWARDTRANS(String.valueOf("ForeignFXForwardTrans")), @XmlEnumValue("ForeignExMaintenance") FOREIGNEXMAINTENANCE(String.valueOf("ForeignExMaintenance")), @XmlEnumValue("ForeignFXInwardsNonCust") FOREIGNFXINWARDSNONCUST(String.valueOf("ForeignFXInwardsNonCust")), @XmlEnumValue("ForeignFXOutwards") FOREIGNFXOUTWARDS(String.valueOf("ForeignFXOutwards")), @XmlEnumValue("ForeignPurchase") FOREIGNPURCHASE(String.valueOf("ForeignPurchase")), @XmlEnumValue("ForeignStatusRep") FOREIGNSTATUSREP(String.valueOf("ForeignStatusRep")), @XmlEnumValue("ForeignChqDraft") FOREIGNCHQDRAFT(String.valueOf("ForeignChqDraft")), @XmlEnumValue("ForeignChqCLess") FOREIGNCHQCLESS(String.valueOf("ForeignChqCLess")), @XmlEnumValue("ForeignChqMLess") FOREIGNCHQMLESS(String.valueOf("ForeignChqMLess")), @XmlEnumValue("ForeignChqOther") FOREIGNCHQOTHER(String.valueOf("ForeignChqOther")), @XmlEnumValue("ForeignChqMPlus") FOREIGNCHQMPLUS(String.valueOf("ForeignChqMPlus")), @XmlEnumValue("ForeignChqCCC") FOREIGNCHQCCC(String.valueOf("ForeignChqCCC")), @XmlEnumValue("ServiceCAccountFee") SERVICECACCOUNTFEE(String.valueOf("ServiceCAccountFee")), @XmlEnumValue("ServiceCAccountFeeMonthly") SERVICECACCOUNTFEEMONTHLY(String.valueOf("ServiceCAccountFeeMonthly")), @XmlEnumValue("ServiceCAccountFeeQuarterly") SERVICECACCOUNTFEEQUARTERLY(String.valueOf("ServiceCAccountFeeQuarterly")), @XmlEnumValue("ServiceCFixedTariff") SERVICECFIXEDTARIFF(String.valueOf("ServiceCFixedTariff")), @XmlEnumValue("ServiceCBusiDepAccBreakage") SERVICECBUSIDEPACCBREAKAGE(String.valueOf("ServiceCBusiDepAccBreakage")), @XmlEnumValue("ServiceCMonitorDaily") SERVICECMONITORDAILY(String.valueOf("ServiceCMonitorDaily")), @XmlEnumValue("ServiceCMinimumMonthlyFee") SERVICECMINIMUMMONTHLYFEE(String.valueOf("ServiceCMinimumMonthlyFee")), @XmlEnumValue("ServiceCMonitorMonthly") SERVICECMONITORMONTHLY(String.valueOf("ServiceCMonitorMonthly")), @XmlEnumValue("ServiceCMonitorWeekly") SERVICECMONITORWEEKLY(String.valueOf("ServiceCMonitorWeekly")), @XmlEnumValue("ServiceCMT940AccountFirst") SERVICECMT940ACCOUNTFIRST(String.valueOf("ServiceCMT940AccountFirst")), @XmlEnumValue("ServiceCMT940AccountSubsequent") SERVICECMT940ACCOUNTSUBSEQUENT(String.valueOf("ServiceCMT940AccountSubsequent")), @XmlEnumValue("ServiceCOther") SERVICECOTHER(String.valueOf("ServiceCOther")), @XmlEnumValue("CounterCoinHandling") COUNTERCOINHANDLING(String.valueOf("CounterCoinHandling")), @XmlEnumValue("CounterCashIn") COUNTERCASHIN(String.valueOf("CounterCashIn")), @XmlEnumValue("CounterCashInNotUs") COUNTERCASHINNOTUS(String.valueOf("CounterCashInNotUs")), @XmlEnumValue("CounterCashOut") COUNTERCASHOUT(String.valueOf("CounterCashOut")), @XmlEnumValue("CounterCashX") COUNTERCASHX(String.valueOf("CounterCashX")), @XmlEnumValue("CounterForeignNoteHandling") COUNTERFOREIGNNOTEHANDLING(String.valueOf("CounterForeignNoteHandling")), @XmlEnumValue("CounterCashFeeRate") COUNTERCASHFEERATE(String.valueOf("CounterCashFeeRate")), @XmlEnumValue("CounterForeignCashOutTx") COUNTERFOREIGNCASHOUTTX(String.valueOf("CounterForeignCashOutTx")), @XmlEnumValue("CounterCounterLodgement") COUNTERCOUNTERLODGEMENT(String.valueOf("CounterCounterLodgement")), @XmlEnumValue("CounterCashDropLodgement") COUNTERCASHDROPLODGEMENT(String.valueOf("CounterCashDropLodgement")), @XmlEnumValue("CounterNotesLodged") COUNTERNOTESLODGED(String.valueOf("CounterNotesLodged")), @XmlEnumValue("CounterNotesOut") COUNTERNOTESOUT(String.valueOf("CounterNotesOut")), @XmlEnumValue("CounterCashInOwn") COUNTERCASHINOWN(String.valueOf("CounterCashInOwn")), @XmlEnumValue("CounterCashFeePercent") COUNTERCASHFEEPERCENT(String.valueOf("CounterCashFeePercent"));


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

  @ApiModelProperty(value = "Indicates that fee/charge is already included in the monthly charge.")
 /**
   * Indicates that fee/charge is already included in the monthly charge.
  **/
  private Boolean includedInMonthlyChargeIndicator = null;

  @ApiModelProperty(value = "Fee/charge which is usually negotiable rather than a fixed amount")
 /**
   * Fee/charge which is usually negotiable rather than a fixed amount
  **/
  private Boolean negotiableIndicator = null;

  @ApiModelProperty(value = "Optional additional notes to supplement the fee/charge details.")
 /**
   * Optional additional notes to supplement the fee/charge details.
  **/
  private List<String> notes = null;

  @ApiModelProperty(value = "")
  private OtherApplicationFrequency otherApplicationFrequency = null;

  @ApiModelProperty(value = "")
  private OtherCalculationFrequency otherCalculationFrequency = null;

  @ApiModelProperty(value = "")
  private OtherFeeCategory otherFeeCategory = null;

  @ApiModelProperty(value = "")
  private OtherFeeRateType otherFeeRateType = null;

  @ApiModelProperty(value = "")
  private OtherFeeType otherFeeType = null;
 /**
   * How frequently the fee/charge is applied to the account
   * @return applicationFrequency
  **/
  @JsonProperty("ApplicationFrequency")
  public String getApplicationFrequency() {
    if (applicationFrequency == null) {
      return null;
    }
    return applicationFrequency.value();
  }

  public void setApplicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
    this.applicationFrequency = applicationFrequency;
  }

  public BranchCurrentAccountResponseFeeChargeDetail applicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
    this.applicationFrequency = applicationFrequency;
    return this;
  }

 /**
   * How frequently the fee/charge is calculated
   * @return calculationFrequency
  **/
  @JsonProperty("CalculationFrequency")
  public String getCalculationFrequency() {
    if (calculationFrequency == null) {
      return null;
    }
    return calculationFrequency.value();
  }

  public void setCalculationFrequency(CalculationFrequencyEnum calculationFrequency) {
    this.calculationFrequency = calculationFrequency;
  }

  public BranchCurrentAccountResponseFeeChargeDetail calculationFrequency(CalculationFrequencyEnum calculationFrequency) {
    this.calculationFrequency = calculationFrequency;
    return this;
  }

 /**
   * Fee Amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)
   * @return feeAmount
  **/
  @JsonProperty("FeeAmount")
  public String getFeeAmount() {
    return feeAmount;
  }

  public void setFeeAmount(String feeAmount) {
    this.feeAmount = feeAmount;
  }

  public BranchCurrentAccountResponseFeeChargeDetail feeAmount(String feeAmount) {
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

  public BranchCurrentAccountResponseFeeChargeDetail feeApplicableRange(FeeApplicableRange feeApplicableRange) {
    this.feeApplicableRange = feeApplicableRange;
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

  public BranchCurrentAccountResponseFeeChargeDetail feeCategory(FeeCategoryEnum feeCategory) {
    this.feeCategory = feeCategory;
    return this;
  }

 /**
   * Rate charged for Fee/Charge (where it is charged in terms of a rate rather than an amount)
   * @return feeRate
  **/
  @JsonProperty("FeeRate")
  public String getFeeRate() {
    return feeRate;
  }

  public void setFeeRate(String feeRate) {
    this.feeRate = feeRate;
  }

  public BranchCurrentAccountResponseFeeChargeDetail feeRate(String feeRate) {
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

  public BranchCurrentAccountResponseFeeChargeDetail feeRateType(FeeRateTypeEnum feeRateType) {
    this.feeRateType = feeRateType;
    return this;
  }

 /**
   * Fee/Charge Type
   * @return feeType
  **/
  @JsonProperty("FeeType")
  public String getFeeType() {
    if (feeType == null) {
      return null;
    }
    return feeType.value();
  }

  public void setFeeType(FeeTypeEnum feeType) {
    this.feeType = feeType;
  }

  public BranchCurrentAccountResponseFeeChargeDetail feeType(FeeTypeEnum feeType) {
    this.feeType = feeType;
    return this;
  }

 /**
   * Indicates that fee/charge is already included in the monthly charge.
   * @return includedInMonthlyChargeIndicator
  **/
  @JsonProperty("IncludedInMonthlyChargeIndicator")
  public Boolean isIncludedInMonthlyChargeIndicator() {
    return includedInMonthlyChargeIndicator;
  }

  public void setIncludedInMonthlyChargeIndicator(Boolean includedInMonthlyChargeIndicator) {
    this.includedInMonthlyChargeIndicator = includedInMonthlyChargeIndicator;
  }

  public BranchCurrentAccountResponseFeeChargeDetail includedInMonthlyChargeIndicator(Boolean includedInMonthlyChargeIndicator) {
    this.includedInMonthlyChargeIndicator = includedInMonthlyChargeIndicator;
    return this;
  }

 /**
   * Fee/charge which is usually negotiable rather than a fixed amount
   * @return negotiableIndicator
  **/
  @JsonProperty("NegotiableIndicator")
  public Boolean isNegotiableIndicator() {
    return negotiableIndicator;
  }

  public void setNegotiableIndicator(Boolean negotiableIndicator) {
    this.negotiableIndicator = negotiableIndicator;
  }

  public BranchCurrentAccountResponseFeeChargeDetail negotiableIndicator(Boolean negotiableIndicator) {
    this.negotiableIndicator = negotiableIndicator;
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

  public BranchCurrentAccountResponseFeeChargeDetail notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public BranchCurrentAccountResponseFeeChargeDetail addNotesItem(String notesItem) {
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

  public BranchCurrentAccountResponseFeeChargeDetail otherApplicationFrequency(OtherApplicationFrequency otherApplicationFrequency) {
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

  public BranchCurrentAccountResponseFeeChargeDetail otherCalculationFrequency(OtherCalculationFrequency otherCalculationFrequency) {
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

  public BranchCurrentAccountResponseFeeChargeDetail otherFeeCategory(OtherFeeCategory otherFeeCategory) {
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

  public BranchCurrentAccountResponseFeeChargeDetail otherFeeRateType(OtherFeeRateType otherFeeRateType) {
    this.otherFeeRateType = otherFeeRateType;
    return this;
  }

 /**
   * Get otherFeeType
   * @return otherFeeType
  **/
  @JsonProperty("OtherFeeType")
  public OtherFeeType getOtherFeeType() {
    return otherFeeType;
  }

  public void setOtherFeeType(OtherFeeType otherFeeType) {
    this.otherFeeType = otherFeeType;
  }

  public BranchCurrentAccountResponseFeeChargeDetail otherFeeType(OtherFeeType otherFeeType) {
    this.otherFeeType = otherFeeType;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BranchCurrentAccountResponseFeeChargeDetail {\n");
    
    sb.append("    applicationFrequency: ").append(toIndentedString(applicationFrequency)).append("\n");
    sb.append("    calculationFrequency: ").append(toIndentedString(calculationFrequency)).append("\n");
    sb.append("    feeAmount: ").append(toIndentedString(feeAmount)).append("\n");
    sb.append("    feeApplicableRange: ").append(toIndentedString(feeApplicableRange)).append("\n");
    sb.append("    feeCategory: ").append(toIndentedString(feeCategory)).append("\n");
    sb.append("    feeRate: ").append(toIndentedString(feeRate)).append("\n");
    sb.append("    feeRateType: ").append(toIndentedString(feeRateType)).append("\n");
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    includedInMonthlyChargeIndicator: ").append(toIndentedString(includedInMonthlyChargeIndicator)).append("\n");
    sb.append("    negotiableIndicator: ").append(toIndentedString(negotiableIndicator)).append("\n");
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

