package Page;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import static utilities.Driver.getAppiumDriver;

public class SelectedProductPage extends BasePage{
    public SelectedProductPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()),this);
    }
    public static AndroidDriver driver= (AndroidDriver) getAppiumDriver();


    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Flower Print Foil T-shirt\n" + "0 (0  Reviews)\n" + "$65.00\")")
    public WebElement FlowerPrintFoilTshirt;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Size:\")")
    public WebElement Size;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Details\")")
    public WebElement Details;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Videos\")")
    public WebElement Videos;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Review\")")
    public WebElement Review;

    @AndroidFindBy(uiAutomator = "//android.view.View[@content-desc=\"Shipping & Return\"]")
    public WebElement ShippingReturn;

}
