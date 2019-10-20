# RegisterApi

All URIs are relative to *https://localhost:8080/open-banking/v2.3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**registerClientIdDelete**](RegisterApi.md#registerClientIdDelete) | **DELETE** /register/{ClientId} | Delete a client by way of Client ID
[**registerClientIdGet**](RegisterApi.md#registerClientIdGet) | **GET** /register/{ClientId} | Get a client by way of Client ID
[**registerClientIdPut**](RegisterApi.md#registerClientIdPut) | **PUT** /register/{ClientId} | Update a client by way of Client ID
[**registerPost**](RegisterApi.md#registerPost) | **POST** /register | Register a client by way of a Software Statement Assertion


<a name="registerClientIdDelete"></a>
# **registerClientIdDelete**
> Void registerClientIdDelete(clientId, authorization)

Delete a client by way of Client ID

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.RegisterApi;

RegisterApi apiInstance = new RegisterApi();
String clientId = "clientId_example"; // String | The client ID
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
try {
    Void result = apiInstance.registerClientIdDelete(clientId, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegisterApi#registerClientIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| The client ID |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |

### Return type

[**Void**](.md)

### Authorization

[TPPOAuth2Security](../README.md#TPPOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="registerClientIdGet"></a>
# **registerClientIdGet**
> InlineResponse201 registerClientIdGet(clientId, authorization)

Get a client by way of Client ID

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.RegisterApi;

RegisterApi apiInstance = new RegisterApi();
String clientId = "clientId_example"; // String | The client ID
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
try {
    InlineResponse201 result = apiInstance.registerClientIdGet(clientId, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegisterApi#registerClientIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| The client ID |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

[TPPOAuth2Security](../README.md#TPPOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="registerClientIdPut"></a>
# **registerClientIdPut**
> InlineResponse201 registerClientIdPut(clientId, authorization, requestBody)

Update a client by way of Client ID

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.RegisterApi;

RegisterApi apiInstance = new RegisterApi();
String clientId = "clientId_example"; // String | The client ID
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String requestBody = "requestBody_example"; // String | A request to register a Software Statement Assertion with an ASPSP
try {
    InlineResponse201 result = apiInstance.registerClientIdPut(clientId, authorization, requestBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegisterApi#registerClientIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| The client ID |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **requestBody** | **String**| A request to register a Software Statement Assertion with an ASPSP | [optional]

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

[TPPOAuth2Security](../README.md#TPPOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="registerPost"></a>
# **registerPost**
> InlineResponse201 registerPost(requestBody)

Register a client by way of a Software Statement Assertion

Endpoint will be secured by way of Mutual Authentication over TLS

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.RegisterApi;

RegisterApi apiInstance = new RegisterApi();
String requestBody = "requestBody_example"; // String | A request to register a Software Statement Assertion with an ASPSP
try {
    InlineResponse201 result = apiInstance.registerPost(requestBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegisterApi#registerPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestBody** | **String**| A request to register a Software Statement Assertion with an ASPSP | [optional]

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

