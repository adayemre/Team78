@US_020
Feature:setting homepage feature

  Background:
    Given User is on the home page
    And User navigates to login page
    Then Verify if user is on the sign in page

  @ViewList
  Scenario Outline:TC_0001
    When User provides valid "<username>" and "<password>"
    And  User click Sign in button
    And admin clicks administration button
    And admin clicks user management
    And admin verifies that she can view registered people info as firstname, lastname, email etc.

    Examples:
      | username  | password |
      | admintugba | 123Tugba |


    @CreateUpdateDelete
    @UpdateUser #@UIRegistration ile birlikte çalıştırılacak
    Scenario Outline:TC_0002
      When User provides valid "<username>" and "<password>"
      And  User click Sign in button
      And admin clicks administration button
      And admin clicks user management
      And admin goes the last page
      And admin finds the registrant
      And admin actives the user
      Then verifies the updated message
      And admin gives physician role to the user
      And admin verifies the message
      And admin goes the last page
      And admin finds the registrant
      And admin gives staff role to the physician
      And admin verifies the message
      And admin goes the last page
      And admin finds the registrant
      And admin deletes the user
      Then close the application

      Examples:
        | username | password |
        | admintugba | 123Tugba |


