@UI
Feature: Test All Registrant Data

  @UIRegistration
  Scenario Outline: Test Registration
    Given user provides ssn id "<SSN>"
    And user provides firstname and lastname "<firstname>" and "<lastname>"
    Then user creates username "<username>"
    And user provides also email "<email>"
    And user generates the password "<password>"
    And user registers and validates
    Then user creates the records to a correspondent file
    Examples:
      | SSN         | firstname | lastname | username  | email               | password |
      | 333-33-5544 | Recep77   | Aykurt77 | raykurt77 | raykurt77@gmail.com | 123Recep |


  @UIRegistration
  Scenario Outline: Test Password Strength
    Given user provides the password "<password>"
    Then user validates the password strength "<strength>"
    Examples:
      | password    | strength |
      | asdfgkdjs   | 1        |
      | asdfgkdjs?  | 2        |
      | asdfgkdjs?1 | 3        |