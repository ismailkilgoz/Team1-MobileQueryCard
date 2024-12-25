package Page;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.en_scouse.An;
import lombok.Getter;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigReader;
import utilities.ReusableMethods;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static utilities.Driver.getAppiumDriver;

@Getter
public class MyAccountPage {

    public MyAccountPage() {
        PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()), this);

    }

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Profile\")")
    private WebElement profileIcon;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Osske\")")
    private WebElement userPageInfo;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"My Account\")")
    private WebElement myAccountHeader;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Total Orders\")")
    private WebElement totalOrdersHeader;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Total Completed\")")
    private WebElement totalCompletedHeader;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Total Returnd\")")
    private WebElement totalReturnedHeader;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Wallet Balance\")")
    private WebElement walletBalance;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Order History\")")
    private WebElement orderHistoryPage;

    @AndroidFindBy(uiAutomator= "new UiSelector().description(\"Order History\")")
    private WebElement orderHistoryTitle;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Address\")")
    private  WebElement addressHeader;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"*Use Email Instead\")")
    private WebElement useEmailInstead;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Address\")")
    private WebElement addressPage;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Sign In\")")
    private WebElement signInButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    private WebElement emailBar;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
    private WebElement passwordBar;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Sign In\").instance(1)")
    private WebElement signInClick;

    @AndroidFindBy(className = "android.view.View[2]")
    private WebElement address1;

    @AndroidFindBy(className = "android.view.View[3]")
    private WebElement address2;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(1)")
    private WebElement editFirstAddressButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(4)")
    private WebElement deleteSecondAddressButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Update Address\").instance(1)")
    private WebElement updateFirstAddressButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Fatih Mahallesi Fabrika Caddesi No:21\")")
    private WebElement firstAddressLastRow;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"60120\")")
    private WebElement zipCodeRow;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(3)")
    private WebElement zipCodeRow2;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"60100\")")
    private WebElement zipCodeRow3;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Download Receipt\")")
    private WebElement downloadReceipt;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Order#181224761\")")
    private WebElement orderId;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Success\n" +
            "Address Updated Successfully!\")")
    private WebElement updatedSuccessfullyMessage;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Delete\")")
    private WebElement deleteConfirmButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\\\"Success\\n\" +\n" +
            "            \"Address Deleted Successfully!\\\")")
    private WebElement deletedSuccessfullyMessage;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Add New Address\")")
    private WebElement addNewAddress;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"son eklenen adres\")")
    private WebElement sonEklenenAdres;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    private WebElement fullNameRow;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
    private WebElement emailRow;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(2)")
    private  WebElement phoneRow;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Country\")")
    private  WebElement countryRow;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"State\")")
    private  WebElement stateRow;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"City\")")
    private  WebElement cityRow;

    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.view.View/android.widget.EditText[3]")
    private  WebElement zipcodeRow;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(3)")
    private  WebElement streetRow;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Add Address\")")
    private  WebElement addAddressButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(3)")
    private WebElement bosZipcodeRow;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\")")
    private WebElement selectCountry;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Turkey\")")
    private WebElement turkeyChosen;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\")")
    private WebElement selectState;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Tokat Province\")")
    private WebElement tokatChosen;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\")")
    private WebElement selectCity;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Turhal\")")
    private WebElement turhalChosen;



























}