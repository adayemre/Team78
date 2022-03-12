@AppointmentApiFunctionalities
Feature: Appointment Api functionalities

  @AppointmentPostApi
  Scenario Outline: api post request to create new appointment
    Given user sets the path params
    And user sets expected data "<firstname>" "<lastname>" "<ssn>" "<email>" "<phone number>" "<appointment date>"
    And user send Post request and gets response
    And user saves the records
    Then user validates record with Api

    Examples:
    |firstname|lastname|ssn|email|phone number|appointment date|
    |firstname|lastname|ssn|email|973-212-4556|2022-03-22|
    |firstname|lastname|ssn|email|273-362-9854|2022-03-23|
    |firstname|lastname|ssn|email|375-257-4721|2022-03-24|


  @AppointmentGetApi
  Scenario Outline: api get request for appointments
    Given user sends the get request for appointments data
    Then user deserializes data to Java and validates "<firstname>" "<lastname>" "<ssn>" "<email>" and "<phone number>"

    Examples: appointment data created with Post request
    |firstname           |lastname           |ssn              |email                           |phone number      |
    |firstName=Arthur    |lastName=Hegmann   |ssn=714-51-3242  |email=lucina.brakus@gmail.com   |phone=973-212-4556|
    |firstName=Lakeisha  |lastName=Little    |ssn=266-95-6537  |email=ricarda.wiegand@yahoo.com |phone=973-212-4556|
    |firstName=Cornelia  |lastName=Goodwin   |ssn=717-93-9632  |email=aron.orn@yahoo.com        |phone=273-362-9854|
    |firstName=Paul      |lastName=Bashirian |ssn=202-45-3723  |email=maximo.kirlin@yahoo.com   |phone=375-257-4721|





