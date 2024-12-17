package stepdefinitions;

import Page.SignUpPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.ReusableMethods;

public class SignUpStepdefinition {

    SignUpPage signUpPage=new SignUpPage();

    @Given("User clicks on the name button enters a valid {string}.")
    public void user_clicks_on_the_button_enters_a_valid( String firstName) {
        ReusableMethods.wait(2);
        signUpPage.getNameBox().click();
        signUpPage.getNameBox().sendKeys(firstName);
    }
    @Given("The user switches to {string} input field if needed")
    public void the_user_switches_to_input_field_if_needed(String inputType) {
        signUpPage.SelectSingUpWithEmailOrPhoneNumber(inputType);
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
    }


    @Then("The user should see a registration {string} message")
    public void the_user_should_see_a_registration_message(String message) {
        Assert.assertTrue(signUpPage.getButtonWebelementByDesc(message).isDisplayed());
        ReusableMethods.wait(6);
    }


    //  TC02

    @Given("User clicks the button with description Sign Up.")
    public void user_clicks_the_button_with_description() {
        ReusableMethods.wait(3);
        signUpPage.getSignUpButtonforUnsuccesMessage().click();
    }

    @Given("The user enters an already registered {string}")
    public void the_user_enters_an_already_registered(String existedMailOrPhone) {

       signUpPage.getPhoneOrEmailBox().click();
       signUpPage.getPhoneOrEmailBox().sendKeys(existedMailOrPhone);
    }

    @Then("The user should see a registration {string} message.")
    public void the_user_should_see_a_registration_message_(String errorMessage) {
        Assert.assertEquals(errorMessage,signUpPage.getErrorMessage().getText());


    }


}
