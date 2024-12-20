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

        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()), this);
    }

    public static AndroidDriver driver= (AndroidDriver) getAppiumDriver();

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Home\")")
    public WebElement HomePage;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"M\")")
    public WebElement Medium;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(9)")
    public WebElement ArtiIcon;


}

