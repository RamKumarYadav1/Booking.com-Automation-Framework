Feature: Some other Features of Login page 

@sanity 
Scenario: Check whether the Privacy statement link is working or not 
	Given Launch the browser 
	And Open the login url "https://account.booking.com/sign-in" 
	When I click on Privacy Statement link 
	Then I should be in Privacy Statement page 
	And close the browser 
	
@sanity 
Scenario: Check whether the Terms & conditions link is working or not 
	Given Launch the browser 
	And Open the login url "https://account.booking.com/sign-in" 
	When I click on Terms & Conditions link 
	Then I should be in Customer terms of service page 
	And close the browser	 	    