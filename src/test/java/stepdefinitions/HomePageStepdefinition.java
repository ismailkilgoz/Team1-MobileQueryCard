package stepdefinitions;

import Page.HomePage;
import Page.SignUpPage;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import utilities.ReusableMethods;

import static utilities.Driver.getAppiumDriver;
import static utilities.OptionsMet.clickButtonByDescription;

public class HomePageStepdefinition {

    HomePage signUpPage=new HomePage();
    public static AndroidDriver driver= (AndroidDriver) getAppiumDriver();


    @Given("User clicks the button with descriptionn {string}")
    public void user_clicks_the_button_with_descriptionn(String description) {
        ReusableMethods.wait(6);
        clickButtonByDescription(description);
    }
}
