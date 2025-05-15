Feature: Page Object Model for Customers

  Scenario: Add a new Customer
    Given User launch Egde browsere
    When User should enter the URL "https://admin-demo.nopcommerce.com/Admin/Customer/Create"
    Then User can view Add new customer page
    When User enter customer info
    And click on Save button
    Then User can view confirmation message "The new customer has been added successfully."
    And close browser
    
    

	