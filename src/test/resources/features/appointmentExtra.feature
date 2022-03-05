@US_007
Feature:setting homepage feature

  Background:
    Given User is on the home page

  @TC_0011
  Scenario:TC_0011
    Then user
    Then user clicks make an appointment button
    And user clear the date box and enters a valid date
#    And verifies that the invalid date message does not appear
    Then Close the application