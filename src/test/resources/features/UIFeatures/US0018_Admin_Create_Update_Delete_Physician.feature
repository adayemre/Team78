
Feature: Admin Create New Physicians

Background:
  Given user is on the homepage
  When user clicks human icon
  And user clicks sigin button
  Then user verifies signin page
  And user is sign in as a physician username "mariams" and password "789456123"



  @Create
  Scenario Outline: TC0001_admin_create_new_physicians

    And admin clicks Items and select physician from dropdown
    Then admin verify physician page
    And admin clicks Create New Physician button
    Then admin verify create edit new physician page
    And admin can choose search an existing registered person by "<SSN>"
    And admin clicks user search checkbox and search user button
    Then admin verify the success message
    And admin their info should be populated firstname, lastname birth date etc..
    And admin should provide a specialty for the Doctor
    And admin can provide a profile picture of the doctor
    Then admin verify a profile picture
    And admin should provide the Exam fee of the doctor
    And admin should choose the doctor among existing users
    And admin provide physicians country and state
    And admin clicks save button
    Then verify the success save message
    And admin finds an existing physician
    And admin clicks view button
    Then admin validate existing Physicians' info
    And admin clicks edit button
    And admin updates Physician's some data
    Then admin verify the update message
    And admin finds an existing physician
    And admin clicks delete button
   Then admin validate delete existing Physicians

    Examples: test data
    |SSN|
    |550-25-5656|


