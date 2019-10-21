# OBAccountPaymentServiceProvidersApi

All URIs are relative to *https://localhost:8080/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oBAccountPaymentServiceProvidersGet**](OBAccountPaymentServiceProvidersApi.md#oBAccountPaymentServiceProvidersGet) | **GET** /OBAccountPaymentServiceProviders | Search for one or more resources
[**oBAccountPaymentServiceProvidersIdGet**](OBAccountPaymentServiceProvidersApi.md#oBAccountPaymentServiceProvidersIdGet) | **GET** /OBAccountPaymentServiceProviders/{id} | Retrieve the resource
[**oBAccountPaymentServiceProvidersSearchPost**](OBAccountPaymentServiceProvidersApi.md#oBAccountPaymentServiceProvidersSearchPost) | **POST** /OBAccountPaymentServiceProviders/.search | Search for one or more resources using HTTP POST


<a name="oBAccountPaymentServiceProvidersGet"></a>
# **oBAccountPaymentServiceProvidersGet**
> OBAccountPaymentServiceProvidersResponse oBAccountPaymentServiceProvidersGet(attributes, excludedAttributes, filter, sortBy, sortOrder, startIndex, count)

Search for one or more resources

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.OBAccountPaymentServiceProvidersApi;

OBAccountPaymentServiceProvidersApi apiInstance = new OBAccountPaymentServiceProvidersApi();
String attributes = "attributes_example"; // String | A comma separated list of strings indicating the names of resource attributes to return in the response, overriding the set of attributes that would be returned by default. 'excludedAttributes' must not also be specified if this is specified.
String excludedAttributes = "excludedAttributes_example"; // String | A comma separated list of strings indicating the names of resource attributes to be removed from the default set of attributes to return. 'attributes' must not also be specified if this is specified.
String filter = "filter_example"; // String | The filter string used to request a subset of resources.
String sortBy = "sortBy_example"; // String | A string indicating the attribute whose value shall be used to order the returned responses.
String sortOrder = "sortOrder_example"; // String | A string indicating the order in which the 'sortBy' parameter is applied.
Integer startIndex = 56; // Integer | An integer indicating the 1-based index of the first query result.
Integer count = 56; // Integer | An integer indicating the desired maximum number of query results per page.
try {
    OBAccountPaymentServiceProvidersResponse result = apiInstance.oBAccountPaymentServiceProvidersGet(attributes, excludedAttributes, filter, sortBy, sortOrder, startIndex, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OBAccountPaymentServiceProvidersApi#oBAccountPaymentServiceProvidersGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **String**| A comma separated list of strings indicating the names of resource attributes to return in the response, overriding the set of attributes that would be returned by default. &#39;excludedAttributes&#39; must not also be specified if this is specified. | [optional]
 **excludedAttributes** | **String**| A comma separated list of strings indicating the names of resource attributes to be removed from the default set of attributes to return. &#39;attributes&#39; must not also be specified if this is specified. | [optional]
 **filter** | **String**| The filter string used to request a subset of resources. | [optional]
 **sortBy** | **String**| A string indicating the attribute whose value shall be used to order the returned responses. | [optional]
 **sortOrder** | **String**| A string indicating the order in which the &#39;sortBy&#39; parameter is applied. | [optional] [enum: ascending, descending]
 **startIndex** | **Integer**| An integer indicating the 1-based index of the first query result. | [optional]
 **count** | **Integer**| An integer indicating the desired maximum number of query results per page. | [optional]

### Return type

[**OBAccountPaymentServiceProvidersResponse**](OBAccountPaymentServiceProvidersResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="oBAccountPaymentServiceProvidersIdGet"></a>
# **oBAccountPaymentServiceProvidersIdGet**
> OBAccountPaymentServiceProviders oBAccountPaymentServiceProvidersIdGet(id, attributes, excludedAttributes)

Retrieve the resource

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.OBAccountPaymentServiceProvidersApi;

OBAccountPaymentServiceProvidersApi apiInstance = new OBAccountPaymentServiceProvidersApi();
String id = "id_example"; // String | The resource identifier (value of the 'id' attribute).
String attributes = "attributes_example"; // String | A comma separated list of strings indicating the names of resource attributes to return in the response, overriding the set of attributes that would be returned by default. 'excludedAttributes' must not also be specified if this is specified.
String excludedAttributes = "excludedAttributes_example"; // String | A comma separated list of strings indicating the names of resource attributes to be removed from the default set of attributes to return. 'attributes' must not also be specified if this is specified.
try {
    OBAccountPaymentServiceProviders result = apiInstance.oBAccountPaymentServiceProvidersIdGet(id, attributes, excludedAttributes);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OBAccountPaymentServiceProvidersApi#oBAccountPaymentServiceProvidersIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The resource identifier (value of the &#39;id&#39; attribute). |
 **attributes** | **String**| A comma separated list of strings indicating the names of resource attributes to return in the response, overriding the set of attributes that would be returned by default. &#39;excludedAttributes&#39; must not also be specified if this is specified. | [optional]
 **excludedAttributes** | **String**| A comma separated list of strings indicating the names of resource attributes to be removed from the default set of attributes to return. &#39;attributes&#39; must not also be specified if this is specified. | [optional]

### Return type

[**OBAccountPaymentServiceProviders**](OBAccountPaymentServiceProviders.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="oBAccountPaymentServiceProvidersSearchPost"></a>
# **oBAccountPaymentServiceProvidersSearchPost**
> InlineResponse200 oBAccountPaymentServiceProvidersSearchPost(scIM20SearchRequestMessage)

Search for one or more resources using HTTP POST

Useful for executing searches without passing parameters that may contain sensitive information on the URL.

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.OBAccountPaymentServiceProvidersApi;

OBAccountPaymentServiceProvidersApi apiInstance = new OBAccountPaymentServiceProvidersApi();
SearchRequest scIM20SearchRequestMessage = new SearchRequest(); // SearchRequest | 
try {
    InlineResponse200 result = apiInstance.oBAccountPaymentServiceProvidersSearchPost(scIM20SearchRequestMessage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OBAccountPaymentServiceProvidersApi#oBAccountPaymentServiceProvidersSearchPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scIM20SearchRequestMessage** | [**SearchRequest**](SearchRequest.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

