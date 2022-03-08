Feature: Appointment api test get

  @ApiAppointmentCreation
Scenario: api get request for appointment
Given user sends the get request for appointments data
And user deserializes data to Java
And user saves the users data to correspondent files