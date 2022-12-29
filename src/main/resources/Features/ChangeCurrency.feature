@smoke
Feature: Change currency
  Scenario:  Change currency to Euro
    Given User goes to  programs page
    And   User select tuition fees filter
    And   User clicks on Change Currency
    And   User selects EUR from currency list
    When  User save changes
    Then  currency is changed to Euro in the programs listing
    And   currency is changed to Euro in program details screen