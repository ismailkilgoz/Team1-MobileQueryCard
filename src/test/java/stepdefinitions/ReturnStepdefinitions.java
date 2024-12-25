package stepdefinitions;

import Page.ReturnPage;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import utilities.Driver;
import utilities.OptionsMet;
import utilities.ReusableMethods;

import javax.sound.midi.InvalidMidiDataException;

import static utilities.Driver.getAppiumDriver;

public class ReturnStepdefinitions {
    ReturnPage returnPage = new ReturnPage();
    Actions actions = new Actions(getAppiumDriver());

    @Given("User click the button Use Email Instead and sendKeys {string}")
    public void user_click_the_button_use_email_instead_and_send_keys(String email) {
        returnPage.emailTextBoxClickAndSendKeys(email);
        // Email alanından sonra Tab ile şifre alanına geç
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys("Query.151224").perform();
        ReusableMethods.wait(1);
    }

    @Given("User clicks on the home, selects a product and completes the purchase")
    public void user_clicks_on_the_home_selects_a_product_and_completes_the_purchase() throws InvalidMidiDataException {
        returnPage.pufferJacketProductFromHomePage();
        /*
        Kullanici giris yaptiktan sonra ana sayfaya doner ve
        Quilted Puffer Jacket satin alma islemlerini gerceklestirir.
        */
    }

    @Given("After the payment section is complated, the user clicks on the Go To Order Page button and verifies that is on the Order History page")
    public void after_the_payment_section_is_complated_the_user_clicks_on_the_go_to_order_page_button_and_verifies_that_is_on_the_order_history_page() {
        returnPage.goToOrderPageFromAfterPayment();
        /*
        Odeme islemi tamamlandiktan sonra Go To Order Page butonu tiklanir ve
        dogru sayfaya yonlendirdigi Title uzerinden dogrulanir.
         */
    }

    @Given("User clicks on his last order and examines the details")
    public void user_clicks_on_his_last_order_and_examines_the_details() throws InvalidMidiDataException {
        OptionsMet.touchDown(700,800);
        ReusableMethods.wait(1);
        OptionsMet.swipe(700,2240,700,600);
        OptionsMet.swipe(700,2240,700,600);
        ReusableMethods.wait(1);
        returnPage.cancelOrderIsEnabled();
        /*
        Alisverisin, urun sahibi veya site tarafindan henuz onaylanmadigini, Cancel Order butonunun
        aktif olmasi ile goruntuleyebiliyoruz
         */
    }

    @Given("Switching from Query Cart application to Google Chrome")
    public void switching_from_query_cart_application_to_google_chrome() {
        ReusableMethods.wait(3);
        Driver.startActivity("com.android.chrome","com.google.android.apps.chrome.Main",false);

    }
    @Given("Go to the Query Cart url and log in with admin information")
    public void go_to_the_query_cart_url_and_log_in_with_admin_information() {
        returnPage.googleSearchToQueryCart();
        ReusableMethods.wait(3);
        //returnPage.signInFromUrl();
    }
    @Given("Go to dashboard from profile icon")
    public void go_to_dashboard_from_profile_icon() {
        returnPage.goToDashboard();

    }
    @Given("Go to the Online Orders page and after the user's order is verified, it is confirmed and delivered.")
    public void go_to_the_online_orders_page_and_after_the_user_s_order_is_verified_it_is_confirmed_and_delivered() throws InvalidMidiDataException {
        returnPage.confirmOrder();

    }
    @Given("Returns to the Query Cart app as the user")
    public void returns_to_the_query_cart_app_as_the_user() {
        Driver.startActivity("com.wise.querycart", "com.wise.querycart.MainActivity",false);
        System.out.println("Uygulamaya geri dönüldü.");
        ReusableMethods.wait(5);
    }

    @Given("User goes to the order history page via the profile")
    public void user_goes_to_the_order_history_page_via_the_profile() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Clicks on the product details and finds the product purchased")
    public void clicks_on_the_product_details_and_finds_the_product_purchased() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("The return button should be displayed")
    public void the_return_button_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Perform return transactions")
    public void perform_return_transactions() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("The return process has been initiated on the Return Orders page")
    public void the_return_process_has_been_initiated_on_the_return_orders_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
