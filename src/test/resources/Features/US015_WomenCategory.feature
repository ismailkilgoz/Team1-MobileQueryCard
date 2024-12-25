Feature: [US_015] HomePage Women Menus-Catagories

  Background: User opens the app

    * User makes driver adjustments
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * User click the button Use Email Instead and sendKeys "bunyamin.user@querycart.com"
    * User clicks the button "signInLoginButton"

  Scenario: [US_015>TC_001] Women category window and subcategories should be displayed in the body of the main page.

    * User clicks the button with description "Category"
    * User clicks arrow on Women Page
    * User verifies Women Clothing, Women Shoes, Women Accessories are enable
    * Driver turns off

  Scenario: [US_015>TC_002] Women should be able to perform operations on the products on the category page (adding to the basket, adding to the favourites list and viewing).

    * User clicks the button with description "Category"
    * User clicks Women Page
    * User swipes to screen coordinates 626, 1935, 603, 1177
    * User click the pink shoes
    * User swipes to screen coordinates 597, 2021, 592, 1246
    * User click the Favorite button
    * User select white color
    * User clicks Add To Cart button
    * User confirms that the selected product has been added to the shopping cart
    * User clicks wishlist button
    * User confirms that the selected product has been added to the Wishlist
    * Driver turns off

  Scenario: [US_015>TC_003] Filter icons should be visible and active

    * User clicks the button with description "Category"
    * User clicks Women Page
    * User clicks the Filter Button.
    * User clicks Short By and Newest products
    * User confirms product availability
    * Driver turns off




