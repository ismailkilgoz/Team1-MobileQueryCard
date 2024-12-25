package stepdefinitions;

import Page.WomenCategoryPage;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import utilities.ReusableMethods;

import static utilities.Driver.getAppiumDriver;

public class WomenCategoryStepdefinitions {

    WomenCategoryPage womenCategoryPage = new WomenCategoryPage();
    public static AndroidDriver driver= (AndroidDriver) getAppiumDriver();

    @Given("User clicks arrow on Women Page")
    public void user_clicks_arrow_on_women_page() {
        Assert.assertTrue(womenCategoryPage.womenArrow.isEnabled());
        womenCategoryPage.womenArrow.click();
        ReusableMethods.wait(1);
    }

    @Given("User verifies Women Clothing, Women Shoes, Women Accessories are enable")
    public void user_verifies_women_clothing_women_shoes_women_accessories_are_enable() {
        Assert.assertTrue(womenCategoryPage.womenClothing.isDisplayed());
        Assert.assertTrue(womenCategoryPage.womenClothing.isEnabled());
        Assert.assertTrue(womenCategoryPage.womenShoes.isDisplayed());
        Assert.assertTrue(womenCategoryPage.womenShoes.isEnabled());
        Assert.assertTrue(womenCategoryPage.womenAccessories.isDisplayed());
        Assert.assertTrue(womenCategoryPage.womenAccessories.isEnabled());
    }

    @Given("User clicks Women Page")
    public void user_clicks_women_page() {
        Assert.assertTrue(womenCategoryPage.womenPageButton.isEnabled());
        womenCategoryPage.womenPageButton.click();
        ReusableMethods.wait(1);
    }

    @Given("User click the pink shoes")
    public void user_click_the_pink_shoes() {
        Assert.assertTrue(womenCategoryPage.pinkShoes.isEnabled());
        womenCategoryPage.pinkShoes.click();
        ReusableMethods.wait(1);
    }

    @Given("User click the Favorite button")
    public void user_click_the_favorite_button() {
        Assert.assertTrue(womenCategoryPage.favoriteButton.isEnabled());
        womenCategoryPage.favoriteButton.click();
    }

    @Given("User select white color")
    public void user_select_white_color() {
        Assert.assertTrue(womenCategoryPage.whiteColorButton.isEnabled());
        womenCategoryPage.whiteColorButton.click();
    }

    @Given("User clicks Add To Cart button")
    public void user_clicks_add_to_cart_button() {
        Assert.assertTrue(womenCategoryPage.addToCartButton.isEnabled());
        womenCategoryPage.addToCartButton.click();
        ReusableMethods.wait(1);
    }

    @Given("User confirms that the selected product has been added to the shopping cart")
    public void user_confirms_that_the_selected_product_has_been_added_to_the_shopping_cart() {
        Assert.assertTrue(womenCategoryPage.sepetButton.isEnabled());
        womenCategoryPage.sepetButton.click();
        ReusableMethods.wait(1);
        String casualWomenShoes = womenCategoryPage.casualWomenShoesinCart.getAttribute("content-desc");
        String expectedCasualWomenShoesText = "Casual Women Shoes\nWhite\n$250.00\n1";
        Assert.assertEquals(expectedCasualWomenShoesText,casualWomenShoes);
    }

    @Given("User clicks wishlist button")
    public void user_clicks_wishlist_button() {
        Assert.assertTrue(womenCategoryPage.wishlistButton.isEnabled());
        womenCategoryPage.wishlistButton.click();
        ReusableMethods.wait(3);
    }

    @Given("User confirms that the selected product has been added to the Wishlist")
    public void user_confirms_that_the_selected_product_has_been_added_to_the_wishlist() {
        String casualWomenShoes = womenCategoryPage.casualWomenShoesinWishlist.getAttribute("content-desc");
        String expectedCasualWomenShoesText = "Casual Women Shoes\n" + "0 (0  Reviews)\n" + "$250.00";
        Assert.assertEquals(expectedCasualWomenShoesText,casualWomenShoes);
    }

    @Given("User clicks the Filter Button.")
    public void user_clicks_the_filter_button() {
        Assert.assertTrue(womenCategoryPage.filterButton.isEnabled());
        womenCategoryPage.filterButton.click();
        ReusableMethods.wait(1);
    }

    @Given("User clicks Short By and Newest products")
    public void user_clicks_short_by_and_newest_products() {
        Assert.assertTrue(womenCategoryPage.shortBy.isEnabled());
        womenCategoryPage.shortBy.click();
        Assert.assertTrue(womenCategoryPage.newest.isEnabled());
        womenCategoryPage.newest.click();
    }

    @Given("User confirms product availability")
    public void user_confirms_product_availability() {

        String foundProducts = womenCategoryPage.foundProducts.getAttribute("content-desc");

        StringBuilder numberBuilder = new StringBuilder();
        for (char c : foundProducts.toCharArray()) {
            if (Character.isDigit(c)) {
                numberBuilder.append(c);
            }
        }

        System.out.println(foundProducts);

        int productCount = numberBuilder.length() > 0 ? Integer.parseInt(numberBuilder.toString()) : 0;

        if (productCount == 0) {
            System.out.println("No product found");
        } else {
            System.out.println(productCount + " products found");
        }
    }


}
