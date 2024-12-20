package stepdefinitions;

import io.cucumber.java.en.Given;
import utilities.ConfigReader;
import utilities.ExcelDataReader;

public class PaymentStepdefinition {

    ExcelDataReader excelDataReader=new ExcelDataReader(ConfigReader.getProperty("userAccess"));

    @Given("The user is signed in as cusmoter seren")
    public void the_user_is_signed_in() {
       excelDataReader.signInWithExcelData(excelDataReader,6,5);
    }
}
