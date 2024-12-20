package stepdefinitions;

import Page.HomePage;
import Page.SignUpPage;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import utilities.OptionsMet;
import utilities.ReusableMethods;

import javax.sound.midi.InvalidMidiDataException;

import static utilities.Driver.getAppiumDriver;
import static utilities.OptionsMet.clickButtonByDescription;

public class HomePageStepdefinition {

    HomePage homePage=new HomePage();
    public static AndroidDriver driver= (AndroidDriver) getAppiumDriver();


    @Given("User clicks the button with descriptionn {string}")
    public void user_clicks_the_button_with_descriptionn(String description) {
        ReusableMethods.wait(6);
        clickButtonByDescription(description);
    }


    @Given("User click on Medium, one more product")
    public void user_click_on_medium_more_product() {
       ReusableMethods.wait(5);


    }

    @Given("Waiting")
    public void waiting(){
        ReusableMethods.wait(2);
    }
    @Given("User swipes to screen coordinates {int}, {int}, {int}, {int}")
    public void user_swipes_to_screen_coordinates(Integer int1, Integer int2, Integer int3, Integer int4) throws InvalidMidiDataException {
        OptionsMet.swipe(int1, int2, int3, int4);

    }

    @Given("User clicks the tap coordinates {int}, {int}")
    public void user_clicks_the_tap_coordinates(Integer int1, Integer int2) {
        ReusableMethods.wait(2);
        OptionsMet.touchDown(int1,int2);
        ReusableMethods.wait(2);
    }
    @Given("User clicks the button with name of description {string}")
    public void user_clicks_the_button_with_name_of_description(String string) {
        ReusableMethods.wait(6);
        clickButtonByDescription(string);
    }

    @Given("User increases the product")
    public void user_increases_the_product() {
        homePage.ArtiIcon.click();
    }
}
