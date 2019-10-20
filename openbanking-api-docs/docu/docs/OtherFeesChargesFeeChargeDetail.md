
# OtherFeesChargesFeeChargeDetail

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
**includedInPeriodicFeeIndicator** | **Boolean** | Commercial credit cards often have a periodic fee charged (defined in CoreProduct section). Some Fees/charges may be covered by the periodic fee, and you can use the IncludedInPeriodicFeeIndicator to indicate that this is so |  [optional]
**negotiableIndicator** | **Boolean** | Fee/charge which is usually negotiable(YES) rather than a fixed(NO) amount |  [optional]
**notes** | **List&lt;String&gt;** | Optional additional notes to supplement the fee/charge details. |  [optional]
**otherApplicationFrequency** | [**OtherApplicationFrequency**](OtherApplicationFrequency.md) |  |  [optional]
**otherCalculationFrequency** | [**OtherCalculationFrequency**](OtherCalculationFrequency.md) |  |  [optional]
**otherFeeCategory** | [**OtherFeeCategory**](OtherFeeCategory.md) |  |  [optional]
**otherFeeRateType** | [**OtherFeeRateType**](OtherFeeRateType.md) |  |  [optional]
**otherFeeType** | [**OtherFeeType2**](OtherFeeType2.md) |  |  [optional]


<a name="ApplicationFrequencyEnum"></a>
## Enum: ApplicationFrequencyEnum
Name | Value
---- | -----
DAILY | &quot;Daily&quot;
FLEXIBLE | &quot;Flexible&quot;
FORTNIGHTLY | &quot;Fortnightly&quot;
HOLIDAY | &quot;Holiday&quot;
HALFYEARLY | &quot;HalfYearly&quot;
MONTHLY | &quot;Monthly&quot;
OTHER | &quot;Other&quot;
QUARTERLY | &quot;Quarterly&quot;
WEEKLY | &quot;Weekly&quot;
YEARLY | &quot;Yearly&quot;


<a name="CalculationFrequencyEnum"></a>
## Enum: CalculationFrequencyEnum
Name | Value
---- | -----
DAILY | &quot;Daily&quot;
FLEXIBLE | &quot;Flexible&quot;
FORTNIGHTLY | &quot;Fortnightly&quot;
HOLIDAY | &quot;Holiday&quot;
HALFYEARLY | &quot;HalfYearly&quot;
MONTHLY | &quot;Monthly&quot;
OTHER | &quot;Other&quot;
QUARTERLY | &quot;Quarterly&quot;
WEEKLY | &quot;Weekly&quot;
YEARLY | &quot;Yearly&quot;


<a name="FeeCategoryEnum"></a>
## Enum: FeeCategoryEnum
Name | Value
---- | -----
CASHADVANCE | &quot;CashAdvance&quot;
BALANCETRANSFER | &quot;BalanceTransfer&quot;
PURCHASE | &quot;Purchase&quot;
CHEQUE | &quot;Cheque&quot;
CARD | &quot;Card&quot;
FX | &quot;FX&quot;
PENALTY | &quot;Penalty&quot;
SERVICING | &quot;Servicing&quot;
OTHER | &quot;Other&quot;


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
ADDITIONALCARD | &quot;AdditionalCard&quot;
BALANCETRANSFER | &quot;BalanceTransfer&quot;
CASHADVANCE | &quot;CashAdvance&quot;
CARD | &quot;Card&quot;
CHEQUEISSUE | &quot;ChequeIssue&quot;
CASHWITHDRAWAL | &quot;CashWithdrawal&quot;
EMERGENCYCARD | &quot;EmergencyCard&quot;
FOREIGNCASH | &quot;ForeignCash&quot;
HANDLING | &quot;Handling&quot;
MAINTENANCE | &quot;Maintenance&quot;
OTHER | &quot;Other&quot;
PURCHASE | &quot;Purchase&quot;
PENALTY | &quot;Penalty&quot;



