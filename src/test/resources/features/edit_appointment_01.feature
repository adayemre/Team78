@US_0011
Feature: Edit an Appointment

  Background:
    Given User is on home page
    And User navigate to login page

  @TC_0001
  Scenario Outline: Edit an appointment

    Given User provide valid "<username>" and "<password>"
    And User clicks Sign in button
    And User clicks on My Pages
    And User clicks on My Appointment
    And User Clicks Edit button
    And user provide status "<status>"
    And user provide anamnesis "<anamnesis>"
    And user provide treatment "<treatment>"
    And user provide diagnosis "<diagnosis>"
    And User click on Save
    Then User verifies success message "The Appointment is updated with identifier"
    And User clicks Sign out button

    Examples:
    |username   |password|status   |anamnesis|treatment|diagnosis|
    |doctorrecep|123Recep|COMPLETED|Headache |Majezik  |Migraine |