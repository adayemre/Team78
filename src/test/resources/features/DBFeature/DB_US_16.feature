@DB_US_16 @US_16
Feature: Room database validation

  Scenario: Validate room's number with DB
    Given set connection with database
    And select id column data
    Then validate room's number with the database