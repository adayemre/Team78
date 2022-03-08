Feature: Appointment api test get

  @ApiAppointmentCreationGet
Scenario: api get request for appointment
Given user sends the get request for appointments data
And user deserializes data to Java for appointments
And user saves the users data to correspondent files for appointments