# language: en
Feature: BalancesApi 
	

Scenario: Wrong Content-Type
	Expecting HTTP status code: 415
	Given a consumer
	When the consumer does "GET" on "https://localhost:8080/open-banking/v2.3/balances/balances"
	And the request content type is "total/wrong"
	Then the endpoint should answer with a response
	And the response HTTP code should be 415

