Feature: Search
  AS a Customer
  I Want To Search for a product
  So That I can view or buy product

  Scenario: Search for product
    Given I am on homepage
    When  I Search for a product "nike"
    Then  I should be able to see the respective product
