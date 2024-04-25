package Runner;

import org.junit.runner.RunWith;

import com.stepdefinition.Exe;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "C:\\Users\\chinnadu\\eclipse-workspace\\test\\"
		+ "CucumberDay1\\src\\test\\java\\com\\feature",
		glue="com.stepdefinition",
		tags="@tag1",
		dryRun = true,
		publish = true)

public class RunnerClass extends Exe {

	
}
