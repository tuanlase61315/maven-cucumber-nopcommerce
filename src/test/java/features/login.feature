@login
Feature: Login Feature

 @loginValidData
	Scenario: Login with valid data
		Given Click to "Log in" link text
		When Input to "Email" textbox with valid data 
		And Input to "Password" textbox with valid data
		And Click to "Log in" button
		Then Verify "Log out" link text is displayed
		