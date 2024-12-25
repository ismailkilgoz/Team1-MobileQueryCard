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
public class OrderHistoryPage {
    public OrderHistoryPage() {
        PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()), this);

    }


    // Locators for sign in
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Profile\")")
    public WebElement profileIcon; //anasayfadaki sol alttaki profile ikonu

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Sign In\")")
    public WebElement profileSignInButton; //sign in butonu

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"*Use Email Instead\")")
    public WebElement useEmailText; //sağ üstteki use mail text alanı

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    public WebElement mailTextBox; //mail text alanı

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
    public WebElement passwordBox; //pasword alanı

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Sign In\").instance(1)")
    public WebElement logInSignInButton; //sign in sayfasındaki sign in butonuu

    @AndroidFindBy(accessibility = "Profile")
    public static WebElement userProfileIcon; //kayıt olunduktan sonra sağ alttaki profile ikonu

    @AndroidFindBy(accessibility = "Order History")
    public static WebElement orderHistoryLink; //dashboard order history linki

    @AndroidFindBy(className = "android.widget.ImageView")
    public static List<WebElement> orderLinksList; // order history sayfasındaki geri dönüş tuşu ve orderlerin listesi

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Download Receipt\")")
    public static WebElement downlandReceiptButton; //fatura indir butonu

    @AndroidFindBy(xpath = "//*[@index='4']")
    public static WebElement orderIdText; //faturadaki order id

    @AndroidFindBy(xpath = "//*[@index='5']")
    public static WebElement orderDateDayText; //faturadaki order tarihi

    @AndroidFindBy(xpath = "//*[@index='6']")
    public static WebElement orderDateHourText; //faturadaki order tarihi

    @AndroidFindBy(xpath = "//*[@index='30']")
    public static WebElement paymentTypeText; //faturadaki ödeme tipi

    @AndroidFindBy(xpath = "//*[@index='23']")
    public static WebElement totalText; //faturadaki toplam tutar

    @AndroidFindBy(xpath = "//*[@index='23']")
    public WebElement cancelOrderButton; //sipariş iptal et butonu


}

