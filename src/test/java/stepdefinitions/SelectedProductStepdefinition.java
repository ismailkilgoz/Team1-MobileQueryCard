package stepdefinitions;

import Page.MostPopularPage;
import Page.QueryCardPage;
import Page.SelectedProductPage;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.interactions.Actions;
import utilities.OptionsMet;
import utilities.ReusableMethods;

import javax.sound.midi.InvalidMidiDataException;

import static utilities.Driver.getAppiumDriver;

public class SelectedProductStepdefinition extends OptionsMet {

    SelectedProductPage selectedProductPage=new SelectedProductPage();
    public static AndroidDriver driver= (AndroidDriver) getAppiumDriver();
    Actions actions = new Actions(getAppiumDriver());
    QueryCardPage card = new QueryCardPage();



    @Given("User clicks on the first image")
    public void user_clicks_on_the_first_image() {
        ReusableMethods.wait(1);
       selectedProductPage.FlowerPrintFoilTshirt.click();
        ReusableMethods.wait(1);
    }

    @Given("The user verifies {string} is displayed.")
    public void the_user_verifies_is_displayed(String Size) {
        selectedProductPage.Size.isDisplayed();
        ReusableMethods.wait(2);
    }

    @Given("User verifies Details, Videos, Review, Review, Shipping&Return headings are enable")
    public void user_verifies_details_videos_review_review_shipping_return_headings_are_enable() throws InvalidMidiDataException {
        OptionsMet.swipe(540,2240,540,500);
        selectedProductPage.Details.isDisplayed();
        selectedProductPage.Videos.isDisplayed();
        selectedProductPage.Review.isDisplayed();
        ReusableMethods.wait(2);
        OptionsMet.swipe(1016, 2067,368,2067);
        selectedProductPage.ShippingReturn.isDisplayed();
    }

    @Given("User clicks Details")
    public void user_clicks_details() throws InvalidMidiDataException {
        OptionsMet.swipe(540,2240,540,500);
        selectedProductPage.Details.isDisplayed();
        ReusableMethods.wait(1);
    }
    @Given("User verifies {string} is displayed")
    public void user_verifies_is_displayed(String string) {
        selectedProductPage.DetailsFlowerPrintFoilTshirt.isDisplayed();
    }


    @Given("User clicks Videos")
    public void user_clicks_videos() throws InvalidMidiDataException {
        OptionsMet.swipe(540,2240,540,500);
        selectedProductPage.Videos.click();
        ReusableMethods.wait(1);
        selectedProductPage.ProductVideos.isEnabled();
    }

    @Given("The user clicks Review")
    public void the_user_clicks_review() throws InvalidMidiDataException {
        OptionsMet.swipe(540,2240,540,500);
        selectedProductPage.Review.click();
        ReusableMethods.wait(1);
        selectedProductPage.ProductReviews.isDisplayed();
    }


    @Given("The user clicks Shipping & Return")
    public void the_user_clicks_shipping_return() throws InvalidMidiDataException {
        OptionsMet.swipe(540,2240,540,500);
        ReusableMethods.wait(1);
        OptionsMet.swipe(1016, 2067,368,2067);
        selectedProductPage.ShippingReturn.click();
        ReusableMethods.wait(1);

    }

    @Given("User verifies text is displayed")
    public void user_verifies_text_is_displayed() {
        selectedProductPage.ProductShippingReturn.isDisplayed();
    }
}
