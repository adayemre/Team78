@user_search_patient_bySSN
Feature: Search_Patient_bySSN
  Scenario: Staff_can_search_patient_bySSN
    When user launches the browser
    And user navigates to home page
    And user verifies home page is visible
    And user clicks PersonBox button
    And user clicks signin button
    And user verifies signin to your account is visible
    And user enters correct username and password
    And user clicks signinlast button
    Then user verifies that signed in

    Then user Click on MyPagesText button
    And select SearchPatience button at Dropbox
    Then user verifies Patiences Page
    Then user clicks SSNsearchBox
    And user enters SSN number
    Then user clicks View button
    Then user verifies related Patience page
    Then user gets patience id