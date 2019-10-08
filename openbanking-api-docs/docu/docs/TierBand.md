
# TierBand

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AER** | **String** | &#39;The annual equivalent rate (AER) is interest that is calculated under the assumption that any interest paid is combined with the original balance and the next interest payment will be based on the slightly higher account balance. Overall, this means that interest can be compounded several times in a year depending on the number of times that interest payments are made. \\nRead more: Annual Equivalent Rate (AER) http://www.investopedia.com/terms/a/aer.asp#ixzz4gfR7IO1A&#39; | 
**bankInterestRate** | **String** | Bank Interest for the BCA product |  [optional]
**bankInterestRateType** | [**BankInterestRateTypeEnum**](#BankInterestRateTypeEnum) | Interest rate types, other than AER, which financial institutions may use to describe the annual interest rate payable to the BCA. |  [optional]
**notes** | **List&lt;String&gt;** | Optional additional notes to supplement the Tier Band details |  [optional]
**otherApplicationFrequency** | [**OtherApplicationFrequency**](OtherApplicationFrequency.md) |  |  [optional]
**otherBankInterestType** | [**OtherBankInterestType**](OtherBankInterestType.md) |  |  [optional]
**otherCalculationFrequency** | [**OtherCalculationFrequency**](OtherCalculationFrequency.md) |  |  [optional]


<a name="BankInterestRateTypeEnum"></a>
## Enum: BankInterestRateTypeEnum
Name | Value
---- | -----
GROSS | &quot;Gross&quot;
OTHER | &quot;Other&quot;



