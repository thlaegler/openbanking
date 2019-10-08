# openbanking

Open Banking API stub generator project using Open API specification

## TL;DR

```
$ mvn clean install -Pgenerate,docu
$ mvn clean install javadoc:javadoc pdf:pdf site:site -Pgenerate,docu
```

## Artifacts

* openbanking-api-codegen: Code generator
* openbanking-api-codegen-maven-plugin: Code generator Maven plugin
* openbanking-api-docs: Contains all relevant documents (input as well as generated)
    - OpenAPI input files (this is where your swagger.yaml goes!)
    - Swagger UI
    - Documentation (HTML, PDF, etc)
    - JavaDoc
    - Test results
    - Test reports
    - Maven Site
* openbanking-api-pdf: API PDF documentation generator module
* openbanking-api-model: API model
* openbanking-api-soap-transform: SOAP-REST transformation
* openbanking-api-definition: API interfaces
* openbanking-api-service: API implementations packaged in war-file
* openbanking-api-spring-boot: Spring Boot application using above modules; used to run intergration/remote tests against
* openbanking-api-server: Java Apache CXF server
* openbanking-api-client: Java Apache CXF client
* openbanking-api-nodejs: Node.js server
* openbanking-api-test: Integration/remote tests against Spring Boot test instance; outputs into openbanking-api-docs project below


## Open Banking

* [Specification](https://openbanking.atlassian.net/wiki/spaces/DZ/pages/16385802/Specifications)
* [more Information](https://openbanking.org.uk)


### Read/Write Data API 3.12

* Account Information & Transaction API
    - Account Access Consents/ Account Requests
    - Accounts
    - Balances
    - Transactions
    - Beneficiaries
    - Direct Debits
    - Standing Orders
    - Products
    - Offers
    - Parties
    - Scheduled Payments
    - Statements
* Payment Initiation API
    - Domestic Payments
    - Domestic Scheduled Payments
    - Domestic Standing Orders
    - International Payments
    - International Scheduled Payments
    - International Standing Orders
    - File Payments
    - Domestic Payments Message Format
* Confirmation of Funds API
    - Funds Confirmation Constents
    - Funds Confirmation
* Event Notification API
    - Events Notification Subscription
    - Callback URL
    - Realtime Event Notification
    - Aggregated Polling
* Dynamic Client Registration API


### Open Data API 2.3

* Branch API
* BCA API
* PCA API
* ATM API
* CCC API
* SME Loan API
* FCA Service Metrics API 1.0
* CMA SQM API 1.0.1


### Open Banking Directory API / OB*

* Telephony Validation API
* OAuth 2.0 Consent
* Password Management
* Accounts Resource Type
* External Identity
* Account Management
* Session
* Email Validation


### SCIM 2.0 Protocol (RFC7644) / OB*

* Authorities Resource Type
* Account Payment Service Providers Resource Type
* Third Party Providers Resource Type