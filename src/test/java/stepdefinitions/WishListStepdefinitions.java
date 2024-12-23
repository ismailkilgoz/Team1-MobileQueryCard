package stepdefinitions;

import Page.QueryCardPage;
import Page.WishListPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;
import static utilities.Driver.getAppiumDriver;
import static utilities.OptionsMet.hideKeyboard;
import static utilities.OptionsMet.touchDown;

public class WishListStepdefinitions {
    QueryCardPage card = new QueryCardPage();
    Actions actions = new Actions(getAppiumDriver());

    @Given("The Wishlist icon should be visible and active")
    public void the_wishlist_icon_should_be_visible_and_active() {
        ReusableMethods.wait(3);
        assertTrue(WishListPage.wishlistIcon.isDisplayed());

    }
    @Given("The user sees the favorite icon on a product")
    public void the_user_sees_the_favorite_icon_on_a_product() {
        assert(WishListPage.favoriteIcon.isDisplayed());

    }

    @When("The user clicks the favorite icon")
    public void the_user_clicks_the_favorite_icon() {
        hideKeyboard();
        touchDown(452,1356);
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
        assertTrue(WishListPage.favoriteIcon.isDisplayed());
    }
    @Given("The user navigates to the Wishlist page")
    public void the_user_navigates_to_the_wishlist_page() {
      WishListPage.goToWishlist();
    }

    @Then("The products added to the Wishlist should be displayed")
    public void the_products_added_to_the_wishlist_should_be_displayed() {
        WishListPage.wishlistIcon.click();
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
    }
}
