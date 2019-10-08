# language: en
Feature: RegisterApi 
	

Scenario: As an API-user I want to Delete a client by way of Client ID - Unauthorized
	Expecting HTTP status code: 401
	Given I'm an authorized API-user
	When I request to "DELETE" to "Delete a client by way of Client ID"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 401
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Delete a client by way of Client ID - Forbidden
	Expecting HTTP status code: 403
	Given I'm an authorized API-user
	When I request to "DELETE" to "Delete a client by way of Client ID"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 403
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Delete a client by way of Client ID - Forbidden
	Expecting HTTP status code: 405
	Given I'm an authorized API-user
	When I request to "DELETE" to "Delete a client by way of Client ID"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 405
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Delete a client by way of Client ID - Client deleted
	Expecting HTTP status code: 204
	Given I'm an authorized API-user
	When I request to "DELETE" to "Delete a client by way of Client ID"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 204
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Get a client by way of Client ID - Unauthorized
	Expecting HTTP status code: 401
	Given I'm an authorized API-user
	When I request to "GET" to "Get a client by way of Client ID"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 401
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Get a client by way of Client ID - Forbidden
	Expecting HTTP status code: 403
	Given I'm an authorized API-user
	When I request to "GET" to "Get a client by way of Client ID"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 403
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Get a client by way of Client ID - Client registration
	Expecting HTTP status code: 200
	Given I'm an authorized API-user
	When I request to "GET" to "Get a client by way of Client ID"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 200
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Update a client by way of Client ID - Bad request
	Expecting HTTP status code: 400
	Given I'm an authorized API-user
	When I request to "PUT" to "Update a client by way of Client ID"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 400
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Update a client by way of Client ID - Unauthorized
	Expecting HTTP status code: 401
	Given I'm an authorized API-user
	When I request to "PUT" to "Update a client by way of Client ID"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 401
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Update a client by way of Client ID - Forbidden
	Expecting HTTP status code: 403
	Given I'm an authorized API-user
	When I request to "PUT" to "Update a client by way of Client ID"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 403
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Update a client by way of Client ID - Client registration
	Expecting HTTP status code: 200
	Given I'm an authorized API-user
	When I request to "PUT" to "Update a client by way of Client ID"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 200
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Register a client by way of a Software Statement Assertion - Bad request
	Expecting HTTP status code: 400
	Given I'm an authorized API-user
	When I request to "POST" to "Register a client by way of a Software Statement Assertion"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 400
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Register a client by way of a Software Statement Assertion - Client registration
	Expecting HTTP status code: 201
	Given I'm an authorized API-user
	When I request to "POST" to "Register a client by way of a Software Statement Assertion"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 201
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

