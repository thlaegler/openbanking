
# OBReadBalance1DataBalance

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **String** |  | 
**amount** | [**OBReadBalance1DataAmount**](OBReadBalance1DataAmount.md) |  | 
**creditDebitIndicator** | [**OBCreditDebitCode2**](OBCreditDebitCode2.md) |  | 
**creditLine** | [**List&lt;OBReadBalance1DataCreditLine&gt;**](OBReadBalance1DataCreditLine.md) |  |  [optional]
**dateTime** | **String** | Indicates the date (and time) of the balance.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00 | 
**type** | [**OBBalanceType1Code**](OBBalanceType1Code.md) |  | 



