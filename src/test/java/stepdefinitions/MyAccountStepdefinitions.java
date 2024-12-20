package stepdefinitions;

import Page.MyAccountPage;
import Page.QueryCardPage;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.OptionsMet;
import utilities.ReusableMethods;


import javax.sound.midi.InvalidMidiDataException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.Driver.getAppiumDriver;
import static utilities.Driver.quitAppiumDriver;
public class MyAccountStepdefinitions extends OptionsMet{

    MyAccountPage account = new MyAccountPage();
    Actions actions = new Actions(getAppiumDriver());


    @Given("A user displays the icon of {string} on the homepage.")
    public void a_user_displays_the_icon_of_on_the_homepage(String profileIcon) {

        account.getProfileIcon().isDisplayed();
    }

    @Given("A user clicks on the icon and goes to the {string} directly.")
    public void a_user_clicks_on_the_icon_and_goes_to_the_directly(String profilePage) {
        account.getProfileIcon().click();

    }

    @Given("A user verifies that the {string} is displayed")
    public void a_user_verifies_that_the_is_displayed(String profilePage) {

        String expectedPageInfo = "umit.user@querycart.com";
        String actualPageInfo = account.getUserPageInfo().getText();

        assertEquals(expectedPageInfo, actualPageInfo);

    }


}
