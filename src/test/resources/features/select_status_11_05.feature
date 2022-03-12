@US_0011
Feature: Select_Status_Part

  Background:
    Given user on home page
    And user navigate to login

  @TC_0005
  Scenario Outline: Select_Status_Part

    Given Users providing valid "<username>" and "<password>"
    And Users clicking Sign in button
    And Users clicking on My Pages
    And Users clicking on My Appointment
    And Users clicking Edit button
    And Users providing status "<status>"
    And Users providing anamnesis "<anamnesis>"
    And Users providing treatment "<treatment>"
    And Users providing diagnosis "<diagnosis>"
    And Users clicking on Save
    Then Users verifying success message "The Appointment is updated with identifier"
    And Users clicking Sign out button

    Examples:
      |username   |password|status   |anamnesis|treatment|diagnosis|
      |doctorrecep|123Recep|COMPLETED|Headache |Majezik  |Migraine |
      |doctorrecep|123Recep|PENDING  |Headache |Majezik  |Migraine |
      |doctorrecep|123Recep|CANCELED |Headache |Majezik  |Migraine |