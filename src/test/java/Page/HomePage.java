package Page;


import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;


import static utilities.Driver.getAppiumDriver;

public class HomePage {

    public HomePage() {

        PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()), this);

    }

    @AndroidFindBy (uiAutomator = "//android.view.View[@content-desc=\"Popular Brands\"]")
    public WebElement popularBrands;

    @AndroidFindBy (uiAutomator = "//android.view.View[@content-desc=\"Blossom Boutique\"]")
    public WebElement BlossomBoutique;

    @AndroidFindBy(uiAutomator = "//android.view.View[@content-desc=\"Nike\"]")
    public WebElement Nike;

    @AndroidFindBy(uiAutomator = "//android.view.View[@content-desc=\"Dr. Martens\"]")
    public WebElement DrMartens;

    @AndroidFindBy(uiAutomator = "//android.view.View[@content-desc=\"Clarks\"]")
    public WebElement Clarks;

    @AndroidFindBy(uiAutomator = "AppiumBy.accessibilityId(\"Categories\")")
    public  WebElement category;


    public static AndroidDriver driver= (AndroidDriver) getAppiumDriver();

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Home\")")
    public WebElement HomePage;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"M\")")
    public WebElement Medium;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(9)")
    public WebElement ArtiIcon;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Men Clothing\")")
    public WebElement menClothing;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Classic Cargo Shorts\n" +
            "0 (0  Reviews)\n" +
            "$40.00\")")

    public WebElement Classiccargoshort;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"M\")")
    public WebElement ClassiccargoshortM;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(9)")
    public WebElement ClassiccargoshortQuantity;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Add To Cart\")")
    public WebElement addToCard;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Success\n" +
            "Product added to cart\")")

    public WebElement succes;


}

