package stepdefinitions;

import Page.QueryCardPage;
import Page.SignUpPage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

import static utilities.Driver.getAppiumDriver;

public class SignUpStepdefinition {

    SignUpPage signUpPage=new SignUpPage();

    AndroidDriver driver= (AndroidDriver) Driver.getAppiumDriver();
    WebDriverWait wait = new WebDriverWait(getAppiumDriver(), Duration.ofSeconds(30));
    @Given("User clicks on the name button enters a valid {string}.")
    public void user_clicks_on_the_button_enters_a_valid( String firstName) {
        ReusableMethods.wait(2);
        signUpPage.getNameBox().click();
        signUpPage.getNameBox().sendKeys(firstName);
    }
    @Given("The user switches to {string} input field if needed")
    public void the_user_switches_to_input_field_if_needed(String inputType) {

        ReusableMethods.waitForElement(driver,signUpPage.getUseEmail(),15);
        signUpPage.getUseEmail().click();
    }
    @Given("The user enters {string} in the input field")
    public void the_user_enters_in_the_input_field(String inputValue) {
        signUpPage.getPhoneOrEmailBox().click();
        signUpPage.getPhoneOrEmailBox().sendKeys(inputValue);

    }
    @Given("The user enters a valid password {string}")
    public void the_user_enters_a_valid_password_(String validPassword) {
        signUpPage.getPasswordBox().click();
        signUpPage.getPasswordBox().sendKeys(validPassword);
        ReusableMethods.wait(2);
    }


    @Then("The user should see a registration {string} message")
    public void the_user_should_see_a_registration_message(String message) {
        ReusableMethods.waitForElement(driver,signUpPage.getSuccessRegisteredMessage(),15);
        String successMessage= signUpPage.getSuccessRegisteredMessage().getAttribute("content-desc");
        System.out.println("Actual success Message: "+successMessage);

        Assert.assertTrue(successMessage.contains(message));
       // Assert.assertTrue(signUpPage.getSuccessRegisteredMessage().isDisplayed());
    }


    //  TC02



    @Given("The user enters an already registered {string}")
    public void the_user_enters_an_already_registered(String existedMailOrPhone) {
       signUpPage.getPhoneOrEmailBox().click();
       signUpPage.getPhoneOrEmailBox().sendKeys(existedMailOrPhone);
    }
    @Given("User clicks the button with description Sign Up and should see a registration {string} message by the {string}.")
    public void user_clicks_the_button_with_description( String input_type,String expected_message) {
        ReusableMethods.waitForElement(driver,signUpPage.getSignUpButtonforUnsuccesMessage(),8);
       signUpPage.getSignUpButtonforUnsuccesMessage().click();
       signUpPage.verifyGetErrorMessage(input_type,expected_message);
    }
    // TC03


    @Given("User leaves {string} empty by {string} , clicks the button with description Sign Up and should see a validation message {string}.")
    public void user_leaves_empty( String field, String input_type,String message ) {
        signUpPage.verifyRequiredFieldIsNotEmpty(input_type ,field,message);
    }

    @Then("an error message {string} should be displayed on singUp Page.")
    public void an_error_message_should_be_displayed_on_sing_up_page(String errorText) {
      /*  System.out.println(errorText);
        ReusableMethods.waitForElement(driver,signUpPage.getErrorEmailMessage(),15);
        Assert.assertTrue(signUpPage.getErrorEmailMessage().isDisplayed());

       */

        ReusableMethods.waitForElement(driver,signUpPage.getShortPassText(),20);
        String shortPass=signUpPage.getShortPassText().getAttribute("content-desc");
        Assert.assertTrue(shortPass.contains(errorText));


    }

    @Given("The user switches to {string} input field if needed.")
    public void the_user_switches_to_input_field_if_needed_(String string) {
        ReusableMethods.waitForElement(driver,signUpPage.getUseEmail(),15);
        signUpPage.getUseEmail().click();
        System.out.println(string);
    }



    @Given("User selects the country code +49")
    public void user_selects_the_country_code() {
        WebElement webElement = driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiSelector().description(\"+49\")"));
        ReusableMethods.waitForElement(driver,webElement,30);
        webElement.click();
    }
    @Given("The user enters {string} in the phone input field")
    public void the_user_enters_in_the_phone_input_field(String phone) {
        Assert.assertTrue(signUpPage.getPhoneOrEmailBox().isDisplayed());
        signUpPage.getPhoneOrEmailBox().click();
        signUpPage.getPhoneOrEmailBox().sendKeys(phone);
    }
    @Then("the user should not see a success message.")
    public void the_user_should_not_see_a_success_message() {
        signUpPage.verifySuccessMessageNotExist();
    }

    @Given("User clicks the button Sign Up.")
    public void user_clicks_the_button() {
    signUpPage.getSignUpButtonforUnsuccesMessage().click();
    }

    @Given("The user enters {string} as the password")
    public void the_user_enters_as_the_password(String weakPass) {
        signUpPage.getPasswordBox().click();
        signUpPage.getPasswordBox().sendKeys(weakPass);
        ReusableMethods.wait(2);
    }
    @Then("The user should see an error message {string}")
    public void the_user_should_see_an_error_message(String string) {

    }
}
