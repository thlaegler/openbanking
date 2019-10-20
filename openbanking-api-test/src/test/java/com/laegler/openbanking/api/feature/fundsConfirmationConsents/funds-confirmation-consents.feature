# language: en
Feature: FundsConfirmationConsentsApi 
	

Scenario: As an API-user I want to Create Funds Confirmation Consent - Bad request
	Expecting HTTP status code: 400
	Given I'm an authorized API-user
	When I request to "POST" to "Create Funds Confirmation Consent"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 400
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Create Funds Confirmation Consent - Unauthorized
	Expecting HTTP status code: 401
	Given I'm an authorized API-user
	When I request to "POST" to "Create Funds Confirmation Consent"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 401
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Create Funds Confirmation Consent - Forbidden
	Expecting HTTP status code: 403
	Given I'm an authorized API-user
	When I request to "POST" to "Create Funds Confirmation Consent"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 403
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Create Funds Confirmation Consent - Not found
	Expecting HTTP status code: 404
	Given I'm an authorized API-user
	When I request to "POST" to "Create Funds Confirmation Consent"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 404
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Create Funds Confirmation Consent - Internal Server Error
	Expecting HTTP status code: 500
	Given I'm an authorized API-user
	When I request to "POST" to "Create Funds Confirmation Consent"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 500
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Create Funds Confirmation Consent - Method Not Allowed
	Expecting HTTP status code: 405
	Given I'm an authorized API-user
	When I request to "POST" to "Create Funds Confirmation Consent"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 405
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Create Funds Confirmation Consent - Not Acceptable
	Expecting HTTP status code: 406
	Given I'm an authorized API-user
	When I request to "POST" to "Create Funds Confirmation Consent"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 406
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Create Funds Confirmation Consent - Funds Confirmation Consent Created
	Expecting HTTP status code: 201
	Given I'm an authorized API-user
	When I request to "POST" to "Create Funds Confirmation Consent"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 201
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Create Funds Confirmation Consent - Too Many Requests
	Expecting HTTP status code: 429
	Given I'm an authorized API-user
	When I request to "POST" to "Create Funds Confirmation Consent"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 429
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Delete Funds Confirmation Consent - Bad request
	Expecting HTTP status code: 400
	Given I'm an authorized API-user
	When I request to "DELETE" to "Delete Funds Confirmation Consent"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 400
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Delete Funds Confirmation Consent - Unauthorized
	Expecting HTTP status code: 401
	Given I'm an authorized API-user
	When I request to "DELETE" to "Delete Funds Confirmation Consent"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 401
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Delete Funds Confirmation Consent - Forbidden
	Expecting HTTP status code: 403
	Given I'm an authorized API-user
	When I request to "DELETE" to "Delete Funds Confirmation Consent"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 403
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Delete Funds Confirmation Consent - Not found
	Expecting HTTP status code: 404
	Given I'm an authorized API-user
	When I request to "DELETE" to "Delete Funds Confirmation Consent"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 404
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Delete Funds Confirmation Consent - Internal Server Error
	Expecting HTTP status code: 500
	Given I'm an authorized API-user
	When I request to "DELETE" to "Delete Funds Confirmation Consent"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 500
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Delete Funds Confirmation Consent - Method Not Allowed
	Expecting HTTP status code: 405
	Given I'm an authorized API-user
	When I request to "DELETE" to "Delete Funds Confirmation Consent"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 405
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Delete Funds Confirmation Consent - Not Acceptable
	Expecting HTTP status code: 406
	Given I'm an authorized API-user
	When I request to "DELETE" to "Delete Funds Confirmation Consent"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 406
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Delete Funds Confirmation Consent - Funds Confirmation Consent Deleted
	Expecting HTTP status code: 204
	Given I'm an authorized API-user
	When I request to "DELETE" to "Delete Funds Confirmation Consent"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 204
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Delete Funds Confirmation Consent - Too Many Requests
	Expecting HTTP status code: 429
	Given I'm an authorized API-user
	When I request to "DELETE" to "Delete Funds Confirmation Consent"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 429
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Get Funds Confirmation Consent - Bad request
	Expecting HTTP status code: 400
	Given I'm an authorized API-user
	When I request to "GET" to "Get Funds Confirmation Consent"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 400
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Get Funds Confirmation Consent - Unauthorized
	Expecting HTTP status code: 401
	Given I'm an authorized API-user
	When I request to "GET" to "Get Funds Confirmation Consent"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 401
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Get Funds Confirmation Consent - Forbidden
	Expecting HTTP status code: 403
	Given I'm an authorized API-user
	When I request to "GET" to "Get Funds Confirmation Consent"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 403
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Get Funds Confirmation Consent - Not found
	Expecting HTTP status code: 404
	Given I'm an authorized API-user
	When I request to "GET" to "Get Funds Confirmation Consent"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 404
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Get Funds Confirmation Consent - Internal Server Error
	Expecting HTTP status code: 500
	Given I'm an authorized API-user
	When I request to "GET" to "Get Funds Confirmation Consent"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 500
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Get Funds Confirmation Consent - Method Not Allowed
	Expecting HTTP status code: 405
	Given I'm an authorized API-user
	When I request to "GET" to "Get Funds Confirmation Consent"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 405
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Get Funds Confirmation Consent - Not Acceptable
	Expecting HTTP status code: 406
	Given I'm an authorized API-user
	When I request to "GET" to "Get Funds Confirmation Consent"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 406
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Get Funds Confirmation Consent - Funds Confirmation Consent Read
	Expecting HTTP status code: 200
	Given I'm an authorized API-user
	When I request to "GET" to "Get Funds Confirmation Consent"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 200
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Get Funds Confirmation Consent - Too Many Requests
	Expecting HTTP status code: 429
	Given I'm an authorized API-user
	When I request to "GET" to "Get Funds Confirmation Consent"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 429
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

