# language: en
Feature: Upload attachements
	

Scenario: As an API-consumer I want to upload an PDF file
	Given I'm an authorized API-consumer with client credentials
	When request to upload PDF file "attachments/test_file.pdf"
	Then the response should be successful
	And the response should contain at least 1 changed loan application
