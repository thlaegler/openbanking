# EventSubscriptionsApi

All URIs are relative to *https://localhost:8080/open-banking/v2.3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changeEventSubscriptionsEventSubscriptionId**](EventSubscriptionsApi.md#changeEventSubscriptionsEventSubscriptionId) | **PUT** /event-subscriptions/{EventSubscriptionId} | Change Event Subscription
[**createEventSubscriptions**](EventSubscriptionsApi.md#createEventSubscriptions) | **POST** /event-subscriptions | Create Event Subscription
[**deleteEventSubscriptionsEventSubscriptionId**](EventSubscriptionsApi.md#deleteEventSubscriptionsEventSubscriptionId) | **DELETE** /event-subscriptions/{EventSubscriptionId} | Delete Event Subscription
[**getEventSubscriptions**](EventSubscriptionsApi.md#getEventSubscriptions) | **GET** /event-subscriptions | Get Event Subscription


<a name="changeEventSubscriptionsEventSubscriptionId"></a>
# **changeEventSubscriptionsEventSubscriptionId**
> OBEventSubscriptionResponse1 changeEventSubscriptionsEventSubscriptionId(obEventSubscriptionResponse1Param, eventSubscriptionId, authorization, xJwsSignature, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId)

Change Event Subscription

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.EventSubscriptionsApi;

EventSubscriptionsApi apiInstance = new EventSubscriptionsApi();
OBEventSubscriptionResponse1 obEventSubscriptionResponse1Param = new OBEventSubscriptionResponse1(); // OBEventSubscriptionResponse1 | Default
String eventSubscriptionId = "eventSubscriptionId_example"; // String | EventSubscriptionId
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xJwsSignature = "xJwsSignature_example"; // String | A detached JWS signature of the body of the payload.
String xFapiAuthDate = "xFapiAuthDate_example"; // String | The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    OBEventSubscriptionResponse1 result = apiInstance.changeEventSubscriptionsEventSubscriptionId(obEventSubscriptionResponse1Param, eventSubscriptionId, authorization, xJwsSignature, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventSubscriptionsApi#changeEventSubscriptionsEventSubscriptionId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **obEventSubscriptionResponse1Param** | [**OBEventSubscriptionResponse1**](OBEventSubscriptionResponse1.md)| Default |
 **eventSubscriptionId** | **String**| EventSubscriptionId |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xJwsSignature** | **String**| A detached JWS signature of the body of the payload. |
 **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**OBEventSubscriptionResponse1**](OBEventSubscriptionResponse1.md)

### Authorization

[TPPOAuth2Security](../README.md#TPPOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="createEventSubscriptions"></a>
# **createEventSubscriptions**
> OBEventSubscriptionResponse1 createEventSubscriptions(obEventSubscription1Param, authorization, xJwsSignature, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId)

Create Event Subscription

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.EventSubscriptionsApi;

EventSubscriptionsApi apiInstance = new EventSubscriptionsApi();
OBEventSubscription1 obEventSubscription1Param = new OBEventSubscription1(); // OBEventSubscription1 | Default
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xJwsSignature = "xJwsSignature_example"; // String | A detached JWS signature of the body of the payload.
String xFapiAuthDate = "xFapiAuthDate_example"; // String | The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    OBEventSubscriptionResponse1 result = apiInstance.createEventSubscriptions(obEventSubscription1Param, authorization, xJwsSignature, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventSubscriptionsApi#createEventSubscriptions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **obEventSubscription1Param** | [**OBEventSubscription1**](OBEventSubscription1.md)| Default |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xJwsSignature** | **String**| A detached JWS signature of the body of the payload. |
 **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**OBEventSubscriptionResponse1**](OBEventSubscriptionResponse1.md)

### Authorization

[TPPOAuth2Security](../README.md#TPPOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="deleteEventSubscriptionsEventSubscriptionId"></a>
# **deleteEventSubscriptionsEventSubscriptionId**
> Void deleteEventSubscriptionsEventSubscriptionId(eventSubscriptionId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId)

Delete Event Subscription

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.EventSubscriptionsApi;

EventSubscriptionsApi apiInstance = new EventSubscriptionsApi();
String eventSubscriptionId = "eventSubscriptionId_example"; // String | EventSubscriptionId
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiAuthDate = "xFapiAuthDate_example"; // String | The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    Void result = apiInstance.deleteEventSubscriptionsEventSubscriptionId(eventSubscriptionId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventSubscriptionsApi#deleteEventSubscriptionsEventSubscriptionId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventSubscriptionId** | **String**| EventSubscriptionId |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**Void**](.md)

### Authorization

[TPPOAuth2Security](../README.md#TPPOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="getEventSubscriptions"></a>
# **getEventSubscriptions**
> OBEventSubscriptionsResponse1 getEventSubscriptions(authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId)

Get Event Subscription

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.EventSubscriptionsApi;

EventSubscriptionsApi apiInstance = new EventSubscriptionsApi();
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiAuthDate = "xFapiAuthDate_example"; // String | The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    OBEventSubscriptionsResponse1 result = apiInstance.getEventSubscriptions(authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventSubscriptionsApi#getEventSubscriptions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**OBEventSubscriptionsResponse1**](OBEventSubscriptionsResponse1.md)

### Authorization

[TPPOAuth2Security](../README.md#TPPOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

