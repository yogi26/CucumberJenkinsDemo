Feature: SauceDemo login Feature
  Scenario Outline: Verify login functionality
    Given User opens Browser
    When User is on login page
    Then User enter will <Username> & <Password>
    And User click on login button
    Then User will navigates to the homepage

    Examples:
    |Username|Password|
    |standard_user|secret_sauce|
    |standard_user|secret_sauce|