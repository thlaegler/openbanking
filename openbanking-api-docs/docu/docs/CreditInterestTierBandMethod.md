
# CreditInterestTierBandMethod

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**calculationMethod** | [**CalculationMethodEnum**](#CalculationMethodEnum) | Methods of calculating interest |  [optional]
**destination** | [**DestinationEnum**](#DestinationEnum) | Describes whether accrued interest is payable only to the BCA or to another bank account |  [optional]
**notes** | **List&lt;String&gt;** | Optional additional notes to supplement the Tier Band Set details |  [optional]
**tierBand** | [**TierBand**](TierBand.md) |  |  [optional]


<a name="CalculationMethodEnum"></a>
## Enum: CalculationMethodEnum
Name | Value
---- | -----
COMPOUND | &quot;Compound&quot;
SIMPLEINTEREST | &quot;SimpleInterest&quot;


<a name="DestinationEnum"></a>
## Enum: DestinationEnum
Name | Value
---- | -----
PAYAWAY | &quot;PayAway&quot;
SELFCREDIT | &quot;SelfCredit&quot;



