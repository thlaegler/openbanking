
# LoanInterestLoanInterestFeeChargeCap

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cappingPeriod** | [**CappingPeriodEnum**](#CappingPeriodEnum) | Period e.g. day, week, month etc. for which the fee/charge is capped |  [optional]
**feeCapAmount** | **String** | Cap amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate) |  [optional]
**feeCapOccurrence** | **Float** | fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount |  [optional]
**feeType** | [**List&lt;FeeTypeEnum&gt;**](#List&lt;FeeTypeEnum&gt;) | Fee/charge type which is being capped | 
**minMaxType** | [**MinMaxTypeEnum**](#MinMaxTypeEnum) | Min Max type | 
**notes** | **List&lt;String&gt;** | Free text for adding  extra details for fee charge cap |  [optional]
**otherFeeType** | [**List&lt;BranchCurrentAccountResponseOtherFeeType&gt;**](BranchCurrentAccountResponseOtherFeeType.md) | Other fee type code which is not available in the standard code set |  [optional]


<a name="CappingPeriodEnum"></a>
## Enum: CappingPeriodEnum
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


<a name="List<FeeTypeEnum>"></a>
## Enum: List&lt;FeeTypeEnum&gt;
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


<a name="MinMaxTypeEnum"></a>
## Enum: MinMaxTypeEnum
Name | Value
---- | -----
MINIMUM | &quot;Minimum&quot;
MAXIMUM | &quot;Maximum&quot;



