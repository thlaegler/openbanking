# language: en
Feature: CallbackUrlsApi 
	

Scenario: As an API-user I want to Delete a callback URI - Bad request
	Expecting HTTP status code: 400
	Given I'm an authorized API-user
	When I request to "DELETE" to "Delete a callback URI"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 400
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Delete a callback URI - Unauthorized
	Expecting HTTP status code: 401
	Given I'm an authorized API-user
	When I request to "DELETE" to "Delete a callback URI"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 401
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Delete a callback URI - Forbidden
	Expecting HTTP status code: 403
	Given I'm an authorized API-user
	When I request to "DELETE" to "Delete a callback URI"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 403
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Delete a callback URI - Not found
	Expecting HTTP status code: 404
	Given I'm an authorized API-user
	When I request to "DELETE" to "Delete a callback URI"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 404
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Delete a callback URI - Internal Server Error
	Expecting HTTP status code: 500
	Given I'm an authorized API-user
	When I request to "DELETE" to "Delete a callback URI"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 500
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Delete a callback URI - Method Not Allowed
	Expecting HTTP status code: 405
	Given I'm an authorized API-user
	When I request to "DELETE" to "Delete a callback URI"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 405
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Delete a callback URI - Not Acceptable
	Expecting HTTP status code: 406
	Given I'm an authorized API-user
	When I request to "DELETE" to "Delete a callback URI"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 406
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Delete a callback URI - Callback URL changed
	Expecting HTTP status code: 204
	Given I'm an authorized API-user
	When I request to "DELETE" to "Delete a callback URI"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 204
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Delete a callback URI - Too Many Requests
	Expecting HTTP status code: 429
	Given I'm an authorized API-user
	When I request to "DELETE" to "Delete a callback URI"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 429
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Amend a callback URI - Bad request
	Expecting HTTP status code: 400
	Given I'm an authorized API-user
	When I request to "PUT" to "Amend a callback URI"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 400
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Amend a callback URI - Unauthorized
	Expecting HTTP status code: 401
	Given I'm an authorized API-user
	When I request to "PUT" to "Amend a callback URI"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 401
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Amend a callback URI - Forbidden
	Expecting HTTP status code: 403
	Given I'm an authorized API-user
	When I request to "PUT" to "Amend a callback URI"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 403
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Amend a callback URI - Not found
	Expecting HTTP status code: 404
	Given I'm an authorized API-user
	When I request to "PUT" to "Amend a callback URI"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 404
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Amend a callback URI - Internal Server Error
	Expecting HTTP status code: 500
	Given I'm an authorized API-user
	When I request to "PUT" to "Amend a callback URI"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 500
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Amend a callback URI - Method Not Allowed
	Expecting HTTP status code: 405
	Given I'm an authorized API-user
	When I request to "PUT" to "Amend a callback URI"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 405
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Amend a callback URI - Not Acceptable
	Expecting HTTP status code: 406
	Given I'm an authorized API-user
	When I request to "PUT" to "Amend a callback URI"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 406
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Amend a callback URI - Callback URL changed
	Expecting HTTP status code: 200
	Given I'm an authorized API-user
	When I request to "PUT" to "Amend a callback URI"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 200
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Amend a callback URI - Too Many Requests
	Expecting HTTP status code: 429
	Given I'm an authorized API-user
	When I request to "PUT" to "Amend a callback URI"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 429
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Amend a callback URI - Unsupported Media Type
	Expecting HTTP status code: 415
	Given I'm an authorized API-user
	When I request to "PUT" to "Amend a callback URI"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 415
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Read all callback URLs - Bad request
	Expecting HTTP status code: 400
	Given I'm an authorized API-user
	When I request to "GET" to "Read all callback URLs"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 400
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Read all callback URLs - Unauthorized
	Expecting HTTP status code: 401
	Given I'm an authorized API-user
	When I request to "GET" to "Read all callback URLs"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 401
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Read all callback URLs - Forbidden
	Expecting HTTP status code: 403
	Given I'm an authorized API-user
	When I request to "GET" to "Read all callback URLs"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 403
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Read all callback URLs - Not found
	Expecting HTTP status code: 404
	Given I'm an authorized API-user
	When I request to "GET" to "Read all callback URLs"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 404
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Read all callback URLs - Internal Server Error
	Expecting HTTP status code: 500
	Given I'm an authorized API-user
	When I request to "GET" to "Read all callback URLs"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 500
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Read all callback URLs - Method Not Allowed
	Expecting HTTP status code: 405
	Given I'm an authorized API-user
	When I request to "GET" to "Read all callback URLs"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 405
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Read all callback URLs - Not Acceptable
	Expecting HTTP status code: 406
	Given I'm an authorized API-user
	When I request to "GET" to "Read all callback URLs"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 406
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Read all callback URLs - An array of callback URLs
	Expecting HTTP status code: 200
	Given I'm an authorized API-user
	When I request to "GET" to "Read all callback URLs"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 200
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Read all callback URLs - Too Many Requests
	Expecting HTTP status code: 429
	Given I'm an authorized API-user
	When I request to "GET" to "Read all callback URLs"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 429
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Create a callback URL - Bad request
	Expecting HTTP status code: 400
	Given I'm an authorized API-user
	When I request to "POST" to "Create a callback URL"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 400
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Create a callback URL - Unauthorized
	Expecting HTTP status code: 401
	Given I'm an authorized API-user
	When I request to "POST" to "Create a callback URL"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 401
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Create a callback URL - Forbidden
	Expecting HTTP status code: 403
	Given I'm an authorized API-user
	When I request to "POST" to "Create a callback URL"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 403
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Create a callback URL - Internal Server Error
	Expecting HTTP status code: 500
	Given I'm an authorized API-user
	When I request to "POST" to "Create a callback URL"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 500
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Create a callback URL - Method Not Allowed
	Expecting HTTP status code: 405
	Given I'm an authorized API-user
	When I request to "POST" to "Create a callback URL"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 405
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Create a callback URL - Not Acceptable
	Expecting HTTP status code: 406
	Given I'm an authorized API-user
	When I request to "POST" to "Create a callback URL"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 406
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Create a callback URL - Callback URL created
	Expecting HTTP status code: 201
	Given I'm an authorized API-user
	When I request to "POST" to "Create a callback URL"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 201
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Create a callback URL - Too Many Requests
	Expecting HTTP status code: 429
	Given I'm an authorized API-user
	When I request to "POST" to "Create a callback URL"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 429
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

Scenario: As an API-user I want to Create a callback URL - Unsupported Media Type
	Expecting HTTP status code: 415
	Given I'm an authorized API-user
	When I request to "POST" to "Create a callback URL"
	Then the request content type is "application/json; charset&#x3D;utf-8"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 415
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

