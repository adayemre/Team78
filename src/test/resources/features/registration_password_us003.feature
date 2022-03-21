@registration_password
Feature: registration_password_us003
  Background: User_Enter_Register_Password
    When user launches the browser
    And user navigates to home page
    And user verifies home page is visible
    And user clicks account_menu
    And user clicks register button
    And user verifies registration title is visible

  @registration_password_lowercase
  Scenario: Registration_Password_Lowercase
    When user launches the browser
    And user navigates to home page
    And user verifies home page is visible
    And user clicks account_menu
    And user clicks register button
    And user verifies registration title is visible
    Given user enter registration password "ADK123*?-"
    And user verifies fifth strength bar colour add "c"

  @registration_password_lowercase2
  Scenario: Registration_Password_Lowercase_Changes
    When user launches the browser
    And user navigates to home page
    And user verifies home page is visible
    And user clicks account_menu
    And user clicks register button
    And user verifies registration title is visible
    Given user enter registration password "KSHL547"
    And user verifies all strengths bar colour add "d"

  @registration_password_digit
  Scenario: Registration_Password_Digit_Changes
    When user launches the browser
    And user navigates to home page
    And user verifies home page is visible
    And user clicks account_menu
    And user clicks register button
    And user verifies registration title is visible
    Given user enter registration password "XDFAabhf"
    And user verifies all strengths bar colour add "5"

  @registration_password_specialchar
  Scenario: Registration_Password_SpecialChar_Changes
    When user launches the browser
    And user navigates to home page
    And user verifies home page is visible
    And user clicks account_menu
    And user clicks register button
    And user verifies registration title is visible
    Given user enter registration password "XDFA1234"
    And user verifies all strengths bar colour add "*"

  @registration_password_stronger
  Scenario: Registration_Password_Stronger
    When user launches the browser
    And user navigates to home page
    And user verifies home page is visible
    And user clicks account_menu
    And user clicks register button
    And user verifies registration title is visible
    Given user enter registration password "abFD5*"
    And user verifies fifth strength bar colour add "z"

  @registration_password_negative_1
  Scenario: Registration_Password_Negative_1_Lowercase
    When user launches the browser
    And user navigates to home page
    And user verifies home page is visible
    And user clicks account_menu
    And user clicks register button
    And user verifies registration title is visible
    Given user enter registration password "aF5*1"
    And user verifies negative fifth strength bar colour add "z"

  @registration_password_negative_2
  Scenario: Registration_Password_Negative_2_Digit
    When user launches the browser
    And user navigates to home page
    And user verifies home page is visible
    And user clicks account_menu
    And user clicks register button
    And user verifies registration title is visible
    Given user enter registration password "g?+RM"
    And user verifies negative all strengths bar colour add "7"

  @registration_password_required
  Scenario: Registration_Password_Required
    When user launches the browser
    And user navigates to home page
    And user verifies home page is visible
    And user clicks account_menu
    And user clicks register button
    And user verifies registration title is visible
    Given user enter registration password ""
    And user verifies registration password required

  @registration_password_4char
  Scenario: Registration_Password_4char
    When user launches the browser
    And user navigates to home page
    And user verifies home page is visible
    And user clicks account_menu
    And user clicks register button
    And user verifies registration title is visible
    Given user enter registration password "Ey4"
    And user verifies registration password 4char

