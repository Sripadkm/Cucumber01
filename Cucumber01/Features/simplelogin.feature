Feature: feature to test the login functionality

  Scenario: Check login is successful with valid credentials
    Given user is on login page
    When user enters username and password
    And click on the login button
    Then user is navigated to the home page
