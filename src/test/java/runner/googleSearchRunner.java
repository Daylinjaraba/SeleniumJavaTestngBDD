package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/features",
				glue="/steps",
				plugin= {
						"pretty",
						"html:target/cucumber-report.html","json:target/report.json"
				})

public class googleSearchRunner extends AbstractTestNGCucumberTests {

}
