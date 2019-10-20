# language: en
Feature: CertificateApi 
	

Scenario: As an API-user I want to Validate certificate - Bad Request
	Expecting HTTP status code: 400
	Given I'm an authorized API-user
	When I request to "POST" to "Validate certificate"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 400
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Validate certificate - Unauthorized
	Expecting HTTP status code: 401
	Given I'm an authorized API-user
	When I request to "POST" to "Validate certificate"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 401
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Validate certificate - Not found
	Expecting HTTP status code: 404
	Given I'm an authorized API-user
	When I request to "POST" to "Validate certificate"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 404
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Validate certificate - Internal Server Error
	Expecting HTTP status code: 500
	Given I'm an authorized API-user
	When I request to "POST" to "Validate certificate"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 500
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Validate certificate - Not Acceptable
	Expecting HTTP status code: 406
	Given I'm an authorized API-user
	When I request to "POST" to "Validate certificate"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 406
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Validate certificate - Bad Gateway
	Expecting HTTP status code: 502
	Given I'm an authorized API-user
	When I request to "POST" to "Validate certificate"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 502
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Validate certificate - OK
	Expecting HTTP status code: 200
	Given I'm an authorized API-user
	When I request to "POST" to "Validate certificate"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 200
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

