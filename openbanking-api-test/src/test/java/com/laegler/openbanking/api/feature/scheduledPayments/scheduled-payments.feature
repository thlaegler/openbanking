# language: en
Feature: ScheduledPaymentsApi 
	

Scenario: As an API-user I want to Get Scheduled Payments - Bad request
	Expecting HTTP status code: 400
	Given I'm an authorized API-user
	When I request to "GET" to "Get Scheduled Payments"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 400
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Get Scheduled Payments - Unauthorized
	Expecting HTTP status code: 401
	Given I'm an authorized API-user
	When I request to "GET" to "Get Scheduled Payments"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 401
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Get Scheduled Payments - Forbidden
	Expecting HTTP status code: 403
	Given I'm an authorized API-user
	When I request to "GET" to "Get Scheduled Payments"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 403
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Get Scheduled Payments - Not found
	Expecting HTTP status code: 404
	Given I'm an authorized API-user
	When I request to "GET" to "Get Scheduled Payments"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 404
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Get Scheduled Payments - Internal Server Error
	Expecting HTTP status code: 500
	Given I'm an authorized API-user
	When I request to "GET" to "Get Scheduled Payments"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 500
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Get Scheduled Payments - Method Not Allowed
	Expecting HTTP status code: 405
	Given I'm an authorized API-user
	When I request to "GET" to "Get Scheduled Payments"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 405
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Get Scheduled Payments - Not Acceptable
	Expecting HTTP status code: 406
	Given I'm an authorized API-user
	When I request to "GET" to "Get Scheduled Payments"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 406
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Get Scheduled Payments - Scheduled Payments Read
	Expecting HTTP status code: 200
	Given I'm an authorized API-user
	When I request to "GET" to "Get Scheduled Payments"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 200
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Get Scheduled Payments - Too Many Requests
	Expecting HTTP status code: 429
	Given I'm an authorized API-user
	When I request to "GET" to "Get Scheduled Payments"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 429
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

