package stepdefinitions;

import Page.ProfilEditPage;
import Page.WomenCategoryPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ReusableMethods;

import java.time.Duration;

import static utilities.Driver.getAppiumDriver;

public class ProfilEditStepdefinitions {

    ProfilEditPage profilEditPage = new ProfilEditPage();
    public static AndroidDriver driver= (AndroidDriver) getAppiumDriver();

    @Given("User click the Profile icon")
    public void user_click_the_profile_icon() {
        Assert.assertTrue(profilEditPage.homeProfilIcon.isEnabled());
        profilEditPage.homeProfilIcon.click();
        ReusableMethods.wait(1);
    }

    @Given("User confirms that the Edit Profile link visible and active")
    public void user_confirms_that_the_edit_profile_link_visible_and_active() {
        Assert.assertTrue(profilEditPage.editProfileButton.isDisplayed());
        Assert.assertTrue(profilEditPage.editProfileButton.isEnabled());
    }

    @Given("User click the Edit Profile link")
    public void user_click_the_edit_profile_link() {
        Assert.assertTrue(profilEditPage.editProfileButton.isEnabled());
        profilEditPage.editProfileButton.click();
        ReusableMethods.wait(1);
    }

    @Given("User change name, email and phone")
    public void user_change_name_email_and_phone() {
        Assert.assertTrue(profilEditPage.fullNameBox.isEnabled());
        profilEditPage.fullNameBox.click();
        profilEditPage.fullNameBox.clear();
        profilEditPage.fullNameBox.sendKeys("bunyami");
        ReusableMethods.wait(1);
        Assert.assertTrue(profilEditPage.eMailBox.isEnabled());
        profilEditPage.eMailBox.click();
        profilEditPage.eMailBox.clear();
        profilEditPage.eMailBox.sendKeys("bunyami.user@querycart.com");
        ReusableMethods.wait(1);
        Assert.assertTrue(profilEditPage.phoneBox.isEnabled());
        profilEditPage.phoneBox.click();
        profilEditPage.phoneBox.clear();
        profilEditPage.phoneBox.sendKeys("12312312");
        ReusableMethods.wait(1);
    }

    @Given("User confirms that the Save Changes button visible and active")
    public void user_confirms_that_the_save_changes_button_visible_and_active() {
        Assert.assertTrue(profilEditPage.saveChangesButton.isDisplayed());
        Assert.assertTrue(profilEditPage.saveChangesButton.isEnabled());
    }

    @Given("User click the Save Changes button")
    public void user_click_the_save_changes_button() {
        Assert.assertTrue(profilEditPage.saveChangesButton.isEnabled());
        profilEditPage.saveChangesButton.click();
    }

    @Given("User displays the PROFILE UPDATE")
    public void user_displays_the_profıle_update() {
        WebDriverWait wait = new WebDriverWait(getAppiumDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(profilEditPage.profilUpdateTitle));
        Assert.assertTrue(profilEditPage.profilUpdateTitle.isDisplayed());
        ReusableMethods.wait(1);
    }

    @Given("User change name, email and phone again")
    public void user_change_name_email_and_phone_again() {
        Assert.assertTrue(profilEditPage.fullNameBox.isEnabled());
        profilEditPage.fullNameBox.click();
        profilEditPage.fullNameBox.clear();
        profilEditPage.fullNameBox.sendKeys("bunyamin");
        ReusableMethods.wait(1);
        Assert.assertTrue(profilEditPage.eMailBox.isEnabled());
        profilEditPage.eMailBox.click();
        profilEditPage.eMailBox.clear();
        profilEditPage.eMailBox.sendKeys("bunyamin.user@querycart.com");
        ReusableMethods.wait(1);
        Assert.assertTrue(profilEditPage.phoneBox.isEnabled());
        profilEditPage.phoneBox.click();
        profilEditPage.phoneBox.clear();
        profilEditPage.phoneBox.sendKeys("123123123");
        ReusableMethods.wait(1);
    }




}
