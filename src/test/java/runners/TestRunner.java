package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\features", //the path of the feature files
		glue={"steps"}, //the path of the step definition files
		monochrome=true,
	//	plugin = {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"})
		plugin= {"pretty","html:test-outout.html", "json:target/cucumber.json","junit:junit_xml/cucumber.xml"})
		

public class TestRunner {	
}
