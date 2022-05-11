Feature: Verify how Parameterisation in cucumber works 
Scenario: Passing numbers as parameter 
	Given  I have 6 and 6 
	When  I add them 
	Then  verify that addition is even 
	
Scenario: Passing string as parameter 
	Given I have first name as "shraddha" 
	When  I append last name as "wagh" 
	Then  I can see full name
	
Scenario: Passing list as parameter 
	Given I have following number:
	|20||18||16||23|
	|12||12||34||30|
	|34||10||21||54|
	When I add all element of list
	Then verify that addition is even

	
	