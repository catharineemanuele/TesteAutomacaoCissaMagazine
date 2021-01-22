package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/features",
		glue = "",
		tags = "@TesteMagazine",
		plugin = { "pretty" },
		monochrome = true)

public class Runner {
}
