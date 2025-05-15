Feature: User Login and Logout functionality for Automation Exercise Application

Scenario: Login user with Valid Credentials
	Given: Launch browser
	When: Navigate to url 'http://automationexercise.com'
	And: Verify that home page is visible successfully
	Then: Click on 'Signup / Login' button
	And: Verify 'Login to your account' is visible
	Then: Enter correct email address and password
	Then: Click 'login' button
	And: Verify that 'Logged in as username' is visible
	Then: Click 'Delete Account' button
	And: Verify that 'ACCOUNT DELETED!' is visible
	
Scenario: Login user with Invalid Credentials
	Given: Launch browser
	When: Navigate to url 'http://automationexercise.com'
	And: Verify that home page is visible successfully
	Then: Click on 'Signup / Login' button
	And: Verify 'Login to your account' is visible
	Then: Enter incorrect email address and password
	Then: Click 'login' button
	And: Verify error 'Your email or password is incorrect!' is visible
	
Scenario: Logout user
	Given: Launch browser
	When: Navigate to url 'http://automationexercise.com'
	And: Verify that home page is visible successfully
	Then: Click on 'Signup / Login' button
	And: Verify 'Login to your account' is visible
	Then: Enter correct email address and password
	Then: Click 'login' button
	And: Verify that 'Logged in as username' is visible
	Then: Click 'Logout' button
	And: Verify that user is navigated to login page
