
# CommercialCreditCardResponseCCCMarketingState

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**coreProduct** | [**CoreProduct1**](CoreProduct1.md) |  | 
**eligibility** | [**Eligibility1**](Eligibility1.md) |  | 
**featuresAndBenefits** | [**FeaturesAndBenefits1**](FeaturesAndBenefits1.md) |  | 
**firstMarketedDate** | [**LocalDate**](LocalDate.md) | Marketing state start date |  [optional]
**identification** | **String** | Unique and unambiguous identification of a  CCC Product Marketing State. | 
**lastMarketedDate** | [**LocalDate**](LocalDate.md) | Marketing state end date |  [optional]
**marketingState** | [**MarketingStateEnum**](#MarketingStateEnum) | Describes the marketing state (regular or promotional) of the CCC Product | 
**notes** | **List&lt;String&gt;** | Free text for adding details for marketing state |  [optional]
**otherFeesCharges** | [**OtherFeesCharges**](OtherFeesCharges.md) |  | 
**predecessorID** | **String** | Identifies the marketing state that precedes this marketing state |  [optional]
**repayment** | [**Repayment**](Repayment.md) |  |  [optional]
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
HALF_YEAR | &quot;Half Year&quot;
MONTH | &quot;Month&quot;
QUARTER | &quot;Quarter&quot;
WEEK | &quot;Week&quot;
YEAR | &quot;Year&quot;



