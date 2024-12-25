package stepdefinitions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.OutputType;
import utilities.Driver;

public class Hooks {

    @Before("@Outline")
    public void setUpOutline(Scenario scenario) {
        System.out.println("Starting driver for Scenario Outline: " + scenario.getName());
        if (Driver.getAppiumDriver() == null || Driver.getAppiumDriver().getSessionId() == null) {
            Driver.quitAppiumDriver();
            Driver.getAppiumDriver();
        }
    }

    @After("@Outline")
    public void tearDownOutline(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                byte[] screenshot = ((AppiumDriver) Driver.getAppiumDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", "Failure Screenshot");
            } catch (Exception e) {
                System.out.println("Failed to capture screenshot: " + e.getMessage());
            }
        }
        Driver.quitAppiumDriver();
        System.out.println("Driver closed for Scenario Outline: " + scenario.getName());
    }

}



