Feature:

  Scenario: Testing whether brands are visible under the popular brands heading on the user's home page

    Given kullanici anasayfaya gelir
    Then kullanici sayfayi kaydirarak popular brands basligini gorur
    Then kullanici popular brands basligi altindaki brandlari gorur
