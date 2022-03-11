@US_0011
  Feature: Visibility of Appointment

    @TC_0002
    Scenario: Visibility of Appointment

      Given User on the home page
      And User navigate on login page
      And User enters valid "doctorrecep" and "123Recep"
      And User clicks Sign in
      And User click My Pages
      And User click My Appointment
      And User verifies Id
      And User verifies Start date
      And User verifies End date
      And User verifies Status
      And User verifies Physician
      And User verifies Patient
