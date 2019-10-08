# language: en
Feature: PersonalCurrentAccountsApi 
	

Scenario: As an API-user I want to  - You have sent a request which could not be understood.
	Expecting HTTP status code: 400
	Given I'm an authorized API-user
	When I request to "GET" to ""
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 400
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to  - An error occurred on the server. No further information is available.
	Expecting HTTP status code: 500
	Given I'm an authorized API-user
	When I request to "GET" to ""
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 500
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to  - The service is temporarily unavailable.
	Expecting HTTP status code: 503
	Given I'm an authorized API-user
	When I request to "GET" to ""
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 503
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to  - Successful response with a list of &#x60;Personal Current Account&#x60; data
	Expecting HTTP status code: 200
	Given I'm an authorized API-user
	When I request to "GET" to ""
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 200
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to  - Your client has failed to submit a request, and a timeout has occurred.
	Expecting HTTP status code: 408
	Given I'm an authorized API-user
	When I request to "GET" to ""
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 408
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to  - You have requested this resource too often. Slow down.
	Expecting HTTP status code: 429
	Given I'm an authorized API-user
	When I request to "GET" to ""
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 429
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

