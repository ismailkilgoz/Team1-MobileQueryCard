package stepdefinitions;

import Page.QueryCardPage;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.OptionsMet;
import utilities.ReusableMethods;


import javax.sound.midi.InvalidMidiDataException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.Driver.getAppiumDriver;
import static utilities.Driver.quitAppiumDriver;

public class CategoryStepdefinitons extends OptionsMet {

    QueryCardPage card = new QueryCardPage();
    Actions actions = new Actions(getAppiumDriver());

    @When("User confirms to be on the QueryCart Homepage")
    public void user_confirms_to_be_on_the_query_cart_homepage() {
        card.LogoGorunurTest();
    }
    @Then("User confirms to be on the Category Page")
    public void user_confirms_to_be_on_the_category_page() {
        assertTrue(card.getCategoryPageMenButton().isDisplayed());
    }
    @Then("User confirms to be on the Sign In Page")
    public void user_confirms_to_be_on_the_sign_in_page() {
        assertTrue(card.getSignInPageSignInText().isDisplayed());
    }
    @Then("User clicks the backwards button")
    public void user_clicks_the_backwards_button() {
        card.getSignInPageBackButton().click();
    }
    @Then("User confirms to be on the Sign Up - Sign In Page")
    public void user_confirms_to_be_on_the_sign_up_sign_in_page() {
        assertTrue(card.getSignInToSeeYourInfoText().isDisplayed());
    }
    @Then("User clicks the Search Box button")
    public void userClicksTheSearchBoxButton() {
        card.getSearchBoxButton().click();
    }
    @And("User confirms to be on the Search Page")
    public void userConfirmsToBeOnTheSearchPage() {
        assertTrue(card.getSearchPageSearchBoxLink().isDisplayed());
    }
    @Then("User search {string} in the app")
    public void userSearchInTheApp(String searchText) {
        card.getSearchPageSearchBoxLink().sendKeys(searchText);
        ReusableMethods.wait(2);
        touchDown(988,2076);
        ReusableMethods.wait(2);
    }
    @And("User confirms that results have {string} as a text")
    public void userConfirmsThatResultsHaveAsAText(String ExpText) {
        String actText = card.getSearchPageResultFirstElement().getAttribute("content-desc");
        //System.out.println(actText);
        assertTrue(actText.toLowerCase().contains(ExpText.toLowerCase()));
    }
    @Then("Use confirms that Men Category button is visible")
    public void use_confirms_that_men_category_button_is_visible() {
        assertTrue(card.getCategoryPageMenButton().isDisplayed());
    }
    @Then("User confirms to be on the Men Category page")
    public void user_confirms_to_be_on_the_men_category_page() {
        assertTrue(card.getCategoryPageMenButton().isDisplayed());
    }
    @Then("Use confirms that Men Category Filter icon is visible")
    public void use_confirms_that_men_category_filter_icon_is_visible() {
        assertTrue(card.getMenCategoryFilterButton().isDisplayed());
    }
    @Then("User clicks the Filter button")
    public void user_clicks_the_filter_button() {
        card.getMenCategoryFilterButton().click();
    }
    @Then("User confirms to be on the Category Filter page")
    public void user_confirms_to_be_on_the_category_filter_page() {
        assertTrue(card.getFilterPageFilterSortingText().isDisplayed());
    }
    @Then("Use confirms that Women Category button is visible")
    public void useConfirmsThatWomenCategoryButtonIsVisible() {
        assertTrue(card.getCategoryPageWomenButton().isDisplayed());
    }
    @Then("User confirms to be on the Women Category page")
    public void userConfirmsToBeOnTheWomenCategoryPage() {
        assertTrue(card.getCategoryPageWomenButton().isDisplayed());
    }
    @Then("Use confirms that Women Category Filter icon is visible")
    public void useConfirmsThatWomenCategoryFilterIconIsVisible() {
        card.getWomenCategoryFilterButton().click();
    }
    @Then("Use confirms that Juniors Category button is visible")
    public void useConfirmsThatJuniorsCategoryButtonIsVisible() {
        assertTrue(card.getCategoryPageJuniorsButton().isDisplayed());
    }
    @Then("User confirms to be on the Juniors Category page")
    public void userConfirmsToBeOnTheJuniorsCategoryPage() {
        assertTrue(card.getCategoryPageJuniorsButton().isDisplayed());
    }

    @Then("Use confirms that Juniors Category Filter icon is visible")
    public void useConfirmsThatJuniorsCategoryFilterIconIsVisible() {
        assertTrue(card.getJuniorCategoryFilterButton().isDisplayed());
    }

    @And("User confirms that results have {string} as a text or there is no result at all")
    public void userConfirmsThatResultsHaveAsATextOrThereIsNoResultAtAll(String ExpText) {
        if (card.getEmptySearchBoxElement().isDisplayed()){
            System.out.println("NO SEARCH RESULTS FOUND");
        }else { String actText = card.getSearchPageResultFirstElement().getAttribute("content-desc");
            //System.out.println(actText);
            assertTrue(actText.toLowerCase().contains(ExpText.toLowerCase()));}
    }
}