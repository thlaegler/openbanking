
# BranchResponseBranch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessibility** | [**List&lt;AccessibilityEnum&gt;**](#List&lt;AccessibilityEnum&gt;) | Accessibility is the ability and ease a customer can access a service, good, associate, or facility. Features which make the Bank accessible to disabled people |  [optional]
**availability** | [**Availability**](Availability.md) |  |  [optional]
**contactInfo** | [**List&lt;BranchResponseContactInfo&gt;**](BranchResponseContactInfo.md) | Communication device number or electronic address used for communication. |  [optional]
**customerSegment** | [**List&lt;CustomerSegmentEnum&gt;**](#List&lt;CustomerSegmentEnum&gt;) | The marketing segment which the branch is able to address in terms of customer type. Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another | 
**identification** | **String** | Unique and unambiguous identification of a branch of a financial institution. | 
**name** | **String** | Name by which a branch is known and which is usually used to identify that branch. |  [optional]
**note** | **String** | Summary description of services, facility and availability. |  [optional]
**otherAccessibility** | [**List&lt;BranchResponseOtherAccessibility&gt;**](BranchResponseOtherAccessibility.md) | Enter any new code , name and description for any other Accessibility |  [optional]
**otherCustomerSegment** | [**List&lt;BranchResponseOtherCustomerSegment&gt;**](BranchResponseOtherCustomerSegment.md) | Enter a new code , name and description for any other Customer Segment |  [optional]
**otherServiceAndFacility** | [**List&lt;BranchResponseOtherServiceAndFacility&gt;**](BranchResponseOtherServiceAndFacility.md) | Enter any new code , name and description for any Other Facility |  [optional]
**photo** | **String** | Image related to the branch |  [optional]
**postalAddress** | [**PostalAddress1**](PostalAddress1.md) |  | 
**sequenceNumber** | **String** | Sequence Number that is used in conjunction with Identification to uniquely identify a branch. Physical branches should have 0 assigned, mobile and sub branches should have 1,2,3....etc. assigned. | 
**serviceAndFacility** | [**List&lt;ServiceAndFacilityEnum&gt;**](#List&lt;ServiceAndFacilityEnum&gt;) | Service/Facilities offered at a branch. |  [optional]
**sortCode** | **List&lt;String&gt;** | United Kingdom (UK) Sort Code - identifies British financial institutions on the British national clearing systems. The sort code, which is a six-digit number, is usually formatted as three pairs of numbers, for example 12-34-56. It identifies both the bank and the branch(s) where the account is held. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Codeset to indicate if a branch is physically in 1 location or is mobile | 


<a name="List<AccessibilityEnum>"></a>
## Enum: List&lt;AccessibilityEnum&gt;
Name | Value
---- | -----
AUTOMATICDOORS | &quot;AutomaticDoors&quot;
AUDIOCASHMACHINE | &quot;AudioCashMachine&quot;
EXTERNALRAMP | &quot;ExternalRamp&quot;
HELPINGHANDUNIT | &quot;HelpingHandUnit&quot;
INDUCTIONLOOP | &quot;InductionLoop&quot;
INTERNALRAMP | &quot;InternalRamp&quot;
LEVELACCESS | &quot;LevelAccess&quot;
LOWERLEVELCOUNTER | &quot;LowerLevelCounter&quot;
OTHER | &quot;Other&quot;
WHEELCHAIRACCESS | &quot;WheelchairAccess&quot;


<a name="List<CustomerSegmentEnum>"></a>
## Enum: List&lt;CustomerSegmentEnum&gt;
Name | Value
---- | -----
BUSINESS | &quot;Business&quot;
CORPORATE | &quot;Corporate&quot;
OTHER | &quot;Other&quot;
PERSONAL | &quot;Personal&quot;
PRIVATE | &quot;Private&quot;
PREMIER | &quot;Premier&quot;
SELECT | &quot;Select&quot;
SME | &quot;SME&quot;
WEALTH | &quot;Wealth&quot;


<a name="List<ServiceAndFacilityEnum>"></a>
## Enum: List&lt;ServiceAndFacilityEnum&gt;
Name | Value
---- | -----
ASSISTEDSERVICECOUNTER | &quot;AssistedServiceCounter&quot;
EXTERNALATM | &quot;ExternalATM&quot;
ACCOUNTVERIFICATIONSERVICE | &quot;AccountVerificationService&quot;
BUSINESSCOUNTER | &quot;BusinessCounter&quot;
BUREAUDECHANGE | &quot;BureauDeChange&quot;
BUSINESSDEPOSITTERMINAL | &quot;BusinessDepositTerminal&quot;
BUSINESSITSUPPORT | &quot;BusinessITSupport&quot;
CARDISSUANCEFACILITY | &quot;CardIssuanceFacility&quot;
COLLECTIONLOCKERS | &quot;CollectionLockers&quot;
COUNTERSERVICES | &quot;CounterServices&quot;
EXTERNALQUICKSERVICEPOINT | &quot;ExternalQuickServicePoint&quot;
INTERNALQUICKSERVICEPOINT | &quot;InternalQuickServicePoint&quot;
INTERNALATM | &quot;InternalATM&quot;
LODGEMENTDEVICE | &quot;LodgementDevice&quot;
MORTGAGEADVISOR | &quot;MortgageAdvisor&quot;
MEETINGROOMS | &quot;MeetingRooms&quot;
NIGHTSAFE | &quot;NightSafe&quot;
ONLINEBANKINGPOINT | &quot;OnlineBankingPoint&quot;
ONDEMANDCURRENCY | &quot;OnDemandCurrency&quot;
OTHER | &quot;Other&quot;
PARKING | &quot;Parking&quot;
PREMIERCOUNTER | &quot;PremierCounter&quot;
QUICKDEPOSIT | &quot;QuickDeposit&quot;
SATURDAYCOUNTERSERVICE | &quot;SaturdayCounterService&quot;
STATEMENTPRINTER | &quot;StatementPrinter&quot;
SELFSERVICEACCOUNTOPENING | &quot;SelfServiceAccountOpening&quot;
VIDEOBANKING | &quot;VideoBanking&quot;
WIFI | &quot;WiFi&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
MOBILE | &quot;Mobile&quot;
PHYSICAL | &quot;Physical&quot;



