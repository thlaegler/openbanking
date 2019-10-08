
# CoreProduct2

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**monthlyMaximumCharge** | **String** | The maximum relevant charges that could accrue as defined fully in Part 7 of the CMA order |  [optional]
**productDescription** | **String** | The description of the PCA product used for marketing purposes from a customer perspective. |  [optional]
**productURL** | **String** | URL provided by the organisation which redirects to the product (on live products only) available on an external website. There might be more than one product at a given URL. |  [optional]
**salesAccessChannels** | [**List&lt;SalesAccessChannelsEnum&gt;**](#List&lt;SalesAccessChannelsEnum&gt;) | Channels through which a customer can open an account. |  [optional]
**servicingAccessChannels** | [**List&lt;ServicingAccessChannelsEnum&gt;**](#List&lt;ServicingAccessChannelsEnum&gt;) | Methods by which a customer can access the services associated to the PCA product |  [optional]
**tcsAndCsURL** | **String** | URL provided by the financial institution which redirects to the PCA T&amp;Cs on an external website |  [optional]


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



