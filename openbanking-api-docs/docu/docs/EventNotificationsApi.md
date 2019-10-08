# EventNotificationsApi

All URIs are relative to *https://localhost:8080/open-banking/v2.3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEventNotification**](EventNotificationsApi.md#createEventNotification) | **POST** /event-notifications | Send an event notification


<a name="createEventNotification"></a>
# **createEventNotification**
> Void createEventNotification(obEventNotification1Param, xFapiFinancialId, xFapiInteractionId)

Send an event notification

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.EventNotificationsApi;

EventNotificationsApi apiInstance = new EventNotificationsApi();
String obEventNotification1Param = "obEventNotification1Param_example"; // String | Create an Callback URI
String xFapiFinancialId = "xFapiFinancialId_example"; // String | The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    Void result = apiInstance.createEventNotification(obEventNotification1Param, xFapiFinancialId, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventNotificationsApi#createEventNotification");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **obEventNotification1Param** | **String**| Create an Callback URI |
 **xFapiFinancialId** | **String**| The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB. |
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/jwt
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

