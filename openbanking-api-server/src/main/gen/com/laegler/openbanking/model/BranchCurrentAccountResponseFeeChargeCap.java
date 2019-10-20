package com.laegler.openbanking.model;

import com.laegler.openbanking.model.BranchCurrentAccountResponseOtherFeeType;
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
  * Details about any caps (maximum charges) that apply to a particular fee/charge
 **/
@ApiModel(description="Details about any caps (maximum charges) that apply to a particular fee/charge")
public class BranchCurrentAccountResponseFeeChargeCap  {
  

@XmlType(name="CappingPeriodEnum")
@XmlEnum(String.class)
public enum CappingPeriodEnum {

@XmlEnumValue("Day") DAY(String.valueOf("Day")), @XmlEnumValue("HalfYear") HALFYEAR(String.valueOf("HalfYear")), @XmlEnumValue("Month") MONTH(String.valueOf("Month")), @XmlEnumValue("Quarter") QUARTER(String.valueOf("Quarter")), @XmlEnumValue("Week") WEEK(String.valueOf("Week")), @XmlEnumValue("AcademicTerm") ACADEMICTERM(String.valueOf("AcademicTerm")), @XmlEnumValue("Year") YEAR(String.valueOf("Year"));


    private String value;

    CappingPeriodEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CappingPeriodEnum fromValue(String v) {
        for (CappingPeriodEnum b : CappingPeriodEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Period e.g. day, week, month etc. for which the fee/charge is capped")
 /**
   * Period e.g. day, week, month etc. for which the fee/charge is capped
  **/
  private CappingPeriodEnum cappingPeriod = null;

  @ApiModelProperty(value = "Cap amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)")
 /**
   * Cap amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)
  **/
  private String feeCapAmount = null;

  @ApiModelProperty(value = "fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount")
 /**
   * fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount
  **/
  private Float feeCapOccurrence = null;


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

  @ApiModelProperty(required = true, value = "Fee/charge type which is being capped")
 /**
   * Fee/charge type which is being capped
  **/
  private List<FeeTypeEnum> feeType = new ArrayList<FeeTypeEnum>();


@XmlType(name="MinMaxTypeEnum")
@XmlEnum(String.class)
public enum MinMaxTypeEnum {

@XmlEnumValue("Minimum") MINIMUM(String.valueOf("Minimum")), @XmlEnumValue("Maximum") MAXIMUM(String.valueOf("Maximum"));


    private String value;

    MinMaxTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static MinMaxTypeEnum fromValue(String v) {
        for (MinMaxTypeEnum b : MinMaxTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Min Max type")
 /**
   * Min Max type
  **/
  private MinMaxTypeEnum minMaxType = null;

  @ApiModelProperty(value = "Free text for adding  extra details for fee charge cap")
 /**
   * Free text for adding  extra details for fee charge cap
  **/
  private List<String> notes = null;

  @ApiModelProperty(value = "Other fee type code which is not available in the standard code set")
  @Valid
 /**
   * Other fee type code which is not available in the standard code set
  **/
  private List<BranchCurrentAccountResponseOtherFeeType> otherFeeType = null;
 /**
   * Period e.g. day, week, month etc. for which the fee/charge is capped
   * @return cappingPeriod
  **/
  @JsonProperty("CappingPeriod")
  public String getCappingPeriod() {
    if (cappingPeriod == null) {
      return null;
    }
    return cappingPeriod.value();
  }

  public void setCappingPeriod(CappingPeriodEnum cappingPeriod) {
    this.cappingPeriod = cappingPeriod;
  }

  public BranchCurrentAccountResponseFeeChargeCap cappingPeriod(CappingPeriodEnum cappingPeriod) {
    this.cappingPeriod = cappingPeriod;
    return this;
  }

 /**
   * Cap amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)
   * @return feeCapAmount
  **/
  @JsonProperty("FeeCapAmount")
 @Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")  public String getFeeCapAmount() {
    return feeCapAmount;
  }

  public void setFeeCapAmount(String feeCapAmount) {
    this.feeCapAmount = feeCapAmount;
  }

  public BranchCurrentAccountResponseFeeChargeCap feeCapAmount(String feeCapAmount) {
    this.feeCapAmount = feeCapAmount;
    return this;
  }

 /**
   * fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount
   * @return feeCapOccurrence
  **/
  @JsonProperty("FeeCapOccurrence")
  public Float getFeeCapOccurrence() {
    return feeCapOccurrence;
  }

  public void setFeeCapOccurrence(Float feeCapOccurrence) {
    this.feeCapOccurrence = feeCapOccurrence;
  }

  public BranchCurrentAccountResponseFeeChargeCap feeCapOccurrence(Float feeCapOccurrence) {
    this.feeCapOccurrence = feeCapOccurrence;
    return this;
  }

 /**
   * Fee/charge type which is being capped
   * @return feeType
  **/
  @JsonProperty("FeeType")
  @NotNull
 @Size(min=1)  public List<FeeTypeEnum> getFeeType() {
    return feeType;
  }

  public void setFeeType(List<FeeTypeEnum> feeType) {
    this.feeType = feeType;
  }

  public BranchCurrentAccountResponseFeeChargeCap feeType(List<FeeTypeEnum> feeType) {
    this.feeType = feeType;
    return this;
  }

  public BranchCurrentAccountResponseFeeChargeCap addFeeTypeItem(FeeTypeEnum feeTypeItem) {
    this.feeType.add(feeTypeItem);
    return this;
  }

 /**
   * Min Max type
   * @return minMaxType
  **/
  @JsonProperty("MinMaxType")
  @NotNull
  public String getMinMaxType() {
    if (minMaxType == null) {
      return null;
    }
    return minMaxType.value();
  }

  public void setMinMaxType(MinMaxTypeEnum minMaxType) {
    this.minMaxType = minMaxType;
  }

  public BranchCurrentAccountResponseFeeChargeCap minMaxType(MinMaxTypeEnum minMaxType) {
    this.minMaxType = minMaxType;
    return this;
  }

 /**
   * Free text for adding  extra details for fee charge cap
   * @return notes
  **/
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public BranchCurrentAccountResponseFeeChargeCap notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public BranchCurrentAccountResponseFeeChargeCap addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Other fee type code which is not available in the standard code set
   * @return otherFeeType
  **/
  @JsonProperty("OtherFeeType")
  public List<BranchCurrentAccountResponseOtherFeeType> getOtherFeeType() {
    return otherFeeType;
  }

  public void setOtherFeeType(List<BranchCurrentAccountResponseOtherFeeType> otherFeeType) {
    this.otherFeeType = otherFeeType;
  }

  public BranchCurrentAccountResponseFeeChargeCap otherFeeType(List<BranchCurrentAccountResponseOtherFeeType> otherFeeType) {
    this.otherFeeType = otherFeeType;
    return this;
  }

  public BranchCurrentAccountResponseFeeChargeCap addOtherFeeTypeItem(BranchCurrentAccountResponseOtherFeeType otherFeeTypeItem) {
    this.otherFeeType.add(otherFeeTypeItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BranchCurrentAccountResponseFeeChargeCap {\n");
    
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

