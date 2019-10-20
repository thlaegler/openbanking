
# OBReadProduct2DataProduct

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **String** | Account Identification of the customer for Product Details | 
**BCA** | [**BCA**](BCA.md) |  |  [optional]
**marketingStateId** | **String** | Unique and unambiguous identification of a  Product Marketing State. |  [optional]
**otherProductType** | [**OBReadProduct2DataOtherProductType**](OBReadProduct2DataOtherProductType.md) |  |  [optional]
**PCA** | [**PCA**](PCA.md) |  |  [optional]
**productId** | **String** | The unique ID that has been internally assigned by the financial institution to each of the current account banking products they market to their retail and/or small to medium enterprise (SME) customers. |  [optional]
**productName** | **String** | The name of the Product used for marketing purposes from a customer perspective. I.e. what the customer would recognise. |  [optional]
**productType** | [**ProductTypeEnum**](#ProductTypeEnum) | Product type : Personal Current Account, Business Current Account | 
**secondaryProductId** | **String** | Any secondary Identification which  supports Product Identifier to uniquely identify the current account banking products. |  [optional]


<a name="ProductTypeEnum"></a>
## Enum: ProductTypeEnum
Name | Value
---- | -----
BUSINESSCURRENTACCOUNT | &quot;BusinessCurrentAccount&quot;
COMMERCIALCREDITCARD | &quot;CommercialCreditCard&quot;
OTHER | &quot;Other&quot;
PERSONALCURRENTACCOUNT | &quot;PersonalCurrentAccount&quot;
SMELOAN | &quot;SMELoan&quot;



