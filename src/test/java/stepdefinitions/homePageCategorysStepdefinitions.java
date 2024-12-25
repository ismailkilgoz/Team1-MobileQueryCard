package stepdefinitions;

import Page.HomePage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.OptionsMet;
import utilities.ReusableMethods;

import javax.sound.midi.InvalidMidiDataException;

import static utilities.Driver.quitAppiumDriver;

public class homePageCategorysStepdefinitions extends OptionsMet {



    HomePage homePage=new HomePage();


    @Then("kullanici  categories basligini gorur")
    public void kullanici_categories_basligini_gorur() {

        ReusableMethods.wait(5);

        String categoryExpected="Category";
        VerifyElementText(categoryExpected);

       // Assert.assertTrue(homePage.category.isDisplayed());

    }
    @Then("kullanici  categorileri gorur")
    public void kullanici_categorileri_gorur() throws InvalidMidiDataException {


        ReusableMethods.wait(5);
        String menExpected="Men";
        VerifyElementText(menExpected);

        String menClothingExpected="Men Clothing";
        VerifyElementText(menClothingExpected);

        String menTshirtExpected="Men T-Shirt";
        VerifyElementText(menTshirtExpected);

        String menShortsExpected="Men Shorts";
        VerifyElementText(menShortsExpected);

        ReusableMethods.wait(4);
        OptionsMet.swipe(1154,1177,241,1166);


        String menCoatExpected="Men Coat";
        VerifyElementText(menCoatExpected);

        String menSuitExpected="Men Suit";
        VerifyElementText(menSuitExpected);

        String menShoesExpected="Men Shoes";
        VerifyElementText(menShoesExpected);


        ReusableMethods.wait(4);
        OptionsMet.swipe(1154,1177,241,1166);



        String menSneakersExpected="Men Sneakers";
        VerifyElementText(menSneakersExpected);

        String menClassicShoesExpected="Men Classic Shoes";
        VerifyElementText(menClassicShoesExpected);

        String menBootsExpected="Men Boots";
        VerifyElementText(menBootsExpected);

        String menCasualShoesExpected="Men Casual Shoes";
        VerifyElementText(menCasualShoesExpected);



        ReusableMethods.wait(4);
        OptionsMet.swipe(1154,1177,241,1166);



        String menAccessoriesExpected="Men Accessories";
        VerifyElementText(menAccessoriesExpected);

        String menBagsExpected="Men Bags";
        VerifyElementText(menBagsExpected);

        String menSocksExpected="Men Socks";
        VerifyElementText(menSocksExpected);



        ReusableMethods.wait(4);
        OptionsMet.swipe(1154,1177,241,1166);


        String menWatchExpected="Men Watch";
        VerifyElementText(menWatchExpected);

        String womenExpected="Women";
        VerifyElementText(womenExpected);

        String womenClothingExpected="Women Clothing";
        VerifyElementText(womenClothingExpected);





        ReusableMethods.wait(4);
        OptionsMet.swipe(1154,1177,241,1166);



        String womenDressesSkirtsExpected="Woman Dresses - Skirts";
        VerifyElementText(womenDressesSkirtsExpected);


        String womenTshirtExpected="Woman T-shirt";
        VerifyElementText(womenTshirtExpected);

        ReusableMethods.wait(4);
        OptionsMet.swipe(1154,1177,241,1166);

        String womenTrousersExpected="Woman Trousers";
        VerifyElementText(womenTrousersExpected);

        String womenCoatExpected="Woman Coat";
        VerifyElementText(womenCoatExpected);

        String womenShoesExpected="Women Shoes";
        VerifyElementText(womenShoesExpected);


        ReusableMethods.wait(4);
        OptionsMet.swipe(1154,1177,241,1166);




        String womentCasualShoesExpected="Women Casual Shoes";
        VerifyElementText(womentCasualShoesExpected);

        String womenClassicShoesExpected="Women Classic Shoes";
        VerifyElementText(womenClassicShoesExpected);

        ReusableMethods.wait(4);
        OptionsMet.swipe(1154,1177,241,1166);

        String womenBootsExpected="Women's Boots";
        VerifyElementText(womenBootsExpected);

        String womenSneakersExpected="Women Sneakers";
        VerifyElementText(womenSneakersExpected);



        String womenAccessoriesExpected="Women Accessories";
        VerifyElementText(womenAccessoriesExpected);

        ReusableMethods.wait(4);
        OptionsMet.swipe(1154,1177,241,1166);

        String womenBagsExpected="Women Bags";
        VerifyElementText(womenBagsExpected);

        String womenWatchExpected="Women Watch";
        VerifyElementText(womenWatchExpected);



        String womenJeWerlyExpected="Women Jewelry";
        VerifyElementText(womenJeWerlyExpected);

        ReusableMethods.wait(4);
        OptionsMet.swipe(1154,1177,241,1166);

        String juniorsExpected="Juniors";
        VerifyElementText(juniorsExpected);

        String juniorsClothingExpected="Juniors Clothing";
        VerifyElementText(juniorsClothingExpected);

        String girlClothesExpected="Girl Clothes";
        VerifyElementText(girlClothesExpected);




        ReusableMethods.wait(4);
        OptionsMet.swipe(1154,1177,241,1166);



        String juniorsSleepwearExpected="Juniors Sleepwear";
        VerifyElementText(juniorsSleepwearExpected);

        String boyClothesExpected="Boy Clothes";
        VerifyElementText(boyClothesExpected);

        String babyClothesExpected="Baby Clothes";
        VerifyElementText(babyClothesExpected);

        String juniorsShoesExpected="Juniors Shoes";
        VerifyElementText(juniorsShoesExpected);



        ReusableMethods.wait(4);
        OptionsMet.swipe(1154,1177,241,1166);



        String girlShoesExpected="Girl Shoes";
        VerifyElementText(girlShoesExpected);

        String boyShoesExpected="Boy Shoes";
        VerifyElementText(boyShoesExpected);

        String juniorsAccessoriesExpected="Juniors Accessories";
        VerifyElementText(juniorsAccessoriesExpected);



        ReusableMethods.wait(4);
        OptionsMet.swipe(1154,1177,241,1166);



        String juniorsBagsExpected="Juniors Bags";
        VerifyElementText(juniorsBagsExpected);

        String juniorsHatBeresExpected="Juniors Hat & Beres";
        VerifyElementText(juniorsHatBeresExpected);

        String toysExpected="Toys";
        VerifyElementText(toysExpected);



        quitAppiumDriver();



    }

