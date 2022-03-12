@US_0011
Feature: Prescription_and_Description_Optional

  Background:
    Given Users on home page
    And Users navigate to login

  @TC_0004
  Scenario Outline: Prescription_and_Description_Optional

    Given Users are providing valid "<username>" and "<password>"
    And Users are clicking Sign in button
    And Users are clicking on My Pages
    And Users are clicking on My Appointment
    And Users are clicking Edit button
    And Users are providing status "<status>"
    And Users are providing anamnesis "<anamnesis>"
    And Users are providing treatment "<treatment>"
    And Users are providing diagnosis "<diagnosis>"
    And Users are providing prescription "<prescription>"
    And Users are providing description "<description>"
    And Users are clicking on Save
    Then Users are verifying success message "The Appointment is updated with identifier"
    And Users are clicking Sign out button

    Examples:
      |username   |password|status   |anamnesis|treatment|diagnosis|prescription|description|
      |doctorrecep|123Recep|COMPLETED|Headache |Majezik  |Migraine |Majezik     |Migraine   |
      |doctorrecep|123Recep|COMPLETED|Headache |Majezik  |Migraine |            |           |