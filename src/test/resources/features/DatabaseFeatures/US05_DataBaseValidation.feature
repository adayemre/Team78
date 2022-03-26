Feature: Appointment database validation

  @US05_Database_validation
  Scenario: Validate patient's id with DB
    Given user sets a connection with Medunna database
    And user selects id column data
    Then user validates created_by value with the database,