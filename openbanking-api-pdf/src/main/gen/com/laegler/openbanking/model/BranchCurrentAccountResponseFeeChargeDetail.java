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
import com.laegler.openbanking.model.OtherFeeType;
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
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class BranchCurrentAccountResponseFeeChargeDetail   {
  /**
   * How frequently the fee/charge is applied to the account
   */
  public enum ApplicationFrequencyEnum {
    ONCLOSING("OnClosing"),
    
    ONOPENING("OnOpening"),
    
    CHARGINGPERIOD("ChargingPeriod"),
    
    DAILY("Daily"),
    
    PERITEM("PerItem"),
    
    MONTHLY("Monthly"),
    
    ONANNIVERSARY("OnAnniversary"),
    
    OTHER("Other"),
    
    PERHUNDREDPOUNDS("PerHundredPounds"),
    
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
    ONCLOSING("OnClosing"),
    
    ONOPENING("OnOpening"),
    
    CHARGINGPERIOD("ChargingPeriod"),
    
    DAILY("Daily"),
    
    PERITEM("PerItem"),
    
    MONTHLY("Monthly"),
    
    ONANNIVERSARY("OnAnniversary"),
    
    OTHER("Other"),
    
    PERHUNDREDPOUNDS("PerHundredPounds"),
    
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
    AUTO("Auto"),
    
    ATM("ATM"),
    
    BANKERSDRAFTS("BankersDrafts"),
    
    CASHCENTRE("CashCentre"),
    
    CARD("Card"),
    
    CHEQUE("Cheque"),
    
    COUNTERSERVICES("CounterServices"),
    
    DIRECTDEBIT("DirectDebit"),
    
    DEEDS("Deeds"),
    
    FOREIGN("Foreign"),
    
    FX("FX"),
    
    INTERNATIONAL("International"),
    
    INVESTIGATION("Investigation"),
    
    LEGAL("Legal"),
    
    LOAN("Loan"),
    
    NIGHTSAFE("NightSafe"),
    
    ONLINE("Online"),
    
    OTHER("Other"),
    
    POSTOFFICE("PostOffice"),
    
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
    GROSS("Gross"),
    
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
    
    ATMDEPOSATMPAIDIN("ATMDeposATMPaidIn"),
    
    REPORTCERTBALANCE("ReportCertBalance"),
    
    ATMABROADCONVISADEBIT("ATMAbroadConVisaDebit"),
    
    ATMCARDNETENVIN("ATMCardnetEnvIn"),
    
    ATMCASHGROUPATMDEBITCARD("ATMCashGroupATMDebitCard"),
    
    ATMCASHNONGROUPATMDEBITCARD("ATMCashNonGroupATMDebitcard"),
    
    ATMCONGROUPATM("ATMConGroupATM"),
    
    ATMABROAD("ATMAbroad"),
    
    ATMFOREIGNCASHDEBCARD("ATMForeignCashDebCard"),
    
    ATMABROADGOLDVISADEBIT("ATMAbroadGoldVisaDebit"),
    
    ATMNONSTERLINGWITHDRAWAL("ATMNonSterlingWithdrawal"),
    
    ATMABROADVISADEBIT("ATMAbroadVisaDebit"),
    
    ATMWITHDRAWCASH("ATMWithdrawCash"),
    
    BACSONLINEANCILLIARY("BACSOnLineAncilliary"),
    
    BACSBATCH("BACSBatch"),
    
    BACSONLINEFILE("BACSOnLineFile"),
    
    BACSITEM("BACSItem"),
    
    BACSBULKBATCH("BACSBulkBatch"),
    
    BACSONLINEOVERLIMIT("BACSOnLineOverlimit"),
    
    BACSONLINEPAYMENT("BACSOnLinePayment"),
    
    BACSONLINESERVICE("BACSOnLineService"),
    
    BACSBULKINTERNET("BACSBulkInternet"),
    
    BACSTELDIRDEBSMARTCARD("BACSTELDirDebSmartCard"),
    
    BACSTELDIRDEBWEBINIT("BACSTELDirDebWebInit"),
    
    BACSTELIRDEBWEBINIT("BACSTELirDebWebInit"),
    
    BACSTELDIRDEBOVERLIMIT("BACSTELDirDebOverlimit"),
    
    BACSTELDIRDEBPAYMENT("BACSTELDirDebPayment"),
    
    BACSTELDIRDEBSERVICE("BACSTELDirDebService"),
    
    BACSTELDIRDEBANCILLIARY("BACSTELDirDebAncilliary"),
    
    BACSTELANCILLIARY("BACSTELAncilliary"),
    
    BACSTELSMARTCARD("BACSTELSmartCard"),
    
    BACSTELFILE("BACSTELFile"),
    
    BACSTELOVERLIMIT("BACSTELOverlimit"),
    
    BACSTELPAYMENT("BACSTELPayment"),
    
    BACSTELSERVICE("BACSTELService"),
    
    CHAPSOUTBRANCH("CHAPSOutBranch"),
    
    CHAPSOUTONLINEDEPOSITACC("CHAPSOutOnlineDepositAcc"),
    
    CHAPSIN("CHAPSIn"),
    
    CHAPSOUTPOST("CHAPSOutPost"),
    
    CHAPSOUT("CHAPSOut"),
    
    CHAPSOUTONLINE("CHAPSOutOnline"),
    
    CHAPSOUTMANUAL("CHAPSOutManual"),
    
    CARDCARDREPLACEMENT("CardCardReplacement"),
    
    DRAFTSBANKERS("DraftsBankers"),
    
    DRAFTSCANCELLATION("DraftsCancellation"),
    
    CARDGUARANTEED("CardGuaranteed"),
    
    DRAFTSINTLPAYABLEABROAD("DraftsIntlPayableAbroad"),
    
    DRAFTSINTLSTOPPEDCANCELLED("DraftsIntlStoppedCancelled"),
    
    EUROCHQXLESS("EuroChqXLess"),
    
    EUROCHQXPLUS("EuroChqXPlus"),
    
    FPSOUT("FPSOut"),
    
    FPSOUTOWN("FPSOutOwn"),
    
    FPSINBRANCH("FPSInBranch"),
    
    LEGALARTICLESREPORT("LegalArticlesReport"),
    
    LEGALSEALING("LegalSealing"),
    
    LEGALBONDANDGUARANTEE("LegalBondAndGuarantee"),
    
    LEGALCOSEARCH("LegalCoSearch"),
    
    LEGALDEPOSITASSIGNMENT("LegalDepositAssignment"),
    
    LEGALGUARANTEEPREP("LegalGuaranteePrep"),
    
    LEGALLIFEPOLICYPREPCO("LegalLifePolicyPrepCo"),
    
    LEGALLIFEPOLICYPREPPERSONAL("LegalLifePolicyPrepPersonal"),
    
    LEGALPRIORITYPARIPASSU("LegalPriorityPariPassu"),
    
    LEGALSUBORDINATIONAGREEMENT("LegalSubordinationAgreement"),
    
    DIRDEBDIRECTDEBITADMIN("DirDebDirectDebitAdmin"),
    
    DIRDEBDIRECTDEBITCANCEL("DirDebDirectDebitCancel"),
    
    INTLPAYBIBFOREIGNLIMIT("IntlPayBIBForeignLimit"),
    
    INTLPAYCREDITTRANSCUST("IntlPayCreditTransCust"),
    
    INTLPAYCREDITTRANSNONCUST("IntlPayCreditTransNonCust"),
    
    INTLPAYEXPRESSMONEYMOVER("IntlPayExpressMoneyMover"),
    
    INTLPAYEEAPAYURGENT("IntlPayEEAPayUrgent"),
    
    INTLPAYIRISHPAYURGENT("IntlPayIrishPayUrgent"),
    
    INTLPAYEEAPAY("IntlPayEEAPay"),
    
    INTLPAYFXPAYMENTIN("IntlPayFXPaymentIn"),
    
    INTLPAYFOREIGNIN1CPLUS("IntlPayForeignIn1CPlus"),
    
    INTLPAYFOREIGNCHARGE("IntlPayForeignCharge"),
    
    INTLPAYFOREIGNINTERNET("IntlPayForeignInternet"),
    
    INTLPAYFOREIGNINSUB1C("IntlPayForeignInSub1C"),
    
    INTLPAYPURCHASENONSTERLING("IntlPayPurchaseNonSterling"),
    
    INTLPAYPAYMENTTRACING("IntlPayPaymentTracing"),
    
    INTLPAYSTANDARDMONEYMOVER("IntlPayStandardMoneyMover"),
    
    INTLPAYMT101TRANSACTION("IntlPayMT101Transaction"),
    
    INTLPAYWORLDPAYPAYMENT("IntlPayWorldpayPayment"),
    
    INVPAYBANKDETAILSWRONG("InvPayBankDetailsWrong"),
    
    INVPAYFOREIGNBCNR("InvPayForeignBCNR"),
    
    INVPAYFOREIGNRECALL("InvPayForeignRecall"),
    
    INVGENERALINQ("InvGeneralInq"),
    
    INVOLDINSTRUCTION("InvOldInstruction"),
    
    INVPAYRETURNDEBITXVLESS("InvPayReturnDebitXVLess"),
    
    INVPAYRETURNDEBITXVPLUS("InvPayReturnDebitXVPlus"),
    
    INVPAYSTOPPAYMENT("InvPayStopPayment"),
    
    INVPAYSTANDINGORDUNPAID("InvPayStandingOrdUnpaid"),
    
    SAFEKEEPACCESS("SafeKeepAccess"),
    
    SAFEKEEPDEEDMEDIUM("SafeKeepDeedMedium"),
    
    SAFEKEEPINGENVELOPE("SafeKeepingEnvelope"),
    
    SAFEKEEPINGINSPECTION("SafeKeepingInspection"),
    
    SAFEKEEPINGLARGEITEM("SafeKeepingLargeItem"),
    
    SAFEKEEPMULTIPLEITEMS("SafeKeepMultipleItems"),
    
    SAFEKEEPINGPARCEL("SafeKeepingParcel"),
    
    SAFEKEEPDEEDSMALL("SafeKeepDeedSmall"),
    
    SAFEKEEPONEITEM("SafeKeepOneItem"),
    
    LOANARRANGEMENT("LoanArrangement"),
    
    NIGHTSAFENIGHTSAFEBANKOPEN("NightSafeNightSafeBankOpen"),
    
    NIGHTSAFECREDITSUB5K("NightSafeCreditSub5K"),
    
    NIGHTSAFENIGHTSAFE("NightSafeNightSafe"),
    
    NIGHTSAFENIGHTSAFEPAIDIN("NightSafeNightSafePaidIn"),
    
    POPOSTOFFICECOUNTERCREDIT("POPostOfficeCounterCredit"),
    
    POPOSTOFFICECASHCREDIT("POPostOfficeCashCredit"),
    
    POPOSTOFFICECASHOUT("POPostOfficeCashOut"),
    
    POPOSTOFFICEWITHDRAWAL("POPostOfficeWithdrawal"),
    
    CHQBOOKTHEFTLOSSALLSTOPPED("ChqBookTheftLossAllStopped"),
    
    CHQISSUEDCURRENCYACC("ChqIssuedCurrencyAcc"),
    
    CHQCOPY("ChqCopy"),
    
    CHQDRAFT("ChqDraft"),
    
    CHQIN("ChqIn"),
    
    CHQSPECIALCHQCLEARANCE("ChqSpecialChqClearance"),
    
    CHQINCASHCENTRE("ChqinCashCentre"),
    
    CHQOUTISSUED("ChqOutIssued"),
    
    CHQSPECIALCHQPRESENTATION("ChqSpecialChqPresentation"),
    
    CHQCOUNTERCHEQUE("ChqCounterCheque"),
    
    CHQCHEQUESWITHSTATEMENT("ChqChequeswithStatement"),
    
    CHQSTOPPED("ChqStopped"),
    
    CHQTRANS("ChqTrans"),
    
    CHQDRAFTFX("ChqDraftFX"),
    
    CHQFOREIGNCOURIER("ChqForeignCourier"),
    
    CHQFOREIGNNEGTENTHOU("ChqForeignNegTenThou"),
    
    CHQFOREIGNNEGHUNDRED("ChqForeignNegHundred"),
    
    CHEQUEFOREIGNBANKDIVI("ChequeForeignBankDivi"),
    
    CHQFOREIGNNEGFIFTYTHOU("ChqForeignNegFiftyThou"),
    
    CHQPENSIONCHEQUE("ChqPensionCheque"),
    
    CHEQUEFOREIGNOTHERDIVI("ChequeForeignOtherDivi"),
    
    CHQFOREIGNNEGFIVETHOU("ChqForeignNegFiveThou"),
    
    CHQFOREIGNNEGMAX("ChqForeignNegMax"),
    
    CHQFOREIGNGBPMMDPLUS("ChqForeignGBPMMDPlus"),
    
    CHQGIFTCHEQUE("ChqGiftCheque"),
    
    CHQCOUNTERLODGEMENT("ChqCounterLodgement"),
    
    CHQCASHDROPLODGEMENT("ChqCashDropLodgement"),
    
    CHQFOREIGN("ChqForeign"),
    
    CHQCHEQUEPHOTOCOPY("ChqChequePhotocopy"),
    
    CHQPOSTOFFICECREDIT("ChqPostOfficeCredit"),
    
    CHQPOSTOFFICECHEQUECOLLECTED("ChqPostOfficeChequeCollected"),
    
    CHQCHEQUERETRIEVAL("ChqChequeRetrieval"),
    
    CHQRECONCILLIATIONPERTRANS("ChqReconcilliationPerTrans"),
    
    CHQSPECIALPRESENTATIONCOUNT("ChqSpecialPresentationCount"),
    
    CHQSPECIALPRESENTATIONPTT("ChqSpecialPresentationPTT"),
    
    CHQDRAFTSTERLING("ChqDraftSterling"),
    
    CHQUNPAIDCHARGE("ChqUnpaidCharge"),
    
    CHQUNPAIDTRANSIN("ChqUnpaidTransIn"),
    
    CHQUNPAIDTRANSOUT("ChqUnpaidTransOut"),
    
    CHQUNPAIDCHEQUE("ChqUnpaidCheque"),
    
    REPORTAUDITLETTER("ReportAuditLetter"),
    
    REPORTFAXADVICEADDITIONAL("ReportFAXAdviceAdditional"),
    
    REPORTTELADVICEADDITIONAL("ReportTelAdviceAdditional"),
    
    REPORTCREDITHISTORY("ReportCreditHistory"),
    
    REPORTCERTINTERESTDUPLICATE("ReportCertInterestDuplicate"),
    
    REPORTCERTINTEREST("ReportCertInterest"),
    
    REPORTCREDITHISTORYADDITIONALINYEAR("ReportCreditHistoryAdditionalInYear"),
    
    REPORTFOREIGNSTATUSENQELEC("ReportForeignStatusEnqElec"),
    
    REPORTFOREIGNSTATUSENQ("ReportForeignStatusEnq"),
    
    REPORTSTATEMENTCHQDAILY("ReportStatementChqDaily"),
    
    REPORTSTATEMENTCHQFORTNIGHTLY("ReportStatementChqFortnightly"),
    
    REPORTSTATEMENTCHQMONTHLY("ReportStatementChqMonthly"),
    
    REPORTSTATEMENTCHQWEEKLY("ReportStatementChqWeekly"),
    
    REPORTSTATEMENTANDDIVICHQ("ReportStatementAndDiviChq"),
    
    REPORTREFERRALITEM("ReportReferralItem"),
    
    REPORTSTATEMENTBYATM("ReportStatementByATM"),
    
    REPORTSTATEMENTBYBRANCH("ReportStatementByBranch"),
    
    REPORTSTATEMENTCOPYREGULAR("ReportStatementCopyRegular"),
    
    REPORTSTATEMENTDAILY("ReportStatementDaily"),
    
    REPORTSTATUSENQUIRY("ReportStatusEnquiry"),
    
    REPORTSTATEMENTFREQUENT("ReportStatementFrequent"),
    
    REPORTSTATEMENTMONTHLY("ReportStatementMonthly"),
    
    REPORTSTATEMENTCOPY1("ReportStatementCopy1"),
    
    REPORTSTATEMENTTOBRANCH("ReportStatementToBranch"),
    
    REPORTSMSTEXTMINISTATEMENTORALERT("ReportSMSTextMiniStatementorAlert"),
    
    REPORTSTATEMENTFORTNIGHTLY("ReportStatementFortnightly"),
    
    REPORTSMSTEXTMINISTATEMENTWOM("ReportSMSTextMiniStatementWoM"),
    
    REPORTSMSTEXTALERTBALANCE("ReportSMSTextAlertBalance"),
    
    REPORTSMSTEXTALERT("ReportSMSTextAlert"),
    
    REPORTTAXCERT("ReportTaxCert"),
    
    REPORTWEEKLYSTATEMENT("ReportWeeklyStatement"),
    
    SEPABRANCH("SEPABranch"),
    
    SEPACREDIT("SEPACredit"),
    
    SEPADIRECTDEBIT("SEPADirectDebit"),
    
    SEPAIN("SEPAIn"),
    
    SEPAEURO("SEPAEuro"),
    
    SEPAOUT("SEPAOut"),
    
    SEPAUNPAID("SEPAUnpaid"),
    
    SEPAWINBITSTRANSACTION("SEPAWinbitsTransaction"),
    
    TRANSBILLPAYMENTBRANCH("TransBillPaymentBranch"),
    
    TRANSBILLCOLLECT("TransBillCollect"),
    
    TRANSTELEPHONEBILLPAYMENT("TransTelephoneBillPayment"),
    
    TRANSBANKPAYMENT("TransBankPayment"),
    
    TRANSBILLPAYMENTTELEPHONE("TransBillPaymentTelephone"),
    
    TRANSCORRESPONDENTBANKFEE("TransCorrespondentBankFee"),
    
    TRANSCREDITTRANSFERUKDIFFERENT("TransCreditTransferUKDifferent"),
    
    TRANSCREDITTRANSFERUKSAME("TransCreditTransferUKSame"),
    
    TRANSCREDIT("TransCredit"),
    
    TRANSCREDITTRANSFER("TransCreditTransfer"),
    
    TRANSBRANCHCREDIT("TransBranchCredit"),
    
    TRANSDEBIT("TransDebit"),
    
    TRANSDEBCARDDEB("TransDebCardDeb"),
    
    TRANSUKDIRDEB("TransUKDirDeb"),
    
    TRANSMANUALDEB("TransManualDeb"),
    
    TITLEDEEDS("TitleDeeds"),
    
    TRANSBUYFOREIGNWITHGBP("TransBuyForeignWithGBP"),
    
    TRANSGOODVALUEREQ("TransGoodValueReq"),
    
    TRANSSWIFTOUTUKFOREIGN("TransSWIFTOutUKForeign"),
    
    TRANSINCONPLETEINSTRUCTION("TransInconpleteInstruction"),
    
    TRANSMANUALENTRIES("TransManualEntries"),
    
    TRANSMANUALTRANS("TransManualTrans"),
    
    TRANSNONSTERLING("TransNonSterling"),
    
    OTHER("Other"),
    
    TRANSPOSSALEFOREIGN("TransPOSSaleForeign"),
    
    TRANSPRIPAYMENTPOST("TransPriPaymentPost"),
    
    TRANSPOSSALEUK("TransPOSSaleUK"),
    
    TRANSRECONCILIATIONPERTRANS("TransReconciliationPerTrans"),
    
    TRANSSTANDINGORDADMIN("TransStandingOrdAdmin"),
    
    TRANSSTANDINGORD("TransStandingOrd"),
    
    TRANSSTANDINGORDMANPAY("TransStandingOrdManPay"),
    
    TRANSTELBUSIPRIPAYMENTFOREIGNTOUKACC("TransTelBusiPriPaymentForeignToUKAcc"),
    
    TRANSTELEITEM("TransTeleItem"),
    
    TRANSTELBUSIPRIPAYMENTTOGRPACC("TransTelBusiPriPaymentToGrpAcc"),
    
    TRANSTRANSFEREXGROUP("TransTransferExGroup"),
    
    TRANSTELBUSIPRIPAYMENTTONONGRPACC("TransTelBusiPriPaymentToNonGrpAcc"),
    
    TRANSSWIFTOUTNONEEASTERLING("TransSWIFTOutNonEEASterling"),
    
    AUTOAUTOCREDIT("AutoAutoCredit"),
    
    AUTOAUTOMATEDENTRIES("AutoAutomatedEntries"),
    
    AUTOAUTOCREDITPHONEINET("AutoAutoCreditPhoneInet"),
    
    AUTOAUTOMATEDTRANS("AutoAutomatedTrans"),
    
    AUTODEBITCARDCOMMERCIAL("AutoDebitCardCommercial"),
    
    AUTOFPSAUTOCREDIT("AutoFPSAutoCredit"),
    
    VISATRAVELLERSCHQORCURRENCY("VisaTravellersChqorCurrency"),
    
    ONLINEINTERNETBILLPAYMENT("OnlineInternetBillPayment"),
    
    ONLINEBUSINESSONLINEEUROPAYMENT("OnlineBusinessOnlineEuroPayment"),
    
    ONLINEBUSINESSONLINEURGENTEUROPAYMENT("OnlineBusinessOnlineUrgentEuroPayment"),
    
    ONLINEBUSINESSONLINEFOREIGNPAYMENT("OnlineBusinessOnlineForeignPayment"),
    
    ONLINEINTERBANKTRANSFER("OnlineInterbankTransfer"),
    
    ONLINEINTERBANKPERTRANSFER("OnlineInterbankPerTransfer"),
    
    ONLINEINTERBRANCHTRANSFER("OnlineInterbranchTransfer"),
    
    ONLINEINTERBRANCHPERTRANSFER("OnlineInterbranchPerTransfer"),
    
    ONLINESUBSCRIPTIONMONTHLY("OnlineSubscriptionMonthly"),
    
    ONLINEBANKINGPAYMENT("OnlineBankingPayment"),
    
    ONLINEREPLACEMENTCARDREADER("OnlineReplacementCardReader"),
    
    ONLINEPAYMENTINGBPTOUK("OnlinePaymentinGBPtoUK"),
    
    ONLINEURGENTPAYMENT("OnlineUrgentPayment"),
    
    ONLINEPAYMENTINUSDTOUS("OnlinePaymentinUSDtoUS"),
    
    ONLINEBULKDIRECTDEBSTERLING("OnlineBulkDirectDebSterling"),
    
    FOREIGNCHQSENT("ForeignChqSent"),
    
    FOREIGNCHQSELF("ForeignChqSelf"),
    
    FOREIGNCHQENCASHMENT("ForeignChqEncashment"),
    
    FOREIGNFXINWARDSCUST("ForeignFXInwardsCust"),
    
    FOREIGNFXTRANSFERSROI("ForeignFXTransfersROI"),
    
    FOREIGNFXFORWARDTRANS("ForeignFXForwardTrans"),
    
    FOREIGNEXMAINTENANCE("ForeignExMaintenance"),
    
    FOREIGNFXINWARDSNONCUST("ForeignFXInwardsNonCust"),
    
    FOREIGNFXOUTWARDS("ForeignFXOutwards"),
    
    FOREIGNPURCHASE("ForeignPurchase"),
    
    FOREIGNSTATUSREP("ForeignStatusRep"),
    
    FOREIGNCHQDRAFT("ForeignChqDraft"),
    
    FOREIGNCHQCLESS("ForeignChqCLess"),
    
    FOREIGNCHQMLESS("ForeignChqMLess"),
    
    FOREIGNCHQOTHER("ForeignChqOther"),
    
    FOREIGNCHQMPLUS("ForeignChqMPlus"),
    
    FOREIGNCHQCCC("ForeignChqCCC"),
    
    SERVICECACCOUNTFEE("ServiceCAccountFee"),
    
    SERVICECACCOUNTFEEMONTHLY("ServiceCAccountFeeMonthly"),
    
    SERVICECACCOUNTFEEQUARTERLY("ServiceCAccountFeeQuarterly"),
    
    SERVICECFIXEDTARIFF("ServiceCFixedTariff"),
    
    SERVICECBUSIDEPACCBREAKAGE("ServiceCBusiDepAccBreakage"),
    
    SERVICECMONITORDAILY("ServiceCMonitorDaily"),
    
    SERVICECMINIMUMMONTHLYFEE("ServiceCMinimumMonthlyFee"),
    
    SERVICECMONITORMONTHLY("ServiceCMonitorMonthly"),
    
    SERVICECMONITORWEEKLY("ServiceCMonitorWeekly"),
    
    SERVICECMT940ACCOUNTFIRST("ServiceCMT940AccountFirst"),
    
    SERVICECMT940ACCOUNTSUBSEQUENT("ServiceCMT940AccountSubsequent"),
    
    SERVICECOTHER("ServiceCOther"),
    
    COUNTERCOINHANDLING("CounterCoinHandling"),
    
    COUNTERCASHIN("CounterCashIn"),
    
    COUNTERCASHINNOTUS("CounterCashInNotUs"),
    
    COUNTERCASHOUT("CounterCashOut"),
    
    COUNTERCASHX("CounterCashX"),
    
    COUNTERFOREIGNNOTEHANDLING("CounterForeignNoteHandling"),
    
    COUNTERCASHFEERATE("CounterCashFeeRate"),
    
    COUNTERFOREIGNCASHOUTTX("CounterForeignCashOutTx"),
    
    COUNTERCOUNTERLODGEMENT("CounterCounterLodgement"),
    
    COUNTERCASHDROPLODGEMENT("CounterCashDropLodgement"),
    
    COUNTERNOTESLODGED("CounterNotesLodged"),
    
    COUNTERNOTESOUT("CounterNotesOut"),
    
    COUNTERCASHINOWN("CounterCashInOwn"),
    
    COUNTERCASHFEEPERCENT("CounterCashFeePercent");

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

  @JsonProperty("IncludedInMonthlyChargeIndicator")
  private Boolean includedInMonthlyChargeIndicator = null;

  @JsonProperty("NegotiableIndicator")
  private Boolean negotiableIndicator = null;

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
  private OtherFeeType otherFeeType = null;

  public BranchCurrentAccountResponseFeeChargeDetail applicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
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

  public BranchCurrentAccountResponseFeeChargeDetail calculationFrequency(CalculationFrequencyEnum calculationFrequency) {
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

  public BranchCurrentAccountResponseFeeChargeDetail feeAmount(String feeAmount) {
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

  public BranchCurrentAccountResponseFeeChargeDetail feeApplicableRange(FeeApplicableRange feeApplicableRange) {
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

  public BranchCurrentAccountResponseFeeChargeDetail feeCategory(FeeCategoryEnum feeCategory) {
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

  public BranchCurrentAccountResponseFeeChargeDetail feeRate(String feeRate) {
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

  public BranchCurrentAccountResponseFeeChargeDetail feeRateType(FeeRateTypeEnum feeRateType) {
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

  public BranchCurrentAccountResponseFeeChargeDetail feeType(FeeTypeEnum feeType) {
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

  public BranchCurrentAccountResponseFeeChargeDetail includedInMonthlyChargeIndicator(Boolean includedInMonthlyChargeIndicator) {
    this.includedInMonthlyChargeIndicator = includedInMonthlyChargeIndicator;
    return this;
  }

  /**
   * Indicates that fee/charge is already included in the monthly charge.
   * @return includedInMonthlyChargeIndicator
  **/
  @ApiModelProperty(value = "Indicates that fee/charge is already included in the monthly charge.")


  public Boolean isIncludedInMonthlyChargeIndicator() {
    return includedInMonthlyChargeIndicator;
  }

  public void setIncludedInMonthlyChargeIndicator(Boolean includedInMonthlyChargeIndicator) {
    this.includedInMonthlyChargeIndicator = includedInMonthlyChargeIndicator;
  }

  public BranchCurrentAccountResponseFeeChargeDetail negotiableIndicator(Boolean negotiableIndicator) {
    this.negotiableIndicator = negotiableIndicator;
    return this;
  }

  /**
   * Fee/charge which is usually negotiable rather than a fixed amount
   * @return negotiableIndicator
  **/
  @ApiModelProperty(value = "Fee/charge which is usually negotiable rather than a fixed amount")


  public Boolean isNegotiableIndicator() {
    return negotiableIndicator;
  }

  public void setNegotiableIndicator(Boolean negotiableIndicator) {
    this.negotiableIndicator = negotiableIndicator;
  }

  public BranchCurrentAccountResponseFeeChargeDetail notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public BranchCurrentAccountResponseFeeChargeDetail addNotesItem(String notesItem) {
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

  public BranchCurrentAccountResponseFeeChargeDetail otherApplicationFrequency(OtherApplicationFrequency otherApplicationFrequency) {
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

  public BranchCurrentAccountResponseFeeChargeDetail otherCalculationFrequency(OtherCalculationFrequency otherCalculationFrequency) {
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

  public BranchCurrentAccountResponseFeeChargeDetail otherFeeCategory(OtherFeeCategory otherFeeCategory) {
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

  public BranchCurrentAccountResponseFeeChargeDetail otherFeeRateType(OtherFeeRateType otherFeeRateType) {
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

  public BranchCurrentAccountResponseFeeChargeDetail otherFeeType(OtherFeeType otherFeeType) {
    this.otherFeeType = otherFeeType;
    return this;
  }

  /**
   * Get otherFeeType
   * @return otherFeeType
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OtherFeeType getOtherFeeType() {
    return otherFeeType;
  }

  public void setOtherFeeType(OtherFeeType otherFeeType) {
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
    BranchCurrentAccountResponseFeeChargeDetail branchCurrentAccountResponseFeeChargeDetail = (BranchCurrentAccountResponseFeeChargeDetail) o;
    return Objects.equals(this.applicationFrequency, branchCurrentAccountResponseFeeChargeDetail.applicationFrequency) &&
        Objects.equals(this.calculationFrequency, branchCurrentAccountResponseFeeChargeDetail.calculationFrequency) &&
        Objects.equals(this.feeAmount, branchCurrentAccountResponseFeeChargeDetail.feeAmount) &&
        Objects.equals(this.feeApplicableRange, branchCurrentAccountResponseFeeChargeDetail.feeApplicableRange) &&
        Objects.equals(this.feeCategory, branchCurrentAccountResponseFeeChargeDetail.feeCategory) &&
        Objects.equals(this.feeRate, branchCurrentAccountResponseFeeChargeDetail.feeRate) &&
        Objects.equals(this.feeRateType, branchCurrentAccountResponseFeeChargeDetail.feeRateType) &&
        Objects.equals(this.feeType, branchCurrentAccountResponseFeeChargeDetail.feeType) &&
        Objects.equals(this.includedInMonthlyChargeIndicator, branchCurrentAccountResponseFeeChargeDetail.includedInMonthlyChargeIndicator) &&
        Objects.equals(this.negotiableIndicator, branchCurrentAccountResponseFeeChargeDetail.negotiableIndicator) &&
        Objects.equals(this.notes, branchCurrentAccountResponseFeeChargeDetail.notes) &&
        Objects.equals(this.otherApplicationFrequency, branchCurrentAccountResponseFeeChargeDetail.otherApplicationFrequency) &&
        Objects.equals(this.otherCalculationFrequency, branchCurrentAccountResponseFeeChargeDetail.otherCalculationFrequency) &&
        Objects.equals(this.otherFeeCategory, branchCurrentAccountResponseFeeChargeDetail.otherFeeCategory) &&
        Objects.equals(this.otherFeeRateType, branchCurrentAccountResponseFeeChargeDetail.otherFeeRateType) &&
        Objects.equals(this.otherFeeType, branchCurrentAccountResponseFeeChargeDetail.otherFeeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationFrequency, calculationFrequency, feeAmount, feeApplicableRange, feeCategory, feeRate, feeRateType, feeType, includedInMonthlyChargeIndicator, negotiableIndicator, notes, otherApplicationFrequency, otherCalculationFrequency, otherFeeCategory, otherFeeRateType, otherFeeType);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

