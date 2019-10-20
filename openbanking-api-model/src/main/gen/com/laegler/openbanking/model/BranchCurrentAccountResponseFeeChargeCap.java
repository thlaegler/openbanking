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

public class BranchCurrentAccountResponseFeeChargeCap   {
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
  @Valid
  private List<FeeTypeEnum> feeType = new ArrayList<>();

  /**
   * Min Max type
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

  public BranchCurrentAccountResponseFeeChargeCap cappingPeriod(CappingPeriodEnum cappingPeriod) {
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

  public BranchCurrentAccountResponseFeeChargeCap feeCapAmount(String feeCapAmount) {
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

  public BranchCurrentAccountResponseFeeChargeCap feeCapOccurrence(Float feeCapOccurrence) {
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

  public BranchCurrentAccountResponseFeeChargeCap feeType(List<FeeTypeEnum> feeType) {
    this.feeType = feeType;
    return this;
  }

  public BranchCurrentAccountResponseFeeChargeCap addFeeTypeItem(FeeTypeEnum feeTypeItem) {
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

  public BranchCurrentAccountResponseFeeChargeCap minMaxType(MinMaxTypeEnum minMaxType) {
    this.minMaxType = minMaxType;
    return this;
  }

  /**
   * Min Max type
   * @return minMaxType
  **/
  @ApiModelProperty(required = true, value = "Min Max type")
  @NotNull


  public MinMaxTypeEnum getMinMaxType() {
    return minMaxType;
  }

  public void setMinMaxType(MinMaxTypeEnum minMaxType) {
    this.minMaxType = minMaxType;
  }

  public BranchCurrentAccountResponseFeeChargeCap notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public BranchCurrentAccountResponseFeeChargeCap addNotesItem(String notesItem) {
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

  public BranchCurrentAccountResponseFeeChargeCap otherFeeType(List<BranchCurrentAccountResponseOtherFeeType> otherFeeType) {
    this.otherFeeType = otherFeeType;
    return this;
  }

  public BranchCurrentAccountResponseFeeChargeCap addOtherFeeTypeItem(BranchCurrentAccountResponseOtherFeeType otherFeeTypeItem) {
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
    BranchCurrentAccountResponseFeeChargeCap branchCurrentAccountResponseFeeChargeCap = (BranchCurrentAccountResponseFeeChargeCap) o;
    return Objects.equals(this.cappingPeriod, branchCurrentAccountResponseFeeChargeCap.cappingPeriod) &&
        Objects.equals(this.feeCapAmount, branchCurrentAccountResponseFeeChargeCap.feeCapAmount) &&
        Objects.equals(this.feeCapOccurrence, branchCurrentAccountResponseFeeChargeCap.feeCapOccurrence) &&
        Objects.equals(this.feeType, branchCurrentAccountResponseFeeChargeCap.feeType) &&
        Objects.equals(this.minMaxType, branchCurrentAccountResponseFeeChargeCap.minMaxType) &&
        Objects.equals(this.notes, branchCurrentAccountResponseFeeChargeCap.notes) &&
        Objects.equals(this.otherFeeType, branchCurrentAccountResponseFeeChargeCap.otherFeeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cappingPeriod, feeCapAmount, feeCapOccurrence, feeType, minMaxType, notes, otherFeeType);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

