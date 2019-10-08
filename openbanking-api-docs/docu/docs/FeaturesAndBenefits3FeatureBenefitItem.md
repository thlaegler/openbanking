
# FeaturesAndBenefits3FeatureBenefitItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **String** | Amount associated to the feature/benefit where applicable e.g. 200 Pounds worth of travel insurance |  [optional]
**featureBenefitEligibility** | [**List&lt;FeaturesAndBenefits3FeatureBenefitEligibility&gt;**](FeaturesAndBenefits3FeatureBenefitEligibility.md) | Feature and Benefit eligibility |  [optional]
**identification** | **String** | Unique and unambiguous identification of a  Feature and Benefit Item. |  [optional]
**indicator** | **Boolean** | True/False indicator for a particular feature/benefit e.g. Interest Free Period Yes or No |  [optional]
**name** | **String** | Name which can be attached to the feature/benefit |  [optional]
**notes** | **List&lt;String&gt;** | Optional additional notes to supplement the feature/benefit item. Only used for very specific conditions |  [optional]
**otherType** | [**OtherType2**](OtherType2.md) |  |  [optional]
**textual** | **String** | Provides textual information about a feature/benefit e.g. 10% off cinema tickets on Tuesday nights |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Feature and Benefit type | 


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
EARLYSETTLEMENT | &quot;EarlySettlement&quot;
FLEXIBLEREPAYMENT | &quot;FlexibleRepayment&quot;
OVERPAYMENT | &quot;OverPayment&quot;
OTHER | &quot;Other&quot;
PAYMENTHOLIDAYS | &quot;PaymentHolidays&quot;
REPAYMENTHOLIDAY | &quot;RepaymentHoliday&quot;



