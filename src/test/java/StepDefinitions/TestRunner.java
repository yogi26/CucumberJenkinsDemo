package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "F:/CucumberBasics/Features", glue = {"StepDefinitions"},
        monochrome = true,
        plugin={"html:CucumberBasics/HtmlReports/repo.html"}
)
public class TestRunner
{

}
