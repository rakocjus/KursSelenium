Feature: my store create account
  Scenario: User creates an account

    Given an open browser with https://prod-kurs.coderslab.pl/index.php
    When user clicks Sign in button
    And  user clicks No account? Create one here link
    And user fills firstName, lastName emailAddress and password
    And user choose Date of birth
    And user clicks Save button
    Then Home page is displayed
    And close google page