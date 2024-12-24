Feature:  As a user, I want to be able to see all the categories on the site under the Categories heading.

  Background: User opens the app
    When  User confirms to be on the QueryCart Homepage
    Then  User clicks the button with description "Category"
    And   User confirms to be on the Category Page


    Scenario: As a user, I want to be able to see Men Category on the site under the Categories heading.

      Then  Use confirms that Men Category button is visible
      And   User clicks the button with description "Men"
      Then  User confirms to be on the Men Category page
      Then  Use confirms that Men Category Filter icon is visible
      And   User clicks the Filter button
      Then  User confirms to be on the Category Filter page
      And   Driver turns off


    Scenario: As a user, I want to be able to see Women Category on the site under the Categories heading.

      Then  Use confirms that Women Category button is visible
      And   User clicks the button with description "Women"
      Then  User confirms to be on the Women Category page
      Then  Use confirms that Women Category Filter icon is visible
      And   User clicks the Filter button
      Then  User confirms to be on the Category Filter page
      And   Driver turns off


    Scenario: As a user, I want to be able to see Juniors Category on the site under the Categories heading.

      Then  Use confirms that Juniors Category button is visible
      And   User clicks the button with description "Juniors"
      Then  User confirms to be on the Juniors Category page
      Then  Use confirms that Juniors Category Filter icon is visible
      And   User clicks the Filter button
      Then  User confirms to be on the Category Filter page
      And   Driver turns off

