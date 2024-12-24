package Page;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.OptionsMet;
import javax.sound.midi.InvalidMidiDataException;
import static utilities.Driver.getAppiumDriver;
public class CategoryMenPage extends BasePage{
    public CategoryMenPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()) ,this);
    }
    public static AndroidDriver driver= (AndroidDriver) getAppiumDriver();
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView")
    public WebElement menArrow;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Men Clothing\"]")
    public WebElement menClothing;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Men Shoes\"]")
    public WebElement menShoes;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Men Accessories\"]")
    public WebElement menAccessories;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Adidas 3-Stripes Cushioned Crew Socks\n" +
            "0 (0  Reviews)\n" +
            "$15.00\")")
    public WebElement firstProduct;
    @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"Men\"]")
    public WebElement menButton;
    @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"Black\"]")
    public WebElement blackSocks;
    @AndroidFindBy (xpath = "//android.widget.ImageView[@content-desc=\"Favorite\"]")
    public WebElement favoriteButton;
    @AndroidFindBy (xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView")
    public WebElement filterButton;
    @AndroidFindBy (xpath = "//android.widget.ImageView[@content-desc=\"Brands\"]")
    public WebElement brandsButton;
    // this xpath linked with brands "Harrods brand can seen under the brands button"
    @AndroidFindBy (xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView[6]")
    public WebElement harrodsButton;
    @AndroidFindBy (xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView")
    public WebElement xButtonundertheFilterandSorting;
    @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"Quilted Puffer Jacket\n" +
            "0 (0  Reviews)\n" +
            "$120.00\"]")
    public WebElement quiltedPufferJacket;
    @AndroidFindBy (uiAutomator = "new UiSelector().description(\"Profile\")")
    public WebElement profileButton;
    @AndroidFindBy (xpath = "//android.widget.ImageView[@content-desc=\"My Account\"]")
    public WebElement myAccountUnderProfileButton;
    @AndroidFindBy (xpath = "//android.widget.ImageView[@content-desc=\"Logout\"]")
    public WebElement logoutButton;
}