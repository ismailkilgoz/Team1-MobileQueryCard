Feature: [US_007] As a user, I would like to be able to register on the site to take advantage of its functions
  Background: User opens the app
    * User makes driver adjustments
    @seren
Scenario Outline: Successful Registration with Dynamic Email or Phone Field

  * User clicks the button with description "Profile"
  * User clicks the button with description "Sign Up"
  And User clicks on the name button enters a valid "John Doe".
  And The user switches to "<input_type>" input field if needed
  And The user enters "<input_value>" in the input field
  And The user enters a "Team123."
  * User clicks the button with description "Sign Up"
  Then The user should see a registration "Success Register Successfully." message
  Examples:
  | input_type | input_value          |
  | Email      | john.doe@example.com |
  | Phone      | 1234567890           |

