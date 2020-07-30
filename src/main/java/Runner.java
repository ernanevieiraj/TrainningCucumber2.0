import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.SnippetType;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "pretty",
        monochrome = true,
        features = "src/main/java/features/",
        snippets = SnippetType.CAMELCASE,
        tags = {"@SmokeTest"},
        dryRun = true
)
public class Runner {
}
