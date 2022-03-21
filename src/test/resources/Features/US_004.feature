@US_004
Feature: User_Login_Functionality

  Background:
    Given User is on the home page
    And User navigates to login page
    Then Verify if user is on the sign in page

  @TC_0001
  Scenario Outline:

    When User provides valid "<username>" and "<password>"
    And  User click Sign in button
    Then Verify login is success
    Then Close the application


    Examples:
    | username  | password  |
    | WadeLakin | cD5uV$#0#!|


  @TC_0001_negative
  Scenario Outline:

    When User provides valid "<username>" and invalid "<password>"
    And  User click Sign in button
    Then Verify unsuccessful message
    Then Close the application

    Examples:
      | username  | password  |
      | WadeLakin | cDdmslkfds|


  @TC_0002
  Scenario:

    When User click on cancel button
    Then Verify the if cancel button is enable
    Then Close the application


  @TC_0003
  Scenario:

    Then Verify if there is remember me option
    Then Close the application

  @TC_0004
  Scenario:

    When Click on Did you forget your password? option
    Then Verify if the option is working properly

  @TC_0005
  Scenario:

    When Click on Register a new account option
    Then Then Verify if the option2 is working properly







