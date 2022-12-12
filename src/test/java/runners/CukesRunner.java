package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports",
                "json:target/parallel-cucumber.json",
        },
        features = "src/test/resources/features/",
        glue = "step_definitions",
        tags = "@google",
        dryRun = false
        //dryRun, plugin, tags...
)
public class CukesRunner {
    
}
