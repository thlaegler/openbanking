
# CreditInterest2TierBand

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AER** | **String** | The annual equivalent rate (AER) is interest that is calculated under the assumption that any interest paid is combined with the original balance and the next interest payment will be based on the slightly higher account balance. Overall, this means that interest can be compounded several times in a year depending on the number of times that interest payments are made.   Read more: Annual Equivalent Rate (AER) http://www.investopedia.com/terms/a/aer.asp#ixzz4gfR7IO1A | 
**applicationFrequency** | [**ApplicationFrequencyEnum**](#ApplicationFrequencyEnum) | How often is interest applied to the PCA for this tier/band i.e. how often the financial institution pays accumulated interest to the customer&#39;s PCA. | 
**bankInterestRate** | **String** | Bank Interest for the PCA product |  [optional]
**bankInterestRateType** | [**BankInterestRateTypeEnum**](#BankInterestRateTypeEnum) | Interest rate types, other than AER, which financial institutions may use to describe the annual interest rate payable to the PCA. |  [optional]
**calculationFrequency** | [**CalculationFrequencyEnum**](#CalculationFrequencyEnum) | How often is credit interest calculated for the account. |  [optional]
**depositInterestAppliedCoverage** | [**DepositInterestAppliedCoverageEnum**](#DepositInterestAppliedCoverageEnum) | Amount on which Interest applied. |  [optional]
**fixedVariableInterestRateType** | [**FixedVariableInterestRateTypeEnum**](#FixedVariableInterestRateTypeEnum) | Type of interest rate, Fixed or Variable | 
**identification** | **String** | Unique and unambiguous identification of a  Tier Band for a PCA. |  [optional]
**notes** | **List&lt;String&gt;** | Optional additional notes to supplement the Tier Band details |  [optional]
**otherApplicationFrequency** | [**OtherApplicationFrequency1**](OtherApplicationFrequency1.md) |  |  [optional]
**otherBankInterestType** | [**OtherBankInterestType**](OtherBankInterestType.md) |  |  [optional]
**otherCalculationFrequency** | [**OtherCalculationFrequency1**](OtherCalculationFrequency1.md) |  |  [optional]
**tierValueMaximum** | **String** | Maximum deposit value for which the credit interest tier applies. |  [optional]
**tierValueMinimum** | **String** | Minimum deposit value for which the credit interest tier applies. | 


<a name="ApplicationFrequencyEnum"></a>
## Enum: ApplicationFrequencyEnum
Name | Value
---- | -----
PERACADEMICTERM | &quot;PerAcademicTerm&quot;
DAILY | &quot;Daily&quot;
HALFYEARLY | &quot;HalfYearly&quot;
MONTHLY | &quot;Monthly&quot;
OTHER | &quot;Other&quot;
QUARTERLY | &quot;Quarterly&quot;
PERSTATEMENTDATE | &quot;PerStatementDate&quot;
WEEKLY | &quot;Weekly&quot;
YEARLY | &quot;Yearly&quot;


<a name="BankInterestRateTypeEnum"></a>
## Enum: BankInterestRateTypeEnum
Name | Value
---- | -----
LINKEDBASERATE | &quot;LinkedBaseRate&quot;
GROSS | &quot;Gross&quot;
NET | &quot;Net&quot;
OTHER | &quot;Other&quot;


<a name="CalculationFrequencyEnum"></a>
## Enum: CalculationFrequencyEnum
Name | Value
---- | -----
PERACADEMICTERM | &quot;PerAcademicTerm&quot;
DAILY | &quot;Daily&quot;
HALFYEARLY | &quot;HalfYearly&quot;
MONTHLY | &quot;Monthly&quot;
OTHER | &quot;Other&quot;
QUARTERLY | &quot;Quarterly&quot;
PERSTATEMENTDATE | &quot;PerStatementDate&quot;
WEEKLY | &quot;Weekly&quot;
YEARLY | &quot;Yearly&quot;


<a name="DepositInterestAppliedCoverageEnum"></a>
## Enum: DepositInterestAppliedCoverageEnum
Name | Value
---- | -----
TIERED | &quot;Tiered&quot;
WHOLE | &quot;Whole&quot;


<a name="FixedVariableInterestRateTypeEnum"></a>
## Enum: FixedVariableInterestRateTypeEnum
Name | Value
---- | -----
FIXED | &quot;Fixed&quot;
VARIABLE | &quot;Variable&quot;



