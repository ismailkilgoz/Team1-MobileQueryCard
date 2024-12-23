package Page;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import static utilities.Driver.getAppiumDriver;

public class WomenCategoryPage extends BasePage{

    public WomenCategoryPage() {PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()) ,this);}
    public static AndroidDriver driver= (AndroidDriver) getAppiumDriver();

    @AndroidFindBy (uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(3)")
    public WebElement womenArrow;

    @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"Women Clothing\"]")
    public WebElement womenClothing;

    @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"Women Shoes\"]")
    public WebElement womenShoes;

    @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"Women Accessories\"]")
    public WebElement womenAccessories;

    @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"Women\"]")
    public WebElement womenPageButton;

    @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"Casual Women Shoes\n" +
            "0 (0  Reviews)\n" +
            "$250.00\"]")
    public WebElement pinkShoes;

    @AndroidFindBy (xpath = "//android.widget.ImageView[@content-desc=\"Favorite\"]")
    public WebElement favoriteButton;

    @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"White\"]")
    public WebElement whiteColorButton;

    @AndroidFindBy (xpath = "//android.widget.ImageView[@content-desc=\"Add To Cart\"]")
    public WebElement addToCartButton;

    @AndroidFindBy (xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView")
    public WebElement sepetButton;

    @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"Casual Women Shoes\n" +
            "White\n" +
            "$250.00\n" +
            "1\"]")
    public WebElement casualWomenShoesinCart;

    @AndroidFindBy (xpath = "//android.widget.ImageView[@content-desc=\"Wishlist\"]")
    public WebElement wishlistButton;

    @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"Casual Women Shoes\n" +
            "0 (0  Reviews)\n" +
            "$250.00\"]")
    public WebElement casualWomenShoesinWishlist;

    @AndroidFindBy (xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView")
    public WebElement filterButton;

    @AndroidFindBy (xpath = "//android.widget.ImageView[@content-desc=\"Sort By\"]")
    public WebElement shortBy;

    @AndroidFindBy (xpath = "//android.widget.RadioButton[@content-desc=\"Newest\"]")
    public WebElement newest;

    @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"(30 Products Found)\"]")
    public WebElement foundProducts;











}






