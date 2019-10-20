
# CoreProduct

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**monthlyCharge** | **String** | Any fees which can be included in a MonthlyCharge. A new field IncludedInMonthlyChargeIndicator in OtherFeeCharges section indicates whether the fees can be grouped in MonthlyCharge. |  [optional]
**notes** | **List&lt;String&gt;** | Optional additional notes to supplement the Core product details |  [optional]
**productDescription** | **String** | The description of the BCA product used for marketing purposes from a customer perspective. |  [optional]
**productURL** | **String** | URL provided by the organisation which redirects to the product (on live products only) available on an external website. There might be more than one product at a given URL. |  [optional]
**salesAccessChannels** | [**List&lt;SalesAccessChannelsEnum&gt;**](#List&lt;SalesAccessChannelsEnum&gt;) | Channels via which a customer can open a BCA. |  [optional]
**servicingAccessChannels** | [**List&lt;ServicingAccessChannelsEnum&gt;**](#List&lt;ServicingAccessChannelsEnum&gt;) | Channels via which customers can access BCA services. |  [optional]
**tcsAndCsURL** | **String** | URL provided by the financial institution which redirects to the BCA T&amp;Cs on an external website |  [optional]


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



