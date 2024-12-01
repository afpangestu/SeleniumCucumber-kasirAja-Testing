Feature: kasirAja Login

  Scenario: Verify login with valid email and password
    Given User open Login page in the Browser
    When The login page is displayed
    And User input valid email and password
    And User click Login button
    Then User successfully login

  Scenario: Verify login with invalid Email and valid Password
    When The login page is displayed
    And User input invalid email and valid password
    And User click Login button
    Then User failed login

  Scenario: Verify login with valid Email and invalid Password
    When The login page is displayed
    And User input valid email and valid password
    And User click Login button
    Then User failed login