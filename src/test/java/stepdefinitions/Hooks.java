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
        Driver.getAppiumDriver(); // Her senaryo/örnek için driver başlatılır
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            System.out.println("Test failed: " + scenario.getName());
            try {
                final byte[] screenshot = ((AppiumDriver) Driver.getAppiumDriver())
                        .getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", "Failure Screenshot");
            } catch (Exception e) {
                System.out.println("Failed to capture screenshot: " + e.getMessage());
            }
        }
        Driver.quitAppiumDriver(); // Her senaryo/örnek için driver kapatılır
        System.out.println("Driver quit after scenario: " + scenario.getName());
    }

     */

}



