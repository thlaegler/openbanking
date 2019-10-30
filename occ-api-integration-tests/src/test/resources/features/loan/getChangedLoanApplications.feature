# language: en
Feature: Get changed Loan Applications since certain date
	

Scenario: As an API-consumer I want to get changed loan applications
	Given I'm an authorized API-consumer with client credentials
	When request to GET changed loan applications by changed date "2019-10-28"
	Then the response should be successful
	And the response should contain at least 1 changed loan application

Scenario: As an API-consumer I cannot get changed loan applications by invalid date
	Given I'm an authorized API-consumer with client credentials
	When request to GET changed loan applications by changed date "09.06.1986"
	Then the response code should be 500
	And the response should contain exactly 1 error
	And the error message should be "Invalid Date"