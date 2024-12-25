package Runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import utilities.Driver;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber.json",},
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@" ,
        dryRun = false


)
public class Runner {
    @AfterClass
    public static void tearDown() {
        Driver.quitAppiumDriver();
        System.out.println("Driver quit after all tests.");
    }
}
