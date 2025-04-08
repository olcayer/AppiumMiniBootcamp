package stage2.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
        "html:target/default-html-reports.html",
         "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features",
        glue = "stage2/stepDefs",
        dryRun = false,
        tags = "@wip"
)
public class CukesRunner {

}
