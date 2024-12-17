Feature: [US_007] As a user, I would like to be able to register on the site to take advantage of its functions
  Background: User opens the app
    * User makes driver adjustments

Scenario Outline: Successful Registration with Dynamic Email or Phone Field

  * User clicks the button with description "Profile"
  * User clicks the button with description "Sign Up"
  And User clicks on the name button enters a valid "John Doe".
  And The user switches to "<input_type>" input field if needed
  And The user enters "<input_value>" in the input field
  And The user enters a valid password "Team123."
  * User clicks the button with description "Sign Up"
  Then The user should see a registration "Success Register Successfully." message
  Examples:
  | input_type | input_value             |
  | Email      |john.doe+1@example.com   |
  | Email      |john_doe.123@example.com |
  | Phone      | 9876543210              |
  | Phone      | 1231231234              |

  @seren
  Scenario Outline: Duplicate registration with the same email or phone number
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign Up"
    And User clicks on the name button enters a valid "John Doe".
    And The user switches to "<input_type>" input field if needed
    And The user enters an already registered "<input_value>"
    And The user enters a valid password "Team123."
    * User clicks the button with description Sign Up.
    Then The user should see a registration "Error The email has already been taken." message.
    Examples:
      | input_type | input_value          |
      | Email      | john.doe@example.com |
      | Phone      | 1234567890           |
