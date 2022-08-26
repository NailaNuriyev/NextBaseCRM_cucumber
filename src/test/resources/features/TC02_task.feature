@TC02YA
Feature: Task Creation Functionality

  Scenario: User should be able to see that task has been created
    Given user is on HelpDesk Page
    When user clicks on Task module
    And User enters info for ToDo Title and descriptions
    And then user selects deadline for TODO
    Then user should be able to see that task has been created