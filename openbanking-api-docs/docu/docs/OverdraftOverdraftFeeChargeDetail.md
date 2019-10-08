
# OverdraftOverdraftFeeChargeDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**applicationFrequency** | [**ApplicationFrequencyEnum**](#ApplicationFrequencyEnum) | Frequency at which the overdraft charge is applied to the account | 
**calculationFrequency** | [**CalculationFrequencyEnum**](#CalculationFrequencyEnum) | How often is the overdraft fee/charge calculated for the account. | 
**feeAmount** | **String** | Amount charged for an overdraft fee/charge (where it is charged in terms of an amount rather than a rate) |  [optional]
**feeRate** | **String** | Rate charged for overdraft fee/charge (where it is charged in terms of a rate rather than an amount) |  [optional]
**feeRateType** | [**FeeRateTypeEnum**](#FeeRateTypeEnum) | Rate type for overdraft fee/charge (where it is charged in terms of a rate rather than an amount) |  [optional]
**feeType** | [**FeeTypeEnum**](#FeeTypeEnum) | Overdraft fee type | 
**incrementalBorrowingAmount** | **String** | Every additional tranche of an overdraft balance to which an overdraft fee is applied |  [optional]
**negotiableIndicator** | **Boolean** | Indicates whether fee and charges are negotiable |  [optional]
**notes** | **List&lt;String&gt;** | Free text for capturing any other info related to Overdraft Fees Charge Details |  [optional]
**otherApplicationFrequency** | [**OtherApplicationFrequency**](OtherApplicationFrequency.md) |  |  [optional]
**otherCalculationFrequency** | [**OtherCalculationFrequency**](OtherCalculationFrequency.md) |  |  [optional]
**otherFeeRateType** | [**OtherFeeRateType1**](OtherFeeRateType1.md) |  |  [optional]
**otherFeeType** | [**OtherFeeType1**](OtherFeeType1.md) |  |  [optional]
**overdraftControlIndicator** | **Boolean** | Indicates if the fee/charge is already covered by an Overdraft Control fee or not. |  [optional]
**overdraftFeeChargeCap** | [**OverdraftOverdraftFeeChargeCap**](OverdraftOverdraftFeeChargeCap.md) |  |  [optional]


<a name="ApplicationFrequencyEnum"></a>
## Enum: ApplicationFrequencyEnum
Name | Value
---- | -----
ONCLOSING | &quot;OnClosing&quot;
ONOPENING | &quot;OnOpening&quot;
CHARGINGPERIOD | &quot;ChargingPeriod&quot;
DAILY | &quot;Daily&quot;
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
GROSS | &quot;Gross&quot;
OTHER | &quot;Other&quot;


<a name="FeeTypeEnum"></a>
## Enum: FeeTypeEnum
Name | Value
---- | -----
ARRANGEDOVERDRAFT | &quot;ArrangedOverdraft&quot;
ANNUALREVIEW | &quot;AnnualReview&quot;
EMERGENCYBORROWING | &quot;EmergencyBorrowing&quot;
BORROWINGITEM | &quot;BorrowingItem&quot;
OVERDRAFTRENEWAL | &quot;OverdraftRenewal&quot;
OVERDRAFTSETUP | &quot;OverdraftSetup&quot;
SURCHARGE | &quot;Surcharge&quot;
TEMPOVERDRAFT | &quot;TempOverdraft&quot;
UNAUTHORISEDBORROWING | &quot;UnauthorisedBorrowing&quot;
UNAUTHORISEDPAIDTRANS | &quot;UnauthorisedPaidTrans&quot;
OTHER | &quot;Other&quot;
UNAUTHORISEDUNPAIDTRANS | &quot;UnauthorisedUnpaidTrans&quot;



