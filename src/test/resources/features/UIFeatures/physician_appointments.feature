
@physician_appointments
Feature: My Appointments for Physician Validate Appoinments with UI

  Scenario Outline: TC0001_myappointments_with_physician_validate
    Given user is on the homepage
    When user clicks human icon
    And user clicks sigin button
    Then user verifies signin page
    And user is sign in as a physician username "<username>" and password "<password>"
    Then user verifies the physician's page
    And user clicks MyPages and select My Appointments from dropdown
    Then user verifies the My Appointments page
    Then user verifies can see their appointments list and time slots on My Appointments
    Then user verifies the user can see patient id, start date, end date, status…
    And user closes the page

    Examples: credentials
      |username |password  |
      |Jo       |789456123 |
