@US_0014Doctor_can_edit_Impatient
Feature: Doctor_Edit_view_impatient feature
  Background: user is on the homepage
    When user launches the browser
    And user navigates to home page
    And user verifies home page is visible
    And user clicks PersonBox button
    And user clicks signin button
    And user verifies signin to your account is visible
    Given Doctor provide valid "senoler"
    Then user provide valid "senol123"
    And user clicks signinlast button
    Then user verifies that signed in
    Given Doctor clicks on My Pages dropdown
    Given Doctor clicks on My InpatientButton

    When doctor clicks on from date for impatient box
    Then doctor enters valid start date
    Then doctor clicks on end date of inpatient text box
    Then doctor enters valid end date

    Then Doctor should see and verify ID of InPatient information
    Then Doctor should see and verify StartDate of InPatient information
    Then Doctor should see and verify EndDate of InPatient information
    Then Doctor should see and verify Status of InPatient information
    Then Doctor should see and verify Description of InPatient information
    Then Doctor should see and verify CreatedDate of InPatient information
    Then Doctor should see and verify Room of InPatient information
    Then Doctor should see and verify Appointment of InPatient information

  And Doctor clicks on Edit button for InPatients
  Then Doctor clicks on StartDate text box
  Then Doctor provide valid Start date
  Then doctor clicks on EndDate text box
  Then doctor provide valid End date
  Then doctor clicks on CreatedDate textbox
  Then doctor provide valid date
  Then doctor clicks on Status textbox
  Then doctor provides valid status
  Then doctor clicks Save button
  Then doctor verifies the new information

  @US_0014TC_0002
  Scenario: Doctor should be able to edit inPatient Room
  And Doctor clicks on Edit button for InPatients
  And doctor clicks room textbox
  Then doctor selects any Appropriate room
  Then doctor clicks Save button
  Then doctor verifies the new information



    #Then Doctor clicks on Sign out button
    #And capture the screenshot