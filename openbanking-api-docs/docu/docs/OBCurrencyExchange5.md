
# OBCurrencyExchange5

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contractIdentification** | **String** | Unique identification to unambiguously identify the foreign exchange contract. |  [optional]
**exchangeRate** | [**BigDecimal**](BigDecimal.md) | Factor used to convert an amount from one currency into another. This reflects the price at which one currency was bought with another currency. Usage: ExchangeRate expresses the ratio between UnitCurrency and QuotedCurrency (ExchangeRate &#x3D; UnitCurrency/QuotedCurrency). | 
**instructedAmount** | [**OBCurrencyExchange5InstructedAmount**](OBCurrencyExchange5InstructedAmount.md) |  |  [optional]
**quotationDate** | **String** | Date and time at which an exchange rate is quoted.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00 |  [optional]
**sourceCurrency** | **String** | Currency from which an amount is to be converted in a currency conversion. | 
**targetCurrency** | **String** | Currency into which an amount is to be converted in a currency conversion. |  [optional]
**unitCurrency** | **String** | Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP &#x3D; xxxCUR, the unit currency is GBP. |  [optional]



