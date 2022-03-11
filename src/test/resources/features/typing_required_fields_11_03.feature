@US_0011
Feature: Type Required Fields

  Background:
    Given User on home page
    And User navigate to login

  @TC_0003
  Scenario Outline: Edit an appointment

    Given User is providing valid "<username>" and "<password>"
    And User is clicking Sign in button
    And User is clicking on My Pages
    And User is clicking on My Appointment
    And User is clicking Edit button
    And user is providing status "<status>"
    And user is providing anamnesis "<anamnesis>"
    And user is providing treatment "<treatment>"
    And user is providing diagnosis "<diagnosis>"
    And User is clicking on Save
#    Then User is verifying success message "The Appointment is updated with identifier"
#    And User is clicking Sign out button

    Examples:
      |username   |password|status   |anamnesis|treatment|diagnosis|
      |doctorrecep|123Recep|COMPLETED|Headache |Majezik  |Migraine |