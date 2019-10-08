
# SoftwareStatementSchema

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **Boolean** | Software Statement active/inactive flag |  [optional]
**clientId** | **String** | Software Statement client Id |  [optional]
**clientName** | **String** | Software Statement client name |  [optional]
**clientUri** | **String** | The Software Statement client RFC-3986-compliant URI |  [optional]
**description** | **String** | Software Statement description |  [optional]
**id** | **String** | Software Statement Id |  [optional]
**logoUri** | **String** | The Software Statement logo RFC-3986-compliant URI |  [optional]
**mode** | [**ModeEnum**](#ModeEnum) | Software Statement mode |  [optional]
**obClientCreated** | **Boolean** | Client created flag |  [optional]
**onBehalfOfObOrganisation** | **String** | A reference to fourth party organisation resource on the OB Directory if the registering TPP is acting on behalf of another |  [optional]
**policyUri** | **String** | The Software Statement policy RFC-3986-compliant URI |  [optional]
**redirectUri** | **List&lt;String&gt;** | The Software Statement redirect RFC-3986-compliant URI |  [optional]
**roles** | **List&lt;String&gt;** | The list of Software Statement roles |  [optional]
**signingKeyIds** | **List&lt;String&gt;** | The list of signing certificate Ids |  [optional]
**termsOfServiceUri** | **String** | The Software Statement terms of service RFC-3986-compliant URI |  [optional]
**transportKeyIds** | **List&lt;String&gt;** | The list of transport certificate Ids |  [optional]
**version** | [**BigDecimal**](BigDecimal.md) | Software Statement version as provided by the organisation&#39;s PTC |  [optional]


<a name="ModeEnum"></a>
## Enum: ModeEnum
Name | Value
---- | -----
LIVE | &quot;Live&quot;
NOTLIVE | &quot;NotLive&quot;



