
# PersonalCurrentAccountResponsePCAMarketingState

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**coreProduct** | [**CoreProduct2**](CoreProduct2.md) |  |  [optional]
**creditInterest** | [**CreditInterest3**](CreditInterest3.md) |  |  [optional]
**eligibility** | [**Eligibility2**](Eligibility2.md) |  |  [optional]
**featuresAndBenefits** | [**FeaturesAndBenefits2**](FeaturesAndBenefits2.md) |  |  [optional]
**firstMarketedDate** | [**LocalDate**](LocalDate.md) | Marketing state start date |  [optional]
**identification** | **String** | Unique and unambiguous identification of a  Eligibility Marketing state. | 
**lastMarketedDate** | [**LocalDate**](LocalDate.md) | Marketing state end date |  [optional]
**marketingState** | [**MarketingStateEnum**](#MarketingStateEnum) | Describes the marketing state (regular or promotional) for which the eligibility criteria applies | 
**notes** | **List&lt;String&gt;** | Free text for adding details for marketing state |  [optional]
**otherFeesCharges** | [**OtherFeesCharges2**](OtherFeesCharges2.md) |  |  [optional]
**overdraft** | [**Overdraft3**](Overdraft3.md) |  |  [optional]
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



