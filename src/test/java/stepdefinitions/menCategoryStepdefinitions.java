package stepdefinitions;
import Page.CategoryMenPage;
import io.cucumber.java.en.Given;

import org.junit.Assert;
import utilities.OptionsMet;
public class menCategoryStepdefinitions extends OptionsMet {
    CategoryMenPage categoryMenPage=new CategoryMenPage();
    @Given("User clicks arrow on Men Page")
    public void user_clicks_arrow_on_men_page() {
        categoryMenPage.menArrow.click();
    }
    @Given("User verifies Men Clothing, Men Shoes, Men Accessories are enable")
    public void user_verifies_men_clothing_men_shoes_men_accessories_are_enable() {
        String menClothingExpected="Men Clothing";
        VerifyElementText(menClothingExpected);
        String menShoesExpected="Men Shoes";
        VerifyElementText(menShoesExpected);
        String menAccessoriesExpected="Men Accessories";
        VerifyElementText(menAccessoriesExpected);
    }
    @Given("User clicks first product")
    public void user_clicks_first_product() {
        categoryMenPage.firstProduct.click();
    }
    @Given("User clicks on Men")
    public void user_clicks_on_men() {
        categoryMenPage.menButton.click();
    }
    @Given("User selects color")
    public void user_selects_color() {
        categoryMenPage.blackSocks.click();
    }
    @Given("User clicks favorite button")
    public void user_clicks_favorite_button() {
        categoryMenPage.favoriteButton.click();
    }
    @Given("User clicks filter button")
    public void user_clicks_filter_button() {
        categoryMenPage.filterButton.click();
    }
    @Given("User verifies {string} category is enable")
    public void user_verifies_category_is_enable(String string) {
        String sortByExpected="Sort By";
        VerifyElementText(sortByExpected);
        String brandsExpected="Brands";
        VerifyElementText(brandsExpected);
        String sizeExpected="size";
        VerifyElementText(sizeExpected);
        String colorExpected="color";
        VerifyElementText(colorExpected);
    }
    @Given("User selects Harrods brand from the brand category")
    public void user_selects_harrods_brand_from_the_brand_category() {
        categoryMenPage.brandsButton.click();
        categoryMenPage.harrodsButton.click();
        categoryMenPage.brandsButton.click();
    }
    @Given("User clicks {string} icon")
    public void user_clicks_icon(String string) {
        categoryMenPage.xButtonundertheFilterandSorting.click();
    }
    @Given("User confirms that results have {string} as a text in Men")
    public void  user_confirms_that_results_have_as_a_text_in_men(String expectedText) {
        //String expectedHarrodsBrand="Quilted Puffer Jacket";
        String actualHarrodsBrand=categoryMenPage.quiltedPufferJacket.getAttribute("content-desc");
        Assert.assertTrue(actualHarrodsBrand.contains(expectedText));
    }
    @Given("User verifies profile button is enable on the homepage")
    public void user_verifies_profile_button_is_enable_on_the_homepage() {
        String profileButtonexp="Profile";
        String profileButtonActual=categoryMenPage.profileButton.getAttribute("content-desc");
        Assert.assertTrue(profileButtonActual.contains(profileButtonexp));
    }
    @Given("User clicks profile button on the home page")
    public void user_clicks_proffile_button_on_the_home_page() {
        categoryMenPage.profileButton.click();
    }
    @Given("User verifies My Account page is opened")
    public void user_verifies_my_account_page_is_opened() {
        String myAccountExpected="My Account";
        VerifyElementText(myAccountExpected);
    }
    @Given("User verifies logout button is enable")
    public void user_verifies_logout_button_is_enable() {
        String logOutButton="Logout";
        VerifyElementText(logOutButton);
    }
    @Given("User verifies logout button clickable")
    public void user_verifies_logout_button_clickable() {
        categoryMenPage.logoutButton.click();
    }
}