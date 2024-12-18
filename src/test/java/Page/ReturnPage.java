package Page;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.OptionsMet;
import utilities.ReusableMethods;

import javax.sound.midi.InvalidMidiDataException;

import java.time.Duration;

import static org.junit.Assert.assertTrue;
import static utilities.Driver.getAppiumDriver;

@Getter
public class ReturnPage {
    public ReturnPage() {
        PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()), this);
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"*Use Email Instead\"]")
    private WebElement useEmailInstead;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    private WebElement emailTextBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Home\")")
    private WebElement homeButton;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Adidas Ultraboost 21 Sneakers\n" +
            "0 (0  Reviews)\n" +
            "$180.00\"]")
    private WebElement adidasUltraboost;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"White\")")
    private WebElement adidasUltraboostWhitecolor;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Add To Cart\"]")
    private WebElement addToCartButton;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Success\n" +
            "Product added to cart\"]")
    private WebElement successAlertBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(12)")
    private WebElement shoppingCartButton;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Proceed to Checkout\"]")
    private WebElement proceedToCheckoutButton;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Save & Pay\"]")
    private WebElement saveAndPayButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Mustafa Ismail Kilgoz\n" +
            "+9005059522525\n" +
            "mustafa.user@querycart.com\n" +
            "Buca,İzmirProvince,Turkey,35000\n" +
            "Cami karsisi\")")
    private WebElement shippingAddressBox;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Stripe\"]")
    private WebElement stripeBox;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Confirm Order\"]")
    private WebElement confirmOrderButton;


    public void emailTextBoxClickAndSendKeys(String email) {
        assertTrue(useEmailInstead.isDisplayed());
        useEmailInstead.click();
        assertTrue(emailTextBox.isDisplayed());
        emailTextBox.click();
        emailTextBox.sendKeys(email);
    }

    public void adidasProductFromHomePage() throws InvalidMidiDataException {
        homeButton.click();
        //ReusableMethods.ekranKaydirmaMethodu(700,1600,1000,700,500);
        OptionsMet.swipe(700,1600,700,500);
        ReusableMethods.wait(1);
        assertTrue(adidasUltraboost.isDisplayed());
        adidasUltraboost.click();
        //ReusableMethods.ekranKaydirmaMethodu(700,1550,1000,700,750);
        OptionsMet.swipe(700,1550,700,750);
        ReusableMethods.wait(1);
        assertTrue(adidasUltraboostWhitecolor.isDisplayed());
        adidasUltraboostWhitecolor.click();
        assertTrue(addToCartButton.isDisplayed());
        addToCartButton.click();

        WebDriverWait wait = new WebDriverWait(getAppiumDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(successAlertBox));

        successAlertBox.isDisplayed();

        /*
        WebElement alertBox =  getAppiumDriver().findElement(By.xpath("//android.view.View[@content-desc=\"Success\n" +
                "Product added to cart\"]"));
        String alertText = alertBox.getText();
        System.out.println(alertText);
                        -- ? toast message text alamadim ? --
        String alertText = successAlertBox.getText();
        System.out.println("alertText = " + alertText);
         */

        assertTrue(shoppingCartButton.isDisplayed());
        shoppingCartButton.click();

        assertTrue(proceedToCheckoutButton.isDisplayed());
        proceedToCheckoutButton.click();

        assertTrue(shippingAddressBox.isDisplayed());
        shippingAddressBox.click();

        OptionsMet.swipe(700,1550,700,750);

        assertTrue(saveAndPayButton.isDisplayed());
        saveAndPayButton.click();

        assertTrue(stripeBox.isDisplayed());
        stripeBox.click();

        assertTrue(confirmOrderButton.isDisplayed());
        confirmOrderButton.click();



    }
}