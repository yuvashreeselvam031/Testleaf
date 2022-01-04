package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/main/java/feature/loginSalesforce.feature", glue = "steps")
public class Runner extends AbstractTestNGCucumberTests {

}
