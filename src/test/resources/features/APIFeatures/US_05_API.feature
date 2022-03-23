@API_US_05 @Smoke
Feature: Test appointment data
  Scenario: Get appointment info and validate
    When user sets the Base Url
    And user sends the GET request and get the response
    And user sets the expected data
    Then user does validation
