Feature: Create an Account for Holland and Barrett

  Scenario: Checking Create Account Functionality
    Given User should launch Chome Browser
    When User should enter url in browser
    Then User should enter First name in Edit box
    Then User should enter Last name in edit box
    Then User should enter Email address
    Then User should enter Confirm email address
    Then User Should enter Create a password in edit box
    Then User Should select Menus
    Then Click on Create an Account button
    Then System should display Account created sucessfully
    And Verify the title of the page

	@SmokeTest
  Scenario Outline: Login Data Driven Testing
    Given User Launch Chrome browser
    When User opens URL "<url>"
    And User enters Email as "<email>" and Password as "<password>"
    And Click on Login
    Then Page Title should be "Dashboard / nopCommerce administration"
    When User click on Log out link
    Then Page Title should be "Your store. Login"
    And close browser

    Examples: 
      | url                                     | email               | password |
      | http://admin-demo.nopcommerce.com/login | admin@yourstore.com | admin    |
      | http://admin-demo.nopcommerce.com/login | admin@yourstore.com | admin    |
      | http://admin-demo.nopcommerce.com/login | admin@yourstore.com | admin    |
      | http://admin-demo.nopcommerce.com/login | admin@yourstore.com | admin    |
      | http://admin-demo.nopcommerce.com/login | admin@yourstore.com | admin    |
      | http://admin-demo.nopcommerce.com/login | admin@yourstore.com | admin    |
