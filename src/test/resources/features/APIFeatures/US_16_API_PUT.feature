@US_16_API_PUT @US_16
Feature: Validate update rooms
  Scenario: Update room info and validate
    When set the Medunna Base Url
    And set updated expected data
    And send the PUT request and get the response
    Then validate updated data