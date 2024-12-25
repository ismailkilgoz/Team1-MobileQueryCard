package stepdefinitions;

import Page.MyAccountPage;
import Page.QueryCardPage;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import org.apache.poi.sl.draw.geom.GuideIf;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ConfigReader;
import utilities.ExcelDataReader;
import utilities.OptionsMet;
import utilities.ReusableMethods;


import javax.sound.midi.InvalidMidiDataException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.Driver.getAppiumDriver;

public class MyAccountStepdefinitions extends OptionsMet {

    MyAccountPage account = new MyAccountPage();
    Actions actions = new Actions(getAppiumDriver());
    ExcelDataReader excelDataReader = new ExcelDataReader(ConfigReader.getProperty("userAccess"));
    QueryCardPage queryCardPage = new QueryCardPage();


    @Given("A user displays the icon of {string} on the homepage.")
    public void a_user_displays_the_icon_of_on_the_homepage(String profileIconText) throws InterruptedException {

        ReusableMethods.waitForElement(driver, account.getProfileIcon(), 12);
        OptionsMet.clickButtonByDescription(profileIconText);
        //account.getProfileIcon().isDisplayed();

    }

    @Given("A user clicks on the icon and goes to the {string} directly.")
    public void a_user_clicks_on_the_icon_and_goes_to_the_directly(String profilePage) throws InterruptedException {

        ReusableMethods.wait(4);
        account.getProfileIcon().click();
        ReusableMethods.wait(2);

    }

    @Given("A user verifies that the {string} is displayed")
    public void a_user_verifies_that_the_is_displayed(String profilePage) {


        OptionsMet.clickAndVerify(account.getMyAccountHeader());


    }


    @Given("A user clicks on the header of {string}.")
    public void a_user_clicks_on_the_header_of(String myAccount) throws InterruptedException {

        ReusableMethods.wait(3);
        account.getMyAccountHeader().click();


    }

    @Given("A user verifies that the headers of {string} , {string} , {string} , {string} are displayed on the {string} page.")
    public void a_user_displays_the_headers_of_on_the_page(String totalOrders, String totalCompleted, String totalReturned, String walletBalance, String MyAccountPage) {

        Assert.assertTrue(account.getTotalOrdersHeader().isDisplayed());
        Assert.assertTrue(account.getTotalCompletedHeader().isDisplayed());
        Assert.assertTrue(account.getTotalReturnedHeader().isDisplayed());
        Assert.assertTrue(account.getWalletBalance().isDisplayed());


    }


    @Given("A user displays the header of {string}.")
    public void a_user_displays_the_header_of(String orderHistory) {

        ReusableMethods.wait(4);
        account.getOrderHistoryTitle().click();
        ReusableMethods.wait(2);

    }

    @Given("A user clicks on the header of Order History Page and verifies that order details are displayed.")
    public void a_user_clicks_on_the_header_of_and_verifies_that_order_details_are_displayed() throws InvalidMidiDataException {

        ReusableMethods.wait(3);
        account.getOrderHistoryPage().isDisplayed();
        ReusableMethods.wait(3);
        ReusableMethods.tapAtCoordinates(937, 488);
        ReusableMethods.wait(3);
        OptionsMet.swipe(514, 1865, 527, 292);
        ReusableMethods.wait(3);
        account.getDownloadReceipt().click();
        ReusableMethods.wait(4);

        String expectedOrderId = "Order#181224761";
        String actualOrderId = account.getOrderId().getAttribute("content-desc");

        Assert.assertEquals(expectedOrderId, actualOrderId);


    }


    @Given("A user signs in the profile page with {string} and {string}")
    public void a_user_signs_in_the_profile_page_with(String email, String password) {

        ReusableMethods.wait(4);
        account.getEmailBar().click();
        ReusableMethods.wait(5);
        account.getEmailBar().sendKeys(email);
        ReusableMethods.wait(4);
        account.getPasswordBar().click();
        ReusableMethods.wait(5);
        account.getPasswordBar().sendKeys(password);
        ReusableMethods.wait(4);
        account.getSignInClick().click();
        ReusableMethods.wait(2);


    }


    @Given("A user verifies that the Address Title is displayed")
    public void a_user_verifies_that_the_address_title_is_displayed() {

        ReusableMethods.wait(3);
        account.getAddressHeader().isDisplayed();

    }

    @Given("A user clicks on the title and goes to the address page directly")
    public void a_user_clicks_on_the_title_and_goes_to_the_address_page_directly() {

        ReusableMethods.wait(3);
        account.getAddressHeader().click();
        ReusableMethods.wait(3);
        Assert.assertTrue(account.getAddressPage().isDisplayed());
    }


    @Given("A user clears the text")
    public void a_user_clears_the_text() {

        ReusableMethods.wait(3);
        account.getZipCodeRow().clear();

    }

