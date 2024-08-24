package stepDefinitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features = "src/test/resources/Features/Login.feature",
                    glue = {"stepDefinitions"},
        plugin= {
                "pretty",
                "html:target/HTML_Reports/CucumberReports",
                "json:target/JSON_Reports/Report.json",
                "junit:target/JUNIT_rReports/Report.xml"
                },
        publish = true,
        monochrome = true,
        dryRun = false,
        tags = "@Regression")

public class TestNgRunner extends AbstractTestNGCucumberTests{
}