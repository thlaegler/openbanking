
# OBReadDirectDebit1DataDirectDebit

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **String** |  | 
**directDebitId** | **String** | A unique and immutable identifier used to identify the direct debit resource. This identifier has no meaning to the account owner. |  [optional]
**directDebitStatusCode** | [**DirectDebitStatusCodeEnum**](#DirectDebitStatusCodeEnum) | Specifies the status of the direct debit in code form. |  [optional]
**mandateIdentification** | **String** | Direct Debit reference. For AUDDIS service users provide Core Reference. For non AUDDIS service users provide Core reference if possible or last used reference. | 
**name** | **String** | Name of Service User. | 
**previousPaymentAmount** | [**OBReadDirectDebit1DataPreviousPaymentAmount**](OBReadDirectDebit1DataPreviousPaymentAmount.md) |  |  [optional]
**previousPaymentDateTime** | **String** | Date of most recent direct debit collection.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00 |  [optional]


<a name="DirectDebitStatusCodeEnum"></a>
## Enum: DirectDebitStatusCodeEnum
Name | Value
---- | -----
ACTIVE | &quot;Active&quot;
INACTIVE | &quot;Inactive&quot;