    @Then("kullanici Men Clothing basligina tıklar")
    public void kullanici_men_clothing_basligina_tıklar() {


        ReusableMethods.wait(2);
        homePage.menClothing.click();

    }
    @Then("kullanici Classic Cargo Shorts a tiklar")
    public void kullanici_classic_cargo_shorts_a_tiklar() {

        ReusableMethods.wait(2);
        homePage.Classiccargoshort.click();

    }
    @Then("kullanici {string} u secer")
    public void kullanici_u_secer(String string) {

        ReusableMethods.wait(2);
        homePage.ClassiccargoshortM.click();

    }
    @Then("kullanici Quantity {int} secer")
    public void kullanici_quantity_secer(Integer int1) {

        ReusableMethods.wait(2);
        homePage.ClassiccargoshortQuantity.click();

    }
    @Then("kullanici Add To Card butonuna tiklar")
    public void kullanici_add_to_card_butonuna_tiklar() throws InvalidMidiDataException {

        ReusableMethods.wait(4);
        OptionsMet.swipe(614,2378,637,270);

        ReusableMethods.wait(2);
        homePage.addToCard.click();

    }
    @Then("kullanici {string} mesajini gorur")
    public void kullanici_mesajini_gorur(String string) {

       Assert.assertTrue(homePage.succes.isDisplayed());
    }




}
