
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeeType40.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeeType40"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CashCentreCoinHandling"/&gt;
 *     &lt;enumeration value="CashCentreCashX"/&gt;
 *     &lt;enumeration value="CashCentreCashFeePercent"/&gt;
 *     &lt;enumeration value="CashCentreCashFeeRate"/&gt;
 *     &lt;enumeration value="CashCentreNotesLodged"/&gt;
 *     &lt;enumeration value="CashCentreNotesOut"/&gt;
 *     &lt;enumeration value="CashCentreCashIn"/&gt;
 *     &lt;enumeration value="CashCentreCashOut"/&gt;
 *     &lt;enumeration value="ReportCertBalance"/&gt;
 *     &lt;enumeration value="ATMAbroadConVisaDebit"/&gt;
 *     &lt;enumeration value="ATMConGroupATM"/&gt;
 *     &lt;enumeration value="ATMAbroad"/&gt;
 *     &lt;enumeration value="ATMForeignCashDebCard"/&gt;
 *     &lt;enumeration value="ATMAbroadGoldVisaDebit"/&gt;
 *     &lt;enumeration value="ATMNonSterlingWithdrawal"/&gt;
 *     &lt;enumeration value="ATMAbroadVisaDebit"/&gt;
 *     &lt;enumeration value="CHAPSOutBranch"/&gt;
 *     &lt;enumeration value="CHAPSCancellation"/&gt;
 *     &lt;enumeration value="CHAPSIn"/&gt;
 *     &lt;enumeration value="CHAPSOutInterBank"/&gt;
 *     &lt;enumeration value="CHAPSInterBank"/&gt;
 *     &lt;enumeration value="CHAPSOutPost"/&gt;
 *     &lt;enumeration value="CHAPSOutInterBranch"/&gt;
 *     &lt;enumeration value="CHAPSOut"/&gt;
 *     &lt;enumeration value="CHAPSOutOnline"/&gt;
 *     &lt;enumeration value="CardCardReplacement"/&gt;
 *     &lt;enumeration value="DraftsCounter"/&gt;
 *     &lt;enumeration value="DraftsBankers"/&gt;
 *     &lt;enumeration value="DraftsCancellation"/&gt;
 *     &lt;enumeration value="CardGuaranteed"/&gt;
 *     &lt;enumeration value="DraftsIntlPayableAbroad"/&gt;
 *     &lt;enumeration value="DraftsLostStolen"/&gt;
 *     &lt;enumeration value="CardPersonalisedCard"/&gt;
 *     &lt;enumeration value="DraftsIntlStoppedCancelled"/&gt;
 *     &lt;enumeration value="EmergencyLending"/&gt;
 *     &lt;enumeration value="FPSInBranch"/&gt;
 *     &lt;enumeration value="LegalCourtOrder"/&gt;
 *     &lt;enumeration value="IntlPayFXPaymentIn"/&gt;
 *     &lt;enumeration value="IntlPayForeignPaymentInUKAcc"/&gt;
 *     &lt;enumeration value="IntlPayForeignCharge"/&gt;
 *     &lt;enumeration value="IntlPayForeignInternet"/&gt;
 *     &lt;enumeration value="IntlPayFXPaymentOut"/&gt;
 *     &lt;enumeration value="IntlPayFXPaymentOutIR"/&gt;
 *     &lt;enumeration value="IntlPayPurchaseNonSterling"/&gt;
 *     &lt;enumeration value="IntlPayPaymentTracing"/&gt;
 *     &lt;enumeration value="IntlPayTransNonSterling"/&gt;
 *     &lt;enumeration value="IntlPayTransRateNonSterling"/&gt;
 *     &lt;enumeration value="IntlPayWorldpayPayment"/&gt;
 *     &lt;enumeration value="InvPayBankDetailsWrong"/&gt;
 *     &lt;enumeration value="InvPayForeignBCNR"/&gt;
 *     &lt;enumeration value="InvPayForeignRecall"/&gt;
 *     &lt;enumeration value="InvPayStandingOrdUnpaid"/&gt;
 *     &lt;enumeration value="SafeKeepingEnvelope"/&gt;
 *     &lt;enumeration value="SafeKeepingInspection"/&gt;
 *     &lt;enumeration value="SafeKeepingLargeItem"/&gt;
 *     &lt;enumeration value="SafeKeepingParcel"/&gt;
 *     &lt;enumeration value="NightSafeNightSafePaidIn"/&gt;
 *     &lt;enumeration value="OverdraftReview"/&gt;
 *     &lt;enumeration value="ChqBookTheftLossAllStopped"/&gt;
 *     &lt;enumeration value="ChqCopy"/&gt;
 *     &lt;enumeration value="ChqDraftSterling"/&gt;
 *     &lt;enumeration value="ChqOutIssued"/&gt;
 *     &lt;enumeration value="ChqSpecialChqPresentation"/&gt;
 *     &lt;enumeration value="ChqSpecialChqClearance"/&gt;
 *     &lt;enumeration value="ChqStopped"/&gt;
 *     &lt;enumeration value="ChqinCashCentre"/&gt;
 *     &lt;enumeration value="ChqDraftFX"/&gt;
 *     &lt;enumeration value="ChqForeignCourier"/&gt;
 *     &lt;enumeration value="ChqGiftCheque"/&gt;
 *     &lt;enumeration value="ChqForeign"/&gt;
 *     &lt;enumeration value="ChqChequePhotocopy"/&gt;
 *     &lt;enumeration value="ChqChequeRetrieval"/&gt;
 *     &lt;enumeration value="ChqSpecialPresentationCount"/&gt;
 *     &lt;enumeration value="ChqSpecialPresentationPTT"/&gt;
 *     &lt;enumeration value="ChqUnpaidCharge"/&gt;
 *     &lt;enumeration value="ChqUnpaidTransIn"/&gt;
 *     &lt;enumeration value="ChqUnpaidTransOut"/&gt;
 *     &lt;enumeration value="ChqUnpaidCheque"/&gt;
 *     &lt;enumeration value="ReportCertInterestDuplicate"/&gt;
 *     &lt;enumeration value="ReportCertInterest"/&gt;
 *     &lt;enumeration value="ReportReference"/&gt;
 *     &lt;enumeration value="ReportReferralItem"/&gt;
 *     &lt;enumeration value="ReportStatementCopyRegular"/&gt;
 *     &lt;enumeration value="ReportStatusEnquiry"/&gt;
 *     &lt;enumeration value="ReportStatementFrequent"/&gt;
 *     &lt;enumeration value="ReportStatementCopy1"/&gt;
 *     &lt;enumeration value="SEPAIn"/&gt;
 *     &lt;enumeration value="SEPAEuro"/&gt;
 *     &lt;enumeration value="SEPAOut"/&gt;
 *     &lt;enumeration value="TransCreditTransferUKDifferent"/&gt;
 *     &lt;enumeration value="TransCredit"/&gt;
 *     &lt;enumeration value="TransCreditTransfer"/&gt;
 *     &lt;enumeration value="TransBuyForeignWithGBP"/&gt;
 *     &lt;enumeration value="TransSWIFTOutUKForeign"/&gt;
 *     &lt;enumeration value="TransPOSSaleForeign"/&gt;
 *     &lt;enumeration value="TransReturnPayment"/&gt;
 *     &lt;enumeration value="TransTransferExGroup"/&gt;
 *     &lt;enumeration value="TransSWIFTOutNonEEASterling"/&gt;
 *     &lt;enumeration value="AutoAutomatedEntries"/&gt;
 *     &lt;enumeration value="OnlineReplacementCardReader"/&gt;
 *     &lt;enumeration value="OnlineUrgentPayment"/&gt;
 *     &lt;enumeration value="ForeignChqSent"/&gt;
 *     &lt;enumeration value="ForeignFXInwardsCust"/&gt;
 *     &lt;enumeration value="ForeignFXOutwards"/&gt;
 *     &lt;enumeration value="ForeignPurchase"/&gt;
 *     &lt;enumeration value="ForeignChqDraft"/&gt;
 *     &lt;enumeration value="ServiceCAccountFee"/&gt;
 *     &lt;enumeration value="ServiceCAccountFeeMonthly"/&gt;
 *     &lt;enumeration value="ServiceCOther"/&gt;
 *     &lt;enumeration value="CounterCashOut"/&gt;
 *     &lt;enumeration value="CounterForeignNoteHandling"/&gt;
 *     &lt;enumeration value="CounterForeignCashOut"/&gt;
 *     &lt;enumeration value="CounterCashFeeRate"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FeeType40")
