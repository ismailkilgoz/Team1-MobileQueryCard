Feature: US_012 Product test selected on homepage

  Background: User opens the app
    * User makes driver adjustments

  Scenario: US_012>TC_01 It should be possible to go to the selected product page from the homepage
    * User clicks on the first image
    * The user verifies "Size" is displayed.
    * User verifies Details, Videos, Review, Review, Shipping&Return headings are enable
    * Driver turns off

  Scenario: US_012>TC_02 It should be possible to go to the selected product page from the homepage
    * User clicks on the first image
    * User clicks Details
    * User verifies "Flower Print Foil T-shirt" is displayed
    * Driver turns off


  Scenario: US_012>TC_03 It should be possible to go to the selected product page from the homepage
    * User clicks on the first image
    * User clicks Videos
    * User verifies "Videos" is displayed
    * Driver turns off


  Scenario: US_012>TC_04 It should be possible to go to the selected product page from the homepage
    * User clicks on the first image
    * The user clicks Review
    * User verifies "0" is displayed
    * Driver turns off


  Scenario: US_012>TC_05 It should be possible to go to the selected product page from the homepage
    * User clicks on the first image
    * The user clicks Shipping & Return
    * User verifies text is displayed
    * Driver turns off