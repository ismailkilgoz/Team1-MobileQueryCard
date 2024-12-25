package Page;


import com.github.javafaker.Faker;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import static utilities.Driver.getAppiumDriver;

public abstract class BasePage {


    public Faker faker;


    public BasePage() {


        faker = new Faker();


    }

}
