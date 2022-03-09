@US_006
Feature:setting homepage feature

  Background:
    Given User is on the home page
    And User navigates to login page
    Then Verify if user is on the sign in page

  @TC_0001
  Scenario Outline:TC_0001

    When User provides valid "<username>" and "<password>"
    And  User click Sign in button
    And User clicks on account menu
    And User clicks on settings
    And User clicks on firstnamebox and clears
    And User updates firstname as "<firstname>"
    And User clicks on save button
    And User verifies the Settings saved! message
    Then Close the application

    Examples:
      | username  | password | firstname |
      | usertugba | 123Tugba | User      |


  @TC_0002
  Scenario Outline:TC_0002

    When User provides valid "<username>" and "<password>"
    And  User click Sign in button
    And User clicks on account menu
    And User clicks on settings
    And User clicks on lastnamebox and clears
    And User updates lastname as "<lastname>"
    And User clicks on save button
    And User verifies the Settings saved! message
    Then Close the application

    Examples:
      | username  | password | lastname |
      | usertugba | 123Tugba | Tugba    |


  @TC_0003
  Scenario Outline:TC_0003

    When User provides valid "<username>" and "<password>"
    And  User click Sign in button
    And User clicks on account menu
    And User clicks on settings
    And User clicks on emailbox and clears
    And User updates email as "<email>"
    And User clicks on save button
    And User verifies the Settings saved! message
    Then Close the application

    Examples:
      | username  | password | email               |
      | usertugba | 123Tugba | usertugba@gmail.com |


  @TC_0004
  Scenario Outline:TC_0004

    When User provides valid "<username>" and "<password>"
    And  User click Sign in button
    And User clicks on account menu
    And User clicks on settings
    And User clicks on firstnamebox and clears
    And User clicks on save button
    And User verifies the Your first name is required. message
    Then Close the application

    Examples:
      | username  | password |
      | usertugba | 123Tugba |


  @TC_0005
  Scenario Outline:TC_0005

    When User provides valid "<username>" and "<password>"
    And  User click Sign in button
    And User clicks on account menu
    And User clicks on settings
    And User clicks on lastnamebox and clears
    And User clicks on save button
    And User verifies the Your last name is required. message
    Then Close the application

    Examples:
      | username  | password |
      | usertugba | 123Tugba |


  @TC_0006
  Scenario Outline:TC_0006

    When User provides valid "<username>" and "<password>"
    And  User click Sign in button
    And User clicks on account menu
    And User clicks on settings
    And User clicks on emailbox and clears
    And User updates email as "<email>"
    And User clicks on save button
    And User verifies This field is invalid message
    Then Close the application

    Examples:
      | username  | password | email |
      | usertugba | 123Tugba | Tugba |
