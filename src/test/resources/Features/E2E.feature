Feature:  Demo E2E Testi
  Background: User opens the app
    * User makes driver adjustments
  Scenario:


    #Kullanici ziyaretci olarak siteyi gezer, bir urun begenir ve favorilere ekler    /US23/Uygar
    #
    #Kullanici, favorilere eklemek icin, kayit olmasi gerekir. SignUp der ve kayit olur     /US07/Seren
    #
    #Kayitli kullanici, kayit olduktan sonra favorilere ekledigi urunu goruntuler ve sepete ekler 	/US26/Xaver    /US11/Ozge	/US03/Can	/US27/Mustafa /US13/Rana
    #
    #Kayitli kullanici, satin alma islemlerini tamamlar. 	/US24/Seren  	/US25/Mustafa
    #
    #Kayitli kullanici, satin aldiktan sonra order history sayfasindan siparis detaylarini goruntuler.		/US25/Mustafa  		/US24/Seren		/US16/Umit
    #
    #Admine gecis yapilir, google uzerinden QueryCart url'ine gidilir ve admin olarak giris yapilir		/US25/Mustafa
    #
    #Dashboard'dan order history sayfasina gidilir ve siparis onaylanir				/US25/Mustafa
    #
    #Tekrar QuaryCart uygulamasina donup onaylandigi gozlemlenir	 	/US25/Mustafa
    #
    # Kayitli kullanici, logout olur.   /US22/Rana
    * User clicks profile button on the home page
    * User verifies logout button is enable
    * User verifies logout button clickable
    * Toaster is displayed
    * Driver turns off
    #	====================================================
    #
    #Kullanici aldigi urunu iade etmek ister ve order history'den iade islemleri baslatir	/US25/Mustafa
    #
    #Tekrar admine gecis yapilir ve iade islemleri onaylanir 	/US25/Mustafa
    #
    #QueryCart uygulamasina donulur ve iade gerceklestigi goruntulenir  /US25/Mustafa