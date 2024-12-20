Feature: US_03 Add To Cart

  Background: User opens the app
    * User makes driver adjustments
@can
  Scenario:  TC_03 Test to select favorite products and add to wishlist
    * Waiting
    * User swipes to screen coordinates 520, 1140, 533, 135
    * User swipes to screen coordinates 537, 839, 546, 411
    * Waiting
    * User clicks the tap coordinates 275, 1428
    * Waiting
    * User clicks the button with name of description "M"
    * User clicks the button with name of description "Black"
    * User swipes to screen coordinates 550, 1970, 555, 1459
    * User increases the product
    * User clicks the button with name of description "Add To Cart"
    * Driver turns off