
# LoanInterestLoanInterestTierBand

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fixedVariableInterestRateType** | [**FixedVariableInterestRateTypeEnum**](#FixedVariableInterestRateTypeEnum) | Type of interest rate, Fixed or Variable | 
**identification** | **String** | Unique and unambiguous identification of a  Tier Band for a SME Loan. |  [optional]
**loanInterestFeesCharges** | [**List&lt;LoanInterestLoanInterestFeesCharges&gt;**](LoanInterestLoanInterestFeesCharges.md) | Contains details of fees and charges which are not associated with either LoanRepayment or features/benefits |  [optional]
**loanProviderInterestRate** | **String** | Loan provider Interest for the SME Loan product |  [optional]
**loanProviderInterestRateType** | [**LoanProviderInterestRateTypeEnum**](#LoanProviderInterestRateTypeEnum) | Interest rate types, other than APR, which financial institutions may use to describe the annual interest rate payable for the SME Loan. |  [optional]
**maxTermPeriod** | [**MaxTermPeriodEnum**](#MaxTermPeriodEnum) | The unit of period (days, weeks, months etc.) of the Maximum Term |  [optional]
**minTermPeriod** | [**MinTermPeriodEnum**](#MinTermPeriodEnum) | The unit of period (days, weeks, months etc.) of the Minimum Term | 
**notes** | **List&lt;String&gt;** | Optional additional notes to supplement the Tier Band details |  [optional]
**otherLoanProviderInterestRateType** | [**OtherLoanProviderInterestRateType**](OtherLoanProviderInterestRateType.md) |  |  [optional]
**repAPR** | **String** | The annual equivalent rate (AER) is interest that is calculated under the assumption that any interest paid is combined with the original balance and the next interest payment will be based on the slightly higher account balance. Overall, this means that interest can be compounded several times in a year depending on the number of times that interest payments are made.   For SME Loan, this APR is the representative APR which includes any account fees. | 
**tierValueMaxTerm** | **Float** | Maximum loan term for which the loan interest tier applies. |  [optional]
**tierValueMaximum** | **String** | Maximum loan value for which the loan interest tier applies. |  [optional]
**tierValueMinTerm** | **Float** | Minimum loan term for which the loan interest tier applies. | 
**tierValueMinimum** | **String** | Minimum loan value for which the loan interest tier applies. | 


<a name="FixedVariableInterestRateTypeEnum"></a>
## Enum: FixedVariableInterestRateTypeEnum
Name | Value
---- | -----
FIXED | &quot;Fixed&quot;
VARIABLE | &quot;Variable&quot;


<a name="LoanProviderInterestRateTypeEnum"></a>
## Enum: LoanProviderInterestRateTypeEnum
Name | Value
---- | -----
BOEBASERATE | &quot;BOEBaseRate&quot;
FIXEDRATE | &quot;FixedRate&quot;
GROSS | &quot;Gross&quot;
LOANPROVIDERBASERATE | &quot;LoanProviderBaseRate&quot;
NET | &quot;Net&quot;
OTHER | &quot;Other&quot;


<a name="MaxTermPeriodEnum"></a>
## Enum: MaxTermPeriodEnum
Name | Value
---- | -----
DAY | &quot;Day&quot;
HALF_YEAR | &quot;Half Year&quot;
MONTH | &quot;Month&quot;
QUARTER | &quot;Quarter&quot;
WEEK | &quot;Week&quot;
YEAR | &quot;Year&quot;


<a name="MinTermPeriodEnum"></a>
## Enum: MinTermPeriodEnum
Name | Value
---- | -----
DAY | &quot;Day&quot;
HALF_YEAR | &quot;Half Year&quot;
MONTH | &quot;Month&quot;
QUARTER | &quot;Quarter&quot;
WEEK | &quot;Week&quot;
YEAR | &quot;Year&quot;



