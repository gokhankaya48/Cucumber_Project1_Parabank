Feature: New Account Functionality

  Background: The User login with valid credentials
    Given Navigate to Para Bank
    When The user enters valid username, password and click login button
    Then The user should login successfully

  Scenario: User creates a checking account
    When the user navigates to the account creation page
    And the user selects the account type as Checking
    And the user selects the initial balance for the checking account
    And the user clicks on the "Open New Account" button
    Then the user should receive a confirmation message with the new account number