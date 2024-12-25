Feature: Home Page Bottom Bar and Categories Headings

  Background: User opens the app
    Given User makes driver adjustments


  Scenario: As a user, I would like to have easy links in the bottom bar of the home page so that I can easily perform internal site operations.

    When  User confirms to be on the QueryCart Homepage
    Then  User clicks the button with description "Home"
    And   User confirms to be on the QueryCart Homepage
    Then  User clicks the button with description "Category"
    And   User confirms to be on the Category Page
    Then  User clicks the button with description "Home"
    Then  User clicks the button with description "Wishlist"
    And   User confirms to be on the Sign In Page
    Then  User clicks the backwards button
    And   User confirms to be on the QueryCart Homepage
    Then  User clicks the button with description "Profile"
    And   User confirms to be on the QueryCart Homepage
    Then  User confirms to be on the Sign Up - Sign In Page
    And   Driver turns off


  Scenario: As a user, I want to be able to see Search Box and i want to be able to do a search

    When  User confirms to be on the QueryCart Homepage
    Then  User clicks the Search Box button
    And   User confirms to be on the Search Page
    Then  User search "baby" in the app
    And   User confirms that results have "baby" as a text or there is no result at all
    And   Driver turns off