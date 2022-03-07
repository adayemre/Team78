@US_007
Feature:setting homepage feature

  Background:
    Given User is on the home page

  @TC_001
  Scenario:TC_001
  Then user clicks make an appointment button
    And user clear the date box and enters a valid date
    And verifies that the invalid date message does not appear
    Then Close the application



  @TC_002
  Scenario:TC_002
    Then user clicks make an appointment button
    And user clear the date box and enters a past date
    And verifies that the invalid date message visible
    Then Close the application


  @TC_003
  Scenario:TC_003
    Then user clicks make an appointment button
#    And the order of date should be mm_dd_yyyy format     #####Alamıyor texti
    Then Close the application






