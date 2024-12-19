Feature:[US_006] As a registered user, I want to be able to change my password when I forget it

  Background: User opens the app
    * User makes driver adjustments

  Scenario:[US_006] TC01 Password reset with a valid email

  * User clicks the button with description "Profile"
  * User clicks the button with description "Sign In"
  * User clicks the button with description "Forgot Password"
  Then the "Forgot Password" link should be visible and clickable
  When the user clicks on the "Forgot Password" link
  And enters a valid "email".
  And clicks the "Get OTP" button
  Then the user should receive an OTP
  When the user enters the OTP
  And sets a new password
  Then the password should be successfully updated
  And the user should be able to log in with the new password
  And the "Back to Sign In" link should be visible and clickable



@seren
  Scenario:[US_006] TC02 Password reset with a valid phone number

    *  User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * User clicks the button with description "Forgot Password"
    * Verifies username "Forgot Password" in dashboard
    * Verifies username "Back to sign in" in dashboard
    * User clicks phone number textbox and "6505551212" phone number
    * User clicks the button with description "Get OTP"
    * Verifies succes Message "The User verify is successfully." in dashboard.
    * User clicks NewPasswordTextBox and confirmPasswordTextBox "Wise.123"
    *  User clicks the button with description "Submit"
    * Verifies confirmation message "Your password reset Successfully." in dashboard.
    * User clicks the button with description "Profile"
    * Verifies username "oske" in dashboard
    * Driver turns off



  Scenario: [US_006] TC03 Password reset with an invalid email address

    Given the user navigates to the "Sign In" page
    And the user clicks on the "Forgot Password" link
    When the user enters an invalid email address "abc@xyz.com"
    And clicks the "Get OTP" button
    Then the user should see an error message "This email does not exist."

  Scenario:[US_006] TC04 Password reset with an invalid phone number

    Given the user navigates to the "Sign In" page
    And the user clicks on the "Forgot Password" link
    When the user enters an invalid phone number "12345"
    And clicks the "Get OTP" button
    Then the user should see an error message "This phone does not exist."
