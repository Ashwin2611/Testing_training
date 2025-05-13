Feature: Login for NopEcommerce Application

  Scenario: Checking Login Functionality
    
    Given: User should launch Chome Browser 
    When: User should enter url in browser
    Then: User should enter "Email" and "Password" 
    Then: Click on LoigIn Button
    Then: User should see Dashboard page 
    Then: Logout of Application
    Then: User should Land to Home Page


  Scenario: Add New Customers to NopEcommerce Application
    Given: User should in Customer page
    Then: Click on Add new button
    Then: User should land on Add a new customer page
    Then: User should enter "Email"
    Then: User should enter "Password"
    Then: User should enter "First name"
    Then: User should enter "Last name"
    Then: User should choose gender 
    Then: User should enter "Company name"
    Then: User should click tax 
    
    
    And: User should see "The new customer has been added successfully"


  Scenario: Search Customer by Email
