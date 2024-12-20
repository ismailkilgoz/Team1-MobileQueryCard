package stepdefinitions;

import Page.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Point;
import utilities.OptionsMet;
import utilities.ReusableMethods;

import javax.sound.midi.InvalidMidiDataException;

import static utilities.Driver.getAppiumDriver;

public class US_05Stepdefiitions extends OptionsMet {



    HomePage homePage=new HomePage();


    @Given("kullanici anasayfaya gelir")
    public void kullanici_anasayfaya_gelir() {
        getAppiumDriver();
    }
    @Then("kullanici sayfayi kaydirarak popular brands basligini gorur")
    public void kullanici_sayfayi_kaydirarak_popular_brands_basligini_gorur() throws InvalidMidiDataException {


      swipe(655,2228,637,339);
      swipe(655,2355,695,419);

        Assert.assertTrue(homePage.popularBrands.isDisplayed());



    }
    @Then("kullanici popular brands basligi altindaki brandlari gorur")
    public void kullanici_popular_brands_basligi_altindaki_brandlari_gorur() {

        Assert.assertTrue(homePage.BlossomBoutique.isDisplayed());
        Assert.assertTrue(homePage.Nike.isDisplayed());
        Assert.assertTrue(homePage.Clarks.isDisplayed());
        Assert.assertTrue(homePage.DrMartens.isDisplayed());



    }
}
