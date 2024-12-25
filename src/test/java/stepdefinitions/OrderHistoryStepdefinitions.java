package stepdefinitions;
import Page.OrderHistoryPage;
import Page.ReturnPage;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import utilities.Driver;
import utilities.OptionsMet;
import utilities.ReusableMethods;

import javax.sound.midi.InvalidMidiDataException;
import java.util.Arrays;
import java.util.List;

import static utilities.Driver.getAppiumDriver;




public class OrderHistoryStepdefinitions {
    OrderHistoryPage orderhistorypage= new OrderHistoryPage();
    ReturnPage returnPage = new ReturnPage();
    Actions actions = new Actions(getAppiumDriver());



    @Given("User Navigate to the Dashboard")
    public void user_navigate_to_the_dashboard() {
        OrderHistoryPage orderHistoryPage = new OrderHistoryPage();
        OrderHistoryPage.userProfileIcon.click();
    }

    @Given("User verify that {string} item is visible")
    public void user_verify_that_item_is_visible(String expectedItemText) {
        String actualItemText = OrderHistoryPage.orderHistoryLink.getAttribute("content-desc");

        Assert.assertEquals(expectedItemText, actualItemText);
    }

    @Given("User goes to Order History page")
    public void user_goes_to_order_history_page() {

        OrderHistoryPage.orderHistoryLink.click();
    }

    @Given("User verify view history icon is visible")
    public void user_verify_view_history_icon_is_visible() {

        OrderHistoryPage orderHistoryPage;
        boolean displayed = OrderHistoryPage.orderLinksList.get(1).isDisplayed();

        Assert.assertTrue(displayed);
    }

    @Given("User click on order {int}")
    public void user_click_on_order(int orderIndex) {

        OrderHistoryPage.orderLinksList.get(orderIndex).click();
    }

    @Given("User click on Downland Receipt")
    public void user_click_on_downland_receipt() {
        OrderHistoryPage OrderHistoryPage = new OrderHistoryPage();
        try {
            OptionsMet.swipe(500, 1600, 500, 400);
        } catch (InvalidMidiDataException e) {
            throw new RuntimeException(e);
        }
        ReusableMethods.wait(2);
        OrderHistoryPage.downlandReceiptButton.click();
    }

    @ParameterType("[^\"]*")
    public List<String> order(String s) {
        return (Arrays.asList(s.split(",")));
    }
    @Given("User verify that receipt contains {order}")
    public void user_verify_that_receipt_contains_order(List<String> expectedOrder) {
        OrderHistoryPage OrderHistoryPage = new OrderHistoryPage();

        String tmp = OrderHistoryPage.orderIdText.getAttribute("content-desc");

        String actualOrderId = tmp.substring(tmp.indexOf('#'));
        String actualDateDay = OrderHistoryPage.orderDateDayText.getAttribute("content-desc");
        String actualDateHour = OrderHistoryPage.orderDateHourText.getAttribute("content-desc");
        String actualPaymentType = OrderHistoryPage.paymentTypeText.getAttribute("content-desc");
        String actualTotal =OrderHistoryPage.totalText.getAttribute("content-desc");

        Assert.assertEquals(expectedOrder.get(0).trim(), actualOrderId);
        Assert.assertEquals(expectedOrder.get(1).trim(), actualDateHour);
        Assert.assertEquals(expectedOrder.get(2).trim(), actualDateDay);
        Assert.assertEquals(expectedOrder.get(3).trim(), actualPaymentType);
        Assert.assertEquals(expectedOrder.get(4).trim(), actualTotal);
    }

    @Given("User scroll down into bottom")
    public void user_scroll_down_into_bottom() {
        try {
            OptionsMet.swipe(500, 1600, 500, 400);
        } catch (InvalidMidiDataException e) {
            throw new RuntimeException(e);
        }
    }

    @Given("User verify that cancel button is active.")
    public void user_verify_that_cancel_button_is_active() {
        OrderHistoryPage OrderHistoryPage = new OrderHistoryPage();

        boolean displayed = OrderHistoryPage.cancelOrderButton.isDisplayed();

        Assert.assertTrue(displayed);
    }

    @Given("User close driver")
    public void user_close_driver() {
        Driver.quitAppiumDriver();
    }
}
