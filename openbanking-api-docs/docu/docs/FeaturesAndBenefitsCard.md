
# FeaturesAndBenefitsCard

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contactlessIndicator** | **Boolean** | Indicates if the card can be used for contactless payments or not. | 
**maxDailyCardWithdrawalLimit** | **String** | Maximum daily cash withdrawallimit on the card. |  [optional]
**notes** | **List&lt;String&gt;** | Optional additional notes to supplement the Card details |  [optional]
**otherScheme** | [**List&lt;FeaturesAndBenefitsOtherScheme&gt;**](FeaturesAndBenefitsOtherScheme.md) | Operator of a card scheme which is not available in the standard scheme code list |  [optional]
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
BUSINESSQUICKLODGECARD | &quot;BusinessQuickLodgeCard&quot;
CASHCARD | &quot;CashCard&quot;
DEBITCARD | &quot;DebitCard&quot;
DEPOSITCARD | &quot;DepositCard&quot;
OTHER | &quot;Other&quot;



