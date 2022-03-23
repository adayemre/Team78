@physician_appoinments_with_api
Feature: appointment physician
  @physician_appoinments_with_api_firstway
  Scenario: physician_validate

  Scenario: api get request for users
    Given user sends the get request for physician_appointments data
    And  user deserializes physician_appointments data to java
    And user saves the users physician_appointments data to correspondent files
    Then user validates physician appointment records

  @physician_appoinments_with_api_secondway
  Scenario Outline:api get request for users

    Given user sends the get request for physician_appointments with data "<fromdate>" and "<toDate>" and "<id>"
    And  user deserializes physician_appointments with date data to java
    And user saves the users physician_appointments with date data to correspondent files
    Then user validates physician appointment with date records

    Examples: test data
     |fromdate|toDate|id|
     |2022-03-03|2022-03-16|10642|
     |2022-03-04|2022-03-05|10642|