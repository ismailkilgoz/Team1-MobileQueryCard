
Feature: US_013 As a registered user, I would like to be able to see the categories and products of the Menu menu on the home page.

  Background: User opens the app
    * User makes driver adjustments

  Scenario: US_013>TC001 Test to Men category window and subcategories visible and active in the home page body section

    * User clicks the button with description "Category"
    * User clicks arrow on Men Page
    * User verifies Men Clothing, Men Shoes, Men Accessories are enable
    * Driver turns off


    #failed
  Scenario: US_013>TC002 Test to Operations (adding to cart, adding to favorites list and viewing) possible on the products on the men category page.

    * User confirms to be on the homepage
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * User clicks the button "phoneTextBox" and sendKeys "6505551212"
    * User clicks the button "signInLoginButton"
    * User clicks the button with description "Category"
    * User clicks arrow on Men Page
    * User clicks first product
    * User selects color
    * User adds product to cart
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
    * User clicks arrow on Men Page
    * User clicks filter button
    * User verifies "Sort By" category is enable and clickable
    * User verifies "Brands" category is enable and clickable
    * User verifies "size" category is enable and clickable
    * User verifies "color" category is enable and clickable
    * User selects Harrods brand from the brand category
    * User clicks "x" icon
    * User verifies that the products of the Harrods brand were selected
    * Driver turns off





    # US_022 As a registered user, I want to be able to log out of the system securely

  Scenario: US_022>TC004 Test to Profile icon visible on the homepage

    * User verifies profile button is enable on the homepage
    * User clicks profile button on the home page
    * Driver turns off


  Scenario: US_022>TC005 Test to Logout link visible and active in the dashboard sidebar when clicking on the profile icon

    * User verifies logout button is enable
    * User verifies logout button clickable
    * Success message is visible
    * Driver turns off

