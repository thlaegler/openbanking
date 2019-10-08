
# OBWriteInternationalStandingOrderResponse4Data

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**charges** | [**List&lt;OBWriteDomesticConsentResponse3DataCharges&gt;**](OBWriteDomesticConsentResponse3DataCharges.md) |  |  [optional]
**consentId** | **String** | OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource. | 
**creationDateTime** | **String** | Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00 | 
**initiation** | [**OBWriteInternationalStandingOrder3DataInitiation**](OBWriteInternationalStandingOrder3DataInitiation.md) |  | 
**internationalStandingOrderId** | **String** | OB: Unique identification as assigned by the ASPSP to uniquely identify the international standing order resource. | 
**multiAuthorisation** | [**OBWriteDomesticResponse3DataMultiAuthorisation**](OBWriteDomesticResponse3DataMultiAuthorisation.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Specifies the status of resource in code form. | 
**statusUpdateDateTime** | **String** | Date and time at which the resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00 | 


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
CANCELLED | &quot;Cancelled&quot;
INITIATIONCOMPLETED | &quot;InitiationCompleted&quot;
INITIATIONFAILED | &quot;InitiationFailed&quot;
INITIATIONPENDING | &quot;InitiationPending&quot;



