package stepdefinitions;

import Page.MyAccountPage;
import Page.QueryCardPage;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ConfigReader;
import utilities.ExcelDataReader;
import utilities.OptionsMet;
import utilities.ReusableMethods;


import javax.sound.midi.InvalidMidiDataException;

import java.nio.file.OpenOption;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.Driver.getAppiumDriver;
import static utilities.Driver.quitAppiumDriver;

public class MyAccountStepdefinitions extends OptionsMet {

    MyAccountPage account = new MyAccountPage();
    Actions actions = new Actions(getAppiumDriver());
    ExcelDataReader dataReader = new ExcelDataReader(ConfigReader.getProperty("userAccess"));
    QueryCardPage queryCardPage = new QueryCardPage();


    @Given("A user displays the icon of {string} on the homepage.")
    public void a_user_displays_the_icon_of_on_the_homepage(String profileIconText) throws InterruptedException {

        ReusableMethods.waitForElement(driver, account.getProfileIcon(), 10);
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
    @Given("A user clicks on the header of {string} and verifies that order details are displayed.")
    public void a_user_clicks_on_the_header_of_and_verifies_that_order_details_are_displayed(String orderHistoryPage) {

        ReusableMethods.wait(3);
        account.getOrderHistoryPage().isDisplayed();

    }



}
