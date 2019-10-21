# OBQualifiedTrustServiceProvidersApi

All URIs are relative to *https://localhost:8080/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oBQualifiedTrustServiceProvidersGet**](OBQualifiedTrustServiceProvidersApi.md#oBQualifiedTrustServiceProvidersGet) | **GET** /OBQualifiedTrustServiceProviders | Search for one or more resources
[**oBQualifiedTrustServiceProvidersIdGet**](OBQualifiedTrustServiceProvidersApi.md#oBQualifiedTrustServiceProvidersIdGet) | **GET** /OBQualifiedTrustServiceProviders/{id} | Retrieve the resource
[**oBQualifiedTrustServiceProvidersSearchPost**](OBQualifiedTrustServiceProvidersApi.md#oBQualifiedTrustServiceProvidersSearchPost) | **POST** /OBQualifiedTrustServiceProviders/.search | Search for one or more resources using HTTP POST


<a name="oBQualifiedTrustServiceProvidersGet"></a>
# **oBQualifiedTrustServiceProvidersGet**
> InlineResponse2002 oBQualifiedTrustServiceProvidersGet(attributes, excludedAttributes, filter, sortBy, sortOrder, startIndex, count)

Search for one or more resources

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.OBQualifiedTrustServiceProvidersApi;

OBQualifiedTrustServiceProvidersApi apiInstance = new OBQualifiedTrustServiceProvidersApi();
String attributes = "attributes_example"; // String | A comma separated list of strings indicating the names of resource attributes to return in the response, overriding the set of attributes that would be returned by default. 'excludedAttributes' must not also be specified if this is specified.
String excludedAttributes = "excludedAttributes_example"; // String | A comma separated list of strings indicating the names of resource attributes to be removed from the default set of attributes to return. 'attributes' must not also be specified if this is specified.
String filter = "filter_example"; // String | The filter string used to request a subset of resources.
String sortBy = "sortBy_example"; // String | A string indicating the attribute whose value shall be used to order the returned responses.
String sortOrder = "sortOrder_example"; // String | A string indicating the order in which the 'sortBy' parameter is applied.
Integer startIndex = 56; // Integer | An integer indicating the 1-based index of the first query result.
Integer count = 56; // Integer | An integer indicating the desired maximum number of query results per page.
try {
    InlineResponse2002 result = apiInstance.oBQualifiedTrustServiceProvidersGet(attributes, excludedAttributes, filter, sortBy, sortOrder, startIndex, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OBQualifiedTrustServiceProvidersApi#oBQualifiedTrustServiceProvidersGet");
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

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="oBQualifiedTrustServiceProvidersIdGet"></a>
# **oBQualifiedTrustServiceProvidersIdGet**
> OBQualifiedTrustServiceProviders oBQualifiedTrustServiceProvidersIdGet(id, attributes, excludedAttributes)

Retrieve the resource

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.OBQualifiedTrustServiceProvidersApi;

OBQualifiedTrustServiceProvidersApi apiInstance = new OBQualifiedTrustServiceProvidersApi();
String id = "id_example"; // String | The resource identifier (value of the 'id' attribute).
String attributes = "attributes_example"; // String | A comma separated list of strings indicating the names of resource attributes to return in the response, overriding the set of attributes that would be returned by default. 'excludedAttributes' must not also be specified if this is specified.
String excludedAttributes = "excludedAttributes_example"; // String | A comma separated list of strings indicating the names of resource attributes to be removed from the default set of attributes to return. 'attributes' must not also be specified if this is specified.
try {
    OBQualifiedTrustServiceProviders result = apiInstance.oBQualifiedTrustServiceProvidersIdGet(id, attributes, excludedAttributes);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OBQualifiedTrustServiceProvidersApi#oBQualifiedTrustServiceProvidersIdGet");
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

[**OBQualifiedTrustServiceProviders**](OBQualifiedTrustServiceProviders.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="oBQualifiedTrustServiceProvidersSearchPost"></a>
# **oBQualifiedTrustServiceProvidersSearchPost**
> InlineResponse2002 oBQualifiedTrustServiceProvidersSearchPost(scIM20SearchRequestMessage)

Search for one or more resources using HTTP POST

Useful for executing searches without passing parameters that may contain sensitive information on the URL.

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.OBQualifiedTrustServiceProvidersApi;

OBQualifiedTrustServiceProvidersApi apiInstance = new OBQualifiedTrustServiceProvidersApi();
SearchRequest scIM20SearchRequestMessage = new SearchRequest(); // SearchRequest | 
try {
    InlineResponse2002 result = apiInstance.oBQualifiedTrustServiceProvidersSearchPost(scIM20SearchRequestMessage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OBQualifiedTrustServiceProvidersApi#oBQualifiedTrustServiceProvidersSearchPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scIM20SearchRequestMessage** | [**SearchRequest**](SearchRequest.md)|  | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