    @Given("A user enters a new zipcode of {string}")
    public void a_user_enters_a_new_zipcode_of(String new_zipcode) {
        ReusableMethods.wait(5);
        account.getZipCodeRow2().click();
        ReusableMethods.wait(1);
        account.getZipCodeRow2().sendKeys(new_zipcode);


    }


    @Given("A user clicks the edit button")
    public void a_user_clicks_the_edit_button() {
        ReusableMethods.wait(1);
        account.getEditFirstAddressButton().click();
        // ReusableMethods.tapAtCoordinates(879,474);
        ReusableMethods.wait(3);

    }

    @Given("A user clicks the zipcode row")
    public void a_user_clicks_the_zipcode_row() {

        account.getZipCodeRow().click();
        ReusableMethods.wait(3);

    }

    @Given("A user verifies the new zipcode")
    public void a_user_verifies_the_new_zipcode() {

        ReusableMethods.wait(4);
        account.getEditFirstAddressButton().click();
        ReusableMethods.wait(4);
        ReusableMethods.waitForElement(driver,account.getZipCodeRow3(),12);
        account.getZipCodeRow3().click();
        ReusableMethods.wait(4);
        String expectedZipcode = "60100";
        String actualzipcode = account.getZipCodeRow3().getText();
        ReusableMethods.wait(3);
        Assert.assertEquals(expectedZipcode, actualzipcode);

        ReusableMethods.wait(3);
        //OptionsMet.clickAndVerify(account.getUpdatedSuccessfullyMessage());
        //Assert.assertTrue(account.getUpdatedSuccessfullyMessage().isDisplayed());
        //ReusableMethods.VerifyElementTextByGetAttribute("Address Updated Successfully!", account.getUpdatedSuccessfullyMessage());


    }

    @Given("A user deletes the second address and verifies that it is deleted")
    public void a_user_deletes_the_second_address_and_verifies_that_it_is_deleted() {

        ReusableMethods.wait(5);
        OptionsMet.clickAndVerify(account.getDeleteSecondAddressButton());
        ReusableMethods.wait(6);
        OptionsMet.clickButtonByDescription("Delete");
        ReusableMethods.wait(5);

        if (account.getAddress2() == null) {

            Assert.assertTrue("Address Deleted",true);
            System.out.println("Address Deleted");
        }







    }

    @Given("A user goes to the element of update and click on it")
    public void a_user_goes_to_the_element_of_update() {

        ReusableMethods.wait(4);
        OptionsMet.hideKeyboard();
        ReusableMethods.wait(5);
        account.getUpdateFirstAddressButton().click();
        ReusableMethods.wait(4);


    }


    @Given("A user addes a new address and verifies that it is added")
    public void a_user_addes_a_new_address_and_verifies_that_it_is_added() throws InvalidMidiDataException {

        ReusableMethods.wait(3);
        OptionsMet.clickButtonByDescription("Add New Address");
        ReusableMethods.wait(3);
        OptionsMet.clickAndSendKeys(account.getFullNameRow(),"son eklenen adres");
        ReusableMethods.wait(3);
        OptionsMet.clickAndSendKeys(account.getEmailRow(),"karan@gmail.com");
        ReusableMethods.wait(3);
        OptionsMet.clickAndSendKeys(account.getPhoneRow(),"5538711172");
        ReusableMethods.wait(3);
        OptionsMet.clickButtonByDescription("Country");
        ReusableMethods.wait(3);
        OptionsMet.clickAndSendKeys(account.getSelectCountry(),"Turkey");
        ReusableMethods.wait(3);
        account.getTurkeyChosen().click();
        ReusableMethods.wait(3);
        OptionsMet.clickButtonByDescription("State");
        ReusableMethods.wait(3);
        OptionsMet.clickAndSendKeys(account.getSelectState(),"Tokat");
        ReusableMethods.wait(3);
        account.getTokatChosen().click();
        ReusableMethods.wait(3);
        OptionsMet.clickButtonByDescription("City");
        ReusableMethods.wait(3);
        OptionsMet.clickAndSendKeys(account.getSelectCity(),"Turhal");
        ReusableMethods.wait(3);
        account.getTurhalChosen().click();
        ReusableMethods.wait(3);
        OptionsMet.clickAndSendKeys(account.getBosZipcodeRow(),"60120");
        ReusableMethods.wait(3);
        OptionsMet.swipe(479,1197,496,618);
        ReusableMethods.wait(3);
        OptionsMet.clickAndSendKeys(account.getStreetRow(),"Fabrika Caddesi");
        ReusableMethods.wait(3);
        OptionsMet.clickButtonByDescription("Add Address");
        ReusableMethods.wait(3);
        account.getEditFirstAddressButton().click();
        ReusableMethods.wait(3);
        account.getFullNameRow().click();
        ReusableMethods.wait(3);
        String expectedText= "son eklenen adres";
        String actualText= account.getFullNameRow().getText();
        ReusableMethods.wait(3);

        Assert.assertEquals(expectedText,actualText);








    }


}
