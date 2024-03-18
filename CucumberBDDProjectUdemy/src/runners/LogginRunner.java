package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

@RunWith(io.cucumber.junit.Cucumber.class)
@CucumberOptions(
		features = "projectfeatures", 
		glue = "stepDefinitions",
        tags = {"endtoend", "@goodlogin", "~@ignore"}

)
public class LogginRunner {

}
