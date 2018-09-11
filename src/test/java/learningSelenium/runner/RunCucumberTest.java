package learningSelenium.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/java/learningSelenium/features",
        glue = "learningSelenium.stepdefs",
        monochrome = true,
        plugin = {
                "pretty",
                "json:target/reports/jsonreport/index.json",
                "html:target/reports/htmlreport",
                "junit:target/reports/xmlreport.xml"
        }
)

public class RunCucumberTest {
}
