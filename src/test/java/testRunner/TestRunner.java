package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "C://Users//Kazakimaru//IdeaProjects//SeleniumCucumber-kasirAja-Testing//features//kasirAja.feature",
        glue = "stepDefinitions"
)


public class TestRunner {}
