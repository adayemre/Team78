Feature: Validate patient info with api test

  @ApiValidate_Patient_Info
  Scenario Outline: patient info validation test
    Given user sets the necessary path params for patient info
    And user sends the POST request and gets the response for patient
    When user saves the api records to correspondent files of patient
    Then user validates api records of patient


    Examples: api test data
      |firstname|lastname|SSN|email|username|password|lan|
      |Burhan    |Dundar  |293-38-2938|burhan@gmail.com|burhan|Burhan123.|en|
