
# OBReadProduct2DataOtherProductTypeCreditInterestTierBandSet

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**calculationMethod** | [**OBInterestCalculationMethod1Code**](OBInterestCalculationMethod1Code.md) |  |  [optional]
**destination** | [**DestinationEnum**](#DestinationEnum) | Describes whether accrued interest is payable only to the BCA or to another bank account | 
**notes** | **List&lt;String&gt;** |  |  [optional]
**otherCalculationMethod** | [**OBOtherCodeType10**](OBOtherCodeType10.md) |  |  [optional]
**otherDestination** | [**OBOtherCodeType10**](OBOtherCodeType10.md) |  |  [optional]
**tierBand** | [**List&lt;OBReadProduct2DataOtherProductTypeCreditInterestTierBand&gt;**](OBReadProduct2DataOtherProductTypeCreditInterestTierBand.md) |  | 
**tierBandMethod** | [**TierBandMethodEnum**](#TierBandMethodEnum) | The methodology of how credit interest is paid/applied. It can be:- 1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases. 2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance. 3. Whole The same interest rate is applied irrespective of the product holder&#39;s account balance | 


<a name="DestinationEnum"></a>
## Enum: DestinationEnum
Name | Value
---- | -----
INOT | &quot;INOT&quot;
INPA | &quot;INPA&quot;
INSC | &quot;INSC&quot;


<a name="TierBandMethodEnum"></a>
## Enum: TierBandMethodEnum
Name | Value
---- | -----
INBA | &quot;INBA&quot;
INTI | &quot;INTI&quot;
INWH | &quot;INWH&quot;



