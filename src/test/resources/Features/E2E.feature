Feature: E2E Test

  Background: User opens the app
    * User makes driver adjustments
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * User click the button Use Email Instead and sendKeys "mustafa.user@querycart.com"
    * User clicks the button "signInLoginButton"

  Scenario: User logs in and purchases an item, then initiates item returns

    * User clicks on the home, selects a product and completes the purchase
    * After the payment section is complated, the user clicks on the Go To Order Page button and verifies that is on the Order History page
    * User clicks on his last order and examines the details
    * Switching from Query Cart application to Google Chrome
    * Go to the Query Cart url and log in with admin information
    * Go to dashboard from profile icon
    * Go to the Online Orders page and after the user's order is verified, it is confirmed and delivered.
    * Returns to the Query Cart app as the user
    * User goes to the order history page via the profile
    * Clicks on the product details and finds the product delivered
    * The return button should be displayed
    * Perform return transactions
    * The return process has been initiated on the Return Orders page
    * Driver turns off.

