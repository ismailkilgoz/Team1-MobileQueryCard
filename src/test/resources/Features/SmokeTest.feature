
Feature: Smoke Test

@smoke
  Scenario: [US_24] TC03 Payment with an invalid card information

    * User makes driver adjustments
    Given The user is signed in as cusmoter seren
    * User swipes to screen coordinates 840, 941, 68, 941
    * User swipes to screen coordinates 840, 941, 68, 941
    * User swipes to screen coordinates 840, 941, 68, 941
    * User clicks the button with description "Men Accessories"
    * The user verifies that the "Men Accessories" is displayed.
    * User swipes to screen coordinates 539, 1886, 548, 530
    * User clicks tap coordinates 251, 968
    * User clicks the button with description "Brown"
    * User swipes to screen coordinates 493, 1964, 498, 548
    * User clicks the button with description "Add To Cart"
    * User clicks cart Icon.
    * User clicks the button with description "Proceed to Checkout"
    * User clicks tap coordinates 349, 739
    * User swipes to screen coordinates 502, 2018, 502, 709
    * Waiting
    * The user verifies that text contains "$131.38".
    * User clicks the button with description "Save & Pay"
    * The user verifies that the "Select Payment Method" is displayed.
    * User clicks the button with description "Stripe"
    * Waiting
    * User clicks the button with description "Confirm Order"
    * The user clicks card Number Box.
    And The user enters invalid card information
    * The user clicks the confirm button to approve the payment.
    Then an error message "Your card number is invalid." should be displayed.
    * Driver turns off

#Pozitif senaryo
  @Outline @smoke
  Scenario Outline: [US_007] TC01 Successful Registration with Dynamic Email or Phone Field
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign Up"
    And User clicks on the name button enters a valid "John Doe".
    And The user switches to "<input_type>" input field if needed
    And The user enters "<input_value>" in the input field
    And The user enters a valid password "Team123."
    * User clicks the button Sign Up.
    Then The user should see a registration "Register Successfully." message
    * Driver turns off
    Examples:
  # change input_value !
      | input_type | input_value            |
      | Email      |john.doe+14@example.com |
      | Phone      | 5789644233569          |


  # Negatif senaryo
   @smoke
  Scenario Outline: [US_007] TC02  Duplicate registration with the same email or phone number
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign Up"
    And User clicks on the name button enters a valid "John Doe".
    And The user switches to "<input_type>" input field if needed
    And The user enters an already registered "<input_value>"
    And The user enters a valid password "Team123."
    * User clicks the button with description Sign Up and should see a registration "<expected_message>" message by the "<input_type>".
    * Driver turns off
    Examples:
      | input_type | input_value          |expected_message|
      | Email      | john.doe@example.com |The email has already been taken.|
      | Phone      | 1234567890           |The phone has already been taken.|


