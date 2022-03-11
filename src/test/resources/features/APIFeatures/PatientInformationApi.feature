@API_US_09 @Smoke
  Feature: Test all patient info
    Scenario: Get patient info and validate
      When set the Base Url
      And send the GET request and get the response
      And set the expected data
      Then do validation
