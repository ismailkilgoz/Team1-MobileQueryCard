package Page;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
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


}