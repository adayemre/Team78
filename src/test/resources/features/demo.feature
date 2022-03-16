@US_007
Feature:setting homepage feature


  @TC_001
  Scenario:TC_001
    Given User is on the home page
    Then user clicks make an appointment button
    And user clear the date box and enters a valid date
    And verifies that the invalid date message does not appear
    Then Close the application



