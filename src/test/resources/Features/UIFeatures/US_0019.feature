@US_0019
Feature:

  Scenario Outline: Admin can search new Staff among registered people using their SSN

    Given User is on the home page
    And User clicks on account icon
    And User clicks  on Sign in
    Then User verifies if user is on the sign in page
    When User provides valid "<username>" and "<password>"
    And  User clicks on Sign in button
    Then User verifies login is success as admin
    And User clicks on items&titles
    And User clicks on staff
    And User clicks on Create a new Staff button
    Then User provides SSN of registered person "<SSN>"
    And User clicks and puts check mark on Use Search checkbox
    And User clicks on Search User button
    Then User verifies User found with search SSN message
    Then User closes the application

    Examples:
    |username|password|SSN|
    |admemre |1234    |456-68-5214|



    @US_0019_TC_0002
    Scenario Outline: User (Admin) can select a user from the existing users (registered people)

      Given User is on the home page
      And User clicks on account icon
      And User clicks  on Sign in
      Then User verifies if user is on the sign in page
      When User provides valid "<username>" and "<password>"
      And  User clicks on Sign in button
      Then User verifies login is success as admin
      And User clicks on items&titles
      And User clicks on staff
      And User clicks on Create a new Staff button
      Then User provides SSN of registered person "<SSN>"
      And User clicks and puts check mark on Use Search checkbox
      And User clicks on Search User button
      Then user clicks user dropdown and verifies if user can select user from the existing users

      Examples:
        |username|password|SSN|
        |admemre |1234    |456-68-5214|


    @US_0019_TC_0003
    Scenario Outline: User can edit their info

      Given User is on the home page
      And User clicks on account icon
      And User clicks  on Sign in
      Then User verifies if user is on the sign in page
      When User provides valid "<username>" and "<password>"
      And  User clicks on Sign in button
      Then User verifies login is success as admin
      And User clicks on items&titles
      And User clicks on staff
      And User should proceed to second page
      And User clicks on edit button
      And User edits description
      Then User clicks save button and verify success message


      Examples:
        |username|password|
        |admemre |1234    |


  @US_0019_TC_0004
  Scenario Outline: User can delete their info

    Given User is on the home page
    And User clicks on account icon
    And User clicks  on Sign in
    Then User verifies if user is on the sign in page
    When User provides valid "<username>" and "<password>"
    And  User clicks on Sign in button
    Then User verifies login is success as admin
    And User clicks on items&titles
    And User clicks on staff
    And User should proceed to second page
    And User clicks on edit button
    And User deletes description
    Then User clicks save button and verify success message


    Examples:
      |username|password|
      |admemre |1234    |