Feature: [US_24] As a user, I would like to be able to register on the site to take advantage of its functions

  Background: User opens the app
    Given The user is signed in as cusmoter seren

#basarili odeme

    @seren
    Scenario:
    * User clicks the button with description "Home"
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
    * User clicks the button with description "Save & Pay"
    * The user verifies that the "Select Payment Method" is displayed.
    * User clicks the button with description "Stripe"
    * User clicks the button with description "Confirm Order"
    * The user clicks card Number Box.
    * The user enters valid card information into the card number box.
    * The user clicks the confirm button to approve the payment.
    * Waiting
    * Waiting
    * Waiting
   # * The user verifies that the "Success Your payment has been confirmed" is displayed.
    * The user verifies that the "Thank you for your order! Your order is confirmed." is displayed.
    * User clicks the button with description "Go to order details"
    * The user verifies that text contains "Paid".
    * User clicks tap coordinates 936, 495
    * The user verifies that the "Order Confirmed" is displayed.
    * User swipes to screen coordinates 509, 2092, 495, 587
    * The user verifies that the sum of the subtotal and tax matches the total amount.
    * The user verifies that text contains "Men's Analog Watch".
    * User clicks the button with description "Download Receipt"
    * The user verifies that the "Select Payment Method" is displayed.
    * The user verifies the total price 131.38 on the invoice.
    * The user verifies that the name of the purchased product on the invoice contains 'Men's Analog Watch'.
    * The user verifies that the order date and time is today's date.
    *  User clicks the button with description "Go to shopping"
    * Driver turns off



# ödeme methodu
  Scenario: Payment method not selected
    Given the user navigates to the Payment Information page
    When the user does not select a payment method
    And the user clicks on the "Confirm Order" button
    Then an error message "Please select a payment method" should be displayed

  Scenario: Invalid card information
    Given the user navigates to the Payment Information page
    When the user selects "Stripe" as the payment method
    And the user enters invalid card information
    And the user clicks on the "Confirm Order" button
    Then an error message "Invalid card details" should be displayed

  Scenario: Cancel payment and resume shopping
    Given the user navigates to the Payment Information page
    When the user clicks on the "Back to Shopping" button
    Then the shopping process should be resumed




