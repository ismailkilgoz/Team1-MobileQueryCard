package stepdefinitions;

import Page.MostPopularPage;
import Page.QueryCardPage;
import Page.SelectedProductPage;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.interactions.Actions;
import utilities.OptionsMet;

import static utilities.Driver.getAppiumDriver;

public class SelectedProductStepdefinition extends OptionsMet {

    SelectedProductPage selectedProductPage=new SelectedProductPage();
    public static AndroidDriver driver= (AndroidDriver) getAppiumDriver();
    Actions actions = new Actions(getAppiumDriver());
    QueryCardPage card = new QueryCardPage();





}
