@myaccount
Feature: Login Feature

	Scenario: Update Customer Info
		Given Click to "My account" link text
		When Click to "Log in" button
		Then Verify error message "Please enter your email" is displayed at "Email"