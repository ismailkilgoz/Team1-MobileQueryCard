Feature:  [US_025]  Return
  Background: User opens the app
    * User makes driver adjustments
    @iso
    Scenario:

      * User confirms to be on the homepage
      * User clicks the button with description "Profile"
      * User clicks the button with description "Sign In"
      * User click the button Use Email Instead and sendKeys "mustafa.user@querycart.com"
      * User clicks the button "signInLoginButton"
      # Kayitli bir kullanici olarak (adres bilgileri girilmis), giris yapilmali
      * User clicks the button with description "Profile"
      * Verifies username "mustafa" in dashboard
      # Giris yapildigi kullanici adi ile dogrulanmali
      * User clicks on the home, selects a product and completes the purchase
      # Kullanıcı ana sayfaya tıklar, bir ürün secer ve satın alma islemini tamamlar
      * After the payment section is complated, the user clicks on the Go To Order Page button and verifies that is on the Order History page
      # Satin alim islemi tamamlandiktan sonra, kullanici Go To Order Page butonuna tiklar ve Order History sayfasina gittigini dogrular.
      * User clicks on his last order and examines the details
      # Kullanici son siparisine tiklar ve detaylari inceler
      * Switching from Query Cart application to Google Chrome
      # Uygulamadan cikip, google uzerinden QueryCart sayfasina gidilir
      * Go to the Query Cart url and log in with admin information
      # Query Cart sayfasina admin bilgileri ile giris yapilir
      * Go to dashboard from profile icon
      # Admin islemlerini yapabilmek icin Dashboard'a tiklanir
      * Go to the Online Orders page and after the user's order is verified, it is confirmed and delivered.
      # Online Orders sayfasina gecilir ve kullanicinin siparisi dogrulandiktan sonra onaylanir, teslim edilir
      * Returns to the Query Cart app as the user
      # Query Cart uygulamasina donulur

      # Dashboard Order History sayfasinda secilen siparis (Delivered olan) sayfasinda Return Request butonu gorunur ve aktif olmali
      #*
      # Request Return sayfasında istenen urun secilebilmeli
      #*
      # İade nedeni ,not ve attachment eklenebilmeli
      #*
      # Request Return butonu gorunur ve aktif olmalı
      #*
      # Return Orders sayfasında iade islemi baslatıldıgı goruntulenmeli

  Scenario: deneme
    * Switching from Query Cart application to Google Chrome
    * Go to the Query Cart url and log in with admin information
      # Query Cart sayfasina admin bilgileri ile giris yapilir
    * Go to dashboard from profile icon
      # Admin islemlerini yapabilmek icin Dashboard'a tiklanir
    * Go to the Online Orders page and after the user's order is verified, it is confirmed and delivered.

