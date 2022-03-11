@UI_US_09 @Smoke
Feature:  View, edit and delete Patient information, Validate them using API and DB
  Background: User goes to homepage
    Given Go to medunna.com homepage

  @AdminFunctions
  Scenario: Admin View patient information navigating to view portal
    Then User signs in as Admin
    Then click on Items&Titiles dropdown
    Then click on Patients
    Then click on View button on patient info
    Then verify patient informations are visable

  Scenario: Admin can edit all patient information
    Then click on Items&Titiles dropdown
    Then click on Patients
    Then click on edit button on patient info as Admin User
    Then edit the patient informations and click on save button
    Then verify patient informations are updated as Admin

  Scenario: Admin can delete any patient info
    Then click on Items&Titiles dropdown
    Then click on Patients
    Then click on Delete button on the patient you want to delete
    Then click on Delete button on the opening alert
    Then verify patient is deleted

  Scenario: Staff should be able to search the patients by their SSN ids, but Admin cannot
    Then click on Items&Titiles dropdown
    Then click on Patients
    Then verify Patient Search Box is not visiable
    Then sign out

  @UStaffFunctions
  Scenario: Staff View patient information navigating to view portal
    When User signs in as Staff
    Then click on MY PAGES dropdown
    Then click on Search Patient button
    Then click on View button on patient info
    Then verify patient informations are visable

  Scenario: Staff can edit all patient information
    Then click on MY PAGES dropdown
    Then click on Search Patient button
    Then click on edit button on patient info as Staff User
    Then edit the patient informations and click on save button
    Then verify patient informations are updated

  Scenario: Staff can search for a new applicant by their SSN and see all their registration info populated
    Then click on MY PAGES dropdown
    Then click on Search Patient button
    Then enter a valid SSN ID in the Patients search box
    Then verify the patient informations are  invoked

  Scenario:All options above can be done by an Admin and staff, but staff cannot delete patients
    Then click on MY PAGES dropdown
    Then click on Search Patient button
    Then verify Delete button is not dispalyed

