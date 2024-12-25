Feature: [US_24] As a user, I would like to be able to register on the site to take advantage of its functions

  Background: User opens the app
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


#basarili odeme


    Scenario:[US_24] TC 01 Successfully complete payment with a valid credit card

    * User clicks the button with description "Stripe"
    * Waiting
    * User clicks the button with description "Confirm Order"
    * The user clicks card Number Box.
    * The user enters valid card information into the card number box.
    * The user clicks the confirm button to approve the payment.
    * Waiting
    * Waiting
    * Waiting
    Then a pop-up message "Thank you for your order! Your order is confirmed." should be displayed.
    * User clicks the button with description "Go to order details"
    * Waiting
    * User clicks tap coordinates 425, 662
    * User swipes to screen coordinates 509, 2092, 495, 587
    * Waiting
    * Waiting
    * The user verifies that the sum of the subtotal and tax matches the total amount.
    * Waiting
    * User clicks the button with description "Download Receipt"
    * The user verifies that the order date on the invoice matches today's date.

    * Driver turns off



# ödeme methodu
  Scenario: [US_24] TC 02 Payment method not selected Paymnet method
    * Waiting
    * User clicks the button with description "Confirm Order"
    Then a pop-up message "Please select payment method." should be displayed.
  * Driver turns off



  Scenario: [US_24] TC 03 Payment with an invalid card information
    * User clicks the button with description "Stripe"
    * Waiting
    * User clicks the button with description "Confirm Order"
    * The user clicks card Number Box.
    And The user enters invalid card information
    * The user clicks the confirm button to approve the payment.
    Then an error message "Your card number is invalid." should be displayed.
    * Driver turns off




