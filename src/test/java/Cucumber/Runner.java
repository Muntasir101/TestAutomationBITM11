package Cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(
        features="./src/test/java/Cucumber/Login.feature",
        glue = {"Cucumber"},
        plugin = {
        "pretty","html:CucumberReports/LoginInvalid.html"
        },
        monochrome = true
)

@RunWith(Cucumber.class)
public class Runner {
}
