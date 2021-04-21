@login
Feature: Login Feature

 @loginVerify
	Scenario: Login with empty data
		Given Click to "Log in" link text
		When Click to "Log in" button
		Then Verify error message "Please enter your email" is displayed at "Email"
	
	Scenario: Login with invalid email
		When Input to "Email" textbox with "123"
		And Click to "Log in" button
		Then Verify error message "Wrong email" is displayed at "Email"
		And Input to "Email" textbox with "123gmail.com"
		And Click to "Log in" button
		Then Verify error message "Wrong email" is displayed at "Email"
		When Input to "Email" textbox with "123@gmail."
		And Click to "Log in" button
		Then Verify error message "Wrong email" is displayed at "Email"

	Scenario: Login with email not yet register
		When Input to "Email" textbox with "tuanla123@gmail.com"
		And Click to "Log in" button
		Then Verify error message "No customer account found" is displayed at "notification"
		
	Scenario: Login with email registed and empty password
		When Input to "Email" textbox with valid data
		And Click to "Log in" button
		Then Verify error message "The credentials provided are incorrect" is displayed at "notification"

	Scenario: Login with email registed and password invalid
		When Input to "Email" textbox with valid data
		And Click to "Log in" button
		Then Verify error message "The credentials provided are incorrect" is displayed at "notification"
	
		
 @loginValidData
	Scenario: Login with valid data	
		When Input to "Email" textbox with valid data 
		And Input to "Password" textbox with valid data
		And Click to "Log in" button
		Then Verify "Log out" link text is displayed
		