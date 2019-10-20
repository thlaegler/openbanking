# OBAuthoritiesApi

All URIs are relative to *https://localhost:8080/open-banking/v2.3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oBAuthoritiesGet**](OBAuthoritiesApi.md#oBAuthoritiesGet) | **GET** /OBAuthorities | Search for one or more resources
[**oBAuthoritiesIdGet**](OBAuthoritiesApi.md#oBAuthoritiesIdGet) | **GET** /OBAuthorities/{id} | Retrieve the resource
[**oBAuthoritiesSearchPost**](OBAuthoritiesApi.md#oBAuthoritiesSearchPost) | **POST** /OBAuthorities/.search | Search for one or more resources using HTTP POST


<a name="oBAuthoritiesGet"></a>
# **oBAuthoritiesGet**
> InlineResponse2001 oBAuthoritiesGet(attributes, excludedAttributes, filter, sortBy, sortOrder, startIndex, count)

Search for one or more resources

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.OBAuthoritiesApi;

OBAuthoritiesApi apiInstance = new OBAuthoritiesApi();
String attributes = "attributes_example"; // String | A comma separated list of strings indicating the names of resource attributes to return in the response, overriding the set of attributes that would be returned by default. 'excludedAttributes' must not also be specified if this is specified.
String excludedAttributes = "excludedAttributes_example"; // String | A comma separated list of strings indicating the names of resource attributes to be removed from the default set of attributes to return. 'attributes' must not also be specified if this is specified.
String filter = "filter_example"; // String | The filter string used to request a subset of resources.
String sortBy = "sortBy_example"; // String | A string indicating the attribute whose value shall be used to order the returned responses.
String sortOrder = "sortOrder_example"; // String | A string indicating the order in which the 'sortBy' parameter is applied.
Integer startIndex = 56; // Integer | An integer indicating the 1-based index of the first query result.
Integer count = 56; // Integer | An integer indicating the desired maximum number of query results per page.
try {
    InlineResponse2001 result = apiInstance.oBAuthoritiesGet(attributes, excludedAttributes, filter, sortBy, sortOrder, startIndex, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OBAuthoritiesApi#oBAuthoritiesGet");
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

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="oBAuthoritiesIdGet"></a>
# **oBAuthoritiesIdGet**
> OBAuthorities oBAuthoritiesIdGet(id, attributes, excludedAttributes)

Retrieve the resource

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.OBAuthoritiesApi;

OBAuthoritiesApi apiInstance = new OBAuthoritiesApi();
String id = "id_example"; // String | The resource identifier (value of the 'id' attribute).
String attributes = "attributes_example"; // String | A comma separated list of strings indicating the names of resource attributes to return in the response, overriding the set of attributes that would be returned by default. 'excludedAttributes' must not also be specified if this is specified.
String excludedAttributes = "excludedAttributes_example"; // String | A comma separated list of strings indicating the names of resource attributes to be removed from the default set of attributes to return. 'attributes' must not also be specified if this is specified.
try {
    OBAuthorities result = apiInstance.oBAuthoritiesIdGet(id, attributes, excludedAttributes);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OBAuthoritiesApi#oBAuthoritiesIdGet");
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

[**OBAuthorities**](OBAuthorities.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="oBAuthoritiesSearchPost"></a>
# **oBAuthoritiesSearchPost**
> InlineResponse2001 oBAuthoritiesSearchPost(scIM20SearchRequestMessage)

Search for one or more resources using HTTP POST

Useful for executing searches without passing parameters that may contain sensitive information on the URL.

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.OBAuthoritiesApi;

OBAuthoritiesApi apiInstance = new OBAuthoritiesApi();
SearchRequest scIM20SearchRequestMessage = new SearchRequest(); // SearchRequest | 
try {
    InlineResponse2001 result = apiInstance.oBAuthoritiesSearchPost(scIM20SearchRequestMessage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OBAuthoritiesApi#oBAuthoritiesSearchPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scIM20SearchRequestMessage** | [**SearchRequest**](SearchRequest.md)|  | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

