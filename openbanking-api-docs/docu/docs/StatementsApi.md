# StatementsApi

All URIs are relative to *https://localhost:8080/open-banking/v2.3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getStatements**](StatementsApi.md#getStatements) | **GET** /statements | Get Statements


<a name="getStatements"></a>
# **getStatements**
> OBReadStatement2 getStatements(authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, fromStatementDateTime, toStatementDateTime)

Get Statements

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.StatementsApi;

StatementsApi apiInstance = new StatementsApi();
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiAuthDate = "xFapiAuthDate_example"; // String | The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
String fromStatementDateTime = "2013-10-20T19:20:30+01:00"; // String | The UTC ISO 8601 Date Time to filter statements FROM NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the ASPSP must ignore the timezone component.
String toStatementDateTime = "2013-10-20T19:20:30+01:00"; // String | The UTC ISO 8601 Date Time to filter statements TO NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the ASPSP must ignore the timezone component.
try {
    OBReadStatement2 result = apiInstance.getStatements(authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, fromStatementDateTime, toStatementDateTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatementsApi#getStatements");
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
 **fromStatementDateTime** | **String**| The UTC ISO 8601 Date Time to filter statements FROM NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the ASPSP must ignore the timezone component. | [optional]
 **toStatementDateTime** | **String**| The UTC ISO 8601 Date Time to filter statements TO NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the ASPSP must ignore the timezone component. | [optional]

### Return type

[**OBReadStatement2**](OBReadStatement2.md)

### Authorization

[PSUOAuth2Security](../README.md#PSUOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

