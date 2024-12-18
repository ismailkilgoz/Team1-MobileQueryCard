Feature:  [US_025]  Return
  Background: User opens the app
    * User makes driver adjustments

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
      #*
      # Dashboard Order History sayfasinda secilen siparis (Delivered olan) sayfasinda Return Request butonu gorunur ve aktif olmali
      #*
      # Request Return sayfasında istenen urun secilebilmeli
      #*
      # İade nedeni ,not ve attachment eklenebilmeli
      #*
      # Request Return butonu gorunur ve aktif olmalı
      #*
      # Return Orders sayfasında iade islemi baslatıldıgı goruntulenmeli