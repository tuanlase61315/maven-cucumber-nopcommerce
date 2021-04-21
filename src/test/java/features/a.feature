@register
Feature: Register Feature


	@registerValid
	Scenario: Register User With Valid Data
		Given Click to "Register" link text
		When Select to Gender raido
		And Input to "FirstName" textbox with valid data
		And Input to "LastName" textbox with valid data
		And Select Date Of Birth dropdown
		And Input to "Email" textbox with valid data
		And Input to "Company" textbox with valid data
		And Input to "Password" textbox with valid data
		And Input to "ConfirmPassword" textbox with valid data
		And Click to "Register" button
		Then Verify Register Message is displayed
		Then Click to "Log out" link text
		

 @verifyRegister
	Scenario: Register with empty data
		Given Click to "Register" link text
		When Click to "Register" button
		Then Verify error message "First name is required." is displayed at "FirstName"
		And Verify error message "Last name is required." is displayed at "LastName"
		And Verify error message "Email is required." is displayed at "Email" 
		And Verify error message "Password is required." is displayed at "Password"
		And Verify error message "Password is required." is displayed at "ConfirmPassword"
		
	Scenario: Register User With Invalid Email
		When Input to "Email" textbox with "123"
		And Click to "Register" button
		Then Verify error message "Wrong email" is displayed at "Email"
		And Input to "Email" textbox with "123gmail.com"
		And Click to "Register" button
		Then Verify error message "Wrong email" is displayed at "Email"
		When Input to "Email" textbox with "123@gmail."
		And Click to "Register" button
		Then Verify error message "Wrong email" is displayed at "Email"
	
	Scenario: Register User With Email Already Exists	
		When Input to "Email" textbox with valid data
		And Input to "FirstName" textbox with valid data
		And Input to "LastName" textbox with valid data
		And Select Date Of Birth dropdown
		And Input to "Company" textbox with valid data
		And Input to "Password" textbox with valid data
		And Input to "ConfirmPassword" textbox with valid data
		And Click to "Register" button
		Then Verify error message "The specified email already exists" is displayed at "notification" 

	Scenario: Register User With Password less than 6 character
		When Input to "Password" textbox with "123"
		And Click to "Register" button
		Then Verify error message "Password must meet the following rules:" is displayed at "Password"
		Then Verify error message "must have at least 6 characters" is displayed at "Password"

	Scenario: Register User With Password And Confirm Password do not match
		When Input to "Password" textbox with "123123"
		And Input to "ConfirmPassword" textbox with "123321"
		And Click to "Register" button
		Then Verify error message "The password and confirmation password do not match." is displayed at "ConfirmPassword"
	
 

