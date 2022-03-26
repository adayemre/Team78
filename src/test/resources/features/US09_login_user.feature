@login_user
Feature: Login_user_correct
  Scenario: TC_Login_User_With_Correct_username_and_password
    When user launches the browser
    And user navigates to home page
    And user verifies home page is visible
    And user clicks PersonBox button
    And user clicks signin button
    And user verifies signin to your account is visible
    And user enters correct username and password
    And user clicks signinlast button
    Then user verifies that signed in

    Then user Click on MyPagesText button
    And select SearchPatience button at Dropbox
    Then user verifies Patiences Page

    Then user clicks View button
    Then user verifies Patience Information
    And user clicks Back Button

    When user clicks Edit button
    Then verify This Page Create or Edit Patient
    And user can update all Patient information
    Then user clicks Save button
    Then user verify that edition is saved

