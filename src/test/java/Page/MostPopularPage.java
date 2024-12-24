package Page;

import com.github.javafaker.Faker;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import static utilities.Driver.getAppiumDriver;
public class MostPopularPage extends BasePage{
    public MostPopularPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()),this);
    }
    public static AndroidDriver driver= (AndroidDriver) getAppiumDriver();


    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Most Popular\")")
    public WebElement MostPopular;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"See All\")")
    public WebElement SeeAll;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"(8 Products Found)\")")
    public WebElement ProductsFound;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Flower Print Foil T-shirt\n" + "0 (0  Reviews)\n" + "$65.00\"]")
    public WebElement Tshirt;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Floral Print Midi Dress\n" + "0 (0  Reviews)\n" + "$100.00\"]")
    public WebElement MidiDress;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Quilted Puffer Jacket\n" + "0 (0  Reviews)\n" + "$120.00\"]")
    public WebElement Jacket;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Adidas Ultraboost 21 Sneakers\n" + "0 (0  Reviews)\n" + "$180.00\"]")
    public WebElement Adidas;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Nike Air Force 1 Sneakers\n" + "0 (0  Reviews)\n" + "$120.00\"]")
    public WebElement Nike;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Classic Cotton T-Shirt\n" + "0 (0  Reviews)\n" + "$20.00\"]")
    public WebElement ClassicCoton;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"The North Face Arctic Parka\n" + "0 (0  Reviews)\n" + "$400.00\"]")
    public WebElement ArcticParka;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Men's Analog Watch | 100 Meter Water Resistance | LED Light | Date Display | Leather/Cloth Band\n" + "0 (0  Reviews)\n" + "$119.00\"]")
    public WebElement MensWatch;











}
