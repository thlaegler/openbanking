
# OBWriteInternational2DataInitiationExchangeRateInformation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contractIdentification** | **String** | Unique and unambiguous reference to the foreign exchange contract agreed between the initiating party/creditor and the debtor agent. |  [optional]
**exchangeRate** | [**BigDecimal**](BigDecimal.md) | The factor used for conversion of an amount from one currency to another. This reflects the price at which one currency was bought with another currency. |  [optional]
**rateType** | [**RateTypeEnum**](#RateTypeEnum) | Specifies the type used to complete the currency exchange. | 
**unitCurrency** | **String** | Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP &#x3D; xxxCUR, the unit currency is GBP. | 


<a name="RateTypeEnum"></a>
## Enum: RateTypeEnum
Name | Value
---- | -----
ACTUAL | &quot;Actual&quot;
AGREED | &quot;Agreed&quot;
INDICATIVE | &quot;Indicative&quot;



