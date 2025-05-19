Feature: Create and Login for NopEcommerce Application
	@SmokeTest
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


  Scenario: Checking Login Functionality
    Given User should launch Chome Browser
    When User should enter url in browser
    Then User should enter "Email" and "Password"
    Then User should Click on Login Button
    Then User should see Dashboard page
    Then Logout of Application
    Then User should Land to Home Page

  Scenario: Add product to basket and verify
    Given User should launch Browser
    When User should enter url in browser
    Then User should enter email address in text box
    Then User should enter password in text box
    Then User should click signin button
    And Verify you successfully login in
    Then User should click on Hamburger icon
    Then User should click on Shop
    Then User should click Vitamins & Supplements in menu
    Then User should click on the vitamins in menu
    Then User should click on the vitamin C product
    Then User should choose a product and click on add to basket button
    Then User should click on Hamburger icon
    Then User should click on Shop
    Then User should click on Vegan
    Then User should click the Vegan chocolate in menu
    Then User should choose a product and click on the add to basket button
    Then User should click your basket icon button
    And Verify the products present in the basket

  @smoke
  Scenario: Sample 1
    Given
    When
    And


  @regression
  Scenario: Sample 2
    Given
    When
    And


  @smoke @regression
  Scenario: Sample 3
    Given
    When
    And


  @important
  Scenario: Sample 4
    Given
    When
    And
