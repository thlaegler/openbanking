
# FeaturesAndBenefits2FeatureBenefitGroup

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**applicationFrequency** | [**ApplicationFrequencyEnum**](#ApplicationFrequencyEnum) | How often is the charge for the feature/benefit group applied to the customer account |  [optional]
**benefitGroupNominalValue** | **String** | BenefitGroupNominalValue is  to allow banks to state what they feel their benefit package is worth |  [optional]
**calculationFrequency** | [**CalculationFrequencyEnum**](#CalculationFrequencyEnum) | How often is the charge for the feature/benefit group calculated for the customer account |  [optional]
**featureBenefitEligibility** | [**List&lt;FeaturesAndBenefits2FeatureBenefitEligibility&gt;**](FeaturesAndBenefits2FeatureBenefitEligibility.md) | Feature and Benefit eligibility |  [optional]
**featureBenefitItem** | [**List&lt;FeaturesAndBenefits2FeatureBenefitItem&gt;**](FeaturesAndBenefits2FeatureBenefitItem.md) | Detailed features or benefits which may or may not be a part of a feature/benefit group/pack |  [optional]
**fee** | **String** | Fee that is charged to the customer for a pack of features/benefits |  [optional]
**name** | **String** | Feature/Benefit Name | 
**notes** | **List&lt;String&gt;** | Optional additional notes to supplement the Feature Benefit Group details |  [optional]
**otherApplicationFrequency** | [**OtherApplicationFrequency**](OtherApplicationFrequency.md) |  |  [optional]
**otherCalculationFrequency** | [**OtherCalculationFrequency**](OtherCalculationFrequency.md) |  |  [optional]
**otherType** | [**OtherType2**](OtherType2.md) |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Common types of features &amp; benefits |  [optional]


<a name="ApplicationFrequencyEnum"></a>
## Enum: ApplicationFrequencyEnum
Name | Value
---- | -----
PERACADEMICTERM | &quot;PerAcademicTerm&quot;
DAILY | &quot;Daily&quot;
HALFYEARLY | &quot;HalfYearly&quot;
MONTHLY | &quot;Monthly&quot;
OTHER | &quot;Other&quot;
QUARTERLY | &quot;Quarterly&quot;
PERSTATEMENTDATE | &quot;PerStatementDate&quot;
WEEKLY | &quot;Weekly&quot;
YEARLY | &quot;Yearly&quot;


<a name="CalculationFrequencyEnum"></a>
## Enum: CalculationFrequencyEnum
Name | Value
---- | -----
PERACADEMICTERM | &quot;PerAcademicTerm&quot;
DAILY | &quot;Daily&quot;
HALFYEARLY | &quot;HalfYearly&quot;
MONTHLY | &quot;Monthly&quot;
OTHER | &quot;Other&quot;
QUARTERLY | &quot;Quarterly&quot;
PERSTATEMENTDATE | &quot;PerStatementDate&quot;
WEEKLY | &quot;Weekly&quot;
YEARLY | &quot;Yearly&quot;


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



