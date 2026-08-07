package TestRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "src/test/resources/features/LoginWithMultiData.feature",
        glue = {"steps", "base"},
        tags = "@SmokeTest",
        plugin = {"pretty", "html:target/cucumber-reports.html"},
        monochrome = true
)
public class SmokeRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
