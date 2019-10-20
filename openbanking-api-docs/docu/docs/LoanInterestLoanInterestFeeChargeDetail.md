
# LoanInterestLoanInterestFeeChargeDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**applicationFrequency** | [**ApplicationFrequencyEnum**](#ApplicationFrequencyEnum) | How frequently the fee/charge is applied to the account | 
**calculationFrequency** | [**CalculationFrequencyEnum**](#CalculationFrequencyEnum) | How frequently the fee/charge is calculated | 
**feeAmount** | **String** | Fee Amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate) |  [optional]
**feeRate** | **String** | Rate charged for Fee/Charge (where it is charged in terms of a rate rather than an amount) |  [optional]
**feeRateType** | [**FeeRateTypeEnum**](#FeeRateTypeEnum) | Rate type for Fee/Charge (where it is charged in terms of a rate rather than an amount) |  [optional]
**feeType** | [**FeeTypeEnum**](#FeeTypeEnum) | Fee/Charge Type | 
**negotiableIndicator** | **Boolean** | Fee/charge which is usually negotiable rather than a fixed amount. Indicates if the Fee/charge is negotiable (Y) or Fixed (N) |  [optional]
**notes** | **List&lt;String&gt;** | Optional additional notes to supplement the fee/charge details. |  [optional]
**otherApplicationFrequency** | [**OtherApplicationFrequency**](OtherApplicationFrequency.md) |  |  [optional]
**otherCalculationFrequency** | [**OtherCalculationFrequency**](OtherCalculationFrequency.md) |  |  [optional]
**otherFeeRateType** | [**OtherFeeRateType2**](OtherFeeRateType2.md) |  |  [optional]
**otherFeeType** | [**OtherFeeType6**](OtherFeeType6.md) |  |  [optional]


<a name="ApplicationFrequencyEnum"></a>
## Enum: ApplicationFrequencyEnum
Name | Value
---- | -----
ONCLOSING | &quot;OnClosing&quot;
ONOPENING | &quot;OnOpening&quot;
CHARGINGPERIOD | &quot;ChargingPeriod&quot;
DAILY | &quot;Daily&quot;
HOLIDAY | &quot;Holiday&quot;
PERITEM | &quot;PerItem&quot;
MONTHLY | &quot;Monthly&quot;
ONANNIVERSARY | &quot;OnAnniversary&quot;
OTHER | &quot;Other&quot;
PERHUNDREDPOUNDS | &quot;PerHundredPounds&quot;
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
ONCLOSING | &quot;OnClosing&quot;
ONOPENING | &quot;OnOpening&quot;
CHARGINGPERIOD | &quot;ChargingPeriod&quot;
DAILY | &quot;Daily&quot;
HOLIDAY | &quot;Holiday&quot;
PERITEM | &quot;PerItem&quot;
MONTHLY | &quot;Monthly&quot;
ONANNIVERSARY | &quot;OnAnniversary&quot;
OTHER | &quot;Other&quot;
PERHUNDREDPOUNDS | &quot;PerHundredPounds&quot;
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


<a name="FeeRateTypeEnum"></a>
## Enum: FeeRateTypeEnum
Name | Value
---- | -----
BOEBASERATE | &quot;BOEBaseRate&quot;
FIXEDRATE | &quot;FixedRate&quot;
GROSS | &quot;Gross&quot;
LOANPROVIDERBASERATE | &quot;LoanProviderBaseRate&quot;
NET | &quot;Net&quot;
OTHER | &quot;Other&quot;


<a name="FeeTypeEnum"></a>
## Enum: FeeTypeEnum
Name | Value
---- | -----
APPLICATION | &quot;Application&quot;
ARRANGEMENT | &quot;Arrangement&quot;
FEECHARGECAP | &quot;FeeChargeCap&quot;
CREDITREFERENCE | &quot;CreditReference&quot;
EARLYREPAYMENT | &quot;EarlyRepayment&quot;
LATEPAYMENT | &quot;LatePayment&quot;
MISSEDPAYMENTFEE | &quot;MissedPaymentFee&quot;
MONTHLY | &quot;Monthly&quot;
MISSEDPAYMENTRATE | &quot;MissedPaymentRate&quot;
OTHERPAYMENTFEE | &quot;OtherPaymentFee&quot;
OTHER | &quot;Other&quot;
PREPAYMENTFEE | &quot;PrepaymentFee&quot;
OTHERPAYMENTRATE | &quot;OtherPaymentRate&quot;
RESTATEMENT | &quot;ReStatement&quot;
STATEMENT | &quot;Statement&quot;
SETUP | &quot;SetUp&quot;



