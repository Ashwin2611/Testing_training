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