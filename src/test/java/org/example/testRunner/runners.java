package org.example.testRunner;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
@CucumberOptions(
        features = "src/main/resources/features",
//  the step defns package path
        glue = {"org.example.stepDefns"},
//  Pretty plugin  generates the Cucumber test report in the HTML format, check target folder after execution
        plugin = { "pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json",
                "junit:target/cukes.xml",
                "rerun:target/rerun.txt"},
//  same tags used in feature file
        tags = "@smoke"
)
public class runners extends AbstractTestNGCucumberTests {

}
