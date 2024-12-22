package stepdefinitions;

import Page.PaymentPage;
import com.github.javafaker.Faker;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import utilities.ConfigReader;
import utilities.ExcelDataReader;
import utilities.ReusableMethods;

import static utilities.Driver.getAppiumDriver;

public class PaymentStepdefinition {

    public static AndroidDriver driver= (AndroidDriver) getAppiumDriver();
    ExcelDataReader excelDataReader=new ExcelDataReader(ConfigReader.getProperty("userAccess"));
        PaymentPage paymentPage=new PaymentPage();
        static Faker faker=new Faker();
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
}
