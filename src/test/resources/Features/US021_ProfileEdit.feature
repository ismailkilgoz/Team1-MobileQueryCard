Feature: [US_021] Profile Edit

  Background: User opens the app

    * User makes driver adjustments
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * User click the button Use Email Instead and sendKeys "bunyamin.user@querycart.com"
    * User clicks the button "signInLoginButton"

  Scenario: [US_021>TC_001] Edit Profile link should be visible and active on the Dashboard page

    * User click the Profile icon
    * User confirms that the Edit Profile link visible and active
    * Driver turns off

  Scenario: [US_021>TC_002] User should be able to update their profile information

    * User click the Profile icon
    * User click the Edit Profile link
    * User change name, email and phone
    * User confirms that the Save Changes button visible and active
    * User click the Save Changes button
    * User displays the PROFILE UPDATE
    * User click the Edit Profile link
    * User change name, email and phone again
    * User click the Save Changes button
    * User displays the PROFILE UPDATE
    * Driver turns off



