Feature:
Background:
  * User confirms to be on the homepage
  * User clicks the button with description "Profile"
  * User clicks the button with description "Sign In"
  * User click the button Use Email Instead and sendKeys "xaverne.user@querycart.com"
  * User clicks the button "signInLoginButton"
  * User clicks the button with description "Profile"
  * Verifies username "xaver" in dashboard

  Scenario: Verify "Order History" menu item is visible and active.
    * User verify that "Order History" item is visible

  Scenario: Verify shopping history viewing icon is active.
    * User goes to Order History page
    * User verify view history icon is visible

  Scenario Outline: Verify order invoice can be accessed from Order History.
    * User goes to Order History page
    * User click on order <index>
    * User click on Downland Receipt
    * User verify that receipt contains <orderId>, <orderDate>, <orderHour>, <paymentType>, <total>
    Examples:
      |index|orderId   |orderDate |orderHour            |paymentType     |total   |
      |1  |#231224891  |05:48 AM  | 24-12-2024  |Stripe          |$410.00|

  Scenario: Verify an order can be canceled from the Order History.
    * User goes to Order History page
    * User click on order 2
    * User scroll down into bottom
    * User verify that cancel button is active.