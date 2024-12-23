Feature: US026

Background: Sign in
  * User confirms to be on the homepage
  * User clicks the button with description "Profile"
  * User clicks the button with description "Sign In"
  * User clicks the button "phoneTextBox" and sendKeys "9284501678"
  * User clicks the button "signInLoginButton"
  * User clicks the button with description "Profile"
  * Verifies username "xaver" in dashboard


  Scenario: View Wishlist icon on the homepage
    * The Wishlist icon should be visible and active
    * Driver turns off



  Scenario: Add a product to the favorite list
    Given The user sees the favorite icon on a product
    When The user clicks the favorite icon
    Then The product should be added to the favorite list
    And The favorite icon should be active
    Then The Wishlist icon should be visible and active
    * Driver turns off



  Scenario: View products on the Wishlist page
    Given The user navigates to the Wishlist page
    Then The products added to the Wishlist should be displayed
    * Driver turns off


  Scenario: Remove a product from the Wishlist
    Given The user navigates to the Wishlist page
    When The user clicks the remove icon on a product
    Then The product should be removed from the Wishlist
    And The product should no longer be displayed on the Wishlist page
    * Driver turns off