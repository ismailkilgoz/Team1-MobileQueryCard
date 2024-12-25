package stepdefinitions;

import Page.QueryCardPage;
import Page.WishListPage;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import utilities.OptionsMet;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;
import static utilities.Driver.getAppiumDriver;


public class WishListIconStepdefinitions extends OptionsMet {
    public static AndroidDriver driver= (AndroidDriver) getAppiumDriver();
    QueryCardPage card = new QueryCardPage();
    WishListPage wishListPage= new WishListPage();
    Actions actions = new Actions(getAppiumDriver());


    @Given("The user sees the favorite icon on a product")
    public void the_user_sees_the_favorite_icon_on_a_product() {
        assert(WishListPage.favouriteButton.isDisplayed());

    }


    @Then("The product should be added to the favorite list")
    public void the_product_should_be_added_to_the_favorite_list() {
        ReusableMethods.wait(2);
        touchDown(758,2058);
        ReusableMethods.wait(5);
        Assert.assertTrue(WishListPage.wishListText.isDisplayed());
        assert(WishListPage.wishListText.isDisplayed());
        Assert.assertTrue(WishListPage.productFoundText.isDisplayed());
        WishListPage.flowerTshirt.isDisplayed();

    }

    @Then("The favorite icon should be active")
    public void the_favorite_icon_should_be_active() {
        assertTrue(WishListPage.favouriteButton.isDisplayed());
    }
    @Given("The user navigates to the Wishlist page")
    public void the_user_navigates_to_the_wishlist_page() {
        WishListPage.goToWishlist();
    }

    @Then("The products added to the Wishlist should be displayed")
    public void the_products_added_to_the_wishlist_should_be_displayed() {
        WishListPage.wishListButton.click();
        assertTrue(WishListPage.productFoundText.isDisplayed());
    }
    @When("The user clicks the remove icon on a product")
    public void the_user_clicks_the_remove_icon_on_a_product() {
        WishListPage.removeIcon.click();

    }

    @Then("The product should be removed from the Wishlist")
    public void the_product_should_be_removed_from_the_wishlist() {
        Assert.assertTrue(WishListPage.removedFromWishlistText.isDisplayed());
    }

    @Then("The product should no longer be displayed on the Wishlist page")
    public void the_product_should_no_longer_be_displayed_on_the_wishlist_page() {

        Assert.assertTrue(WishListPage.wishListEmptyIconu.isDisplayed());
    }@Then("User clicks the button with itemName {string} and {string} and {string} added WishList.")
    public void user_clicks_the_button_with_item_name_and_and_added_wish_list(String itemName, String reviews, String price) {
        ReusableMethods.wait(3);
        WishListPage.xPathElementClicknormalizeSpace(itemName, reviews, price);
    }

    @Then("Verifies that the products added to the Wishlist page are displayed correctly.")
    public void verifies_that_the_products_added_to_the_wishlist_page_are_displayed_correctly() {
        WishListPage.verifyWishlistProducts("wishlist");
    }
    @Then("User clicks the button with itemName {string} and {string} and {string} removed WishList")
    public void userClicksTheButtonWithItemNameAndAndRemovedWishList(String itemName, String reviews, String price) {
        ReusableMethods.wait(6);
        // card.xPathElementClicknormalizeSpace(itemName,reviews,price);
        xPathElementClick(itemName, reviews, price);
    }

    @Then("Remove toaster is displayed")
    public void removeToasterIsDisplayed() {
        WishListPage.getRemovedToaster().isDisplayed();
    }
}


