
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeeType1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeeType1"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CashCentreCoinHandling"/&gt;
 *     &lt;enumeration value="CashCentreCashX"/&gt;
 *     &lt;enumeration value="CashCentreCashFeePercent"/&gt;
 *     &lt;enumeration value="CashCentreCashFeeRate"/&gt;
 *     &lt;enumeration value="CashCentreNotesLodged"/&gt;
 *     &lt;enumeration value="CashCentreNotesOut"/&gt;
 *     &lt;enumeration value="CashCentreCashIn"/&gt;
 *     &lt;enumeration value="CashCentreCashOut"/&gt;
 *     &lt;enumeration value="ATMDeposATMPaidIn"/&gt;
 *     &lt;enumeration value="ReportCertBalance"/&gt;
 *     &lt;enumeration value="ATMAbroadConVisaDebit"/&gt;
 *     &lt;enumeration value="ATMCardnetEnvIn"/&gt;
 *     &lt;enumeration value="ATMCashGroupATMDebitCard"/&gt;
 *     &lt;enumeration value="ATMCashNonGroupATMDebitcard"/&gt;
 *     &lt;enumeration value="ATMConGroupATM"/&gt;
 *     &lt;enumeration value="ATMAbroad"/&gt;
 *     &lt;enumeration value="ATMForeignCashDebCard"/&gt;
 *     &lt;enumeration value="ATMAbroadGoldVisaDebit"/&gt;
 *     &lt;enumeration value="ATMNonSterlingWithdrawal"/&gt;
 *     &lt;enumeration value="ATMAbroadVisaDebit"/&gt;
 *     &lt;enumeration value="ATMWithdrawCash"/&gt;
 *     &lt;enumeration value="BACSOnLineAncilliary"/&gt;
 *     &lt;enumeration value="BACSBatch"/&gt;
 *     &lt;enumeration value="BACSOnLineFile"/&gt;
 *     &lt;enumeration value="BACSItem"/&gt;
 *     &lt;enumeration value="BACSBulkBatch"/&gt;
 *     &lt;enumeration value="BACSOnLineOverlimit"/&gt;
 *     &lt;enumeration value="BACSOnLinePayment"/&gt;
 *     &lt;enumeration value="BACSOnLineService"/&gt;
 *     &lt;enumeration value="BACSBulkInternet"/&gt;
 *     &lt;enumeration value="BACSTELDirDebSmartCard"/&gt;
 *     &lt;enumeration value="BACSTELDirDebWebInit"/&gt;
 *     &lt;enumeration value="BACSTELirDebWebInit"/&gt;
 *     &lt;enumeration value="BACSTELDirDebOverlimit"/&gt;
 *     &lt;enumeration value="BACSTELDirDebPayment"/&gt;
 *     &lt;enumeration value="BACSTELDirDebService"/&gt;
 *     &lt;enumeration value="BACSTELDirDebAncilliary"/&gt;
 *     &lt;enumeration value="BACSTELAncilliary"/&gt;
 *     &lt;enumeration value="BACSTELSmartCard"/&gt;
 *     &lt;enumeration value="BACSTELFile"/&gt;
 *     &lt;enumeration value="BACSTELOverlimit"/&gt;
 *     &lt;enumeration value="BACSTELPayment"/&gt;
 *     &lt;enumeration value="BACSTELService"/&gt;
 *     &lt;enumeration value="CHAPSOutBranch"/&gt;
 *     &lt;enumeration value="CHAPSOutOnlineDepositAcc"/&gt;
 *     &lt;enumeration value="CHAPSIn"/&gt;
 *     &lt;enumeration value="CHAPSOutPost"/&gt;
 *     &lt;enumeration value="CHAPSOut"/&gt;
 *     &lt;enumeration value="CHAPSOutOnline"/&gt;
 *     &lt;enumeration value="CHAPSOutManual"/&gt;
 *     &lt;enumeration value="CardCardReplacement"/&gt;
 *     &lt;enumeration value="DraftsBankers"/&gt;
 *     &lt;enumeration value="DraftsCancellation"/&gt;
 *     &lt;enumeration value="CardGuaranteed"/&gt;
 *     &lt;enumeration value="DraftsIntlPayableAbroad"/&gt;
 *     &lt;enumeration value="DraftsIntlStoppedCancelled"/&gt;
 *     &lt;enumeration value="EuroChqXLess"/&gt;
 *     &lt;enumeration value="EuroChqXPlus"/&gt;
 *     &lt;enumeration value="FPSOut"/&gt;
 *     &lt;enumeration value="FPSOutOwn"/&gt;
 *     &lt;enumeration value="FPSInBranch"/&gt;
 *     &lt;enumeration value="LegalArticlesReport"/&gt;
 *     &lt;enumeration value="LegalSealing"/&gt;
 *     &lt;enumeration value="LegalBondAndGuarantee"/&gt;
 *     &lt;enumeration value="LegalCoSearch"/&gt;
 *     &lt;enumeration value="LegalDepositAssignment"/&gt;
 *     &lt;enumeration value="LegalGuaranteePrep"/&gt;
 *     &lt;enumeration value="LegalLifePolicyPrepCo"/&gt;
 *     &lt;enumeration value="LegalLifePolicyPrepPersonal"/&gt;
 *     &lt;enumeration value="LegalPriorityPariPassu"/&gt;
 *     &lt;enumeration value="LegalSubordinationAgreement"/&gt;
 *     &lt;enumeration value="DirDebDirectDebitAdmin"/&gt;
 *     &lt;enumeration value="DirDebDirectDebitCancel"/&gt;
 *     &lt;enumeration value="IntlPayBIBForeignLimit"/&gt;
 *     &lt;enumeration value="IntlPayCreditTransCust"/&gt;
 *     &lt;enumeration value="IntlPayCreditTransNonCust"/&gt;
 *     &lt;enumeration value="IntlPayExpressMoneyMover"/&gt;
 *     &lt;enumeration value="IntlPayEEAPayUrgent"/&gt;
 *     &lt;enumeration value="IntlPayIrishPayUrgent"/&gt;
 *     &lt;enumeration value="IntlPayEEAPay"/&gt;
 *     &lt;enumeration value="IntlPayFXPaymentIn"/&gt;
 *     &lt;enumeration value="IntlPayForeignIn1CPlus"/&gt;
 *     &lt;enumeration value="IntlPayForeignCharge"/&gt;
 *     &lt;enumeration value="IntlPayForeignInternet"/&gt;
 *     &lt;enumeration value="IntlPayForeignInSub1C"/&gt;
 *     &lt;enumeration value="IntlPayPurchaseNonSterling"/&gt;
 *     &lt;enumeration value="IntlPayPaymentTracing"/&gt;
 *     &lt;enumeration value="IntlPayStandardMoneyMover"/&gt;
 *     &lt;enumeration value="IntlPayMT101Transaction"/&gt;
 *     &lt;enumeration value="IntlPayWorldpayPayment"/&gt;
 *     &lt;enumeration value="InvPayBankDetailsWrong"/&gt;
 *     &lt;enumeration value="InvPayForeignBCNR"/&gt;
 *     &lt;enumeration value="InvPayForeignRecall"/&gt;
 *     &lt;enumeration value="InvGeneralInq"/&gt;
 *     &lt;enumeration value="InvOldInstruction"/&gt;
 *     &lt;enumeration value="InvPayReturnDebitXVLess"/&gt;
 *     &lt;enumeration value="InvPayReturnDebitXVPlus"/&gt;
 *     &lt;enumeration value="InvPayStopPayment"/&gt;
 *     &lt;enumeration value="InvPayStandingOrdUnpaid"/&gt;
 *     &lt;enumeration value="SafeKeepAccess"/&gt;
 *     &lt;enumeration value="SafeKeepDeedMedium"/&gt;
 *     &lt;enumeration value="SafeKeepingEnvelope"/&gt;
 *     &lt;enumeration value="SafeKeepingInspection"/&gt;
 *     &lt;enumeration value="SafeKeepingLargeItem"/&gt;
 *     &lt;enumeration value="SafeKeepMultipleItems"/&gt;
 *     &lt;enumeration value="SafeKeepingParcel"/&gt;
 *     &lt;enumeration value="SafeKeepDeedSmall"/&gt;
 *     &lt;enumeration value="SafeKeepOneItem"/&gt;
 *     &lt;enumeration value="LoanArrangement"/&gt;
 *     &lt;enumeration value="NightSafeNightSafeBankOpen"/&gt;
 *     &lt;enumeration value="NightSafeCreditSub5K"/&gt;
 *     &lt;enumeration value="NightSafeNightSafe"/&gt;
 *     &lt;enumeration value="NightSafeNightSafePaidIn"/&gt;
 *     &lt;enumeration value="POPostOfficeCounterCredit"/&gt;
 *     &lt;enumeration value="POPostOfficeCashCredit"/&gt;
 *     &lt;enumeration value="POPostOfficeCashOut"/&gt;
 *     &lt;enumeration value="POPostOfficeWithdrawal"/&gt;
 *     &lt;enumeration value="ChqBookTheftLossAllStopped"/&gt;
 *     &lt;enumeration value="ChqIssuedCurrencyAcc"/&gt;
 *     &lt;enumeration value="ChqCopy"/&gt;
 *     &lt;enumeration value="ChqDraft"/&gt;
 *     &lt;enumeration value="ChqIn"/&gt;
 *     &lt;enumeration value="ChqSpecialChqClearance"/&gt;
 *     &lt;enumeration value="ChqinCashCentre"/&gt;
 *     &lt;enumeration value="ChqOutIssued"/&gt;
 *     &lt;enumeration value="ChqSpecialChqPresentation"/&gt;
 *     &lt;enumeration value="ChqCounterCheque"/&gt;
 *     &lt;enumeration value="ChqChequeswithStatement"/&gt;
 *     &lt;enumeration value="ChqStopped"/&gt;
 *     &lt;enumeration value="ChqTrans"/&gt;
 *     &lt;enumeration value="ChqDraftFX"/&gt;
 *     &lt;enumeration value="ChqForeignCourier"/&gt;
 *     &lt;enumeration value="ChqForeignNegTenThou"/&gt;
 *     &lt;enumeration value="ChqForeignNegHundred"/&gt;
 *     &lt;enumeration value="ChequeForeignBankDivi"/&gt;
 *     &lt;enumeration value="ChqForeignNegFiftyThou"/&gt;
 *     &lt;enumeration value="ChqPensionCheque"/&gt;
 *     &lt;enumeration value="ChequeForeignOtherDivi"/&gt;
 *     &lt;enumeration value="ChqForeignNegFiveThou"/&gt;
 *     &lt;enumeration value="ChqForeignNegMax"/&gt;
 *     &lt;enumeration value="ChqForeignGBPMMDPlus"/&gt;
 *     &lt;enumeration value="ChqGiftCheque"/&gt;
 *     &lt;enumeration value="ChqCounterLodgement"/&gt;
 *     &lt;enumeration value="ChqCashDropLodgement"/&gt;
 *     &lt;enumeration value="ChqForeign"/&gt;
 *     &lt;enumeration value="ChqChequePhotocopy"/&gt;
 *     &lt;enumeration value="ChqPostOfficeCredit"/&gt;
 *     &lt;enumeration value="ChqPostOfficeChequeCollected"/&gt;
 *     &lt;enumeration value="ChqChequeRetrieval"/&gt;
 *     &lt;enumeration value="ChqReconcilliationPerTrans"/&gt;
 *     &lt;enumeration value="ChqSpecialPresentationCount"/&gt;
 *     &lt;enumeration value="ChqSpecialPresentationPTT"/&gt;
 *     &lt;enumeration value="ChqDraftSterling"/&gt;
 *     &lt;enumeration value="ChqUnpaidCharge"/&gt;
 *     &lt;enumeration value="ChqUnpaidTransIn"/&gt;
 *     &lt;enumeration value="ChqUnpaidTransOut"/&gt;
 *     &lt;enumeration value="ChqUnpaidCheque"/&gt;
 *     &lt;enumeration value="ReportAuditLetter"/&gt;
 *     &lt;enumeration value="ReportFAXAdviceAdditional"/&gt;
 *     &lt;enumeration value="ReportTelAdviceAdditional"/&gt;
 *     &lt;enumeration value="ReportCreditHistory"/&gt;
 *     &lt;enumeration value="ReportCertInterestDuplicate"/&gt;
 *     &lt;enumeration value="ReportCertInterest"/&gt;
 *     &lt;enumeration value="ReportCreditHistoryAdditionalInYear"/&gt;
 *     &lt;enumeration value="ReportForeignStatusEnqElec"/&gt;
 *     &lt;enumeration value="ReportForeignStatusEnq"/&gt;
 *     &lt;enumeration value="ReportStatementChqDaily"/&gt;
 *     &lt;enumeration value="ReportStatementChqFortnightly"/&gt;
 *     &lt;enumeration value="ReportStatementChqMonthly"/&gt;
 *     &lt;enumeration value="ReportStatementChqWeekly"/&gt;
 *     &lt;enumeration value="ReportStatementAndDiviChq"/&gt;
 *     &lt;enumeration value="ReportReferralItem"/&gt;
 *     &lt;enumeration value="ReportStatementByATM"/&gt;
 *     &lt;enumeration value="ReportStatementByBranch"/&gt;
 *     &lt;enumeration value="ReportStatementCopyRegular"/&gt;
 *     &lt;enumeration value="ReportStatementDaily"/&gt;
 *     &lt;enumeration value="ReportStatusEnquiry"/&gt;
 *     &lt;enumeration value="ReportStatementFrequent"/&gt;
 *     &lt;enumeration value="ReportStatementMonthly"/&gt;
 *     &lt;enumeration value="ReportStatementCopy1"/&gt;
 *     &lt;enumeration value="ReportStatementToBranch"/&gt;
 *     &lt;enumeration value="ReportSMSTextMiniStatementorAlert"/&gt;
 *     &lt;enumeration value="ReportStatementFortnightly"/&gt;
 *     &lt;enumeration value="ReportSMSTextMiniStatementWoM"/&gt;
 *     &lt;enumeration value="ReportSMSTextAlertBalance"/&gt;
 *     &lt;enumeration value="ReportSMSTextAlert"/&gt;
 *     &lt;enumeration value="ReportTaxCert"/&gt;
 *     &lt;enumeration value="ReportWeeklyStatement"/&gt;
 *     &lt;enumeration value="SEPABranch"/&gt;
 *     &lt;enumeration value="SEPACredit"/&gt;
 *     &lt;enumeration value="SEPADirectDebit"/&gt;
 *     &lt;enumeration value="SEPAIn"/&gt;
 *     &lt;enumeration value="SEPAEuro"/&gt;
 *     &lt;enumeration value="SEPAOut"/&gt;
 *     &lt;enumeration value="SEPAUnpaid"/&gt;
 *     &lt;enumeration value="SEPAWinbitsTransaction"/&gt;
 *     &lt;enumeration value="TransBillPaymentBranch"/&gt;
 *     &lt;enumeration value="TransBillCollect"/&gt;
 *     &lt;enumeration value="TransTelephoneBillPayment"/&gt;
 *     &lt;enumeration value="TransBankPayment"/&gt;
 *     &lt;enumeration value="TransBillPaymentTelephone"/&gt;
 *     &lt;enumeration value="TransCorrespondentBankFee"/&gt;
 *     &lt;enumeration value="TransCreditTransferUKDifferent"/&gt;
 *     &lt;enumeration value="TransCreditTransferUKSame"/&gt;
 *     &lt;enumeration value="TransCredit"/&gt;
 *     &lt;enumeration value="TransCreditTransfer"/&gt;
 *     &lt;enumeration value="TransBranchCredit"/&gt;
 *     &lt;enumeration value="TransDebit"/&gt;
 *     &lt;enumeration value="TransDebCardDeb"/&gt;
 *     &lt;enumeration value="TransUKDirDeb"/&gt;
 *     &lt;enumeration value="TransManualDeb"/&gt;
 *     &lt;enumeration value="TitleDeeds"/&gt;
 *     &lt;enumeration value="TransBuyForeignWithGBP"/&gt;
 *     &lt;enumeration value="TransGoodValueReq"/&gt;
 *     &lt;enumeration value="TransSWIFTOutUKForeign"/&gt;
 *     &lt;enumeration value="TransInconpleteInstruction"/&gt;
 *     &lt;enumeration value="TransManualEntries"/&gt;
 *     &lt;enumeration value="TransManualTrans"/&gt;
 *     &lt;enumeration value="TransNonSterling"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="TransPOSSaleForeign"/&gt;
 *     &lt;enumeration value="TransPriPaymentPost"/&gt;
 *     &lt;enumeration value="TransPOSSaleUK"/&gt;
 *     &lt;enumeration value="TransReconciliationPerTrans"/&gt;
 *     &lt;enumeration value="TransStandingOrdAdmin"/&gt;
 *     &lt;enumeration value="TransStandingOrd"/&gt;
 *     &lt;enumeration value="TransStandingOrdManPay"/&gt;
 *     &lt;enumeration value="TransTelBusiPriPaymentForeignToUKAcc"/&gt;
 *     &lt;enumeration value="TransTeleItem"/&gt;
 *     &lt;enumeration value="TransTelBusiPriPaymentToGrpAcc"/&gt;
 *     &lt;enumeration value="TransTransferExGroup"/&gt;
 *     &lt;enumeration value="TransTelBusiPriPaymentToNonGrpAcc"/&gt;
 *     &lt;enumeration value="TransSWIFTOutNonEEASterling"/&gt;
 *     &lt;enumeration value="AutoAutoCredit"/&gt;
 *     &lt;enumeration value="AutoAutomatedEntries"/&gt;
 *     &lt;enumeration value="AutoAutoCreditPhoneInet"/&gt;
 *     &lt;enumeration value="AutoAutomatedTrans"/&gt;
 *     &lt;enumeration value="AutoDebitCardCommercial"/&gt;
 *     &lt;enumeration value="AutoFPSAutoCredit"/&gt;
 *     &lt;enumeration value="VisaTravellersChqorCurrency"/&gt;
 *     &lt;enumeration value="OnlineInternetBillPayment"/&gt;
 *     &lt;enumeration value="OnlineBusinessOnlineEuroPayment"/&gt;
 *     &lt;enumeration value="OnlineBusinessOnlineUrgentEuroPayment"/&gt;
 *     &lt;enumeration value="OnlineBusinessOnlineForeignPayment"/&gt;
 *     &lt;enumeration value="OnlineInterbankTransfer"/&gt;
 *     &lt;enumeration value="OnlineInterbankPerTransfer"/&gt;
 *     &lt;enumeration value="OnlineInterbranchTransfer"/&gt;
 *     &lt;enumeration value="OnlineInterbranchPerTransfer"/&gt;
 *     &lt;enumeration value="OnlineSubscriptionMonthly"/&gt;
 *     &lt;enumeration value="OnlineBankingPayment"/&gt;
 *     &lt;enumeration value="OnlineReplacementCardReader"/&gt;
 *     &lt;enumeration value="OnlinePaymentinGBPtoUK"/&gt;
 *     &lt;enumeration value="OnlineUrgentPayment"/&gt;
 *     &lt;enumeration value="OnlinePaymentinUSDtoUS"/&gt;
 *     &lt;enumeration value="OnlineBulkDirectDebSterling"/&gt;
 *     &lt;enumeration value="ForeignChqSent"/&gt;
 *     &lt;enumeration value="ForeignChqSelf"/&gt;
 *     &lt;enumeration value="ForeignChqEncashment"/&gt;
 *     &lt;enumeration value="ForeignFXInwardsCust"/&gt;
 *     &lt;enumeration value="ForeignFXTransfersROI"/&gt;
 *     &lt;enumeration value="ForeignFXForwardTrans"/&gt;
 *     &lt;enumeration value="ForeignExMaintenance"/&gt;
 *     &lt;enumeration value="ForeignFXInwardsNonCust"/&gt;
 *     &lt;enumeration value="ForeignFXOutwards"/&gt;
 *     &lt;enumeration value="ForeignPurchase"/&gt;
 *     &lt;enumeration value="ForeignStatusRep"/&gt;
 *     &lt;enumeration value="ForeignChqDraft"/&gt;
 *     &lt;enumeration value="ForeignChqCLess"/&gt;
 *     &lt;enumeration value="ForeignChqMLess"/&gt;
 *     &lt;enumeration value="ForeignChqOther"/&gt;
 *     &lt;enumeration value="ForeignChqMPlus"/&gt;
 *     &lt;enumeration value="ForeignChqCCC"/&gt;
 *     &lt;enumeration value="ServiceCAccountFee"/&gt;
 *     &lt;enumeration value="ServiceCAccountFeeMonthly"/&gt;
 *     &lt;enumeration value="ServiceCAccountFeeQuarterly"/&gt;
 *     &lt;enumeration value="ServiceCFixedTariff"/&gt;
 *     &lt;enumeration value="ServiceCBusiDepAccBreakage"/&gt;
 *     &lt;enumeration value="ServiceCMonitorDaily"/&gt;
 *     &lt;enumeration value="ServiceCMinimumMonthlyFee"/&gt;
 *     &lt;enumeration value="ServiceCMonitorMonthly"/&gt;
 *     &lt;enumeration value="ServiceCMonitorWeekly"/&gt;
 *     &lt;enumeration value="ServiceCMT940AccountFirst"/&gt;
 *     &lt;enumeration value="ServiceCMT940AccountSubsequent"/&gt;
 *     &lt;enumeration value="ServiceCOther"/&gt;
 *     &lt;enumeration value="CounterCoinHandling"/&gt;
 *     &lt;enumeration value="CounterCashIn"/&gt;
 *     &lt;enumeration value="CounterCashInNotUs"/&gt;
 *     &lt;enumeration value="CounterCashOut"/&gt;
 *     &lt;enumeration value="CounterCashX"/&gt;
 *     &lt;enumeration value="CounterForeignNoteHandling"/&gt;
 *     &lt;enumeration value="CounterCashFeeRate"/&gt;
 *     &lt;enumeration value="CounterForeignCashOutTx"/&gt;
 *     &lt;enumeration value="CounterCounterLodgement"/&gt;
 *     &lt;enumeration value="CounterCashDropLodgement"/&gt;
 *     &lt;enumeration value="CounterNotesLodged"/&gt;
 *     &lt;enumeration value="CounterNotesOut"/&gt;
 *     &lt;enumeration value="CounterCashInOwn"/&gt;
 *     &lt;enumeration value="CounterCashFeePercent"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FeeType1")
