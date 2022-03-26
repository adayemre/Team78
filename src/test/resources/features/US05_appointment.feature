@US05_patient_appointment
Feature: Make_appointment_correct
  Scenario:Make_appointment_with_correct_credentials
    When user launches the browser
    And user navigates to home page
    And user verifies home page is visible
    And user clicks MakeAnAppointment button
    And user verifies Appointment page is visible

    And user sets the expected data "<firstname>", "<lastname>" "<ssn>" "<email>" "<phoneNumber>" "<date>"

    And user clicks FirstName TextBox
    Then user enters valid FirstName
    And user clicks LastName TextBox
    Then user enters valid LastName
    And user clicks SSN TextBox
    Then user enters valid SSN
    And user clicks Email TextBox
    Then user enters valid Email
    And user clicks FirstName TextBox
    Then user enters valid FirstName
    And user clicks Phone TextBox
    Then user enters valid Phone
    And user clicks AppDateTime TextBox
    Then user enters valid AppDateTime
    Then user clicks SendAnAppRequest button
    Then user validates application
    Then user saves the records corresponding file

    Then user clicks AccountMenu button
    When user clicks Register button
  And user clicks SSN TextBox at Registration page
  And user enters SSN
  And user clicks FirstName TextBox at Registration page
  And user enters firstname
  Then user clicks LastName TextBox at Registration page
  And user enters lastname
    Then user clicks username TextBox at Registration page
    And user enters username
    Then user clicks email TextBox at Registration page
    And user enters email
    Then user clicks newpassword TextBox at Registration page
    And user enters newpassword
    Then user clicks passwordconfirm TextBox at Registration page
    And user enters passwordconfirm
    Then user clicks Register button at Registration page
    And user validates registration
    Then user clicks AccountMenu button
  Then user clicks Signin button
  Then user clicks username TextBox at Signin page
  And user enters username at Signin page
  Then user clicks password button at Signinpage
  And user enters password at Signin page
  Then user clicks Signin button last

  Then user clicks myPagesPatient button
  Then user clicks myAppointments button
  Then user gets Patient id















#    Examples: appointment test data
#      |firstname|lastname|SSN|email|phone|AppDateTime|
#      |Burhan    |Dundar  |293-38-2938|burhan@gmail.com|345-867-4567|15.06.2022|




