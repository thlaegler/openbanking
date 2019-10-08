
# UnsecuredSMELendingResponseSMELoan

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identification** | **String** | The unique ID that has been internally assigned by the financial institution to each of the current account banking products they market to their retail and/or small to medium enterprise (SME) customers. | 
**name** | **String** | The name of the SME Loan product used for marketing purposes from a customer perspective. I.e. what the customer would recognise. | 
**otherSegment** | [**List&lt;UnsecuredSMELendingResponseOtherSegment&gt;**](UnsecuredSMELendingResponseOtherSegment.md) | Other segment code which is not available in the standard code set |  [optional]
**smELoanMarketingState** | [**List&lt;UnsecuredSMELendingResponseSMELoanMarketingState&gt;**](UnsecuredSMELendingResponseSMELoanMarketingState.md) | The marketing state (promotional or regular) of the SME Loan Product. | 
**segment** | [**List&lt;SegmentEnum&gt;**](#List&lt;SegmentEnum&gt;) | Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another.  Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd  Follow us: Investopedia on Facebook  With respect to SME Loan products, they are segmented in relation to different markets that they wish to focus on. | 


<a name="List<SegmentEnum>"></a>
## Enum: List&lt;SegmentEnum&gt;
Name | Value
---- | -----
AGRICULTURESECTOR | &quot;AgricultureSector&quot;
BUSINESS | &quot;Business&quot;
FLEXIBLEBUSINESSLOAN | &quot;FlexibleBusinessLoan&quot;
FIXEDGROUP | &quot;FixedGroup&quot;
GOVERNMENTSCHEME | &quot;GovernmentScheme&quot;
OTHER | &quot;Other&quot;
SECTORSPECIFIC | &quot;SectorSpecific&quot;



