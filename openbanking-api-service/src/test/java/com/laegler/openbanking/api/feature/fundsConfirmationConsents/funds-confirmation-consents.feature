# language: en
Feature: FundsConfirmationConsentsApi 
	

Scenario: Wrong Content-Type
	Expecting HTTP status code: 415
	Given a consumer
	When the consumer does "POST" on "https://localhost:8080/open-banking/v2.3/funds-confirmation-consents/funds-confirmation-consents"
	And the request content type is "total/wrong"
	Then the endpoint should answer with a response
	And the response HTTP code should be 415

Scenario: Wrong Content-Type
	Expecting HTTP status code: 415
	Given a consumer
	When the consumer does "DELETE" on "https://localhost:8080/open-banking/v2.3/funds-confirmation-consents/funds-confirmation-consents/{ConsentId}"
	And the request content type is "total/wrong"
	Then the endpoint should answer with a response
	And the response HTTP code should be 415

Scenario: Wrong Content-Type
	Expecting HTTP status code: 415
	Given a consumer
	When the consumer does "GET" on "https://localhost:8080/open-banking/v2.3/funds-confirmation-consents/funds-confirmation-consents/{ConsentId}"
	And the request content type is "total/wrong"
	Then the endpoint should answer with a response
	And the response HTTP code should be 415

