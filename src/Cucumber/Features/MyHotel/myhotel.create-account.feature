Feature: my hotel create account
  Scenario: User creates an account

    Given an open browser with https://qloapps.coderslab.pl/
    When user clicks sign in button
    And enters emailAddress and clicks Create an account button
    And user fills firstName, lastName and password
    And user chooses Date of birth
    And user clicks Register button
    Then Your account has been created message appears
    And close google