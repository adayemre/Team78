 @US_0013UITestResultAndImpatient
 Feature: Test results and Inpatient feature

   Background: user is on the homepage
     Given Doctor is on home page
     And Doctor navigate to login page
     And capture the screenshot

    @US_0013TC_0001
   Scenario Outline: Doctor should able to see Test Results
      Given Doctor provide valid "<username>" and "<password>"
      And Doctor clicks on the sign in button
      And Doctor clicks on My Pages dropdown
      And Doctor clicks on My Appointments
      And Doctor clicks on Edit for patient button
      And Doctor clicks on Show Test Result button
      And Doctor clicks on View Result button
      And capture the screenshot
      Then Doctor should see and verify all test information
      Then Doctor clicks on Sign out button
      And capture the screenshot
   Examples: Doctor see test results
   |username   |password|
   |doctorrecep|123Recep|


    @US_0013TC_0002
    Scenario Outline: Doctor should able to request Impatient
      Given Doctor provide valid "<username>" and "<password>"
      And Doctor clicks on the sign in button
      And Doctor clicks on My Pages dropdown
      And Doctor clicks on My Appointments
      And Doctor clicks on Edit for patient button
      And Doctor clicks on Request Impatient button
      Then Doctor Verifies message "InPatient request already done for this appointment"
      And capture the screenshot
      Then Doctor clicks on Sign out button
    Examples: Doctor see test results
        |username   |password|
        |doctorrecep|123Recep|