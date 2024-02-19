Feature: Login Module 

@sanity
Scenario: Login using valid email address and valid password 
	Given Launch the browser 
	And Open the login url "https://account.booking.com/sign-in" 
	Then Enter valid email address as "Ramkumar71000@gmail.com" 
	And Click on continue button 
	Then Enter valid password as "Abcde@11111" 
	And Click on sign in button 
	And close the browser 
	
Scenario: Login using invalid email address and valid password 
	Given Launch the browser 
	And Open the login url "https://account.booking.com/sign-in" 
	Then Enter invalid email address as "Ramkumar71000@vgf" 
	And Click on continue button 
	And close the browser 
	
Scenario: Login using valid email address and invalid password 
	Given Launch the browser 
	And Open the login url "https://account.booking.com/sign-in" 
	Then Enter valid email address as "Ramkumar71000@gmail.com" 
	And Click on continue button 
	Then Enter invalid password as "nmscs1221" 
	And Click on sign in button 
	And close the browser 
	
Scenario: Login using valid email address and blank password 
	Given Launch the browser 
	And Open the login url "https://account.booking.com/sign-in" 
	Then Enter valid email address as "Ramkumar71000@gmail.com" 
	And Click on continue button 
	Then Enter blank password as "" 
	And Click on sign in button 
	And close the browser 
	
Scenario: Login using blank email address 
	Given Launch the browser 
	And Open the login url "https://account.booking.com/sign-in" 
	Then Enter blank email address as "" 
	And Click on continue button 
	And close the browser 
  