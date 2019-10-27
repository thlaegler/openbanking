# language: en
Feature: InternationalStandingOrderConsentsApi 
	

Scenario: Wrong Content-Type
	Expecting HTTP status code: 415
	Given a consumer
	When the consumer does "POST" on "https://localhost:8080/api/v1/international-standing-order-consents/international-standing-order-consents"
	And the request content type is "total/wrong"
	Then the endpoint should answer with a response
	And the response HTTP code should be 415

Scenario: Wrong Content-Type
	Expecting HTTP status code: 415
	Given a consumer
	When the consumer does "GET" on "https://localhost:8080/api/v1/international-standing-order-consents/international-standing-order-consents/{ConsentId}"
	And the request content type is "total/wrong"
	Then the endpoint should answer with a response
	And the response HTTP code should be 415

