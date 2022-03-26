@US_16_API_POST @US_16
Feature: Validate all rooms
  Scenario: Post room info and validate
    When set  Base Url
    And set expected data
    And send the POST request and get the response
    Then validate data