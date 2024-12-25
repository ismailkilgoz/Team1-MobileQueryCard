Feature: US_017 Test for displaying and functioning the address title.

  Background: Opening the application.
    * User makes driver adjustments


  Scenario Outline:  Test for displaying the title of "Address" and going to the "AddressPage"

    * A user displays the icon of "Profile" on the homepage.
    * User clicks the button with description "Sign In"
    * User clicks the button with description "*Use Email Instead"
    * A user signs in the profile page with "<email>" and "<password>"
    * A user displays the icon of "Profile" on the homepage.
    * A user verifies that the Address Title is displayed
    * A user clicks on the title and goes to the address page directly
    * Driver turns off
    Examples:
      | email                   | password     |
      | umit.user@querycart.com | Query.151224 |


  Scenario Outline:  Test for editing the address.

    * A user displays the icon of "Profile" on the homepage.
    * User clicks the button with description "Sign In"
    * User clicks the button with description "*Use Email Instead"
    * A user signs in the profile page with "<email>" and "<password>"
    * A user displays the icon of "Profile" on the homepage.
    * A user verifies that the Address Title is displayed
    * A user clicks on the title and goes to the address page directly
    * A user clicks the edit button
    * A user clicks the zipcode row
    * A user clears the text
    * A user enters a new zipcode of "<new_zipcode>"
    * A user goes to the element of update and click on it
    * A user verifies the new zipcode
    * Driver turns off
    Examples:
      | email                   | password     |new_zipcode|
      | umit.user@querycart.com | Query.151224 |   60100        |



  Scenario Outline:  Test for deleting the address.

    * A user displays the icon of "Profile" on the homepage.
    * User clicks the button with description "Sign In"
    * User clicks the button with description "*Use Email Instead"
    * A user signs in the profile page with "<email>" and "<password>"
    * A user displays the icon of "Profile" on the homepage.
    * A user verifies that the Address Title is displayed
    * A user clicks on the title and goes to the address page directly
    * A user deletes the second address and verifies that it is deleted
    * Driver turns off
    Examples:
      | email                   | password     |
      | umit.user@querycart.com | Query.151224 |


  @US_017
  Scenario Outline:  Test for adding a new address.

    * A user displays the icon of "Profile" on the homepage.
    * User clicks the button with description "Sign In"
    * User clicks the button with description "*Use Email Instead"
    * A user signs in the profile page with "<email>" and "<password>"
    * A user displays the icon of "Profile" on the homepage.
    * A user verifies that the Address Title is displayed
    * A user clicks on the title and goes to the address page directly
    * A user addes a new address and verifies that it is added
    * Driver turns off
    Examples:
      | email                   | password     |
      | umit.user@querycart.com | Query.151224 |






