@AppointmentDB
Feature: appointment database validation

  @AppointmentDatabaseValidation
  Scenario Outline: Validate appointments by id with database
    Given user sets a connection with database
    And user selects all "id" coloumn data
    Then user validates appointment "<id>" with the database

    Examples: test data
      | id    |
      | 18222 |
      | 23273 |
