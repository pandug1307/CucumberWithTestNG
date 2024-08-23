package stepDefinitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features = "src/test/resources/Features/Login.feature",
                    glue = {"stepDefinitions"},
        plugin= {
                "pretty",
                "html:target/CucumberReports",
                "json:target/Report.json",
                "junit:target/Report.xml"
                },
        tags = "@Regression")

public class TestNgRunner extends AbstractTestNGCucumberTests{
}