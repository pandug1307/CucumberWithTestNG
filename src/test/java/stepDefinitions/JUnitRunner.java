package stepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/Login.feature",
        glue={"stepDefinitions"},
        plugin= {
                "pretty",
                "html:target/CucumberReports",
                "json:target/Report.json",
                "junit:target/Report.xml"
                },
                tags = "@Regression")

public class JUnitRunner {
}