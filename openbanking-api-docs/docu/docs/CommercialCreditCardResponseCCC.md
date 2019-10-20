
# CommercialCreditCardResponseCCC

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ccCMarketingState** | [**List&lt;CommercialCreditCardResponseCCCMarketingState&gt;**](CommercialCreditCardResponseCCCMarketingState.md) | The marketing state (promotional or regular) of the CCC Product. | 
**identification** | **String** | The unique ID that has been internally assigned by the financial institution to each of the Commercial Credit Card products they market to their retail and/or small to medium enterprise (SME) customers. | 
**name** | **String** | The name of the CCC product used for marketing purposes from a customer perspective. I.e. what the customer would recognise. | 
**otherSegment** | [**List&lt;OtherFeeCategory&gt;**](OtherFeeCategory.md) |  |  [optional]
**segment** | [**List&lt;SegmentEnum&gt;**](#List&lt;SegmentEnum&gt;) | Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another. Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd Follow us: Investopedia on Facebook With respect to CCC products, they are segmented in relation to different markets that they wish to focus on. | 


<a name="List<SegmentEnum>"></a>
## Enum: List&lt;SegmentEnum&gt;
Name | Value
---- | -----
GENERAL | &quot;General&quot;
OTHER | &quot;Other&quot;


