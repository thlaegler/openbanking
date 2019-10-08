
# FeaturesAndBenefits2FeatureBenefitItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **String** | Amount associated to the feature/benefit where applicable e.g. 200 Pounds worth of travel insurance |  [optional]
**featureBenefitEligibility** | [**List&lt;FeaturesAndBenefits2FeatureBenefitEligibility&gt;**](FeaturesAndBenefits2FeatureBenefitEligibility.md) | Feature and Benefit eligibility |  [optional]
**identification** | **String** | Unique and unambiguous identification of a  Feature and Benefit Item. |  [optional]
**indicator** | **Boolean** | True/False indicator for a particular feature/benefit e.g. Interest Free Overdraft? |  [optional]
**name** | **String** | Name which can be attached to the feature/benefit |  [optional]
**notes** | **List&lt;String&gt;** | Optional additional notes to supplement the feature/benefit item. Only used for very specific conditions |  [optional]
**otherType** | [**OtherType2**](OtherType2.md) |  |  [optional]
**textual** | **String** | Provides textual information about a feature/benefit e.g. 10% off cinema tickets on Tuesday nights |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Common types of features &amp; benefits | 


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
ACCOUNTMANAGEMENT | &quot;AccountManagement&quot;
ACCOUNTOPENINGORSWITCHINGINCENTIVE | &quot;AccountOpeningOrSwitchingIncentive&quot;
CASHBACK | &quot;Cashback&quot;
ENTERTAINMENT | &quot;Entertainment&quot;
HOMEINSURANCE | &quot;HomeInsurance&quot;
HOMEPROTECTION | &quot;HomeProtection&quot;
INTERNATIONALPAYMENTSUPPORT | &quot;InternationalPaymentSupport&quot;
LIFESTYLE | &quot;Lifestyle&quot;
MOTORBREAKDOWN | &quot;MotorBreakdown&quot;
OVERDRAFTCONTROL | &quot;OverdraftControl&quot;
OTHER | &quot;Other&quot;
PREMIUMSERVICE | &quot;PremiumService&quot;
PREFERENTIALRATES | &quot;PreferentialRates&quot;
PASSIVESAVING | &quot;PassiveSaving&quot;
RELATIONSHIPMANAGER | &quot;RelationshipManager&quot;
REWARDS | &quot;Rewards&quot;
TECHNOLOGYINSURANCE | &quot;TechnologyInsurance&quot;
TRAVELINSURANCE | &quot;TravelInsurance&quot;
TRAVEL | &quot;Travel&quot;



