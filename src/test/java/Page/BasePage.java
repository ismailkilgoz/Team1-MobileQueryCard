package Page;


import com.github.javafaker.Faker;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import static utilities.Driver.getAppiumDriver;

public abstract class BasePage {

    public Actions actions;
    public Faker faker;
   public TouchAction touchaAction;

    public BasePage() {

        PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()),this);
        actions = new Actions(getAppiumDriver());
        faker = new Faker();
        touchaAction= new TouchAction((PerformsTouchActions) getAppiumDriver());

    }

}
