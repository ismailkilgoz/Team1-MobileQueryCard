package stepdefinitions;

import Page.ReturnPage;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;

import javax.sound.midi.InvalidMidiDataException;

import static utilities.Driver.getAppiumDriver;

public class ReturnStepdefinitions {
    ReturnPage returnPage = new ReturnPage();
    Actions actions = new Actions(getAppiumDriver());

    @Given("User click the button Use Email Instead and sendKeys {string}")
    public void user_click_the_button_use_email_instead_and_send_keys(String email) {
        returnPage.emailTextBoxClickAndSendKeys(email);
        // Email alanından sonra Tab ile şifre alanına geç
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys("Query.151224").perform();
        ReusableMethods.wait(1);
    }

    @Given("User clicks on the home, selects a product and completes the purchase")
    public void user_clicks_on_the_home_selects_a_product_and_completes_the_purchase() throws InvalidMidiDataException {
        returnPage.adidasProductFromHomePage();
    }

}
