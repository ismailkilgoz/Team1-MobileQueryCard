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
import utilities.ReusableMethods;

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







    public void VerifyUsernameDisplayed(String username){

        WebElement webElement = driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiSelector().description(\"" + username + "\")"));
        ReusableMethods.VerifyElementTextByGetAttribute(username,webElement);

    }

}
