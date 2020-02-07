package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(

        plugin={
                "html:target/cucumber-report",
                "json:target/cucumber.json"
        },
        tags="@SmokeTest",
        features = {"src/test/java/Resources"},

        glue = {"stepDefinition"},

        dryRun = false
)
public class regressionTest  extends AbstractTestNGCucumberTests {

}
