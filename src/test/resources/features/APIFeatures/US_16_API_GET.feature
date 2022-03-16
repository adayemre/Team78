@US_16_API_GET @US_16
Feature: Validate all rooms
  Scenario: Get room info and validate
    When set Medunna Base Url
    And send the Get request and get the response
    And set the room's expected data
    Then do the validation