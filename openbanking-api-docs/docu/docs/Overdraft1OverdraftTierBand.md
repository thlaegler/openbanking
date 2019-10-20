
# Overdraft1OverdraftTierBand

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**agreementLengthMax** | **Float** | Specifies the maximum length of a band for a fixed overdraft agreement |  [optional]
**agreementLengthMin** | **Float** | Specifies the minimum length of a band for a fixed overdraft agreement |  [optional]
**agreementPeriod** | [**AgreementPeriodEnum**](#AgreementPeriodEnum) | Specifies the period of a fixed length overdraft agreement |  [optional]
**bankGuaranteedIndicator** | **Boolean** | Indicates whether the advertised overdraft rate is guaranteed to be offered to a borrower by the bank e.g. if it’s part of a government scheme, or whether the rate may vary dependent on the applicant’s circumstances. |  [optional]
**EAR** | **String** | EAR means Effective Annual Rate and/or Equivalent Annual Rate (frequently used interchangeably), being the actual annual interest rate of an Overdraft. |  [optional]
**identification** | **String** | Unique and unambiguous identification of a  Tier Band for a overdraft. |  [optional]
**notes** | **List&lt;String&gt;** | Optional additional notes to supplement the Tier/band details |  [optional]
**overdraftFeesCharges** | [**List&lt;Overdraft1OverdraftFeesCharges1&gt;**](Overdraft1OverdraftFeesCharges1.md) | Overdraft fees and charges |  [optional]
**overdraftInterestChargingCoverage** | [**OverdraftInterestChargingCoverageEnum**](#OverdraftInterestChargingCoverageEnum) | Refers to which interest rate is applied when interests are tiered. For example, if an overdraft balance is £2k and the interest tiers are:- 0-£500 0.1%, 500-1000 0.2%, 1000-10000 0.5%, then the applicable interest rate could either be 0.5% of the entire balance (since the account balance sits in the top interest tier) or (0.1%*500)+(0.2%*500)+(0.5%*1000). In the 1st situation, we say the interest is applied to the ‘Whole’ of the account balance,  and in the 2nd that it is ‘Tiered’. |  [optional]
**tierValueMax** | **String** | Maximum value of Overdraft Tier/Band |  [optional]
**tierValueMin** | **String** | Minimum value of Overdraft Tier/Band | 


<a name="AgreementPeriodEnum"></a>
## Enum: AgreementPeriodEnum
Name | Value
---- | -----
DAY | &quot;Day&quot;
HALF_YEAR | &quot;Half Year&quot;
MONTH | &quot;Month&quot;
QUARTER | &quot;Quarter&quot;
WEEK | &quot;Week&quot;
YEAR | &quot;Year&quot;


<a name="OverdraftInterestChargingCoverageEnum"></a>
## Enum: OverdraftInterestChargingCoverageEnum
Name | Value
---- | -----
BANDED | &quot;Banded&quot;
TIERED | &quot;Tiered&quot;
WHOLE | &quot;Whole&quot;



