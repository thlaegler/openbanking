
# CoreProduct1

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**APR** | **String** | Annual Percentage Rate (APR) is a measure that attempts to calculate what percentage of the principal youâ€™ll pay per period (in this case a year), taking every charge â€“ monthly payments over the course of the loan, upfront fees, etc. â€“ into account. For commercial credit cards, this APR is the representative APR which includes any account fees. | 
**cardScheme** | [**List&lt;CardSchemeEnum&gt;**](#List&lt;CardSchemeEnum&gt;) | Operator of Card Scheme | 
**contactlessIndicator** | **Boolean** | Indicates whether the card can be used with a contactless terminal | 
**maxCreditLimit** | **String** | The maximum amount of credit that the bank will offer against the card account and is normally â€œsubject to statusâ€ |  [optional]
**maxDailyCardWithdrawalLimit** | **String** | The maximum amount of money that you can withdraw per day (so long as you do not exceed your available credit limit) |  [optional]
**maxPurchaseInterestFreeLengthDays** | **Integer** | The maximum number of days that you have between making a purchase via the credit card and having to repay the balance without incurring interest charges |  [optional]
**minCreditLimit** | **String** | The minimum amount of credit that the bank will offer against the card account |  [optional]
**notes** | **List&lt;String&gt;** | Free text for adding details for core product. |  [optional]
**otherCardScheme** | [**List&lt;CoreProduct1OtherCardScheme&gt;**](CoreProduct1OtherCardScheme.md) | Other card scheme which is not available in the standard code list |  [optional]
**periodicFee** | **String** | Charge made on a periodic basis for the card account e.g. Annual Fee |  [optional]
**periodicFeePeriod** | [**PeriodicFeePeriodEnum**](#PeriodicFeePeriodEnum) | The unit of period (days, weeks, months etc.) of the Periodic Fee |  [optional]
**productDescription** | **String** | The description of the CCC product used for marketing purposes from a customer perspective. I.e. what the customer would recognise. |  [optional]
**productURL** | **String** | URL provided by the organisation which redirects to the product (on live products only) available on an external website. There might be more than one product at a given URL. | 
**salesAccessChannels** | [**List&lt;SalesAccessChannelsEnum&gt;**](#List&lt;SalesAccessChannelsEnum&gt;) | Channels via which a customer can open a CCC. | 
**servicingAccessChannels** | [**List&lt;ServicingAccessChannelsEnum&gt;**](#List&lt;ServicingAccessChannelsEnum&gt;) | Channels via which customers can access CCC services. | 
**tcsAndCsURL** | **String** | URL provided by the financial institution which redirects to the CCC T&amp;Cs on an external website | 


<a name="List<CardSchemeEnum>"></a>
## Enum: List&lt;CardSchemeEnum&gt;
Name | Value
---- | -----
MASTERCARD | &quot;Mastercard&quot;
OTHER | &quot;Other&quot;
VISA | &quot;Visa&quot;


<a name="PeriodicFeePeriodEnum"></a>
## Enum: PeriodicFeePeriodEnum
Name | Value
---- | -----
DAY | &quot;Day&quot;
HALF_YEAR | &quot;Half Year&quot;
MONTH | &quot;Month&quot;
QUARTER | &quot;Quarter&quot;
WEEK | &quot;Week&quot;
YEAR | &quot;Year&quot;


<a name="List<SalesAccessChannelsEnum>"></a>
## Enum: List&lt;SalesAccessChannelsEnum&gt;
Name | Value
---- | -----
BRANCH | &quot;Branch&quot;
CALLCENTRE | &quot;CallCentre&quot;
POST | &quot;Post&quot;
ONLINE | &quot;Online&quot;
RELATIONSHIPMANAGER | &quot;RelationshipManager&quot;


<a name="List<ServicingAccessChannelsEnum>"></a>
## Enum: List&lt;ServicingAccessChannelsEnum&gt;
Name | Value
---- | -----
ATM | &quot;ATM&quot;
BRANCH | &quot;Branch&quot;
CALLCENTRE | &quot;CallCentre&quot;
POST | &quot;Post&quot;
MOBILEBANKINGAPP | &quot;MobileBankingApp&quot;
ONLINE | &quot;Online&quot;
POSTOFFICE | &quot;PostOffice&quot;
RELATIONSHIPMANAGER | &quot;RelationshipManager&quot;
TEXT | &quot;Text&quot;



