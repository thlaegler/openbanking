
# ATMResponseATM

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**atMServices** | [**List&lt;AtMServicesEnum&gt;**](#List&lt;AtMServicesEnum&gt;) | Describes the type of transaction available for a customer on an ATM. |  [optional]
**access24HoursIndicator** | **Boolean** | Indicates that the ATM is available for use by customers 24 hours per day |  [optional]
**accessibility** | [**List&lt;AccessibilityEnum&gt;**](#List&lt;AccessibilityEnum&gt;) | Indicates Types of Accessibility |  [optional]
**branch** | [**Branch**](Branch.md) |  |  [optional]
**identification** | **String** | ATM terminal device identification for the acquirer and the issuer. | 
**location** | [**Location**](Location.md) |  | 
**minimumPossibleAmount** | **String** | Minimum amount allowed for a transaction in the service. |  [optional]
**note** | **List&lt;String&gt;** | Summary description of the ATM. |  [optional]
**otherATMServices** | [**List&lt;ATMResponseOtherATMServices&gt;**](ATMResponseOtherATMServices.md) | Enter a new code , name and description for any other ATM Service |  [optional]
**otherAccessibility** | [**List&lt;ATMResponseOtherAccessibility&gt;**](ATMResponseOtherAccessibility.md) | Enter a new code , name and description for any other ATM accessibility options |  [optional]
**supportedCurrencies** | **List&lt;String&gt;** | All ISO 4217 defined currency  supported by the ATM. | 
**supportedLanguages** | **List&lt;String&gt;** | Identification of the language name according to the ISO 639-1 codes. The type is validated by the list of values coded with two alphabetic characters, defined in the standard. |  [optional]


<a name="List<AtMServicesEnum>"></a>
## Enum: List&lt;AtMServicesEnum&gt;
Name | Value
---- | -----
BALANCE | &quot;Balance&quot;
BILLPAYMENTS | &quot;BillPayments&quot;
CASHDEPOSITS | &quot;CashDeposits&quot;
CHARITYDONATION | &quot;CharityDonation&quot;
CHEQUEDEPOSITS | &quot;ChequeDeposits&quot;
CASHWITHDRAWAL | &quot;CashWithdrawal&quot;
ENVELOPEDEPOSIT | &quot;EnvelopeDeposit&quot;
FASTCASH | &quot;FastCash&quot;
MOBILEBANKINGREGISTRATION | &quot;MobileBankingRegistration&quot;
MOBILEPAYMENTREGISTRATION | &quot;MobilePaymentRegistration&quot;
MOBILEPHONETOPUP | &quot;MobilePhoneTopUp&quot;
ORDERSTATEMENT | &quot;OrderStatement&quot;
OTHER | &quot;Other&quot;
PINACTIVATION | &quot;PINActivation&quot;
PINCHANGE | &quot;PINChange&quot;
PINUNBLOCK | &quot;PINUnblock&quot;
MINISTATEMENT | &quot;MiniStatement&quot;


<a name="List<AccessibilityEnum>"></a>
## Enum: List&lt;AccessibilityEnum&gt;
Name | Value
---- | -----
AUDIOCASHMACHINE | &quot;AudioCashMachine&quot;
AUTOMATICDOORS | &quot;AutomaticDoors&quot;
EXTERNALRAMP | &quot;ExternalRamp&quot;
INDUCTIONLOOP | &quot;InductionLoop&quot;
INTERNALRAMP | &quot;InternalRamp&quot;
LEVELACCESS | &quot;LevelAccess&quot;
LOWERLEVELCOUNTER | &quot;LowerLevelCounter&quot;
OTHER | &quot;Other&quot;
WHEELCHAIRACCESS | &quot;WheelchairAccess&quot;



