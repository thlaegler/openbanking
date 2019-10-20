
# OtherFeesCharges1FeeChargeDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**applicationFrequency** | [**ApplicationFrequencyEnum**](#ApplicationFrequencyEnum) | How frequently the fee/charge is applied to the account | 
**calculationFrequency** | [**CalculationFrequencyEnum**](#CalculationFrequencyEnum) | How frequently the fee/charge is calculated |  [optional]
**feeAmount** | **String** | Fee Amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate) |  [optional]
**feeApplicableRange** | [**FeeApplicableRange**](FeeApplicableRange.md) |  |  [optional]
**feeCategory** | [**FeeCategoryEnum**](#FeeCategoryEnum) | Categorisation of fees and charges into standard categories. | 
**feeChargeCap** | [**List&lt;OtherFeesCharges1FeeChargeCap&gt;**](OtherFeesCharges1FeeChargeCap.md) | Details about any caps (maximum charges) that apply to a particular fee/charge |  [optional]
**feeRate** | **String** | Rate charged for Fee/Charge (where it is charged in terms of a rate rather than an amount) |  [optional]
**feeRateType** | [**FeeRateTypeEnum**](#FeeRateTypeEnum) | Rate type for Fee/Charge (where it is charged in terms of a rate rather than an amount) |  [optional]
**feeType** | [**FeeTypeEnum**](#FeeTypeEnum) | Fee/Charge Type | 
**notes** | **List&lt;String&gt;** | Optional additional notes to supplement the fee/charge details. |  [optional]
**otherApplicationFrequency** | [**OtherApplicationFrequency2**](OtherApplicationFrequency2.md) |  |  [optional]
**otherCalculationFrequency** | [**OtherCalculationFrequency2**](OtherCalculationFrequency2.md) |  |  [optional]
**otherFeeCategoryType** | [**OtherFeeCategory**](OtherFeeCategory.md) |  |  [optional]
**otherFeeRateType** | [**OtherFeeRateType**](OtherFeeRateType.md) |  |  [optional]
**otherFeeType** | [**OtherFeeType4**](OtherFeeType4.md) |  |  [optional]


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
OTHER | &quot;Other&quot;
SERVICING | &quot;Servicing&quot;


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
SERVICECACCOUNTFEE | &quot;ServiceCAccountFee&quot;
SERVICECACCOUNTFEEMONTHLY | &quot;ServiceCAccountFeeMonthly&quot;
SERVICECOTHER | &quot;ServiceCOther&quot;
OTHER | &quot;Other&quot;