@XmlEnum
public enum FeeType1 {

    @XmlEnumValue("CashCentreCoinHandling")
    CASH_CENTRE_COIN_HANDLING("CashCentreCoinHandling"),
    @XmlEnumValue("CashCentreCashX")
    CASH_CENTRE_CASH_X("CashCentreCashX"),
    @XmlEnumValue("CashCentreCashFeePercent")
    CASH_CENTRE_CASH_FEE_PERCENT("CashCentreCashFeePercent"),
    @XmlEnumValue("CashCentreCashFeeRate")
    CASH_CENTRE_CASH_FEE_RATE("CashCentreCashFeeRate"),
    @XmlEnumValue("CashCentreNotesLodged")
    CASH_CENTRE_NOTES_LODGED("CashCentreNotesLodged"),
    @XmlEnumValue("CashCentreNotesOut")
    CASH_CENTRE_NOTES_OUT("CashCentreNotesOut"),
    @XmlEnumValue("CashCentreCashIn")
    CASH_CENTRE_CASH_IN("CashCentreCashIn"),
    @XmlEnumValue("CashCentreCashOut")
    CASH_CENTRE_CASH_OUT("CashCentreCashOut"),
    @XmlEnumValue("ATMDeposATMPaidIn")
    ATM_DEPOS_ATM_PAID_IN("ATMDeposATMPaidIn"),
    @XmlEnumValue("ReportCertBalance")
    REPORT_CERT_BALANCE("ReportCertBalance"),
    @XmlEnumValue("ATMAbroadConVisaDebit")
    ATM_ABROAD_CON_VISA_DEBIT("ATMAbroadConVisaDebit"),
    @XmlEnumValue("ATMCardnetEnvIn")
    ATM_CARDNET_ENV_IN("ATMCardnetEnvIn"),
    @XmlEnumValue("ATMCashGroupATMDebitCard")
    ATM_CASH_GROUP_ATM_DEBIT_CARD("ATMCashGroupATMDebitCard"),
    @XmlEnumValue("ATMCashNonGroupATMDebitcard")
    ATM_CASH_NON_GROUP_ATM_DEBITCARD("ATMCashNonGroupATMDebitcard"),
    @XmlEnumValue("ATMConGroupATM")
    ATM_CON_GROUP_ATM("ATMConGroupATM"),
    @XmlEnumValue("ATMAbroad")
    ATM_ABROAD("ATMAbroad"),
    @XmlEnumValue("ATMForeignCashDebCard")
    ATM_FOREIGN_CASH_DEB_CARD("ATMForeignCashDebCard"),
    @XmlEnumValue("ATMAbroadGoldVisaDebit")
    ATM_ABROAD_GOLD_VISA_DEBIT("ATMAbroadGoldVisaDebit"),
    @XmlEnumValue("ATMNonSterlingWithdrawal")
    ATM_NON_STERLING_WITHDRAWAL("ATMNonSterlingWithdrawal"),
    @XmlEnumValue("ATMAbroadVisaDebit")
    ATM_ABROAD_VISA_DEBIT("ATMAbroadVisaDebit"),
    @XmlEnumValue("ATMWithdrawCash")
    ATM_WITHDRAW_CASH("ATMWithdrawCash"),
    @XmlEnumValue("BACSOnLineAncilliary")
    BACS_ON_LINE_ANCILLIARY("BACSOnLineAncilliary"),
    @XmlEnumValue("BACSBatch")
    BACS_BATCH("BACSBatch"),
    @XmlEnumValue("BACSOnLineFile")
    BACS_ON_LINE_FILE("BACSOnLineFile"),
    @XmlEnumValue("BACSItem")
    BACS_ITEM("BACSItem"),
    @XmlEnumValue("BACSBulkBatch")
    BACS_BULK_BATCH("BACSBulkBatch"),
    @XmlEnumValue("BACSOnLineOverlimit")
    BACS_ON_LINE_OVERLIMIT("BACSOnLineOverlimit"),
    @XmlEnumValue("BACSOnLinePayment")
    BACS_ON_LINE_PAYMENT("BACSOnLinePayment"),
    @XmlEnumValue("BACSOnLineService")
    BACS_ON_LINE_SERVICE("BACSOnLineService"),
    @XmlEnumValue("BACSBulkInternet")
    BACS_BULK_INTERNET("BACSBulkInternet"),
    @XmlEnumValue("BACSTELDirDebSmartCard")
    BACSTEL_DIR_DEB_SMART_CARD("BACSTELDirDebSmartCard"),
    @XmlEnumValue("BACSTELDirDebWebInit")
    BACSTEL_DIR_DEB_WEB_INIT("BACSTELDirDebWebInit"),
    @XmlEnumValue("BACSTELirDebWebInit")
    BACSTE_LIR_DEB_WEB_INIT("BACSTELirDebWebInit"),
    @XmlEnumValue("BACSTELDirDebOverlimit")
    BACSTEL_DIR_DEB_OVERLIMIT("BACSTELDirDebOverlimit"),
    @XmlEnumValue("BACSTELDirDebPayment")
    BACSTEL_DIR_DEB_PAYMENT("BACSTELDirDebPayment"),
    @XmlEnumValue("BACSTELDirDebService")
    BACSTEL_DIR_DEB_SERVICE("BACSTELDirDebService"),
    @XmlEnumValue("BACSTELDirDebAncilliary")
    BACSTEL_DIR_DEB_ANCILLIARY("BACSTELDirDebAncilliary"),
    @XmlEnumValue("BACSTELAncilliary")
    BACSTEL_ANCILLIARY("BACSTELAncilliary"),
    @XmlEnumValue("BACSTELSmartCard")
    BACSTEL_SMART_CARD("BACSTELSmartCard"),
    @XmlEnumValue("BACSTELFile")
    BACSTEL_FILE("BACSTELFile"),
    @XmlEnumValue("BACSTELOverlimit")
    BACSTEL_OVERLIMIT("BACSTELOverlimit"),
    @XmlEnumValue("BACSTELPayment")
    BACSTEL_PAYMENT("BACSTELPayment"),
    @XmlEnumValue("BACSTELService")
    BACSTEL_SERVICE("BACSTELService"),
    @XmlEnumValue("CHAPSOutBranch")
    CHAPS_OUT_BRANCH("CHAPSOutBranch"),
    @XmlEnumValue("CHAPSOutOnlineDepositAcc")
    CHAPS_OUT_ONLINE_DEPOSIT_ACC("CHAPSOutOnlineDepositAcc"),
    @XmlEnumValue("CHAPSIn")
    CHAPS_IN("CHAPSIn"),
    @XmlEnumValue("CHAPSOutPost")
    CHAPS_OUT_POST("CHAPSOutPost"),
    @XmlEnumValue("CHAPSOut")
    CHAPS_OUT("CHAPSOut"),
    @XmlEnumValue("CHAPSOutOnline")
    CHAPS_OUT_ONLINE("CHAPSOutOnline"),
    @XmlEnumValue("CHAPSOutManual")
    CHAPS_OUT_MANUAL("CHAPSOutManual"),
    @XmlEnumValue("CardCardReplacement")
    CARD_CARD_REPLACEMENT("CardCardReplacement"),
    @XmlEnumValue("DraftsBankers")
    DRAFTS_BANKERS("DraftsBankers"),
    @XmlEnumValue("DraftsCancellation")
    DRAFTS_CANCELLATION("DraftsCancellation"),
    @XmlEnumValue("CardGuaranteed")
    CARD_GUARANTEED("CardGuaranteed"),
    @XmlEnumValue("DraftsIntlPayableAbroad")
    DRAFTS_INTL_PAYABLE_ABROAD("DraftsIntlPayableAbroad"),
    @XmlEnumValue("DraftsIntlStoppedCancelled")
    DRAFTS_INTL_STOPPED_CANCELLED("DraftsIntlStoppedCancelled"),
    @XmlEnumValue("EuroChqXLess")
    EURO_CHQ_X_LESS("EuroChqXLess"),
    @XmlEnumValue("EuroChqXPlus")
    EURO_CHQ_X_PLUS("EuroChqXPlus"),
    @XmlEnumValue("FPSOut")
    FPS_OUT("FPSOut"),
    @XmlEnumValue("FPSOutOwn")
    FPS_OUT_OWN("FPSOutOwn"),
    @XmlEnumValue("FPSInBranch")
    FPS_IN_BRANCH("FPSInBranch"),
    @XmlEnumValue("LegalArticlesReport")
    LEGAL_ARTICLES_REPORT("LegalArticlesReport"),
    @XmlEnumValue("LegalSealing")
    LEGAL_SEALING("LegalSealing"),
    @XmlEnumValue("LegalBondAndGuarantee")
    LEGAL_BOND_AND_GUARANTEE("LegalBondAndGuarantee"),
    @XmlEnumValue("LegalCoSearch")
    LEGAL_CO_SEARCH("LegalCoSearch"),
    @XmlEnumValue("LegalDepositAssignment")
    LEGAL_DEPOSIT_ASSIGNMENT("LegalDepositAssignment"),
    @XmlEnumValue("LegalGuaranteePrep")
    LEGAL_GUARANTEE_PREP("LegalGuaranteePrep"),
    @XmlEnumValue("LegalLifePolicyPrepCo")
    LEGAL_LIFE_POLICY_PREP_CO("LegalLifePolicyPrepCo"),
    @XmlEnumValue("LegalLifePolicyPrepPersonal")
    LEGAL_LIFE_POLICY_PREP_PERSONAL("LegalLifePolicyPrepPersonal"),
    @XmlEnumValue("LegalPriorityPariPassu")
    LEGAL_PRIORITY_PARI_PASSU("LegalPriorityPariPassu"),
    @XmlEnumValue("LegalSubordinationAgreement")
    LEGAL_SUBORDINATION_AGREEMENT("LegalSubordinationAgreement"),
    @XmlEnumValue("DirDebDirectDebitAdmin")
    DIR_DEB_DIRECT_DEBIT_ADMIN("DirDebDirectDebitAdmin"),
    @XmlEnumValue("DirDebDirectDebitCancel")
    DIR_DEB_DIRECT_DEBIT_CANCEL("DirDebDirectDebitCancel"),
    @XmlEnumValue("IntlPayBIBForeignLimit")
    INTL_PAY_BIB_FOREIGN_LIMIT("IntlPayBIBForeignLimit"),
    @XmlEnumValue("IntlPayCreditTransCust")
    INTL_PAY_CREDIT_TRANS_CUST("IntlPayCreditTransCust"),
    @XmlEnumValue("IntlPayCreditTransNonCust")
    INTL_PAY_CREDIT_TRANS_NON_CUST("IntlPayCreditTransNonCust"),
    @XmlEnumValue("IntlPayExpressMoneyMover")
    INTL_PAY_EXPRESS_MONEY_MOVER("IntlPayExpressMoneyMover"),
    @XmlEnumValue("IntlPayEEAPayUrgent")
    INTL_PAY_EEA_PAY_URGENT("IntlPayEEAPayUrgent"),
    @XmlEnumValue("IntlPayIrishPayUrgent")
    INTL_PAY_IRISH_PAY_URGENT("IntlPayIrishPayUrgent"),
    @XmlEnumValue("IntlPayEEAPay")
    INTL_PAY_EEA_PAY("IntlPayEEAPay"),
    @XmlEnumValue("IntlPayFXPaymentIn")
    INTL_PAY_FX_PAYMENT_IN("IntlPayFXPaymentIn"),
    @XmlEnumValue("IntlPayForeignIn1CPlus")
    INTL_PAY_FOREIGN_IN_1_C_PLUS("IntlPayForeignIn1CPlus"),
    @XmlEnumValue("IntlPayForeignCharge")
    INTL_PAY_FOREIGN_CHARGE("IntlPayForeignCharge"),
    @XmlEnumValue("IntlPayForeignInternet")
    INTL_PAY_FOREIGN_INTERNET("IntlPayForeignInternet"),
    @XmlEnumValue("IntlPayForeignInSub1C")
    INTL_PAY_FOREIGN_IN_SUB_1_C("IntlPayForeignInSub1C"),
    @XmlEnumValue("IntlPayPurchaseNonSterling")
    INTL_PAY_PURCHASE_NON_STERLING("IntlPayPurchaseNonSterling"),
    @XmlEnumValue("IntlPayPaymentTracing")
    INTL_PAY_PAYMENT_TRACING("IntlPayPaymentTracing"),
    @XmlEnumValue("IntlPayStandardMoneyMover")
    INTL_PAY_STANDARD_MONEY_MOVER("IntlPayStandardMoneyMover"),
    @XmlEnumValue("IntlPayMT101Transaction")
    INTL_PAY_MT_101_TRANSACTION("IntlPayMT101Transaction"),
    @XmlEnumValue("IntlPayWorldpayPayment")
    INTL_PAY_WORLDPAY_PAYMENT("IntlPayWorldpayPayment"),
    @XmlEnumValue("InvPayBankDetailsWrong")
    INV_PAY_BANK_DETAILS_WRONG("InvPayBankDetailsWrong"),
    @XmlEnumValue("InvPayForeignBCNR")
    INV_PAY_FOREIGN_BCNR("InvPayForeignBCNR"),
    @XmlEnumValue("InvPayForeignRecall")
    INV_PAY_FOREIGN_RECALL("InvPayForeignRecall"),
    @XmlEnumValue("InvGeneralInq")
    INV_GENERAL_INQ("InvGeneralInq"),
    @XmlEnumValue("InvOldInstruction")
    INV_OLD_INSTRUCTION("InvOldInstruction"),
    @XmlEnumValue("InvPayReturnDebitXVLess")
    INV_PAY_RETURN_DEBIT_XV_LESS("InvPayReturnDebitXVLess"),
    @XmlEnumValue("InvPayReturnDebitXVPlus")
    INV_PAY_RETURN_DEBIT_XV_PLUS("InvPayReturnDebitXVPlus"),
    @XmlEnumValue("InvPayStopPayment")
    INV_PAY_STOP_PAYMENT("InvPayStopPayment"),
    @XmlEnumValue("InvPayStandingOrdUnpaid")
    INV_PAY_STANDING_ORD_UNPAID("InvPayStandingOrdUnpaid"),
    @XmlEnumValue("SafeKeepAccess")
    SAFE_KEEP_ACCESS("SafeKeepAccess"),
    @XmlEnumValue("SafeKeepDeedMedium")
    SAFE_KEEP_DEED_MEDIUM("SafeKeepDeedMedium"),
    @XmlEnumValue("SafeKeepingEnvelope")
    SAFE_KEEPING_ENVELOPE("SafeKeepingEnvelope"),
    @XmlEnumValue("SafeKeepingInspection")
    SAFE_KEEPING_INSPECTION("SafeKeepingInspection"),
    @XmlEnumValue("SafeKeepingLargeItem")
    SAFE_KEEPING_LARGE_ITEM("SafeKeepingLargeItem"),
    @XmlEnumValue("SafeKeepMultipleItems")
    SAFE_KEEP_MULTIPLE_ITEMS("SafeKeepMultipleItems"),
    @XmlEnumValue("SafeKeepingParcel")
    SAFE_KEEPING_PARCEL("SafeKeepingParcel"),
    @XmlEnumValue("SafeKeepDeedSmall")
    SAFE_KEEP_DEED_SMALL("SafeKeepDeedSmall"),
    @XmlEnumValue("SafeKeepOneItem")
    SAFE_KEEP_ONE_ITEM("SafeKeepOneItem"),
    @XmlEnumValue("LoanArrangement")
    LOAN_ARRANGEMENT("LoanArrangement"),
    @XmlEnumValue("NightSafeNightSafeBankOpen")
    NIGHT_SAFE_NIGHT_SAFE_BANK_OPEN("NightSafeNightSafeBankOpen"),
    @XmlEnumValue("NightSafeCreditSub5K")
    NIGHT_SAFE_CREDIT_SUB_5_K("NightSafeCreditSub5K"),
    @XmlEnumValue("NightSafeNightSafe")
    NIGHT_SAFE_NIGHT_SAFE("NightSafeNightSafe"),
    @XmlEnumValue("NightSafeNightSafePaidIn")
    NIGHT_SAFE_NIGHT_SAFE_PAID_IN("NightSafeNightSafePaidIn"),
    @XmlEnumValue("POPostOfficeCounterCredit")
    PO_POST_OFFICE_COUNTER_CREDIT("POPostOfficeCounterCredit"),
    @XmlEnumValue("POPostOfficeCashCredit")
    PO_POST_OFFICE_CASH_CREDIT("POPostOfficeCashCredit"),
    @XmlEnumValue("POPostOfficeCashOut")
    PO_POST_OFFICE_CASH_OUT("POPostOfficeCashOut"),
    @XmlEnumValue("POPostOfficeWithdrawal")
    PO_POST_OFFICE_WITHDRAWAL("POPostOfficeWithdrawal"),
    @XmlEnumValue("ChqBookTheftLossAllStopped")
    CHQ_BOOK_THEFT_LOSS_ALL_STOPPED("ChqBookTheftLossAllStopped"),
    @XmlEnumValue("ChqIssuedCurrencyAcc")
    CHQ_ISSUED_CURRENCY_ACC("ChqIssuedCurrencyAcc"),
    @XmlEnumValue("ChqCopy")
    CHQ_COPY("ChqCopy"),
    @XmlEnumValue("ChqDraft")
    CHQ_DRAFT("ChqDraft"),
    @XmlEnumValue("ChqIn")
    CHQ_IN("ChqIn"),
    @XmlEnumValue("ChqSpecialChqClearance")
    CHQ_SPECIAL_CHQ_CLEARANCE("ChqSpecialChqClearance"),
    @XmlEnumValue("ChqinCashCentre")
    CHQIN_CASH_CENTRE("ChqinCashCentre"),
    @XmlEnumValue("ChqOutIssued")
    CHQ_OUT_ISSUED("ChqOutIssued"),
    @XmlEnumValue("ChqSpecialChqPresentation")
    CHQ_SPECIAL_CHQ_PRESENTATION("ChqSpecialChqPresentation"),
    @XmlEnumValue("ChqCounterCheque")
    CHQ_COUNTER_CHEQUE("ChqCounterCheque"),
    @XmlEnumValue("ChqChequeswithStatement")
    CHQ_CHEQUESWITH_STATEMENT("ChqChequeswithStatement"),
    @XmlEnumValue("ChqStopped")
    CHQ_STOPPED("ChqStopped"),
    @XmlEnumValue("ChqTrans")
    CHQ_TRANS("ChqTrans"),
    @XmlEnumValue("ChqDraftFX")
    CHQ_DRAFT_FX("ChqDraftFX"),
    @XmlEnumValue("ChqForeignCourier")
    CHQ_FOREIGN_COURIER("ChqForeignCourier"),
    @XmlEnumValue("ChqForeignNegTenThou")
    CHQ_FOREIGN_NEG_TEN_THOU("ChqForeignNegTenThou"),
    @XmlEnumValue("ChqForeignNegHundred")
    CHQ_FOREIGN_NEG_HUNDRED("ChqForeignNegHundred"),
    @XmlEnumValue("ChequeForeignBankDivi")
    CHEQUE_FOREIGN_BANK_DIVI("ChequeForeignBankDivi"),
    @XmlEnumValue("ChqForeignNegFiftyThou")
    CHQ_FOREIGN_NEG_FIFTY_THOU("ChqForeignNegFiftyThou"),
    @XmlEnumValue("ChqPensionCheque")
    CHQ_PENSION_CHEQUE("ChqPensionCheque"),
    @XmlEnumValue("ChequeForeignOtherDivi")
    CHEQUE_FOREIGN_OTHER_DIVI("ChequeForeignOtherDivi"),
    @XmlEnumValue("ChqForeignNegFiveThou")
    CHQ_FOREIGN_NEG_FIVE_THOU("ChqForeignNegFiveThou"),
    @XmlEnumValue("ChqForeignNegMax")
    CHQ_FOREIGN_NEG_MAX("ChqForeignNegMax"),
    @XmlEnumValue("ChqForeignGBPMMDPlus")
    CHQ_FOREIGN_GBPMMD_PLUS("ChqForeignGBPMMDPlus"),
    @XmlEnumValue("ChqGiftCheque")
    CHQ_GIFT_CHEQUE("ChqGiftCheque"),
    @XmlEnumValue("ChqCounterLodgement")
    CHQ_COUNTER_LODGEMENT("ChqCounterLodgement"),
    @XmlEnumValue("ChqCashDropLodgement")
    CHQ_CASH_DROP_LODGEMENT("ChqCashDropLodgement"),
    @XmlEnumValue("ChqForeign")
    CHQ_FOREIGN("ChqForeign"),
    @XmlEnumValue("ChqChequePhotocopy")
    CHQ_CHEQUE_PHOTOCOPY("ChqChequePhotocopy"),
    @XmlEnumValue("ChqPostOfficeCredit")
    CHQ_POST_OFFICE_CREDIT("ChqPostOfficeCredit"),
    @XmlEnumValue("ChqPostOfficeChequeCollected")
    CHQ_POST_OFFICE_CHEQUE_COLLECTED("ChqPostOfficeChequeCollected"),
    @XmlEnumValue("ChqChequeRetrieval")
    CHQ_CHEQUE_RETRIEVAL("ChqChequeRetrieval"),
    @XmlEnumValue("ChqReconcilliationPerTrans")
    CHQ_RECONCILLIATION_PER_TRANS("ChqReconcilliationPerTrans"),
    @XmlEnumValue("ChqSpecialPresentationCount")
    CHQ_SPECIAL_PRESENTATION_COUNT("ChqSpecialPresentationCount"),
    @XmlEnumValue("ChqSpecialPresentationPTT")
    CHQ_SPECIAL_PRESENTATION_PTT("ChqSpecialPresentationPTT"),
    @XmlEnumValue("ChqDraftSterling")
    CHQ_DRAFT_STERLING("ChqDraftSterling"),
    @XmlEnumValue("ChqUnpaidCharge")
    CHQ_UNPAID_CHARGE("ChqUnpaidCharge"),
    @XmlEnumValue("ChqUnpaidTransIn")
    CHQ_UNPAID_TRANS_IN("ChqUnpaidTransIn"),
    @XmlEnumValue("ChqUnpaidTransOut")
    CHQ_UNPAID_TRANS_OUT("ChqUnpaidTransOut"),
    @XmlEnumValue("ChqUnpaidCheque")
    CHQ_UNPAID_CHEQUE("ChqUnpaidCheque"),
    @XmlEnumValue("ReportAuditLetter")
    REPORT_AUDIT_LETTER("ReportAuditLetter"),
    @XmlEnumValue("ReportFAXAdviceAdditional")
    REPORT_FAX_ADVICE_ADDITIONAL("ReportFAXAdviceAdditional"),
    @XmlEnumValue("ReportTelAdviceAdditional")
    REPORT_TEL_ADVICE_ADDITIONAL("ReportTelAdviceAdditional"),
    @XmlEnumValue("ReportCreditHistory")
    REPORT_CREDIT_HISTORY("ReportCreditHistory"),
    @XmlEnumValue("ReportCertInterestDuplicate")
    REPORT_CERT_INTEREST_DUPLICATE("ReportCertInterestDuplicate"),
    @XmlEnumValue("ReportCertInterest")
    REPORT_CERT_INTEREST("ReportCertInterest"),
    @XmlEnumValue("ReportCreditHistoryAdditionalInYear")
    REPORT_CREDIT_HISTORY_ADDITIONAL_IN_YEAR("ReportCreditHistoryAdditionalInYear"),
    @XmlEnumValue("ReportForeignStatusEnqElec")
    REPORT_FOREIGN_STATUS_ENQ_ELEC("ReportForeignStatusEnqElec"),
    @XmlEnumValue("ReportForeignStatusEnq")
    REPORT_FOREIGN_STATUS_ENQ("ReportForeignStatusEnq"),
    @XmlEnumValue("ReportStatementChqDaily")
    REPORT_STATEMENT_CHQ_DAILY("ReportStatementChqDaily"),
    @XmlEnumValue("ReportStatementChqFortnightly")
    REPORT_STATEMENT_CHQ_FORTNIGHTLY("ReportStatementChqFortnightly"),
    @XmlEnumValue("ReportStatementChqMonthly")
    REPORT_STATEMENT_CHQ_MONTHLY("ReportStatementChqMonthly"),
    @XmlEnumValue("ReportStatementChqWeekly")
    REPORT_STATEMENT_CHQ_WEEKLY("ReportStatementChqWeekly"),
    @XmlEnumValue("ReportStatementAndDiviChq")
    REPORT_STATEMENT_AND_DIVI_CHQ("ReportStatementAndDiviChq"),
    @XmlEnumValue("ReportReferralItem")
    REPORT_REFERRAL_ITEM("ReportReferralItem"),
    @XmlEnumValue("ReportStatementByATM")
    REPORT_STATEMENT_BY_ATM("ReportStatementByATM"),
    @XmlEnumValue("ReportStatementByBranch")
    REPORT_STATEMENT_BY_BRANCH("ReportStatementByBranch"),
    @XmlEnumValue("ReportStatementCopyRegular")
    REPORT_STATEMENT_COPY_REGULAR("ReportStatementCopyRegular"),
    @XmlEnumValue("ReportStatementDaily")
    REPORT_STATEMENT_DAILY("ReportStatementDaily"),
    @XmlEnumValue("ReportStatusEnquiry")
    REPORT_STATUS_ENQUIRY("ReportStatusEnquiry"),
    @XmlEnumValue("ReportStatementFrequent")
    REPORT_STATEMENT_FREQUENT("ReportStatementFrequent"),
    @XmlEnumValue("ReportStatementMonthly")
    REPORT_STATEMENT_MONTHLY("ReportStatementMonthly"),
    @XmlEnumValue("ReportStatementCopy1")
    REPORT_STATEMENT_COPY_1("ReportStatementCopy1"),
    @XmlEnumValue("ReportStatementToBranch")
    REPORT_STATEMENT_TO_BRANCH("ReportStatementToBranch"),
    @XmlEnumValue("ReportSMSTextMiniStatementorAlert")
    REPORT_SMS_TEXT_MINI_STATEMENTOR_ALERT("ReportSMSTextMiniStatementorAlert"),
    @XmlEnumValue("ReportStatementFortnightly")
    REPORT_STATEMENT_FORTNIGHTLY("ReportStatementFortnightly"),
    @XmlEnumValue("ReportSMSTextMiniStatementWoM")
    REPORT_SMS_TEXT_MINI_STATEMENT_WO_M("ReportSMSTextMiniStatementWoM"),
    @XmlEnumValue("ReportSMSTextAlertBalance")
    REPORT_SMS_TEXT_ALERT_BALANCE("ReportSMSTextAlertBalance"),
    @XmlEnumValue("ReportSMSTextAlert")
    REPORT_SMS_TEXT_ALERT("ReportSMSTextAlert"),
    @XmlEnumValue("ReportTaxCert")
    REPORT_TAX_CERT("ReportTaxCert"),
    @XmlEnumValue("ReportWeeklyStatement")
    REPORT_WEEKLY_STATEMENT("ReportWeeklyStatement"),
    @XmlEnumValue("SEPABranch")
    SEPA_BRANCH("SEPABranch"),
    @XmlEnumValue("SEPACredit")
    SEPA_CREDIT("SEPACredit"),
    @XmlEnumValue("SEPADirectDebit")
    SEPA_DIRECT_DEBIT("SEPADirectDebit"),
    @XmlEnumValue("SEPAIn")
    SEPA_IN("SEPAIn"),
    @XmlEnumValue("SEPAEuro")
    SEPA_EURO("SEPAEuro"),
    @XmlEnumValue("SEPAOut")
    SEPA_OUT("SEPAOut"),
    @XmlEnumValue("SEPAUnpaid")
    SEPA_UNPAID("SEPAUnpaid"),
    @XmlEnumValue("SEPAWinbitsTransaction")
    SEPA_WINBITS_TRANSACTION("SEPAWinbitsTransaction"),
    @XmlEnumValue("TransBillPaymentBranch")
    TRANS_BILL_PAYMENT_BRANCH("TransBillPaymentBranch"),
    @XmlEnumValue("TransBillCollect")
    TRANS_BILL_COLLECT("TransBillCollect"),
    @XmlEnumValue("TransTelephoneBillPayment")
    TRANS_TELEPHONE_BILL_PAYMENT("TransTelephoneBillPayment"),
    @XmlEnumValue("TransBankPayment")
    TRANS_BANK_PAYMENT("TransBankPayment"),
    @XmlEnumValue("TransBillPaymentTelephone")
    TRANS_BILL_PAYMENT_TELEPHONE("TransBillPaymentTelephone"),
    @XmlEnumValue("TransCorrespondentBankFee")
    TRANS_CORRESPONDENT_BANK_FEE("TransCorrespondentBankFee"),
    @XmlEnumValue("TransCreditTransferUKDifferent")
    TRANS_CREDIT_TRANSFER_UK_DIFFERENT("TransCreditTransferUKDifferent"),
    @XmlEnumValue("TransCreditTransferUKSame")
    TRANS_CREDIT_TRANSFER_UK_SAME("TransCreditTransferUKSame"),
    @XmlEnumValue("TransCredit")
    TRANS_CREDIT("TransCredit"),
    @XmlEnumValue("TransCreditTransfer")
    TRANS_CREDIT_TRANSFER("TransCreditTransfer"),
    @XmlEnumValue("TransBranchCredit")
    TRANS_BRANCH_CREDIT("TransBranchCredit"),
    @XmlEnumValue("TransDebit")
    TRANS_DEBIT("TransDebit"),
    @XmlEnumValue("TransDebCardDeb")
    TRANS_DEB_CARD_DEB("TransDebCardDeb"),
    @XmlEnumValue("TransUKDirDeb")
    TRANS_UK_DIR_DEB("TransUKDirDeb"),
    @XmlEnumValue("TransManualDeb")
    TRANS_MANUAL_DEB("TransManualDeb"),
    @XmlEnumValue("TitleDeeds")
    TITLE_DEEDS("TitleDeeds"),
    @XmlEnumValue("TransBuyForeignWithGBP")
    TRANS_BUY_FOREIGN_WITH_GBP("TransBuyForeignWithGBP"),
    @XmlEnumValue("TransGoodValueReq")
    TRANS_GOOD_VALUE_REQ("TransGoodValueReq"),
    @XmlEnumValue("TransSWIFTOutUKForeign")
    TRANS_SWIFT_OUT_UK_FOREIGN("TransSWIFTOutUKForeign"),
    @XmlEnumValue("TransInconpleteInstruction")
    TRANS_INCONPLETE_INSTRUCTION("TransInconpleteInstruction"),
    @XmlEnumValue("TransManualEntries")
    TRANS_MANUAL_ENTRIES("TransManualEntries"),
    @XmlEnumValue("TransManualTrans")
    TRANS_MANUAL_TRANS("TransManualTrans"),
    @XmlEnumValue("TransNonSterling")
    TRANS_NON_STERLING("TransNonSterling"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("TransPOSSaleForeign")
    TRANS_POS_SALE_FOREIGN("TransPOSSaleForeign"),
    @XmlEnumValue("TransPriPaymentPost")
    TRANS_PRI_PAYMENT_POST("TransPriPaymentPost"),
    @XmlEnumValue("TransPOSSaleUK")
    TRANS_POS_SALE_UK("TransPOSSaleUK"),
    @XmlEnumValue("TransReconciliationPerTrans")
    TRANS_RECONCILIATION_PER_TRANS("TransReconciliationPerTrans"),
    @XmlEnumValue("TransStandingOrdAdmin")
    TRANS_STANDING_ORD_ADMIN("TransStandingOrdAdmin"),
    @XmlEnumValue("TransStandingOrd")
    TRANS_STANDING_ORD("TransStandingOrd"),
    @XmlEnumValue("TransStandingOrdManPay")
    TRANS_STANDING_ORD_MAN_PAY("TransStandingOrdManPay"),
    @XmlEnumValue("TransTelBusiPriPaymentForeignToUKAcc")
    TRANS_TEL_BUSI_PRI_PAYMENT_FOREIGN_TO_UK_ACC("TransTelBusiPriPaymentForeignToUKAcc"),
    @XmlEnumValue("TransTeleItem")
    TRANS_TELE_ITEM("TransTeleItem"),
    @XmlEnumValue("TransTelBusiPriPaymentToGrpAcc")
    TRANS_TEL_BUSI_PRI_PAYMENT_TO_GRP_ACC("TransTelBusiPriPaymentToGrpAcc"),
    @XmlEnumValue("TransTransferExGroup")
    TRANS_TRANSFER_EX_GROUP("TransTransferExGroup"),
    @XmlEnumValue("TransTelBusiPriPaymentToNonGrpAcc")
    TRANS_TEL_BUSI_PRI_PAYMENT_TO_NON_GRP_ACC("TransTelBusiPriPaymentToNonGrpAcc"),
    @XmlEnumValue("TransSWIFTOutNonEEASterling")
    TRANS_SWIFT_OUT_NON_EEA_STERLING("TransSWIFTOutNonEEASterling"),
    @XmlEnumValue("AutoAutoCredit")
    AUTO_AUTO_CREDIT("AutoAutoCredit"),
    @XmlEnumValue("AutoAutomatedEntries")
    AUTO_AUTOMATED_ENTRIES("AutoAutomatedEntries"),
    @XmlEnumValue("AutoAutoCreditPhoneInet")
    AUTO_AUTO_CREDIT_PHONE_INET("AutoAutoCreditPhoneInet"),
    @XmlEnumValue("AutoAutomatedTrans")
    AUTO_AUTOMATED_TRANS("AutoAutomatedTrans"),
    @XmlEnumValue("AutoDebitCardCommercial")
    AUTO_DEBIT_CARD_COMMERCIAL("AutoDebitCardCommercial"),
    @XmlEnumValue("AutoFPSAutoCredit")
    AUTO_FPS_AUTO_CREDIT("AutoFPSAutoCredit"),
    @XmlEnumValue("VisaTravellersChqorCurrency")
    VISA_TRAVELLERS_CHQOR_CURRENCY("VisaTravellersChqorCurrency"),
    @XmlEnumValue("OnlineInternetBillPayment")
    ONLINE_INTERNET_BILL_PAYMENT("OnlineInternetBillPayment"),
    @XmlEnumValue("OnlineBusinessOnlineEuroPayment")
    ONLINE_BUSINESS_ONLINE_EURO_PAYMENT("OnlineBusinessOnlineEuroPayment"),
    @XmlEnumValue("OnlineBusinessOnlineUrgentEuroPayment")
    ONLINE_BUSINESS_ONLINE_URGENT_EURO_PAYMENT("OnlineBusinessOnlineUrgentEuroPayment"),
    @XmlEnumValue("OnlineBusinessOnlineForeignPayment")
    ONLINE_BUSINESS_ONLINE_FOREIGN_PAYMENT("OnlineBusinessOnlineForeignPayment"),
    @XmlEnumValue("OnlineInterbankTransfer")
    ONLINE_INTERBANK_TRANSFER("OnlineInterbankTransfer"),
    @XmlEnumValue("OnlineInterbankPerTransfer")
    ONLINE_INTERBANK_PER_TRANSFER("OnlineInterbankPerTransfer"),
    @XmlEnumValue("OnlineInterbranchTransfer")
    ONLINE_INTERBRANCH_TRANSFER("OnlineInterbranchTransfer"),
    @XmlEnumValue("OnlineInterbranchPerTransfer")
    ONLINE_INTERBRANCH_PER_TRANSFER("OnlineInterbranchPerTransfer"),
    @XmlEnumValue("OnlineSubscriptionMonthly")
    ONLINE_SUBSCRIPTION_MONTHLY("OnlineSubscriptionMonthly"),
    @XmlEnumValue("OnlineBankingPayment")
    ONLINE_BANKING_PAYMENT("OnlineBankingPayment"),
    @XmlEnumValue("OnlineReplacementCardReader")
    ONLINE_REPLACEMENT_CARD_READER("OnlineReplacementCardReader"),
    @XmlEnumValue("OnlinePaymentinGBPtoUK")
    ONLINE_PAYMENTIN_GB_PTO_UK("OnlinePaymentinGBPtoUK"),
    @XmlEnumValue("OnlineUrgentPayment")
    ONLINE_URGENT_PAYMENT("OnlineUrgentPayment"),
    @XmlEnumValue("OnlinePaymentinUSDtoUS")
    ONLINE_PAYMENTIN_US_DTO_US("OnlinePaymentinUSDtoUS"),
    @XmlEnumValue("OnlineBulkDirectDebSterling")
    ONLINE_BULK_DIRECT_DEB_STERLING("OnlineBulkDirectDebSterling"),
    @XmlEnumValue("ForeignChqSent")
    FOREIGN_CHQ_SENT("ForeignChqSent"),
    @XmlEnumValue("ForeignChqSelf")
    FOREIGN_CHQ_SELF("ForeignChqSelf"),
    @XmlEnumValue("ForeignChqEncashment")
    FOREIGN_CHQ_ENCASHMENT("ForeignChqEncashment"),
    @XmlEnumValue("ForeignFXInwardsCust")
    FOREIGN_FX_INWARDS_CUST("ForeignFXInwardsCust"),
    @XmlEnumValue("ForeignFXTransfersROI")
    FOREIGN_FX_TRANSFERS_ROI("ForeignFXTransfersROI"),
    @XmlEnumValue("ForeignFXForwardTrans")
    FOREIGN_FX_FORWARD_TRANS("ForeignFXForwardTrans"),
    @XmlEnumValue("ForeignExMaintenance")
    FOREIGN_EX_MAINTENANCE("ForeignExMaintenance"),
    @XmlEnumValue("ForeignFXInwardsNonCust")
    FOREIGN_FX_INWARDS_NON_CUST("ForeignFXInwardsNonCust"),
    @XmlEnumValue("ForeignFXOutwards")
    FOREIGN_FX_OUTWARDS("ForeignFXOutwards"),
    @XmlEnumValue("ForeignPurchase")
    FOREIGN_PURCHASE("ForeignPurchase"),
    @XmlEnumValue("ForeignStatusRep")
    FOREIGN_STATUS_REP("ForeignStatusRep"),
    @XmlEnumValue("ForeignChqDraft")
    FOREIGN_CHQ_DRAFT("ForeignChqDraft"),
    @XmlEnumValue("ForeignChqCLess")
    FOREIGN_CHQ_C_LESS("ForeignChqCLess"),
    @XmlEnumValue("ForeignChqMLess")
    FOREIGN_CHQ_M_LESS("ForeignChqMLess"),
    @XmlEnumValue("ForeignChqOther")
    FOREIGN_CHQ_OTHER("ForeignChqOther"),
    @XmlEnumValue("ForeignChqMPlus")
    FOREIGN_CHQ_M_PLUS("ForeignChqMPlus"),
    @XmlEnumValue("ForeignChqCCC")
    FOREIGN_CHQ_CCC("ForeignChqCCC"),
    @XmlEnumValue("ServiceCAccountFee")
    SERVICE_C_ACCOUNT_FEE("ServiceCAccountFee"),
    @XmlEnumValue("ServiceCAccountFeeMonthly")
    SERVICE_C_ACCOUNT_FEE_MONTHLY("ServiceCAccountFeeMonthly"),
    @XmlEnumValue("ServiceCAccountFeeQuarterly")
    SERVICE_C_ACCOUNT_FEE_QUARTERLY("ServiceCAccountFeeQuarterly"),
    @XmlEnumValue("ServiceCFixedTariff")
    SERVICE_C_FIXED_TARIFF("ServiceCFixedTariff"),
    @XmlEnumValue("ServiceCBusiDepAccBreakage")
    SERVICE_C_BUSI_DEP_ACC_BREAKAGE("ServiceCBusiDepAccBreakage"),
    @XmlEnumValue("ServiceCMonitorDaily")
    SERVICE_C_MONITOR_DAILY("ServiceCMonitorDaily"),
    @XmlEnumValue("ServiceCMinimumMonthlyFee")
    SERVICE_C_MINIMUM_MONTHLY_FEE("ServiceCMinimumMonthlyFee"),
    @XmlEnumValue("ServiceCMonitorMonthly")
    SERVICE_C_MONITOR_MONTHLY("ServiceCMonitorMonthly"),
    @XmlEnumValue("ServiceCMonitorWeekly")
    SERVICE_C_MONITOR_WEEKLY("ServiceCMonitorWeekly"),
    @XmlEnumValue("ServiceCMT940AccountFirst")
    SERVICE_CMT_940_ACCOUNT_FIRST("ServiceCMT940AccountFirst"),
    @XmlEnumValue("ServiceCMT940AccountSubsequent")
    SERVICE_CMT_940_ACCOUNT_SUBSEQUENT("ServiceCMT940AccountSubsequent"),
    @XmlEnumValue("ServiceCOther")
    SERVICE_C_OTHER("ServiceCOther"),
    @XmlEnumValue("CounterCoinHandling")
    COUNTER_COIN_HANDLING("CounterCoinHandling"),
    @XmlEnumValue("CounterCashIn")
    COUNTER_CASH_IN("CounterCashIn"),
    @XmlEnumValue("CounterCashInNotUs")
    COUNTER_CASH_IN_NOT_US("CounterCashInNotUs"),
    @XmlEnumValue("CounterCashOut")
    COUNTER_CASH_OUT("CounterCashOut"),
    @XmlEnumValue("CounterCashX")
    COUNTER_CASH_X("CounterCashX"),
    @XmlEnumValue("CounterForeignNoteHandling")
    COUNTER_FOREIGN_NOTE_HANDLING("CounterForeignNoteHandling"),
    @XmlEnumValue("CounterCashFeeRate")
    COUNTER_CASH_FEE_RATE("CounterCashFeeRate"),
    @XmlEnumValue("CounterForeignCashOutTx")
    COUNTER_FOREIGN_CASH_OUT_TX("CounterForeignCashOutTx"),
    @XmlEnumValue("CounterCounterLodgement")
    COUNTER_COUNTER_LODGEMENT("CounterCounterLodgement"),
    @XmlEnumValue("CounterCashDropLodgement")
    COUNTER_CASH_DROP_LODGEMENT("CounterCashDropLodgement"),
    @XmlEnumValue("CounterNotesLodged")
    COUNTER_NOTES_LODGED("CounterNotesLodged"),
    @XmlEnumValue("CounterNotesOut")
    COUNTER_NOTES_OUT("CounterNotesOut"),
    @XmlEnumValue("CounterCashInOwn")
    COUNTER_CASH_IN_OWN("CounterCashInOwn"),
    @XmlEnumValue("CounterCashFeePercent")
    COUNTER_CASH_FEE_PERCENT("CounterCashFeePercent");
    private final String value;

    FeeType1(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeeType1 fromValue(String v) {
        for (FeeType1 c: FeeType1 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
