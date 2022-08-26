@TC01
Feature:Poll functionality

  #Hanna's first comandpus


  Scenario: user should be able to see the error message after skipping the poll title
    Given user logged in as Helpdesk
    When user navigates to pool
    And user Adds question
    And user adds 3 possible answers
    And user clicks send btn
    Then user should see ""The message title is not specified"" error msg"




