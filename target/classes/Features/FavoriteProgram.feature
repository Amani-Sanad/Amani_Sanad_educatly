@smoke
Feature: Favorite a program
  Scenario:  Favorite a program from programs page
    Given User logged in successfully
    And   User opens programs page
    And   User clicks more details
    When  User clicks on favorite icon
    And   User opens Dashboard
    And   User opens favorites section
    Then  The selected programs appear on favorites
