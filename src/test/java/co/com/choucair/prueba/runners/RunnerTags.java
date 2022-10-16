package co.com.choucair.prueba.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/prueba.feature",
                  tags = "@stories",
                  glue = "co.com.choucair.prueba.stepdefinations",
                  snippets = SnippetType.CAMELCASE)


public class RunnerTags {
}
