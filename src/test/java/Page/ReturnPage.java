package Page;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Getter;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;
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
    public static AndroidDriver driver= (AndroidDriver) getAppiumDriver();
    Actions actions = new Actions(getAppiumDriver());

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"*Use Email Instead\"]")
    private WebElement useEmailInstead;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    private WebElement emailTextBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Home\")")
    private WebElement homeButton;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Quilted Puffer Jacket\n" +
            "0 (0  Reviews)\n" +
            "$120.00\"]")
    private WebElement quiltedPufferJacket;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"M\")")
    private WebElement mediumSizeButton;

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

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Cash On Delivery\"]")
    private WebElement cashOnDeliveryBox;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Confirm Order\"]")
    private WebElement confirmOrderButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    private WebElement cardNumberTextBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
    private WebElement mmYYTextBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(2)")
    private WebElement cvcTextBox;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"confirmBtn\"]")
    private WebElement confirmButton;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Go to order details\"]")
    private WebElement goToOrderDetailsButton;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Order History\"]")
    private WebElement orderHistoryTitle;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Cancel Order\"]")
    private WebElement cancelOrderButton;

    @AndroidFindBy(id = "com.android.chrome:id/search_box_text")
    private WebElement googleSearchBox;

    @AndroidFindBy(id = "com.android.chrome:id/line_2")
    private WebElement googleSearchClick;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Log In\"]")
    private WebElement queryCardUrlLogin;

    @AndroidFindBy(uiAutomator = ("new UiSelector().resourceId(\"formEmail\")"))
    private WebElement qcUrlEmailTextBox;

    @AndroidFindBy(uiAutomator = ("new UiSelector().resourceId(\"formPassword\")"))
    private WebElement qcUrlPasswordTextBox;

    @AndroidFindBy(xpath = ("//android.widget.Button[@text=\"Sign In\"]"))
    private WebElement qcUrlSigninButton;

    @AndroidFindBy(uiAutomator = ("new UiSelector().text(\"Profile\")"))
    private WebElement qcUrlProfileButton;

    @AndroidFindBy(uiAutomator = ("new UiSelector().text(\"Dashboard\")"))
    private WebElement qcUrlDashboardButton;

    @AndroidFindBy(xpath = ("//android.view.View[@text=\"Overview\"]"))
    private WebElement qcUrlDashboardOverviewTitle;

    @AndroidFindBy(uiAutomator = ("new UiSelector().className(\"android.widget.Button\").instance(0)"))
    private WebElement qcUrlDashboardMenuForSideBarBtn;

    @AndroidFindBy(xpath = ("//android.view.View[@text=\"Overview\"]"))
    private WebElement qcUrlSideBarOnlineOrdersBtn;

    @AndroidFindBy(uiAutomator = ("new UiSelector().className(\"android.widget.Button\").instance(2)"))
    private WebElement qcUrlSideBarCloseBtn;

    @AndroidFindBy(uiAutomator = ("new UiSelector().text(\"\uE078\").instance(0)"))
    private WebElement qcUrlOnlineOrdersMustafaLastOrder;

    @AndroidFindBy(uiAutomator = ("new UiSelector().text(\"Filter\")"))
    private WebElement qcUrlOnlineOrdersFilter;

    @AndroidFindBy(uiAutomator = ("new UiSelector().className(\"android.widget.EditText\").instance(2)"))
    private WebElement qcUrlOnlineOrdersFilterCostumer;

    @AndroidFindBy(uiAutomator = ("new UiSelector().className(\"android.widget.EditText\").instance(1)"))
    private WebElement qcUrlOnlineOrdersFilterStatus;

    @AndroidFindBy(xpath = ("//*[contains(@text, 'Pending')]"))
    private WebElement qcUrlOnlineOrdersFilterStatusPending;

    @AndroidFindBy(xpath = ("(//*[contains(@text, 'mustafa')])[3]"))
    private WebElement qcUrlOnlineOrdersFilterSelectMustafa;

    @AndroidFindBy(xpath = ("//android.widget.Button[@text=\"Search\"]"))
    private WebElement qcUrlOnlineOrdersFilterSearchBtn;

    @AndroidFindBy(xpath = ("//*[contains(@bounds, '[1140,1479][1185,1539]')]"))
    private WebElement qcUrlOnlineOrdersTopOrder;

    @AndroidFindBy(xpath = ("//android.widget.Button[@text=\"Accept\"]"))
    private WebElement qcUrlOnlineOrdersAcceptOrder;

    @AndroidFindBy(xpath = ("//android.widget.Button[@text=\"Yes, Accept it!\"]"))
    private WebElement qcUrlOnlineOrdersYesAcceptIt;

    @AndroidFindBy(xpath = ("//android.widget.TextView[@text=\"Confirmed\"]"))
    private WebElement qcUrlOnlineOrdersConfirmed;

    //Welcome to Chrome

    @AndroidFindBy(uiAutomator = ("new UiSelector().resourceId(\"com.android.chrome:id/terms_accept\")"))
    private WebElement chromeAcceptContinue;

    @AndroidFindBy(uiAutomator = ("new UiSelector().resourceId(\"com.android.chrome:id/negative_button\")"))
    private WebElement chromeNoThanks;





    public void emailTextBoxClickAndSendKeys(String email) {
        assertTrue(useEmailInstead.isDisplayed());
        useEmailInstead.click();
        assertTrue(emailTextBox.isDisplayed());
        emailTextBox.click();
        emailTextBox.sendKeys(email);
    }

    public void pufferJacketProductFromHomePage() throws InvalidMidiDataException {
        homeButton.click();
        //ReusableMethods.ekranKaydirmaMethodu(700,1600,1000,700,500);
        OptionsMet.swipe(700,1600,700,500);
        OptionsMet.swipe(700,1550,700,750);
        ReusableMethods.wait(1);
        assertTrue(quiltedPufferJacket.isDisplayed());
        quiltedPufferJacket.click();
        //ReusableMethods.ekranKaydirmaMethodu(700,1550,1000,700,750);
        OptionsMet.swipe(700,1550,700,750);
        ReusableMethods.wait(1);
        assertTrue(mediumSizeButton.isDisplayed());
        mediumSizeButton.click();
        ReusableMethods.wait(1);
        assertTrue(addToCartButton.isDisplayed());
        addToCartButton.click();

        WebDriverWait wait = new WebDriverWait(getAppiumDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(successAlertBox));

        successAlertBox.isDisplayed();

        String alertText = successAlertBox.getAttribute("content-desc");

        assertTrue(alertText.contains("Success\n" +
                "Product added to cart"));

        assertTrue(shoppingCartButton.isDisplayed());
        shoppingCartButton.click();

        assertTrue(proceedToCheckoutButton.isDisplayed());
        proceedToCheckoutButton.click();

        assertTrue(shippingAddressBox.isDisplayed());
        shippingAddressBox.click();

        OptionsMet.swipe(700,1550,700,750);
        ReusableMethods.wait(1);

        assertTrue(saveAndPayButton.isDisplayed());
        saveAndPayButton.click();

        wait.until(ExpectedConditions.visibilityOf(stripeBox));
        assertTrue(stripeBox.isDisplayed());
        stripeBox.click();

        ReusableMethods.wait(1);
        assertTrue(confirmOrderButton.isDisplayed());
        confirmOrderButton.click();
        ReusableMethods.wait(2);

        int attempt = 0;
        int maxAttempts = 10; // Maksimum 10 deneme

        while (attempt < maxAttempts) {
            attempt++;
            try {
                if (saveAndPayButton.isDisplayed()) {
                    saveAndPayButton.click();
                    wait.until(ExpectedConditions.visibilityOf(stripeBox));
                    stripeBox.click();
                    ReusableMethods.wait(1);
                    confirmOrderButton.click();
                } else {
                    break;
                }
            } catch (Exception e) {
                break;
            }
        }
        wait.until(ExpectedConditions.visibilityOf(cardNumberTextBox));
        assertTrue(cardNumberTextBox.isDisplayed());
        cardNumberTextBox.click();
        cardNumberTextBox.sendKeys("4242424242424242");

        assertTrue(mmYYTextBox.isDisplayed());
        mmYYTextBox.click();
        mmYYTextBox.sendKeys("1228");

        assertTrue(cvcTextBox.isDisplayed());
        cvcTextBox.click();
        cvcTextBox.sendKeys("123");
        ReusableMethods.wait(2);

        //actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys("35000").perform();

        assertTrue(confirmButton.isDisplayed());
        confirmButton.click();
    }

    public void goToOrderPageFromAfterPayment(){
        WebDriverWait wait = new WebDriverWait(getAppiumDriver(),Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(goToOrderDetailsButton));
        assertTrue(goToOrderDetailsButton.isDisplayed());
        goToOrderDetailsButton.click();

        wait.until(ExpectedConditions.visibilityOf(orderHistoryTitle));

        assertTrue(orderHistoryTitle.isDisplayed());
        String title = orderHistoryTitle.getAttribute("content-desc");

        assertTrue(title.contains("Order History"));

    }

    public void cancelOrderIsEnabled() throws InvalidMidiDataException {


        assertTrue(cancelOrderButton.isEnabled());
        String exceptedText = cancelOrderButton.getAttribute("content-desc");
        assertTrue(exceptedText.contains("Cancel Order"));
    }

    public void googleSearchToQueryCart(){
        //WebDriverWait wait = new WebDriverWait(getAppiumDriver(),Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.visibilityOf(googleSearchBox));

        // ******* Welcome to Chrome ********

        //assertTrue(chromeAcceptContinue.isEnabled());
        //chromeAcceptContinue.click();
        //ReusableMethods.wait(1);

        //assertTrue(chromeNoThanks.isEnabled());
        //chromeNoThanks.click();

        ReusableMethods.wait(2);
        assertTrue(googleSearchBox.isEnabled());
        googleSearchBox.sendKeys("querycart.com/#/home");
        //googleSearchBox.sendKeys("https://querycart.com/#/admin/dashboard");


        assertTrue(googleSearchClick.isEnabled());
        googleSearchClick.click();

    }

    public void signInFromUrl(){

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(queryCardUrlLogin));

        assertTrue(queryCardUrlLogin.isEnabled());
        queryCardUrlLogin.click();
        ReusableMethods.wait(2);

        assertTrue(qcUrlEmailTextBox.isEnabled());
        qcUrlEmailTextBox.click();
        qcUrlEmailTextBox.sendKeys("mustafa.manager@querycart.com");

        assertTrue(qcUrlPasswordTextBox.isEnabled());
        qcUrlPasswordTextBox.click();
        qcUrlPasswordTextBox.sendKeys("Query.151224");

        assertTrue(qcUrlSigninButton.isEnabled());
        qcUrlSigninButton.click();
    }

    public void goToDashboard(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(qcUrlProfileButton));

        assertTrue(qcUrlProfileButton.isEnabled());
        qcUrlProfileButton.click();
        ReusableMethods.wait(1);

        wait.until(ExpectedConditions.visibilityOf(qcUrlDashboardButton));
        assertTrue(qcUrlDashboardButton.isEnabled());
        qcUrlDashboardButton.click();
        ReusableMethods.wait(1);

        assertTrue(qcUrlDashboardOverviewTitle.isEnabled());
        String actualTitle = qcUrlDashboardOverviewTitle.getAttribute("text");
        assertTrue(actualTitle.contains("Overview"));
        //Dashboard'a gidildigi dogrulandi.

    }

    public void confirmOrder() throws InvalidMidiDataException {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(qcUrlDashboardMenuForSideBarBtn));

        assertTrue(qcUrlDashboardMenuForSideBarBtn.isEnabled());
        qcUrlDashboardMenuForSideBarBtn.click();
        ReusableMethods.wait(1);

        assertTrue(qcUrlSideBarOnlineOrdersBtn.isEnabled());
        qcUrlSideBarOnlineOrdersBtn.click();

        assertTrue(qcUrlSideBarCloseBtn.isEnabled());
        qcUrlSideBarCloseBtn.click();

        assertTrue(qcUrlOnlineOrdersFilter.isEnabled());
        qcUrlOnlineOrdersFilter.click();

        assertTrue(qcUrlOnlineOrdersFilterStatus.isEnabled());
        qcUrlOnlineOrdersFilterStatus.click();
        ReusableMethods.wait(1);

        assertTrue(qcUrlOnlineOrdersFilterStatusPending.isEnabled());
        qcUrlOnlineOrdersFilterStatusPending.click();

        OptionsMet.swipe(600,600,600,700);
        ReusableMethods.wait(1);

        assertTrue(qcUrlOnlineOrdersFilterCostumer.isEnabled());
        qcUrlOnlineOrdersFilterCostumer.click();
        qcUrlOnlineOrdersFilterCostumer.sendKeys("mustafa");
        ReusableMethods.wait(2);


        wait.until(ExpectedConditions.visibilityOf(qcUrlOnlineOrdersFilterSelectMustafa));

        assertTrue(qcUrlOnlineOrdersFilterSelectMustafa.isEnabled());
        qcUrlOnlineOrdersFilterSelectMustafa.click();

        assertTrue(qcUrlOnlineOrdersFilterSearchBtn.isEnabled());
        qcUrlOnlineOrdersFilterSearchBtn.click();
        ReusableMethods.wait(1);

        qcUrlOnlineOrdersFilter.click();

        ReusableMethods.wait(2);
        OptionsMet.swipe(1250,1600,50,1600);
        OptionsMet.swipe(1250,1600,50,1600);
        ReusableMethods.wait(1);

        assertTrue(qcUrlOnlineOrdersTopOrder.isEnabled());
        qcUrlOnlineOrdersTopOrder.click();

        ReusableMethods.wait(3);

        assertTrue(qcUrlOnlineOrdersAcceptOrder.isEnabled());
        qcUrlOnlineOrdersAcceptOrder.click();

        ReusableMethods.wait(2);

        assertTrue(qcUrlOnlineOrdersYesAcceptIt.isEnabled());
        qcUrlOnlineOrdersYesAcceptIt.click();

        ReusableMethods.wait(2);

        assertTrue(qcUrlOnlineOrdersConfirmed.isEnabled());
        String actualStatus = qcUrlOnlineOrdersConfirmed.getAttribute("text");
        assertTrue(actualStatus.contains("Confirmed"));

    }
}