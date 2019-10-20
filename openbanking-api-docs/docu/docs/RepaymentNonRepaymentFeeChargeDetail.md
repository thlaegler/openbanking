
# RepaymentNonRepaymentFeeChargeDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**applicationFrequency** | [**ApplicationFrequencyEnum**](#ApplicationFrequencyEnum) | How frequently the fee/charge is applied to the account | 
**calculationFrequency** | [**CalculationFrequencyEnum**](#CalculationFrequencyEnum) | How frequently the fee/charge is calculated | 
**feeAmount** | **String** | Fee Amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate) |  [optional]
**feeRate** | **String** | Rate charged for Fee/Charge (where it is charged in terms of a rate rather than an amount) |  [optional]
**feeRateType** | [**FeeRateTypeEnum**](#FeeRateTypeEnum) | Rate type for Fee/Charge (where it is charged in terms of a rate rather than an amount) |  [optional]
**feeType** | [**FeeTypeEnum**](#FeeTypeEnum) | Non repayment fee type code | 
**negotiableIndicator** | **Boolean** | Fee/charge which is usually negotiable rather than a fixed amount. Indicates if the Fee/charge is negotiable (Y) or Fixed (N) |  [optional]
**notes** | **List&lt;String&gt;** | Optional additional notes to supplement the fee/charge details. |  [optional]
**otherApplicationFrequency** | [**OtherApplicationFrequency**](OtherApplicationFrequency.md) |  |  [optional]
**otherCalculationFrequency** | [**OtherCalculationFrequency**](OtherCalculationFrequency.md) |  |  [optional]
**otherFeeRateType** | [**OtherFeeRateType**](OtherFeeRateType.md) |  |  [optional]
**otherFeeType** | [**OtherFeeType3**](OtherFeeType3.md) |  |  [optional]


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
LATEPAYMENT | &quot;LatePayment&quot;
OVERCREDITLIMIT | &quot;OverCreditLimit&quot;
OTHER | &quot;Other&quot;
RETURNPAYMENT | &quot;ReturnPayment&quot;



