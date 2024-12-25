package stepdefinitions;

import Page.HomePage;
import Page.MostPopularPage;
import Page.QueryCardPage;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.interactions.Actions;
import utilities.OptionsMet;

import static org.junit.Assert.assertTrue;
import static utilities.Driver.getAppiumDriver;

public class MostPopularStepdefinition extends OptionsMet {
    MostPopularPage homePage=new MostPopularPage();
    public static AndroidDriver driver= (AndroidDriver) getAppiumDriver();
    Actions actions = new Actions(getAppiumDriver());
    QueryCardPage card = new QueryCardPage();


    @Given("User confirms to be on the Most Popular Page")
    public void user_confirms_to_be_on_the_most_popular_page() {

        String mostPopular="(8 Products Found)";
        VerifyElementText(mostPopular);
    }


    @Given("User Confirms that there are new products on the Most Popular Page")
    public void user_confirms_that_there_are_new_products_on_the_most_popular_page() {
        String mostPopular="(8 Products Found)";
        String ProductString=mostPopular.replaceAll("[^0-9]", "");
        int products=Integer.parseInt(ProductString);
        assertTrue(products>0);

    }







}
