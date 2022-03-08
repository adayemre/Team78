
Feature:Creating an Appointment feature

  Background:
    Given User is on the home page
    And User navigates to login page


  Scenario Outline: TC_0001
    Given User provides valid "<username>" and "<password>"
    And User clicks Sign in button
    And User clicks on ItemsTitles
    And User clicks on an Appointment
    And user clicks on Create an Appointment
    And user provides startdate "<Start DateTime>"
    And user provides enddate "<End DateTime>"
    And user provides status "<Status>"
    And user provides anamnesis "<Anamnesis>"
    And user provides treatment "<Treatment>"
    And user provides diagnosis "<Diagnosis>"
    And user provides prescription "<Prescription>"
    And user provides description "<Description>"
    And user provides physician "<Physician>"
    And user provides patient "<Patient>"
    And User clicks on Save
    Then Verifies the A new Appointment is created with identifier "A new Appointment is created with identifier" message

    Examples:
      |username  |password  |Start DateTime|End DateTime|Status   |Anamnesis|Treatment|Diagnosis|Prescription|Description|Physician  |Patient     |
      |adminrecep|123Recep  |08-03-2022    |09-03-2022  |COMPLETED| Headache| MAJEZIK | Migraine| Migraine   |Use one    |           |            |