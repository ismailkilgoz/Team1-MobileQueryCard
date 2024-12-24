package stepdefinitions;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.OutputType;
import utilities.Driver;

public class Hooks {
/*
    @Before
    public void setUp(Scenario scenario) {
        System.out.println("Scenario setup: " + scenario.getName());

        if (scenario.getSourceTagNames().contains("@Outline")) {
            System.out.println("Starting driver for Scenario Outline: " + scenario.getName());
            if (Driver.getDriverInstance() == null) {
                Driver.getAppiumDriver();
            }
        }
    }


    @After
    public void tearDown(Scenario scenario) {
        System.out.println("Scenario teardown: " + scenario.getName());

        if (scenario.isFailed()) {
            System.out.println("Scenario failed: " + scenario.getName());
            try {
                final byte[] screenshot = ((Driver.getAppiumDriver())
                        .getScreenshotAs(OutputType.BYTES));
                scenario.attach(screenshot, "image/png", "Failure Screenshot");
            } catch (Exception e) {
                System.out.println("Failed to capture screenshot: " + e.getMessage());
            }
        }

        // Eğer sadece @Outline senaryoları için driver kapatmak istiyorsanız:
        if (scenario.getSourceTagNames().contains("@Outline")) {
            Driver.quitAppiumDriver();
            System.out.println("Driver quit after Scenario Outline: " + scenario.getName());
        }
    }

 */


}



