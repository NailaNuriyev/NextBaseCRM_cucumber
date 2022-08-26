@login
Feature: Login Functionality

  Scenario: User should be able to login to Help Desk
    Given user am on NextBaseCRM Login page
    When user enter help desk user name
    And user enter help desk pass word
    And user click login button
    Then user should see Activity Stream
