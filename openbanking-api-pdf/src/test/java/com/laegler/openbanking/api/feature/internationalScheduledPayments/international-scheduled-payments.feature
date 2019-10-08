# language: en
Feature: InternationalScheduledPaymentsApi 
	

Scenario: Wrong Content-Type
	Expecting HTTP status code: 415
	Given a consumer
	When the consumer does "POST" on "https://localhost:8080/open-banking/v2.3/international-scheduled-payments/international-scheduled-payments"
	And the request content type is "total/wrong"
	Then the endpoint should answer with a response
	And the response HTTP code should be 415

Scenario: Wrong Content-Type
	Expecting HTTP status code: 415
	Given a consumer
	When the consumer does "GET" on "https://localhost:8080/open-banking/v2.3/international-scheduled-payments/international-scheduled-payments/{InternationalScheduledPaymentId}"
	And the request content type is "total/wrong"
	Then the endpoint should answer with a response
	And the response HTTP code should be 415

Scenario: Wrong Content-Type
	Expecting HTTP status code: 415
	Given a consumer
	When the consumer does "GET" on "https://localhost:8080/open-banking/v2.3/international-scheduled-payments/international-scheduled-payments/{InternationalScheduledPaymentId}/payment-details"
	And the request content type is "total/wrong"
	Then the endpoint should answer with a response
	And the response HTTP code should be 415

