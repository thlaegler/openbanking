# language: en
Feature: InternationalStandingOrdersApi 
	

Scenario: As an API-user I want to Create International Standing Orders - Bad request
	Expecting HTTP status code: 400
	Given I'm an authorized API-user
	When I request to "POST" to "Create International Standing Orders"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 400
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Create International Standing Orders - Unauthorized
	Expecting HTTP status code: 401
	Given I'm an authorized API-user
	When I request to "POST" to "Create International Standing Orders"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 401
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Create International Standing Orders - Forbidden
	Expecting HTTP status code: 403
	Given I'm an authorized API-user
	When I request to "POST" to "Create International Standing Orders"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 403
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Create International Standing Orders - Not found
	Expecting HTTP status code: 404
	Given I'm an authorized API-user
	When I request to "POST" to "Create International Standing Orders"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 404
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Create International Standing Orders - Internal Server Error
	Expecting HTTP status code: 500
	Given I'm an authorized API-user
	When I request to "POST" to "Create International Standing Orders"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 500
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Create International Standing Orders - Method Not Allowed
	Expecting HTTP status code: 405
	Given I'm an authorized API-user
	When I request to "POST" to "Create International Standing Orders"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 405
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Create International Standing Orders - Not Acceptable
	Expecting HTTP status code: 406
	Given I'm an authorized API-user
	When I request to "POST" to "Create International Standing Orders"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 406
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Create International Standing Orders - International Standing Orders Created
	Expecting HTTP status code: 201
	Given I'm an authorized API-user
	When I request to "POST" to "Create International Standing Orders"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 201
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Create International Standing Orders - Too Many Requests
	Expecting HTTP status code: 429
	Given I'm an authorized API-user
	When I request to "POST" to "Create International Standing Orders"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 429
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Get International Standing Orders - Bad request
	Expecting HTTP status code: 400
	Given I'm an authorized API-user
	When I request to "GET" to "Get International Standing Orders"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 400
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Get International Standing Orders - Unauthorized
	Expecting HTTP status code: 401
	Given I'm an authorized API-user
	When I request to "GET" to "Get International Standing Orders"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 401
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Get International Standing Orders - Forbidden
	Expecting HTTP status code: 403
	Given I'm an authorized API-user
	When I request to "GET" to "Get International Standing Orders"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 403
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Get International Standing Orders - Not found
	Expecting HTTP status code: 404
	Given I'm an authorized API-user
	When I request to "GET" to "Get International Standing Orders"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 404
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Get International Standing Orders - Internal Server Error
	Expecting HTTP status code: 500
	Given I'm an authorized API-user
	When I request to "GET" to "Get International Standing Orders"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 500
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Get International Standing Orders - Method Not Allowed
	Expecting HTTP status code: 405
	Given I'm an authorized API-user
	When I request to "GET" to "Get International Standing Orders"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 405
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Get International Standing Orders - Not Acceptable
	Expecting HTTP status code: 406
	Given I'm an authorized API-user
	When I request to "GET" to "Get International Standing Orders"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 406
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Get International Standing Orders - International Standing Orders Read
	Expecting HTTP status code: 200
	Given I'm an authorized API-user
	When I request to "GET" to "Get International Standing Orders"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 200
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Get International Standing Orders - Too Many Requests
	Expecting HTTP status code: 429
	Given I'm an authorized API-user
	When I request to "GET" to "Get International Standing Orders"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 429
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Get Payment Details - Bad request
	Expecting HTTP status code: 400
	Given I'm an authorized API-user
	When I request to "GET" to "Get Payment Details"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 400
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Get Payment Details - Unauthorized
	Expecting HTTP status code: 401
	Given I'm an authorized API-user
	When I request to "GET" to "Get Payment Details"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 401
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Get Payment Details - Forbidden
	Expecting HTTP status code: 403
	Given I'm an authorized API-user
	When I request to "GET" to "Get Payment Details"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 403
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Get Payment Details - Not found
	Expecting HTTP status code: 404
	Given I'm an authorized API-user
	When I request to "GET" to "Get Payment Details"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 404
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Get Payment Details - Internal Server Error
	Expecting HTTP status code: 500
	Given I'm an authorized API-user
	When I request to "GET" to "Get Payment Details"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 500
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Get Payment Details - Method Not Allowed
	Expecting HTTP status code: 405
	Given I'm an authorized API-user
	When I request to "GET" to "Get Payment Details"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 405
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Get Payment Details - Not Acceptable
	Expecting HTTP status code: 406
	Given I'm an authorized API-user
	When I request to "GET" to "Get Payment Details"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 406
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Get Payment Details - Payment Details Read
	Expecting HTTP status code: 200
	Given I'm an authorized API-user
	When I request to "GET" to "Get Payment Details"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 200
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Get Payment Details - Too Many Requests
	Expecting HTTP status code: 429
	Given I'm an authorized API-user
	When I request to "GET" to "Get Payment Details"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 429
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

