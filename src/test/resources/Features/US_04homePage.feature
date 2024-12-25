Feature:

  Scenario: User test to see if categories are visible on the home page

    Given kullanici anasayfaya gelir
    Then kullanici  categories basligini gorur
    And  kullanici  categorileri gorur

    Scenario: Test where the user can select a product from the category page

      Given kullanici anasayfaya gelir
      Then kullanici  categories basligini gorur
      Then  kullanici Men Clothing basligina tıklar
      Then kullanici Classic Cargo Shorts a tiklar
      Then kullanici "M" u secer
      Then kullanici Quantity 2 secer
      Then kullanici Add To Card butonuna tiklar
      And  kullanici "Succes" mesajini gorur
