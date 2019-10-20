# language: en
Feature: EventNotificationsApi 
	

Scenario: As an API-user I want to Send an event notification - Accepted
	Expecting HTTP status code: 202
	Given I'm an authorized API-user
	When I request to "POST" to "Send an event notification"
	Then the request content type is "application/jwt"
	And the request body is ""
	Then the endpoint should answer with a response
	And the response code should be 202
	And the response content type should be "application/prs.openbanking.opendata.v2.3+json"
	And the response body should be ""

