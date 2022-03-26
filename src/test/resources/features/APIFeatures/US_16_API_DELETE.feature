@US_16_API_DELETE @US_16
Feature:Delete a room
  Scenario: Delete a room and validate
    When set the room Base Url
    And send the DELETE request and get the response
    Then validate deleted data