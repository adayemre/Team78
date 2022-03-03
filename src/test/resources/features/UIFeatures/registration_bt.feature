@smoke_test
Feature: registration feature

  @registration_ssn_valid
  Scenario: user should be able to register with a valid ssn
    Given user is on the registration page
    And user enters ssn number
    And user enters firstname
    And user enters lastname
    And user provides username
    And user provides email
    And user provides firstPassword
    And user provides secondPassword
    And user clicks on register button
    Then user verifies the success message as "Registration Saved"


  @registration_ssn_invalid
  Scenario Outline: user should not be able to register with an invalid ssn
    Given user is on the registration page
    And user enters ssn number as "<invalid ssn>"
    And user enters firstname
    And user enters lastname
    And user provides username
    And user provides email
    And user provides firstPassword
    And user provides secondPassword
    And user clicks on register button
    Then user verifies the error message as "Your SSN is invalid"

    Examples: invalid ssn data
    |invalid ssn|
    |123-00-4567|
    |000-12-3456|
    |666-12-3456|
    |901-12-3456|
    |123-45-0000|
    |12345-6789 |
    |123-456789 |
    |123456789  |
    |123-45-678 |
    |123-45-67891|
    |123-$5-6789 |

    @registration_ssn_blank
    Scenario Outline: ssn can not be left blank
      Given user is on the registration page
      And user enters ssn number as "<blank>"
      And user enters firstname
      And user enters lastname
      And user provides username
      And user provides email
      And user provides firstPassword
      And user provides secondPassword
      And user clicks on register button
      Then user verifies the error message as "Your SSN is required."

      Examples: ssn is blank
      |blank|
      |     |

      @registration_firstname_valid
      Scenario: user should be able to register with a valid firstname
        Given user is on the registration page
        And user enters ssn number
        And user enters firstname
        And user enters lastname
        And user provides username
        And user provides email
        And user provides firstPassword
        And user provides secondPassword
        And user clicks on register button
        Then user verifies the success message as "Registration Saved"

      @registration_firstname_blank
      Scenario Outline: first name can not be left blank
        Given user is on the registration page
        And user enters ssn number
        And user enters firstname as "<blank>"
        And user enters lastname
        And user provides username
        And user provides email
        And user provides firstPassword
        And user provides secondPassword
        And user clicks on register button
        Then user verifies the error message as "Your FirstName is required."
        
        Examples: first name is blank
        |blank|
        |     |

      @registration_lastname_valid
      Scenario: user should be able to register with a valid lastname
        Given user is on the registration page
        And user enters ssn number
        And user enters firstname
        And user enters lastname
        And user provides username
        And user provides email
        And user provides firstPassword
        And user provides secondPassword
        And user clicks on register button
        Then user verifies the success message as "Registration Saved"

      @registration_lastname_blank
      Scenario Outline: last name can not be left blank
        Given user is on the registration page
        And user enters ssn number
        And user enters firstname
        And user enters lastname as "<blank>"
        And user provides username
        And user provides email
        And user provides firstPassword
        And user provides secondPassword
        And user clicks on register button
        Then user verifies the error message as "Your LastName is required."
        
        Examples: first name is blank
        |blank|
        |     |


        









