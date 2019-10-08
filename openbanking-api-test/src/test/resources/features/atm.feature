Feature: ATM API 

Scenario: As an API-user I want to get all ATM positions 
	Given I'm authorized 
	When I request to get all ATM positions 
	Then the response code should be 200 
	And the response should contain a list of ATM positions 
	And the list should have an ATM position with ID 123