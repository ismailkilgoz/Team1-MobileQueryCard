package Page;

import io.appium.java_client.MobileBy;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import lombok.Getter;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;
import utilities.ReusableMethods;
import java.util.Random;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import static utilities.Driver.getAppiumDriver;

@Getter
public class SignUpPage extends BasePage{
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

    @AndroidFindBy (uiAutomator = "new UiSelector().descriptionContains(\"Error\")")
    private WebElement errorMessage;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"This field is required\")")
    private WebElement fieldReuiredMessageForNameAndPhone;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Email is required\")")
    private WebElement emailRequiredMessage;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Passord is required\")")
    private WebElement passwordRequiredMessage;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Already have an account?\")")
    private WebElement alreadyHaveAnAccountText;













    public WebElement ClickButtonByClassNameIndex(int index){

        WebElement button= driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().className(\"android.widget.EditText\").instance(" + index + ")"));
        // new UiSelector().className("android.widget.EditText").instance(0)
     return button;
    }


    public void SelectSingUpWithEmail(String inputType){

            if (inputType.equals("Email")) {
                if (driver.findElement(MobileBy.AccessibilityId("*Use Email Instead")).isDisplayed()) {
                    driver.findElement(MobileBy.AccessibilityId("*Use Email Instead")).click();
                }
            } /*else if (inputType.equals("Phone")) {

                if (driver.findElement(MobileBy.AccessibilityId("*Use Phone Instead")).isDisplayed()) {
                    driver.findElement(MobileBy.AccessibilityId("*Use Phone Instead")).click();
                }else {
                    
                }

            }
            */

    }

    public WebElement getButtonWebelementByDesc(String description){

            WebElement button = driver.findElement(MobileBy.AndroidUIAutomator(
                    "new UiSelector().description(\"" + description + "\")"));

            //  new UiSelector().description("Error The email has already been taken.")

     return button;
    }


    public void verifyGetErrorMessage(String input_type, String expected_message) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        try {
            if (input_type.equalsIgnoreCase("Email")) {
                // Dinamik olarak "Error" içeren hata mesajını bul
                WebElement errorMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//android.view.View[@content-desc='Error The email has already been taken.' or " +
                                "@content-desc='Error The phone has already been taken.']")));


                // Hata mesajını al
                String actualMessage = errorMessageElement.getAttribute("content-desc");
                System.out.println("Actual Error Message: " + actualMessage);

                // Doğrulama
                Assert.assertTrue("Error message does not match! Expected: " + expected_message
                        + ", but Found: " + actualMessage, actualMessage.contains(expected_message));
            } else if (input_type.equalsIgnoreCase("Phone")) {
                WebElement errorPhoneMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
                        MobileBy.AndroidUIAutomator("new UiSelector().description(\"Error The phone has already been taken.\")")
                ));
                String actualMessage = errorPhoneMessageElement.getAttribute("content-desc");
                System.out.println("Actual Error Message: " + actualMessage);

                // Doğrulama
                Assert.assertTrue("Error message does not match!", actualMessage.contains(expected_message));

            }
        } catch (Exception e) {
            System.out.println("Error message could not be found.");
            throw e; // Testi fail et
        }

    }

    // Boş alan bırakma metodu


    // Diğer alanları doldurma metodu


    // Sign Up butonuna tıklama ve doğrulama metodu
    public void verifyRequiredFieldIsNotEmpty(String input_type, String field, String message){

        switch (field) {
            case "Name":
                if (input_type.equalsIgnoreCase("Email")) {

                    driver.findElement(MobileBy.AccessibilityId("*Use Email Instead")).click();
                    //actions.click(phoneOrEmailBox).perform();
                    String email=faker.internet().emailAddress();
                    phoneOrEmailBox.click();
                    phoneOrEmailBox.sendKeys(email);
                    ReusableMethods.wait(1);
                    System.out.println("email = "+email);
                } else if (input_type.equalsIgnoreCase("Phone")) {
                    String phone =faker.phoneNumber().phoneNumber();
                    phoneOrEmailBox.click();
                    phoneOrEmailBox.sendKeys(phone);
                    System.out.println("phone = " + phone);
                }
                String password= generateComplexPassword(8);
                passwordBox.click();
                passwordBox.sendKeys(password);
                System.out.println("password = " + password);
                signUpButtonforUnsuccesMessage.click();
                ReusableMethods.waitForElement(driver,fieldReuiredMessageForNameAndPhone,5);
                Assert.assertEquals(message,fieldReuiredMessageForNameAndPhone.getAttribute("content-desc"));
                break;

            case "Email":

                String name = faker.name().username();
                nameBox.click();
                nameBox.sendKeys(name);
                System.out.println("name = " + name);
                WebElement changeEmail= driver.findElement(MobileBy.AccessibilityId("*Use Email Instead"));
                ReusableMethods.waitForElement(driver,changeEmail,5);
                changeEmail.click();
                String password1= generateComplexPassword(8);
                passwordBox.click();
                passwordBox.sendKeys(password1);
                System.out.println("password1 = " + password1);
                signUpButtonforUnsuccesMessage.click();
                ReusableMethods.waitForElement(driver,emailRequiredMessage,5);
                Assert.assertEquals(message,emailRequiredMessage.getAttribute("content-desc"));
                break;

            case "Phone":
                String name1 = faker.name().username();
                nameBox.click();
                nameBox.sendKeys(name1);
                System.out.println("name1 = " + name1);
                String password2= generateComplexPassword(8);
                passwordBox.click();
                passwordBox.sendKeys(password2);
                System.out.println("password2 = " + password2);
                signUpButtonforUnsuccesMessage.click();
                ReusableMethods.waitForElement(driver,fieldReuiredMessageForNameAndPhone,5);
                Assert.assertEquals(message,fieldReuiredMessageForNameAndPhone.getAttribute("content-desc"));
                break;

            case "Password":

                if (input_type.equalsIgnoreCase("Email")) {
                    String name2 = faker.name().username();
                    nameBox.click();
                    nameBox.sendKeys(name2);
                    System.out.println("name2 = " + name2);
                    WebElement changeEmail2= driver.findElement(MobileBy.AccessibilityId("*Use Email Instead"));
                    ReusableMethods.waitForElement(driver,changeEmail2,5);
                    changeEmail2.click();
                    String email1=faker.internet().emailAddress();
                   phoneOrEmailBox.click();
                   phoneOrEmailBox.sendKeys(email1);
                    System.out.println("email1 = "+email1);
                } else if (input_type.equalsIgnoreCase("Phone")) {
                    String name2 = faker.name().username();
                    nameBox.click();
                    nameBox.sendKeys(name2);
                    System.out.println("name2 = " + name2);
                    String phone1 =faker.phoneNumber().phoneNumber();
                    phoneOrEmailBox.click();
                    phoneOrEmailBox.sendKeys(phone1);
                    System.out.println("phone1 = " + phone1);
                }


                signUpButtonforUnsuccesMessage.click();
                ReusableMethods.waitForElement(driver,passwordRequiredMessage,5);
                Assert.assertEquals(message,passwordRequiredMessage.getAttribute("content-desc"));
                break;

            default:
                throw new IllegalArgumentException("Invalid field: " + field);
        }





    }


    public String generateComplexPassword(int length) {
        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String allCharacters = upperCaseLetters + lowerCaseLetters + numbers;

        Random random = new Random();
        StringBuilder password = new StringBuilder();

        // En az bir büyük harf ekle
        password.append(upperCaseLetters.charAt(random.nextInt(upperCaseLetters.length())));

        // En az bir küçük harf ekle
        password.append(lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length())));

        // En az bir sayı ekle
        password.append(numbers.charAt(random.nextInt(numbers.length())));

        // Kalan karakterleri rastgele doldur
        for (int i = 3; i < length; i++) {
            password.append(allCharacters.charAt(random.nextInt(allCharacters.length())));
        }

        // Şifreyi karıştır
        return shuffleString(password.toString());
    }

    // Şifreyi karıştırmak için yardımcı metod
    private String shuffleString(String input) {
        List<Character> characters = new ArrayList<>();
        for (char c : input.toCharArray()) {
            characters.add(c);
        }
        Collections.shuffle(characters);

        StringBuilder shuffled = new StringBuilder();
        for (char c : characters) {
            shuffled.append(c);
        }
        return shuffled.toString();
    }


}



