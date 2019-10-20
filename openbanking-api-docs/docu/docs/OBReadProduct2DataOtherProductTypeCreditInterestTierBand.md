
# OBReadProduct2DataOtherProductTypeCreditInterestTierBand

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AER** | **String** | The annual equivalent rate (AER) is interest that is calculated under the assumption that any interest paid is combined with the original balance and the next interest payment will be based on the slightly higher account balance. Overall, this means that interest can be compounded several times in a year depending on the number of times that interest payments are made.  Read more: Annual Equivalent Rate (AER) http://www.investopedia.com/terms/a/aer.asp#ixzz4gfR7IO1A | 
**applicationFrequency** | [**ApplicationFrequencyEnum**](#ApplicationFrequencyEnum) | How often is interest applied to the Product for this tier/band i.e. how often the financial institution pays accumulated interest to the customer&#39;s account. | 
**bankInterestRate** | **String** | Bank Interest for the product |  [optional]
**bankInterestRateType** | [**BankInterestRateTypeEnum**](#BankInterestRateTypeEnum) | Interest rate types, other than AER, which financial institutions may use to describe the annual interest rate payable to the account holder&#39;s account. |  [optional]
**calculationFrequency** | [**CalculationFrequencyEnum**](#CalculationFrequencyEnum) | How often is credit interest calculated for the account. |  [optional]
**depositInterestAppliedCoverage** | [**DepositInterestAppliedCoverageEnum**](#DepositInterestAppliedCoverageEnum) | Amount on which Interest applied. |  [optional]
**fixedVariableInterestRateType** | [**OBInterestFixedVariableType1Code**](OBInterestFixedVariableType1Code.md) |  | 
**identification** | **String** | Unique and unambiguous identification of a  Tier Band for the Product. |  [optional]
**notes** | **List&lt;String&gt;** |  |  [optional]
**otherApplicationFrequency** | [**OBOtherCodeType11**](OBOtherCodeType11.md) |  |  [optional]
**otherBankInterestType** | [**OBReadProduct2DataOtherProductTypeCreditInterestOtherBankInterestType**](OBReadProduct2DataOtherProductTypeCreditInterestOtherBankInterestType.md) |  |  [optional]
**otherCalculationFrequency** | [**OBOtherCodeType12**](OBOtherCodeType12.md) |  |  [optional]
**tierValueMaximum** | **String** | Maximum deposit value for which the credit interest tier applies. |  [optional]
**tierValueMinimum** | **String** | Minimum deposit value for which the credit interest tier applies. | 


<a name="ApplicationFrequencyEnum"></a>
## Enum: ApplicationFrequencyEnum
Name | Value
---- | -----
FQAT | &quot;FQAT&quot;
FQDY | &quot;FQDY&quot;
FQHY | &quot;FQHY&quot;
FQMY | &quot;FQMY&quot;
FQOT | &quot;FQOT&quot;
FQQY | &quot;FQQY&quot;
FQSD | &quot;FQSD&quot;
FQWY | &quot;FQWY&quot;
FQYY | &quot;FQYY&quot;


<a name="BankInterestRateTypeEnum"></a>
## Enum: BankInterestRateTypeEnum
Name | Value
---- | -----
INBB | &quot;INBB&quot;
INFR | &quot;INFR&quot;
INGR | &quot;INGR&quot;
INLR | &quot;INLR&quot;
INNE | &quot;INNE&quot;
INOT | &quot;INOT&quot;


<a name="CalculationFrequencyEnum"></a>
## Enum: CalculationFrequencyEnum
Name | Value
---- | -----
FQAT | &quot;FQAT&quot;
FQDY | &quot;FQDY&quot;
FQHY | &quot;FQHY&quot;
FQMY | &quot;FQMY&quot;
FQOT | &quot;FQOT&quot;
FQQY | &quot;FQQY&quot;
FQSD | &quot;FQSD&quot;
FQWY | &quot;FQWY&quot;
FQYY | &quot;FQYY&quot;


<a name="DepositInterestAppliedCoverageEnum"></a>
## Enum: DepositInterestAppliedCoverageEnum
Name | Value
---- | -----
INBA | &quot;INBA&quot;
INTI | &quot;INTI&quot;
INWH | &quot;INWH&quot;



