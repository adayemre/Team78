
Feature: registration feature

  @UIRegistration
  @registration_ssn_valid
  Scenario: TC01 user should be able to register with a valid ssn
    And user enters ssn number
    And user enters firstname
    And user enters lastname
    And user provides username
    And user provides email
    And user provides firstPassword
    And user provides secondPassword
    And user clicks on register button
    Then user verifies the success message as "Registration Saved"
    And user creates the records to a correspondent file


  @UIRegistration
  @registration_ssn_invalid
  Scenario Outline: TC01 user should not be able to register with an invalid ssn
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

    @UIRegistration
    @registration_ssn_blank
    Scenario Outline: TC02 ssn can not be left blank
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

      @UIRegistration
      @registration_firstname_valid
      Scenario Outline: : TC03 user should be able to register with a valid firstname
        And user enters ssn number
        And user enters firstname as "<valid firstname>"
        And user enters lastname
        And user provides username
        And user provides email
        And user provides firstPassword
        And user provides secondPassword
        And user clicks on register button
        Then user verifies the success message as "Registration Saved"
        And user creates the records to a correspondent file

        Examples: valid first names
        |valid firstname|
        |Stanton        |
        |Jo             |
        |Şahnur         |
        |Flávia         |



      @UIRegistration
      @registration_firstname_blank
      Scenario Outline: TC03 first name can not be left blank
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


      @UIRegistration
      @registration_lastname_valid
      Scenario Outline: TC04 user should be able to register with a valid lastname
        And user enters ssn number
        And user enters firstname
        And user enters lastname as "<valid lastname>"
        And user provides username
        And user provides email
        And user provides firstPassword
        And user provides secondPassword
        And user clicks on register button
        Then user verifies the success message as "Registration Saved"
        And user creates the records to a correspondent file

        Examples: valid lastnames
          |valid lastname |
          |D'Largy        |
          |King, Jr.      |
          |Çağıran        |
          |Quiñones       |


      @UIRegistration
      @registration_lastname_blank
      Scenario Outline: TC04 last name can not be left blank
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


        









