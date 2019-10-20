
# BranchCurrentAccountResponseBCAMarketingState

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**coreProduct** | [**CoreProduct**](CoreProduct.md) |  |  [optional]
**creditInterest** | [**CreditInterest**](CreditInterest.md) |  |  [optional]
**eligibility** | [**Eligibility**](Eligibility.md) |  |  [optional]
**featuresAndBenefits** | [**FeaturesAndBenefits**](FeaturesAndBenefits.md) |  |  [optional]
**firstMarketedDate** | [**LocalDate**](LocalDate.md) | Marketing state start date |  [optional]
**identification** | **String** | Unique and unambiguous identification of a  BCA Product Marketing State. | 
**lastMarketedDate** | [**LocalDate**](LocalDate.md) | Marketing state end date |  [optional]
**marketingState** | [**MarketingStateEnum**](#MarketingStateEnum) | Describes the marketing state (regular or promotional) of the BCA Product | 
**notes** | **List&lt;String&gt;** | Free text for adding details for marketing state |  [optional]
**otherFeesCharges** | [**List&lt;BranchCurrentAccountResponseOtherFeesCharges&gt;**](BranchCurrentAccountResponseOtherFeesCharges.md) | Contains details of fees and charges which are not associated with either Overdraft or features/benefits |  [optional]
**overdraft** | [**Overdraft**](Overdraft.md) |  |  [optional]
**predecessorID** | **String** | Identifies the marketing state that precedes this marketing state |  [optional]
**stateTenureLength** | **Float** | The length/duration of a promotional state |  [optional]
**stateTenurePeriod** | [**StateTenurePeriodEnum**](#StateTenurePeriodEnum) | The unit of period (days, weeks, months etc.) of the promotional length |  [optional]


<a name="MarketingStateEnum"></a>
## Enum: MarketingStateEnum
Name | Value
---- | -----
PROMOTIONAL | &quot;Promotional&quot;
REGULAR | &quot;Regular&quot;


<a name="StateTenurePeriodEnum"></a>
## Enum: StateTenurePeriodEnum
Name | Value
---- | -----
DAY | &quot;Day&quot;
HALFYEAR | &quot;HalfYear&quot;
MONTH | &quot;Month&quot;
QUARTER | &quot;Quarter&quot;
WEEK | &quot;Week&quot;
ACADEMICTERM | &quot;AcademicTerm&quot;
YEAR | &quot;Year&quot;



