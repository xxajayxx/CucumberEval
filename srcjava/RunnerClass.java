import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
	@RunWith(Cucumber.class)
	@CucumberOptions(features="C:\\test\\Evaluation\\Features\\Features.feature",plugin="pretty", glue="(default package)",plugin="json:target/cucumber.json")
	public class RunnerClass{
		
		
		
	}


