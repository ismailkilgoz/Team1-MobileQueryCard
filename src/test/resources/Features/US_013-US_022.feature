Feature: US_013 As a registered user, I would like to be able to see the categories and products of the Menu menu on the home page.
  Background: User opens the app
    * User makes driver adjustments
  Scenario: US_013>TC001 Test to Men category window and subcategories visible and active in the home page body section
    * User clicks the button with description "Category"
    * User clicks arrow on Men Page
    * User verifies Men Clothing, Men Shoes, Men Accessories are enable
    * Driver turns off
  Scenario: US_013>TC002 Test to Operations (adding to cart, adding to favorites list and viewing) possible on the products on the men category page.
    * User confirms to be on the homepage
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * User clicks the button "phoneTextBox" and sendKeys "6505551212"
    * User clicks the button "signInLoginButton"
    * Toaster is displayed
    * User clicks the button with description "Category"
    * User clicks on Men
    * User clicks first product
    * User selects color
    * User swipes to screen coordinates 629, 2237, 660, 1725
    * User clicks the button with name of description "Add To Cart"
    * User clicks favorite button
    * Toaster is displayed
    * Driver turns off
  Scenario: US_013>TC003 Test to Filtering icons visible and active
    * User confirms to be on the homepage
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * User clicks the button "phoneTextBox" and sendKeys "6505551212"
    * User clicks the button "signInLoginButton"
    * User clicks the button with description "Category"
    * User clicks on Men
    * User clicks filter button
    * User verifies "Sort By" category is enable
    * User verifies "Brands" category is enable
    * User verifies "size" category is enable
    * User verifies "color" category is enable
    * User selects Harrods brand from the brand category
    * User clicks "x" icon
    * User confirms that results have "Jacket" as a text in Men
    * Driver turns off
    # US_022 As a registered user, I want to be able to log out of the system securely
  Scenario: US_022>TC004 Test to Profile icon visible on the homepage
    * User verifies profile button is enable on the homepage
    * User clicks profile button on the home page
    * User clicks the button with description "Sign In"
    * User clicks the button "phoneTextBox" and sendKeys "6505551212"
    * User clicks the button "signInLoginButton"
    * Toaster is displayed
    * User clicks profile button on the home page
    * User verifies My Account page is opened
    * Driver turns off
  Scenario: US_022>TC005 Test to Logout link visible and active in the dashboard sidebar when clicking on the profile icon
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