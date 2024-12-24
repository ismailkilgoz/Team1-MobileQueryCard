package stepdefinitions;

import Page.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.OptionsMet;
import utilities.ReusableMethods;

import javax.sound.midi.InvalidMidiDataException;

import static utilities.Driver.getAppiumDriver;
import static utilities.Driver.quitAppiumDriver;

public class homePageCategoryStepdefiitions extends OptionsMet {



    HomePage homePage=new HomePage();


    @Given("kullanici anasayfaya gelir")
    public void kullanici_anasayfaya_gelir() {
        getAppiumDriver();
    }
    @Then("kullanici sayfayi kaydirarak popular brands basligini gorur")
    public void kullanici_sayfayi_kaydirarak_popular_brands_basligini_gorur() throws InvalidMidiDataException {


        ReusableMethods.wait(4);
        OptionsMet.swipe(614,2378,637,270);

        ReusableMethods.wait(4);
        OptionsMet.swipe(614,2378,637,270);

        ReusableMethods.wait(4);
        String popularBrandsExpected="Popular Brands";
        VerifyElementText(popularBrandsExpected);

       // Assert.assertTrue(homePage.popularBrands.isDisplayed());



    }
    @Then("kullanici popular brands basligi altindaki brandlari gorur")
    public void kullanici_popular_brands_basligi_altindaki_brandlari_gorur() {

       // Assert.assertTrue(homePage.BlossomBoutique.isDisplayed());
       // Assert.assertTrue(homePage.Nike.isDisplayed());
       // Assert.assertTrue(homePage.Clarks.isDisplayed());
      //  Assert.assertTrue(homePage.DrMartens.isDisplayed());



        String BlossomBoutiqueExpected="Blossom Boutique";
        VerifyElementText(BlossomBoutiqueExpected);

        String nikeExpected="Nike";
        VerifyElementText(nikeExpected);


        String drMartensExpected="Dr. Martens";
        VerifyElementText(nikeExpected);



        String clarksExpected="Clarks";
        VerifyElementText(clarksExpected);


        quitAppiumDriver();






    }
}
