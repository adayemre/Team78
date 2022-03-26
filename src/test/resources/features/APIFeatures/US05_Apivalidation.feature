Feature: Validate patient appointment with api

  @ApiValidate_Patient_Appointment
  Scenario: patient appointment validation
    When user sets the base Url
    And send the Get request and get the response
    And set the expected data
    Then do validation


