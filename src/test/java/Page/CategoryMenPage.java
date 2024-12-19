
package Page;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

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



}