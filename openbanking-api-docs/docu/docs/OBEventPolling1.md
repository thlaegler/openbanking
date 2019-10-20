
# OBEventPolling1

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ack** | **List&lt;String&gt;** |  |  [optional]
**maxEvents** | **Integer** | Maximum number of events to be returned. A value of zero indicates the ASPSP should not return events even if available |  [optional]
**returnImmediately** | **Boolean** | Indicates whether an ASPSP should return a response immediately or provide a long poll |  [optional]
**setErrs** | [**Map&lt;String, OBEventPolling1SetErrs&gt;**](OBEventPolling1SetErrs.md) | An object that encapsulates all negative acknowledgements transmitted by the TPP |  [optional]



