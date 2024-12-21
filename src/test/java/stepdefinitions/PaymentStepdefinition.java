package stepdefinitions;

import Page.PaymentPage;
import io.cucumber.java.en.Given;
import utilities.ConfigReader;
import utilities.ExcelDataReader;

public class PaymentStepdefinition {

    ExcelDataReader excelDataReader=new ExcelDataReader(ConfigReader.getProperty("userAccess"));
        PaymentPage paymentPage=new PaymentPage();
    @Given("The user is signed in as cusmoter seren")
    public void the_user_is_signed_in() {
       excelDataReader.signInWithExcelData(excelDataReader,6,4);
    }

    @Given("User clicks cart Icon.")
    public void user_clicks_cart_icon() {
        paymentPage.getToCartButton().click();
    }
}
