package Page;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static utilities.Driver.getAppiumDriver;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()), this);

    }

    @AndroidFindBy (uiAutomator = "new UiSelector().description(\"Popular Brands\")")
    public WebElement popularBrands;

    @AndroidFindBy (uiAutomator = "//android.view.View[@content-desc=\"Blossom Boutique\"]")
    public WebElement BlossomBoutique;

    @AndroidFindBy(uiAutomator = "//android.view.View[@content-desc=\"Nike\"]")
    public WebElement Nike;

    @AndroidFindBy(uiAutomator = "//android.view.View[@content-desc=\"Dr. Martens\"]")
    public WebElement DrMartens;

    @AndroidFindBy(uiAutomator = "//android.view.View[@content-desc=\"Clarks\"]")
    public WebElement Clarks;
}