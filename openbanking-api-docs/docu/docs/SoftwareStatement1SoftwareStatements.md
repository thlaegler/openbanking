
# SoftwareStatement1SoftwareStatements

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **Boolean** | Flag to show if software statement is active |  [optional]
**clientId** | **String** | Requested Client Id - note that OB will issue a set of credentials with this clientid for this given piece of software. ASPSPs are not obliged to honour this requested clientid |  [optional]
**clientName** | **String** | Human readable client name. May be localised. |  [optional]
**clientUri** | **String** | The “home page” or other wise recognisable url of the application (oath client) Version 22, 14th November 2017. V39 Changed to required |  [optional]
**description** | **String** | Description of the unique instance of this piece of software. If only one instance of a piece of software is to be registered then this should be the same as the SoftwareDescription \\nV39 Changed to required |  [optional]
**id** | **String** | Unique Scheme Wide Software id |  [optional]
**logoUri** | **String** | The software logo Version 22, 14th November 2017. V39 Changed to required |  [optional]
**mode** | **String** | A flag to identify if a piece of software should have access to production PSU accounts. This field has been added at the request of an ASPSP to allow BETA or Non Production testing against production platforms. The default for this system should be &#39;Live&#39; |  [optional]
**obClientCreated** | **Boolean** | An indicator to show if the client has been created in Open Banking |  [optional]
**onBehalfOfObOrganisation** | **String** | The organisation on whom this software statement is behalf of Altered from reference to string, 10/11/2017 |  [optional]
**policyUri** | **String** | An optional document containing a link to a Policy document governing the privacy information policy of for the application. Purely to be displayed a PSU at a ASPSP if the ASPSP supports it. Optional for the TPP to provide. V39 Changed to required |  [optional]
**redirectUri** | **List&lt;String&gt;** | Redirect Uri&#39;s for the registered piece of software. May be overridden by the RFC7591 payload. Changed in v27. V39 Changed to required |  [optional]
**roles** | **List&lt;String&gt;** | Roles for which this software statement can be used. Changed to required Mike Ekers request |  [optional]
**signingKeyIds** | **List&lt;String&gt;** | KeyIds of Keys  used for signing messages |  [optional]
**termsOfServiceUri** | **String** | An optional document containing a link to a Terms of Service document governing the terms of service for the application. Purely to be displayed a PSU at a ASPSP if the ASPSP supports it. Optional for the TPP to provide. V39 Changed to required |  [optional]
**transportKeyIds** | **List&lt;String&gt;** | KeyIds of Keys used for securing message transport (TLS) |  [optional]
**version** | [**BigDecimal**](BigDecimal.md) | Version of the sofware. V39 Changed to required |  [optional]



