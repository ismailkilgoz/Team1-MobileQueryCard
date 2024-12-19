package Page;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
@Getter
public class ForgotPasswordPage extends BasePage{
    public ForgotPasswordPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()),this);
    }



    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Success\n" +
            "The User verify is successfully.\")")
    private WebElement successMessageText;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Success\n" +
            "Your password reset Successfully.\")")
    private WebElement passSuccessfullyResetMessage;



}
