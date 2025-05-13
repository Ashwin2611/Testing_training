Feature: Add products to basket and calculate total price

Scenario: Add Multiple products to basket and calculte total 

	  Given: User should launch Browser
    When: User should enter url "" in browser
    Then: User should enter email address "" in text box
    Then: User should enter password "" in text box
    Then: User should click signin button
    And: Verify you successfully login in
    Then: User should click on hamburger icon 
    Then: User should click Vitamins & Supplements
    Then: User should click on the vitamins
    Then: User should click on the vitamin C product
    Then: User should choose any two products and click on add to basket button
    Then: User should click on hamburger icon 
    Then: User should click on Shop
    Then: User should click on Vegan
    Then: User should click the Vegan chocolate
    Then: User should choose any three products and click on the add to basket button
    Then: User should click your basket icon button
    And: Verify the product present in the basket
    And: Verify the subtotal of each product
    And: Verify the Total price of all products