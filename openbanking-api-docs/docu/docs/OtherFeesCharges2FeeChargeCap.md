
# OtherFeesCharges2FeeChargeCap

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cappingPeriod** | [**CappingPeriodEnum**](#CappingPeriodEnum) | Period e.g. day, week, month etc. for which the fee/charge is capped |  [optional]
**feeCapAmount** | **String** | Cap amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate) |  [optional]
**feeCapOccurrence** | **Float** | fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount |  [optional]
**feeType** | [**List&lt;FeeTypeEnum&gt;**](#List&lt;FeeTypeEnum&gt;) | Fee/charge type which is being capped | 
**minMaxType** | [**MinMaxTypeEnum**](#MinMaxTypeEnum) | Indicates that this is the minimum/ maximum fee/charge that can be applied by the financial institution | 
**notes** | **List&lt;String&gt;** | Free text for adding  extra details for fee charge cap |  [optional]
**otherFeeType** | [**List&lt;BranchCurrentAccountResponseOtherFeeType&gt;**](BranchCurrentAccountResponseOtherFeeType.md) | Other fee type code which is not available in the standard code set |  [optional]


<a name="CappingPeriodEnum"></a>
## Enum: CappingPeriodEnum
Name | Value
---- | -----
DAY | &quot;Day&quot;
HALFYEAR | &quot;HalfYear&quot;
MONTH | &quot;Month&quot;
QUARTER | &quot;Quarter&quot;
WEEK | &quot;Week&quot;
ACADEMICTERM | &quot;AcademicTerm&quot;
YEAR | &quot;Year&quot;


<a name="List<FeeTypeEnum>"></a>
## Enum: List&lt;FeeTypeEnum&gt;
Name | Value
---- | -----
CASHCENTRECOINHANDLING | &quot;CashCentreCoinHandling&quot;
CASHCENTRECASHX | &quot;CashCentreCashX&quot;
CASHCENTRECASHFEEPERCENT | &quot;CashCentreCashFeePercent&quot;
CASHCENTRECASHFEERATE | &quot;CashCentreCashFeeRate&quot;
CASHCENTRENOTESLODGED | &quot;CashCentreNotesLodged&quot;
CASHCENTRENOTESOUT | &quot;CashCentreNotesOut&quot;
CASHCENTRECASHIN | &quot;CashCentreCashIn&quot;
CASHCENTRECASHOUT | &quot;CashCentreCashOut&quot;
REPORTCERTBALANCE | &quot;ReportCertBalance&quot;
ATMABROADCONVISADEBIT | &quot;ATMAbroadConVisaDebit&quot;
ATMCONGROUPATM | &quot;ATMConGroupATM&quot;
ATMABROAD | &quot;ATMAbroad&quot;
ATMFOREIGNCASHDEBCARD | &quot;ATMForeignCashDebCard&quot;
ATMABROADGOLDVISADEBIT | &quot;ATMAbroadGoldVisaDebit&quot;
ATMNONSTERLINGWITHDRAWAL | &quot;ATMNonSterlingWithdrawal&quot;
ATMABROADVISADEBIT | &quot;ATMAbroadVisaDebit&quot;
CHAPSOUTBRANCH | &quot;CHAPSOutBranch&quot;
CHAPSCANCELLATION | &quot;CHAPSCancellation&quot;
CHAPSIN | &quot;CHAPSIn&quot;
CHAPSOUTINTERBANK | &quot;CHAPSOutInterBank&quot;
CHAPSINTERBANK | &quot;CHAPSInterBank&quot;
CHAPSOUTPOST | &quot;CHAPSOutPost&quot;
CHAPSOUTINTERBRANCH | &quot;CHAPSOutInterBranch&quot;
CHAPSOUT | &quot;CHAPSOut&quot;
CHAPSOUTONLINE | &quot;CHAPSOutOnline&quot;
CARDCARDREPLACEMENT | &quot;CardCardReplacement&quot;
DRAFTSCOUNTER | &quot;DraftsCounter&quot;
DRAFTSBANKERS | &quot;DraftsBankers&quot;
DRAFTSCANCELLATION | &quot;DraftsCancellation&quot;
CARDGUARANTEED | &quot;CardGuaranteed&quot;
DRAFTSINTLPAYABLEABROAD | &quot;DraftsIntlPayableAbroad&quot;
DRAFTSLOSTSTOLEN | &quot;DraftsLostStolen&quot;
CARDPERSONALISEDCARD | &quot;CardPersonalisedCard&quot;
DRAFTSINTLSTOPPEDCANCELLED | &quot;DraftsIntlStoppedCancelled&quot;
EMERGENCYLENDING | &quot;EmergencyLending&quot;
FPSINBRANCH | &quot;FPSInBranch&quot;
LEGALCOURTORDER | &quot;LegalCourtOrder&quot;
INTLPAYFXPAYMENTIN | &quot;IntlPayFXPaymentIn&quot;
INTLPAYFOREIGNPAYMENTINUKACC | &quot;IntlPayForeignPaymentInUKAcc&quot;
INTLPAYFOREIGNCHARGE | &quot;IntlPayForeignCharge&quot;
INTLPAYFOREIGNINTERNET | &quot;IntlPayForeignInternet&quot;
INTLPAYFXPAYMENTOUT | &quot;IntlPayFXPaymentOut&quot;
INTLPAYFXPAYMENTOUTIR | &quot;IntlPayFXPaymentOutIR&quot;
INTLPAYPURCHASENONSTERLING | &quot;IntlPayPurchaseNonSterling&quot;
INTLPAYPAYMENTTRACING | &quot;IntlPayPaymentTracing&quot;
INTLPAYTRANSNONSTERLING | &quot;IntlPayTransNonSterling&quot;
INTLPAYTRANSRATENONSTERLING | &quot;IntlPayTransRateNonSterling&quot;
INTLPAYWORLDPAYPAYMENT | &quot;IntlPayWorldpayPayment&quot;
INVPAYBANKDETAILSWRONG | &quot;InvPayBankDetailsWrong&quot;
INVPAYFOREIGNBCNR | &quot;InvPayForeignBCNR&quot;
INVPAYFOREIGNRECALL | &quot;InvPayForeignRecall&quot;
INVPAYSTANDINGORDUNPAID | &quot;InvPayStandingOrdUnpaid&quot;
SAFEKEEPINGENVELOPE | &quot;SafeKeepingEnvelope&quot;
SAFEKEEPINGINSPECTION | &quot;SafeKeepingInspection&quot;
SAFEKEEPINGLARGEITEM | &quot;SafeKeepingLargeItem&quot;
SAFEKEEPINGPARCEL | &quot;SafeKeepingParcel&quot;
NIGHTSAFENIGHTSAFEPAIDIN | &quot;NightSafeNightSafePaidIn&quot;
OVERDRAFTREVIEW | &quot;OverdraftReview&quot;
CHQBOOKTHEFTLOSSALLSTOPPED | &quot;ChqBookTheftLossAllStopped&quot;
CHQCOPY | &quot;ChqCopy&quot;
CHQDRAFTSTERLING | &quot;ChqDraftSterling&quot;
CHQOUTISSUED | &quot;ChqOutIssued&quot;
CHQSPECIALCHQPRESENTATION | &quot;ChqSpecialChqPresentation&quot;
CHQSPECIALCHQCLEARANCE | &quot;ChqSpecialChqClearance&quot;
CHQSTOPPED | &quot;ChqStopped&quot;
CHQINCASHCENTRE | &quot;ChqinCashCentre&quot;
CHQDRAFTFX | &quot;ChqDraftFX&quot;
CHQFOREIGNCOURIER | &quot;ChqForeignCourier&quot;
CHQGIFTCHEQUE | &quot;ChqGiftCheque&quot;
CHQFOREIGN | &quot;ChqForeign&quot;
CHQCHEQUEPHOTOCOPY | &quot;ChqChequePhotocopy&quot;
CHQCHEQUERETRIEVAL | &quot;ChqChequeRetrieval&quot;
CHQSPECIALPRESENTATIONCOUNT | &quot;ChqSpecialPresentationCount&quot;
CHQSPECIALPRESENTATIONPTT | &quot;ChqSpecialPresentationPTT&quot;
CHQUNPAIDCHARGE | &quot;ChqUnpaidCharge&quot;
CHQUNPAIDTRANSIN | &quot;ChqUnpaidTransIn&quot;
CHQUNPAIDTRANSOUT | &quot;ChqUnpaidTransOut&quot;
CHQUNPAIDCHEQUE | &quot;ChqUnpaidCheque&quot;
REPORTCERTINTERESTDUPLICATE | &quot;ReportCertInterestDuplicate&quot;
REPORTCERTINTEREST | &quot;ReportCertInterest&quot;
REPORTREFERENCE | &quot;ReportReference&quot;
REPORTREFERRALITEM | &quot;ReportReferralItem&quot;
REPORTSTATEMENTCOPYREGULAR | &quot;ReportStatementCopyRegular&quot;
REPORTSTATUSENQUIRY | &quot;ReportStatusEnquiry&quot;
REPORTSTATEMENTFREQUENT | &quot;ReportStatementFrequent&quot;
REPORTSTATEMENTCOPY1 | &quot;ReportStatementCopy1&quot;
SEPAIN | &quot;SEPAIn&quot;
SEPAEURO | &quot;SEPAEuro&quot;
SEPAOUT | &quot;SEPAOut&quot;
TRANSCREDITTRANSFERUKDIFFERENT | &quot;TransCreditTransferUKDifferent&quot;
TRANSCREDIT | &quot;TransCredit&quot;
TRANSCREDITTRANSFER | &quot;TransCreditTransfer&quot;
TRANSBUYFOREIGNWITHGBP | &quot;TransBuyForeignWithGBP&quot;
TRANSSWIFTOUTUKFOREIGN | &quot;TransSWIFTOutUKForeign&quot;
TRANSPOSSALEFOREIGN | &quot;TransPOSSaleForeign&quot;
TRANSRETURNPAYMENT | &quot;TransReturnPayment&quot;
TRANSTRANSFEREXGROUP | &quot;TransTransferExGroup&quot;
TRANSSWIFTOUTNONEEASTERLING | &quot;TransSWIFTOutNonEEASterling&quot;
AUTOAUTOMATEDENTRIES | &quot;AutoAutomatedEntries&quot;
ONLINEREPLACEMENTCARDREADER | &quot;OnlineReplacementCardReader&quot;
ONLINEURGENTPAYMENT | &quot;OnlineUrgentPayment&quot;
FOREIGNCHQSENT | &quot;ForeignChqSent&quot;
FOREIGNFXINWARDSCUST | &quot;ForeignFXInwardsCust&quot;
FOREIGNFXOUTWARDS | &quot;ForeignFXOutwards&quot;
FOREIGNPURCHASE | &quot;ForeignPurchase&quot;
FOREIGNCHQDRAFT | &quot;ForeignChqDraft&quot;
SERVICECACCOUNTFEE | &quot;ServiceCAccountFee&quot;
SERVICECACCOUNTFEEMONTHLY | &quot;ServiceCAccountFeeMonthly&quot;
SERVICECOTHER | &quot;ServiceCOther&quot;
COUNTERCASHOUT | &quot;CounterCashOut&quot;
COUNTERFOREIGNNOTEHANDLING | &quot;CounterForeignNoteHandling&quot;
COUNTERFOREIGNCASHOUT | &quot;CounterForeignCashOut&quot;
COUNTERCASHFEERATE | &quot;CounterCashFeeRate&quot;
OTHER | &quot;Other&quot;


<a name="MinMaxTypeEnum"></a>
## Enum: MinMaxTypeEnum
Name | Value
---- | -----
MINIMUM | &quot;Minimum&quot;
MAXIMUM | &quot;Maximum&quot;



