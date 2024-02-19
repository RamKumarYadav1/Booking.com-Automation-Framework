Feature: Login Data Driven Test 

Scenario Outline: Login data driven testing 
	Given Launch the browser 
	And Open the login url "https://account.booking.com/sign-in" 
	Then Enter valid email address as "<email>" 
	And Click on continue button 
	Then Enter valid password as "<password>" 
	And Click on sign in button 
	And close the browser 
	
	Examples: 
		| email | password | 
		| Ramkumar71000@gmail.com | Abcde@11111 | 
		| Rahulkumar2020@gmail.com | Abcde@22222 | 
		| SurajSingh3030@gmail.com | Abcde@33333 | 
		| AmanRathore4040@gmail.com | Abcde@44444 |
		| Santoshkumar5050@gmail.com | Abcde@55555 | 
		| Daniel6060@gmail.com | Abcde@666666 |
		| Michael7070@gmail.com | Abcde@77777 | 
		
		
		
	    