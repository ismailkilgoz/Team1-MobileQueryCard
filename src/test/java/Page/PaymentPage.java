package Page;

import com.github.javafaker.Faker;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Getter;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;
import utilities.OptionsMet;
import utilities.ReusableMethods;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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


    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"card-errors\")")
    private  WebElement invalidCardMessage;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Error\n" +
            "Please select payment method.\")")
    private  WebElement selectPaymentMethod;


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


    public static void verifyTotalAmountCalculation(){
        WebDriverWait wait = new WebDriverWait(getAppiumDriver(), Duration.ofSeconds(10));

        // subtotal amount
        WebElement subtotal = driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiSelector().description(\"$119.00\")"));
        wait.until(ExpectedConditions.visibilityOf(subtotal));

        String subtotalText= subtotal.getAttribute("content-desc");

        Double subtotalDouble = Double.parseDouble(subtotalText.replaceAll("[^0-9.]", ""));
        System.out.println(subtotalDouble);
        //tax amount
        WebElement tax = driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiSelector().description(\"$2.38\")"));
        wait.until(ExpectedConditions.visibilityOf(subtotal));
        String taxText=tax.getAttribute("content-desc");
        Double taxDouble=Double.parseDouble(taxText.replaceAll("[^0-9.]",""));
        System.out.println(taxDouble);
        // shippintCharge amount
        WebElement shippingCharge= driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiSelector().description(\"$10.00\")"));
        wait.until(ExpectedConditions.visibilityOf(shippingCharge));
        String shippingChargeText=shippingCharge.getAttribute("content-desc");
        Double shippingChargeDouble=Double.parseDouble(shippingChargeText.replaceAll("[^0-9.]",""));
        System.out.println(shippingChargeDouble);
        // total amount
        WebElement totalAmount= driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiSelector().description(\"$131.38\")"));
        String totalAmountText=totalAmount.getAttribute("content-desc");
        Double totalAmountDouble =Double.parseDouble(totalAmountText.replaceAll("[^0-9.]",""));
        System.out.println(totalAmountDouble);
        // subtotal + tax + shippingcharge = totalAmount


       Assert.assertTrue( totalAmountDouble==subtotalDouble+taxDouble+shippingChargeDouble);




    }


    public void VerifyInvoiceDate(){
        WebDriverWait wait = new WebDriverWait(getAppiumDriver(), Duration.ofSeconds(20));
            // Bugünün tarihini al
            LocalDate today = LocalDate.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            String todayDate = today.format(formatter); // Bugünün tarihini "dd-MM-yyyy" formatında al

            // Invoice tarih locatörünü dinamik olarak oluştur
            String dynamicLocator = "new UiSelector().description(\"" + todayDate + "\")";

            // WebElement'i bul
            WebElement invoiceDateElement = driver.findElement(MobileBy.AndroidUIAutomator(dynamicLocator));
            wait.until(ExpectedConditions.visibilityOf(invoiceDateElement)); // Element görünür olana kadar bekle

            // Invoice üzerindeki tarih bilgisini al
            String invoiceDate = invoiceDateElement.getAttribute("content-desc");

            // Bugünün tarihi ile karşılaştır
            Assert.assertEquals(todayDate, invoiceDate);
            System.out.println("Invoice date matches today's date: " + invoiceDate);


    }


    public void fillCreditCardDetailsWithInvalidCard(){

        Actions actions=new Actions(getAppiumDriver());

        cardNumberBox.click();
        cardNumberBox.sendKeys("4000002760000000");
        String expireDate=generateExpiredDate();
        mmYYBox.click();
        mmYYBox.sendKeys(expireDate);
        System.out.println(expireDate);
        String cvc=faker.number().digits(3);
        ReusableMethods.waitForElement(driver,cvcBox,10);
        cvcBox.click();
        cvcBox.sendKeys(cvc);
        System.out.println(cvc);
        String zip=faker.address().zipCode();
        ReusableMethods.wait(1);
        actions.sendKeys(zip).perform();
        ReusableMethods.wait(1);


    }


}
