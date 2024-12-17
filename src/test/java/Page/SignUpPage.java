package Page;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import static utilities.Driver.getAppiumDriver;

@Getter
public class SignUpPage {
    public SignUpPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()), this);
    }

   public static AndroidDriver driver= (AndroidDriver) getAppiumDriver();

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    private WebElement nameBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
    private WebElement phoneOrEmailBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(2)")
    private WebElement passwordBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Sign Up\").instance(1)")
    private WebElement signUpButtonforUnsuccesMessage;

    @AndroidFindBy (uiAutomator = "new UiSelector().description(\"Error The email has already been taken.\")")
    private WebElement errorMessage;







    public WebElement ClickButtonByClassNameIndex(int index){

        WebElement button= driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().className(\"android.widget.EditText\").instance(" + index + ")"));
        // new UiSelector().className("android.widget.EditText").instance(0)
     return button;
    }


    public void SelectSingUpWithEmailOrPhoneNumber(String inputType){

            if (inputType.equals("Email")) {
                if (driver.findElement(MobileBy.AccessibilityId("*Use Email Instead")).isDisplayed()) {
                    driver.findElement(MobileBy.AccessibilityId("*Use Email Instead")).click();
                }
            } else if (inputType.equals("Phone")) {

                if (driver.findElement(MobileBy.AccessibilityId("*Use Phone Instead")).isDisplayed()) {
                    driver.findElement(MobileBy.AccessibilityId("*Use Phone Instead")).click();
                }
            }






    }

    public WebElement getButtonWebelementByDesc(String description){

            WebElement button = driver.findElement(MobileBy.AndroidUIAutomator(
                    "new UiSelector().description(\"" + description + "\")"));

            //  new UiSelector().description("Error The email has already been taken.")

     return button;
    }

}



