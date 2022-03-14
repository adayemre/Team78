Feature: Create or Edit Patient

  @US015_CreateEditPatient
  Scenario Outline: Create or Edit Patient
    When user launches the browser
    And user navigates to home page
    And user clicks account_menu
    And user clicks sign_in_menu
    And user enter username as "<userName>"
    And user enter password as "<password>"
    And user clicks sign_in_button
    And user clicks ItemsTitles menu
    And user clicks Patient menu
    And user verifies create_a_new_patient button

    Examples:
      | userName   | password |
      | adminrecep | 123Recep |

