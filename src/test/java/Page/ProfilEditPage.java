package Page;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import static utilities.Driver.getAppiumDriver;

public class ProfilEditPage extends BasePage{

    public ProfilEditPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()) ,this);}
    public static AndroidDriver driver= (AndroidDriver) getAppiumDriver();

    @AndroidFindBy (xpath = "//android.widget.ImageView[@content-desc=\"Profile\"]")
    public WebElement homeProfilIcon;

    @AndroidFindBy (xpath = "//android.widget.ImageView[@content-desc=\"Edit Profile\"]")
    public WebElement editProfileButton;

    @AndroidFindBy (xpath = "(//*[contains(@class, 'android.widget.EditText')])[1]")
    public WebElement fullNameBox;

    @AndroidFindBy (xpath = "(//*[contains(@class, 'android.widget.EditText')])[2]")
    public WebElement eMailBox;

    @AndroidFindBy (xpath = "(//*[contains(@class, 'android.widget.EditText')])[3]")
    public WebElement phoneBox;

    @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"Save Changes\"]")
    public WebElement saveChangesButton;

    @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"PROFILE_UPDATE\n" +
            "Profile Updated Successfully\"]")
    public WebElement profilUpdateTitle;


}
