
# FeaturesAndBenefits2Card

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contactlessIndicator** | **Boolean** | Indicates if the card can be used for contactless payments(Yes) or not(No). | 
**maxDailyCardWithdrawalLimit** | **String** | Maximum daily cash withdrawal limit on the card. |  [optional]
**notes** | **List&lt;String&gt;** | Optional additional notes to supplement the Card details |  [optional]
**otherScheme** | [**FeaturesAndBenefitsOtherScheme**](FeaturesAndBenefitsOtherScheme.md) |  |  [optional]
**otherType** | [**OtherType1**](OtherType1.md) |  |  [optional]
**scheme** | [**List&lt;SchemeEnum&gt;**](#List&lt;SchemeEnum&gt;) | Operator of Card Scheme e.g. Visa | 
**type** | [**TypeEnum**](#TypeEnum) | Card Type available e.g. Debit | 


<a name="List<SchemeEnum>"></a>
## Enum: List&lt;SchemeEnum&gt;
Name | Value
---- | -----
MASTERCARD | &quot;MasterCard&quot;
OTHER | &quot;Other&quot;
VISA | &quot;Visa&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
CASHCARD | &quot;CashCard&quot;
DEBITCARD | &quot;DebitCard&quot;
OTHER | &quot;Other&quot;
POCACARD | &quot;POCACard&quot;
PREPAIDDEBITCARD | &quot;PrepaidDebitCard&quot;



