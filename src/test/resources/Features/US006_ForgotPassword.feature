Feature:[US_006] As a registered user, I want to be able to change my password when I forget it

  Background: User opens the app
   # * User makes driver adjustments
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * User clicks the button with description "Forgot Password"
    * Verifies username "Forgot Password" in dashboard
    * Verifies username "Back to sign in" in dashboard

  Scenario:[US_006] TC01 Password reset with a valid email

  And The user switches to "Email" input field if needed
  And The user enters a valid email "john.doe@example.com" into the email box.
  * User clicks the button with description "Get OTP"
  * Verifies succes Message "The User verify is successfully." in dashboard.
  * User clicks NewPasswordTextBox and confirmPasswordTextBox "Wise.123"
  * User clicks the button with description "Submit"
  * Verifies confirmation message "Your password reset Successfully." in dashboard.
  * User clicks the button with description "Profile"
  * The user verifies that the "John" is displayed.
  * Driver turns off




  Scenario:[US_006] TC02 Password reset with a valid phone number


    * User clicks phone number textbox and "6505551212" phone number
    * User clicks the button with description "Get OTP"
    * Verifies succes Message "The User verify is successfully." in dashboard.
    * User clicks NewPasswordTextBox and confirmPasswordTextBox "Wise.123"
    *  User clicks the button with description "Submit"
    * Verifies confirmation message "Your password reset Successfully." in dashboard.
    * User clicks the button with description "Profile"
    * Verifies username "oske" in dashboard
    * Driver turns off


@seren
  Scenario: [US_006] TC03 Password reset with an invalid email address

    And The user switches to "Email" input field if needed
    And The user enters a valid email "abc@xyz.com" into the email box.
    * User clicks the button with description "Get OTP"
    Then an error popUp mail text "This email does not exist." should be displayed.

@seren @Outline
  Scenario:[US_006] TC04 Password reset with an invalid phone number

    * User clicks phone number textbox and "12345" phone number
    * User clicks the button with description "Get OTP"
    Then an error popUp phone text "This phone does not exist." should be displayed.

