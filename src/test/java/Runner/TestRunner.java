package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/Feature",
glue = {"MyStepDefination"},
plugin = {"pretty","html:target/cucumber-reports.html", "json:target/cuccumber.jason"})

public class TestRunner extends AbstractTestNGCucumberTests {
}
