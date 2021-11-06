Feature: Basket
  As a Customer
  I Want To add product to the Basket
  So That I can buy product

  Scenario: Add a product in Basket
    Given I am on homepage
    When I Search for a product "nike"
    And I select any product
    And I add a product to trolley
    And I go to trolley
    Then I should be able to see the selected product in trolley

  Scenario: Remove a product from Basket
    Given I am on homepage
    When I Search for a product "nike"
    And I select any product
    And I add a product to trolley
    And I go to trolley
    And I remove a product from trolley
    Then I should see the empty trolley

  Scenario: Add Multiple products in Basket
    Given I am on homepage
    When I Search for a product "nike"
    And I select any product
    And I add a product to trolley
    And I continue shopping
    And I Search for a product "<adidas>"
    And I select any product
    And I add a product to trolley
    And I go to trolley
    Then I should be able to see the selected products in trolley
  @basket
  Scenario: Increase product quantity in Trolley
    Given I am on homepage
    When I Search for a product "nike"
    And I select any product
    And I add a product to trolley
    And I go to trolley
    And I increase quantity in trolley page
    Then I should be able to see increased quantity for the selected product in trolley page
