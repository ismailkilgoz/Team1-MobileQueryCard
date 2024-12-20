Feature: [US_24] As a user, I would like to be able to register on the site to take advantage of its functions

  Background: User opens the app
    Given The user is signed in
    And The user has added items to the cart

#basarili odeme
  Scenario: Successful payment with Stripe
    Given the user navigates to the Payment Information page
    When the user selects "Stripe" as the payment method
    And the user fills in the card information
    And the user clicks on the "Confirm Order" button
    Then the order completion message should be displayed
    And the order details and invoice should be viewable

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




