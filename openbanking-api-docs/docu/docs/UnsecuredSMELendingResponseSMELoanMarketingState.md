
# UnsecuredSMELendingResponseSMELoanMarketingState

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**coreProduct** | [**CoreProduct3**](CoreProduct3.md) |  | 
**eligibility** | [**Eligibility3**](Eligibility3.md) |  | 
**featuresAndBenefits** | [**FeaturesAndBenefits3**](FeaturesAndBenefits3.md) |  | 
**firstMarketedDate** | [**LocalDate**](LocalDate.md) | Marketing state start date |  [optional]
**identification** | **String** | Unique and unambiguous identification of a  SME Loan Product Marketing State. | 
**lastMarketedDate** | [**LocalDate**](LocalDate.md) | Marketing state end date |  [optional]
**loanInterest** | [**LoanInterest**](LoanInterest.md) |  | 
**marketingState** | [**MarketingStateEnum**](#MarketingStateEnum) | Describes the marketing state (regular or promotional) of the SME Loan Product | 
**notes** | **List&lt;String&gt;** | Free text for adding details for marketing state |  [optional]
**otherFeesCharges** | [**OtherFeesCharges3**](OtherFeesCharges3.md) |  |  [optional]
**predecessorID** | **String** | Identifies the marketing state that precedes this marketing state |  [optional]
**repayment** | [**List&lt;UnsecuredSMELendingResponseRepayment&gt;**](UnsecuredSMELendingResponseRepayment.md) | Repayment details of the Loan product | 
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



