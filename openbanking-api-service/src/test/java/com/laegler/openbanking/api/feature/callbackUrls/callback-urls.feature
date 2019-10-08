# language: en
Feature: CallbackUrlsApi 
	

Scenario: Wrong Content-Type
	Expecting HTTP status code: 415
	Given a consumer
	When the consumer does "DELETE" on "https://localhost:8080/open-banking/v2.3/callback-urls/callback-urls/{CallbackUrlId}"
	And the request content type is "total/wrong"
	Then the endpoint should answer with a response
	And the response HTTP code should be 415

Scenario: Wrong Content-Type
	Expecting HTTP status code: 415
	Given a consumer
	When the consumer does "PUT" on "https://localhost:8080/open-banking/v2.3/callback-urls/callback-urls/{CallbackUrlId}"
	And the request content type is "total/wrong"
	Then the endpoint should answer with a response
	And the response HTTP code should be 415

Scenario: Wrong Content-Type
	Expecting HTTP status code: 415
	Given a consumer
	When the consumer does "GET" on "https://localhost:8080/open-banking/v2.3/callback-urls/callback-urls"
	And the request content type is "total/wrong"
	Then the endpoint should answer with a response
	And the response HTTP code should be 415

Scenario: Wrong Content-Type
	Expecting HTTP status code: 415
	Given a consumer
	When the consumer does "POST" on "https://localhost:8080/open-banking/v2.3/callback-urls/callback-urls"
	And the request content type is "total/wrong"
	Then the endpoint should answer with a response
	And the response HTTP code should be 415

