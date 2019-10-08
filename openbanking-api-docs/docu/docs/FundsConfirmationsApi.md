# FundsConfirmationsApi

All URIs are relative to *https://localhost:8080/open-banking/v2.3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFundsConfirmations**](FundsConfirmationsApi.md#createFundsConfirmations) | **POST** /funds-confirmations | Create Funds Confirmation


<a name="createFundsConfirmations"></a>
# **createFundsConfirmations**
> OBFundsConfirmationResponse1 createFundsConfirmations(obFundsConfirmation1Param, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId)

Create Funds Confirmation

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.FundsConfirmationsApi;

FundsConfirmationsApi apiInstance = new FundsConfirmationsApi();
OBFundsConfirmation1 obFundsConfirmation1Param = new OBFundsConfirmation1(); // OBFundsConfirmation1 | Default
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiAuthDate = "xFapiAuthDate_example"; // String | The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    OBFundsConfirmationResponse1 result = apiInstance.createFundsConfirmations(obFundsConfirmation1Param, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundsConfirmationsApi#createFundsConfirmations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **obFundsConfirmation1Param** | [**OBFundsConfirmation1**](OBFundsConfirmation1.md)| Default |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**OBFundsConfirmationResponse1**](OBFundsConfirmationResponse1.md)

### Authorization

[PSUOAuth2Security](../README.md#PSUOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

