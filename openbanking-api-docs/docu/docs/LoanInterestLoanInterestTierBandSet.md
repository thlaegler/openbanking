
# LoanInterestLoanInterestTierBandSet

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**calculationMethod** | [**CalculationMethodEnum**](#CalculationMethodEnum) | Methods of calculating interest | 
**identification** | **String** | Loan interest tierbandset identification. Used by  loan providers for internal use purpose. |  [optional]
**loanInterestFeesCharges** | [**List&lt;LoanInterestLoanInterestFeesCharges&gt;**](LoanInterestLoanInterestFeesCharges.md) | Contains details of fees and charges which are not associated with either LoanRepayment or features/benefits |  [optional]
**loanInterestTierBand** | [**List&lt;LoanInterestLoanInterestTierBand&gt;**](LoanInterestLoanInterestTierBand.md) | Tier Band Details | 
**notes** | **List&lt;String&gt;** | Optional additional notes to supplement the Tier Band Set details |  [optional]
**tierBandMethod** | [**TierBandMethodEnum**](#TierBandMethodEnum) | The methodology of how credit interest is charged. It can be:-  1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases.  2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance.  3. Whole The same interest rate is applied irrespective of the SME Loan balance | 


<a name="CalculationMethodEnum"></a>
## Enum: CalculationMethodEnum
Name | Value
---- | -----
COMPOUND | &quot;Compound&quot;
SIMPLEINTEREST | &quot;SimpleInterest&quot;


<a name="TierBandMethodEnum"></a>
## Enum: TierBandMethodEnum
Name | Value
---- | -----
BANDED | &quot;Banded&quot;
TIERED | &quot;Tiered&quot;
WHOLE | &quot;Whole&quot;



