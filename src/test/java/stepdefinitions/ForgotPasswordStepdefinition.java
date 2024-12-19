package stepdefinitions;

import Page.ForgotPasswordPage;
import io.appium.java_client.MobileBy;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;

public class ForgotPasswordStepdefinition {

    ForgotPasswordPage forgotPasswordPage=new ForgotPasswordPage();


    @Given("The user enters a valid email {string} into the email box.")
    public void the_user_enters_a_valid_email_into_the_email_box(String mail) {
        forgotPasswordPage.getEmailBox().click();
        forgotPasswordPage.getEmailBox().sendKeys(mail);
    }
    @Given("The user verifies that the {string} is displayed on the profile page.")
    public void the_user_verifies_that_the_username_is_displayed_on_the_profile_page(String username) {
        forgotPasswordPage.VerifyUsernameDisplayed(username);
    }

    @Given("Verifies succes Message {string} in dashboard.")
    public void verifies_username_in_dashboard(String expectedMessage) {

        ReusableMethods.VerifyElementTextByGetAttribute(expectedMessage,forgotPasswordPage.getSuccessMessageText());
    }
    @Given("Verifies confirmation message {string} in dashboard.")
    public void verifies_confirmation_message_in_dashboard(String expectedMessage) {
       ReusableMethods.VerifyElementTextByGetAttribute(expectedMessage,forgotPasswordPage.getPassSuccessfullyResetMessage());
    }



}
