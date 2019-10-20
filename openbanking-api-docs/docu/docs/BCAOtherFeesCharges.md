
# BCAOtherFeesCharges

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feeChargeCap** | [**List&lt;BCAFeeChargeCap&gt;**](BCAFeeChargeCap.md) | Details about any caps (maximum charges) that apply to a particular or group of fee/charge |  [optional]
**feeChargeDetail** | [**List&lt;BCAFeeChargeDetail&gt;**](BCAFeeChargeDetail.md) | Other fees/charges details | 
**otherTariffType** | [**OtherTariffType**](OtherTariffType.md) |  |  [optional]
**tariffName** | **String** | Name of the tariff |  [optional]
**tariffType** | [**TariffTypeEnum**](#TariffTypeEnum) | TariffType which defines the fee and charges. |  [optional]


<a name="TariffTypeEnum"></a>
## Enum: TariffTypeEnum
Name | Value
---- | -----
ELECTRONIC | &quot;Electronic&quot;
MIXED | &quot;Mixed&quot;
OTHER | &quot;Other&quot;