@XmlEnum
public enum FeeType40 {

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
    @XmlEnumValue("ReportCertBalance")
    REPORT_CERT_BALANCE("ReportCertBalance"),
    @XmlEnumValue("ATMAbroadConVisaDebit")
    ATM_ABROAD_CON_VISA_DEBIT("ATMAbroadConVisaDebit"),
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
    @XmlEnumValue("CHAPSOutBranch")
    CHAPS_OUT_BRANCH("CHAPSOutBranch"),
    @XmlEnumValue("CHAPSCancellation")
    CHAPS_CANCELLATION("CHAPSCancellation"),
    @XmlEnumValue("CHAPSIn")
    CHAPS_IN("CHAPSIn"),
    @XmlEnumValue("CHAPSOutInterBank")
    CHAPS_OUT_INTER_BANK("CHAPSOutInterBank"),
    @XmlEnumValue("CHAPSInterBank")
    CHAPS_INTER_BANK("CHAPSInterBank"),
    @XmlEnumValue("CHAPSOutPost")
    CHAPS_OUT_POST("CHAPSOutPost"),
    @XmlEnumValue("CHAPSOutInterBranch")
    CHAPS_OUT_INTER_BRANCH("CHAPSOutInterBranch"),
    @XmlEnumValue("CHAPSOut")
    CHAPS_OUT("CHAPSOut"),
    @XmlEnumValue("CHAPSOutOnline")
    CHAPS_OUT_ONLINE("CHAPSOutOnline"),
    @XmlEnumValue("CardCardReplacement")
    CARD_CARD_REPLACEMENT("CardCardReplacement"),
    @XmlEnumValue("DraftsCounter")
    DRAFTS_COUNTER("DraftsCounter"),
    @XmlEnumValue("DraftsBankers")
    DRAFTS_BANKERS("DraftsBankers"),
    @XmlEnumValue("DraftsCancellation")
    DRAFTS_CANCELLATION("DraftsCancellation"),
    @XmlEnumValue("CardGuaranteed")
    CARD_GUARANTEED("CardGuaranteed"),
    @XmlEnumValue("DraftsIntlPayableAbroad")
    DRAFTS_INTL_PAYABLE_ABROAD("DraftsIntlPayableAbroad"),
    @XmlEnumValue("DraftsLostStolen")
    DRAFTS_LOST_STOLEN("DraftsLostStolen"),
    @XmlEnumValue("CardPersonalisedCard")
    CARD_PERSONALISED_CARD("CardPersonalisedCard"),
    @XmlEnumValue("DraftsIntlStoppedCancelled")
    DRAFTS_INTL_STOPPED_CANCELLED("DraftsIntlStoppedCancelled"),
    @XmlEnumValue("EmergencyLending")
    EMERGENCY_LENDING("EmergencyLending"),
    @XmlEnumValue("FPSInBranch")
    FPS_IN_BRANCH("FPSInBranch"),
    @XmlEnumValue("LegalCourtOrder")
    LEGAL_COURT_ORDER("LegalCourtOrder"),
    @XmlEnumValue("IntlPayFXPaymentIn")
    INTL_PAY_FX_PAYMENT_IN("IntlPayFXPaymentIn"),
    @XmlEnumValue("IntlPayForeignPaymentInUKAcc")
    INTL_PAY_FOREIGN_PAYMENT_IN_UK_ACC("IntlPayForeignPaymentInUKAcc"),
    @XmlEnumValue("IntlPayForeignCharge")
    INTL_PAY_FOREIGN_CHARGE("IntlPayForeignCharge"),
    @XmlEnumValue("IntlPayForeignInternet")
    INTL_PAY_FOREIGN_INTERNET("IntlPayForeignInternet"),
    @XmlEnumValue("IntlPayFXPaymentOut")
    INTL_PAY_FX_PAYMENT_OUT("IntlPayFXPaymentOut"),
    @XmlEnumValue("IntlPayFXPaymentOutIR")
    INTL_PAY_FX_PAYMENT_OUT_IR("IntlPayFXPaymentOutIR"),
    @XmlEnumValue("IntlPayPurchaseNonSterling")
    INTL_PAY_PURCHASE_NON_STERLING("IntlPayPurchaseNonSterling"),
    @XmlEnumValue("IntlPayPaymentTracing")
    INTL_PAY_PAYMENT_TRACING("IntlPayPaymentTracing"),
    @XmlEnumValue("IntlPayTransNonSterling")
    INTL_PAY_TRANS_NON_STERLING("IntlPayTransNonSterling"),
    @XmlEnumValue("IntlPayTransRateNonSterling")
    INTL_PAY_TRANS_RATE_NON_STERLING("IntlPayTransRateNonSterling"),
    @XmlEnumValue("IntlPayWorldpayPayment")
    INTL_PAY_WORLDPAY_PAYMENT("IntlPayWorldpayPayment"),
    @XmlEnumValue("InvPayBankDetailsWrong")
    INV_PAY_BANK_DETAILS_WRONG("InvPayBankDetailsWrong"),
    @XmlEnumValue("InvPayForeignBCNR")
    INV_PAY_FOREIGN_BCNR("InvPayForeignBCNR"),
    @XmlEnumValue("InvPayForeignRecall")
    INV_PAY_FOREIGN_RECALL("InvPayForeignRecall"),
    @XmlEnumValue("InvPayStandingOrdUnpaid")
    INV_PAY_STANDING_ORD_UNPAID("InvPayStandingOrdUnpaid"),
    @XmlEnumValue("SafeKeepingEnvelope")
    SAFE_KEEPING_ENVELOPE("SafeKeepingEnvelope"),
    @XmlEnumValue("SafeKeepingInspection")
    SAFE_KEEPING_INSPECTION("SafeKeepingInspection"),
    @XmlEnumValue("SafeKeepingLargeItem")
    SAFE_KEEPING_LARGE_ITEM("SafeKeepingLargeItem"),
    @XmlEnumValue("SafeKeepingParcel")
    SAFE_KEEPING_PARCEL("SafeKeepingParcel"),
    @XmlEnumValue("NightSafeNightSafePaidIn")
    NIGHT_SAFE_NIGHT_SAFE_PAID_IN("NightSafeNightSafePaidIn"),
    @XmlEnumValue("OverdraftReview")
    OVERDRAFT_REVIEW("OverdraftReview"),
    @XmlEnumValue("ChqBookTheftLossAllStopped")
    CHQ_BOOK_THEFT_LOSS_ALL_STOPPED("ChqBookTheftLossAllStopped"),
    @XmlEnumValue("ChqCopy")
    CHQ_COPY("ChqCopy"),
    @XmlEnumValue("ChqDraftSterling")
    CHQ_DRAFT_STERLING("ChqDraftSterling"),
    @XmlEnumValue("ChqOutIssued")
    CHQ_OUT_ISSUED("ChqOutIssued"),
    @XmlEnumValue("ChqSpecialChqPresentation")
    CHQ_SPECIAL_CHQ_PRESENTATION("ChqSpecialChqPresentation"),
    @XmlEnumValue("ChqSpecialChqClearance")
    CHQ_SPECIAL_CHQ_CLEARANCE("ChqSpecialChqClearance"),
    @XmlEnumValue("ChqStopped")
    CHQ_STOPPED("ChqStopped"),
    @XmlEnumValue("ChqinCashCentre")
    CHQIN_CASH_CENTRE("ChqinCashCentre"),
    @XmlEnumValue("ChqDraftFX")
    CHQ_DRAFT_FX("ChqDraftFX"),
    @XmlEnumValue("ChqForeignCourier")
    CHQ_FOREIGN_COURIER("ChqForeignCourier"),
    @XmlEnumValue("ChqGiftCheque")
    CHQ_GIFT_CHEQUE("ChqGiftCheque"),
    @XmlEnumValue("ChqForeign")
    CHQ_FOREIGN("ChqForeign"),
    @XmlEnumValue("ChqChequePhotocopy")
    CHQ_CHEQUE_PHOTOCOPY("ChqChequePhotocopy"),
    @XmlEnumValue("ChqChequeRetrieval")
    CHQ_CHEQUE_RETRIEVAL("ChqChequeRetrieval"),
    @XmlEnumValue("ChqSpecialPresentationCount")
    CHQ_SPECIAL_PRESENTATION_COUNT("ChqSpecialPresentationCount"),
    @XmlEnumValue("ChqSpecialPresentationPTT")
    CHQ_SPECIAL_PRESENTATION_PTT("ChqSpecialPresentationPTT"),
    @XmlEnumValue("ChqUnpaidCharge")
    CHQ_UNPAID_CHARGE("ChqUnpaidCharge"),
    @XmlEnumValue("ChqUnpaidTransIn")
    CHQ_UNPAID_TRANS_IN("ChqUnpaidTransIn"),
    @XmlEnumValue("ChqUnpaidTransOut")
    CHQ_UNPAID_TRANS_OUT("ChqUnpaidTransOut"),
    @XmlEnumValue("ChqUnpaidCheque")
    CHQ_UNPAID_CHEQUE("ChqUnpaidCheque"),
    @XmlEnumValue("ReportCertInterestDuplicate")
    REPORT_CERT_INTEREST_DUPLICATE("ReportCertInterestDuplicate"),
    @XmlEnumValue("ReportCertInterest")
    REPORT_CERT_INTEREST("ReportCertInterest"),
    @XmlEnumValue("ReportReference")
    REPORT_REFERENCE("ReportReference"),
    @XmlEnumValue("ReportReferralItem")
    REPORT_REFERRAL_ITEM("ReportReferralItem"),
    @XmlEnumValue("ReportStatementCopyRegular")
    REPORT_STATEMENT_COPY_REGULAR("ReportStatementCopyRegular"),
    @XmlEnumValue("ReportStatusEnquiry")
    REPORT_STATUS_ENQUIRY("ReportStatusEnquiry"),
    @XmlEnumValue("ReportStatementFrequent")
    REPORT_STATEMENT_FREQUENT("ReportStatementFrequent"),
    @XmlEnumValue("ReportStatementCopy1")
    REPORT_STATEMENT_COPY_1("ReportStatementCopy1"),
    @XmlEnumValue("SEPAIn")
    SEPA_IN("SEPAIn"),
    @XmlEnumValue("SEPAEuro")
    SEPA_EURO("SEPAEuro"),
    @XmlEnumValue("SEPAOut")
    SEPA_OUT("SEPAOut"),
    @XmlEnumValue("TransCreditTransferUKDifferent")
    TRANS_CREDIT_TRANSFER_UK_DIFFERENT("TransCreditTransferUKDifferent"),
    @XmlEnumValue("TransCredit")
    TRANS_CREDIT("TransCredit"),
    @XmlEnumValue("TransCreditTransfer")
    TRANS_CREDIT_TRANSFER("TransCreditTransfer"),
    @XmlEnumValue("TransBuyForeignWithGBP")
    TRANS_BUY_FOREIGN_WITH_GBP("TransBuyForeignWithGBP"),
    @XmlEnumValue("TransSWIFTOutUKForeign")
    TRANS_SWIFT_OUT_UK_FOREIGN("TransSWIFTOutUKForeign"),
    @XmlEnumValue("TransPOSSaleForeign")
    TRANS_POS_SALE_FOREIGN("TransPOSSaleForeign"),
    @XmlEnumValue("TransReturnPayment")
    TRANS_RETURN_PAYMENT("TransReturnPayment"),
    @XmlEnumValue("TransTransferExGroup")
    TRANS_TRANSFER_EX_GROUP("TransTransferExGroup"),
    @XmlEnumValue("TransSWIFTOutNonEEASterling")
    TRANS_SWIFT_OUT_NON_EEA_STERLING("TransSWIFTOutNonEEASterling"),
    @XmlEnumValue("AutoAutomatedEntries")
    AUTO_AUTOMATED_ENTRIES("AutoAutomatedEntries"),
    @XmlEnumValue("OnlineReplacementCardReader")
    ONLINE_REPLACEMENT_CARD_READER("OnlineReplacementCardReader"),
    @XmlEnumValue("OnlineUrgentPayment")
    ONLINE_URGENT_PAYMENT("OnlineUrgentPayment"),
    @XmlEnumValue("ForeignChqSent")
    FOREIGN_CHQ_SENT("ForeignChqSent"),
    @XmlEnumValue("ForeignFXInwardsCust")
    FOREIGN_FX_INWARDS_CUST("ForeignFXInwardsCust"),
    @XmlEnumValue("ForeignFXOutwards")
    FOREIGN_FX_OUTWARDS("ForeignFXOutwards"),
    @XmlEnumValue("ForeignPurchase")
    FOREIGN_PURCHASE("ForeignPurchase"),
    @XmlEnumValue("ForeignChqDraft")
    FOREIGN_CHQ_DRAFT("ForeignChqDraft"),
    @XmlEnumValue("ServiceCAccountFee")
    SERVICE_C_ACCOUNT_FEE("ServiceCAccountFee"),
    @XmlEnumValue("ServiceCAccountFeeMonthly")
    SERVICE_C_ACCOUNT_FEE_MONTHLY("ServiceCAccountFeeMonthly"),
    @XmlEnumValue("ServiceCOther")
    SERVICE_C_OTHER("ServiceCOther"),
    @XmlEnumValue("CounterCashOut")
    COUNTER_CASH_OUT("CounterCashOut"),
    @XmlEnumValue("CounterForeignNoteHandling")
    COUNTER_FOREIGN_NOTE_HANDLING("CounterForeignNoteHandling"),
    @XmlEnumValue("CounterForeignCashOut")
    COUNTER_FOREIGN_CASH_OUT("CounterForeignCashOut"),
    @XmlEnumValue("CounterCashFeeRate")
    COUNTER_CASH_FEE_RATE("CounterCashFeeRate"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    FeeType40(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeeType40 fromValue(String v) {
        for (FeeType40 c: FeeType40 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
