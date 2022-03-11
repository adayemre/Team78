Feature: patient database validation

  @DB_US_09
  Scenario: Validate patient's eMail with DB
    Given user sets a connection with database
    And user selects all email column data
    Then user validates patient's eMail with the database