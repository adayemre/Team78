@US_007
Feature:setting homepage feature

  Background:
    Given User is on the home page

  @TC_0011
  Scenario:TC_0001
  Then user clicks make an appointment button
    And user clear the date box and enters a valid date
#    And verifies that the invalid date message does not appear
    Then Close the application



  @TC_0022
  Scenario:TC_0001
    Then user clicks make an appointment button
    And user clear the date box and enters a past date
    And verifies that the invalid date message visible
    Then Close the application


  @TC_0033
  Scenario:TC_0001
    Then user clicks make an appointment button
#    And the order of date should be mm_dd_yyyy format  #Alamıyor texti
    Then Close the application





