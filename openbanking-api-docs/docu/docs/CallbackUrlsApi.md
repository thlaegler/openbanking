# CallbackUrlsApi

All URIs are relative to *https://localhost:8080/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**callbackUrlsCallbackUrlIdDelete**](CallbackUrlsApi.md#callbackUrlsCallbackUrlIdDelete) | **DELETE** /callback-urls/{CallbackUrlId} | Delete a callback URI
[**callbackUrlsCallbackUrlIdPut**](CallbackUrlsApi.md#callbackUrlsCallbackUrlIdPut) | **PUT** /callback-urls/{CallbackUrlId} | Amend a callback URI
[**callbackUrlsGet**](CallbackUrlsApi.md#callbackUrlsGet) | **GET** /callback-urls | Read all callback URLs
[**callbackUrlsPost**](CallbackUrlsApi.md#callbackUrlsPost) | **POST** /callback-urls | Create a callback URL


<a name="callbackUrlsCallbackUrlIdDelete"></a>
# **callbackUrlsCallbackUrlIdDelete**
> Void callbackUrlsCallbackUrlIdDelete(callbackUrlId, authorization, xFapiInteractionId)

Delete a callback URI

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.CallbackUrlsApi;

CallbackUrlsApi apiInstance = new CallbackUrlsApi();
String callbackUrlId = "callbackUrlId_example"; // String | CallbackUrlId
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    Void result = apiInstance.callbackUrlsCallbackUrlIdDelete(callbackUrlId, authorization, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallbackUrlsApi#callbackUrlsCallbackUrlIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callbackUrlId** | **String**| CallbackUrlId |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**Void**](.md)

### Authorization

[TPPOAuth2Security](../README.md#TPPOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="callbackUrlsCallbackUrlIdPut"></a>
# **callbackUrlsCallbackUrlIdPut**
> OBCallbackUrlResponse1 callbackUrlsCallbackUrlIdPut(callbackUrlId, obCallbackUrl1Param, authorization, xJwsSignature, xFapiInteractionId)

Amend a callback URI

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.CallbackUrlsApi;

CallbackUrlsApi apiInstance = new CallbackUrlsApi();
String callbackUrlId = "callbackUrlId_example"; // String | CallbackUrlId
OBCallbackUrl1 obCallbackUrl1Param = new OBCallbackUrl1(); // OBCallbackUrl1 | Create an Callback URI
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xJwsSignature = "xJwsSignature_example"; // String | Header containing a detached JWS signature of the body of the payload.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    OBCallbackUrlResponse1 result = apiInstance.callbackUrlsCallbackUrlIdPut(callbackUrlId, obCallbackUrl1Param, authorization, xJwsSignature, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallbackUrlsApi#callbackUrlsCallbackUrlIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callbackUrlId** | **String**| CallbackUrlId |
 **obCallbackUrl1Param** | [**OBCallbackUrl1**](OBCallbackUrl1.md)| Create an Callback URI |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xJwsSignature** | **String**| Header containing a detached JWS signature of the body of the payload. |
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**OBCallbackUrlResponse1**](OBCallbackUrlResponse1.md)

### Authorization

[TPPOAuth2Security](../README.md#TPPOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="callbackUrlsGet"></a>
# **callbackUrlsGet**
> OBCallbackUrlsResponse1 callbackUrlsGet(authorization, xFapiInteractionId)

Read all callback URLs

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.CallbackUrlsApi;

CallbackUrlsApi apiInstance = new CallbackUrlsApi();
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    OBCallbackUrlsResponse1 result = apiInstance.callbackUrlsGet(authorization, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallbackUrlsApi#callbackUrlsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**OBCallbackUrlsResponse1**](OBCallbackUrlsResponse1.md)

### Authorization

[TPPOAuth2Security](../README.md#TPPOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="callbackUrlsPost"></a>
# **callbackUrlsPost**
> OBCallbackUrlResponse1 callbackUrlsPost(obCallbackUrl1Param, authorization, xJwsSignature, xFapiInteractionId)

Create a callback URL

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.CallbackUrlsApi;

CallbackUrlsApi apiInstance = new CallbackUrlsApi();
OBCallbackUrl1 obCallbackUrl1Param = new OBCallbackUrl1(); // OBCallbackUrl1 | Create an Callback URI
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xJwsSignature = "xJwsSignature_example"; // String | Header containing a detached JWS signature of the body of the payload.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    OBCallbackUrlResponse1 result = apiInstance.callbackUrlsPost(obCallbackUrl1Param, authorization, xJwsSignature, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallbackUrlsApi#callbackUrlsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **obCallbackUrl1Param** | [**OBCallbackUrl1**](OBCallbackUrl1.md)| Create an Callback URI |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xJwsSignature** | **String**| Header containing a detached JWS signature of the body of the payload. |
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**OBCallbackUrlResponse1**](OBCallbackUrlResponse1.md)

### Authorization

[TPPOAuth2Security](../README.md#TPPOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

