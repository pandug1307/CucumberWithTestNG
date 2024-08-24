package stepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/Login.feature",
        glue={"stepDefinitions"},
        plugin= {
                "pretty",
                "html:target/HTML_Reports/CucumberReports",
                "json:target/JSON_Reports/Report.json",
                "junit:target/JUNIT_rReports/Report.xml"
                },
                tags = "@Regression")

public class JUnitRunner {
}