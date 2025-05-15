Feature: Login for NopEcommerce Application

  Scenario: Checking Login Functionality
    
    Given User should launch Chome Browser 
    When User should enter url in browser
    Then User should enter "Email" and "Password" 
    Then User should Click on Login Button
    Then User should see Dashboard page 
    Then Logout of Application
    Then User should Land to Home Page

  #Scenario: Checking Logout Functionality
  #
    #Given: User should launch Chome Browser 
    #When: User should enter url in browser
    #Then: User should enter "Email" and "Password" 
    #Then: User should Click on Login Button
    #Then: User should see Dashboard page 
    #Then: Logout of Application
    #Then: User should Land to Home Page
    #Then: User should Click 'Logout' button
#	  And: Verify that user is navigated to login page
