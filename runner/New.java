package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/main/java/feature", glue = "steps")
public class New extends AbstractTestNGCucumberTests{

}
