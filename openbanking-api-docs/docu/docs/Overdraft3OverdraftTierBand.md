
# Overdraft3OverdraftTierBand

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankGuaranteedIndicator** | **Boolean** | Indicates that a bank provides the overdraft limit up to TierValueMIn to all customers automatically |  [optional]
**EAR** | **String** | EAR means Effective Annual Rate and/or Equivalent Annual Rate (frequently used interchangeably), being the actual annual interest rate of an Overdraft. |  [optional]
**identification** | **String** | Unique and unambiguous identification of a  Tier Band for a overdraft. |  [optional]
**notes** | **List&lt;String&gt;** | Optional additional notes to supplement the Tier/band details |  [optional]
**overdraftFeesCharges** | [**List&lt;Overdraft3OverdraftFeesCharges1&gt;**](Overdraft3OverdraftFeesCharges1.md) | Overdraft fees and charges |  [optional]
**overdraftInterestChargingCoverage** | [**OverdraftInterestChargingCoverageEnum**](#OverdraftInterestChargingCoverageEnum) | Interest charged on whole amount or tiered/banded |  [optional]
**tierValueMax** | **String** | Maximum value of Overdraft Tier/Band |  [optional]
**tierValueMin** | **String** | Minimum value of Overdraft Tier/Band | 


<a name="OverdraftInterestChargingCoverageEnum"></a>
## Enum: OverdraftInterestChargingCoverageEnum
Name | Value
---- | -----
TIERED | &quot;Tiered&quot;
WHOLE | &quot;Whole&quot;



