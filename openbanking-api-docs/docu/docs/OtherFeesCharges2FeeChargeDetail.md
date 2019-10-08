
# OtherFeesCharges2FeeChargeDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**applicationFrequency** | [**ApplicationFrequencyEnum**](#ApplicationFrequencyEnum) | How frequently the fee/charge is applied to the account | 
**calculationFrequency** | [**CalculationFrequencyEnum**](#CalculationFrequencyEnum) | How frequently the fee/charge is calculated | 
**feeAmount** | **String** | Fee Amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate) |  [optional]
**feeApplicableRange** | [**FeeApplicableRange**](FeeApplicableRange.md) |  |  [optional]
**feeCategory** | [**FeeCategoryEnum**](#FeeCategoryEnum) | Categorisation of fees and charges into standard categories. | 
**feeRate** | **String** | Rate charged for Fee/Charge (where it is charged in terms of a rate rather than an amount) |  [optional]
**feeRateType** | [**FeeRateTypeEnum**](#FeeRateTypeEnum) | Rate type for Fee/Charge (where it is charged in terms of a rate rather than an amount) |  [optional]
**feeType** | [**FeeTypeEnum**](#FeeTypeEnum) | Fee/Charge Type | 
**notes** | **List&lt;String&gt;** | Optional additional notes to supplement the fee/charge details. |  [optional]
**otherApplicationFrequency** | [**OtherApplicationFrequency**](OtherApplicationFrequency.md) |  |  [optional]
**otherCalculationFrequency** | [**OtherCalculationFrequency**](OtherCalculationFrequency.md) |  |  [optional]
**otherFeeCategory** | [**OtherFeeCategory**](OtherFeeCategory.md) |  |  [optional]
**otherFeeRateType** | [**OtherFeeRateType**](OtherFeeRateType.md) |  |  [optional]
**otherFeeType** | [**OtherFeeType5**](OtherFeeType5.md) |  |  [optional]


<a name="ApplicationFrequencyEnum"></a>
## Enum: ApplicationFrequencyEnum
Name | Value
---- | -----
ACCOUNTCLOSING | &quot;AccountClosing&quot;
ACCOUNTOPENING | &quot;AccountOpening&quot;
ACADEMICTERM | &quot;AcademicTerm&quot;
CHARGINGPERIOD | &quot;ChargingPeriod&quot;
DAILY | &quot;Daily&quot;
PERITEM | &quot;PerItem&quot;
MONTHLY | &quot;Monthly&quot;
ONACCOUNTANNIVERSARY | &quot;OnAccountAnniversary&quot;
OTHER | &quot;Other&quot;
PERHOUR | &quot;PerHour&quot;
PEROCCURRENCE | &quot;PerOccurrence&quot;
PERSHEET | &quot;PerSheet&quot;
PERTRANSACTION | &quot;PerTransaction&quot;
PERTRANSACTIONAMOUNT | &quot;PerTransactionAmount&quot;
PERTRANSACTIONPERCENTAGE | &quot;PerTransactionPercentage&quot;
QUARTERLY | &quot;Quarterly&quot;
SIXMONTHLY | &quot;SixMonthly&quot;
STATEMENTMONTHLY | &quot;StatementMonthly&quot;
WEEKLY | &quot;Weekly&quot;
YEARLY | &quot;Yearly&quot;


<a name="CalculationFrequencyEnum"></a>
## Enum: CalculationFrequencyEnum
Name | Value
---- | -----
ACCOUNTCLOSING | &quot;AccountClosing&quot;
ACCOUNTOPENING | &quot;AccountOpening&quot;
ACADEMICTERM | &quot;AcademicTerm&quot;
CHARGINGPERIOD | &quot;ChargingPeriod&quot;
DAILY | &quot;Daily&quot;
PERITEM | &quot;PerItem&quot;
MONTHLY | &quot;Monthly&quot;
ONACCOUNTANNIVERSARY | &quot;OnAccountAnniversary&quot;
OTHER | &quot;Other&quot;
PERHOUR | &quot;PerHour&quot;
PEROCCURRENCE | &quot;PerOccurrence&quot;
PERSHEET | &quot;PerSheet&quot;
PERTRANSACTION | &quot;PerTransaction&quot;
PERTRANSACTIONAMOUNT | &quot;PerTransactionAmount&quot;
PERTRANSACTIONPERCENTAGE | &quot;PerTransactionPercentage&quot;
QUARTERLY | &quot;Quarterly&quot;
SIXMONTHLY | &quot;SixMonthly&quot;
STATEMENTMONTHLY | &quot;StatementMonthly&quot;
WEEKLY | &quot;Weekly&quot;
YEARLY | &quot;Yearly&quot;


<a name="FeeCategoryEnum"></a>
## Enum: FeeCategoryEnum
Name | Value
---- | -----
AUTO | &quot;AUTO&quot;
ATM | &quot;ATM&quot;
BANKERSDRAFTS | &quot;BankersDrafts&quot;
CASHCENTRE | &quot;CashCentre&quot;
CARD | &quot;Card&quot;
CHEQUE | &quot;Cheque&quot;
COUNTERSERVICES | &quot;CounterServices&quot;
FOREIGN | &quot;Foreign&quot;
FX | &quot;FX&quot;
INTERNATIONAL | &quot;International&quot;
INVESTIGATION | &quot;Investigation&quot;
LEGAL | &quot;Legal&quot;
NIGHTSAFE | &quot;NightSafe&quot;
ONLINE | &quot;Online&quot;
OTHER | &quot;Other&quot;
PAYMENTSCHEME | &quot;PaymentScheme&quot;
REPORT | &quot;Report&quot;
SAFEKEEPING | &quot;Safekeeping&quot;
SERVICING | &quot;Servicing&quot;
TRANSACTION | &quot;Transaction&quot;


<a name="FeeRateTypeEnum"></a>
## Enum: FeeRateTypeEnum
Name | Value
---- | -----
LINKEDBASERATE | &quot;LinkedBaseRate&quot;
GROSS | &quot;Gross&quot;
NET | &quot;Net&quot;
OTHER | &quot;Other&quot;


<a name="FeeTypeEnum"></a>
## Enum: FeeTypeEnum
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



