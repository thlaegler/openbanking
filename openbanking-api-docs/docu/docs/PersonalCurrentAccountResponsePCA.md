
# PersonalCurrentAccountResponsePCA

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identification** | **String** | The unique ID that has been internally assigned by the financial institution to each of the current account banking products they market to their retail and/or small to medium enterprise (SME) customers. | 
**name** | **String** | The name of the PCA product used for marketing purposes from a customer perspective. I.e. what the customer would recognise. | 
**notes** | **List&lt;String&gt;** | Optional additional notes to supplement the product details |  [optional]
**onSaleIndicator** | **Boolean** | Indicates that the published product is OnSale(value 1) or Back Book (value 0) |  [optional]
**otherSegment** | [**List&lt;OtherFeeCategory&gt;**](OtherFeeCategory.md) |  |  [optional]
**pcAMarketingState** | [**List&lt;PersonalCurrentAccountResponsePCAMarketingState&gt;**](PersonalCurrentAccountResponsePCAMarketingState.md) | Describes the type of the known state (regular, promotional )  of the product. | 
**segment** | [**List&lt;SegmentEnum&gt;**](#List&lt;SegmentEnum&gt;) | Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another.  Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd  Follow us: Investopedia on Facebook  With respect to PCA products, they are segmented in relation to different markets that they wish to focus on. For example, Basic PCA products target consumers with poor credit history, Reward PCA products target consumers who spend a lot, and Premium products target High Net Worth individuals. |  [optional]


<a name="List<SegmentEnum>"></a>
## Enum: List&lt;SegmentEnum&gt;
Name | Value
---- | -----
BASIC | &quot;Basic&quot;
BENEFITANDREWARD | &quot;BenefitAndReward&quot;
CREDITINTEREST | &quot;CreditInterest&quot;
CASHBACK | &quot;Cashback&quot;
GENERAL | &quot;General&quot;
GRADUATE | &quot;Graduate&quot;
OTHER | &quot;Other&quot;
OVERDRAFT | &quot;Overdraft&quot;
PACKAGED | &quot;Packaged&quot;
PREMIUM | &quot;Premium&quot;
REWARD | &quot;Reward&quot;
STUDENT | &quot;Student&quot;
YOUNGADULT | &quot;YoungAdult&quot;
YOUTH | &quot;Youth&quot;



