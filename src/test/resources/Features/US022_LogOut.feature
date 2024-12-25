Feature: US_022 As a registered user, I want to be able to log out of the system securely

Background: User opens the app
* User makes driver adjustments

  Scenario: US_022>TC001 Test to Profile icon visible on the homepage
  * User verifies profile button is enable on the homepage
  * User clicks profile button on the home page
  * User clicks the button with description "Sign In"
  * User clicks the button "phoneTextBox" and sendKeys "6505551212"
  * User clicks the button "signInLoginButton"
  * Toaster is displayed
  * User clicks profile button on the home page
  * User verifies My Account page is opened
  * Driver turns off


  Scenario: US_022>TC002 Test to Logout link visible and active in the dashboard sidebar when clicking on the profile icon
  * User clicks profile button on the home page
  * User clicks the button with description "Sign In"
  * User clicks the button "phoneTextBox" and sendKeys "6505551212"
  * User clicks the button "signInLoginButton"
  * Toaster is displayed
  * User clicks profile button on the home page
  * User verifies logout button is enable
  * User verifies logout button clickable
  * Toaster is displayed
  * Driver turns off