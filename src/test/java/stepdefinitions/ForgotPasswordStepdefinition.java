package stepdefinitions;

import Page.ForgotPasswordPage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;
import utilities.OptionsMet;
import utilities.ReusableMethods;

import java.time.Duration;

import static utilities.Driver.getAppiumDriver;
import static utilities.OptionsMet.clickButtonByDescription;

public class ForgotPasswordStepdefinition {

    ForgotPasswordPage forgotPasswordPage=new ForgotPasswordPage();
    AndroidDriver driver= (AndroidDriver) getAppiumDriver();

    @Given("The user enters a valid email {string} into the email box.")
    public void the_user_enters_a_valid_email_into_the_email_box(String mail) {
        forgotPasswordPage.getEmailBox().click();
        forgotPasswordPage.getEmailBox().sendKeys(mail);
    }
    @Given("The user verifies that the {string} is displayed.")
    public void the_user_verifies_that_the_username_is_displayed_on_the_profile_page(String text) {
        ReusableMethods.VerifyTextDisplayedWithDesc(text);
    }

    @Given("Verifies succes Message {string} in dashboard.")
    public void verifies_username_in_dashboard(String expectedMessage) {
        String actualText= forgotPasswordPage.getSuccessMessageText().getAttribute("content-desc");
        System.out.println("ActualText : " + actualText);
        Assert.assertTrue(actualText.contains(expectedMessage));
    }
    @Given("Verifies confirmation message {string} in dashboard.")
    public void verifies_confirmation_message_in_dashboard(String expectedMessage) {
        String actualText= forgotPasswordPage.getPassResetMessage().getAttribute("content-desc");
        System.out.println("ActualText : " + actualText);
        Assert.assertTrue(actualText.contains(expectedMessage));

    }
    @Given("User clicks the button with description {string}.")
    public void user_clicks_the_button_with_description_(String description) {
        ReusableMethods.wait(6);
        clickButtonByDescription(description);


    }


    @Then("an error popUp phone text {string} should be displayed.")
    public void an_error_pop_up_phone_text_should_be_displayed(String phoneText) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement visibleElement = wait.until(ExpectedConditions.visibilityOf(forgotPasswordPage.getPhoneNotExist()));
        String errMes= visibleElement.getAttribute("content-desc");
        System.out.println("errMes = " + errMes);
      //  Assert.assertTrue(visibleElement.isDisplayed());
        Assert.assertTrue(errMes.contains(phoneText));


    }

    @Then("an error popUp mail text {string} should be displayed.")
    public void an_error_pop_up_mail_text_should_be_displayed(String mailtext) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement visibleElement = wait.until(ExpectedConditions.visibilityOf(forgotPasswordPage.getMailNotExist()));
        String errMes= visibleElement.getAttribute("content-desc");
        System.out.println("errMes = " + errMes);
        //  Assert.assertTrue(visibleElement.isDisplayed());
        Assert.assertTrue(errMes.contains(mailtext));

    }

}
