Feature: Add products to basket

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
