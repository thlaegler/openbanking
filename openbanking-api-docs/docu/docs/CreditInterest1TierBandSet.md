
# CreditInterest1TierBandSet

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**calculationMethod** | [**CalculationMethodEnum**](#CalculationMethodEnum) | Methods of calculating interest |  [optional]
**destination** | [**DestinationEnum**](#DestinationEnum) | Describes whether accrued interest is payable only to the BCA or to another bank account | 
**notes** | **List&lt;String&gt;** | Optional additional notes to supplement the Tier Band Set details |  [optional]
**tierBand** | [**List&lt;CreditInterest1TierBand&gt;**](CreditInterest1TierBand.md) | Tier Band Details | 
**tierBandMethod** | [**TierBandMethodEnum**](#TierBandMethodEnum) | The methodology of how credit interest is paid/applied. It can be:-  1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases.  2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance.  3. Whole The same interest rate is applied irrespective of the BCA balance | 


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


<a name="TierBandMethodEnum"></a>
## Enum: TierBandMethodEnum
Name | Value
---- | -----
BANDED | &quot;Banded&quot;
TIERED | &quot;Tiered&quot;
WHOLE | &quot;Whole&quot;



