package stepdefinitions;

import Page.ForgotPasswordPage;
import io.cucumber.java.en.Given;
import utilities.ReusableMethods;

public class ForgotPasswordStepdefinition {

    ForgotPasswordPage forgotPasswordPage=new ForgotPasswordPage();

    @Given("Verifies succes Message {string} in dashboard.")
    public void verifies_username_in_dashboard(String expectedMessage) {

        ReusableMethods.VerifyElementTextByGetAttribute(expectedMessage,forgotPasswordPage.getSuccessMessageText());
    }
    @Given("Verifies confirmation message {string} in dashboard.")
    public void verifies_confirmation_message_in_dashboard(String expectedMessage) {
       ReusableMethods.VerifyElementTextByGetAttribute(expectedMessage,forgotPasswordPage.getPassSuccessfullyResetMessage());
    }

}
