@password_segment
Feature: password_segment_us008

  Background: User_In_HomePage
    When user launches the browser
    And user navigates to home page
    And user verifies home page is visible
    And user clicks account_menu
    And user clicks sign_in_menu
    Then user verifies sign_in_title
    And user enter username as "userrecep"
    And user enter password as "123recep"
    And user clicks sign_in_button
    Then user verifies name is visible on homepage
    And user clicks account_menu
    And user clicks password_menu
    And user verifies password for username title

  @new_password_confirmed
  Scenario Outline: New_Password_Confirmed
    And user enter current password as "<currentPassword>"
    And user enter new password as "<newPassword>"
    And user enter password confirmation as "<confirmationPassword>"
    And user clicks save submit button
    And user verifies password should be confirmation
    And user clicks account_menu
    And user clicks sign_out_menu
    Examples:
      | currentPassword | newPassword | confirmationPassword |
      | 123recep        | 123Recep    |                      |

  @for_strongerpass_onelowercase
  Scenario Outline: For_StrongerPass_OneLowercase
    And user enter new password as "<newpassword>"
    And user verifies last strength bar colour add "<addcharacter>"
    And user clicks account_menu
    And user clicks sign_out_menu
    Examples:
      | newpassword | addcharacter |
      | RYX487?-    | c            |

  @add_onelowercase_check_changes
  Scenario Outline: Add_Onelowercase_Check_Changes
    And user enter new password as "<newpassword>"
    And user verifies total strengths bar colour add "<addcharacter>"
    And user clicks account_menu
    And user clicks sign_out_menu
    Examples:
      | newpassword | addcharacter |
      | 4571PGF     | h            |

  @add_onedigit_check_changes
  Scenario Outline: Add_Onedigit_Check_Changes
    And user enter new password as "<newpassword>"
    And user verifies total strengths bar colour add "<addcharacter>"
    And user clicks account_menu
    And user clicks sign_out_menu
    Examples:
      | newpassword | addcharacter |
      | jyeKBCz     | 1            |

  @add_onespecchar_check_changes
  Scenario Outline: Add_Onespecchar_Check_Changes
    And user enter new password as "<newpassword>"
    And user verifies total strengths bar colour add "<addcharacter>"
    And user clicks account_menu
    And user clicks sign_out_menu
    Examples:
      | newpassword | addcharacter |
      | 564psx3     | ?            |

  @for_strongerpass_sevenchars
  Scenario Outline: For_Strongerpass_Sevenchars
    And user enter new password as "<newpassword>"
    And user verifies last strength bar colour add "<addcharacter>"
    And user clicks account_menu
    And user clicks sign_out_menu
    Examples:
      | newpassword | addcharacter |
      | fh98W+      | /            |

  @for_password_not_more_four
  Scenario Outline: For_Password_Not_More_Four
    And user enter new password as "<newpassword>"
    And user clicks sign_in_button
    And user verifies password not more four char message
    And user clicks account_menu
    And user clicks sign_out_menu
    Examples:
      | newpassword |
      | gU?         |

  @for_password_not_match
  Scenario Outline: For_Password_Not_Match
    And user enter current password as "<currentPassword>"
    And user enter new password as "<newPassword>"
    And user enter password confirmation as "<confirmationPassword>"
    And user clicks save submit button
    And user verifies password not match message
    And user clicks account_menu
    And user clicks sign_out_menu
    Examples:
      | currentPassword | newPassword | confirmationPassword |
      | 123recep        | 123Recep    | 123reCEP             |

  @for_password_is_required
  Scenario Outline: For_Password_Is_Required
    And user enter current password as "<currentPassword>"
    And user enter new password as "<newPassword>"
    And user enter password confirmation as "<confirmationPassword>"
    And user clicks save submit button
    And user verifies password is required message
    And user clicks account_menu
    And user clicks sign_out_menu
    Examples:
      | currentPassword | newPassword | confirmationPassword |
      |                 | 123Recep    | 123Recep             |

  @for_password_not_changed
  Scenario Outline: For_Password_Not_Changed
    And user enter current password as "<currentPassword>"
    And user enter new password as "<newPassword>"
    And user enter password confirmation as "<confirmationPassword>"
    And user clicks save submit button
    And user verifies password not changed message
    And user clicks account_menu
    And user clicks sign_out_menu
    Examples:
      | currentPassword | newPassword | confirmationPassword |
      | 123reCEP        | 123Recep    | 123Recep             |

  @old_pass_shouldnt_use
  Scenario Outline: Old_Pass_Shouldnt_Use
    And user enter current password as "<currentPassword>"
    And user enter new password as "<newPassword>"
    And user enter password confirmation as "<confirmationPassword>"
    And user clicks save submit button
    And user verifies password changed message
    And user clicks account_menu
    And user clicks sign_out_menu
    And user clicks account_menu
    And user clicks sign_in_menu
    And user enter username as "userrecep"
    And user enter password as "123recep"
    And user clicks sign_in_button
    Then user verifies authentication incorrect message
    Examples:
      | currentPassword | newPassword | confirmationPassword |
      | 123recep        | 123Recep    | 123Recep             |
