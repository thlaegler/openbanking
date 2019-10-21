# DomesticStandingOrdersApi

All URIs are relative to *https://localhost:8080/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDomesticStandingOrders**](DomesticStandingOrdersApi.md#createDomesticStandingOrders) | **POST** /domestic-standing-orders | Create Domestic Standing Orders
[**getDomesticStandingOrdersDomesticStandingOrderId**](DomesticStandingOrdersApi.md#getDomesticStandingOrdersDomesticStandingOrderId) | **GET** /domestic-standing-orders/{DomesticStandingOrderId} | Get Domestic Standing Orders
[**getDomesticStandingOrdersDomesticStandingOrderIdPaymentDetails**](DomesticStandingOrdersApi.md#getDomesticStandingOrdersDomesticStandingOrderIdPaymentDetails) | **GET** /domestic-standing-orders/{DomesticStandingOrderId}/payment-details | Get Payment Details


<a name="createDomesticStandingOrders"></a>
# **createDomesticStandingOrders**
> OBWriteDomesticStandingOrderResponse4 createDomesticStandingOrders(obWriteDomesticStandingOrder3Param, authorization, xIdempotencyKey, xJwsSignature, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId)

Create Domestic Standing Orders

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.DomesticStandingOrdersApi;

DomesticStandingOrdersApi apiInstance = new DomesticStandingOrdersApi();
OBWriteDomesticStandingOrder3 obWriteDomesticStandingOrder3Param = new OBWriteDomesticStandingOrder3(); // OBWriteDomesticStandingOrder3 | Default
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xIdempotencyKey = "xIdempotencyKey_example"; // String | Every request will be processed only once per x-idempotency-key.  The Idempotency Key will be valid for 24 hours. 
String xJwsSignature = "xJwsSignature_example"; // String | A detached JWS signature of the body of the payload.
String xFapiAuthDate = "xFapiAuthDate_example"; // String | The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    OBWriteDomesticStandingOrderResponse4 result = apiInstance.createDomesticStandingOrders(obWriteDomesticStandingOrder3Param, authorization, xIdempotencyKey, xJwsSignature, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomesticStandingOrdersApi#createDomesticStandingOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **obWriteDomesticStandingOrder3Param** | [**OBWriteDomesticStandingOrder3**](OBWriteDomesticStandingOrder3.md)| Default |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xIdempotencyKey** | **String**| Every request will be processed only once per x-idempotency-key.  The Idempotency Key will be valid for 24 hours.  |
 **xJwsSignature** | **String**| A detached JWS signature of the body of the payload. |
 **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**OBWriteDomesticStandingOrderResponse4**](OBWriteDomesticStandingOrderResponse4.md)

### Authorization

[PSUOAuth2Security](../README.md#PSUOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="getDomesticStandingOrdersDomesticStandingOrderId"></a>
# **getDomesticStandingOrdersDomesticStandingOrderId**
> OBWriteDomesticStandingOrderResponse4 getDomesticStandingOrdersDomesticStandingOrderId(domesticStandingOrderId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId)

Get Domestic Standing Orders

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.DomesticStandingOrdersApi;

DomesticStandingOrdersApi apiInstance = new DomesticStandingOrdersApi();
String domesticStandingOrderId = "domesticStandingOrderId_example"; // String | DomesticStandingOrderId
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiAuthDate = "xFapiAuthDate_example"; // String | The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    OBWriteDomesticStandingOrderResponse4 result = apiInstance.getDomesticStandingOrdersDomesticStandingOrderId(domesticStandingOrderId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomesticStandingOrdersApi#getDomesticStandingOrdersDomesticStandingOrderId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domesticStandingOrderId** | **String**| DomesticStandingOrderId |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**OBWriteDomesticStandingOrderResponse4**](OBWriteDomesticStandingOrderResponse4.md)

### Authorization

[TPPOAuth2Security](../README.md#TPPOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="getDomesticStandingOrdersDomesticStandingOrderIdPaymentDetails"></a>
# **getDomesticStandingOrdersDomesticStandingOrderIdPaymentDetails**
> OBWritePaymentDetailsResponse1 getDomesticStandingOrdersDomesticStandingOrderIdPaymentDetails(domesticStandingOrderId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId)

Get Payment Details

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.DomesticStandingOrdersApi;

DomesticStandingOrdersApi apiInstance = new DomesticStandingOrdersApi();
String domesticStandingOrderId = "domesticStandingOrderId_example"; // String | DomesticStandingOrderId
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiAuthDate = "xFapiAuthDate_example"; // String | The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    OBWritePaymentDetailsResponse1 result = apiInstance.getDomesticStandingOrdersDomesticStandingOrderIdPaymentDetails(domesticStandingOrderId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomesticStandingOrdersApi#getDomesticStandingOrdersDomesticStandingOrderIdPaymentDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domesticStandingOrderId** | **String**| DomesticStandingOrderId |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**OBWritePaymentDetailsResponse1**](OBWritePaymentDetailsResponse1.md)

### Authorization

[TPPOAuth2Security](../README.md#TPPOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

