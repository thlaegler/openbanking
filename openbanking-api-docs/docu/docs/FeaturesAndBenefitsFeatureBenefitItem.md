
# FeaturesAndBenefitsFeatureBenefitItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **String** | Amount associated to the feature/benefit where applicable e.g. 200 Pounds worth of travel insurance |  [optional]
**featureBenefitEligibility** | [**List&lt;FeaturesAndBenefitsFeatureBenefitEligibility&gt;**](FeaturesAndBenefitsFeatureBenefitEligibility.md) | Feature and Benefit eligibility |  [optional]
**identification** | **String** | Unique and unambiguous identification of a  Feature and Benefit Item. |  [optional]
**indicator** | **Boolean** | True/False indicator for a particular feature/benefit e.g. Interest Free Overdraft? Yes or No |  [optional]
**name** | **String** | Name which can be attached to the feature/benefit |  [optional]
**notes** | **List&lt;String&gt;** | Optional additional notes to supplement the feature/benefit item. Only used for very specific conditions |  [optional]
**otherType** | [**OtherType2**](OtherType2.md) |  |  [optional]
**textual** | **String** | Provides textual information about a feature/benefit e.g. 10% off cinema tickets on Tuesday nights |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Feature and Benefit type | 


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
ACCOUNTMANAGEMENT | &quot;AccountManagement&quot;
ACCOUNTOPENINGORSWITCHINGINCENTIVE | &quot;AccountOpeningOrSwitchingIncentive&quot;
CASHBACK | &quot;Cashback&quot;
INTERNATIONALPAYMENTSSUPPORT | &quot;InternationalPaymentsSupport&quot;
OTHER | &quot;Other&quot;
PREFERENTIALRATES | &quot;PreferentialRates&quot;
RELATIONSHIPMANAGER | &quot;RelationshipManager&quot;
REWARDS | &quot;Rewards&quot;
SECURECASH | &quot;SecureCash&quot;



