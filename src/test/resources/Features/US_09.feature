@US_09
Feature:  View, edit and delete Patient information, Validate them using API and DB
    Background: User goes to homepage
    Given Go to medunna.com homepage

  @US_09-TC_01
  Scenario: View patient information navigating to view portal
    When User signs in as Staff
    Then click on MY PAGES dropdown
    Then click on Search Patient button
    Then click on View button on patient info
    Then verify patient informations are visable
    Then sign out
    Then User signs in as Admin
    Then click on Items&Titiles dropdown
    Then click on Patients
    Then click on View button on patient info
    Then verify patient informations are visable
    Then sign out

  @US_09-TC_02
  Scenario: User can edit all patient information
    When User signs in as Staff
    Then click on MY PAGES dropdown
    Then click on Search Patient button
    Then click on edit button on patient info as Staff User
    Then edit the patient informations and click on save button
    Then verify patient informations are updated
    Then sign out
    Then User signs in as Admin
    Then click on Items&Titiles dropdown
    Then click on Patients
    Then click on edit button on patient info as Admin User
    Then edit the patient informations and click on save button
    Then verify patient informations are updated as Admin
    Then sign out

  @US_09-TC_03
  Scenario: User can search for a new applicant by their SSN and see all their registration info populated
    When User signs in as Staff
    Then click on MY PAGES dropdown
    Then click on Search Patient button
    Then enter a valid SSN ID in the Patients search box
    Then verify the patient informations are  invoked
    Then sign out

  @US_09-TC04
  Scenario: User should validate all patient info using API

  @US_09-TC05
  Scenario: User needs to validate all patient info from DB

  @US_09-TC06
  Scenario: User can delete any patient info
    When User signs in as Admin
    Then click on Items&Titiles dropdown
    Then click on Patients
    Then click on Delete button on the patient you want to delete
    Then click on Delete button on the opening alert
    Then verify patient is deleted
    Then sign out

  @US_09-TC07
  Scenario:All options above can be done by an Admin and staff, but staff cannot delete patients
    When sign out
    When  User signs in as Staff
    Then click on MY PAGES dropdown
    Then click on Search Patient button
    Then verify Delete button is not dispalyed
    Then sign out

  @US_09-TC08
  Scenario: Staff should be able to search the patients by their SSN ids, but Admin cannot
    When User signs in as Admin
    Then click on Items&Titiles dropdown
    Then click on Patients
    Then verify Patient Search Box is not visiable











