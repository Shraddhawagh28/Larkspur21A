Feature: This feature verifies all functionality of  ijmeet home page file 

	Scenario: Verify redirection on Quick join Meeting page
	//Given  Chrome browser is opened and ijmeet application is launched
	When  user clik on join meeting from homepage
	Then Verify thst user redirects on Quick join Meeting page
	
	Scenario: Verify title of IJMeet home page
	Then verify title of ijmeet homepage is "IJmeet"
