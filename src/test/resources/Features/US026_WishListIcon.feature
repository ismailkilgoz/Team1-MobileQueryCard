
Feature: US026

  Background: Sign in
    * User confirms to be on the homepage
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * User click the button Use Email Instead and sendKeys "xaverne.user@querycart.com"
    * User clicks the button "signInLoginButton"



Scenario: Select favorite products, add them to the wishlist, and verify
Then User clicks the button with itemName "Flower Print Foil T-shirt" and "0 (0  Reviews)" and "$65.00" added WishList
Then Toaster is displayed
Then  User clicks the button with itemName "Floral Print Midi Dress" and "0 (0 Reviews)" and "$100.00" added WishList.
Then Toaster is displayed
Then User clicks the button with description "Wishlist"
Then Verifies that the products added to the Wishlist page are displayed correctly.
And Driver turns off

Scenario:  Removing a product from the wishlist page
  Then User clicks the button with description "Wishlist"
  Then User clicks the button with itemName "Flower Print Foil T-shirt" and "0 (0  Reviews)" and "$65.00" removed WishList
  Then Remove toaster is displayed
  And Driver turns off