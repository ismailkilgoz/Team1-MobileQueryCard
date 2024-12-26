package Page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Getter;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.NoSuchElementException;

import static utilities.Driver.getAppiumDriver;

@Getter
public class ForgotPasswordPage extends BasePage{
    public ForgotPasswordPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()),this);
    }
    public static AndroidDriver driver= (AndroidDriver) getAppiumDriver();


    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Success\n" +
            "The User verify is successfully.\")")
    private WebElement successMessageText;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Success\n" +
            "Your password reset Successfully.\")")
    private WebElement passSuccessfullyResetMessage;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\")")
    private WebElement emailBox;


    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Success\n" +
            "Your password reset Successfully.\")")
    private WebElement passResetMessage;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Error\n" +
            "This phone does not exist.\"]")
    private WebElement phoneNotExist;


    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Error\n" +
            "This email does not exist.\"]")
    private WebElement mailNotExist;




}
