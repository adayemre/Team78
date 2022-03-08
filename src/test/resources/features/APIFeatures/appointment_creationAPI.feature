Feature: Appointment api test


#  @ApiAppointmentCreation
  Scenario Outline: appointment test
    Given user sets the necessary path params for appointment creation
    And user sets the expected data "<firstname>", "<lastname>" "<SSN>" "<email>" "<phone>"  and "<date>"
    And user sends the POST request and gets the response for appointment creation
    When user saves the appointment records to correspondent files
    Then user validates appointment records

    Examples: api test data
      | firstname | lastname | SSN         | email                  | phone        | date       |
      | Patient   | Tugba    | 677-85-5486 | patienttugba@gmail.com | 777-333-1414 | 2027-12-12 |
#      | firstTugba | lastnametugba | 677-85-5236 | patientemail@gmail.com | 777-333-1414 | 2025-12-12 |


