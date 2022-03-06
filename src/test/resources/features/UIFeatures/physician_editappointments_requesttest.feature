
@physician_editappointments
Feature: My Appointments_Edit Request a test only by Physician
Background:
  Given user is on the homepage
  When user clicks human icon
  And user clicks sigin button
  Then user verifies signin page

 @physician_request_test
  Scenario Outline: TC0001_doctor_may_request_atest

    And user is sign in as a physician username "<username>" and password "<password>"
    Then user verifies the physician's page
    And user clicks MyPages and select My Appointments from dropdown
    Then user verifies the My Appointments page
    Then user select one of the patient list and click edit button
    Then user verifies the edit page
    Then user verifies the Request a test button is displayed


    Examples: credentials
      |username |password  |
      |Jo       |789456123 |

  @TC0003_staffrequesttest
  Scenario Outline: TC0002_staff_can't_request_test
    And user is sign in as a physician username "<username>" and password "<password>"
    Then user verifies the staff's page
    Then user verifies staff can't request test
    Examples: credentials

      |username|password|
      |sems     |789456123|

  @TC0004_adminrequesttest
  Scenario Outline: TC0003_admin_can't_request_test
    And user is sign in as a physician username "<username>" and password "<password>"
    Then user verifies the admin's page
    Then user verifies admin can't request test
    Examples: credentials

      |username|password|
      |mariams     |789456123|

@physician_verify_checkmark_options
 Scenario Outline: TC0004_verify_the_checkmark_options

   And user is sign in as a physician username "<username>" and password "<password>"
   Then user verifies the physician's page
   And user clicks MyPages and select My Appointments from dropdown
   Then user verifies the My Appointments page
   Then user select one of the patient list and click edit button
   Then user verifies the edit page
   Then user verifies the Request a test button is displayed
   When user clicks Request a test button
   When clicks the some of checkmark options(Glucose, Urea, Creatinine, Sodium,Potassium, Total protein, Albumin, Hemoglobin)
   Then user verifies the have following items as checkmark options; (Glucose, Urea, Creatinine, Sodium, Potassium, Total protein, Albumin, Hemoglobin)


   Examples: credentials
     |username |password  |
     |Jo       |789456123 |

