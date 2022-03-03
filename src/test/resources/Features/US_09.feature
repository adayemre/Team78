@US_09
Feature:  View, edit and delete Patient information, Validate them using API and DB
  Background:
    Given Go to medunna.com home page

  @US_09-TC_01
  Scenario: View patient information navigating to view portal
    Given User signs in as Staff
    And click on MY PAGES dropdown
    And click on Search Patient button
    And click on View button on patient info
    Then verify patient informations are visable
    Then sign out from Staff user
    And User signs in as Admin
    And click on Items&Titiles dropdown
    And click on Patients
    And click on View button on patient info
    Then verify patient informations are visable

  @US_09-TC_02
  Scenario: User can edit all patient information
    Given User signs in as Staff
    And click on MY PAGES dropdown and Search Patient button
    And click on edit button on patient info
    And  edit the patient informations and click on save button
    Then verify patient informations are updated
    Then Then sign out from Staff user
    And User signs in as Admin
    And click on Items&Titles dropdown then Patients button
    And click on Edit button on patient info
    And edit the patient informations and click on save button
    Then verify patient informations are  updated

  @US_09-TC_03
  Scenario: User can search for a new applicant by their SSN and see all their registration info populated
    Given User signs in as Staff
    And click on My Pages dropdown
    And click on Search Patient button
    And enter a valid SSN ID in the Patients search box
    Then verify the patient informations are  invoked

  @US_09-TC04
  Scenario: User should validate all patient info using API

  @US_09-TC05
  Scenario: User needs to validate all patient info from DB

  @US_09-TC06
  Scenario: User can delete any patient info
    Given signs in as Admin
    And click on Items&Titles dropdown
    And click on Patient button
    And click on Delete button on the patient you want to delete
    And click on Delete button on the opening alert
    Then verify patient is deleted

  @US_09-TC07
  Scenario:All options above can be done by an Admin and staff, but staff cannot delete patients
    Given  User signs in as Staff
    And click on My Pages dropdown
    And click on Search Patient button
    Then verify Delete button is not dispalyed

  @US_09-TC08
  Scenario: Staff should be able to search the patients by their SSN ids, but Admin cannot
    Given User signs in as Admin
    And click on Items&Titles dropdown
    And click on Patient button
    Then verify Patient Search Box is not visiable











