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
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()), this);
    }

    public static AndroidDriver driver= (AndroidDriver) getAppiumDriver();

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Home\")")
    private WebElement HomePage;
}
