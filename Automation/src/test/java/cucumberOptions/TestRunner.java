package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features",
		glue="stepdefinations",
		tags="@WebTest, @MobileTest",
		monochrome=true,
		strict=true,
		plugin={"pretty","html:target/Results","json:target/Results.json","junit:target/Resutls.xml"})

public class TestRunner {

}
