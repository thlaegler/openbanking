
# OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**agreementLengthMax** | **Integer** | Specifies the maximum length of a band for a fixed overdraft agreement |  [optional]
**agreementLengthMin** | **Integer** | Specifies the minimum length of a band for a fixed overdraft agreement |  [optional]
**agreementPeriod** | [**AgreementPeriodEnum**](#AgreementPeriodEnum) | Specifies the period of a fixed length overdraft agreement |  [optional]
**bankGuaranteedIndicator** | **Boolean** | Indicates whether the advertised overdraft rate is guaranteed to be offered to a borrower by the bank e.g. if its part of a government scheme, or whether the rate may vary dependent on the applicants circumstances. |  [optional]
**EAR** | **String** | EAR means Effective Annual Rate and/or Equivalent Annual Rate (frequently used interchangeably), being the actual annual interest rate of an Overdraft. |  [optional]
**identification** | **String** | Unique and unambiguous identification of a  Tier Band for a overdraft. |  [optional]
**notes** | **List&lt;String&gt;** |  |  [optional]
**overdraftFeesCharges** | [**List&lt;OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges1&gt;**](OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges1.md) |  |  [optional]
**overdraftInterestChargingCoverage** | [**OverdraftInterestChargingCoverageEnum**](#OverdraftInterestChargingCoverageEnum) | Refers to which interest rate is applied when interests are tiered. For example, if an overdraft balance is 2k and the interest tiers are:- 0-500 0.1%, 500-1000 0.2%, 1000-10000 0.5%, then the applicable interest rate could either be 0.5% of the entire balance (since the account balance sits in the top interest tier) or (0.1%*500)+(0.2%*500)+(0.5%*1000). In the 1st situation, we say the interest is applied to the Whole of the account balance,  and in the 2nd that it is Tiered. |  [optional]
**tierValueMax** | **String** | Maximum value of Overdraft Tier/Band |  [optional]
**tierValueMin** | **String** | Minimum value of Overdraft Tier/Band | 


<a name="AgreementPeriodEnum"></a>
## Enum: AgreementPeriodEnum
Name | Value
---- | -----
PACT | &quot;PACT&quot;
PDAY | &quot;PDAY&quot;
PHYR | &quot;PHYR&quot;
PMTH | &quot;PMTH&quot;
PQTR | &quot;PQTR&quot;
PWEK | &quot;PWEK&quot;
PYER | &quot;PYER&quot;


<a name="OverdraftInterestChargingCoverageEnum"></a>
## Enum: OverdraftInterestChargingCoverageEnum
Name | Value
---- | -----
INBA | &quot;INBA&quot;
INTI | &quot;INTI&quot;
INWH | &quot;INWH&quot;



