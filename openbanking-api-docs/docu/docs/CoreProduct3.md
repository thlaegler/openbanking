
# CoreProduct3

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**earlyPaymentFeeApplicable** | **Boolean** | Early repayment fee charged for this loan product. | 
**fullEarlyRepaymentAllowedIndicator** | **Boolean** | FullEarlyRepaymentAllowedIndicator states whether a borrower can pay off the entire residual prior to the expected end of the loan term without incurring charges |  [optional]
**loanApplicationFeeChargeType** | [**LoanApplicationFeeChargeTypeEnum**](#LoanApplicationFeeChargeTypeEnum) | Loan application fee charged type. | 
**notes** | **List&lt;String&gt;** | Optional additional notes to supplement the Core Product Details |  [optional]
**overPaymentFeeApplicable** | **Boolean** | Overpayment fee charged for this loan product. | 
**overpaymentAllowedIndicator** | **Boolean** | OverpaymentAllowedIndictor says whether a borrower can pay more than the repayment amount specified by the lender, in a particular period, without incurring charges. |  [optional]
**productDescription** | **String** | The description of the SME Loan product used for marketing purposes from a customer perspective. |  [optional]
**productURL** | **String** | URL provided by the organisation which redirects to the product (on live products only) available on an external website. There might be more than one product at a given URL. | 
**salesAccessChannels** | [**List&lt;SalesAccessChannelsEnum&gt;**](#List&lt;SalesAccessChannelsEnum&gt;) | Methods by which a customer can access the services associated to the SME Loan product | 
**servicingAccessChannels** | [**List&lt;ServicingAccessChannelsEnum&gt;**](#List&lt;ServicingAccessChannelsEnum&gt;) | Methods by which a customer can access the services associated to the SME Loan product | 
**tcsAndCsURL** | **String** | URL provided by the financial institution which redirects to the SME Loan T&amp;Cs on an external website | 


<a name="LoanApplicationFeeChargeTypeEnum"></a>
## Enum: LoanApplicationFeeChargeTypeEnum
Name | Value
---- | -----
CHARGEDAFTERLOANAPPROVAL | &quot;ChargedAfterLoanApproval&quot;
CHARGEDIRRESPECTIVEOFLOANAPPROVAL | &quot;ChargedIrrespectiveOfLoanApproval&quot;
NOLOANAPPLICATIONFEE | &quot;NoLoanApplicationFee&quot;


<a name="List<SalesAccessChannelsEnum>"></a>
## Enum: List&lt;SalesAccessChannelsEnum&gt;
Name | Value
---- | -----
BRANCH | &quot;Branch&quot;
CALLCENTRE | &quot;CallCentre&quot;
POST | &quot;Post&quot;
ONLINE | &quot;Online&quot;
POSTOFFICE | &quot;PostOffice&quot;
RELATIONSHIPMANAGER | &quot;RelationshipManager&quot;


<a name="List<ServicingAccessChannelsEnum>"></a>
## Enum: List&lt;ServicingAccessChannelsEnum&gt;
Name | Value
---- | -----
ATM | &quot;ATM&quot;
BRANCH | &quot;Branch&quot;
CALLCENTRE | &quot;CallCentre&quot;
POST | &quot;Post&quot;
MOBILEBANKINGAPP | &quot;MobileBankingApp&quot;
ONLINE | &quot;Online&quot;
POSTOFFICE | &quot;PostOffice&quot;
RELATIONSHIPMANAGER | &quot;RelationshipManager&quot;
TEXT | &quot;Text&quot;



