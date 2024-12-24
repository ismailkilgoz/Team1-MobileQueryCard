Feature: US_010 Home Page Most Popular

  Background: User opens the app
    * User makes driver adjustments

  Scenario:  US_010>TC_01 Most Popular menu title should be visible on the home page navBar.
    * User clicks the button with description "Most Popular"
    * The user verifies that the "Most Popular" is displayed.
    * Driver turns off


  Scenario:  US_010>TC_02 See All icon should be visible and active
    * User clicks the button with description "See All"
    * User verifies "See All" category is enable and clickable
    * User confirms to be on the Most Popular Page
    * Driver turns off

  Scenario:  US_010>TC_03 Current products should be listed under Most Popular and the backwards
    * User clicks the button with description "See All"
    * User confirms to be on the Most Popular Page
    * User Confirms that there are new products on the Most Popular Page
    * User clicks the backwards button
    * Driver turns off
