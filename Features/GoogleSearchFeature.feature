Feature: feature to test google functionality
  Scenario: Validate google search is working
    Given Browser is open
    When User is on google search page
    And User enter search text in search textbox
    And User click on search button
    Then User navigates to search result

