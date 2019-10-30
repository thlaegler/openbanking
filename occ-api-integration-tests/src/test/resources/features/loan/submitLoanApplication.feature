# language: en
Feature: Submit a new Loan Application
	

Scenario: As an API-consumer I want to submit a new loan application
	Given I'm an authorized API-consumer with client credentials
	When request to submit a loan application with request "loan/application-submission-creation-success.json"
	Then the response should be successful
	And the response should contain at least 1 loan application