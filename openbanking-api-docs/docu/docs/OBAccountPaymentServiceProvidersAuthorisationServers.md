
# OBAccountPaymentServiceProvidersAuthorisationServers

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**autoRegistrationSupported** | **Boolean** | Authorisation Server supports auto-registration |  [optional]
**baseApiDNSUri** | **String** | Points to the Open Banking APIs V39 required |  [optional]
**clientRegistrationUri** | **String** | The registration endpoint for TPP onboarding to ASPSPs. V39 required |  [optional]
**customerFriendlyDescription** | **String** | Customer orientated description |  [optional]
**customerFriendlyLogoUri** | **String** | uri from which a TPP can retrieve a certified logo V39 required |  [optional]
**customerFriendlyName** | **String** | Certified name |  [optional]
**developerPortalUri** | **String** | URI for TPP developer testing V39 required |  [optional]
**eiSCDId** | **List&lt;String&gt;** | Confirmation of payee bank identifier V37 was CoPBankIdentifier |  [optional]
**id** | **String** | Authorisation Server Id V39 required |  [optional]
**openIDConfigEndPointUri** | **String** | Uri used for Oauth2.0 OpenId Configuration V39 required |  [optional]
**parentAuthorisationServerId** | **String** | Authorisation Server Id of Parent Authorisation server, used for app to app linking |  [optional]
**payloadSigningCertLocation** | **String** | The location which is used for signing certificates V39 required |  [optional]
**termsOfService** | **String** | Uri from which the terms of service can be retrieved V39 required |  [optional]



