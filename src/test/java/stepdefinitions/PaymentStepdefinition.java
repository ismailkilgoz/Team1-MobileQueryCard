package stepdefinitions;

import Page.PaymentPage;
import com.github.javafaker.Faker;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ConfigReader;
import utilities.ExcelDataReader;
import utilities.OptionsMet;
import utilities.ReusableMethods;

import javax.management.relation.RelationSupport;
import java.time.Duration;
import java.util.NoSuchElementException;

import static utilities.Driver.getAppiumDriver;

public class PaymentStepdefinition {

    public static AndroidDriver driver= (AndroidDriver) getAppiumDriver();
    ExcelDataReader excelDataReader=new ExcelDataReader(ConfigReader.getProperty("userAccess"));
        PaymentPage paymentPage=new PaymentPage();
        static Faker faker=new Faker();
    static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    @Given("The user is signed in as cusmoter seren")
    public void the_user_is_signed_in() {
       excelDataReader.signInWithExcelData(excelDataReader,6,4);
    }

    @Given("User clicks cart Icon.")
    public void user_clicks_cart_icon() {
        paymentPage.getToCartButton().click();
    }

    @Given("The user verifies that text contains {string}.")
    public void the_user_verifies_that_text_contains(String text) {
        ReusableMethods.VerifyTextDisplayedWithDesc(text);
    }
    @Given("The user clicks card Number Box.")
    public void the_user_clicks_card_number_box() {
        ReusableMethods.waitForElement(driver,paymentPage.getCardNumberBox(),10);
        paymentPage.getCardNumberBox().click();
    }
    @Given("The user enters valid card information into the card number box.")
    public void the_user_enters_valid_card_information_into_the_card_number_box() {
            paymentPage.fillCreditCardDetails();
    }
    @Given("The user clicks the confirm button to approve the payment.")
    public void the_user_clicks_the_confirm_button_to_approve_the_payment() {
        paymentPage.getConfirmButton().click();
    }


    @Given("The user verifies that the sum of the subtotal and tax matches the total amount.")
    public void the_user_verifies_that_the_sum_of_the_subtotal_and_tax_matches_the_total_amount() {
        paymentPage.verifyTotalAmountCalculation();
    }

    @Given("The user verifies that the order date on the invoice matches today's date.")
    public void the_user_verifies_that_the_order_date_and_time_is_today_s_date() {
        paymentPage.VerifyInvoiceDate();
    }

    @Given("The user verifies that the {string} is displayed")
    public void the_user_verifies_that_the_is_displayed(String string) {
        OptionsMet.VerifyElementText(string);

    }
    @Then("a pop-up message {string} should be displayed.")
    public void an_error_message_should_be_displayed(String str) {

        WebElement textelement = wait.until(ExpectedConditions.visibilityOf(paymentPage.getSelectPaymentMethod()));
            String strText= textelement.getAttribute("content-desc");
        System.out.println(strText);
        // Elementin görünüp görünmediğini kontrol et
            Assert.assertTrue(strText.contains(str));

       ReusableMethods.wait(2);

    }

    @Given("The user enters invalid card information")
    public void the_user_enters_invalid_card_information() {
     paymentPage.fillCreditCardDetailsWithInvalidCard();
    }

    @Then("an error message {string} should be displayed.")
    public void an_error_message_should_be_displayed_(String errorText) {
        ReusableMethods.waitForElement(driver,paymentPage.getInvalidCardMessage(),15);

        String errorMessage= paymentPage.getInvalidCardMessage().getAttribute("text");
        System.out.println("Actual Error Message: "+errorMessage);
        Assert.assertEquals(errorText,errorMessage);

    }

}
