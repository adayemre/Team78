@validate_physician_db
  Feature: validate api
@validate_physician_db
    Scenario: validate_api

      Given user connect to DB
      And user gets "*" from "appointment" table
      And user reads all of the "physician_id" column data
      Then close the database connection