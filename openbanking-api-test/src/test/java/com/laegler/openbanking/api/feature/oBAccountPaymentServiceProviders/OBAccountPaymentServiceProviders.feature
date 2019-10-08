# language: en
Feature: OBAccountPaymentServiceProvidersApi 
	

Scenario: As an API-user I want to Search for one or more resources - SCIM 2.0 List Response Message
	Expecting HTTP status code: 200
	Given I'm an authorized API-user
	When I request to "GET" to "Search for one or more resources"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 200
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Retrieve the resource - The retrieved resource is included in the response body
	Expecting HTTP status code: 200
	Given I'm an authorized API-user
	When I request to "GET" to "Retrieve the resource"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 200
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Search for one or more resources using HTTP POST - SCIM 2.0 List Response Message
	Expecting HTTP status code: 200
	Given I'm an authorized API-user
	When I request to "POST" to "Search for one or more resources using HTTP POST"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 200
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

