
# OBWriteDomesticResponse3Data

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**charges** | [**List&lt;OBWriteDomesticConsentResponse3DataCharges&gt;**](OBWriteDomesticConsentResponse3DataCharges.md) |  |  [optional]
**consentId** | **String** | OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource. | 
**creationDateTime** | **String** | Date and time at which the message was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00 | 
**domesticPaymentId** | **String** | OB: Unique identification as assigned by the ASPSP to uniquely identify the domestic payment resource. | 
**expectedExecutionDateTime** | **String** | Expected execution date and time for the payment resource.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00 |  [optional]
**expectedSettlementDateTime** | **String** | Expected settlement date and time for the payment resource.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00 |  [optional]
**initiation** | [**OBWriteDomestic2DataInitiation**](OBWriteDomestic2DataInitiation.md) |  | 
**multiAuthorisation** | [**OBWriteDomesticResponse3DataMultiAuthorisation**](OBWriteDomesticResponse3DataMultiAuthorisation.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Specifies the status of the payment information group. | 
**statusUpdateDateTime** | **String** | Date and time at which the resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00 | 


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACCEPTEDCREDITSETTLEMENTCOMPLETED | &quot;AcceptedCreditSettlementCompleted&quot;
ACCEPTEDSETTLEMENTCOMPLETED | &quot;AcceptedSettlementCompleted&quot;
ACCEPTEDSETTLEMENTINPROCESS | &quot;AcceptedSettlementInProcess&quot;
ACCEPTEDWITHOUTPOSTING | &quot;AcceptedWithoutPosting&quot;
PENDING | &quot;Pending&quot;
REJECTED | &quot;Rejected&quot;



