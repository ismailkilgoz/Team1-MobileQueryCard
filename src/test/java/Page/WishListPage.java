package Page;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Getter;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

import static utilities.Driver.getAppiumDriver;

public class WishListPage extends BasePage {

    public WishListPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()), this);
    }

    public static AndroidDriver driver = (AndroidDriver) getAppiumDriver();


    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Favorite\"]")
    public static WebElement favouriteButton;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Wishlist\"]")
    public static WebElement wishListButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"(1  Products Found)\")")
    public static WebElement productFoundText;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Flower Print Foil T-shirt\n" +
            "0 (0  Reviews)\n" +
            "$65.00\")")
    public static WebElement flowerTshirt;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Wishlist\")")
    public static WebElement wishListText;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(2)")
    public static WebElement removeIcon;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Remove\n" +
            "Removed from Wishlist\")")
    public static WebElement removedFromWishlistText;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(2)")
    public static WebElement wishListEmptyIconu;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='Wishlist']")
    public WebElement wishlistPage;

    public static WebElement getRemovedToaster() {
        return null;
    }

    public void addProductToFavorites() {
        favouriteButton.click();
    }

    public static void goToWishlist() {
        wishListButton.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Reviews')]")
    public static List<WebElement> productList;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.View\").instance(4)")
    private WebElement removedToaster;

    public static void xPathElementClicknormalizeSpace(String itemName, String reviews, String price) {
        String xpathExpression = String.format(
                "//android.view.View[contains(normalize-space(@content-desc), '%s') and contains(normalize-space(@content-desc), '%s') and contains(normalize-space(@content-desc), '%s')]/android.widget.ImageView",
                itemName, reviews, price
        );
        WebElement element = getAppiumDriver().findElement(MobileBy.xpath(xpathExpression));

        Assert.assertTrue(element.isDisplayed()); // Öğenin görünür olduğundan emin olun
        element.click();
    }

    public static void verifyWishlistProducts(String listName) {
        if (productList.isEmpty()) {
            System.out.println("The wishlist '" + listName + "' is empty.");
        } else {
            System.out.println("Verifying products under the wishlist: '" + listName + "'");
            for (WebElement product : productList) {
                String productText = product.getAttribute("content-desc");
                String[] productDetails = productText.split("\n");
                String productName = productDetails[0];

                if (productName != null && !productName.isEmpty()) {
                    System.out.println("Verified product: " + productName);
                } else {
                    System.out.println("Product name could not be retrieved.");
                }
            }
        }
}}

