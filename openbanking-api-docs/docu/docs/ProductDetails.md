
# ProductDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feeFreeLength** | **Float** | The length/duration of the fee free period |  [optional]
**feeFreeLengthPeriod** | [**FeeFreeLengthPeriodEnum**](#FeeFreeLengthPeriodEnum) | The unit of period (days, weeks, months etc.) of the promotional length |  [optional]
**notes** | **List&lt;String&gt;** | Optional additional notes to supplement the Core product details |  [optional]
**segment** | [**List&lt;SegmentEnum&gt;**](#List&lt;SegmentEnum&gt;) | Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another.  Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd  With respect to BCA products, they are segmented in relation to different markets that they wish to focus on.  |  [optional]


<a name="FeeFreeLengthPeriodEnum"></a>
## Enum: FeeFreeLengthPeriodEnum
Name | Value
---- | -----
DAY | &quot;Day&quot;
HALF_YEAR | &quot;Half Year&quot;
MONTH | &quot;Month&quot;
QUARTER | &quot;Quarter&quot;
WEEK | &quot;Week&quot;
YEAR | &quot;Year&quot;


<a name="List<SegmentEnum>"></a>
## Enum: List&lt;SegmentEnum&gt;
Name | Value
---- | -----
CLIENTACCOUNT | &quot;ClientAccount&quot;
STANDARD | &quot;Standard&quot;
NONCOMMERCIALCHAITIESCLBSOC | &quot;NonCommercialChaitiesClbSoc&quot;
NONCOMMERCIALPUBLICAUTHGOVT | &quot;NonCommercialPublicAuthGovt&quot;
RELIGIOUS | &quot;Religious&quot;
SECTORSPECIFIC | &quot;SectorSpecific&quot;
STARTUP | &quot;Startup&quot;
SWITCHER | &quot;Switcher&quot;



