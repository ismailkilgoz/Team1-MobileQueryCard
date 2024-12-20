Feature: US_016 Test for displaying and functioning My Account Page

  Background: Opening the application.
    * User makes driver adjustments

  @US_016
  Scenario:  Test for displaying the icon of "Profile" and going to the "Profile Page"

    * A user displays the icon of "Profile" on the homepage.
    * User clicks the button with description "Sign In"
    * As a user muss be "phoneNumber" phone and "password" password Login
    * A user clicks on the icon and goes to the "Profile Page" directly.
    * A user verifies that the "Profile Page" is displayed
    * Driver turns off



  Scenario:  Test for displaying the headers of "Total Orders,Total Completed,
  Total Returnd, Wallet Balance" on My Account page.

    * A user displays the icon of "Profile" on the homepage.
    * User clicks the button with description "Sign In"
    * As a user muss be "phoneNumber" phone and "password" password Login
    * A user clicks on the icon and goes to the "Profile Page" directly.
    * A user clicks on the header of "My Account".
    * A user verifies that the headers of "Total Orders" , "Total Completed" , "Total Returned" , "Wallet Balance" are displayed on the "My Account" page.
    * Driver turns off


  Scenario:  Test for displaying and functioning the header of "Order History" on the "Profile Page"

    * A user displays the icon of "Profile" on the homepage.
    * A user clicks on the icon and goes to the "Profile Page" directly.
    * A user signs in the profile account successfully.
    * A user goes to the "Profile Page" again.
    * A user displays the header of "Order History".
    * A user clicks on the header of "Order History" and verifies that order details are displayed.
    * Driver turns off
