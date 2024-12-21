package Page;

import com.github.javafaker.Faker;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.Driver.getAppiumDriver;

@Getter
public class PaymentPage extends BasePage {

    public PaymentPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()),this);
    }
    public static AndroidDriver driver= (AndroidDriver) getAppiumDriver();

    @AndroidFindBy (uiAutomator = "new UiSelector().description(\"seren\n" +
                    "+120112345678\n" +
                    "seren.user@querycart.com\n" +
                    "Münster,NorthRhine-Westphalia,Germany,41258\n" +
                    "BahnStrasse\")")
    private WebElement shippingAddress;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(12)")
    private WebElement toCartButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    private  WebElement cardNumberBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
    private  WebElement mmYYBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(2)")
    private  WebElement cvcBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(10)")
    private  WebElement zipBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"confirmBtn\")")
    private  WebElement confirmButton;



    public void fillCreditCardDetails(){


        cardNumberBox.click();
        cardNumberBox.sendKeys("4000002760000016");
        String expireDate=generateExpiredDate();
        mmYYBox.click();
        mmYYBox.sendKeys(expireDate);
        System.out.println(expireDate);
        String cvc=faker.number().digits(3);
        ReusableMethods.waitForElement(driver,cvcBox,10);
        cvcBox.click();
        cvcBox.sendKeys(cvc);
        System.out.println(cvc);
        ReusableMethods.wait(1);

    }



    public String generateExpiredDate(){

        int month= faker.number().numberBetween(1,12);
        int year = faker.number().numberBetween(25,30);
        return String.format("%02d%d",month,year);
    }


}
